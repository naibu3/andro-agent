package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.attestation.IntegrityRequestManager;
import jakarta.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestIntegrityToken.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;", "", "integrityRequestManager", "Lcom/stripe/attestation/IntegrityRequestManager;", "analyticsTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "<init>", "(Lcom/stripe/attestation/IntegrityRequestManager;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;)V", "invoke", "", "endpoint", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RequestIntegrityToken {
    public static final int $stable = 8;
    private final FinancialConnectionsAnalyticsTracker analyticsTracker;
    private final IntegrityRequestManager integrityRequestManager;

    /* compiled from: RequestIntegrityToken.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.RequestIntegrityToken", f = "RequestIntegrityToken.kt", i = {0, 0, 0}, l = {18}, m = "invoke", n = {"this", "endpoint", "pane"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.domain.RequestIntegrityToken$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RequestIntegrityToken.this.invoke(null, null, this);
        }
    }

    @Inject
    public RequestIntegrityToken(IntegrityRequestManager integrityRequestManager, FinancialConnectionsAnalyticsTracker analyticsTracker) {
        Intrinsics.checkNotNullParameter(integrityRequestManager, "integrityRequestManager");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        this.integrityRequestManager = integrityRequestManager;
        this.analyticsTracker = analyticsTracker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(FinancialConnectionsAnalyticsEvent.AttestationEndpoint attestationEndpoint, FinancialConnectionsSessionManifest.Pane pane, Continuation<? super String> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objM8936requestTokengIAlus$default;
        RequestIntegrityToken requestIntegrityToken;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            IntegrityRequestManager integrityRequestManager = this.integrityRequestManager;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = attestationEndpoint;
            anonymousClass1.L$2 = pane;
            anonymousClass1.label = 1;
            objM8936requestTokengIAlus$default = IntegrityRequestManager.DefaultImpls.m8936requestTokengIAlus$default(integrityRequestManager, null, anonymousClass1, 1, null);
            if (objM8936requestTokengIAlus$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            requestIntegrityToken = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pane = (FinancialConnectionsSessionManifest.Pane) anonymousClass1.L$2;
            attestationEndpoint = (FinancialConnectionsAnalyticsEvent.AttestationEndpoint) anonymousClass1.L$1;
            requestIntegrityToken = (RequestIntegrityToken) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            objM8936requestTokengIAlus$default = ((Result) obj).getValue();
        }
        if (Result.m9125isSuccessimpl(objM8936requestTokengIAlus$default)) {
            requestIntegrityToken.analyticsTracker.track(new FinancialConnectionsAnalyticsEvent.AttestationRequestSucceeded(pane, attestationEndpoint));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8936requestTokengIAlus$default);
        if (thM9121exceptionOrNullimpl != null) {
            requestIntegrityToken.analyticsTracker.track(new FinancialConnectionsAnalyticsEvent.AttestationRequestFailed(pane, attestationEndpoint, thM9121exceptionOrNullimpl));
        }
        ResultKt.throwOnFailure(objM8936requestTokengIAlus$default);
        return objM8936requestTokengIAlus$default;
    }
}
