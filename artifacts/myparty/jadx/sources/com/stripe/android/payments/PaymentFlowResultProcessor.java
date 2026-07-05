package com.stripe.android.payments;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.LinearRetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeIntentKtxKt;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 D*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001DBA\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020 H\u0002J\u0018\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0002J4\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0/H¤@¢\u0006\u0004\b0\u00101J4\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0/H¤@¢\u0006\u0004\b3\u00101J.\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u00105\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0004\b6\u00107J.\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u00109\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020\nH¤@¢\u0006\u0004\b;\u0010<J'\u0010=\u001a\u00028\u00012\u0006\u0010!\u001a\u00028\u00002\u0006\u0010>\u001a\u00020%2\b\u0010?\u001a\u0004\u0018\u00010\nH$¢\u0006\u0002\u0010@J\u001b\u0010A\u001a\u00020 2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0002¢\u0006\u0002\u0010CR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002EF¨\u0006G"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/model/StripeIntent;", ExifInterface.LATITUDE_SOUTH, "Lcom/stripe/android/StripeIntentResult;", "", "context", "Landroid/content/Context;", "publishableKeyProvider", "Ljavax/inject/Provider;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "<init>", "(Landroid/content/Context;Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V", "getStripeRepository", "()Lcom/stripe/android/networking/StripeRepository;", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "processResult", "Lkotlin/Result;", "unvalidatedResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "processResult-gIAlu-s", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldCancelIntentSource", "", "stripeIntent", "shouldCancelSource", "shouldRefreshIntent", "flowOutcome", "", "determineFlowOutcome", SDKConstants.PARAM_INTENT, "originalFlowOutcome", "shouldCallRefreshIntent", "retrieveStripeIntent", "clientSecret", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "expandFields", "", "retrieveStripeIntent-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshStripeIntent", "refreshStripeIntent-BWLJW6A", "refreshStripeIntentUntilTerminalState", "originalIntent", "refreshStripeIntentUntilTerminalState-BWLJW6A", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelStripeIntentSource", "stripeIntentId", "sourceId", "cancelStripeIntentSource-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createStripeIntentResult", "outcomeFromFlow", "failureMessage", "(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;", "shouldRetry", "stripeIntentResult", "(Ljava/lang/Object;)Z", "Companion", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentFlowResultProcessor<T extends StripeIntent, S extends StripeIntentResult<? extends T>> {
    public static final int MAX_RETRIES = 5;
    private final PaymentFlowFailureMessageFactory failureMessageFactory;
    private final Logger logger;
    private final Provider<String> publishableKeyProvider;
    private final RetryDelaySupplier retryDelaySupplier;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> EXPAND_PAYMENT_METHOD = CollectionsKt.listOf("payment_method");

    /* compiled from: PaymentFlowResultProcessor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ PaymentFlowResultProcessor(Context context, Provider provider, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext, RetryDelaySupplier retryDelaySupplier, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, provider, stripeRepository, logger, coroutineContext, retryDelaySupplier);
    }

    /* renamed from: cancelStripeIntentSource-BWLJW6A, reason: not valid java name */
    protected abstract Object mo8152cancelStripeIntentSourceBWLJW6A(String str, ApiRequest.Options options, String str2, Continuation<? super Result<? extends T>> continuation);

    protected abstract S createStripeIntentResult(T stripeIntent, int outcomeFromFlow, String failureMessage);

    /* renamed from: refreshStripeIntent-BWLJW6A, reason: not valid java name */
    protected abstract Object mo8154refreshStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<? extends T>> continuation);

    /* renamed from: retrieveStripeIntent-BWLJW6A, reason: not valid java name */
    protected abstract Object mo8155retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<? extends T>> continuation);

    private PaymentFlowResultProcessor(Context context, Provider<String> provider, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext, RetryDelaySupplier retryDelaySupplier) {
        this.publishableKeyProvider = provider;
        this.stripeRepository = stripeRepository;
        this.logger = logger;
        this.workContext = coroutineContext;
        this.retryDelaySupplier = retryDelaySupplier;
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context);
    }

    protected final StripeRepository getStripeRepository() {
        return this.stripeRepository;
    }

    public /* synthetic */ PaymentFlowResultProcessor(Context context, Provider provider, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext, LinearRetryDelaySupplier linearRetryDelaySupplier, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, provider, stripeRepository, logger, coroutineContext, (i & 32) != 0 ? new LinearRetryDelaySupplier() : linearRetryDelaySupplier, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: processResult-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8153processResultgIAlus(PaymentFlowResult.Unvalidated unvalidated, Continuation<? super Result<? extends S>> continuation) {
        PaymentFlowResultProcessor$processResult$1 paymentFlowResultProcessor$processResult$1;
        if (continuation instanceof PaymentFlowResultProcessor$processResult$1) {
            paymentFlowResultProcessor$processResult$1 = (PaymentFlowResultProcessor$processResult$1) continuation;
            if ((paymentFlowResultProcessor$processResult$1.label & Integer.MIN_VALUE) != 0) {
                paymentFlowResultProcessor$processResult$1.label -= Integer.MIN_VALUE;
            } else {
                paymentFlowResultProcessor$processResult$1 = new PaymentFlowResultProcessor$processResult$1(this, continuation);
            }
        }
        Object objWithContext = paymentFlowResultProcessor$processResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = paymentFlowResultProcessor$processResult$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            PaymentFlowResultProcessor$processResult$2 paymentFlowResultProcessor$processResult$2 = new PaymentFlowResultProcessor$processResult$2(this, unvalidated, null);
            paymentFlowResultProcessor$processResult$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, paymentFlowResultProcessor$processResult$2, paymentFlowResultProcessor$processResult$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCancelIntentSource(StripeIntent stripeIntent, boolean shouldCancelSource) {
        return shouldCancelSource && stripeIntent.requiresAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldRefreshIntent(StripeIntent stripeIntent, int flowOutcome) {
        boolean z;
        boolean z2;
        PaymentMethod paymentMethod;
        PaymentMethod.Type type;
        PaymentMethod.AfterRedirectAction afterRedirectAction;
        boolean z3 = flowOutcome == 1 && StripeIntentKtxKt.shouldRefresh(stripeIntent);
        if (flowOutcome == 3 && stripeIntent.getStatus() == StripeIntent.Status.Processing) {
            PaymentMethod paymentMethod2 = stripeIntent.getPaymentMethod();
            if ((paymentMethod2 != null ? paymentMethod2.type : null) == PaymentMethod.Type.Card) {
                z = true;
            }
        } else {
            z = false;
        }
        if (flowOutcome == 3 && stripeIntent.getStatus() == StripeIntent.Status.RequiresAction) {
            PaymentMethod paymentMethod3 = stripeIntent.getPaymentMethod();
            if ((paymentMethod3 != null ? paymentMethod3.type : null) == PaymentMethod.Type.Card && stripeIntent.getNextActionType() == StripeIntent.NextActionType.UseStripeSdk) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        return z3 || z || z2 || (stripeIntent.requiresAction() && (paymentMethod = stripeIntent.getPaymentMethod()) != null && (type = paymentMethod.type) != null && (afterRedirectAction = type.getAfterRedirectAction()) != null && afterRedirectAction.getShouldRefresh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int determineFlowOutcome(StripeIntent intent, int originalFlowOutcome) {
        StripeIntent.Status status = intent.getStatus();
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1 || i == 2) {
            return 1;
        }
        return originalFlowOutcome;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCallRefreshIntent(StripeIntent stripeIntent) {
        PaymentMethod.Type type;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        return ((paymentMethod == null || (type = paymentMethod.type) == null) ? null : type.getAfterRedirectAction()) instanceof PaymentMethod.AfterRedirectAction.Refresh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r9 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        r12 = r23;
        r10 = r7;
        r7 = r11;
        r11 = r24;
        r1 = r4;
        r4 = r7;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        if (r9 == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: refreshStripeIntentUntilTerminalState-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8151refreshStripeIntentUntilTerminalStateBWLJW6A(StripeIntent stripeIntent, String str, ApiRequest.Options options, Continuation<? super Result<? extends T>> continuation) {
        PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1 paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1;
        Object obj;
        PaymentFlowResultProcessor<T, S> paymentFlowResultProcessor;
        Ref.IntRef intRef;
        Ref.ObjectRef objectRef;
        StripeIntent stripeIntent2;
        int i;
        Ref.ObjectRef objectRef2;
        PaymentMethod.Type type;
        PaymentMethod.AfterRedirectAction afterRedirectAction;
        T t;
        Ref.ObjectRef objectRef3;
        String str2 = str;
        ApiRequest.Options options2 = options;
        if (continuation instanceof PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1) {
            paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1 = (PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1) continuation;
            if ((paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.label & Integer.MIN_VALUE) != 0) {
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.label -= Integer.MIN_VALUE;
            } else {
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1 = new PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1(this, continuation);
            }
        }
        Object obj2 = paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            int retryCount = (paymentMethod == null || (type = paymentMethod.type) == null || (afterRedirectAction = type.getAfterRedirectAction()) == null) ? 5 : afterRedirectAction.getRetryCount();
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = retryCount;
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            if (shouldCallRefreshIntent(stripeIntent)) {
                List<String> list = EXPAND_PAYMENT_METHOD;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$0 = this;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$1 = stripeIntent;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$2 = str2;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$3 = options2;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$4 = intRef2;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$5 = objectRef4;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$6 = objectRef4;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.I$0 = retryCount;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.label = 1;
                Object objMo8154refreshStripeIntentBWLJW6A = mo8154refreshStripeIntentBWLJW6A(str2, options2, list, paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1);
                obj = objMo8154refreshStripeIntentBWLJW6A;
            } else {
                List<String> list2 = EXPAND_PAYMENT_METHOD;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$0 = this;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$1 = stripeIntent;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$2 = str2;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$3 = options2;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$4 = intRef2;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$5 = objectRef4;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$6 = objectRef4;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.I$0 = retryCount;
                paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.label = 2;
                Object objMo8155retrieveStripeIntentBWLJW6A = mo8155retrieveStripeIntentBWLJW6A(str2, options2, list2, paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1);
                obj = objMo8155retrieveStripeIntentBWLJW6A;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef3 = (Ref.ObjectRef) paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$0;
                ResultKt.throwOnFailure(obj2);
                return objectRef3.element;
            }
            i = paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.I$0;
            Ref.ObjectRef objectRef5 = (Ref.ObjectRef) paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$6;
            Ref.ObjectRef objectRef6 = (Ref.ObjectRef) paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$5;
            Ref.IntRef intRef3 = (Ref.IntRef) paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$4;
            ApiRequest.Options options3 = (ApiRequest.Options) paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$3;
            String str3 = (String) paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$2;
            stripeIntent2 = (StripeIntent) paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$1;
            paymentFlowResultProcessor = (PaymentFlowResultProcessor) paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$0;
            ResultKt.throwOnFailure(obj2);
            Object value = ((Result) obj2).getValue();
            objectRef2 = objectRef5;
            str2 = str3;
            intRef = intRef3;
            objectRef = objectRef6;
            options2 = options3;
            t = value;
        }
        String str4 = str2;
        ApiRequest.Options options4 = options2;
        Ref.ObjectRef objectRef7 = objectRef;
        Ref.IntRef intRef4 = intRef;
        StripeIntent stripeIntent3 = stripeIntent2;
        PaymentFlowResultProcessor<T, S> paymentFlowResultProcessor2 = paymentFlowResultProcessor;
        objectRef2.element = t;
        long jMo7236maxDuration5sfh64U = paymentFlowResultProcessor2.retryDelaySupplier.mo7236maxDuration5sfh64U(i);
        PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2 paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2 = new PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2(paymentFlowResultProcessor2, objectRef7, intRef4, i, stripeIntent3, str4, options4, null);
        paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$0 = objectRef7;
        paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$1 = null;
        paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$2 = null;
        paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$3 = null;
        paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$4 = null;
        paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$5 = null;
        paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.L$6 = null;
        paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1.label = 3;
        if (TimeoutKt.m10637withTimeoutOrNullKLykuaI(jMo7236maxDuration5sfh64U, paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2, paymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$1) != coroutine_suspended) {
            objectRef3 = objectRef7;
            return objectRef3.element;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldRetry(Object stripeIntentResult) {
        boolean z;
        if (Result.m9124isFailureimpl(stripeIntentResult)) {
            stripeIntentResult = null;
        }
        StripeIntent stripeIntent = (StripeIntent) stripeIntentResult;
        if (stripeIntent == null) {
            return true;
        }
        boolean zRequiresAction = stripeIntent.requiresAction();
        if (stripeIntent.getStatus() != StripeIntent.Status.Processing) {
            z = false;
        } else {
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            if ((paymentMethod != null ? paymentMethod.type : null) == PaymentMethod.Type.Card) {
                z = true;
            }
        }
        return zRequiresAction || z;
    }

    /* compiled from: PaymentFlowResultProcessor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;", "", "<init>", "()V", "EXPAND_PAYMENT_METHOD", "", "", "getEXPAND_PAYMENT_METHOD", "()Ljava/util/List;", "MAX_RETRIES", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getEXPAND_PAYMENT_METHOD() {
            return PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
        }
    }
}
