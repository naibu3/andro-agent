package com.stripe.android.financialconnections.repository;

import androidx.autofill.HintConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitutionSelected;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsManifestRepository.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 92\u00020\u0001:\u00019J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\nH¦@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0016J4\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH¦@¢\u0006\u0002\u0010\u001eJ*\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u000eJ\u001e\u0010#\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010$J&\u0010&\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010!JX\u0010(\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u00052\b\u0010*\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010-\u001a\u0004\u0018\u00010\u00052\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010/H¦@¢\u0006\u0002\u00100J*\u00101\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u00052\b\u00103\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010!J\u0016\u00104\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u000eJ\u0016\u00105\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u000eJ\u001c\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\nH&¨\u0006:"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "", "getOrSynchronizeFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "clientSecret", "", NamedConstantsKt.APPLICATION_ID, "supportsAppVerification", "", "reFetchCondition", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markConsentAcquired", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectInstitution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitutionSelected;", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionEvent", "clientTimestamp", "Ljava/util/Date;", "sessionId", "authSessionEvents", "", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeAuthorizationSession", "publicToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postMarkLinkingMoreAccounts", "cancelAuthorizationSession", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveAuthorizationSession", "repairAuthorizationSession", "coreAuthorization", "postSaveAccountsToLink", "email", "country", "locale", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "consumerSessionClientSecret", "selectedAccounts", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableNetworking", "disabledReason", "clientSuggestedNextPaneOnDisableNetworking", "postMarkLinkVerified", "postMarkLinkStepUpVerified", "updateLocalManifest", "", "block", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsManifestRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object cancelAuthorizationSession(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object completeAuthorizationSession(String str, String str2, String str3, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException;

    Object disableNetworking(String str, String str2, String str3, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    Object getOrSynchronizeFinancialConnectionsSession(String str, String str2, boolean z, Function1<? super SynchronizeSessionResponse, Boolean> function1, Continuation<? super SynchronizeSessionResponse> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException;

    Object markConsentAcquired(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException;

    Object postAuthorizationSession(String str, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super FinancialConnectionsAuthorizationSession> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException;

    Object postAuthorizationSessionEvent(String str, Date date, String str2, List<? extends AuthSessionEvent> list, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object postMarkLinkStepUpVerified(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    Object postMarkLinkVerified(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    Object postMarkLinkingMoreAccounts(String str, Continuation<? super FinancialConnectionsSessionManifest> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException;

    Object postSaveAccountsToLink(String str, String str2, String str3, String str4, String str5, String str6, Set<String> set, Continuation<? super FinancialConnectionsSessionManifest> continuation);

    Object repairAuthorizationSession(String str, String str2, String str3, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object retrieveAuthorizationSession(String str, String str2, Continuation<? super FinancialConnectionsAuthorizationSession> continuation);

    Object selectInstitution(String str, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation<? super FinancialConnectionsInstitutionSelected> continuation) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException;

    void updateLocalManifest(Function1<? super FinancialConnectionsSessionManifest, FinancialConnectionsSessionManifest> block);

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object completeAuthorizationSession$default(FinancialConnectionsManifestRepository financialConnectionsManifestRepository, String str, String str2, String str3, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: completeAuthorizationSession");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return financialConnectionsManifestRepository.completeAuthorizationSession(str, str2, str3, continuation);
        }
    }

    /* compiled from: FinancialConnectionsManifestRepository.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086\u0002¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository$Companion;", "", "<init>", "()V", "invoke", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "logger", "Lcom/stripe/android/core/Logger;", "locale", "Ljava/util/Locale;", "initialSync", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final FinancialConnectionsManifestRepository invoke(FinancialConnectionsRequestExecutor requestExecutor, ApiRequest.Factory apiRequestFactory, ProvideApiRequestOptions provideApiRequestOptions, Logger logger, Locale locale, SynchronizeSessionResponse initialSync) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(locale, "locale");
            return new FinancialConnectionsManifestRepositoryImpl(requestExecutor, apiRequestFactory, provideApiRequestOptions, locale, logger, initialSync);
        }
    }
}
