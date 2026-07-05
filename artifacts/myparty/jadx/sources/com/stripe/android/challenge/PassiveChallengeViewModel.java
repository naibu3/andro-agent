package com.stripe.android.challenge;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.stripe.android.challenge.PassiveChallengeActivityResult;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.hcaptcha.HCaptchaService;
import com.stripe.android.model.PassiveCaptchaParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: PassiveChallengeViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/challenge/PassiveChallengeViewModel;", "Landroidx/lifecycle/ViewModel;", "passiveCaptchaParams", "Lcom/stripe/android/model/PassiveCaptchaParams;", "hCaptchaService", "Lcom/stripe/android/hcaptcha/HCaptchaService;", "<init>", "(Lcom/stripe/android/model/PassiveCaptchaParams;Lcom/stripe/android/hcaptcha/HCaptchaService;)V", "_result", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/challenge/PassiveChallengeActivityResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlinx/coroutines/flow/Flow;", "getResult", "()Lkotlinx/coroutines/flow/Flow;", "startPassiveChallenge", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NoArgsException", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PassiveChallengeViewModel extends ViewModel {
    private static final ViewModelProvider.Factory Factory;
    private final MutableSharedFlow<PassiveChallengeActivityResult> _result;
    private final HCaptchaService hCaptchaService;
    private final PassiveCaptchaParams passiveCaptchaParams;
    private final Flow<PassiveChallengeActivityResult> result;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PassiveChallengeViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.challenge.PassiveChallengeViewModel", f = "PassiveChallengeViewModel.kt", i = {0}, l = {23, 30, 35}, m = "startPassiveChallenge", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.challenge.PassiveChallengeViewModel$startPassiveChallenge$1, reason: invalid class name */
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
            return PassiveChallengeViewModel.this.startPassiveChallenge(null, this);
        }
    }

    @Inject
    public PassiveChallengeViewModel(PassiveCaptchaParams passiveCaptchaParams, HCaptchaService hCaptchaService) {
        Intrinsics.checkNotNullParameter(passiveCaptchaParams, "passiveCaptchaParams");
        Intrinsics.checkNotNullParameter(hCaptchaService, "hCaptchaService");
        this.passiveCaptchaParams = passiveCaptchaParams;
        this.hCaptchaService = hCaptchaService;
        MutableSharedFlow<PassiveChallengeActivityResult> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._result = mutableSharedFlowMutableSharedFlow$default;
        this.result = mutableSharedFlowMutableSharedFlow$default;
    }

    public final Flow<PassiveChallengeActivityResult> getResult() {
        return this.result;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r8.emit(r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r8.emit(r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startPassiveChallenge(FragmentActivity fragmentActivity, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        PassiveChallengeViewModel passiveChallengeViewModel;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objPerformPassiveHCaptcha = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objPerformPassiveHCaptcha);
            HCaptchaService hCaptchaService = this.hCaptchaService;
            String siteKey = this.passiveCaptchaParams.getSiteKey();
            String rqData = this.passiveCaptchaParams.getRqData();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objPerformPassiveHCaptcha = hCaptchaService.performPassiveHCaptcha(fragmentActivity, siteKey, rqData, anonymousClass1);
            if (objPerformPassiveHCaptcha != coroutine_suspended) {
                passiveChallengeViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(objPerformPassiveHCaptcha);
                return Unit.INSTANCE;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPerformPassiveHCaptcha);
            return Unit.INSTANCE;
        }
        passiveChallengeViewModel = (PassiveChallengeViewModel) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objPerformPassiveHCaptcha);
        HCaptchaService.Result result = (HCaptchaService.Result) objPerformPassiveHCaptcha;
        if (result instanceof HCaptchaService.Result.Failure) {
            MutableSharedFlow<PassiveChallengeActivityResult> mutableSharedFlow = passiveChallengeViewModel._result;
            PassiveChallengeActivityResult.Failed failed = new PassiveChallengeActivityResult.Failed(((HCaptchaService.Result.Failure) result).getError());
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 2;
        } else {
            if (!(result instanceof HCaptchaService.Result.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            MutableSharedFlow<PassiveChallengeActivityResult> mutableSharedFlow2 = passiveChallengeViewModel._result;
            PassiveChallengeActivityResult.Success success = new PassiveChallengeActivityResult.Success(((HCaptchaService.Result.Success) result).getToken());
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 3;
        }
        return coroutine_suspended;
    }

    /* compiled from: PassiveChallengeViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/challenge/PassiveChallengeViewModel$NoArgsException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoArgsException extends IllegalArgumentException {
        public static final int $stable = 0;

        public NoArgsException() {
            super("No args found");
        }
    }

    /* compiled from: PassiveChallengeViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/challenge/PassiveChallengeViewModel$Companion;", "", "<init>", "()V", "Factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ViewModelProvider.Factory getFactory() {
            return PassiveChallengeViewModel.Factory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PassiveChallengeViewModel Factory$lambda$1$lambda$0(CreationExtras initializer) {
        Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
        PassiveChallengeArgs args$paymentsheet_release = PassiveChallengeActivity.INSTANCE.getArgs$paymentsheet_release(SavedStateHandleSupport.createSavedStateHandle(initializer));
        if (args$paymentsheet_release == null) {
            throw new NoArgsException();
        }
        return DaggerPassiveChallengeComponent.builder().passiveCaptchaParams(args$paymentsheet_release.getPassiveCaptchaParams()).build().getPassiveChallengeViewModel();
    }

    static {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(PassiveChallengeViewModel.class), new Function1() { // from class: com.stripe.android.challenge.PassiveChallengeViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PassiveChallengeViewModel.Factory$lambda$1$lambda$0((CreationExtras) obj);
            }
        });
        Factory = initializerViewModelFactoryBuilder.build();
    }
}
