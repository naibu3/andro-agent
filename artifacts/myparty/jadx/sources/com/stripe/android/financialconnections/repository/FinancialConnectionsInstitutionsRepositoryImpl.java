package com.stripe.android.financialconnections.repository;

import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsInstitutionsRepository.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "<init>", "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V", "featuredInstitutions", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchInstitutions", SearchIntents.EXTRA_QUERY, "limit", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FinancialConnectionsInstitutionsRepositoryImpl implements FinancialConnectionsInstitutionsRepository {
    public static final String featuredInstitutionsUrl = "https://api.stripe.com/v1/connections/featured_institutions";
    public static final String institutionsUrl = "https://api.stripe.com/v1/connections/institutions";
    private final ApiRequest.Factory apiRequestFactory;
    private final ProvideApiRequestOptions provideApiRequestOptions;
    private final FinancialConnectionsRequestExecutor requestExecutor;

    public FinancialConnectionsInstitutionsRepositoryImpl(FinancialConnectionsRequestExecutor requestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory apiRequestFactory) {
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
        Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
        this.requestExecutor = requestExecutor;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.apiRequestFactory = apiRequestFactory;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository
    public Object featuredInstitutions(String str, Continuation<? super InstitutionResponse> continuation) {
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(this.apiRequestFactory, featuredInstitutionsUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("client_secret", str)), false, 8, null), InstitutionResponse.INSTANCE.serializer(), continuation);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository
    public Object searchInstitutions(String str, String str2, int i, Continuation<? super InstitutionResponse> continuation) {
        return this.requestExecutor.execute(ApiRequest.Factory.createGet$default(this.apiRequestFactory, institutionsUrl, this.provideApiRequestOptions.invoke(true), MapsKt.mapOf(TuplesKt.to("client_secret", str), TuplesKt.to(SearchIntents.EXTRA_QUERY, str2), TuplesKt.to("limit", Boxing.boxInt(i))), false, 8, null), InstitutionResponse.INSTANCE.serializer(), continuation);
    }
}
