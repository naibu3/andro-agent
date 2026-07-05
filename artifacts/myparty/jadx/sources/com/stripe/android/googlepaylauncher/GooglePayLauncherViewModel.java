package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.content.Intent;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.internal.NativeProtocol;
import com.facebook.login.LoginLogger;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.PaymentController;
import com.stripe.android.StripePaymentController;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: GooglePayLauncherViewModel.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 P2\u00020\u0001:\u0002OPBW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!J\u000e\u0010.\u001a\u00020\u0019H\u0087@¢\u0006\u0002\u0010/J\u001e\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u0006\u001a\u00020\u0007H\u0087@¢\u0006\u0004\b3\u00104J7\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002022\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u000102H\u0001¢\u0006\u0004\b=\u0010>J\u001c\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'01H\u0082@¢\u0006\u0004\b@\u0010/J\u0016\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EJ\u0016\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JJ \u0010K\u001a\u00020!2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0081@¢\u0006\u0004\bL\u0010MJ\u0006\u0010N\u001a\u00020,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0#X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010'0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010'0#¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%¨\u0006Q"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", CardScanActivity.ARGS, "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "paymentController", "Lcom/stripe/android/PaymentController;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/google/android/gms/wallet/PaymentsClient;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "value", "", "hasLaunched", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "_googleResult", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "googlePayResult", "Lkotlinx/coroutines/flow/SharedFlow;", "getGooglePayResult$payments_core_release", "()Lkotlinx/coroutines/flow/SharedFlow;", "_googlePayLaunchTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "googlePayLaunchTask", "getGooglePayLaunchTask", "updateResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "isReadyToPay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentDataRequest", "Lkotlin/Result;", "", "createPaymentDataRequest-gIAlu-s", "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransactionInfo", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "currencyCode", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "label", "createTransactionInfo$payments_core_release", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "resolveLoadPaymentDataTask", "resolveLoadPaymentDataTask-IoAF18A", "confirmStripeIntent", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodCreateParams;", "onConfirmResult", "requestCode", "", "data", "Landroid/content/Intent;", "getResultFromConfirmation", "getResultFromConfirmation$payments_core_release", "(ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markTaskAsLaunched", "Factory", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayLauncherViewModel extends ViewModel {
    public static final String HAS_LAUNCHED_KEY = "has_launched";
    private final MutableSharedFlow<Task<PaymentData>> _googlePayLaunchTask;
    private final MutableSharedFlow<GooglePayLauncher.Result> _googleResult;
    private final GooglePayLauncherContract.Args args;
    private final ErrorReporter errorReporter;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final SharedFlow<Task<PaymentData>> googlePayLaunchTask;
    private final GooglePayRepository googlePayRepository;
    private final SharedFlow<GooglePayLauncher.Result> googlePayResult;
    private final PaymentController paymentController;
    private final PaymentsClient paymentsClient;
    private final ApiRequest.Options requestOptions;
    private final SavedStateHandle savedStateHandle;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GooglePayLauncher.BillingAddressConfig.Format.values().length];
            try {
                iArr[GooglePayLauncher.BillingAddressConfig.Format.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GooglePayLauncher.BillingAddressConfig.Format.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GooglePayLauncherViewModel(PaymentsClient paymentsClient, ApiRequest.Options requestOptions, GooglePayLauncherContract.Args args, StripeRepository stripeRepository, PaymentController paymentController, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository, SavedStateHandle savedStateHandle, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(paymentsClient, "paymentsClient");
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentController, "paymentController");
        Intrinsics.checkNotNullParameter(googlePayJsonFactory, "googlePayJsonFactory");
        Intrinsics.checkNotNullParameter(googlePayRepository, "googlePayRepository");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.paymentsClient = paymentsClient;
        this.requestOptions = requestOptions;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.paymentController = paymentController;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = googlePayRepository;
        this.savedStateHandle = savedStateHandle;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        MutableSharedFlow<GooglePayLauncher.Result> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._googleResult = mutableSharedFlowMutableSharedFlow$default;
        this.googlePayResult = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Task<PaymentData>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._googlePayLaunchTask = mutableSharedFlowMutableSharedFlow$default2;
        this.googlePayLaunchTask = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), workContext, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasLaunched() {
        return Intrinsics.areEqual(this.savedStateHandle.get("has_launched"), (Object) true);
    }

    private final void setHasLaunched(boolean z) {
        this.savedStateHandle.set("has_launched", Boolean.valueOf(z));
    }

    public final SharedFlow<GooglePayLauncher.Result> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final SharedFlow<Task<PaymentData>> getGooglePayLaunchTask() {
        return this.googlePayLaunchTask;
    }

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$1", f = "GooglePayLauncherViewModel.kt", i = {}, l = {75, 77}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (r1.emit((com.google.android.gms.tasks.Task) r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM7662resolveLoadPaymentDataTaskIoAF18A;
            Throwable thM9121exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!GooglePayLauncherViewModel.this.getHasLaunched()) {
                    this.label = 1;
                    objM7662resolveLoadPaymentDataTaskIoAF18A = GooglePayLauncherViewModel.this.m7662resolveLoadPaymentDataTaskIoAF18A(this);
                    if (objM7662resolveLoadPaymentDataTaskIoAF18A != coroutine_suspended) {
                        GooglePayLauncherViewModel googlePayLauncherViewModel = GooglePayLauncherViewModel.this;
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7662resolveLoadPaymentDataTaskIoAF18A);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
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
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objM7662resolveLoadPaymentDataTaskIoAF18A = ((Result) obj).getValue();
            GooglePayLauncherViewModel googlePayLauncherViewModel2 = GooglePayLauncherViewModel.this;
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7662resolveLoadPaymentDataTaskIoAF18A);
            if (thM9121exceptionOrNullimpl != null) {
                MutableSharedFlow mutableSharedFlow = googlePayLauncherViewModel2._googlePayLaunchTask;
                this.label = 2;
            } else {
                googlePayLauncherViewModel2.updateResult(new GooglePayLauncher.Result.Failed(thM9121exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateResult(GooglePayLauncher.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this._googleResult.tryEmit(result);
    }

    public final Object isReadyToPay(Continuation<? super Boolean> continuation) {
        return FlowKt.first(this.googlePayRepository.isReady(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: createPaymentDataRequest-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7663createPaymentDataRequestgIAlus(GooglePayLauncherContract.Args args, Continuation<? super Result<String>> continuation) {
        GooglePayLauncherViewModel$createPaymentDataRequest$1 googlePayLauncherViewModel$createPaymentDataRequest$1;
        Object objM8069retrieveSetupIntentBWLJW6A$default;
        GooglePayLauncherViewModel googlePayLauncherViewModel;
        Object objM8068retrievePaymentIntentBWLJW6A$default;
        Object objM9118constructorimpl;
        GooglePayJsonFactory.BillingAddressParameters.Format format;
        GooglePayLauncherContract.Args args2 = args;
        if (continuation instanceof GooglePayLauncherViewModel$createPaymentDataRequest$1) {
            googlePayLauncherViewModel$createPaymentDataRequest$1 = (GooglePayLauncherViewModel$createPaymentDataRequest$1) continuation;
            if ((googlePayLauncherViewModel$createPaymentDataRequest$1.label & Integer.MIN_VALUE) != 0) {
                googlePayLauncherViewModel$createPaymentDataRequest$1.label -= Integer.MIN_VALUE;
            } else {
                googlePayLauncherViewModel$createPaymentDataRequest$1 = new GooglePayLauncherViewModel$createPaymentDataRequest$1(this, continuation);
            }
        }
        GooglePayLauncherViewModel$createPaymentDataRequest$1 googlePayLauncherViewModel$createPaymentDataRequest$12 = googlePayLauncherViewModel$createPaymentDataRequest$1;
        Object obj = googlePayLauncherViewModel$createPaymentDataRequest$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = googlePayLauncherViewModel$createPaymentDataRequest$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (args2 instanceof GooglePayLauncherContract.PaymentIntentArgs) {
                StripeRepository stripeRepository = this.stripeRepository;
                String clientSecret$payments_core_release = ((GooglePayLauncherContract.PaymentIntentArgs) args2).getClientSecret$payments_core_release();
                ApiRequest.Options options = this.requestOptions;
                googlePayLauncherViewModel$createPaymentDataRequest$12.L$0 = this;
                googlePayLauncherViewModel$createPaymentDataRequest$12.L$1 = args2;
                googlePayLauncherViewModel$createPaymentDataRequest$12.label = 1;
                objM8068retrievePaymentIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8068retrievePaymentIntentBWLJW6A$default(stripeRepository, clientSecret$payments_core_release, options, null, googlePayLauncherViewModel$createPaymentDataRequest$12, 4, null);
                if (objM8068retrievePaymentIntentBWLJW6A$default != coroutine_suspended) {
                    googlePayLauncherViewModel = this;
                    if (Result.m9125isSuccessimpl(objM8068retrievePaymentIntentBWLJW6A$default)) {
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl(objM8068retrievePaymentIntentBWLJW6A$default);
                }
            } else {
                if (!(args2 instanceof GooglePayLauncherContract.SetupIntentArgs)) {
                    throw new NoWhenBranchMatchedException();
                }
                StripeRepository stripeRepository2 = this.stripeRepository;
                String clientSecret$payments_core_release2 = ((GooglePayLauncherContract.SetupIntentArgs) args2).getClientSecret$payments_core_release();
                ApiRequest.Options options2 = this.requestOptions;
                googlePayLauncherViewModel$createPaymentDataRequest$12.L$0 = this;
                googlePayLauncherViewModel$createPaymentDataRequest$12.L$1 = args2;
                googlePayLauncherViewModel$createPaymentDataRequest$12.label = 2;
                objM8069retrieveSetupIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8069retrieveSetupIntentBWLJW6A$default(stripeRepository2, clientSecret$payments_core_release2, options2, null, googlePayLauncherViewModel$createPaymentDataRequest$12, 4, null);
                if (objM8069retrieveSetupIntentBWLJW6A$default != coroutine_suspended) {
                    googlePayLauncherViewModel = this;
                    if (Result.m9125isSuccessimpl(objM8069retrieveSetupIntentBWLJW6A$default)) {
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl(objM8069retrieveSetupIntentBWLJW6A$default);
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            args2 = (GooglePayLauncherContract.Args) googlePayLauncherViewModel$createPaymentDataRequest$12.L$1;
            googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel$createPaymentDataRequest$12.L$0;
            ResultKt.throwOnFailure(obj);
            objM8068retrievePaymentIntentBWLJW6A$default = ((Result) obj).getValue();
            if (Result.m9125isSuccessimpl(objM8068retrievePaymentIntentBWLJW6A$default)) {
                Result.Companion companion = Result.INSTANCE;
                PaymentIntent paymentIntent = (PaymentIntent) objM8068retrievePaymentIntentBWLJW6A$default;
                PaymentIntent paymentIntent2 = paymentIntent;
                String currency = paymentIntent.getCurrency();
                if (currency == null) {
                    currency = "";
                }
                objM8068retrievePaymentIntentBWLJW6A$default = createTransactionInfo$payments_core_release$default(googlePayLauncherViewModel, paymentIntent2, currency, null, ((GooglePayLauncherContract.PaymentIntentArgs) args2).getLabel$payments_core_release(), 4, null);
            }
            objM9118constructorimpl = Result.m9118constructorimpl(objM8068retrievePaymentIntentBWLJW6A$default);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            args2 = (GooglePayLauncherContract.Args) googlePayLauncherViewModel$createPaymentDataRequest$12.L$1;
            googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel$createPaymentDataRequest$12.L$0;
            ResultKt.throwOnFailure(obj);
            objM8069retrieveSetupIntentBWLJW6A$default = ((Result) obj).getValue();
            if (Result.m9125isSuccessimpl(objM8069retrieveSetupIntentBWLJW6A$default)) {
                Result.Companion companion2 = Result.INSTANCE;
                GooglePayLauncherContract.SetupIntentArgs setupIntentArgs = (GooglePayLauncherContract.SetupIntentArgs) args2;
                objM8069retrieveSetupIntentBWLJW6A$default = googlePayLauncherViewModel.createTransactionInfo$payments_core_release((SetupIntent) objM8069retrieveSetupIntentBWLJW6A$default, setupIntentArgs.getCurrencyCode$payments_core_release(), setupIntentArgs.getAmount$payments_core_release(), setupIntentArgs.getLabel$payments_core_release());
            }
            objM9118constructorimpl = Result.m9118constructorimpl(objM8069retrieveSetupIntentBWLJW6A$default);
        }
        if (!Result.m9125isSuccessimpl(objM9118constructorimpl)) {
            return Result.m9118constructorimpl(objM9118constructorimpl);
        }
        Result.Companion companion3 = Result.INSTANCE;
        GooglePayJsonFactory.TransactionInfo transactionInfo = (GooglePayJsonFactory.TransactionInfo) objM9118constructorimpl;
        GooglePayJsonFactory googlePayJsonFactory = googlePayLauncherViewModel.googlePayJsonFactory;
        GooglePayJsonFactory.MerchantInfo merchantInfo = new GooglePayJsonFactory.MerchantInfo(args2.getConfig$payments_core_release().getMerchantName());
        boolean zIsRequired$payments_core_release = args2.getConfig$payments_core_release().getBillingAddressConfig().isRequired$payments_core_release();
        int i2 = WhenMappings.$EnumSwitchMapping$0[args2.getConfig$payments_core_release().getBillingAddressConfig().getFormat$payments_core_release().ordinal()];
        if (i2 == 1) {
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
        }
        return Result.m9118constructorimpl(GooglePayJsonFactory.createPaymentDataRequest$default(googlePayJsonFactory, transactionInfo, new GooglePayJsonFactory.BillingAddressParameters(zIsRequired$payments_core_release, format, args2.getConfig$payments_core_release().getBillingAddressConfig().isPhoneNumberRequired$payments_core_release()), null, args2.getConfig$payments_core_release().isEmailRequired(), merchantInfo, Boxing.boxBoolean(args2.getConfig$payments_core_release().getAllowCreditCards()), 4, null).toString());
    }

    public static /* synthetic */ GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release$default(GooglePayLauncherViewModel googlePayLauncherViewModel, StripeIntent stripeIntent, String str, Long l, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return googlePayLauncherViewModel.createTransactionInfo$payments_core_release(stripeIntent, str, l, str2);
    }

    public final GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release(StripeIntent stripeIntent, String currencyCode, Long amount, String label) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        if (stripeIntent instanceof PaymentIntent) {
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            return new GooglePayJsonFactory.TransactionInfo(currencyCode, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Final, this.args.getConfig$payments_core_release().getMerchantCountryCode(), paymentIntent.getId(), paymentIntent.getAmount(), (String) null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.CompleteImmediatePurchase);
        }
        if (!(stripeIntent instanceof SetupIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        return new GooglePayJsonFactory.TransactionInfo(currencyCode, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, this.args.getConfig$payments_core_release().getMerchantCountryCode(), ((SetupIntent) stripeIntent).getId(), Long.valueOf(amount != null ? amount.longValue() : 0L), label, GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
    
        if (r8 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:18:0x004b, B:27:0x0066, B:29:0x006e, B:30:0x0075, B:31:0x0080), top: B:58:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:18:0x004b, B:27:0x0066, B:29:0x006e, B:30:0x0075, B:31:0x0080), top: B:58:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6 A[PHI: r8
      0x00c6: PHI (r8v34 java.lang.Object) = (r8v24 java.lang.Object), (r8v26 java.lang.Object) binds: [B:42:0x00b0, B:46:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: resolveLoadPaymentDataTask-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7662resolveLoadPaymentDataTaskIoAF18A(Continuation<? super Result<? extends Task<PaymentData>>> continuation) {
        GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1 googlePayLauncherViewModel$resolveLoadPaymentDataTask$1;
        GooglePayLauncherViewModel googlePayLauncherViewModel;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        Object objM9118constructorimpl2;
        Object objM9118constructorimpl3;
        if (continuation instanceof GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1) {
            googlePayLauncherViewModel$resolveLoadPaymentDataTask$1 = (GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1) continuation;
            if ((googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label & Integer.MIN_VALUE) != 0) {
                googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label -= Integer.MIN_VALUE;
            } else {
                googlePayLauncherViewModel$resolveLoadPaymentDataTask$1 = new GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1(this, continuation);
            }
        }
        Object objIsReadyToPay = googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objIsReadyToPay);
            try {
                Result.Companion companion = Result.INSTANCE;
                GooglePayLauncherViewModel googlePayLauncherViewModel2 = this;
                googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.L$0 = this;
                googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label = 1;
                objIsReadyToPay = isReadyToPay(googlePayLauncherViewModel$resolveLoadPaymentDataTask$1);
                if (objIsReadyToPay != coroutine_suspended) {
                    googlePayLauncherViewModel = this;
                    if (!((Boolean) objIsReadyToPay).booleanValue()) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                googlePayLauncherViewModel = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
                if (!Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
                }
                return Result.m9118constructorimpl(objM9118constructorimpl3);
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objIsReadyToPay);
                objM9118constructorimpl3 = (Task) objIsReadyToPay;
                return Result.m9118constructorimpl(objM9118constructorimpl3);
            }
            googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.L$0;
            ResultKt.throwOnFailure(objIsReadyToPay);
            objM9118constructorimpl2 = ((Result) objIsReadyToPay).getValue();
            if (!Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM9118constructorimpl3 = Result.m9118constructorimpl(PaymentDataRequest.fromJson((String) objM9118constructorimpl2));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM9118constructorimpl2 = ResultKt.createFailure(th2);
                }
                if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
                    Result.Companion companion5 = Result.INSTANCE;
                    Task<PaymentData> taskLoadPaymentData = googlePayLauncherViewModel.paymentsClient.loadPaymentData((PaymentDataRequest) objM9118constructorimpl3);
                    Intrinsics.checkNotNullExpressionValue(taskLoadPaymentData, "loadPaymentData(...)");
                    googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.L$0 = null;
                    googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label = 3;
                    objIsReadyToPay = TasksKt.awaitTask$default(taskLoadPaymentData, null, googlePayLauncherViewModel$resolveLoadPaymentDataTask$1, 1, null);
                }
            } else {
                objM9118constructorimpl3 = Result.m9118constructorimpl(objM9118constructorimpl2);
                if (Result.m9125isSuccessimpl(objM9118constructorimpl3)) {
                }
            }
            return Result.m9118constructorimpl(objM9118constructorimpl3);
        }
        googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.L$0;
        try {
            ResultKt.throwOnFailure(objIsReadyToPay);
            if (!((Boolean) objIsReadyToPay).booleanValue()) {
                objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
            } else {
                throw new IllegalStateException("Google Pay is unavailable.".toString());
            }
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion22 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
            }
            if (!Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
            }
            return Result.m9118constructorimpl(objM9118constructorimpl3);
        }
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            GooglePayLauncherContract.Args args = googlePayLauncherViewModel.args;
            googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.L$0 = googlePayLauncherViewModel;
            googlePayLauncherViewModel$resolveLoadPaymentDataTask$1.label = 2;
            objM9118constructorimpl2 = googlePayLauncherViewModel.m7663createPaymentDataRequestgIAlus(args, googlePayLauncherViewModel$resolveLoadPaymentDataTask$1);
            if (objM9118constructorimpl2 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        Result.Companion companion6 = Result.INSTANCE;
        objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        if (!Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
        }
        return Result.m9118constructorimpl(objM9118constructorimpl3);
    }

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$confirmStripeIntent$1", f = "GooglePayLauncherViewModel.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$confirmStripeIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C10201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthActivityStarterHost $host;
        final /* synthetic */ PaymentMethodCreateParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10201(PaymentMethodCreateParams paymentMethodCreateParams, AuthActivityStarterHost authActivityStarterHost, Continuation<? super C10201> continuation) {
            super(2, continuation);
            this.$params = paymentMethodCreateParams;
            this.$host = authActivityStarterHost;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherViewModel.this.new C10201(this.$params, this.$host, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ConfirmSetupIntentParams confirmSetupIntentParamsCreate$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GooglePayLauncherContract.Args args = GooglePayLauncherViewModel.this.args;
                if (args instanceof GooglePayLauncherContract.PaymentIntentArgs) {
                    confirmSetupIntentParamsCreate$default = ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.INSTANCE, this.$params, ((GooglePayLauncherContract.PaymentIntentArgs) GooglePayLauncherViewModel.this.args).getClientSecret$payments_core_release(), null, null, null, null, null, null, 252, null);
                } else {
                    if (!(args instanceof GooglePayLauncherContract.SetupIntentArgs)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    confirmSetupIntentParamsCreate$default = ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.INSTANCE, this.$params, ((GooglePayLauncherContract.SetupIntentArgs) GooglePayLauncherViewModel.this.args).getClientSecret$payments_core_release(), (MandateDataParams) null, (String) null, 12, (Object) null);
                }
                this.label = 1;
                if (GooglePayLauncherViewModel.this.paymentController.startConfirmAndAuth(this.$host, confirmSetupIntentParamsCreate$default, GooglePayLauncherViewModel.this.requestOptions, this) == coroutine_suspended) {
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

    public final void confirmStripeIntent(AuthActivityStarterHost host, PaymentMethodCreateParams params) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(params, "params");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.workContext, null, new C10201(params, host, null), 2, null);
    }

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$onConfirmResult$1", f = "GooglePayLauncherViewModel.kt", i = {}, l = {226, 227}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$onConfirmResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C10211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10211(int i, Intent intent, Continuation<? super C10211> continuation) {
            super(2, continuation);
            this.$requestCode = i;
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherViewModel.this.new C10211(this.$requestCode, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r1.emit((com.stripe.android.googlepaylauncher.GooglePayLauncher.Result) r7, r6) == r0) goto L15;
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
                this.label = 1;
                obj = GooglePayLauncherViewModel.this.getResultFromConfirmation$payments_core_release(this.$requestCode, this.$data, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = GooglePayLauncherViewModel.this._googleResult;
            this.label = 2;
        }
    }

    public final void onConfirmResult(int requestCode, Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.workContext, null, new C10211(requestCode, data, null), 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getResultFromConfirmation$payments_core_release(int i, Intent intent, Continuation<? super GooglePayLauncher.Result> continuation) {
        GooglePayLauncherViewModel$getResultFromConfirmation$1 googlePayLauncherViewModel$getResultFromConfirmation$1;
        Object objM9118constructorimpl;
        if (continuation instanceof GooglePayLauncherViewModel$getResultFromConfirmation$1) {
            googlePayLauncherViewModel$getResultFromConfirmation$1 = (GooglePayLauncherViewModel$getResultFromConfirmation$1) continuation;
            if ((googlePayLauncherViewModel$getResultFromConfirmation$1.label & Integer.MIN_VALUE) != 0) {
                googlePayLauncherViewModel$getResultFromConfirmation$1.label -= Integer.MIN_VALUE;
            } else {
                googlePayLauncherViewModel$getResultFromConfirmation$1 = new GooglePayLauncherViewModel$getResultFromConfirmation$1(this, continuation);
            }
        }
        Object obj = googlePayLauncherViewModel$getResultFromConfirmation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = googlePayLauncherViewModel$getResultFromConfirmation$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.paymentController.shouldHandlePaymentResult(i, intent)) {
                PaymentController paymentController = this.paymentController;
                googlePayLauncherViewModel$getResultFromConfirmation$1.label = 1;
                objM9118constructorimpl = paymentController.mo7198getPaymentIntentResultgIAlus(intent, googlePayLauncherViewModel$getResultFromConfirmation$1);
            } else if (this.paymentController.shouldHandleSetupResult(i, intent)) {
                PaymentController paymentController2 = this.paymentController;
                googlePayLauncherViewModel$getResultFromConfirmation$1.label = 2;
                objM9118constructorimpl = paymentController2.mo7199getSetupIntentResultgIAlus(intent, googlePayLauncherViewModel$getResultFromConfirmation$1);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Unexpected confirmation result.");
                this.errorReporter.report(ErrorReporter.UnexpectedErrorEvent.GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT, StripeException.INSTANCE.create(illegalStateException), MapsKt.mapOf(TuplesKt.to(LoginLogger.EVENT_EXTRAS_REQUEST_CODE, String.valueOf(i))));
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(illegalStateException));
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM9118constructorimpl = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            return GooglePayLauncher.Result.Completed.INSTANCE;
        }
        return new GooglePayLauncher.Result.Failed(thM9121exceptionOrNullimpl);
    }

    public final void markTaskAsLaunched() {
        setHasLaunched(true);
        this._googlePayLaunchTask.tryEmit(null);
    }

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", CardScanActivity.ARGS, "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", NamedConstantsKt.ENABLE_LOGGING, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 8;
        private final GooglePayLauncherContract.Args args;
        private final boolean enableLogging;
        private final CoroutineContext workContext;

        /* JADX INFO: Access modifiers changed from: private */
        public static final String create$lambda$0(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String create$lambda$1(String str) {
            return str;
        }

        public Factory(GooglePayLauncherContract.Args args, boolean z, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.args = args;
            this.enableLogging = z;
            this.workContext = workContext;
        }

        public /* synthetic */ Factory(GooglePayLauncherContract.Args args, boolean z, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(args, (i & 2) != 0 ? false : z, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Application applicationRequireApplication = CreationExtrasKtxKt.requireApplication(extras);
            GooglePayEnvironment environment = this.args.getConfig$payments_core_release().getEnvironment();
            Logger companion = Logger.INSTANCE.getInstance(this.enableLogging);
            Application application = applicationRequireApplication;
            PaymentConfiguration companion2 = PaymentConfiguration.INSTANCE.getInstance(application);
            final String publishableKey = companion2.getPublishableKey();
            String stripeAccountId = companion2.getStripeAccountId();
            Set<String> of = SetsKt.setOf(GooglePayLauncher.PRODUCT_USAGE);
            AppInfo appInfo = null;
            StripeNetworkClient stripeNetworkClient = null;
            AnalyticsRequestExecutor analyticsRequestExecutor = null;
            FraudDetectionDataRepository fraudDetectionDataRepository = null;
            CardAccountRangeRepository.Factory factory = null;
            StripeApiRepository stripeApiRepository = new StripeApiRepository(application, new Function0() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$Factory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GooglePayLauncherViewModel.Factory.create$lambda$0(publishableKey);
                }
            }, appInfo, companion, this.workContext, of, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, factory, new PaymentAnalyticsRequestFactory(application, publishableKey, of), null, null, null, null, 31684, null);
            ErrorReporter errorReporterCreateFallbackInstance = ErrorReporter.INSTANCE.createFallbackInstance(application, of);
            StripeApiRepository stripeApiRepository2 = stripeApiRepository;
            return new GooglePayLauncherViewModel(new DefaultPaymentsClientFactory(application).create(environment), new ApiRequest.Options(publishableKey, stripeAccountId, null, 4, null), this.args, stripeApiRepository2, new StripePaymentController(application, new Function0() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$Factory$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GooglePayLauncherViewModel.Factory.create$lambda$1(publishableKey);
                }
            }, stripeApiRepository2, this.enableLogging, this.workContext, null, null, null, null, 480, null), new GooglePayJsonFactory(new com.stripe.android.GooglePayConfig(publishableKey, stripeAccountId), this.args.getConfig$payments_core_release().isJcbEnabled$payments_core_release()), new DefaultGooglePayRepository(application, this.args.getConfig$payments_core_release().getEnvironment(), ConvertKt.convert(this.args.getConfig$payments_core_release().getBillingAddressConfig()), this.args.getConfig$payments_core_release().getExistingPaymentMethodRequired(), this.args.getConfig$payments_core_release().getAllowCreditCards(), null, errorReporterCreateFallbackInstance, companion, 0 == true ? 1 : 0, 288, null), SavedStateHandleSupport.createSavedStateHandle(extras), errorReporterCreateFallbackInstance, this.workContext);
        }
    }

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Companion;", "", "<init>", "()V", "HAS_LAUNCHED_KEY", "", "getHAS_LAUNCHED_KEY$annotations", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getHAS_LAUNCHED_KEY$annotations() {
        }

        private Companion() {
        }
    }
}
