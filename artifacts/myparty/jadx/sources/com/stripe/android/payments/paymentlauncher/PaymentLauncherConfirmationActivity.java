package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.R;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: PaymentLauncherConfirmationActivity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\u00020\u00128@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\t\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "starterArgs", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "getStarterArgs", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "starterArgs$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$payments_core_release$annotations", "getViewModelFactory$payments_core_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$payments_core_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "viewModel", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "getViewModel$payments_core_release$annotations", "getViewModel$payments_core_release", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentLauncherConfirmationActivity extends AppCompatActivity {
    public static final String EMPTY_ARG_ERROR = "PaymentLauncherConfirmationActivity was started without arguments";

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    public static final int $stable = 8;

    /* renamed from: starterArgs$delegate, reason: from kotlin metadata */
    private final Lazy starterArgs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentLauncherConfirmationActivity.starterArgs_delegate$lambda$0(this.f$0);
        }
    });
    private ViewModelProvider.Factory viewModelFactory = new PaymentLauncherViewModel.Factory(new Function0() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentLauncherConfirmationActivity.viewModelFactory$lambda$1(this.f$0);
        }
    });

    public static /* synthetic */ void getViewModel$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getViewModelFactory$payments_core_release$annotations() {
    }

    public PaymentLauncherConfirmationActivity() {
        final PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PaymentLauncherViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return paymentLauncherConfirmationActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.viewModelFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? paymentLauncherConfirmationActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final PaymentLauncherContract.Args getStarterArgs() {
        return (PaymentLauncherContract.Args) this.starterArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentLauncherContract.Args starterArgs_delegate$lambda$0(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity) {
        PaymentLauncherContract.Args.Companion companion = PaymentLauncherContract.Args.INSTANCE;
        Intent intent = paymentLauncherConfirmationActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.fromIntent(intent);
    }

    /* renamed from: getViewModelFactory$payments_core_release, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    public final void setViewModelFactory$payments_core_release(ViewModelProvider.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.viewModelFactory = factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentLauncherContract.Args viewModelFactory$lambda$1(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity) {
        PaymentLauncherContract.Args starterArgs = paymentLauncherConfirmationActivity.getStarterArgs();
        if (starterArgs != null) {
            return starterArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final PaymentLauncherViewModel getViewModel$payments_core_release() {
        return (PaymentLauncherViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objM9118constructorimpl;
        PaymentLauncherContract.Args starterArgs;
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.stripe_confirming_transaction_status));
        try {
            Result.Companion companion = Result.INSTANCE;
            PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = this;
            starterArgs = getStarterArgs();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (starterArgs != null) {
            objM9118constructorimpl = Result.m9118constructorimpl(starterArgs);
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                finishWithResult(new InternalPaymentResult.Failed(thM9121exceptionOrNullimpl));
                ErrorReporter.Companion companion3 = ErrorReporter.INSTANCE;
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion3, applicationContext, null, 2, null), ErrorReporter.ExpectedErrorEvent.PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
                return;
            }
            PaymentLauncherContract.Args args = (PaymentLauncherContract.Args) objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(args.mo8198validated1pmJ48());
            if (thM9121exceptionOrNullimpl2 != null) {
                finishWithResult(new InternalPaymentResult.Failed(thM9121exceptionOrNullimpl2));
                ErrorReporter.Companion companion4 = ErrorReporter.INSTANCE;
                Context applicationContext2 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion4, applicationContext2, null, 2, null), ErrorReporter.ExpectedErrorEvent.PAYMENT_LAUNCHER_CONFIRMATION_INVALID_ARGS, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl2), null, 4, null);
                return;
            }
            OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PaymentLauncherConfirmationActivity.onCreate$lambda$7((OnBackPressedCallback) obj);
                }
            }, 3, null);
            PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity2 = this;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(paymentLauncherConfirmationActivity2), null, null, new AnonymousClass3(null), 3, null);
            getViewModel$payments_core_release().register$payments_core_release(this, paymentLauncherConfirmationActivity2);
            AuthActivityStarterHost authActivityStarterHostCreate = AuthActivityStarterHost.INSTANCE.create(this, args.getStatusBarColor());
            if (args instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
                getViewModel$payments_core_release().confirmStripeIntent$payments_core_release(((PaymentLauncherContract.Args.IntentConfirmationArgs) args).getConfirmStripeIntentParams(), authActivityStarterHostCreate);
                return;
            }
            if (args instanceof PaymentLauncherContract.Args.HashedPaymentIntentNextActionArgs) {
                getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.HashedPaymentIntentNextActionArgs) args).getPaymentIntentClientSecret(), authActivityStarterHostCreate);
                return;
            } else if (args instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs) {
                getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.PaymentIntentNextActionArgs) args).getPaymentIntentClientSecret(), authActivityStarterHostCreate);
                return;
            } else {
                if (!(args instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs)) {
                    throw new NoWhenBranchMatchedException();
                }
                getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.SetupIntentNextActionArgs) args).getSetupIntentClientSecret(), authActivityStarterHostCreate);
                return;
            }
        }
        throw new IllegalArgumentException(EMPTY_ARG_ERROR.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        return Unit.INSTANCE;
    }

    /* compiled from: PaymentLauncherConfirmationActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$onCreate$3", f = "PaymentLauncherConfirmationActivity.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$onCreate$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentLauncherConfirmationActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<InternalPaymentResult> internalPaymentResult$payments_core_release = PaymentLauncherConfirmationActivity.this.getViewModel$payments_core_release().getInternalPaymentResult$payments_core_release();
                final PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = PaymentLauncherConfirmationActivity.this;
                this.label = 1;
                if (internalPaymentResult$payments_core_release.collect(new FlowCollector() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity.onCreate.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((InternalPaymentResult) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(InternalPaymentResult internalPaymentResult, Continuation<? super Unit> continuation) {
                        if (internalPaymentResult != null) {
                            paymentLauncherConfirmationActivity.finishWithResult(internalPaymentResult);
                        }
                        return Unit.INSTANCE;
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

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(InternalPaymentResult result) {
        setResult(-1, new Intent().putExtras(result.toBundle$payments_core_release()));
        finish();
    }
}
