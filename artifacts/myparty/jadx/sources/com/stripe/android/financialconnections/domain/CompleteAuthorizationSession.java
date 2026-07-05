package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: CompleteAuthorizationSession.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086B¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/domain/CompleteAuthorizationSession;", "", "coordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "<init>", "(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "authorizationSessionId", "", "publicToken", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompleteAuthorizationSession {
    public static final int $stable = 8;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final NativeAuthFlowCoordinator coordinator;
    private final FinancialConnectionsManifestRepository repository;

    /* compiled from: CompleteAuthorizationSession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.CompleteAuthorizationSession", f = "CompleteAuthorizationSession.kt", i = {0}, l = {19, 23}, m = "invoke", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.domain.CompleteAuthorizationSession$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CompleteAuthorizationSession.this.invoke(null, null, this);
        }
    }

    @Inject
    public CompleteAuthorizationSession(NativeAuthFlowCoordinator coordinator, FinancialConnectionsManifestRepository repository, FinancialConnectionsSheetConfiguration configuration) {
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.coordinator = coordinator;
        this.repository = repository;
        this.configuration = configuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        AnonymousClass1 anonymousClass1;
        CompleteAuthorizationSession completeAuthorizationSession;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objCompleteAuthorizationSession = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objCompleteAuthorizationSession);
            FinancialConnectionsManifestRepository financialConnectionsManifestRepository = this.repository;
            String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objCompleteAuthorizationSession = financialConnectionsManifestRepository.completeAuthorizationSession(financialConnectionsSessionClientSecret, str, str2, anonymousClass1);
            if (objCompleteAuthorizationSession != coroutine_suspended) {
                completeAuthorizationSession = this;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = anonymousClass1.L$0;
            ResultKt.throwOnFailure(objCompleteAuthorizationSession);
            return obj;
        }
        completeAuthorizationSession = (CompleteAuthorizationSession) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objCompleteAuthorizationSession);
        MutableSharedFlow<NativeAuthFlowCoordinator.Message> mutableSharedFlowInvoke = completeAuthorizationSession.coordinator.invoke();
        NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth clearPartnerWebAuth = NativeAuthFlowCoordinator.Message.ClearPartnerWebAuth.INSTANCE;
        anonymousClass1.L$0 = objCompleteAuthorizationSession;
        anonymousClass1.label = 2;
        return mutableSharedFlowInvoke.emit(clearPartnerWebAuth, anonymousClass1) == coroutine_suspended ? coroutine_suspended : objCompleteAuthorizationSession;
    }
}
