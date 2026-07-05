package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.Stripe3ds2TransactionLayoutBinding;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.threeds2.NextStep;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.views.ChallengeProgressFragmentFactory;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: Stripe3ds2TransactionActivity.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewBinding", "Lcom/stripe/android/databinding/Stripe3ds2TransactionLayoutBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/Stripe3ds2TransactionLayoutBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", CardScanActivity.ARGS, "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "getArgs", "()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "setArgs", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$payments_core_release$annotations", "getViewModelFactory$payments_core_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$payments_core_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finishWithResult", "paymentFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "payments-core_release", "viewModel", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public Stripe3ds2TransactionContract.Args args;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Stripe3ds2TransactionActivity.viewBinding_delegate$lambda$0(this.f$0);
        }
    });
    private ViewModelProvider.Factory viewModelFactory = new Stripe3ds2TransactionViewModelFactory(new Function0() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.getArgs();
        }
    });

    public static /* synthetic */ void getViewModelFactory$payments_core_release$annotations() {
    }

    private final Stripe3ds2TransactionLayoutBinding getViewBinding() {
        return (Stripe3ds2TransactionLayoutBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stripe3ds2TransactionLayoutBinding viewBinding_delegate$lambda$0(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity) {
        Stripe3ds2TransactionLayoutBinding stripe3ds2TransactionLayoutBindingInflate = Stripe3ds2TransactionLayoutBinding.inflate(stripe3ds2TransactionActivity.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(stripe3ds2TransactionLayoutBindingInflate, "inflate(...)");
        return stripe3ds2TransactionLayoutBindingInflate;
    }

    public final Stripe3ds2TransactionContract.Args getArgs() {
        Stripe3ds2TransactionContract.Args args = this.args;
        if (args != null) {
            return args;
        }
        Intrinsics.throwUninitializedPropertyAccessException(CardScanActivity.ARGS);
        return null;
    }

    public final void setArgs(Stripe3ds2TransactionContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "<set-?>");
        this.args = args;
    }

    /* renamed from: getViewModelFactory$payments_core_release, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    public final void setViewModelFactory$payments_core_release(ViewModelProvider.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.viewModelFactory = factory;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object objM9118constructorimpl;
        Stripe3ds2TransactionContract.Args argsFromIntent;
        Object objM9118constructorimpl2;
        Integer num;
        final Function0 function0 = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Stripe3ds2TransactionActivity stripe3ds2TransactionActivity = this;
            Stripe3ds2TransactionContract.Args.Companion companion2 = Stripe3ds2TransactionContract.Args.INSTANCE;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            argsFromIntent = companion2.fromIntent(intent);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (argsFromIntent == null) {
            throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.".toString());
        }
        String accentColor = argsFromIntent.getConfig().getUiCustomization$payments_core_release().getUiCustomization().getAccentColor();
        if (accentColor != null) {
            try {
                Result.Companion companion4 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(Integer.valueOf(Color.parseColor(accentColor)));
            } catch (Throwable th2) {
                Result.Companion companion5 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl2)) {
                objM9118constructorimpl2 = null;
            }
            num = (Integer) objM9118constructorimpl2;
        } else {
            num = null;
        }
        getSupportFragmentManager().setFragmentFactory(new ChallengeProgressFragmentFactory(argsFromIntent.getFingerprint().getDirectoryServerName(), argsFromIntent.getSdkTransactionId(), num));
        objM9118constructorimpl = Result.m9118constructorimpl(argsFromIntent);
        super.onCreate(savedInstanceState);
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            setArgs((Stripe3ds2TransactionContract.Args) objM9118constructorimpl);
            setContentView(getViewBinding().getRoot());
            Integer statusBarColor = getArgs().getStatusBarColor();
            if (statusBarColor != null) {
                getWindow().setStatusBarColor(statusBarColor.intValue());
            }
            final Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = this;
            final ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(Stripe3ds2TransactionViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$$inlined$viewModels$default$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    return stripe3ds2TransactionActivity2.getStore();
                }
            }, new Function0() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f$0.viewModelFactory;
                }
            }, new Function0<CreationExtras>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$$inlined$viewModels$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final CreationExtras invoke() {
                    CreationExtras creationExtras;
                    Function0 function02 = function0;
                    return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? stripe3ds2TransactionActivity2.getDefaultViewModelCreationExtras() : creationExtras;
                }
            });
            final Function1 function1 = new Function1() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Stripe3ds2TransactionActivity.onCreate$lambda$10(this.f$0, viewModelLazy, (ChallengeResult) obj);
                }
            };
            ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChallengeContract(), new ActivityResultCallback() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$$ExternalSyntheticLambda2
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    Stripe3ds2TransactionActivity.onCreate$lambda$11(function1, (ChallengeResult) obj);
                }
            });
            ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new ActivityResultCallback() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$$ExternalSyntheticLambda3
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    Stripe3ds2TransactionActivity.onCreate$lambda$12(this.f$0, (PaymentFlowResult.Unvalidated) obj);
                }
            });
            if (onCreate$lambda$9(viewModelLazy).getHasCompleted()) {
                return;
            }
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new AnonymousClass3(activityResultLauncherRegisterForActivityResult, function1, activityResultLauncherRegisterForActivityResult2, viewModelLazy, null));
            return;
        }
        finishWithResult(new PaymentFlowResult.Unvalidated(null, 2, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), false, null, null, null, 121, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stripe3ds2TransactionViewModel onCreate$lambda$9(Lazy<Stripe3ds2TransactionViewModel> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job onCreate$lambda$10(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, Lazy lazy, ChallengeResult challengeResult) {
        Intrinsics.checkNotNullParameter(challengeResult, "challengeResult");
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(stripe3ds2TransactionActivity), null, null, new Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1(stripe3ds2TransactionActivity, challengeResult, lazy, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$11(Function1 function1, ChallengeResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$12(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, PaymentFlowResult.Unvalidated it) {
        Intrinsics.checkNotNullParameter(it, "it");
        stripe3ds2TransactionActivity.finishWithResult(it);
    }

    /* compiled from: Stripe3ds2TransactionActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$3", f = "Stripe3ds2TransactionActivity.kt", i = {}, l = {103, 107}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityResultLauncher<PaymentBrowserAuthContract.Args> $browserLauncher;
        final /* synthetic */ ActivityResultLauncher<ChallengeViewArgs> $challengeLauncher;
        final /* synthetic */ Function1<ChallengeResult, Job> $onChallengeResult;
        final /* synthetic */ Lazy<Stripe3ds2TransactionViewModel> $viewModel$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(ActivityResultLauncher<ChallengeViewArgs> activityResultLauncher, Function1<? super ChallengeResult, ? extends Job> function1, ActivityResultLauncher<PaymentBrowserAuthContract.Args> activityResultLauncher2, Lazy<Stripe3ds2TransactionViewModel> lazy, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$challengeLauncher = activityResultLauncher;
            this.$onChallengeResult = function1;
            this.$browserLauncher = activityResultLauncher2;
            this.$viewModel$delegate = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe3ds2TransactionActivity.this.new AnonymousClass3(this.$challengeLauncher, this.$onChallengeResult, this.$browserLauncher, this.$viewModel$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!Stripe3ds2TransactionActivity.this.isFinishing()) {
                    this.label = 1;
                    obj = Stripe3ds2TransactionActivity.onCreate$lambda$9(this.$viewModel$delegate).start3ds2Flow(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InitChallengeResult initChallengeResult = (InitChallengeResult) obj;
                if (initChallengeResult instanceof InitChallengeResult.Start) {
                    this.$challengeLauncher.launch(((InitChallengeResult.Start) initChallengeResult).getChallengeViewArgs());
                } else {
                    if (!(initChallengeResult instanceof InitChallengeResult.End)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.$onChallengeResult.invoke(((InitChallengeResult.End) initChallengeResult).getChallengeResult());
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            NextStep nextStep = (NextStep) obj;
            if (nextStep instanceof NextStep.StartChallenge) {
                this.label = 2;
                obj = Stripe3ds2TransactionActivity.onCreate$lambda$9(this.$viewModel$delegate).initChallenge(((NextStep.StartChallenge) nextStep).getArgs(), this);
            } else {
                if (nextStep instanceof NextStep.StartFallback) {
                    this.$browserLauncher.launch(((NextStep.StartFallback) nextStep).getArgs());
                } else if (nextStep instanceof NextStep.Complete) {
                    Stripe3ds2TransactionActivity.this.finishWithResult(((NextStep.Complete) nextStep).getResult());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(PaymentFlowResult.Unvalidated paymentFlowResult) {
        setResult(-1, new Intent().putExtras(paymentFlowResult.toBundle()));
        finish();
    }
}
