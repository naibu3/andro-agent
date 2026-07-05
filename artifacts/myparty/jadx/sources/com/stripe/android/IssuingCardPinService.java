package com.stripe.android;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.EphemeralKeyManager;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.IssuingCardPinService;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.Logger;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.frauddetection.FraudDetectionDataParamsUtils;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import expo.modules.notifications.service.NotificationsService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: IssuingCardPinService.kt */
@Deprecated(message = "Please use Issuing Elements instead: https://stripe.com/docs/issuing/elements")
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 /2\u00020\u0001:\u0005+,-./B9\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0010J.\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0012J \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0010H\u0002J\u001e\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010%J \u0010&\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u001e\u0010(\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/stripe/android/IssuingCardPinService;", "", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/OperationIdFactory;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "retrievalListeners", "", "Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;", "updateListeners", "Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "retrievePin", "", "cardId", "verificationId", "userOneTimeCode", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updatePin", "newPin", "fireRetrievePinRequest", "ephemeralKey", "Lcom/stripe/android/EphemeralKey;", "operation", "Lcom/stripe/android/EphemeralOperation$Issuing$RetrievePin;", "onRetrievePinError", "throwable", "", "(Ljava/lang/Throwable;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fireUpdatePinRequest", "Lcom/stripe/android/EphemeralOperation$Issuing$UpdatePin;", "onUpdatePinError", "(Ljava/lang/Throwable;Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logMissingListener", "CardPinActionError", "IssuingCardPinRetrievalListener", "IssuingCardPinUpdateListener", "Listener", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IssuingCardPinService {
    private final EphemeralKeyManager ephemeralKeyManager;
    private final OperationIdFactory operationIdFactory;
    private final Map<String, IssuingCardPinRetrievalListener> retrievalListeners;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final Map<String, IssuingCardPinUpdateListener> updateListeners;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG = IssuingCardPinService.class.getName();

    /* compiled from: IssuingCardPinService.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$IssuingCardPinRetrievalListener;", "Lcom/stripe/android/IssuingCardPinService$Listener;", "onIssuingCardPinRetrieved", "", "pin", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface IssuingCardPinRetrievalListener extends Listener {
        void onIssuingCardPinRetrieved(String pin);
    }

    /* compiled from: IssuingCardPinService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$IssuingCardPinUpdateListener;", "Lcom/stripe/android/IssuingCardPinService$Listener;", "onIssuingCardPinUpdated", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface IssuingCardPinUpdateListener extends Listener {
        void onIssuingCardPinUpdated();
    }

    /* compiled from: IssuingCardPinService.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$Listener;", "", "onError", "", "errorCode", "Lcom/stripe/android/IssuingCardPinService$CardPinActionError;", "errorMessage", "", NotificationsService.EXCEPTION_KEY, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void onError(CardPinActionError errorCode, String errorMessage, Throwable exception);
    }

    @JvmStatic
    public static final IssuingCardPinService create(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
        return INSTANCE.create(context, ephemeralKeyProvider);
    }

    @JvmStatic
    public static final IssuingCardPinService create(Context context, String str, EphemeralKeyProvider ephemeralKeyProvider) {
        return INSTANCE.create(context, str, ephemeralKeyProvider);
    }

    @JvmStatic
    public static final IssuingCardPinService create(Context context, String str, String str2, EphemeralKeyProvider ephemeralKeyProvider) {
        return INSTANCE.create(context, str, str2, ephemeralKeyProvider);
    }

    public IssuingCardPinService(EphemeralKeyProvider keyProvider, StripeRepository stripeRepository, OperationIdFactory operationIdFactory, String str, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(operationIdFactory, "operationIdFactory");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.operationIdFactory = operationIdFactory;
        this.stripeAccountId = str;
        this.workContext = workContext;
        this.retrievalListeners = new LinkedHashMap();
        this.updateListeners = new LinkedHashMap();
        this.ephemeralKeyManager = new EphemeralKeyManager(keyProvider, new EphemeralKeyManager.KeyManagerListener() { // from class: com.stripe.android.IssuingCardPinService$ephemeralKeyManager$1
            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation operation) {
                Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
                Intrinsics.checkNotNullParameter(operation, "operation");
                if (operation instanceof EphemeralOperation.Issuing.RetrievePin) {
                    EphemeralOperation.Issuing.RetrievePin retrievePin = (EphemeralOperation.Issuing.RetrievePin) operation;
                    IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = (IssuingCardPinService.IssuingCardPinRetrievalListener) this.this$0.retrievalListeners.remove(retrievePin.getId$payments_core_release());
                    if (issuingCardPinRetrievalListener != null) {
                        this.this$0.fireRetrievePinRequest(ephemeralKey, retrievePin, issuingCardPinRetrievalListener);
                        return;
                    } else {
                        this.this$0.logMissingListener();
                        return;
                    }
                }
                if (operation instanceof EphemeralOperation.Issuing.UpdatePin) {
                    EphemeralOperation.Issuing.UpdatePin updatePin = (EphemeralOperation.Issuing.UpdatePin) operation;
                    IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = (IssuingCardPinService.IssuingCardPinUpdateListener) this.this$0.updateListeners.remove(updatePin.getId$payments_core_release());
                    if (issuingCardPinUpdateListener != null) {
                        this.this$0.fireUpdatePinRequest(ephemeralKey, updatePin, issuingCardPinUpdateListener);
                    } else {
                        this.this$0.logMissingListener();
                    }
                }
            }

            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyError(String operationId, int errorCode, String errorMessage, Throwable throwable) {
                Intrinsics.checkNotNullParameter(operationId, "operationId");
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = (IssuingCardPinService.IssuingCardPinUpdateListener) this.this$0.updateListeners.remove(operationId);
                IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = (IssuingCardPinService.IssuingCardPinRetrievalListener) this.this$0.retrievalListeners.remove(operationId);
                if (issuingCardPinRetrievalListener != null) {
                    issuingCardPinRetrievalListener.onError(IssuingCardPinService.CardPinActionError.EPHEMERAL_KEY_ERROR, errorMessage, null);
                } else if (issuingCardPinUpdateListener != null) {
                    issuingCardPinUpdateListener.onError(IssuingCardPinService.CardPinActionError.EPHEMERAL_KEY_ERROR, errorMessage, null);
                }
            }
        }, operationIdFactory, true, null, 0L, 48, null);
    }

    public /* synthetic */ IssuingCardPinService(EphemeralKeyProvider ephemeralKeyProvider, StripeRepository stripeRepository, StripeOperationIdFactory stripeOperationIdFactory, String str, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ephemeralKeyProvider, stripeRepository, (i & 4) != 0 ? new StripeOperationIdFactory() : stripeOperationIdFactory, (i & 8) != 0 ? null : str, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final void retrievePin(String cardId, String verificationId, String userOneTimeCode, IssuingCardPinRetrievalListener listener) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strCreate = this.operationIdFactory.create();
        this.retrievalListeners.put(strCreate, listener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(new EphemeralOperation.Issuing.RetrievePin(cardId, verificationId, userOneTimeCode, strCreate));
    }

    public final void updatePin(String cardId, String newPin, String verificationId, String userOneTimeCode, IssuingCardPinUpdateListener listener) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(userOneTimeCode, "userOneTimeCode");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strCreate = this.operationIdFactory.create();
        this.updateListeners.put(strCreate, listener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(new EphemeralOperation.Issuing.UpdatePin(cardId, newPin, verificationId, userOneTimeCode, strCreate));
    }

    /* compiled from: IssuingCardPinService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.IssuingCardPinService$fireRetrievePinRequest$1", f = "IssuingCardPinService.kt", i = {}, l = {148, 158, 163}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.IssuingCardPinService$fireRetrievePinRequest$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EphemeralKey $ephemeralKey;
        final /* synthetic */ IssuingCardPinRetrievalListener $listener;
        final /* synthetic */ EphemeralOperation.Issuing.RetrievePin $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EphemeralOperation.Issuing.RetrievePin retrievePin, EphemeralKey ephemeralKey, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$operation = retrievePin;
            this.$ephemeralKey = ephemeralKey;
            this.$listener = issuingCardPinRetrievalListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IssuingCardPinService.this.new AnonymousClass1(this.$operation, this.$ephemeralKey, this.$listener, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r3, r6, r16) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
        
            if (r6.onRetrievePinError(r7, r5, r16) == r1) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMo8047retrieveIssuingCardPinyxL6bBk;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objMo8047retrieveIssuingCardPinyxL6bBk = IssuingCardPinService.this.stripeRepository.mo8047retrieveIssuingCardPinyxL6bBk(this.$operation.getCardId(), this.$operation.getVerificationId(), this.$operation.getUserOneTimeCode(), new ApiRequest.Options(this.$ephemeralKey.getSecret(), IssuingCardPinService.this.stripeAccountId, null, 4, null), this);
                if (objMo8047retrieveIssuingCardPinyxL6bBk != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objMo8047retrieveIssuingCardPinyxL6bBk = ((Result) obj).getValue();
            IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = this.$listener;
            IssuingCardPinService issuingCardPinService = IssuingCardPinService.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8047retrieveIssuingCardPinyxL6bBk);
            if (thM9121exceptionOrNullimpl == null) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                IssuingCardPinService$fireRetrievePinRequest$1$1$1 issuingCardPinService$fireRetrievePinRequest$1$1$1 = new IssuingCardPinService$fireRetrievePinRequest$1$1$1(issuingCardPinRetrievalListener, (String) objMo8047retrieveIssuingCardPinyxL6bBk, null);
                this.label = 2;
            } else {
                this.label = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireRetrievePinRequest(EphemeralKey ephemeralKey, EphemeralOperation.Issuing.RetrievePin operation, IssuingCardPinRetrievalListener listener) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(operation, ephemeralKey, listener, null), 3, null);
    }

    /* compiled from: IssuingCardPinService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.IssuingCardPinService$onRetrievePinError$2", f = "IssuingCardPinService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.IssuingCardPinService$onRetrievePinError$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IssuingCardPinRetrievalListener $listener;
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Throwable th, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$throwable = th;
            this.$listener = issuingCardPinRetrievalListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$throwable, this.$listener, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = this.$throwable;
            if (th instanceof InvalidRequestException) {
                StripeError stripeError = ((InvalidRequestException) th).getStripeError();
                String code = stripeError != null ? stripeError.getCode() : null;
                if (code != null) {
                    switch (code.hashCode()) {
                        case -1309235419:
                            if (!code.equals("expired")) {
                                this.$listener.onError(CardPinActionError.UNKNOWN_ERROR, "The call to retrieve the PIN failed, possibly an error with the verification.", this.$throwable);
                                break;
                            } else {
                                this.$listener.onError(CardPinActionError.ONE_TIME_CODE_EXPIRED, "The one-time code has expired", null);
                                break;
                            }
                        case -1266028985:
                            if (code.equals("incorrect_code")) {
                                this.$listener.onError(CardPinActionError.ONE_TIME_CODE_INCORRECT, "The one-time code was incorrect.", null);
                                break;
                            }
                            break;
                        case 830217595:
                            if (code.equals("too_many_attempts")) {
                                this.$listener.onError(CardPinActionError.ONE_TIME_CODE_TOO_MANY_ATTEMPTS, "The verification challenge was attempted too many times.", null);
                                break;
                            }
                            break;
                        case 1888170818:
                            if (code.equals("already_redeemed")) {
                                this.$listener.onError(CardPinActionError.ONE_TIME_CODE_ALREADY_REDEEMED, "The verification challenge was already redeemed.", null);
                                break;
                            }
                            break;
                    }
                }
            } else {
                this.$listener.onError(CardPinActionError.UNKNOWN_ERROR, "An error occurred while retrieving the PIN.", this.$throwable);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onRetrievePinError(Throwable th, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(th, issuingCardPinRetrievalListener, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: IssuingCardPinService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.IssuingCardPinService$fireUpdatePinRequest$1", f = "IssuingCardPinService.kt", i = {}, l = {229, 240}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.IssuingCardPinService$fireUpdatePinRequest$1, reason: invalid class name and case insensitive filesystem */
    static final class C07341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EphemeralKey $ephemeralKey;
        final /* synthetic */ IssuingCardPinUpdateListener $listener;
        final /* synthetic */ EphemeralOperation.Issuing.UpdatePin $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07341(EphemeralOperation.Issuing.UpdatePin updatePin, EphemeralKey ephemeralKey, IssuingCardPinUpdateListener issuingCardPinUpdateListener, Continuation<? super C07341> continuation) {
            super(2, continuation);
            this.$operation = updatePin;
            this.$ephemeralKey = ephemeralKey;
            this.$listener = issuingCardPinUpdateListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IssuingCardPinService.this.new C07341(this.$operation, this.$ephemeralKey, this.$listener, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.stripe.android.IssuingCardPinService.C07341.C01431((java.lang.Throwable) r2, r16.this$0, r16.$listener, null), r16) == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objUpdateIssuingCardPin;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                objUpdateIssuingCardPin = IssuingCardPinService.this.stripeRepository.updateIssuingCardPin(this.$operation.getCardId(), this.$operation.getNewPin(), this.$operation.getVerificationId(), this.$operation.getUserOneTimeCode(), new ApiRequest.Options(this.$ephemeralKey.getSecret(), IssuingCardPinService.this.stripeAccountId, null, 4, null), this);
                if (objUpdateIssuingCardPin != coroutine_suspended) {
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
            objUpdateIssuingCardPin = obj;
            this.label = 2;
        }

        /* compiled from: IssuingCardPinService.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.IssuingCardPinService$fireUpdatePinRequest$1$1", f = "IssuingCardPinService.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.IssuingCardPinService$fireUpdatePinRequest$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Throwable $error;
            final /* synthetic */ IssuingCardPinUpdateListener $listener;
            int label;
            final /* synthetic */ IssuingCardPinService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01431(Throwable th, IssuingCardPinService issuingCardPinService, IssuingCardPinUpdateListener issuingCardPinUpdateListener, Continuation<? super C01431> continuation) {
                super(2, continuation);
                this.$error = th;
                this.this$0 = issuingCardPinService;
                this.$listener = issuingCardPinUpdateListener;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01431(this.$error, this.this$0, this.$listener, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Throwable th = this.$error;
                    if (th != null) {
                        this.label = 1;
                        if (this.this$0.onUpdatePinError(th, this.$listener, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        this.$listener.onIssuingCardPinUpdated();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireUpdatePinRequest(EphemeralKey ephemeralKey, EphemeralOperation.Issuing.UpdatePin operation, IssuingCardPinUpdateListener listener) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new C07341(operation, ephemeralKey, listener, null), 3, null);
    }

    /* compiled from: IssuingCardPinService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.IssuingCardPinService$onUpdatePinError$2", f = "IssuingCardPinService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.IssuingCardPinService$onUpdatePinError$2, reason: invalid class name and case insensitive filesystem */
    static final class C07352 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IssuingCardPinUpdateListener $listener;
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07352(Throwable th, IssuingCardPinUpdateListener issuingCardPinUpdateListener, Continuation<? super C07352> continuation) {
            super(2, continuation);
            this.$throwable = th;
            this.$listener = issuingCardPinUpdateListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C07352(this.$throwable, this.$listener, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = this.$throwable;
            if (th instanceof InvalidRequestException) {
                StripeError stripeError = ((InvalidRequestException) th).getStripeError();
                String code = stripeError != null ? stripeError.getCode() : null;
                if (code != null) {
                    switch (code.hashCode()) {
                        case -1309235419:
                            if (!code.equals("expired")) {
                                this.$listener.onError(CardPinActionError.UNKNOWN_ERROR, "The call to update the PIN failed, possibly an error with the verification.", this.$throwable);
                                break;
                            } else {
                                this.$listener.onError(CardPinActionError.ONE_TIME_CODE_EXPIRED, "The one-time code has expired.", null);
                                break;
                            }
                        case -1266028985:
                            if (code.equals("incorrect_code")) {
                                this.$listener.onError(CardPinActionError.ONE_TIME_CODE_INCORRECT, "The one-time code was incorrect.", null);
                                break;
                            }
                            break;
                        case 830217595:
                            if (code.equals("too_many_attempts")) {
                                this.$listener.onError(CardPinActionError.ONE_TIME_CODE_TOO_MANY_ATTEMPTS, "The verification challenge was attempted too many times.", null);
                                break;
                            }
                            break;
                        case 1888170818:
                            if (code.equals("already_redeemed")) {
                                this.$listener.onError(CardPinActionError.ONE_TIME_CODE_ALREADY_REDEEMED, "The verification challenge was already redeemed.", null);
                                break;
                            }
                            break;
                    }
                }
            } else {
                this.$listener.onError(CardPinActionError.UNKNOWN_ERROR, "An error occurred while updating the PIN.", this.$throwable);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onUpdatePinError(Throwable th, IssuingCardPinUpdateListener issuingCardPinUpdateListener, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C07352(th, issuingCardPinUpdateListener, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logMissingListener() {
        Log.e(TAG, getClass().getName() + " was called without a listener");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IssuingCardPinService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$CardPinActionError;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN_ERROR", "EPHEMERAL_KEY_ERROR", "ONE_TIME_CODE_INCORRECT", "ONE_TIME_CODE_EXPIRED", "ONE_TIME_CODE_TOO_MANY_ATTEMPTS", "ONE_TIME_CODE_ALREADY_REDEEMED", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardPinActionError {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CardPinActionError[] $VALUES;
        public static final CardPinActionError UNKNOWN_ERROR = new CardPinActionError("UNKNOWN_ERROR", 0);
        public static final CardPinActionError EPHEMERAL_KEY_ERROR = new CardPinActionError("EPHEMERAL_KEY_ERROR", 1);
        public static final CardPinActionError ONE_TIME_CODE_INCORRECT = new CardPinActionError("ONE_TIME_CODE_INCORRECT", 2);
        public static final CardPinActionError ONE_TIME_CODE_EXPIRED = new CardPinActionError("ONE_TIME_CODE_EXPIRED", 3);
        public static final CardPinActionError ONE_TIME_CODE_TOO_MANY_ATTEMPTS = new CardPinActionError("ONE_TIME_CODE_TOO_MANY_ATTEMPTS", 4);
        public static final CardPinActionError ONE_TIME_CODE_ALREADY_REDEEMED = new CardPinActionError("ONE_TIME_CODE_ALREADY_REDEEMED", 5);

        private static final /* synthetic */ CardPinActionError[] $values() {
            return new CardPinActionError[]{UNKNOWN_ERROR, EPHEMERAL_KEY_ERROR, ONE_TIME_CODE_INCORRECT, ONE_TIME_CODE_EXPIRED, ONE_TIME_CODE_TOO_MANY_ATTEMPTS, ONE_TIME_CODE_ALREADY_REDEEMED};
        }

        public static EnumEntries<CardPinActionError> getEntries() {
            return $ENTRIES;
        }

        private CardPinActionError(String str, int i) {
        }

        static {
            CardPinActionError[] cardPinActionErrorArr$values = $values();
            $VALUES = cardPinActionErrorArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(cardPinActionErrorArr$values);
        }

        public static CardPinActionError valueOf(String str) {
            return (CardPinActionError) Enum.valueOf(CardPinActionError.class, str);
        }

        public static CardPinActionError[] values() {
            return (CardPinActionError[]) $VALUES.clone();
        }
    }

    /* compiled from: IssuingCardPinService.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0007R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/IssuingCardPinService$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "create", "Lcom/stripe/android/IssuingCardPinService;", "context", "Landroid/content/Context;", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String create$lambda$0(String str) {
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String create$lambda$1(String str) {
            return str;
        }

        @JvmStatic
        public final IssuingCardPinService create(Context context, String publishableKey, EphemeralKeyProvider keyProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
            return create$default(this, context, publishableKey, null, keyProvider, 4, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final IssuingCardPinService create(Context context, EphemeralKeyProvider keyProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
            PaymentConfiguration companion = PaymentConfiguration.INSTANCE.getInstance(context);
            return create(context, companion.getPublishableKey(), companion.getStripeAccountId(), keyProvider);
        }

        public static /* synthetic */ IssuingCardPinService create$default(Companion companion, Context context, String str, String str2, EphemeralKeyProvider ephemeralKeyProvider, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(context, str, str2, ephemeralKeyProvider);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final IssuingCardPinService create(Context context, final String publishableKey, String stripeAccountId, EphemeralKeyProvider keyProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
            Log.w(IssuingCardPinService.TAG, "Please use Issuing Elements instead: https://stripe.com/docs/issuing/elements");
            Logger logger = null;
            CoroutineContext coroutineContext = null;
            Set set = null;
            StripeNetworkClient stripeNetworkClient = null;
            AnalyticsRequestExecutor analyticsRequestExecutor = null;
            FraudDetectionDataRepository fraudDetectionDataRepository = null;
            CardAccountRangeRepository.Factory factory = null;
            FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils = null;
            Set set2 = null;
            String str = null;
            String str2 = null;
            return new IssuingCardPinService(keyProvider, new StripeApiRepository(context, new Function0() { // from class: com.stripe.android.IssuingCardPinService$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IssuingCardPinService.Companion.create$lambda$0(publishableKey);
                }
            }, Stripe.INSTANCE.getAppInfo(), logger, coroutineContext, set, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, factory, new PaymentAnalyticsRequestFactory(context, (Function0<String>) new Function0() { // from class: com.stripe.android.IssuingCardPinService$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IssuingCardPinService.Companion.create$lambda$1(publishableKey);
                }
            }, (Set<String>) SetsKt.setOf("IssuingCardPinService")), fraudDetectionDataParamsUtils, set2, str, str2, 31736, null), new StripeOperationIdFactory(), stripeAccountId, 0 == true ? 1 : 0, 16, 0 == true ? 1 : 0);
        }
    }
}
