package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: PostAuthSessionEvent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\u0002J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/domain/PostAuthSessionEvent;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "logger", "Lcom/stripe/android/core/Logger;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V", "invoke", "", "sessionId", "", "events", "", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "event", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostAuthSessionEvent {
    public static final int $stable = 8;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final Logger logger;
    private final FinancialConnectionsManifestRepository repository;

    @Inject
    public PostAuthSessionEvent(FinancialConnectionsManifestRepository repository, Logger logger, FinancialConnectionsSheetConfiguration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.logger = logger;
        this.configuration = configuration;
    }

    /* compiled from: PostAuthSessionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PostAuthSessionEvent$invoke$1", f = "PostAuthSessionEvent.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.PostAuthSessionEvent$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<AuthSessionEvent> $events;
        final /* synthetic */ String $sessionId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(String str, List<? extends AuthSessionEvent> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sessionId = str;
            this.$events = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = PostAuthSessionEvent.this.new AnonymousClass1(this.$sessionId, this.$events, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Throwable th;
            Object objM9118constructorimpl;
            Throwable thM9121exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostAuthSessionEvent postAuthSessionEvent = PostAuthSessionEvent.this;
                String str = this.$sessionId;
                List<AuthSessionEvent> list = this.$events;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    FinancialConnectionsManifestRepository financialConnectionsManifestRepository = postAuthSessionEvent.repository;
                    Date date = new Date();
                    String financialConnectionsSessionClientSecret = postAuthSessionEvent.configuration.getFinancialConnectionsSessionClientSecret();
                    this.label = 1;
                    anonymousClass1 = this;
                    try {
                        obj = financialConnectionsManifestRepository.postAuthorizationSessionEvent(financialConnectionsSessionClientSecret, date, str, list, anonymousClass1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        PostAuthSessionEvent postAuthSessionEvent2 = PostAuthSessionEvent.this;
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    anonymousClass1 = this;
                    th = th;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    PostAuthSessionEvent postAuthSessionEvent22 = PostAuthSessionEvent.this;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass1 = this;
                    Result.Companion companion222 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    PostAuthSessionEvent postAuthSessionEvent222 = PostAuthSessionEvent.this;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            objM9118constructorimpl = Result.m9118constructorimpl((FinancialConnectionsAuthorizationSession) obj);
            PostAuthSessionEvent postAuthSessionEvent2222 = PostAuthSessionEvent.this;
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                postAuthSessionEvent2222.logger.error("error posting auth session event", thM9121exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public final void invoke(String sessionId, List<? extends AuthSessionEvent> events) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(events, "events");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AnonymousClass1(sessionId, events, null), 2, null);
    }

    public final void invoke(String sessionId, AuthSessionEvent event) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(event, "event");
        invoke(sessionId, CollectionsKt.listOf(event));
    }
}
