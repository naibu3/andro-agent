package com.stripe.android.link.ui.updatecard;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.Logger;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.ConsumerState;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.confirmation.CompleteLinkFlow;
import com.stripe.android.link.confirmation.DefaultCompleteLinkFlow;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.updatecard.UpdateCardScreenViewModel;
import com.stripe.android.link.utils.LinkBillingDetailsUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.CardUpdateParams;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.CardEditConfiguration;
import com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor;
import com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor;
import com.stripe.android.paymentsheet.ui.EditCardPayload;
import com.stripe.android.uicore.navigation.NavigationManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: UpdateCardScreenViewModel.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 62\u00020\u0001:\u00016Bg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010'\u001a\u00020\u0013J\f\u0010(\u001a\u00020)*\u00020*H\u0002J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0002J\u0017\u0010.\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010*H\u0001¢\u0006\u0002\b0J\u0010\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u000203H\u0002J\u0012\u00104\u001a\u0002052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00067"}, d2 = {"Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "logger", "Lcom/stripe/android/core/Logger;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "dismissalCoordinator", "Lcom/stripe/android/link/LinkDismissalCoordinator;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "completeLinkFlow", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;", "dismissWithResult", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkActivityResult;", "", "paymentDetailsId", "", "billingDetailsUpdateFlow", "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;", "<init>", "(Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/confirmation/CompleteLinkFlow;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "interactor", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", "getInteractor", "()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", "setInteractor", "(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;)V", "onUpdateClicked", "toApiParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "initializeInteractor", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "onCardUpdateParamsChanged", "cardUpdateParams", "onCardUpdateParamsChanged$paymentsheet_release", "onBrandChoiceChanged", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "primaryButtonLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdateCardScreenViewModel extends ViewModel {
    private final MutableStateFlow<UpdateCardScreenState> _state;
    private final CompleteLinkFlow completeLinkFlow;
    private final LinkConfiguration configuration;
    private final Function1<LinkActivityResult, Unit> dismissWithResult;
    private final LinkDismissalCoordinator dismissalCoordinator;
    private EditCardDetailsInteractor interactor;
    private final LinkAccountManager linkAccountManager;
    private final LinkLaunchMode linkLaunchMode;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final StateFlow<UpdateCardScreenState> state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public UpdateCardScreenViewModel(Logger logger, LinkAccountManager linkAccountManager, NavigationManager navigationManager, LinkDismissalCoordinator dismissalCoordinator, LinkConfiguration configuration, LinkLaunchMode linkLaunchMode, CompleteLinkFlow completeLinkFlow, Function1<? super LinkActivityResult, Unit> dismissWithResult, String paymentDetailsId, LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow) {
        Object objM9118constructorimpl;
        ConsumerPaymentDetails.PaymentDetails paymentDetails;
        UpdateCardScreenState value;
        List<LinkPaymentMethod.ConsumerPaymentDetails> paymentDetails2;
        Object next;
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(dismissalCoordinator, "dismissalCoordinator");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(linkLaunchMode, "linkLaunchMode");
        Intrinsics.checkNotNullParameter(completeLinkFlow, "completeLinkFlow");
        Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
        Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
        this.logger = logger;
        this.linkAccountManager = linkAccountManager;
        this.navigationManager = navigationManager;
        this.dismissalCoordinator = dismissalCoordinator;
        this.configuration = configuration;
        this.linkLaunchMode = linkLaunchMode;
        this.completeLinkFlow = completeLinkFlow;
        this.dismissWithResult = dismissWithResult;
        MutableStateFlow<UpdateCardScreenState> MutableStateFlow = StateFlowKt.MutableStateFlow(new UpdateCardScreenState(paymentDetailsId, billingDetailsUpdateFlow, primaryButtonLabel(billingDetailsUpdateFlow), false, null, null, null, false, 248, null));
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        try {
            Result.Companion companion = Result.INSTANCE;
            UpdateCardScreenViewModel updateCardScreenViewModel = this;
            ConsumerState value2 = this.linkAccountManager.getConsumerState().getValue();
            ConsumerPaymentDetails.PaymentDetails details = null;
            if (value2 != null && (paymentDetails2 = value2.getPaymentDetails()) != null) {
                Iterator<T> it = paymentDetails2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.areEqual(((LinkPaymentMethod.ConsumerPaymentDetails) next).getDetails().getId(), paymentDetailsId)) {
                            break;
                        }
                    }
                }
                LinkPaymentMethod.ConsumerPaymentDetails consumerPaymentDetails = (LinkPaymentMethod.ConsumerPaymentDetails) next;
                if (consumerPaymentDetails != null) {
                    details = consumerPaymentDetails.getDetails();
                }
            }
            paymentDetails = details;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (paymentDetails == null) {
            throw new IllegalArgumentException(("Payment details with id " + paymentDetailsId + " not found").toString());
        }
        MutableStateFlow<UpdateCardScreenState> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UpdateCardScreenState.copy$default(value, paymentDetailsId, null, null, paymentDetails.getIsDefault(), null, null, null, false, 246, null)));
        this.interactor = initializeInteractor(paymentDetails);
        objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.logger.error("Failed to render payment update screen", thM9121exceptionOrNullimpl);
            this.navigationManager.tryNavigateBack();
        }
    }

    public final StateFlow<UpdateCardScreenState> getState() {
        return this.state;
    }

    public final EditCardDetailsInteractor getInteractor() {
        return this.interactor;
    }

    public final void setInteractor(EditCardDetailsInteractor editCardDetailsInteractor) {
        this.interactor = editCardDetailsInteractor;
    }

    /* compiled from: UpdateCardScreenViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.updatecard.UpdateCardScreenViewModel$onUpdateClicked$1", f = "UpdateCardScreenViewModel.kt", i = {0, 0, 0, 0, 1, 1}, l = {105, 117}, m = "invokeSuspend", n = {"$this$withDismissalDisabled$iv", "paymentUpdateParams", "paymentDetailsId", "originalDismissible$iv", "$this$withDismissalDisabled$iv", "originalDismissible$iv"}, s = {"L$0", "L$2", "L$3", "Z$0", "L$0", "Z$0"})
    /* renamed from: com.stripe.android.link.ui.updatecard.UpdateCardScreenViewModel$onUpdateClicked$1, reason: invalid class name and case insensitive filesystem */
    static final class C10511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;

        C10511(Continuation<? super C10511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10511 c10511 = UpdateCardScreenViewModel.this.new C10511(continuation);
            c10511.L$0 = obj;
            return c10511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(15:6|123|7|8|120|67|(1:68)|(2:72|(2:74|(1:75))(2:78|(1:80)(2:81|82)))|83|95|106|(2:108|(1:109))|111|112|113)(2:11|12))(4:13|121|14|15))(7:20|125|21|(1:22)|24|25|(2:27|(7:29|(1:31)(1:32)|33|(1:35)(1:36)|37|(1:40)|65)(2:99|100))(2:101|102))|16|117|41|(4:43|(4:46|(1:136)(2:133|(2:49|137)(3:134|50|51))|135|44)|132|(2:53|(7:55|(1:57)(1:58)|59|(1:61)(1:62)|63|(12:66|120|67|(1:68)|(0)|83|95|106|(0)|111|112|113)|65)(2:86|87))(2:88|89))(11:90|(1:91)|93|94|83|95|106|(0)|111|112|113)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0260, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0261, code lost:
        
            r3 = r7;
         */
        /* JADX WARN: Removed duplicated region for block: B:108:0x028c A[Catch: all -> 0x02c1, TryCatch #1 {all -> 0x02c1, blocks: (B:106:0x0286, B:108:0x028c, B:109:0x0299, B:111:0x02b9, B:105:0x027c), top: B:118:0x027c }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01cd A[Catch: all -> 0x0214, TryCatch #2 {all -> 0x0214, blocks: (B:67:0x01a5, B:68:0x01ab, B:70:0x01c9, B:72:0x01cd, B:74:0x01d1, B:75:0x01d5, B:78:0x01fa, B:80:0x01fe, B:81:0x020c, B:82:0x0211), top: B:120:0x01a5 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UpdateCardScreenViewModel updateCardScreenViewModel;
            LinkDismissalCoordinator linkDismissalCoordinator;
            UpdateCardScreenViewModel updateCardScreenViewModel2;
            boolean z;
            Object value;
            String paymentDetailsId;
            Object value2;
            LinkDismissalCoordinator linkDismissalCoordinator2;
            CardUpdateParams cardUpdateParams;
            Object value3;
            Object objInvoke;
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            Object value4;
            CompleteLinkFlow.Result result;
            MutableStateFlow mutableStateFlow;
            Object value5;
            Object value6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z2 = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkDismissalCoordinator linkDismissalCoordinator3 = UpdateCardScreenViewModel.this.dismissalCoordinator;
                updateCardScreenViewModel = UpdateCardScreenViewModel.this;
                boolean z3 = linkDismissalCoordinator3.get_canDismiss();
                linkDismissalCoordinator3.setDismissible(false);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    MutableStateFlow mutableStateFlow2 = updateCardScreenViewModel._state;
                    do {
                        value = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value, UpdateCardScreenState.copy$default((UpdateCardScreenState) value, null, null, null, false, null, null, null, true, 63, null)));
                    CardUpdateParams cardUpdateParams2 = updateCardScreenViewModel.getState().getValue().getCardUpdateParams();
                    if (cardUpdateParams2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    paymentDetailsId = updateCardScreenViewModel.getState().getValue().getPaymentDetailsId();
                    if (paymentDetailsId == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    Boolean boolBoxBoolean = Boxing.boxBoolean(updateCardScreenViewModel.getState().getValue().isDefault());
                    if (!boolBoxBoolean.booleanValue()) {
                        boolBoxBoolean = null;
                    }
                    ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams = new ConsumerPaymentDetailsUpdateParams(paymentDetailsId, boolBoxBoolean, updateCardScreenViewModel.toApiParams(cardUpdateParams2).toParamMap());
                    LinkAccountManager linkAccountManager = updateCardScreenViewModel.linkAccountManager;
                    PaymentMethod.BillingDetails billingDetails = cardUpdateParams2.getBillingDetails();
                    String str = billingDetails != null ? billingDetails.phone : null;
                    this.L$0 = linkDismissalCoordinator3;
                    this.L$1 = updateCardScreenViewModel;
                    this.L$2 = cardUpdateParams2;
                    this.L$3 = paymentDetailsId;
                    this.Z$0 = z3;
                    this.label = 1;
                    Object objMo7722updatePaymentDetails0E7RQCE = linkAccountManager.mo7722updatePaymentDetails0E7RQCE(consumerPaymentDetailsUpdateParams, str, this);
                    if (objMo7722updatePaymentDetails0E7RQCE != coroutine_suspended) {
                        value2 = objMo7722updatePaymentDetails0E7RQCE;
                        linkDismissalCoordinator2 = linkDismissalCoordinator3;
                        z = z3;
                        cardUpdateParams = cardUpdateParams2;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    th = th;
                    linkDismissalCoordinator = linkDismissalCoordinator3;
                    updateCardScreenViewModel2 = updateCardScreenViewModel;
                    z = z3;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    Unit unit = Unit.INSTANCE;
                    linkDismissalCoordinator.setDismissible(z);
                    return Unit.INSTANCE;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                updateCardScreenViewModel2 = (UpdateCardScreenViewModel) this.L$1;
                linkDismissalCoordinator = (LinkDismissalCoordinator) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    updateCardScreenViewModel = updateCardScreenViewModel2;
                    objInvoke = obj;
                    try {
                        result = (CompleteLinkFlow.Result) objInvoke;
                        mutableStateFlow = updateCardScreenViewModel._state;
                        do {
                            value5 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value5, UpdateCardScreenState.copy$default((UpdateCardScreenState) value5, null, null, null, false, null, null, null, false, 127, null)));
                        if (!(result instanceof CompleteLinkFlow.Result.Canceled)) {
                            if (result instanceof CompleteLinkFlow.Result.Failed) {
                                MutableStateFlow mutableStateFlow3 = updateCardScreenViewModel._state;
                                do {
                                    value6 = mutableStateFlow3.getValue();
                                } while (!mutableStateFlow3.compareAndSet(value6, UpdateCardScreenState.copy$default((UpdateCardScreenState) value6, null, null, null, false, null, null, ((CompleteLinkFlow.Result.Failed) result).getError(), false, 191, null)));
                            } else if (result instanceof CompleteLinkFlow.Result.Completed) {
                                updateCardScreenViewModel.dismissWithResult.invoke(((CompleteLinkFlow.Result.Completed) result).getLinkActivityResult());
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        updateCardScreenViewModel2 = updateCardScreenViewModel;
                        objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        th = th2;
                        updateCardScreenViewModel2 = updateCardScreenViewModel;
                        try {
                            Result.Companion companion22 = Result.INSTANCE;
                            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                            if (thM9121exceptionOrNullimpl != null) {
                            }
                            Unit unit2 = Unit.INSTANCE;
                            linkDismissalCoordinator.setDismissible(z);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            linkDismissalCoordinator.setDismissible(z);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Result.Companion companion222 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    Unit unit22 = Unit.INSTANCE;
                    linkDismissalCoordinator.setDismissible(z);
                    return Unit.INSTANCE;
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    updateCardScreenViewModel2.logger.error("Failed to update payment details", thM9121exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow4 = updateCardScreenViewModel2._state;
                    do {
                        value4 = mutableStateFlow4.getValue();
                    } while (!mutableStateFlow4.compareAndSet(value4, UpdateCardScreenState.copy$default((UpdateCardScreenState) value4, null, null, null, false, null, null, ExceptionKtKt.stripeErrorMessage(thM9121exceptionOrNullimpl), false, 63, null)));
                }
                Unit unit222 = Unit.INSTANCE;
                linkDismissalCoordinator.setDismissible(z);
                return Unit.INSTANCE;
            }
            z = this.Z$0;
            String str2 = (String) this.L$3;
            cardUpdateParams = (CardUpdateParams) this.L$2;
            UpdateCardScreenViewModel updateCardScreenViewModel3 = (UpdateCardScreenViewModel) this.L$1;
            linkDismissalCoordinator2 = (LinkDismissalCoordinator) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                value2 = ((Result) obj).getValue();
                paymentDetailsId = str2;
                updateCardScreenViewModel = updateCardScreenViewModel3;
            } catch (Throwable th5) {
                th = th5;
                updateCardScreenViewModel2 = updateCardScreenViewModel3;
                linkDismissalCoordinator = linkDismissalCoordinator2;
                Result.Companion companion2222 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                Unit unit2222 = Unit.INSTANCE;
                linkDismissalCoordinator.setDismissible(z);
                return Unit.INSTANCE;
            }
            Object obj2 = value2;
            ResultKt.throwOnFailure(obj2);
            ConsumerPaymentDetails consumerPaymentDetails = (ConsumerPaymentDetails) obj2;
            if (!updateCardScreenViewModel.getState().getValue().isBillingDetailsUpdateFlow()) {
                MutableStateFlow mutableStateFlow5 = updateCardScreenViewModel._state;
                do {
                    value3 = mutableStateFlow5.getValue();
                } while (!mutableStateFlow5.compareAndSet(value3, UpdateCardScreenState.copy$default((UpdateCardScreenState) value3, null, null, null, false, null, null, null, false, 63, null)));
                updateCardScreenViewModel.navigationManager.tryNavigateBack();
                linkDismissalCoordinator = linkDismissalCoordinator2;
                updateCardScreenViewModel2 = updateCardScreenViewModel;
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                Unit unit22222 = Unit.INSTANCE;
                linkDismissalCoordinator.setDismissible(z);
                return Unit.INSTANCE;
            }
            Object obj3 = null;
            for (Object obj4 : consumerPaymentDetails.getPaymentDetails()) {
                if (Intrinsics.areEqual(((ConsumerPaymentDetails.PaymentDetails) obj4).getId(), paymentDetailsId)) {
                    if (z2) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z2 = true;
                    obj3 = obj4;
                }
            }
            if (z2) {
                ConsumerPaymentDetails.PaymentDetails paymentDetails = (ConsumerPaymentDetails.PaymentDetails) obj3;
                LinkAccount account = updateCardScreenViewModel.linkAccountManager.getLinkAccountInfo().getValue().getAccount();
                if (account != null) {
                    CompleteLinkFlow completeLinkFlow = updateCardScreenViewModel.completeLinkFlow;
                    LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow = updateCardScreenViewModel.getState().getValue().getBillingDetailsUpdateFlow();
                    String cvc = billingDetailsUpdateFlow != null ? billingDetailsUpdateFlow.getCvc() : null;
                    PaymentMethod.BillingDetails billingDetails2 = cardUpdateParams.getBillingDetails();
                    LinkPaymentMethod.ConsumerPaymentDetails consumerPaymentDetails2 = new LinkPaymentMethod.ConsumerPaymentDetails(paymentDetails, cvc, billingDetails2 != null ? billingDetails2.phone : null);
                    this.L$0 = linkDismissalCoordinator2;
                    this.L$1 = updateCardScreenViewModel;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.Z$0 = z;
                    this.label = 2;
                    objInvoke = completeLinkFlow.invoke(consumerPaymentDetails2, account, this);
                    if (objInvoke != coroutine_suspended) {
                        linkDismissalCoordinator = linkDismissalCoordinator2;
                        result = (CompleteLinkFlow.Result) objInvoke;
                        mutableStateFlow = updateCardScreenViewModel._state;
                        do {
                            value5 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value5, UpdateCardScreenState.copy$default((UpdateCardScreenState) value5, null, null, null, false, null, null, null, false, 127, null)));
                        if (!(result instanceof CompleteLinkFlow.Result.Canceled)) {
                        }
                        updateCardScreenViewModel2 = updateCardScreenViewModel;
                        objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                        Unit unit222222 = Unit.INSTANCE;
                        linkDismissalCoordinator.setDismissible(z);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                throw new IllegalArgumentException("LinkAccount should not be null in billing details update flow".toString());
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public final void onUpdateClicked() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10511(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodCreateParams toApiParams(CardUpdateParams cardUpdateParams) {
        PaymentMethodCreateParams.Companion companion = PaymentMethodCreateParams.INSTANCE;
        PaymentMethodCreateParams.Card.Builder builder = new PaymentMethodCreateParams.Card.Builder();
        builder.setExpiryMonth(cardUpdateParams.getExpiryMonth());
        builder.setExpiryYear(cardUpdateParams.getExpiryYear());
        CardBrand preferredCardBrand = this.state.getValue().getPreferredCardBrand();
        if (preferredCardBrand != null) {
            builder.setNetworks(new PaymentMethodCreateParams.Card.Networks(preferredCardBrand.getCode()));
        }
        return PaymentMethodCreateParams.Companion.create$default(companion, builder.build(), cardUpdateParams.getBillingDetails(), (Map) null, (PaymentMethod.AllowRedisplay) null, 12, (Object) null);
    }

    private final EditCardDetailsInteractor initializeInteractor(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        CardEditConfiguration cardEditConfiguration;
        if (this.state.getValue().isBillingDetailsUpdateFlow()) {
            paymentDetails = LinkBillingDetailsUtilsKt.withEffectiveBillingDetails(paymentDetails, this.configuration, this.linkAccountManager.getLinkAccountInfo().getValue().getAccount());
        }
        ConsumerPaymentDetails.Card card = paymentDetails instanceof ConsumerPaymentDetails.Card ? (ConsumerPaymentDetails.Card) paymentDetails : null;
        if (card != null) {
            cardEditConfiguration = new CardEditConfiguration(DefaultCardBrandFilter.INSTANCE, card.getAvailableNetworks().size() > 1, true);
        } else {
            cardEditConfiguration = null;
        }
        DefaultEditCardDetailsInteractor.Factory factory = new DefaultEditCardDetailsInteractor.Factory();
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        EditCardPayload.Companion companion = EditCardPayload.INSTANCE;
        LinkAccount account = this.linkAccountManager.getLinkAccountInfo().getValue().getAccount();
        return factory.create(viewModelScope, cardEditConfiguration, !this.state.getValue().isBillingDetailsUpdateFlow(), companion.create(paymentDetails, account != null ? account.getUnredactedPhoneNumber() : null), this.configuration.getBillingDetailsCollectionConfiguration(), new AnonymousClass2(this), new AnonymousClass1(this));
    }

    /* compiled from: UpdateCardScreenViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.updatecard.UpdateCardScreenViewModel$initializeInteractor$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<CardUpdateParams, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, UpdateCardScreenViewModel.class, "onCardUpdateParamsChanged", "onCardUpdateParamsChanged$paymentsheet_release(Lcom/stripe/android/paymentsheet/CardUpdateParams;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardUpdateParams cardUpdateParams) {
            invoke2(cardUpdateParams);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardUpdateParams cardUpdateParams) {
            ((UpdateCardScreenViewModel) this.receiver).onCardUpdateParamsChanged$paymentsheet_release(cardUpdateParams);
        }
    }

    /* compiled from: UpdateCardScreenViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.updatecard.UpdateCardScreenViewModel$initializeInteractor$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<CardBrand, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, UpdateCardScreenViewModel.class, "onBrandChoiceChanged", "onBrandChoiceChanged(Lcom/stripe/android/model/CardBrand;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand) {
            invoke2(cardBrand);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardBrand p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((UpdateCardScreenViewModel) this.receiver).onBrandChoiceChanged(p0);
        }
    }

    public final void onCardUpdateParamsChanged$paymentsheet_release(CardUpdateParams cardUpdateParams) {
        MutableStateFlow<UpdateCardScreenState> mutableStateFlow = this._state;
        while (true) {
            UpdateCardScreenState value = mutableStateFlow.getValue();
            CardUpdateParams cardUpdateParams2 = cardUpdateParams;
            if (mutableStateFlow.compareAndSet(value, UpdateCardScreenState.copy$default(value, null, null, null, false, cardUpdateParams2, null, null, false, 239, null))) {
                return;
            } else {
                cardUpdateParams = cardUpdateParams2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBrandChoiceChanged(CardBrand cardBrand) {
        MutableStateFlow<UpdateCardScreenState> mutableStateFlow = this._state;
        while (true) {
            UpdateCardScreenState value = mutableStateFlow.getValue();
            CardBrand cardBrand2 = cardBrand;
            if (mutableStateFlow.compareAndSet(value, UpdateCardScreenState.copy$default(value, null, null, null, false, null, cardBrand2, null, false, 223, null))) {
                return;
            } else {
                cardBrand = cardBrand2;
            }
        }
    }

    private final ResolvableString primaryButtonLabel(LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow) {
        if (billingDetailsUpdateFlow != null) {
            return PrimaryButtonKt.completePaymentButtonLabel(this.configuration.getStripeIntent(), this.linkLaunchMode);
        }
        return ResolvableStringUtilsKt.getResolvableString(R.string.stripe_link_update_card_confirm_cta);
    }

    /* compiled from: UpdateCardScreenViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/link/injection/NativeLinkComponent;", "paymentDetailsId", "", "billingDetailsUpdateFlow", "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;", "dismissWithResult", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkActivityResult;", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UpdateCardScreenViewModel factory$lambda$1$lambda$0(NativeLinkComponent nativeLinkComponent, Function1 function1, String str, LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new UpdateCardScreenViewModel(nativeLinkComponent.getLogger(), nativeLinkComponent.getLinkAccountManager(), nativeLinkComponent.getNavigationManager(), nativeLinkComponent.getDismissalCoordinator(), nativeLinkComponent.getConfiguration(), nativeLinkComponent.getLinkLaunchMode(), new DefaultCompleteLinkFlow(nativeLinkComponent.getLinkConfirmationHandlerFactory().create(nativeLinkComponent.getViewModel().getConfirmationHandler()), nativeLinkComponent.getLinkAccountManager(), nativeLinkComponent.getDismissalCoordinator(), nativeLinkComponent.getLinkLaunchMode()), function1, str, billingDetailsUpdateFlow);
        }

        public final ViewModelProvider.Factory factory(final NativeLinkComponent parentComponent, final String paymentDetailsId, final LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow, final Function1<? super LinkActivityResult, Unit> dismissWithResult) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(UpdateCardScreenViewModel.class), new Function1() { // from class: com.stripe.android.link.ui.updatecard.UpdateCardScreenViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UpdateCardScreenViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, dismissWithResult, paymentDetailsId, billingDetailsUpdateFlow, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
