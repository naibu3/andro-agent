package com.stripe.android.core.frauddetection;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: FraudDetectionDataRepository.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;", "localStore", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;", "fraudDetectionDataRequestFactory", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "errorReporter", "Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "fraudDetectionEnabledProvider", "Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;", "<init>", "(Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/frauddetection/FraudDetectionErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/frauddetection/FraudDetectionEnabledProvider;)V", "cachedFraudDetectionData", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "fraudDetectionEnabled", "", "getFraudDetectionEnabled", "()Z", "refresh", "", "getLatest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCached", "save", "fraudDetectionData", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultFraudDetectionDataRepository implements FraudDetectionDataRepository {
    private FraudDetectionData cachedFraudDetectionData;
    private final FraudDetectionErrorReporter errorReporter;
    private final FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory;
    private final FraudDetectionEnabledProvider fraudDetectionEnabledProvider;
    private final FraudDetectionDataStore localStore;
    private final StripeNetworkClient stripeNetworkClient;
    private final CoroutineContext workContext;

    public DefaultFraudDetectionDataRepository(FraudDetectionDataStore localStore, FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory, StripeNetworkClient stripeNetworkClient, FraudDetectionErrorReporter errorReporter, CoroutineContext workContext, FraudDetectionEnabledProvider fraudDetectionEnabledProvider) {
        Intrinsics.checkNotNullParameter(localStore, "localStore");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRequestFactory, "fraudDetectionDataRequestFactory");
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(fraudDetectionEnabledProvider, "fraudDetectionEnabledProvider");
        this.localStore = localStore;
        this.fraudDetectionDataRequestFactory = fraudDetectionDataRequestFactory;
        this.stripeNetworkClient = stripeNetworkClient;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.fraudDetectionEnabledProvider = fraudDetectionEnabledProvider;
    }

    private final boolean getFraudDetectionEnabled() {
        return this.fraudDetectionEnabledProvider.provideFraudDetectionEnabled();
    }

    /* compiled from: FraudDetectionDataRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository$refresh$1", f = "FraudDetectionDataRepository.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository$refresh$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultFraudDetectionDataRepository.this.new AnonymousClass1(continuation);
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
                if (DefaultFraudDetectionDataRepository.this.getLatest(this) == coroutine_suspended) {
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

    @Override // com.stripe.android.core.frauddetection.FraudDetectionDataRepository
    public void refresh() {
        if (getFraudDetectionEnabled()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(null), 3, null);
        }
    }

    /* compiled from: FraudDetectionDataRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository$getLatest$2", f = "FraudDetectionDataRepository.kt", i = {0}, l = {71, 77}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
    /* renamed from: com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository$getLatest$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FraudDetectionData>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = DefaultFraudDetectionDataRepository.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FraudDetectionData> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b8 A[ADDED_TO_REGION] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FraudDetectionData fraudDetectionData;
            DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository;
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.L$0 = (CoroutineScope) this.L$0;
                this.label = 1;
                obj = DefaultFraudDetectionDataRepository.this.localStore.get(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defaultFraudDetectionDataRepository = (DefaultFraudDetectionDataRepository) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    objM9118constructorimpl = Result.m9118constructorimpl(FraudDetectionDataRepositoryKt.fraudDetectionData((StripeResponse) obj));
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    }
                    fraudDetectionData = (FraudDetectionData) objM9118constructorimpl;
                    if (!Intrinsics.areEqual(DefaultFraudDetectionDataRepository.this.cachedFraudDetectionData, fraudDetectionData)) {
                    }
                    return fraudDetectionData;
                }
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    defaultFraudDetectionDataRepository.errorReporter.reportFraudDetectionError(StripeException.INSTANCE.create(thM9121exceptionOrNullimpl));
                }
                if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    objM9118constructorimpl = null;
                }
                fraudDetectionData = (FraudDetectionData) objM9118constructorimpl;
                if (!Intrinsics.areEqual(DefaultFraudDetectionDataRepository.this.cachedFraudDetectionData, fraudDetectionData) && fraudDetectionData != null) {
                    DefaultFraudDetectionDataRepository.this.save(fraudDetectionData);
                }
                return fraudDetectionData;
            }
            ResultKt.throwOnFailure(obj);
            DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository2 = DefaultFraudDetectionDataRepository.this;
            fraudDetectionData = (FraudDetectionData) obj;
            if (fraudDetectionData == null || fraudDetectionData.isExpired(((Number) FraudDetectionDataRepositoryKt.timestampSupplier.invoke()).longValue())) {
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    StripeNetworkClient stripeNetworkClient = defaultFraudDetectionDataRepository2.stripeNetworkClient;
                    FraudDetectionDataRequest fraudDetectionDataRequestCreate = defaultFraudDetectionDataRepository2.fraudDetectionDataRequestFactory.create(fraudDetectionData);
                    this.L$0 = defaultFraudDetectionDataRepository2;
                    this.label = 2;
                    obj = stripeNetworkClient.executeRequest(fraudDetectionDataRequestCreate, this);
                } catch (Throwable th2) {
                    th = th2;
                    defaultFraudDetectionDataRepository = defaultFraudDetectionDataRepository2;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    }
                    fraudDetectionData = (FraudDetectionData) objM9118constructorimpl;
                    if (!Intrinsics.areEqual(DefaultFraudDetectionDataRepository.this.cachedFraudDetectionData, fraudDetectionData)) {
                    }
                    return fraudDetectionData;
                }
                if (obj != coroutine_suspended) {
                    defaultFraudDetectionDataRepository = defaultFraudDetectionDataRepository2;
                    objM9118constructorimpl = Result.m9118constructorimpl(FraudDetectionDataRepositoryKt.fraudDetectionData((StripeResponse) obj));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    }
                    fraudDetectionData = (FraudDetectionData) objM9118constructorimpl;
                }
                return coroutine_suspended;
            }
            if (!Intrinsics.areEqual(DefaultFraudDetectionDataRepository.this.cachedFraudDetectionData, fraudDetectionData)) {
                DefaultFraudDetectionDataRepository.this.save(fraudDetectionData);
            }
            return fraudDetectionData;
        }
    }

    @Override // com.stripe.android.core.frauddetection.FraudDetectionDataRepository
    public Object getLatest(Continuation<? super FraudDetectionData> continuation) {
        return BuildersKt.withContext(this.workContext, new AnonymousClass2(null), continuation);
    }

    @Override // com.stripe.android.core.frauddetection.FraudDetectionDataRepository
    public FraudDetectionData getCached() {
        FraudDetectionData fraudDetectionData = this.cachedFraudDetectionData;
        if (getFraudDetectionEnabled()) {
            return fraudDetectionData;
        }
        return null;
    }

    @Override // com.stripe.android.core.frauddetection.FraudDetectionDataRepository
    public void save(FraudDetectionData fraudDetectionData) {
        Intrinsics.checkNotNullParameter(fraudDetectionData, "fraudDetectionData");
        this.cachedFraudDetectionData = fraudDetectionData;
        this.localStore.save(fraudDetectionData);
    }
}
