package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeaturedInstitutions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086B¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/domain/FeaturedInstitutions;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeaturedInstitutions {
    public static final int $stable = 8;
    private final FinancialConnectionsInstitutionsRepository repository;

    @Inject
    public FeaturedInstitutions(FinancialConnectionsInstitutionsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final Object invoke(String str, Continuation<? super InstitutionResponse> continuation) {
        return this.repository.featuredInstitutions(str, continuation);
    }
}
