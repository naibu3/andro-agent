package com.stripe.android.link.ui.verification;

import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.stripe.android.core.Logger;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAccountUtilKt;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import com.stripe.android.link.utils.ErrorsKt;
import com.stripe.android.ui.core.elements.OTPSpec;
import com.stripe.android.uicore.elements.OTPElement;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: VerificationViewModel.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0001\u0018\u0000 52\u00020\u0001:\u00015Bw\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010%\u001a\u00020\u0010H\u0002J\u0016\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020$H\u0086@¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0010H\u0002J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020\u0010J\u0006\u0010-\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\b\u0010/\u001a\u00020\u0010H\u0002J\u0010\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u000202H\u0002J\u001c\u00103\u001a\u00020\u00102\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/stripe/android/link/ui/verification/VerificationViewModel;", "Landroidx/lifecycle/ViewModel;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "logger", "Lcom/stripe/android/core/Logger;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "isDialog", "", "onVerificationSucceeded", "Lkotlin/Function0;", "", "onChangeEmailRequested", "onDismissClicked", "dismissWithResult", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkActivityResult;", "<init>", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkLaunchMode;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/ui/verification/VerificationViewState;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "getOtpElement", "()Lcom/stripe/android/uicore/elements/OTPElement;", "otpCode", "", "setUp", "onVerificationCodeEntered", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startVerification", "resendCode", "didShowCodeSentNotification", "onBack", "onChangeEmailButtonClicked", "onFocusRequested", "clearError", "onError", "error", "", "updateViewState", "block", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationViewModel extends ViewModel {
    private final MutableStateFlow<VerificationViewState> _viewState;
    private final Function1<LinkActivityResult, Unit> dismissWithResult;
    private final boolean isDialog;
    private final LinkAccount linkAccount;
    private final LinkAccountManager linkAccountManager;
    private final LinkEventsReporter linkEventsReporter;
    private final LinkLaunchMode linkLaunchMode;
    private final Logger logger;
    private final Function0<Unit> onChangeEmailRequested;
    private final Function0<Unit> onDismissClicked;
    private final Function0<Unit> onVerificationSucceeded;
    private final StateFlow<String> otpCode;
    private final OTPElement otpElement;
    private final StateFlow<VerificationViewState> viewState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: VerificationViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.verification.VerificationViewModel", f = "VerificationViewModel.kt", i = {0}, l = {88}, m = "onVerificationCodeEntered", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$onVerificationCodeEntered$1, reason: invalid class name and case insensitive filesystem */
    static final class C10521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10521(Continuation<? super C10521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VerificationViewModel.this.onVerificationCodeEntered(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public VerificationViewModel(LinkAccount linkAccount, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Logger logger, LinkLaunchMode linkLaunchMode, boolean z, Function0<Unit> onVerificationSucceeded, Function0<Unit> onChangeEmailRequested, Function0<Unit> onDismissClicked, Function1<? super LinkActivityResult, Unit> dismissWithResult) {
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(linkLaunchMode, "linkLaunchMode");
        Intrinsics.checkNotNullParameter(onVerificationSucceeded, "onVerificationSucceeded");
        Intrinsics.checkNotNullParameter(onChangeEmailRequested, "onChangeEmailRequested");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
        this.linkAccount = linkAccount;
        this.linkAccountManager = linkAccountManager;
        this.linkEventsReporter = linkEventsReporter;
        this.logger = logger;
        this.linkLaunchMode = linkLaunchMode;
        this.isDialog = z;
        this.onVerificationSucceeded = onVerificationSucceeded;
        this.onChangeEmailRequested = onChangeEmailRequested;
        this.onDismissClicked = onDismissClicked;
        this.dismissWithResult = dismissWithResult;
        MutableStateFlow<VerificationViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(new VerificationViewState(false, true, null, false, false, linkAccount.getRedactedPhoneNumber(), linkAccount.getEmail(), z, !z || (linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection), null));
        this._viewState = MutableStateFlow;
        this.viewState = MutableStateFlow;
        OTPElement oTPElementTransform = OTPSpec.INSTANCE.transform();
        this.otpElement = oTPElementTransform;
        this.otpCode = FlowKt.stateIn(oTPElementTransform.getOtpCompleteFlow(), ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getLazily(), null);
        setUp();
    }

    public final StateFlow<VerificationViewState> getViewState() {
        return this.viewState;
    }

    public final OTPElement getOtpElement() {
        return this.otpElement;
    }

    private final void setUp() {
        if (this.linkAccount.getAccountStatus() != AccountStatus.VerificationStarted) {
            startVerification();
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10531(null), 3, null);
    }

    /* compiled from: VerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.verification.VerificationViewModel$setUp$1", f = "VerificationViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$setUp$1, reason: invalid class name and case insensitive filesystem */
    static final class C10531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10531(Continuation<? super C10531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VerificationViewModel.this.new C10531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = VerificationViewModel.this.otpCode;
                final VerificationViewModel verificationViewModel = VerificationViewModel.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel.setUp.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        Object objOnVerificationCodeEntered;
                        return (str == null || (objOnVerificationCodeEntered = verificationViewModel.onVerificationCodeEntered(str, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objOnVerificationCodeEntered;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onVerificationCodeEntered(String str, Continuation<? super Unit> continuation) {
        C10521 c10521;
        Object objMo7705confirmVerificationgIAlus;
        VerificationViewModel verificationViewModel;
        if (continuation instanceof C10521) {
            c10521 = (C10521) continuation;
            if ((c10521.label & Integer.MIN_VALUE) != 0) {
                c10521.label -= Integer.MIN_VALUE;
            } else {
                c10521 = new C10521(continuation);
            }
        }
        Object obj = c10521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10521.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            updateViewState(new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return VerificationViewModel.onVerificationCodeEntered$lambda$0((VerificationViewState) obj2);
                }
            });
            LinkAccountManager linkAccountManager = this.linkAccountManager;
            c10521.L$0 = this;
            c10521.label = 1;
            objMo7705confirmVerificationgIAlus = linkAccountManager.mo7705confirmVerificationgIAlus(str, c10521);
            if (objMo7705confirmVerificationgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            verificationViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            verificationViewModel = (VerificationViewModel) c10521.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7705confirmVerificationgIAlus = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7705confirmVerificationgIAlus);
        if (thM9121exceptionOrNullimpl == null) {
            verificationViewModel.updateViewState(new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return VerificationViewModel.onVerificationCodeEntered$lambda$2$lambda$1((VerificationViewState) obj2);
                }
            });
            if (verificationViewModel.linkLaunchMode instanceof LinkLaunchMode.Authentication) {
                verificationViewModel.dismissWithResult.invoke(new LinkActivityResult.Completed(LinkAccountUtilKt.getLinkAccountUpdate(verificationViewModel.linkAccountManager), null, null, 4, null));
            } else {
                verificationViewModel.onVerificationSucceeded.invoke();
            }
        } else {
            verificationViewModel.otpElement.getController().reset();
            verificationViewModel.onError(thM9121exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState onVerificationCodeEntered$lambda$0(VerificationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VerificationViewState.copy$default(it, true, false, null, false, false, null, null, false, false, null, PointerIconCompat.TYPE_ZOOM_IN, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState onVerificationCodeEntered$lambda$2$lambda$1(VerificationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VerificationViewState.copy$default(it, false, false, null, false, false, null, null, false, false, null, 1022, null);
    }

    private final void startVerification() {
        updateViewState(new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerificationViewModel.startVerification$lambda$4((VerificationViewState) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState startVerification$lambda$4(VerificationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VerificationViewState.copy$default(it, false, false, null, false, false, null, null, false, false, null, PointerIconCompat.TYPE_ZOOM_OUT, null);
    }

    /* compiled from: VerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.verification.VerificationViewModel$startVerification$2", f = "VerificationViewModel.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$startVerification$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VerificationViewModel.this.new AnonymousClass2(continuation);
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
                this.label = 1;
                objMo7721startVerificationIoAF18A = VerificationViewModel.this.linkAccountManager.mo7721startVerificationIoAF18A(this);
                if (objMo7721startVerificationIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo7721startVerificationIoAF18A = ((Result) obj).getValue();
            }
            final Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7721startVerificationIoAF18A);
            VerificationViewModel.this.updateViewState(new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$startVerification$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return VerificationViewModel.AnonymousClass2.invokeSuspend$lambda$0(thM9121exceptionOrNullimpl, (VerificationViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VerificationViewState invokeSuspend$lambda$0(Throwable th, VerificationViewState verificationViewState) {
            return VerificationViewState.copy$default(verificationViewState, false, false, th != null ? ErrorsKt.getErrorMessage(th) : null, false, verificationViewState.isSendingNewCode() && th == null, null, null, false, false, null, 995, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState resendCode$lambda$5(VerificationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VerificationViewState.copy$default(it, false, false, null, true, false, null, null, false, false, null, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, null);
    }

    public final void resendCode() {
        updateViewState(new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerificationViewModel.resendCode$lambda$5((VerificationViewState) obj);
            }
        });
        startVerification();
    }

    public final void didShowCodeSentNotification() {
        updateViewState(new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerificationViewModel.didShowCodeSentNotification$lambda$6((VerificationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState didShowCodeSentNotification$lambda$6(VerificationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VerificationViewState.copy$default(it, false, false, null, false, false, null, null, false, false, null, PointerIconCompat.TYPE_CROSSHAIR, null);
    }

    public final void onBack() {
        clearError();
        this.onDismissClicked.invoke();
        this.linkEventsReporter.on2FACancel();
    }

    public final void onChangeEmailButtonClicked() {
        clearError();
        this.onChangeEmailRequested.invoke();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: VerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.verification.VerificationViewModel$onChangeEmailButtonClicked$1", f = "VerificationViewModel.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.verification.VerificationViewModel$onChangeEmailButtonClicked$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VerificationViewModel.this.new AnonymousClass1(continuation);
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
                if (VerificationViewModel.this.linkAccountManager.mo7713logOutIoAF18A(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    public final void onFocusRequested() {
        updateViewState(new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerificationViewModel.onFocusRequested$lambda$7((VerificationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState onFocusRequested$lambda$7(VerificationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VerificationViewState.copy$default(it, false, false, null, false, false, null, null, false, false, null, PointerIconCompat.TYPE_GRABBING, null);
    }

    private final void clearError() {
        updateViewState(new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerificationViewModel.clearError$lambda$8((VerificationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState clearError$lambda$8(VerificationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VerificationViewState.copy$default(it, false, false, null, false, false, null, null, false, false, null, PointerIconCompat.TYPE_ZOOM_OUT, null);
    }

    private final void onError(Throwable error) {
        final ResolvableString errorMessage = ErrorsKt.getErrorMessage(error);
        this.logger.error("VerificationViewModel Error: ", error);
        updateViewState(new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerificationViewModel.onError$lambda$10$lambda$9(errorMessage, (VerificationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState onError$lambda$10$lambda$9(ResolvableString resolvableString, VerificationViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return VerificationViewState.copy$default(it, false, false, resolvableString, false, false, null, null, false, false, null, PointerIconCompat.TYPE_ZOOM_IN, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewState(Function1<? super VerificationViewState, VerificationViewState> block) {
        VerificationViewState value;
        MutableStateFlow<VerificationViewState> mutableStateFlow = this._viewState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, block.invoke(value)));
    }

    /* compiled from: VerificationViewModel.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/link/injection/NativeLinkComponent;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "isDialog", "", "onVerificationSucceeded", "Lkotlin/Function0;", "", "onChangeEmailClicked", "onDismissClicked", "dismissWithResult", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkActivityResult;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VerificationViewModel factory$lambda$1$lambda$0(NativeLinkComponent nativeLinkComponent, LinkAccount linkAccount, boolean z, Function0 function0, Function0 function02, Function0 function03, Function1 function1, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new VerificationViewModel(linkAccount, nativeLinkComponent.getLinkAccountManager(), nativeLinkComponent.getLinkEventsReporter(), nativeLinkComponent.getLogger(), nativeLinkComponent.getLinkLaunchMode(), z, function0, function02, function03, function1);
        }

        public final ViewModelProvider.Factory factory(final NativeLinkComponent parentComponent, final LinkAccount linkAccount, final boolean isDialog, final Function0<Unit> onVerificationSucceeded, final Function0<Unit> onChangeEmailClicked, final Function0<Unit> onDismissClicked, final Function1<? super LinkActivityResult, Unit> dismissWithResult) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
            Intrinsics.checkNotNullParameter(onVerificationSucceeded, "onVerificationSucceeded");
            Intrinsics.checkNotNullParameter(onChangeEmailClicked, "onChangeEmailClicked");
            Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
            Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(VerificationViewModel.class), new Function1() { // from class: com.stripe.android.link.ui.verification.VerificationViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VerificationViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, linkAccount, isDialog, onVerificationSucceeded, onChangeEmailClicked, onDismissClicked, dismissWithResult, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
