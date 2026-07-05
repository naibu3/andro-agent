package com.stripe.android.link.verification;

import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.verification.VerificationViewState;
import com.stripe.android.link.ui.wallet.DefaultPaymentUIKt;
import com.stripe.android.link.utils.ErrorsKt;
import com.stripe.android.link.verification.DefaultLinkInlineInteractor;
import com.stripe.android.link.verification.VerificationState;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.ui.core.elements.OTPSpec;
import com.stripe.android.uicore.elements.OTPElement;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DefaultLinkInlineInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ!\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020 *\u00020#2\u0006\u0010&\u001a\u00020'H\u0002J\u001c\u0010(\u001a\u00020\u00182\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140*H\u0002J\u001c\u0010+\u001a\u00020\u00182\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0*H\u0002J\f\u0010\u001c\u001a\u00020\u001d*\u00020 H\u0002J\u0006\u0010-\u001a\u00020\u0018J\b\u0010.\u001a\u00020\u0018H\u0016J\b\u0010/\u001a\u00020\u0018H\u0016J\b\u00100\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00062"}, d2 = {"Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;", "Lcom/stripe/android/link/verification/LinkInlineInteractor;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "linkLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "logger", "Lcom/stripe/android/core/Logger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;)V", "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "getOtpElement", "()Lcom/stripe/android/uicore/elements/OTPElement;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/link/verification/LinkInlineState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "setup", "", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "observeOtp", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "onConfirmationResult", "verificationState", "Lcom/stripe/android/link/verification/VerificationState$Render2FA;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlin/Result;", "Lcom/stripe/android/link/model/LinkAccount;", "(Lcom/stripe/android/link/verification/VerificationState$Render2FA;Ljava/lang/Object;)V", "initial2FAState", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "updateState", "block", "Lkotlin/Function1;", "update2FAState", "Lcom/stripe/android/link/ui/verification/VerificationViewState;", "onLinkResult", "resendCode", "didShowCodeSentNotification", "startVerification", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkInlineInteractor implements LinkInlineInteractor {
    private static final String LINK_EMBEDDED_STATE_KEY = "LINK_EMBEDDED_STATE_KEY";
    private final CoroutineScope coroutineScope;
    private final LinkConfigurationCoordinator linkConfigurationCoordinator;
    private final LinkPaymentLauncher linkLauncher;
    private final Logger logger;
    private final OTPElement otpElement;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow<LinkInlineState> state;
    public static final int $stable = 8;

    @Inject
    public DefaultLinkInlineInteractor(CoroutineScope coroutineScope, LinkConfigurationCoordinator linkConfigurationCoordinator, @Named(DefaultFlowController.WALLETS_BUTTON_LINK_LAUNCHER) LinkPaymentLauncher linkLauncher, Logger logger, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        Intrinsics.checkNotNullParameter(linkLauncher, "linkLauncher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.coroutineScope = coroutineScope;
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        this.linkLauncher = linkLauncher;
        this.logger = logger;
        this.savedStateHandle = savedStateHandle;
        this.otpElement = OTPSpec.INSTANCE.transform();
        this.state = savedStateHandle.getStateFlow(LINK_EMBEDDED_STATE_KEY, new LinkInlineState(VerificationState.Loading.INSTANCE));
    }

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public OTPElement getOtpElement() {
        return this.otpElement;
    }

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public StateFlow<LinkInlineState> getState() {
        return this.state;
    }

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public void setup(PaymentMethodMetadata paymentMethodMetadata) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        LinkState linkState = paymentMethodMetadata.getLinkState();
        final LinkConfiguration configuration = linkState != null ? linkState.getConfiguration() : null;
        if (configuration == null) {
            updateState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultLinkInlineInteractor.setup$lambda$0((LinkInlineState) obj);
                }
            });
            return;
        }
        if (!this.linkConfigurationCoordinator.linkGate(configuration).getUseInlineOtpInWalletButtons()) {
            updateState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultLinkInlineInteractor.setup$lambda$1((LinkInlineState) obj);
                }
            });
            return;
        }
        LinkAccountManager linkAccountManager$paymentsheet_release = this.linkConfigurationCoordinator.getComponent(configuration).getLinkAccountManager$paymentsheet_release();
        final LinkAccount account = linkAccountManager$paymentsheet_release.getLinkAccountInfo().getValue().getAccount();
        if (account == null || account.getAccountStatus() != AccountStatus.NeedsVerification) {
            updateState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultLinkInlineInteractor.setup$lambda$2((LinkInlineState) obj);
                }
            });
            return;
        }
        updateState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultLinkInlineInteractor.setup$lambda$3(this.f$0, account, configuration, (LinkInlineState) obj);
            }
        });
        observeOtp(linkAccountManager$paymentsheet_release);
        startVerification();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkInlineState setup$lambda$0(LinkInlineState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.copy(VerificationState.RenderButton.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkInlineState setup$lambda$1(LinkInlineState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.copy(VerificationState.RenderButton.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkInlineState setup$lambda$2(LinkInlineState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.copy(VerificationState.RenderButton.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkInlineState setup$lambda$3(DefaultLinkInlineInteractor defaultLinkInlineInteractor, LinkAccount linkAccount, LinkConfiguration linkConfiguration, LinkInlineState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.copy(defaultLinkInlineInteractor.initial2FAState(linkAccount, linkConfiguration));
    }

    /* compiled from: DefaultLinkInlineInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.verification.DefaultLinkInlineInteractor$observeOtp$1", f = "DefaultLinkInlineInteractor.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.verification.DefaultLinkInlineInteractor$observeOtp$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkAccountManager $linkAccountManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LinkAccountManager linkAccountManager, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$linkAccountManager = linkAccountManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultLinkInlineInteractor.this.new AnonymousClass1(this.$linkAccountManager, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DefaultLinkInlineInteractor.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.link.verification.DefaultLinkInlineInteractor$observeOtp$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01851<T> implements FlowCollector {
            final /* synthetic */ LinkAccountManager $linkAccountManager;
            final /* synthetic */ DefaultLinkInlineInteractor this$0;

            C01851(DefaultLinkInlineInteractor defaultLinkInlineInteractor, LinkAccountManager linkAccountManager) {
                this.this$0 = defaultLinkInlineInteractor;
                this.$linkAccountManager = linkAccountManager;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((String) obj, (Continuation<? super Unit>) continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(String str, Continuation<? super Unit> continuation) {
                DefaultLinkInlineInteractor$observeOtp$1$1$emit$1 defaultLinkInlineInteractor$observeOtp$1$1$emit$1;
                Object value;
                VerificationState verificationState;
                C01851<T> c01851;
                if (continuation instanceof DefaultLinkInlineInteractor$observeOtp$1$1$emit$1) {
                    defaultLinkInlineInteractor$observeOtp$1$1$emit$1 = (DefaultLinkInlineInteractor$observeOtp$1$1$emit$1) continuation;
                    if ((defaultLinkInlineInteractor$observeOtp$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                        defaultLinkInlineInteractor$observeOtp$1$1$emit$1.label -= Integer.MIN_VALUE;
                    } else {
                        defaultLinkInlineInteractor$observeOtp$1$1$emit$1 = new DefaultLinkInlineInteractor$observeOtp$1$1$emit$1(this, continuation);
                    }
                }
                Object obj = defaultLinkInlineInteractor$observeOtp$1$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = defaultLinkInlineInteractor$observeOtp$1$1$emit$1.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    VerificationState verificationState2 = this.this$0.getState().getValue().getVerificationState();
                    if ((verificationState2 instanceof VerificationState.Render2FA) && !((VerificationState.Render2FA) verificationState2).getViewState().isProcessing()) {
                        this.this$0.update2FAState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$observeOtp$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return DefaultLinkInlineInteractor.AnonymousClass1.C01851.emit$lambda$0((VerificationViewState) obj2);
                            }
                        });
                        LinkAccountManager linkAccountManager = this.$linkAccountManager;
                        defaultLinkInlineInteractor$observeOtp$1$1$emit$1.L$0 = this;
                        defaultLinkInlineInteractor$observeOtp$1$1$emit$1.L$1 = verificationState2;
                        defaultLinkInlineInteractor$observeOtp$1$1$emit$1.label = 1;
                        Object objMo7705confirmVerificationgIAlus = linkAccountManager.mo7705confirmVerificationgIAlus(str, defaultLinkInlineInteractor$observeOtp$1$1$emit$1);
                        if (objMo7705confirmVerificationgIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        value = objMo7705confirmVerificationgIAlus;
                        verificationState = verificationState2;
                        c01851 = this;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                verificationState = (VerificationState) defaultLinkInlineInteractor$observeOtp$1$1$emit$1.L$1;
                c01851 = (C01851) defaultLinkInlineInteractor$observeOtp$1$1$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
                c01851.this$0.onConfirmationResult((VerificationState.Render2FA) verificationState, value);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final VerificationViewState emit$lambda$0(VerificationViewState viewState) {
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                return VerificationViewState.copy$default(viewState, true, false, null, false, false, null, null, false, false, null, PointerIconCompat.TYPE_ZOOM_IN, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DefaultLinkInlineInteractor.this.getOtpElement().getOtpCompleteFlow().collect(new C01851(DefaultLinkInlineInteractor.this, this.$linkAccountManager), this) == coroutine_suspended) {
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

    public final void observeOtp(LinkAccountManager linkAccountManager) {
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass1(linkAccountManager, null), 3, null);
    }

    public final void onConfirmationResult(VerificationState.Render2FA verificationState, Object result) {
        Intrinsics.checkNotNullParameter(verificationState, "verificationState");
        if (Result.m9125isSuccessimpl(result)) {
            this.linkLauncher.present(verificationState.getLinkConfiguration(), linkAccountManager(verificationState).getLinkAccountInfo().getValue(), new LinkLaunchMode.PaymentMethodSelection(null, false, null, 6, null), LinkExpressMode.ENABLED);
        }
        final Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(result);
        if (thM9121exceptionOrNullimpl != null) {
            update2FAState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultLinkInlineInteractor.onConfirmationResult$lambda$6$lambda$5(thM9121exceptionOrNullimpl, (VerificationViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState onConfirmationResult$lambda$6$lambda$5(Throwable th, VerificationViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return VerificationViewState.copy$default(viewState, false, false, ErrorsKt.getErrorMessage(th), false, false, null, null, false, false, null, PointerIconCompat.TYPE_ZOOM_IN, null);
    }

    private final VerificationState.Render2FA initial2FAState(LinkAccount linkAccount, LinkConfiguration linkConfiguration) {
        String email = linkAccount.getEmail();
        String redactedPhoneNumber = linkAccount.getRedactedPhoneNumber();
        DisplayablePaymentDetails displayablePaymentDetails = linkAccount.getDisplayablePaymentDetails();
        return new VerificationState.Render2FA(new VerificationViewState(false, false, null, false, false, redactedPhoneNumber, email, true, true, displayablePaymentDetails != null ? DefaultPaymentUIKt.toDefaultPaymentUI(displayablePaymentDetails, linkConfiguration.getEnableDisplayableDefaultValuesInEce()) : null), linkConfiguration);
    }

    private final void updateState(Function1<? super LinkInlineState, LinkInlineState> block) {
        this.savedStateHandle.set(LINK_EMBEDDED_STATE_KEY, block.invoke(getState().getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void update2FAState(Function1<? super VerificationViewState, VerificationViewState> block) {
        VerificationState verificationState = getState().getValue().getVerificationState();
        if (verificationState instanceof VerificationState.Render2FA) {
            VerificationState.Render2FA render2FA = (VerificationState.Render2FA) verificationState;
            final VerificationState.Render2FA render2FACopy$default = VerificationState.Render2FA.copy$default(render2FA, block.invoke(render2FA.getViewState()), null, 2, null);
            updateState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultLinkInlineInteractor.update2FAState$lambda$7(render2FACopy$default, (LinkInlineState) obj);
                }
            });
        } else {
            Logger.DefaultImpls.error$default(this.logger, "Expected Render2FA state but found " + Reflection.getOrCreateKotlinClass(verificationState.getClass()).getSimpleName() + ". Resetting to RenderButton.", null, 2, null);
            updateState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultLinkInlineInteractor.update2FAState$lambda$8((LinkInlineState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkInlineState update2FAState$lambda$7(VerificationState.Render2FA render2FA, LinkInlineState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.copy(render2FA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkInlineState update2FAState$lambda$8(LinkInlineState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.copy(VerificationState.RenderButton.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkAccountManager linkAccountManager(VerificationState.Render2FA render2FA) {
        return this.linkConfigurationCoordinator.getComponent(render2FA.getLinkConfiguration()).getLinkAccountManager$paymentsheet_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkInlineState onLinkResult$lambda$9(LinkInlineState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.copy(VerificationState.RenderButton.INSTANCE);
    }

    public final void onLinkResult() {
        updateState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultLinkInlineInteractor.onLinkResult$lambda$9((LinkInlineState) obj);
            }
        });
    }

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public void resendCode() {
        getOtpElement().getController().reset();
        update2FAState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultLinkInlineInteractor.resendCode$lambda$10((VerificationViewState) obj);
            }
        });
        startVerification();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState resendCode$lambda$10(VerificationViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return VerificationViewState.copy$default(viewState, false, false, null, true, false, null, null, false, false, null, PointerIconCompat.TYPE_COPY, null);
    }

    @Override // com.stripe.android.link.verification.LinkInlineInteractor
    public void didShowCodeSentNotification() {
        update2FAState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultLinkInlineInteractor.didShowCodeSentNotification$lambda$11((VerificationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState didShowCodeSentNotification$lambda$11(VerificationViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return VerificationViewState.copy$default(viewState, false, false, null, false, false, null, null, false, false, null, PointerIconCompat.TYPE_CROSSHAIR, null);
    }

    private final void startVerification() {
        update2FAState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultLinkInlineInteractor.startVerification$lambda$12((VerificationViewState) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState startVerification$lambda$12(VerificationViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        return VerificationViewState.copy$default(viewState, false, false, null, false, false, null, null, false, false, null, PointerIconCompat.TYPE_ZOOM_OUT, null);
    }

    /* compiled from: DefaultLinkInlineInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.verification.DefaultLinkInlineInteractor$startVerification$2", f = "DefaultLinkInlineInteractor.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.verification.DefaultLinkInlineInteractor$startVerification$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultLinkInlineInteractor.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo7721startVerificationIoAF18A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VerificationState verificationState = DefaultLinkInlineInteractor.this.getState().getValue().getVerificationState();
                if (verificationState instanceof VerificationState.Render2FA) {
                    this.label = 1;
                    objMo7721startVerificationIoAF18A = DefaultLinkInlineInteractor.this.linkAccountManager((VerificationState.Render2FA) verificationState).mo7721startVerificationIoAF18A(this);
                    if (objMo7721startVerificationIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo7721startVerificationIoAF18A = ((Result) obj).getValue();
            final Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7721startVerificationIoAF18A);
            DefaultLinkInlineInteractor.this.update2FAState(new Function1() { // from class: com.stripe.android.link.verification.DefaultLinkInlineInteractor$startVerification$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DefaultLinkInlineInteractor.AnonymousClass2.invokeSuspend$lambda$0(thM9121exceptionOrNullimpl, (VerificationViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VerificationViewState invokeSuspend$lambda$0(Throwable th, VerificationViewState verificationViewState) {
            return VerificationViewState.copy$default(verificationViewState, false, false, th != null ? ErrorsKt.getErrorMessage(th) : null, false, verificationViewState.isSendingNewCode() && th == null, null, null, false, false, null, 995, null);
        }
    }
}
