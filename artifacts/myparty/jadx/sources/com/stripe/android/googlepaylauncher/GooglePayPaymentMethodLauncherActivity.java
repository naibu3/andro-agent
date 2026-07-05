package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.google.android.gms.wallet.contract.TaskResultContracts;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\u0015\u0010 \u001a\u00070!¢\u0006\u0002\b\"2\u0006\u0010#\u001a\u00020!H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewModel", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter$delegate", CardScanActivity.ARGS, "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "onGooglePayResult", "taskResult", "Lcom/google/android/gms/wallet/contract/ApiTaskResult;", "Lcom/google/android/gms/wallet/PaymentData;", "paymentData", "updateResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "finishWithResult", "setFadeAnimations", "googlePayStatusCodeToErrorCode", "", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ErrorCode;", "googlePayStatusCode", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayPaymentMethodLauncherActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private GooglePayPaymentMethodLauncherContractV2.Args args;

    /* renamed from: errorReporter$delegate, reason: from kotlin metadata */
    private final Lazy errorReporter = LazyKt.lazy(new Function0() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GooglePayPaymentMethodLauncherActivity.errorReporter_delegate$lambda$1(this.f$0);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    private final int googlePayStatusCodeToErrorCode(int googlePayStatusCode) {
        if (googlePayStatusCode != 7) {
            return googlePayStatusCode != 10 ? 1 : 2;
        }
        return 3;
    }

    public GooglePayPaymentMethodLauncherActivity() {
        final GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GooglePayPaymentMethodLauncherViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return googlePayPaymentMethodLauncherActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GooglePayPaymentMethodLauncherActivity.viewModel_delegate$lambda$0(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? googlePayPaymentMethodLauncherActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayPaymentMethodLauncherViewModel getViewModel() {
        return (GooglePayPaymentMethodLauncherViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity) {
        GooglePayPaymentMethodLauncherContractV2.Args args = googlePayPaymentMethodLauncherActivity.args;
        if (args == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CardScanActivity.ARGS);
            args = null;
        }
        return new GooglePayPaymentMethodLauncherViewModel.Factory(args);
    }

    private final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ErrorReporter errorReporter_delegate$lambda$1(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity) {
        return ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, googlePayPaymentMethodLauncherActivity, null, 2, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFadeAnimations();
        GooglePayPaymentMethodLauncherContractV2.Args.Companion companion = GooglePayPaymentMethodLauncherContractV2.Args.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        GooglePayPaymentMethodLauncherContractV2.Args argsFromIntent = companion.fromIntent(intent);
        if (argsFromIntent == null) {
            finishWithResult(new GooglePayPaymentMethodLauncher.Result.Failed(new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments."), 2));
            return;
        }
        this.args = argsFromIntent;
        GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(googlePayPaymentMethodLauncherActivity), null, null, new AnonymousClass1(null), 3, null);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TaskResultContracts.GetPaymentDataResult(), new ActivityResultCallback() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayPaymentMethodLauncherActivity.onCreate$lambda$2(this.f$0, (ApiTaskResult) obj);
            }
        });
        if (getViewModel().getHasLaunched$payments_core_release()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(googlePayPaymentMethodLauncherActivity), null, null, new AnonymousClass2(activityResultLauncherRegisterForActivityResult, null), 3, null);
    }

    /* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$1", f = "GooglePayPaymentMethodLauncherActivity.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayPaymentMethodLauncherActivity.this.new AnonymousClass1(continuation);
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
                StateFlow<GooglePayPaymentMethodLauncher.Result> googlePayResult$payments_core_release = GooglePayPaymentMethodLauncherActivity.this.getViewModel().getGooglePayResult$payments_core_release();
                final GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = GooglePayPaymentMethodLauncherActivity.this;
                this.label = 1;
                if (googlePayResult$payments_core_release.collect(new FlowCollector() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((GooglePayPaymentMethodLauncher.Result) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(GooglePayPaymentMethodLauncher.Result result, Continuation<? super Unit> continuation) {
                        if (result != null) {
                            googlePayPaymentMethodLauncherActivity.finishWithResult(result);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, ApiTaskResult apiTaskResult) {
        Intrinsics.checkNotNull(apiTaskResult);
        googlePayPaymentMethodLauncherActivity.onGooglePayResult((ApiTaskResult<PaymentData>) apiTaskResult);
    }

    /* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2", f = "GooglePayPaymentMethodLauncherActivity.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> $googlePayLauncher;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$googlePayLauncher = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = GooglePayPaymentMethodLauncherActivity.this.new AnonymousClass2(this.$googlePayLauncher, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = GooglePayPaymentMethodLauncherActivity.this;
                    Result.Companion companion = Result.INSTANCE;
                    CoroutineDispatcher io = Dispatchers.getIO();
                    GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1 googlePayPaymentMethodLauncherActivity$onCreate$2$1$1 = new GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1(googlePayPaymentMethodLauncherActivity, null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io, googlePayPaymentMethodLauncherActivity$onCreate$2$1$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM9118constructorimpl = Result.m9118constructorimpl((Task) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            ActivityResultLauncher<Task<PaymentData>> activityResultLauncher = this.$googlePayLauncher;
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                googlePayPaymentMethodLauncherActivity2.updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(thM9121exceptionOrNullimpl, 1));
            } else {
                activityResultLauncher.launch((Task) objM9118constructorimpl);
                googlePayPaymentMethodLauncherActivity2.getViewModel().setHasLaunched$payments_core_release(true);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        setFadeAnimations();
    }

    private final void onGooglePayResult(ApiTaskResult<PaymentData> taskResult) {
        int statusCode = taskResult.getStatus().getStatusCode();
        if (statusCode == 0) {
            PaymentData result = taskResult.getResult();
            if (result != null) {
                onGooglePayResult(result);
                return;
            } else {
                ErrorReporter.DefaultImpls.report$default(getErrorReporter(), ErrorReporter.UnexpectedErrorEvent.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6, null);
                updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(new RuntimeException("Google Pay failed with missing data."), 1));
                return;
            }
        }
        if (statusCode == 16) {
            updateResult(GooglePayPaymentMethodLauncher.Result.Canceled.INSTANCE);
            return;
        }
        Status status = taskResult.getStatus();
        Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        ErrorReporter.DefaultImpls.report$default(getErrorReporter(), ErrorReporter.ExpectedErrorEvent.GOOGLE_PAY_FAILED, null, MapsKt.mapOf(TuplesKt.to("status_message", statusMessage), TuplesKt.to("status_code", String.valueOf(status.getStatusCode()))), 2, null);
        GooglePayPaymentMethodLauncherViewModel viewModel = getViewModel();
        int statusCode2 = status.getStatusCode();
        String statusMessage2 = status.getStatusMessage();
        viewModel.updateResult(new GooglePayPaymentMethodLauncher.Result.Failed(new RuntimeException("Google Pay failed with error " + statusCode2 + ": " + (statusMessage2 != null ? statusMessage2 : "")), googlePayStatusCodeToErrorCode(status.getStatusCode())));
    }

    /* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onGooglePayResult$1", f = "GooglePayPaymentMethodLauncherActivity.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onGooglePayResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C10221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentData $paymentData;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10221(PaymentData paymentData, Continuation<? super C10221> continuation) {
            super(2, continuation);
            this.$paymentData = paymentData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayPaymentMethodLauncherActivity.this.new C10221(this.$paymentData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
                this.L$0 = googlePayPaymentMethodLauncherActivity2;
                this.label = 1;
                Object objCreatePaymentMethod = googlePayPaymentMethodLauncherActivity2.getViewModel().createPaymentMethod(this.$paymentData, this);
                if (objCreatePaymentMethod == coroutine_suspended) {
                    return coroutine_suspended;
                }
                googlePayPaymentMethodLauncherActivity = googlePayPaymentMethodLauncherActivity2;
                obj = objCreatePaymentMethod;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            googlePayPaymentMethodLauncherActivity.finishWithResult((GooglePayPaymentMethodLauncher.Result) obj);
            return Unit.INSTANCE;
        }
    }

    private final void onGooglePayResult(PaymentData paymentData) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C10221(paymentData, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateResult(GooglePayPaymentMethodLauncher.Result result) {
        getViewModel().updateResult(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(GooglePayPaymentMethodLauncher.Result result) {
        setResult(-1, new Intent().putExtras(BundleKt.bundleOf(TuplesKt.to("extra_result", result))));
        finish();
    }

    private final void setFadeAnimations() {
        AnimationConstantsKt.fadeOut(this);
    }
}
