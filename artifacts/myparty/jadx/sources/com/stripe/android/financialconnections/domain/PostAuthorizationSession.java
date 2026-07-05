package com.stripe.android.financialconnections.domain;

import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: PostAuthorizationSession.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086B¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", NamedConstantsKt.APPLICATION_ID, "", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/lang/String;)V", "getRepository", "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", BaseJavaModule.METHOD_TYPE_SYNC, "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toDomainException", "Lcom/stripe/android/core/exception/StripeException;", "showManualEntry", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostAuthorizationSession {
    public static final int $stable = 8;
    private final String applicationId;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final FinancialConnectionsManifestRepository repository;

    /* compiled from: PostAuthorizationSession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.PostAuthorizationSession", f = "PostAuthorizationSession.kt", i = {0, 0, 0}, l = {37}, m = "invoke", n = {"this", "institution", BaseJavaModule.METHOD_TYPE_SYNC}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.domain.PostAuthorizationSession$invoke$1, reason: invalid class name */
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
            return PostAuthorizationSession.this.invoke(null, null, this);
        }
    }

    @Inject
    public PostAuthorizationSession(FinancialConnectionsManifestRepository repository, FinancialConnectionsSheetConfiguration configuration, @Named(NamedConstantsKt.APPLICATION_ID) String applicationId) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.repository = repository;
        this.configuration = configuration;
        this.applicationId = applicationId;
    }

    public final FinancialConnectionsManifestRepository getRepository() {
        return this.repository;
    }

    public final FinancialConnectionsSheetConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(FinancialConnectionsInstitution financialConnectionsInstitution, SynchronizeSessionResponse synchronizeSessionResponse, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws StripeException {
        AnonymousClass1 anonymousClass1;
        PostAuthorizationSession postAuthorizationSession;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objPostAuthorizationSession = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objPostAuthorizationSession);
            try {
                FinancialConnectionsManifestRepository financialConnectionsManifestRepository = this.repository;
                String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
                String str = this.applicationId;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = financialConnectionsInstitution;
                anonymousClass1.L$2 = synchronizeSessionResponse;
                anonymousClass1.label = 1;
                objPostAuthorizationSession = financialConnectionsManifestRepository.postAuthorizationSession(financialConnectionsSessionClientSecret, str, financialConnectionsInstitution, anonymousClass1);
                if (objPostAuthorizationSession == coroutine_suspended) {
                    return coroutine_suspended;
                }
                postAuthorizationSession = this;
            } catch (StripeException e) {
                e = e;
                postAuthorizationSession = this;
                throw postAuthorizationSession.toDomainException(e, ManifestExtensionsKt.showManualEntryInErrors(synchronizeSessionResponse), financialConnectionsInstitution);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            synchronizeSessionResponse = (SynchronizeSessionResponse) anonymousClass1.L$2;
            financialConnectionsInstitution = (FinancialConnectionsInstitution) anonymousClass1.L$1;
            postAuthorizationSession = (PostAuthorizationSession) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objPostAuthorizationSession);
            } catch (StripeException e2) {
                e = e2;
                throw postAuthorizationSession.toDomainException(e, ManifestExtensionsKt.showManualEntryInErrors(synchronizeSessionResponse), financialConnectionsInstitution);
            }
        }
        return (FinancialConnectionsAuthorizationSession) objPostAuthorizationSession;
    }

    private final StripeException toDomainException(StripeException stripeException, boolean z, FinancialConnectionsInstitution financialConnectionsInstitution) {
        StripeException stripeException2;
        StripeException stripeException3;
        InstitutionUnplannedDowntimeError institutionUnplannedDowntimeError;
        StripeError stripeError = stripeException.getStripeError();
        if (stripeError == null) {
            return stripeException;
        }
        Map<String, String> extraFields = stripeError.getExtraFields();
        String str = extraFields != null ? extraFields.get("institution_unavailable") : null;
        Map<String, String> extraFields2 = stripeError.getExtraFields();
        String str2 = extraFields2 != null ? extraFields2.get("expected_to_be_available_at") : null;
        if (Intrinsics.areEqual(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            String str3 = str2;
            if (str3 == null || str3.length() == 0) {
                stripeException2 = stripeException;
                institutionUnplannedDowntimeError = new InstitutionUnplannedDowntimeError(financialConnectionsInstitution, z, stripeException2);
            } else {
                Duration.Companion companion = Duration.INSTANCE;
                stripeException2 = stripeException;
                institutionUnplannedDowntimeError = new InstitutionPlannedDowntimeError(financialConnectionsInstitution, z, true, Duration.m10493getInWholeMillisecondsimpl(DurationKt.toDuration(Long.parseLong(str2), DurationUnit.SECONDS)), stripeException2);
            }
            stripeException3 = institutionUnplannedDowntimeError;
        } else {
            stripeException2 = stripeException;
            stripeException3 = stripeException2;
        }
        return stripeException3 == null ? stripeException2 : stripeException3;
    }
}
