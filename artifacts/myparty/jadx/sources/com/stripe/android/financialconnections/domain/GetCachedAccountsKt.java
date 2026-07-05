package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetCachedAccounts.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¨\u0006\u0004"}, d2 = {"toCachedPartnerAccounts", "", "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetCachedAccountsKt {
    public static final List<CachedPartnerAccount> toCachedPartnerAccounts(List<PartnerAccount> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<PartnerAccount> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (PartnerAccount partnerAccount : list2) {
            arrayList.add(new CachedPartnerAccount(partnerAccount.getId(), partnerAccount.getLinkedAccountId()));
        }
        return arrayList;
    }
}
