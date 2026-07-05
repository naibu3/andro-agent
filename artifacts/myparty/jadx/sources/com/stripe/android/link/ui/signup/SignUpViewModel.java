package com.stripe.android.link.ui.signup;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.Logger;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.NoLinkAccountFoundException;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.account.LinkAuthResult;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.inline.SignUpConsentAction;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.model.EmailSource;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.forms.FormFieldEntry;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SignUpViewModel.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 O2\u00020\u0001:\u0001OB}\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u00100\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u00101J\u000e\u00102\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u00101J\u0016\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u000205H\u0082@¢\u0006\u0002\u00106J\u0006\u00107\u001a\u00020\u0011J\u000e\u00108\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u00101J4\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020;2\u001c\u0010<\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110=\u0012\u0006\u0012\u0004\u0018\u00010>0\u000fH\u0082@¢\u0006\u0002\u0010?J\u0012\u0010@\u001a\u00020\u00112\b\u0010A\u001a\u0004\u0018\u00010BH\u0002J\f\u0010C\u001a\u00020\u0011*\u00020DH\u0002J\u001e\u0010E\u001a\u00020\u00112\b\u0010F\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010G\u001a\u0004\u0018\u00010HH\u0002J\b\u0010I\u001a\u00020\u0011H\u0002J\u001c\u0010J\u001a\u00020\u00112\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u000fH\u0002J\u0010\u0010L\u001a\u00020\u00112\u0006\u0010M\u001a\u00020NH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020*0,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/stripe/android/link/ui/signup/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "logger", "Lcom/stripe/android/core/Logger;", "linkAuth", "Lcom/stripe/android/link/account/LinkAuth;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dismissalCoordinator", "Lcom/stripe/android/link/LinkDismissalCoordinator;", "navigateAndClearStack", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkScreen;", "", "moveToWeb", "", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "dismissWithResult", "Lcom/stripe/android/link/LinkActivityResult;", "<init>", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/account/LinkAuth;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkDismissalCoordinator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;)V", "useLinkConfigurationCustomerInfo", "", "customerInfo", "Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;", "emailController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "getEmailController", "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "phoneNumberController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "getPhoneNumberController", "()Lcom/stripe/android/uicore/elements/PhoneNumberController;", "nameController", "getNameController", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/ui/signup/SignUpScreenState;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "emailHasChanged", "signUpEnabledListener", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailListener", "lookupEmail", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSignUpClick", "performSignup", "handleLookupResult", "lookupResult", "Lcom/stripe/android/link/account/LinkAuthResult;", "onNoLinkAccountFound", "Lkotlin/coroutines/Continuation;", "", "(Lcom/stripe/android/link/account/LinkAuthResult;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAccountFetched", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "handle", "Lcom/stripe/android/link/account/LinkAuthResult$AccountError;", "onError", "error", "errorMessage", "Lcom/stripe/android/core/strings/ResolvableString;", "clearError", "updateState", "produceValue", "updateSignUpState", "signUpState", "Lcom/stripe/android/link/ui/signup/SignUpState;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignUpViewModel extends ViewModel {
    private static final long LOOKUP_DEBOUNCE;
    public static final String USE_LINK_CONFIGURATION_CUSTOMER_INFO = "use_link_configuration_customer_info";
    private final MutableStateFlow<SignUpScreenState> _state;
    private final LinkConfiguration configuration;
    private final LinkConfiguration.CustomerInfo customerInfo;
    private final Function1<LinkActivityResult, Unit> dismissWithResult;
    private final LinkDismissalCoordinator dismissalCoordinator;
    private final SimpleTextFieldController emailController;
    private boolean emailHasChanged;
    private final LinkAuth linkAuth;
    private final LinkEventsReporter linkEventsReporter;
    private final LinkLaunchMode linkLaunchMode;
    private final Logger logger;
    private final Function1<Throwable, Unit> moveToWeb;
    private final SimpleTextFieldController nameController;
    private final Function1<LinkScreen, Unit> navigateAndClearStack;
    private final PhoneNumberController phoneNumberController;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow<SignUpScreenState> state;
    private final boolean useLinkConfigurationCustomerInfo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SignUpViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel", f = "SignUpViewModel.kt", i = {0}, l = {131, 140}, m = "lookupEmail", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$lookupEmail$1, reason: invalid class name and case insensitive filesystem */
    static final class C10471 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10471(Continuation<? super C10471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignUpViewModel.this.lookupEmail(null, this);
        }
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel", f = "SignUpViewModel.kt", i = {0, 0, 0}, l = {178}, m = "performSignup", n = {"this", "$this$withDismissalDisabled$iv", "originalDismissible$iv"}, s = {"L$0", "L$1", "Z$0"})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$performSignup$1, reason: invalid class name and case insensitive filesystem */
    static final class C10501 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C10501(Continuation<? super C10501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignUpViewModel.this.performSignup(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public SignUpViewModel(LinkConfiguration configuration, LinkEventsReporter linkEventsReporter, Logger logger, LinkAuth linkAuth, SavedStateHandle savedStateHandle, LinkDismissalCoordinator dismissalCoordinator, Function1<? super LinkScreen, Unit> navigateAndClearStack, Function1<? super Throwable, Unit> moveToWeb, LinkLaunchMode linkLaunchMode, Function1<? super LinkActivityResult, Unit> dismissWithResult) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(linkAuth, "linkAuth");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dismissalCoordinator, "dismissalCoordinator");
        Intrinsics.checkNotNullParameter(navigateAndClearStack, "navigateAndClearStack");
        Intrinsics.checkNotNullParameter(moveToWeb, "moveToWeb");
        Intrinsics.checkNotNullParameter(linkLaunchMode, "linkLaunchMode");
        Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
        this.configuration = configuration;
        this.linkEventsReporter = linkEventsReporter;
        this.logger = logger;
        this.linkAuth = linkAuth;
        this.savedStateHandle = savedStateHandle;
        this.dismissalCoordinator = dismissalCoordinator;
        this.navigateAndClearStack = navigateAndClearStack;
        this.moveToWeb = moveToWeb;
        this.linkLaunchMode = linkLaunchMode;
        this.dismissWithResult = dismissWithResult;
        Boolean bool = (Boolean) savedStateHandle.get(USE_LINK_CONFIGURATION_CUSTOMER_INFO);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        this.useLinkConfigurationCustomerInfo = zBooleanValue;
        LinkConfiguration.CustomerInfo customerInfo = zBooleanValue ? configuration.getCustomerInfo() : null;
        this.customerInfo = customerInfo;
        this.emailController = EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, customerInfo != null ? customerInfo.getEmail() : null, false, 2, null);
        PhoneNumberController.Companion companion = PhoneNumberController.INSTANCE;
        String phone = customerInfo != null ? customerInfo.getPhone() : null;
        this.phoneNumberController = PhoneNumberController.Companion.createPhoneNumberController$default(companion, phone == null ? "" : phone, customerInfo != null ? customerInfo.getBillingCountryCode() : null, null, false, false, 28, null);
        this.nameController = NameConfig.INSTANCE.createController(customerInfo != null ? customerInfo.getName() : null);
        MutableStateFlow<SignUpScreenState> MutableStateFlow = StateFlowKt.MutableStateFlow(SignUpScreenState.INSTANCE.create(configuration, customerInfo));
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        SignUpViewModel signUpViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(signUpViewModel), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(signUpViewModel), null, null, new AnonymousClass2(null), 3, null);
        linkEventsReporter.onSignupFlowPresented();
    }

    public final SimpleTextFieldController getEmailController() {
        return this.emailController;
    }

    public final PhoneNumberController getPhoneNumberController() {
        return this.phoneNumberController;
    }

    public final SimpleTextFieldController getNameController() {
        return this.nameController;
    }

    public final StateFlow<SignUpScreenState> getState() {
        return this.state;
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$1", f = "SignUpViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SignUpViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (SignUpViewModel.this.signUpEnabledListener(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$2", f = "SignUpViewModel.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SignUpViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (SignUpViewModel.this.emailListener(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object signUpEnabledListener(Continuation<? super Unit> continuation) {
        final StateFlow<TextFieldState> fieldState = this.nameController.getFieldState();
        Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ SignUpViewModel this$0;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$$inlined$map$1$2", f = "SignUpViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SignUpViewModel signUpViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = signUpViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = Boxing.boxBoolean(this.this$0.getState().getValue().getRequiresNameCollection() ? ((TextFieldState) obj).isValid() : true);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation2) {
                Object objCollect = fieldState.collect(new AnonymousClass2(flowCollector, this), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        final StateFlow<TextFieldState> fieldState2 = this.emailController.getFieldState();
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.combine(flow, new Flow<Boolean>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$$inlined$map$2$2", f = "SignUpViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = Boxing.boxBoolean(((TextFieldState) obj).isValid());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation2) {
                Object objCollect = fieldState2.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, this.phoneNumberController.isComplete(), new AnonymousClass4(null)), new AnonymousClass5(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "nameComplete", "emailComplete", "phoneComplete"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$4", f = "SignUpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function4<Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        /* synthetic */ boolean Z$2;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, boolean z2, boolean z3, Continuation<? super Boolean> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
            anonymousClass4.Z$0 = z;
            anonymousClass4.Z$1 = z2;
            anonymousClass4.Z$2 = z3;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.Z$0 && this.Z$1 && this.Z$2);
        }
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "formValid", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$5", f = "SignUpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = SignUpViewModel.this.new AnonymousClass5(continuation);
            anonymousClass5.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                final boolean z = this.Z$0;
                SignUpViewModel.this.updateState(new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$signUpEnabledListener$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SignUpViewModel.AnonymousClass5.invokeSuspend$lambda$0(z, (SignUpScreenState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SignUpScreenState invokeSuspend$lambda$0(boolean z, SignUpScreenState signUpScreenState) {
            return SignUpScreenState.copy$default(signUpScreenState, null, z, false, false, null, false, null, 125, null);
        }
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "entry", "Lcom/stripe/android/uicore/forms/FormFieldEntry;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$emailListener$2", f = "SignUpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$emailListener$2, reason: invalid class name and case insensitive filesystem */
    static final class C10462 extends SuspendLambda implements Function2<FormFieldEntry, Continuation<? super String>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C10462(Continuation<? super C10462> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10462 c10462 = new C10462(continuation);
            c10462.L$0 = obj;
            return c10462;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FormFieldEntry formFieldEntry, Continuation<? super String> continuation) {
            return ((C10462) create(formFieldEntry, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FormFieldEntry formFieldEntry = (FormFieldEntry) this.L$0;
            if (!formFieldEntry.isComplete()) {
                formFieldEntry = null;
            }
            if (formFieldEntry != null) {
                return formFieldEntry.getValue();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emailListener(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.mapLatest(this.emailController.getFormFieldValue(), new C10462(null)), new AnonymousClass3(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "email", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$emailListener$3", f = "SignUpViewModel.kt", i = {0, 1}, l = {111, 114}, m = "invokeSuspend", n = {"email", "email"}, s = {"L$0", "L$0"})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$emailListener$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = SignUpViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                str = (String) this.L$0;
                SignUpViewModel.onError$default(SignUpViewModel.this, null, null, 2, null);
                this.L$0 = str;
                this.label = 1;
                if (DelayKt.m10627delayVtjQ1oo(SignUpViewModel.INSTANCE.m7914getLOOKUP_DEBOUNCEUwyO8pc$paymentsheet_release(), this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str2;
                if (!Intrinsics.areEqual(str, SignUpViewModel.this.configuration.getCustomerInfo().getEmail())) {
                    SignUpViewModel.this.emailHasChanged = true;
                }
                return Unit.INSTANCE;
            }
            String str3 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            str = str3;
            if (str != null) {
                if (!Intrinsics.areEqual(str, SignUpViewModel.this.configuration.getCustomerInfo().getEmail()) || SignUpViewModel.this.emailHasChanged) {
                    this.L$0 = str;
                    this.label = 2;
                    if (SignUpViewModel.this.lookupEmail(str, this) != coroutine_suspended) {
                        str2 = str;
                        str = str2;
                    }
                    return coroutine_suspended;
                }
                SignUpViewModel.this.updateSignUpState(SignUpState.InputtingRemainingFields);
            } else {
                SignUpViewModel.this.updateSignUpState(SignUpState.InputtingPrimaryField);
            }
            if (!Intrinsics.areEqual(str, SignUpViewModel.this.configuration.getCustomerInfo().getEmail())) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r9.handleLookupResult((com.stripe.android.link.account.LinkAuthResult) r10, r1, r6) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lookupEmail(String str, Continuation<? super Unit> continuation) {
        C10471 c10471;
        SignUpViewModel signUpViewModel;
        if (continuation instanceof C10471) {
            c10471 = (C10471) continuation;
            if ((c10471.label & Integer.MIN_VALUE) != 0) {
                c10471.label -= Integer.MIN_VALUE;
            } else {
                c10471 = new C10471(continuation);
            }
        }
        C10471 c104712 = c10471;
        Object objLookUp = c104712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c104712.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objLookUp);
            updateSignUpState(SignUpState.VerifyingEmail);
            LinkAuth linkAuth = this.linkAuth;
            EmailSource emailSource = EmailSource.USER_ACTION;
            String customerIdForEceDefaultValues = this.configuration.getCustomerIdForEceDefaultValues();
            c104712.L$0 = this;
            c104712.label = 1;
            objLookUp = linkAuth.lookUp(str, emailSource, true, customerIdForEceDefaultValues, c104712);
            if (objLookUp != coroutine_suspended) {
                signUpViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLookUp);
            return Unit.INSTANCE;
        }
        signUpViewModel = (SignUpViewModel) c104712.L$0;
        ResultKt.throwOnFailure(objLookUp);
        signUpViewModel.updateSignUpState(SignUpState.InputtingPrimaryField);
        C10482 c10482 = signUpViewModel.new C10482(null);
        c104712.L$0 = null;
        c104712.label = 2;
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$lookupEmail$2", f = "SignUpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$lookupEmail$2, reason: invalid class name and case insensitive filesystem */
    static final class C10482 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        C10482(Continuation<? super C10482> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return SignUpViewModel.this.new C10482(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C10482) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SignUpViewModel.this.updateSignUpState(SignUpState.InputtingRemainingFields);
                SignUpViewModel.onError$default(SignUpViewModel.this, null, null, 2, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$onSignUpClick$1", f = "SignUpViewModel.kt", i = {0, 0}, l = {158, 165}, m = "invokeSuspend", n = {"$this$withDismissalDisabled$iv", "originalDismissible$iv"}, s = {"L$0", "Z$0"})
    /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$onSignUpClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C10491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        boolean Z$0;
        int label;

        C10491(Continuation<? super C10491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SignUpViewModel.this.new C10491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
        
            if (r9.this$0.handleLookupResult(r12, new com.stripe.android.link.ui.signup.SignUpViewModel.C10491.AnonymousClass2(r9.this$0, null), r9) != r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            LinkDismissalCoordinator linkDismissalCoordinator;
            Throwable th;
            boolean z;
            LinkAuth linkAuth;
            EmailSource emailSource;
            String customerIdForEceDefaultValues;
            C10491 c10491;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SignUpViewModel.this.updateState(new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$onSignUpClick$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SignUpViewModel.C10491.invokeSuspend$lambda$0((SignUpScreenState) obj2);
                    }
                });
                String value = SignUpViewModel.this.getEmailController().getFieldValue().getValue();
                LinkDismissalCoordinator linkDismissalCoordinator2 = SignUpViewModel.this.dismissalCoordinator;
                SignUpViewModel signUpViewModel = SignUpViewModel.this;
                boolean z2 = linkDismissalCoordinator2.get_canDismiss();
                linkDismissalCoordinator2.setDismissible(false);
                try {
                    linkAuth = signUpViewModel.linkAuth;
                    emailSource = EmailSource.USER_ACTION;
                    customerIdForEceDefaultValues = signUpViewModel.configuration.getCustomerIdForEceDefaultValues();
                    this.L$0 = linkDismissalCoordinator2;
                    this.Z$0 = z2;
                    this.label = 1;
                    c10491 = this;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    Object objLookUp = linkAuth.lookUp(value, emailSource, true, customerIdForEceDefaultValues, c10491);
                    if (objLookUp != coroutine_suspended) {
                        linkDismissalCoordinator = linkDismissalCoordinator2;
                        obj = objLookUp;
                        z = z2;
                        LinkAuthResult linkAuthResult = (LinkAuthResult) obj;
                        linkDismissalCoordinator.setDismissible(z);
                        c10491.L$0 = null;
                        c10491.label = 2;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    linkDismissalCoordinator = linkDismissalCoordinator2;
                    th = th;
                    z = z2;
                    linkDismissalCoordinator.setDismissible(z);
                    throw th;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            z = this.Z$0;
            linkDismissalCoordinator = (LinkDismissalCoordinator) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                c10491 = this;
            } catch (Throwable th4) {
                th = th4;
                linkDismissalCoordinator.setDismissible(z);
                throw th;
            }
            try {
                LinkAuthResult linkAuthResult2 = (LinkAuthResult) obj;
                linkDismissalCoordinator.setDismissible(z);
                c10491.L$0 = null;
                c10491.label = 2;
            } catch (Throwable th5) {
                th = th5;
                linkDismissalCoordinator.setDismissible(z);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SignUpScreenState invokeSuspend$lambda$0(SignUpScreenState signUpScreenState) {
            return SignUpScreenState.copy$default(signUpScreenState, null, false, false, false, null, true, null, 95, null);
        }

        /* compiled from: SignUpViewModel.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.link.ui.signup.SignUpViewModel$onSignUpClick$1$2", f = "SignUpViewModel.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$onSignUpClick$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SignUpViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SignUpViewModel signUpViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(1, continuation);
                this.this$0 = signUpViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.performSignup(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void onSignUpClick() {
        clearError();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10491(null), 3, null);
        updateState(new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SignUpViewModel.onSignUpClick$lambda$3((SignUpScreenState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignUpScreenState onSignUpClick$lambda$3(SignUpScreenState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SignUpScreenState.copy$default(it, null, false, false, false, null, false, null, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performSignup(Continuation<? super Unit> continuation) throws Throwable {
        C10501 c10501;
        LinkDismissalCoordinator linkDismissalCoordinator;
        Throwable th;
        boolean z;
        SignUpViewModel signUpViewModel;
        if (continuation instanceof C10501) {
            c10501 = (C10501) continuation;
            if ((c10501.label & Integer.MIN_VALUE) != 0) {
                c10501.label -= Integer.MIN_VALUE;
            } else {
                c10501 = new C10501(continuation);
            }
        }
        C10501 c105012 = c10501;
        Object obj = c105012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c105012.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkDismissalCoordinator linkDismissalCoordinator2 = this.dismissalCoordinator;
            boolean z2 = linkDismissalCoordinator2.get_canDismiss();
            linkDismissalCoordinator2.setDismissible(false);
            try {
                LinkAuth linkAuth = this.linkAuth;
                String value = this.emailController.getFieldValue().getValue();
                PhoneNumberController phoneNumberController = this.phoneNumberController;
                String e164PhoneNumber = phoneNumberController.getE164PhoneNumber(phoneNumberController.getFieldValue().getValue());
                String countryCode = this.phoneNumberController.getCountryCode();
                String value2 = this.nameController.getFieldValue().getValue();
                SignUpConsentAction signUpConsentAction = SignUpConsentAction.Implied;
                c105012.L$0 = this;
                c105012.L$1 = linkDismissalCoordinator2;
                c105012.Z$0 = z2;
                c105012.label = 1;
                Object objSignUp = linkAuth.signUp(value, e164PhoneNumber, countryCode, value2, signUpConsentAction, c105012);
                if (objSignUp == coroutine_suspended) {
                    return coroutine_suspended;
                }
                signUpViewModel = this;
                linkDismissalCoordinator = linkDismissalCoordinator2;
                obj = objSignUp;
                z = z2;
            } catch (Throwable th2) {
                linkDismissalCoordinator = linkDismissalCoordinator2;
                th = th2;
                z = z2;
                linkDismissalCoordinator.setDismissible(z);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c105012.Z$0;
            linkDismissalCoordinator = (LinkDismissalCoordinator) c105012.L$1;
            signUpViewModel = (SignUpViewModel) c105012.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                linkDismissalCoordinator.setDismissible(z);
                throw th;
            }
        }
        LinkAuthResult linkAuthResult = (LinkAuthResult) obj;
        linkDismissalCoordinator.setDismissible(z);
        if (linkAuthResult instanceof LinkAuthResult.AttestationFailed) {
            signUpViewModel.moveToWeb.invoke(((LinkAuthResult.AttestationFailed) linkAuthResult).getError());
        } else if (linkAuthResult instanceof LinkAuthResult.Error) {
            LinkAuthResult.Error error = (LinkAuthResult.Error) linkAuthResult;
            onError$default(signUpViewModel, error.getError(), null, 2, null);
            LinkEventsReporter.DefaultImpls.onSignupFailure$default(signUpViewModel.linkEventsReporter, false, error.getError(), 1, null);
        } else if (linkAuthResult instanceof LinkAuthResult.Success) {
            signUpViewModel.onAccountFetched(((LinkAuthResult.Success) linkAuthResult).getAccount());
            LinkEventsReporter.DefaultImpls.onSignupCompleted$default(signUpViewModel.linkEventsReporter, false, 1, null);
        } else if (Intrinsics.areEqual(linkAuthResult, LinkAuthResult.NoLinkAccountFound.INSTANCE)) {
            onError$default(signUpViewModel, new NoLinkAccountFoundException(), null, 2, null);
            LinkEventsReporter.DefaultImpls.onSignupFailure$default(signUpViewModel.linkEventsReporter, false, new NoLinkAccountFoundException(), 1, null);
        } else {
            if (!(linkAuthResult instanceof LinkAuthResult.AccountError)) {
                throw new NoWhenBranchMatchedException();
            }
            signUpViewModel.handle((LinkAuthResult.AccountError) linkAuthResult);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleLookupResult(LinkAuthResult linkAuthResult, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
        if (linkAuthResult instanceof LinkAuthResult.AttestationFailed) {
            this.moveToWeb.invoke(((LinkAuthResult.AttestationFailed) linkAuthResult).getError());
        } else if (linkAuthResult instanceof LinkAuthResult.Error) {
            updateSignUpState(SignUpState.InputtingRemainingFields);
            onError$default(this, ((LinkAuthResult.Error) linkAuthResult).getError(), null, 2, null);
        } else if (linkAuthResult instanceof LinkAuthResult.Success) {
            onAccountFetched(((LinkAuthResult.Success) linkAuthResult).getAccount());
            LinkEventsReporter.DefaultImpls.onSignupCompleted$default(this.linkEventsReporter, false, 1, null);
        } else {
            if (Intrinsics.areEqual(linkAuthResult, LinkAuthResult.NoLinkAccountFound.INSTANCE)) {
                Object objInvoke = function1.invoke(continuation);
                return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
            }
            if (!(linkAuthResult instanceof LinkAuthResult.AccountError)) {
                throw new NoWhenBranchMatchedException();
            }
            handle((LinkAuthResult.AccountError) linkAuthResult);
        }
        return Unit.INSTANCE;
    }

    private final void onAccountFetched(LinkAccount linkAccount) {
        LinkScreen.Verification verification;
        if (linkAccount == null || !linkAccount.getCompletedSignup()) {
            verification = (linkAccount == null || !linkAccount.getIsVerified()) ? LinkScreen.Verification.INSTANCE : LinkScreen.Wallet.INSTANCE;
        } else {
            verification = LinkScreen.PaymentMethod.INSTANCE;
        }
        if ((this.linkLaunchMode instanceof LinkLaunchMode.Authentication) && !Intrinsics.areEqual(verification, LinkScreen.Verification.INSTANCE)) {
            this.dismissWithResult.invoke(new LinkActivityResult.Completed(new LinkAccountUpdate.Value(linkAccount, null, 2, null), null, null, 4, null));
        } else {
            this.navigateAndClearStack.invoke(verification);
        }
    }

    private final void handle(LinkAuthResult.AccountError accountError) {
        updateSignUpState(SignUpState.InputtingPrimaryField);
        onError(accountError.getError(), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_signup_deactivated_account_message));
    }

    static /* synthetic */ void onError$default(SignUpViewModel signUpViewModel, Throwable th, ResolvableString resolvableString, int i, Object obj) {
        if ((i & 2) != 0) {
            resolvableString = th != null ? ExceptionKtKt.stripeErrorMessage(th) : null;
        }
        signUpViewModel.onError(th, resolvableString);
    }

    private final void onError(Throwable error, final ResolvableString errorMessage) {
        if (error != null) {
            this.logger.error("SignUpViewModel Error: ", error);
        }
        updateState(new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SignUpViewModel.onError$lambda$5(errorMessage, (SignUpScreenState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignUpScreenState onError$lambda$5(ResolvableString resolvableString, SignUpScreenState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SignUpScreenState.copy$default(it, null, false, false, false, null, false, resolvableString, 63, null);
    }

    private final void clearError() {
        updateState(new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SignUpViewModel.clearError$lambda$6((SignUpScreenState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignUpScreenState clearError$lambda$6(SignUpScreenState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SignUpScreenState.copy$default(it, null, false, false, false, null, false, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(Function1<? super SignUpScreenState, SignUpScreenState> produceValue) {
        SignUpScreenState value;
        MutableStateFlow<SignUpScreenState> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, produceValue.invoke(value)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSignUpState(final SignUpState signUpState) {
        updateState(new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SignUpViewModel.updateSignUpState$lambda$7(signUpState, (SignUpScreenState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SignUpScreenState updateSignUpState$lambda$7(SignUpState signUpState, SignUpScreenState old) {
        Intrinsics.checkNotNullParameter(old, "old");
        return SignUpScreenState.copy$default(old, null, false, false, false, signUpState, false, null, 111, null);
    }

    /* compiled from: SignUpViewModel.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0010R\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;", "", "<init>", "()V", "LOOKUP_DEBOUNCE", "Lkotlin/time/Duration;", "getLOOKUP_DEBOUNCE-UwyO8pc$paymentsheet_release", "()J", "J", "USE_LINK_CONFIGURATION_CUSTOMER_INFO", "", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/link/injection/NativeLinkComponent;", "navigateAndClearStack", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkScreen;", "", "moveToWeb", "", "dismissWithResult", "Lcom/stripe/android/link/LinkActivityResult;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getLOOKUP_DEBOUNCE-UwyO8pc$paymentsheet_release, reason: not valid java name */
        public final long m7914getLOOKUP_DEBOUNCEUwyO8pc$paymentsheet_release() {
            return SignUpViewModel.LOOKUP_DEBOUNCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SignUpViewModel factory$lambda$1$lambda$0(NativeLinkComponent nativeLinkComponent, Function1 function1, Function1 function12, Function1 function13, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new SignUpViewModel(nativeLinkComponent.getConfiguration(), nativeLinkComponent.getLinkEventsReporter(), nativeLinkComponent.getLogger(), nativeLinkComponent.getLinkAuth(), nativeLinkComponent.getSavedStateHandle(), nativeLinkComponent.getDismissalCoordinator(), function1, function12, nativeLinkComponent.getLinkLaunchMode(), function13);
        }

        public final ViewModelProvider.Factory factory(final NativeLinkComponent parentComponent, final Function1<? super LinkScreen, Unit> navigateAndClearStack, final Function1<? super Throwable, Unit> moveToWeb, final Function1<? super LinkActivityResult, Unit> dismissWithResult) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            Intrinsics.checkNotNullParameter(navigateAndClearStack, "navigateAndClearStack");
            Intrinsics.checkNotNullParameter(moveToWeb, "moveToWeb");
            Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(SignUpViewModel.class), new Function1() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SignUpViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, navigateAndClearStack, moveToWeb, dismissWithResult, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        LOOKUP_DEBOUNCE = DurationKt.toDuration(1, DurationUnit.SECONDS);
    }
}
