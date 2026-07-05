package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.network.NetworkConstants;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.financialconnections.utils.BillingDetailsExtensionsKt;
import com.stripe.android.financialconnections.utils.CollectionsKt;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsRepository.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0018J(\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096@¢\u0006\u0002\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "fraudDetectionDataRepository", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "<init>", "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V", "getFinancialConnectionsAccounts", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "getFinancialConnectionsAcccountsParams", "Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;", "(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postCompleteFinancialConnectionsSessions", "terminalError", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionOAuthResults", "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;", "sessionId", "createPaymentMethod", "paymentDetailsId", "consumerSessionClientSecret", "billingDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsRepositoryImpl implements FinancialConnectionsRepository {
    private static final String authorizationSessionOAuthResultsUrl = "https://api.stripe.com/v1/connections/auth_sessions/oauth_results";
    public static final String authorizationSessionUrl = "https://api.stripe.com/v1/connections/auth_sessions";
    public static final String authorizeSessionUrl = "https://api.stripe.com/v1/connections/auth_sessions/authorized";
    private static final String completeUrl = "https://api.stripe.com/v1/link_account_sessions/complete";
    private static final String listAccountsUrl = "https://api.stripe.com/v1/link_account_sessions/list_accounts";
    private static final String paymentMethodsUrl = "https://api.stripe.com/v1/payment_methods";
    private static final String sessionReceiptUrl = "https://api.stripe.com/v1/link_account_sessions/session_receipt";
    private final ApiRequest.Factory apiRequestFactory;
    private final FraudDetectionDataRepository fraudDetectionDataRepository;
    private final ProvideApiRequestOptions provideApiRequestOptions;
    private final FinancialConnectionsRequestExecutor requestExecutor;
    public static final int $stable = 8;

    @Inject
    public FinancialConnectionsRepositoryImpl(FinancialConnectionsRequestExecutor requestExecutor, ProvideApiRequestOptions provideApiRequestOptions, FraudDetectionDataRepository fraudDetectionDataRepository, ApiRequest.Factory apiRequestFactory) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        this.requestExecutor = requestExecutor;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository;
        this.apiRequestFactory = apiRequestFactory;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object getFinancialConnectionsAccounts(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, Continuation<? super FinancialConnectionsAccountList> continuation) {
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(this.apiRequestFactory, listAccountsUrl, this.provideApiRequestOptions.invoke(false), getFinancialConnectionsAcccountsParams.toParamMap(), false, 8, null), FinancialConnectionsAccountList.INSTANCE.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object getFinancialConnectionsSession(String str, Continuation<? super FinancialConnectionsSession> continuation) {
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(this.apiRequestFactory, sessionReceiptUrl, this.provideApiRequestOptions.invoke(false), MapsKt.mapOf(TuplesKt.to("client_secret", str)), false, 8, null), FinancialConnectionsSession.INSTANCE.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object postCompleteFinancialConnectionsSessions(String str, String str2, Continuation<? super FinancialConnectionsSession> continuation) {
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(this.apiRequestFactory, completeUrl, this.provideApiRequestOptions.invoke(true), CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to("terminal_error", str2))), false, 8, null), FinancialConnectionsSession.INSTANCE.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object postAuthorizationSessionOAuthResults(String str, String str2, Continuation<? super MixedOAuthParams> continuation) {
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(this.apiRequestFactory, authorizationSessionOAuthResultsUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("id", str2), TuplesKt.to("client_secret", str)), false, 8, null), MixedOAuthParams.INSTANCE.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object createPaymentMethod(String str, String str2, ElementsSessionContext.BillingDetails billingDetails, Continuation<? super String> continuation) {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("type", "link"), TuplesKt.to("link", MapsKt.mapOf(TuplesKt.to("credentials", MapsKt.mapOf(TuplesKt.to(NetworkConstants.PARAMS_CONSUMER_CLIENT_SECRET, str2))), TuplesKt.to("payment_details_id", str))));
        Map mapMapOf2 = billingDetails != null ? MapsKt.mapOf(TuplesKt.to("billing_details", BillingDetailsExtensionsKt.toApiParams(billingDetails))) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        FraudDetectionData cached = this.fraudDetectionDataRepository.getCached();
        Map<String, String> params = cached != null ? cached.getParams() : null;
        if (params == null) {
            params = MapsKt.emptyMap();
        }
        return this.requestExecutor.execute(ApiRequest.Factory.createPost$default(this.apiRequestFactory, paymentMethodsUrl, this.provideApiRequestOptions.invoke(false), MapsKt.plus(MapsKt.plus(mapMapOf, mapMapOf2), params), false, 8, null), continuation);
    }
}
