package com.stripe.android.link.ui.paymentmenthod;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.Logger;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.CompleteLinkFlow;
import com.stripe.android.link.confirmation.DefaultCompleteLinkFlow;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.PrimaryButtonState;
import com.stripe.android.link.ui.paymentmenthod.PaymentMethodViewModel;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.DefaultFormHelper;
import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.addresselement.AddressElementDefaultsKt;
import com.stripe.android.paymentsheet.addresselement.PaymentElementAutocompleteAddressInteractor;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PaymentMethodViewModel.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B]\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0015J*\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'H\u0082@¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel;", "Landroidx/lifecycle/ViewModel;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "completeLinkFlow", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;", "logger", "Lcom/stripe/android/core/Logger;", "formHelper", "Lcom/stripe/android/paymentsheet/FormHelper;", "dismissalCoordinator", "Lcom/stripe/android/link/LinkDismissalCoordinator;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "dismissWithResult", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkActivityResult;", "", "<init>", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/FormHelper;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodState;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "formValuesChanged", "formValues", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "onPayClicked", "attemptCompletion", "paymentDetails", "Lcom/stripe/android/link/LinkPaymentDetails;", "cvc", "", "billingPhone", "(Lcom/stripe/android/link/LinkPaymentDetails;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateButtonState", "Lcom/stripe/android/link/ui/PrimaryButtonState;", "clearErrorMessage", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodViewModel extends ViewModel {
    private final MutableStateFlow<PaymentMethodState> _state;
    private final CompleteLinkFlow completeLinkFlow;
    private final LinkConfiguration configuration;
    private final Function1<LinkActivityResult, Unit> dismissWithResult;
    private final LinkDismissalCoordinator dismissalCoordinator;
    private final FormHelper formHelper;
    private final LinkAccount linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final LinkLaunchMode linkLaunchMode;
    private final Logger logger;
    private final StateFlow<PaymentMethodState> state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PaymentMethodViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.paymentmenthod.PaymentMethodViewModel", f = "PaymentMethodViewModel.kt", i = {0}, l = {138}, m = "attemptCompletion", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.ui.paymentmenthod.PaymentMethodViewModel$attemptCompletion$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentMethodViewModel.this.attemptCompletion(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public PaymentMethodViewModel(LinkConfiguration configuration, LinkAccount linkAccount, LinkAccountManager linkAccountManager, CompleteLinkFlow completeLinkFlow, Logger logger, FormHelper formHelper, LinkDismissalCoordinator dismissalCoordinator, LinkLaunchMode linkLaunchMode, Function1<? super LinkActivityResult, Unit> dismissWithResult) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(completeLinkFlow, "completeLinkFlow");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(formHelper, "formHelper");
        Intrinsics.checkNotNullParameter(dismissalCoordinator, "dismissalCoordinator");
        Intrinsics.checkNotNullParameter(linkLaunchMode, "linkLaunchMode");
        Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
        this.configuration = configuration;
        this.linkAccount = linkAccount;
        this.linkAccountManager = linkAccountManager;
        this.completeLinkFlow = completeLinkFlow;
        this.logger = logger;
        this.formHelper = formHelper;
        this.dismissalCoordinator = dismissalCoordinator;
        this.linkLaunchMode = linkLaunchMode;
        this.dismissWithResult = dismissWithResult;
        MutableStateFlow<PaymentMethodState> MutableStateFlow = StateFlowKt.MutableStateFlow(new PaymentMethodState(formHelper.createFormArguments(PaymentMethod.Type.Card.code), formHelper.formElementsForCode(PaymentMethod.Type.Card.code), PrimaryButtonState.Disabled, PrimaryButtonKt.completePaymentButtonLabel(configuration.getStripeIntent(), linkLaunchMode), null, null, 48, null));
        this._state = MutableStateFlow;
        this.state = MutableStateFlow;
    }

    public final StateFlow<PaymentMethodState> getState() {
        return this.state;
    }

    public final void formValuesChanged(FormFieldValues formValues) {
        PaymentMethodState value;
        PaymentMethodState paymentMethodState;
        PrimaryButtonState primaryButtonState;
        PaymentMethodCreateParams paymentMethodParams = this.formHelper.getPaymentMethodParams(formValues, PaymentMethod.Type.Card.code);
        this.formHelper.onFormFieldValuesChanged(formValues, PaymentMethod.Type.Card.code);
        MutableStateFlow<PaymentMethodState> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
            paymentMethodState = value;
            if (paymentMethodParams != null) {
                primaryButtonState = PrimaryButtonState.Enabled;
            } else {
                primaryButtonState = PrimaryButtonState.Disabled;
            }
        } while (!mutableStateFlow.compareAndSet(value, PaymentMethodState.copy$default(paymentMethodState, null, null, primaryButtonState, null, paymentMethodParams, null, 43, null)));
    }

    public final void onPayClicked() {
        PaymentMethodCreateParams paymentMethodCreateParams = this._state.getValue().getPaymentMethodCreateParams();
        if (paymentMethodCreateParams != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10451(paymentMethodCreateParams, null), 3, null);
        } else {
            Logger.DefaultImpls.error$default(this.logger, "PaymentMethodViewModel: onPayClicked without paymentMethodCreateParams", null, 2, null);
        }
    }

    /* compiled from: PaymentMethodViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.paymentmenthod.PaymentMethodViewModel$onPayClicked$1", f = "PaymentMethodViewModel.kt", i = {0, 0, 1, 1, 2, 2}, l = {93, 99, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m = "invokeSuspend", n = {"$this$withDismissalDisabled$iv", "originalDismissible$iv", "$this$withDismissalDisabled$iv", "originalDismissible$iv", "$this$withDismissalDisabled$iv", "originalDismissible$iv"}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0"})
    /* renamed from: com.stripe.android.link.ui.paymentmenthod.PaymentMethodViewModel$onPayClicked$1, reason: invalid class name and case insensitive filesystem */
    static final class C10451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10451(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super C10451> continuation) {
            super(2, continuation);
            this.$paymentMethodCreateParams = paymentMethodCreateParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentMethodViewModel.this.new C10451(this.$paymentMethodCreateParams, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0129 A[Catch: all -> 0x01c3, TryCatch #0 {all -> 0x01c3, blocks: (B:58:0x0123, B:60:0x0129, B:62:0x0139, B:64:0x013d, B:66:0x0147, B:69:0x014d, B:71:0x0155, B:73:0x0159, B:76:0x015f, B:78:0x0167, B:80:0x016b, B:82:0x016f, B:88:0x0189, B:89:0x018d, B:91:0x01ab), top: B:102:0x0123 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0189 A[Catch: all -> 0x01c3, TRY_ENTER, TryCatch #0 {all -> 0x01c3, blocks: (B:58:0x0123, B:60:0x0129, B:62:0x0139, B:64:0x013d, B:66:0x0147, B:69:0x014d, B:71:0x0155, B:73:0x0159, B:76:0x015f, B:78:0x0167, B:80:0x016b, B:82:0x016f, B:88:0x0189, B:89:0x018d, B:91:0x01ab), top: B:102:0x0123 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            LinkDismissalCoordinator linkDismissalCoordinator;
            LinkDismissalCoordinator linkDismissalCoordinator2;
            PaymentMethodCreateParams paymentMethodCreateParams;
            PaymentMethodViewModel paymentMethodViewModel;
            Object objCreateFailure;
            LinkPaymentDetails.New r0;
            LinkPaymentDetails.New r02;
            boolean z2;
            PaymentMethodCreateParams paymentMethodCreateParams2;
            LinkDismissalCoordinator linkDismissalCoordinator3;
            PaymentMethodViewModel paymentMethodViewModel2;
            Object objMo7717shareCardPaymentDetailsgIAlus;
            Object objM9118constructorimpl;
            LinkDismissalCoordinator linkDismissalCoordinator4;
            Throwable thM9121exceptionOrNullimpl;
            Object value;
            PaymentMethodViewModel paymentMethodViewModel3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z3 = true;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PaymentMethodViewModel.this.clearErrorMessage();
                    PaymentMethodViewModel.this.updateButtonState(PrimaryButtonState.Processing);
                    linkDismissalCoordinator2 = PaymentMethodViewModel.this.dismissalCoordinator;
                    PaymentMethodViewModel paymentMethodViewModel4 = PaymentMethodViewModel.this;
                    paymentMethodCreateParams = this.$paymentMethodCreateParams;
                    boolean z4 = linkDismissalCoordinator2.get_canDismiss();
                    linkDismissalCoordinator2.setDismissible(false);
                    try {
                        LinkAccountManager linkAccountManager = paymentMethodViewModel4.linkAccountManager;
                        this.L$0 = linkDismissalCoordinator2;
                        this.L$1 = paymentMethodViewModel4;
                        this.L$2 = paymentMethodCreateParams;
                        this.Z$0 = z4;
                        this.label = 1;
                        Object objMo7707createCardPaymentDetailsgIAlus = linkAccountManager.mo7707createCardPaymentDetailsgIAlus(paymentMethodCreateParams, this);
                        if (objMo7707createCardPaymentDetailsgIAlus != coroutine_suspended) {
                            paymentMethodViewModel = paymentMethodViewModel4;
                            objCreateFailure = objMo7707createCardPaymentDetailsgIAlus;
                            z3 = z4;
                            if (Result.m9125isSuccessimpl(objCreateFailure)) {
                            }
                            objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
                            z2 = z3;
                            linkDismissalCoordinator4 = linkDismissalCoordinator2;
                            paymentMethodViewModel2 = paymentMethodViewModel;
                            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                            if (thM9121exceptionOrNullimpl != null) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        linkDismissalCoordinator = linkDismissalCoordinator2;
                        z = z4;
                        linkDismissalCoordinator.setDismissible(z);
                        throw th;
                    }
                }
                if (i == 1) {
                    z3 = this.Z$0;
                    PaymentMethodCreateParams paymentMethodCreateParams3 = (PaymentMethodCreateParams) this.L$2;
                    PaymentMethodViewModel paymentMethodViewModel5 = (PaymentMethodViewModel) this.L$1;
                    LinkDismissalCoordinator linkDismissalCoordinator5 = (LinkDismissalCoordinator) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        paymentMethodCreateParams = paymentMethodCreateParams3;
                        objCreateFailure = ((Result) obj).getValue();
                        paymentMethodViewModel = paymentMethodViewModel5;
                        linkDismissalCoordinator2 = linkDismissalCoordinator5;
                        if (Result.m9125isSuccessimpl(objCreateFailure)) {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                r0 = (LinkPaymentDetails.New) objCreateFailure;
                            } catch (Throwable th2) {
                                th = th2;
                                Result.Companion companion2 = Result.INSTANCE;
                                objCreateFailure = ResultKt.createFailure(th);
                                objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
                                z2 = z3;
                                linkDismissalCoordinator4 = linkDismissalCoordinator2;
                                paymentMethodViewModel2 = paymentMethodViewModel;
                                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                                if (thM9121exceptionOrNullimpl != null) {
                                }
                            }
                            if (paymentMethodViewModel.configuration.getPassthroughModeEnabled()) {
                                LinkLaunchMode linkLaunchMode = paymentMethodViewModel.linkLaunchMode;
                                LinkLaunchMode.PaymentMethodSelection paymentMethodSelection = linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection ? (LinkLaunchMode.PaymentMethodSelection) linkLaunchMode : null;
                                if (paymentMethodSelection == null || paymentMethodSelection.getSharePaymentDetailsImmediatelyAfterCreation()) {
                                    LinkAccountManager linkAccountManager2 = paymentMethodViewModel.linkAccountManager;
                                    this.L$0 = linkDismissalCoordinator2;
                                    this.L$1 = paymentMethodViewModel;
                                    this.L$2 = paymentMethodCreateParams;
                                    this.Z$0 = z3;
                                    this.label = 2;
                                    objMo7717shareCardPaymentDetailsgIAlus = linkAccountManager2.mo7717shareCardPaymentDetailsgIAlus(r0, this);
                                    if (objMo7717shareCardPaymentDetailsgIAlus != coroutine_suspended) {
                                        z2 = z3;
                                        paymentMethodCreateParams2 = paymentMethodCreateParams;
                                        linkDismissalCoordinator3 = linkDismissalCoordinator2;
                                        paymentMethodViewModel2 = paymentMethodViewModel;
                                        ResultKt.throwOnFailure(objMo7717shareCardPaymentDetailsgIAlus);
                                        r02 = (LinkPaymentDetails) objMo7717shareCardPaymentDetailsgIAlus;
                                        objM9118constructorimpl = Result.m9118constructorimpl(r02);
                                        LinkDismissalCoordinator linkDismissalCoordinator6 = linkDismissalCoordinator3;
                                        paymentMethodCreateParams = paymentMethodCreateParams2;
                                        linkDismissalCoordinator4 = linkDismissalCoordinator6;
                                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                                        if (thM9121exceptionOrNullimpl != null) {
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                            }
                            r02 = r0;
                            z2 = z3;
                            paymentMethodCreateParams2 = paymentMethodCreateParams;
                            linkDismissalCoordinator3 = linkDismissalCoordinator2;
                            paymentMethodViewModel2 = paymentMethodViewModel;
                            objM9118constructorimpl = Result.m9118constructorimpl(r02);
                            LinkDismissalCoordinator linkDismissalCoordinator62 = linkDismissalCoordinator3;
                            paymentMethodCreateParams = paymentMethodCreateParams2;
                            linkDismissalCoordinator4 = linkDismissalCoordinator62;
                            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                            if (thM9121exceptionOrNullimpl != null) {
                            }
                        }
                        objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
                        z2 = z3;
                        linkDismissalCoordinator4 = linkDismissalCoordinator2;
                        paymentMethodViewModel2 = paymentMethodViewModel;
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = z3;
                        linkDismissalCoordinator = linkDismissalCoordinator5;
                        linkDismissalCoordinator.setDismissible(z);
                        throw th;
                    }
                } else if (i == 2) {
                    z2 = this.Z$0;
                    paymentMethodCreateParams2 = (PaymentMethodCreateParams) this.L$2;
                    paymentMethodViewModel2 = (PaymentMethodViewModel) this.L$1;
                    linkDismissalCoordinator3 = (LinkDismissalCoordinator) this.L$0;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            objMo7717shareCardPaymentDetailsgIAlus = ((Result) obj).getValue();
                            ResultKt.throwOnFailure(objMo7717shareCardPaymentDetailsgIAlus);
                            r02 = (LinkPaymentDetails) objMo7717shareCardPaymentDetailsgIAlus;
                            objM9118constructorimpl = Result.m9118constructorimpl(r02);
                            LinkDismissalCoordinator linkDismissalCoordinator622 = linkDismissalCoordinator3;
                            paymentMethodCreateParams = paymentMethodCreateParams2;
                            linkDismissalCoordinator4 = linkDismissalCoordinator622;
                        } catch (Throwable th4) {
                            th = th4;
                            paymentMethodViewModel = paymentMethodViewModel2;
                            linkDismissalCoordinator2 = linkDismissalCoordinator3;
                            paymentMethodCreateParams = paymentMethodCreateParams2;
                            z3 = z2;
                            Result.Companion companion22 = Result.INSTANCE;
                            objCreateFailure = ResultKt.createFailure(th);
                            objM9118constructorimpl = Result.m9118constructorimpl(objCreateFailure);
                            z2 = z3;
                            linkDismissalCoordinator4 = linkDismissalCoordinator2;
                            paymentMethodViewModel2 = paymentMethodViewModel;
                            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                            if (thM9121exceptionOrNullimpl != null) {
                            }
                        }
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                            MutableStateFlow mutableStateFlow = paymentMethodViewModel2._state;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value, PaymentMethodState.copy$default((PaymentMethodState) value, null, null, null, null, null, ExceptionKtKt.stripeErrorMessage(thM9121exceptionOrNullimpl), 31, null)));
                            paymentMethodViewModel2.updateButtonState(PrimaryButtonState.Enabled);
                            paymentMethodViewModel2.logger.error("PaymentMethodViewModel: Failed to create card payment details", thM9121exceptionOrNullimpl);
                            z = z2;
                            linkDismissalCoordinator = linkDismissalCoordinator4;
                        } else {
                            LinkPaymentDetails linkPaymentDetails = (LinkPaymentDetails) objM9118constructorimpl;
                            Map<String, Object> paramMap = paymentMethodCreateParams.toParamMap();
                            Object obj2 = paramMap.get("card");
                            Map map = obj2 instanceof Map ? (Map) obj2 : null;
                            Object obj3 = paramMap.get("billing_details");
                            Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                            Object obj4 = map != null ? map.get("cvc") : null;
                            String str = obj4 instanceof String ? (String) obj4 : null;
                            Object obj5 = map2 != null ? map2.get("phone") : null;
                            String str2 = obj5 instanceof String ? (String) obj5 : null;
                            this.L$0 = linkDismissalCoordinator4;
                            this.L$1 = paymentMethodViewModel2;
                            this.L$2 = null;
                            this.Z$0 = z2;
                            this.label = 3;
                            if (paymentMethodViewModel2.attemptCompletion(linkPaymentDetails, str, str2, this) != coroutine_suspended) {
                                z = z2;
                                linkDismissalCoordinator = linkDismissalCoordinator4;
                                paymentMethodViewModel3 = paymentMethodViewModel2;
                                paymentMethodViewModel3.updateButtonState(PrimaryButtonState.Enabled);
                            }
                            return coroutine_suspended;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = z2;
                        linkDismissalCoordinator = linkDismissalCoordinator4;
                        linkDismissalCoordinator.setDismissible(z);
                        throw th;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = this.Z$0;
                    paymentMethodViewModel3 = (PaymentMethodViewModel) this.L$1;
                    linkDismissalCoordinator = (LinkDismissalCoordinator) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        paymentMethodViewModel3.updateButtonState(PrimaryButtonState.Enabled);
                    } catch (Throwable th6) {
                        th = th6;
                        linkDismissalCoordinator.setDismissible(z);
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
                linkDismissalCoordinator.setDismissible(z);
                return Unit.INSTANCE;
            } catch (Throwable th7) {
                th = th7;
                z = z3;
                linkDismissalCoordinator = linkDismissalCoordinator2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptCompletion(LinkPaymentDetails linkPaymentDetails, String str, String str2, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        PaymentMethodViewModel paymentMethodViewModel;
        PaymentMethodState value;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            CompleteLinkFlow completeLinkFlow = this.completeLinkFlow;
            LinkPaymentMethod.LinkPaymentDetails linkPaymentDetails2 = new LinkPaymentMethod.LinkPaymentDetails(linkPaymentDetails, str, str2);
            LinkAccount linkAccount = this.linkAccount;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objInvoke = completeLinkFlow.invoke(linkPaymentDetails2, linkAccount, anonymousClass1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentMethodViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentMethodViewModel = (PaymentMethodViewModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        CompleteLinkFlow.Result result = (CompleteLinkFlow.Result) objInvoke;
        if (!(result instanceof CompleteLinkFlow.Result.Canceled)) {
            if (!(result instanceof CompleteLinkFlow.Result.Failed)) {
                if (!(result instanceof CompleteLinkFlow.Result.Completed)) {
                    throw new NoWhenBranchMatchedException();
                }
                paymentMethodViewModel.dismissWithResult.invoke(((CompleteLinkFlow.Result.Completed) result).getLinkActivityResult());
            } else {
                MutableStateFlow<PaymentMethodState> mutableStateFlow = paymentMethodViewModel._state;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, PaymentMethodState.copy$default(value, null, null, null, null, null, ((CompleteLinkFlow.Result.Failed) result).getError(), 31, null)));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonState(PrimaryButtonState state) {
        MutableStateFlow<PaymentMethodState> mutableStateFlow = this._state;
        while (true) {
            PaymentMethodState value = mutableStateFlow.getValue();
            PrimaryButtonState primaryButtonState = state;
            if (mutableStateFlow.compareAndSet(value, PaymentMethodState.copy$default(value, null, null, primaryButtonState, null, null, null, 59, null))) {
                return;
            } else {
                state = primaryButtonState;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearErrorMessage() {
        PaymentMethodState value;
        MutableStateFlow<PaymentMethodState> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, PaymentMethodState.copy$default(value, null, null, null, null, null, null, 31, null)));
    }

    /* compiled from: PaymentMethodViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/link/ui/paymentmenthod/PaymentMethodViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/link/injection/NativeLinkComponent;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "dismissWithResult", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkActivityResult;", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PaymentMethodViewModel factory$lambda$1$lambda$0(NativeLinkComponent nativeLinkComponent, LinkAccount linkAccount, Function1 function1, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            LinkConfiguration configuration = nativeLinkComponent.getConfiguration();
            LinkAccountManager linkAccountManager = nativeLinkComponent.getLinkAccountManager();
            DefaultCompleteLinkFlow defaultCompleteLinkFlow = new DefaultCompleteLinkFlow(nativeLinkComponent.getLinkConfirmationHandlerFactory().create(nativeLinkComponent.getViewModel().getConfirmationHandler()), nativeLinkComponent.getLinkAccountManager(), nativeLinkComponent.getDismissalCoordinator(), nativeLinkComponent.getLinkLaunchMode());
            return new PaymentMethodViewModel(configuration, linkAccount, linkAccountManager, defaultCompleteLinkFlow, nativeLinkComponent.getLogger(), DefaultFormHelper.INSTANCE.create(ViewModelKt.getViewModelScope(nativeLinkComponent.getViewModel()), nativeLinkComponent.getCardAccountRangeRepositoryFactory(), new PaymentElementAutocompleteAddressInteractor.Factory(nativeLinkComponent.getAutocompleteLauncher(), new AutocompleteAddressInteractor.Config(nativeLinkComponent.getConfiguration().getGooglePlacesApiKey(), AddressElementDefaultsKt.getAUTOCOMPLETE_DEFAULT_COUNTRIES(), false, 4, null)), PaymentMethodMetadata.INSTANCE.createForNativeLink$paymentsheet_release(nativeLinkComponent.getConfiguration(), linkAccount), nativeLinkComponent.getEventReporter(), nativeLinkComponent.getViewModel().getSavedStateHandle()), nativeLinkComponent.getDismissalCoordinator(), nativeLinkComponent.getLinkLaunchMode(), function1);
        }

        public final ViewModelProvider.Factory factory(final NativeLinkComponent parentComponent, final LinkAccount linkAccount, final Function1<? super LinkActivityResult, Unit> dismissWithResult) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
            Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(PaymentMethodViewModel.class), new Function1() { // from class: com.stripe.android.link.ui.paymentmenthod.PaymentMethodViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PaymentMethodViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, linkAccount, dismissWithResult, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
