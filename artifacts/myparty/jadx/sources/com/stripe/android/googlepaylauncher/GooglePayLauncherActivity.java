package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.google.android.gms.wallet.contract.TaskResultContracts;
import com.stripe.android.StripePaymentController;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Deprecated;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.json.JSONObject;

/* compiled from: GooglePayLauncherActivity.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0016\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\"\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewModel", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter$delegate", CardScanActivity.ARGS, "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "onGooglePayResult", "taskResult", "Lcom/google/android/gms/wallet/contract/ApiTaskResult;", "Lcom/google/android/gms/wallet/PaymentData;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayLauncherActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private GooglePayLauncherContract.Args args;

    /* renamed from: errorReporter$delegate, reason: from kotlin metadata */
    private final Lazy errorReporter = LazyKt.lazy(new Function0() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GooglePayLauncherActivity.errorReporter_delegate$lambda$1(this.f$0);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public GooglePayLauncherActivity() {
        final GooglePayLauncherActivity googlePayLauncherActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GooglePayLauncherViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return googlePayLauncherActivity.getStore();
            }
        }, new Function0() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GooglePayLauncherActivity.viewModel_delegate$lambda$0(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? googlePayLauncherActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayLauncherViewModel getViewModel() {
        return (GooglePayLauncherViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0(GooglePayLauncherActivity googlePayLauncherActivity) {
        GooglePayLauncherContract.Args args = googlePayLauncherActivity.args;
        if (args == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CardScanActivity.ARGS);
            args = null;
        }
        return new GooglePayLauncherViewModel.Factory(args, false, null, 6, null);
    }

    private final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ErrorReporter errorReporter_delegate$lambda$1(GooglePayLauncherActivity googlePayLauncherActivity) {
        return ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, googlePayLauncherActivity, null, 2, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objM9118constructorimpl;
        GooglePayLauncherContract.Args argsFromIntent$payments_core_release;
        super.onCreate(savedInstanceState);
        try {
            Result.Companion companion = Result.INSTANCE;
            GooglePayLauncherActivity googlePayLauncherActivity = this;
            GooglePayLauncherContract.Args.Companion companion2 = GooglePayLauncherContract.Args.INSTANCE;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            argsFromIntent$payments_core_release = companion2.fromIntent$payments_core_release(intent);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (argsFromIntent$payments_core_release == null) {
            throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.".toString());
        }
        objM9118constructorimpl = Result.m9118constructorimpl(argsFromIntent$payments_core_release);
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            finishWithResult(new GooglePayLauncher.Result.Failed(thM9121exceptionOrNullimpl));
            return;
        }
        this.args = (GooglePayLauncherContract.Args) objM9118constructorimpl;
        GooglePayLauncherActivity googlePayLauncherActivity2 = this;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(googlePayLauncherActivity2), null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(googlePayLauncherActivity2), null, null, new AnonymousClass4(registerForActivityResult(new TaskResultContracts.GetPaymentDataResult(), new ActivityResultCallback() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayLauncherActivity.onCreate$lambda$5(this.f$0, (ApiTaskResult) obj);
            }
        }), null), 3, null);
    }

    /* compiled from: GooglePayLauncherActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$3", f = "GooglePayLauncherActivity.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherActivity.this.new AnonymousClass3(continuation);
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
                SharedFlow<GooglePayLauncher.Result> googlePayResult$payments_core_release = GooglePayLauncherActivity.this.getViewModel().getGooglePayResult$payments_core_release();
                final GooglePayLauncherActivity googlePayLauncherActivity = GooglePayLauncherActivity.this;
                this.label = 1;
                if (googlePayResult$payments_core_release.collect(new FlowCollector() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity.onCreate.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((GooglePayLauncher.Result) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(GooglePayLauncher.Result result, Continuation<? super Unit> continuation) {
                        if (result != null) {
                            googlePayLauncherActivity.finishWithResult(result);
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
    public static final void onCreate$lambda$5(GooglePayLauncherActivity googlePayLauncherActivity, ApiTaskResult apiTaskResult) {
        Intrinsics.checkNotNull(apiTaskResult);
        googlePayLauncherActivity.onGooglePayResult(apiTaskResult);
    }

    /* compiled from: GooglePayLauncherActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4", f = "GooglePayLauncherActivity.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> $googlePayLauncher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$googlePayLauncher = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherActivity.this.new AnonymousClass4(this.$googlePayLauncher, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: GooglePayLauncherActivity.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4$1", f = "GooglePayLauncherActivity.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> $googlePayLauncher;
            int label;
            final /* synthetic */ GooglePayLauncherActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GooglePayLauncherActivity googlePayLauncherActivity, ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = googlePayLauncherActivity;
                this.$googlePayLauncher = activityResultLauncher;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$googlePayLauncher, continuation);
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
                    SharedFlow<Task<PaymentData>> googlePayLaunchTask = this.this$0.getViewModel().getGooglePayLaunchTask();
                    final ActivityResultLauncher<Task<PaymentData>> activityResultLauncher = this.$googlePayLauncher;
                    final GooglePayLauncherActivity googlePayLauncherActivity = this.this$0;
                    this.label = 1;
                    if (googlePayLaunchTask.collect(new FlowCollector() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity.onCreate.4.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Task<PaymentData>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Task<PaymentData> task, Continuation<? super Unit> continuation) {
                            if (task != null) {
                                activityResultLauncher.launch(task);
                                googlePayLauncherActivity.getViewModel().markTaskAsLaunched();
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(GooglePayLauncherActivity.this, Lifecycle.State.RESUMED, new AnonymousClass1(GooglePayLauncherActivity.this, this.$googlePayLauncher, null), this) == coroutine_suspended) {
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

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }

    private final void onGooglePayResult(ApiTaskResult<PaymentData> taskResult) {
        int statusCode = taskResult.getStatus().getStatusCode();
        if (statusCode == 0) {
            PaymentData result = taskResult.getResult();
            if (result != null) {
                getViewModel().confirmStripeIntent(AuthActivityStarterHost.Companion.create$default(AuthActivityStarterHost.INSTANCE, this, null, 2, null), PaymentMethodCreateParams.INSTANCE.createFromGooglePay(new JSONObject(result.toJson())));
                return;
            } else {
                ErrorReporter.DefaultImpls.report$default(getErrorReporter(), ErrorReporter.UnexpectedErrorEvent.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6, null);
                getViewModel().updateResult(new GooglePayLauncher.Result.Failed(new RuntimeException("Google Pay missing result data.")));
                return;
            }
        }
        if (statusCode == 16) {
            getViewModel().updateResult(GooglePayLauncher.Result.Canceled.INSTANCE);
            return;
        }
        Status status = taskResult.getStatus();
        Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        ErrorReporter.DefaultImpls.report$default(getErrorReporter(), ErrorReporter.ExpectedErrorEvent.GOOGLE_PAY_FAILED, null, MapsKt.mapOf(TuplesKt.to("status_message", statusMessage), TuplesKt.to("status_code", String.valueOf(status.getStatusCode()))), 2, null);
        GooglePayLauncherViewModel viewModel = getViewModel();
        int statusCode2 = status.getStatusCode();
        String statusMessage2 = status.getStatusMessage();
        viewModel.updateResult(new GooglePayLauncher.Result.Failed(new RuntimeException("Google Pay failed with error " + statusCode2 + ": " + (statusMessage2 != null ? statusMessage2 : ""))));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case StripePaymentController.PAYMENT_REQUEST_CODE /* 50000 */:
            case StripePaymentController.SETUP_REQUEST_CODE /* 50001 */:
                GooglePayLauncherViewModel viewModel = getViewModel();
                if (data == null) {
                    data = new Intent();
                }
                viewModel.onConfirmResult(requestCode, data);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(GooglePayLauncher.Result result) {
        setResult(-1, new Intent().putExtras(BundleKt.bundleOf(TuplesKt.to("extra_result", result))));
        finish();
    }
}
