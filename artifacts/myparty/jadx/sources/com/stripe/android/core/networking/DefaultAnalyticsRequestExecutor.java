package com.stripe.android.core.networking;

import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import javax.inject.Inject;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DefaultAnalyticsRequestExecutor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)V", "()V", "(Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;)V", "executeAsync", "", "request", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultAnalyticsRequestExecutor implements AnalyticsRequestExecutor {
    public static final String FIELD_EVENT = "event";
    private final Logger logger;
    private final StripeNetworkClient stripeNetworkClient;
    private final CoroutineContext workContext;

    public DefaultAnalyticsRequestExecutor(StripeNetworkClient stripeNetworkClient, @IOContext CoroutineContext workContext, Logger logger) {
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.stripeNetworkClient = stripeNetworkClient;
        this.workContext = workContext;
        this.logger = logger;
    }

    public DefaultAnalyticsRequestExecutor() {
        this(Logger.INSTANCE.noop(), Dispatchers.getIO());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public DefaultAnalyticsRequestExecutor(Logger logger, @IOContext CoroutineContext workContext) {
        this(new DefaultStripeNetworkClient(workContext, null, null, 0, logger, 14, null), workContext, logger);
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestExecutor
    public void executeAsync(AnalyticsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.logger.info("Event: " + request.getParams().get("event"));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(request, null), 3, null);
    }

    /* compiled from: DefaultAnalyticsRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor$executeAsync$1", f = "DefaultAnalyticsRequestExecutor.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnalyticsRequest $request;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnalyticsRequest analyticsRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = analyticsRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DefaultAnalyticsRequestExecutor.this.new AnonymousClass1(this.$request, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = DefaultAnalyticsRequestExecutor.this;
                    AnalyticsRequest analyticsRequest = this.$request;
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    obj = defaultAnalyticsRequestExecutor.stripeNetworkClient.executeRequest(analyticsRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM9118constructorimpl = Result.m9118constructorimpl((StripeResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor2 = DefaultAnalyticsRequestExecutor.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                defaultAnalyticsRequestExecutor2.logger.error("Exception while making analytics request", thM9121exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }
}
