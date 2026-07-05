package com.stripe.android.core.networking;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.Constraints;
import androidx.work.DirectExecutor;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.google.common.util.concurrent.ListenableFuture;
import com.stripe.android.core.Logger;
import com.stripe.android.core.utils.IsWorkManagerAvailable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: AnalyticsRequestV2Executor.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;", "context", "Landroid/content/Context;", "networkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "logger", "Lcom/stripe/android/core/Logger;", "storage", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;", "isWorkManagerAvailable", "Lcom/stripe/android/core/utils/IsWorkManagerAvailable;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;Lcom/stripe/android/core/utils/IsWorkManagerAvailable;)V", "enqueue", "", "request", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueRequest", "", "executeRequest", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultAnalyticsRequestV2Executor implements AnalyticsRequestV2Executor {
    private final Context context;
    private final IsWorkManagerAvailable isWorkManagerAvailable;
    private final Logger logger;
    private final StripeNetworkClient networkClient;
    private final AnalyticsRequestV2Storage storage;

    /* compiled from: AnalyticsRequestV2Executor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor", f = "AnalyticsRequestV2Executor.kt", i = {0, 0, 1, 1}, l = {29, 29, 31}, m = "enqueue", n = {"this", "request", "this", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor$enqueue$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAnalyticsRequestV2Executor.this.enqueue(null, this);
        }
    }

    /* compiled from: AnalyticsRequestV2Executor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor", f = "AnalyticsRequestV2Executor.kt", i = {0, 0, 1, 1}, l = {37, 74}, m = "enqueueRequest", n = {"this", "workManager", "$completion$iv", "$this$await$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor$enqueueRequest$1, reason: invalid class name and case insensitive filesystem */
    static final class C08031 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C08031(Continuation<? super C08031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAnalyticsRequestV2Executor.this.enqueueRequest(null, this);
        }
    }

    /* compiled from: AnalyticsRequestV2Executor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor", f = "AnalyticsRequestV2Executor.kt", i = {0, 0, 0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "executeRequest", n = {"this", "request", "$this$executeRequest_u24lambda_u241"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor$executeRequest$1, reason: invalid class name and case insensitive filesystem */
    static final class C08041 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C08041(Continuation<? super C08041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAnalyticsRequestV2Executor.this.executeRequest(null, this);
        }
    }

    @Inject
    public DefaultAnalyticsRequestV2Executor(Context context, StripeNetworkClient networkClient, Logger logger, AnalyticsRequestV2Storage storage, IsWorkManagerAvailable isWorkManagerAvailable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(isWorkManagerAvailable, "isWorkManagerAvailable");
        this.context = context;
        this.networkClient = networkClient;
        this.logger = logger;
        this.storage = storage;
        this.isWorkManagerAvailable = isWorkManagerAvailable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r2.executeRequest(r7, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.core.networking.AnalyticsRequestV2Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object enqueue(AnalyticsRequestV2 analyticsRequestV2, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor;
        boolean z;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            IsWorkManagerAvailable isWorkManagerAvailable = this.isWorkManagerAvailable;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = analyticsRequestV2;
            anonymousClass1.label = 1;
            objInvoke = isWorkManagerAvailable.invoke(anonymousClass1);
            if (objInvoke != coroutine_suspended) {
                defaultAnalyticsRequestV2Executor = this;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            analyticsRequestV2 = (AnalyticsRequestV2) anonymousClass1.L$1;
            defaultAnalyticsRequestV2Executor = (DefaultAnalyticsRequestV2Executor) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objInvoke);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            analyticsRequestV2 = (AnalyticsRequestV2) anonymousClass1.L$1;
            defaultAnalyticsRequestV2Executor = (DefaultAnalyticsRequestV2Executor) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            z = ((Boolean) objInvoke).booleanValue();
            if (!z) {
                return Unit.INSTANCE;
            }
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 3;
        }
        if (((Boolean) objInvoke).booleanValue()) {
            anonymousClass1.L$0 = defaultAnalyticsRequestV2Executor;
            anonymousClass1.L$1 = analyticsRequestV2;
            anonymousClass1.label = 2;
            objInvoke = defaultAnalyticsRequestV2Executor.enqueueRequest(analyticsRequestV2, anonymousClass1);
        }
        if (!z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0114, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enqueueRequest(AnalyticsRequestV2 analyticsRequestV2, Continuation<? super Boolean> continuation) throws Throwable {
        C08031 c08031;
        Object objM9118constructorimpl;
        WorkManager workManager;
        DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor;
        Object obj;
        if (continuation instanceof C08031) {
            c08031 = (C08031) continuation;
            if ((c08031.label & Integer.MIN_VALUE) != 0) {
                c08031.label -= Integer.MIN_VALUE;
            } else {
                c08031 = new C08031(continuation);
            }
        }
        Object result = c08031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08031.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(result);
            WorkManager workManager2 = WorkManager.getInstance(this.context);
            Intrinsics.checkNotNullExpressionValue(workManager2, "getInstance(...)");
            AnalyticsRequestV2Storage analyticsRequestV2Storage = this.storage;
            c08031.L$0 = this;
            c08031.L$1 = workManager2;
            c08031.label = 1;
            Object objStore = analyticsRequestV2Storage.store(analyticsRequestV2, c08031);
            if (objStore != coroutine_suspended) {
                result = objStore;
                workManager = workManager2;
                defaultAnalyticsRequestV2Executor = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(result);
            obj = result;
            Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
            objM9118constructorimpl = Result.m9118constructorimpl((Operation.State.SUCCESS) obj);
            return Boxing.boxBoolean(Result.m9125isSuccessimpl(objM9118constructorimpl));
        }
        workManager = (WorkManager) c08031.L$1;
        defaultAnalyticsRequestV2Executor = (DefaultAnalyticsRequestV2Executor) c08031.L$0;
        ResultKt.throwOnFailure(result);
        WorkRequest workRequest = (OneTimeWorkRequest) new OneTimeWorkRequest.Builder(SendAnalyticsRequestV2Worker.class).addTag(SendAnalyticsRequestV2Worker.TAG).setInputData(SendAnalyticsRequestV2Worker.INSTANCE.createInputData((String) result)).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build();
        Result.Companion companion2 = Result.INSTANCE;
        Operation operationEnqueue = workManager.enqueue(workRequest);
        Intrinsics.checkNotNullExpressionValue(operationEnqueue, "enqueue(...)");
        final ListenableFuture result2 = operationEnqueue.getResult();
        Intrinsics.checkNotNullExpressionValue(result2, "result");
        if (result2.isDone()) {
            try {
                obj = result2.get();
                Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
                objM9118constructorimpl = Result.m9118constructorimpl((Operation.State.SUCCESS) obj);
                return Boxing.boxBoolean(Result.m9125isSuccessimpl(objM9118constructorimpl));
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        c08031.L$0 = c08031;
        c08031.L$1 = result2;
        c08031.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c08031), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        result2.addListener(new Runnable() { // from class: com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor$enqueueRequest$lambda$0$$inlined$await$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion3 = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m9118constructorimpl(result2.get()));
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        cause2 = th2;
                    }
                    if (th2 instanceof CancellationException) {
                        cancellableContinuationImpl2.cancel(cause2);
                        return;
                    }
                    CancellableContinuation cancellableContinuation2 = cancellableContinuationImpl2;
                    Result.Companion companion4 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m9118constructorimpl(ResultKt.createFailure(cause2)));
                }
            }
        }, (Executor) DirectExecutor.INSTANCE);
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor$enqueueRequest$lambda$0$$inlined$await$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                result2.cancel(false);
            }
        });
        result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c08031);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeRequest(AnalyticsRequestV2 analyticsRequestV2, Continuation<? super Unit> continuation) {
        C08041 c08041;
        DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor;
        AnalyticsRequestV2 analyticsRequestV22;
        DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor2;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C08041) {
            c08041 = (C08041) continuation;
            if ((c08041.label & Integer.MIN_VALUE) != 0) {
                c08041.label -= Integer.MIN_VALUE;
            } else {
                c08041 = new C08041(continuation);
            }
        }
        Object obj = c08041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08041.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion = Result.INSTANCE;
                DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor3 = this;
                c08041.L$0 = this;
                c08041.L$1 = analyticsRequestV2;
                c08041.L$2 = this;
                c08041.label = 1;
                if (this.networkClient.executeRequest(analyticsRequestV2, c08041) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultAnalyticsRequestV2Executor = this;
                analyticsRequestV22 = analyticsRequestV2;
                defaultAnalyticsRequestV2Executor2 = defaultAnalyticsRequestV2Executor;
            } catch (Throwable th) {
                th = th;
                defaultAnalyticsRequestV2Executor = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultAnalyticsRequestV2Executor2 = (DefaultAnalyticsRequestV2Executor) c08041.L$2;
            analyticsRequestV22 = (AnalyticsRequestV2) c08041.L$1;
            defaultAnalyticsRequestV2Executor = (DefaultAnalyticsRequestV2Executor) c08041.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
        }
        defaultAnalyticsRequestV2Executor2.logger.debug("EVENT: " + analyticsRequestV22.getEventName());
        objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            defaultAnalyticsRequestV2Executor.logger.error("Exception while making analytics request", thM9121exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
