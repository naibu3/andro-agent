package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.stripe.android.financialconnections.utils.PollTimingOptions;
import expo.modules.notifications.service.NotificationsService;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: PollAuthorizationSessionOAuthResults.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionOAuthResults;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;", "session", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PollAuthorizationSessionOAuthResults {
    public static final int $stable = 8;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FinancialConnectionsRepository repository;

    @Inject
    public PollAuthorizationSessionOAuthResults(FinancialConnectionsRepository repository, FinancialConnectionsSheetConfiguration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.configuration = configuration;
    }

    public final Object invoke(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, Continuation<? super MixedOAuthParams> continuation) {
        Duration.Companion companion = Duration.INSTANCE;
        return ErrorsKt.retryOnException(new PollTimingOptions(0L, 300, Duration.m10493getInWholeMillisecondsimpl(DurationKt.toDuration(2, DurationUnit.SECONDS))), new AnonymousClass2(null), new AnonymousClass3(financialConnectionsAuthorizationSession, null), continuation);
    }

    /* compiled from: PollAuthorizationSessionOAuthResults.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", NotificationsService.EXCEPTION_KEY, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults$invoke$2", f = "PollAuthorizationSessionOAuthResults.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults$invoke$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(ErrorsKt.getShouldRetry((Throwable) this.L$0));
        }
    }

    /* compiled from: PollAuthorizationSessionOAuthResults.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults$invoke$3", f = "PollAuthorizationSessionOAuthResults.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults$invoke$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function1<Continuation<? super MixedOAuthParams>, Object> {
        final /* synthetic */ FinancialConnectionsAuthorizationSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, Continuation<? super AnonymousClass3> continuation) {
            super(1, continuation);
            this.$session = financialConnectionsAuthorizationSession;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PollAuthorizationSessionOAuthResults.this.new AnonymousClass3(this.$session, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super MixedOAuthParams> continuation) {
            return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objPostAuthorizationSessionOAuthResults = PollAuthorizationSessionOAuthResults.this.repository.postAuthorizationSessionOAuthResults(PollAuthorizationSessionOAuthResults.this.configuration.getFinancialConnectionsSessionClientSecret(), this.$session.getId(), this);
            return objPostAuthorizationSessionOAuthResults == coroutine_suspended ? coroutine_suspended : objPostAuthorizationSessionOAuthResults;
        }
    }
}
