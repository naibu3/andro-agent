package com.stripe.android.core.networking;

import android.app.Application;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.core.networking.SendAnalyticsRequestV2Worker;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendAnalyticsRequestV2Worker.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rH\u0082H¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", NativeProtocol.WEB_DIALOG_PARAMS, "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withRequest", "block", "Lkotlin/Function1;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SendAnalyticsRequestV2Worker extends CoroutineWorker {
    public static final String TAG = "SendAnalyticsRequestV2Worker";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static StripeNetworkClient networkClient = new DefaultStripeNetworkClient(null, null, null, 0, null, 31, null);
    private static Function1<? super Context, ? extends AnalyticsRequestV2Storage> storage = new Function1() { // from class: com.stripe.android.core.networking.SendAnalyticsRequestV2Worker$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return SendAnalyticsRequestV2Worker.storage$lambda$4((Context) obj);
        }
    };

    /* compiled from: SendAnalyticsRequestV2Worker.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.SendAnalyticsRequestV2Worker", f = "SendAnalyticsRequestV2Worker.kt", i = {0, 0, 1}, l = {83, 22}, m = "doWork", n = {"this", "this_$iv", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: com.stripe.android.core.networking.SendAnalyticsRequestV2Worker$doWork$1, reason: invalid class name */
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
            return SendAnalyticsRequestV2Worker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAnalyticsRequestV2Worker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        AnonymousClass1 anonymousClass1;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker2;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker3;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        ListenableWorker.Result resultFailure;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objRetrieve = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRetrieve);
            String string = getInputData().getString("data");
            if (string == null) {
                ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(resultFailure2, "failure(...)");
                return resultFailure2;
            }
            Function1<Context, AnalyticsRequestV2Storage> storage2 = INSTANCE.getStorage();
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            AnalyticsRequestV2Storage analyticsRequestV2StorageInvoke = storage2.invoke(applicationContext);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = this;
            anonymousClass1.label = 1;
            objRetrieve = analyticsRequestV2StorageInvoke.retrieve(string, anonymousClass1);
            if (objRetrieve != coroutine_suspended) {
                sendAnalyticsRequestV2Worker = this;
                sendAnalyticsRequestV2Worker2 = sendAnalyticsRequestV2Worker;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sendAnalyticsRequestV2Worker3 = (SendAnalyticsRequestV2Worker) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objRetrieve);
                objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objRetrieve);
            } catch (Throwable th) {
                th = th;
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
                Intrinsics.checkNotNullExpressionValue(resultFailure, "fold(...)");
                return resultFailure;
            }
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
                if (SendAnalyticsRequestV2WorkerKt.getShouldRetry(thM9121exceptionOrNullimpl) && sendAnalyticsRequestV2Worker3.getRunAttemptCount() < 4) {
                    resultFailure = ListenableWorker.Result.retry();
                } else {
                    resultFailure = ListenableWorker.Result.failure();
                }
            } else {
                resultFailure = ListenableWorker.Result.success();
            }
            Intrinsics.checkNotNullExpressionValue(resultFailure, "fold(...)");
            return resultFailure;
        }
        sendAnalyticsRequestV2Worker = (SendAnalyticsRequestV2Worker) anonymousClass1.L$1;
        sendAnalyticsRequestV2Worker2 = (SendAnalyticsRequestV2Worker) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objRetrieve);
        AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) objRetrieve;
        if (analyticsRequestV2 == null) {
            ListenableWorker.Result resultFailure3 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure3, "failure(...)");
            return resultFailure3;
        }
        AnalyticsRequestV2 analyticsRequestV2WithWorkManagerParams = analyticsRequestV2.withWorkManagerParams(sendAnalyticsRequestV2Worker.getRunAttemptCount());
        try {
            Result.Companion companion2 = Result.INSTANCE;
            anonymousClass1.L$0 = sendAnalyticsRequestV2Worker2;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            objRetrieve = networkClient.executeRequest(analyticsRequestV2WithWorkManagerParams, anonymousClass1);
        } catch (Throwable th2) {
            th = th2;
            sendAnalyticsRequestV2Worker3 = sendAnalyticsRequestV2Worker2;
            Result.Companion companion3 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
            }
            Intrinsics.checkNotNullExpressionValue(resultFailure, "fold(...)");
            return resultFailure;
        }
        if (objRetrieve != coroutine_suspended) {
            sendAnalyticsRequestV2Worker3 = sendAnalyticsRequestV2Worker2;
            objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) objRetrieve);
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
            }
            Intrinsics.checkNotNullExpressionValue(resultFailure, "fold(...)");
            return resultFailure;
        }
        return coroutine_suspended;
    }

    private final Object withRequest(Function1<? super AnalyticsRequestV2, ? extends ListenableWorker.Result> function1, Continuation<? super ListenableWorker.Result> continuation) {
        String string = getInputData().getString("data");
        if (string == null) {
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure, "failure(...)");
            return resultFailure;
        }
        Companion companion = INSTANCE;
        Function1<Context, AnalyticsRequestV2Storage> storage2 = companion.getStorage();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) storage2.invoke(applicationContext).retrieve(string, continuation);
        if (analyticsRequestV2 == null) {
            ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure2, "failure(...)");
            return resultFailure2;
        }
        AnalyticsRequestV2 analyticsRequestV2WithWorkManagerParams = analyticsRequestV2.withWorkManagerParams(getRunAttemptCount());
        if (!Intrinsics.areEqual(function1.invoke(analyticsRequestV2WithWorkManagerParams), ListenableWorker.Result.retry())) {
            Function1<Context, AnalyticsRequestV2Storage> storage3 = companion.getStorage();
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            storage3.invoke(applicationContext2).delete(string, continuation);
        }
        return function1.invoke(analyticsRequestV2WithWorkManagerParams);
    }

    /* compiled from: SendAnalyticsRequestV2Worker.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR6\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;", "", "<init>", "()V", "TAG", "", "value", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "networkClient", "getNetworkClient", "()Lcom/stripe/android/core/networking/StripeNetworkClient;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;", "storage", "getStorage", "()Lkotlin/jvm/functions/Function1;", "createInputData", "Landroidx/work/Data;", "id", "setNetworkClient", "", "setStorage", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AnalyticsRequestV2Storage setStorage$lambda$0(AnalyticsRequestV2Storage analyticsRequestV2Storage, Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return analyticsRequestV2Storage;
        }

        private Companion() {
        }

        public final StripeNetworkClient getNetworkClient() {
            return SendAnalyticsRequestV2Worker.networkClient;
        }

        public final Function1<Context, AnalyticsRequestV2Storage> getStorage() {
            return SendAnalyticsRequestV2Worker.storage;
        }

        public final Data createInputData(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            Pair[] pairArr = {TuplesKt.to("data", id)};
            Data.Builder builder = new Data.Builder();
            Pair pair = pairArr[0];
            builder.put((String) pair.getFirst(), pair.getSecond());
            Data dataBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(dataBuild, "dataBuilder.build()");
            return dataBuild;
        }

        public final void setNetworkClient(StripeNetworkClient networkClient) {
            Intrinsics.checkNotNullParameter(networkClient, "networkClient");
            SendAnalyticsRequestV2Worker.networkClient = networkClient;
        }

        public final void setStorage(final AnalyticsRequestV2Storage storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            SendAnalyticsRequestV2Worker.storage = new Function1() { // from class: com.stripe.android.core.networking.SendAnalyticsRequestV2Worker$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SendAnalyticsRequestV2Worker.Companion.setStorage$lambda$0(storage, (Context) obj);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RealAnalyticsRequestV2Storage storage$lambda$4(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context applicationContext = it.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return new RealAnalyticsRequestV2Storage((Application) applicationContext);
    }
}
