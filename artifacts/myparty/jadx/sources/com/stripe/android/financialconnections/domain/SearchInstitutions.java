package com.stripe.android.financialconnections.domain;

import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchInstitutions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/domain/SearchInstitutions;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "clientSecret", "", SearchIntents.EXTRA_QUERY, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SearchInstitutions {
    private static final int SEARCH_INSTITUTIONS_LIMIT = 10;
    private final FinancialConnectionsInstitutionsRepository repository;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public SearchInstitutions(FinancialConnectionsInstitutionsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final Object invoke(String str, String str2, Continuation<? super InstitutionResponse> continuation) {
        return this.repository.searchInstitutions(str, str2, 10, continuation);
    }

    /* compiled from: SearchInstitutions.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/domain/SearchInstitutions$Companion;", "", "<init>", "()V", "SEARCH_INSTITUTIONS_LIMIT", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
