package com.stripe.android.financialconnections.repository;

import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsInstitutionsRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "", "featuredInstitutions", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchInstitutions", SearchIntents.EXTRA_QUERY, "limit", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsInstitutionsRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object featuredInstitutions(String str, Continuation<? super InstitutionResponse> continuation);

    Object searchInstitutions(String str, String str2, int i, Continuation<? super InstitutionResponse> continuation);

    /* compiled from: FinancialConnectionsInstitutionsRepository.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository$Companion;", "", "<init>", "()V", "invoke", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "requestExecutor", "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final FinancialConnectionsInstitutionsRepository invoke(FinancialConnectionsRequestExecutor requestExecutor, ProvideApiRequestOptions provideApiRequestOptions, ApiRequest.Factory apiRequestFactory) {
            Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
            Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
            Intrinsics.checkNotNullParameter(apiRequestFactory, "apiRequestFactory");
            return new FinancialConnectionsInstitutionsRepositoryImpl(requestExecutor, provideApiRequestOptions, apiRequestFactory);
        }
    }
}
