package com.stripe.android.paymentsheet.ui;

import com.stripe.android.CardBrandFilter;
import com.stripe.android.model.CardBrand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodCardKtx.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"getPreferredChoice", "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "getAvailableNetworks", "", "toChoice", "Lcom/stripe/android/model/CardBrand;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentMethodCardKtxKt {
    public static final CardBrandChoice getPreferredChoice(EditCardPayload editCardPayload, CardBrandFilter cardBrandFilter) {
        Intrinsics.checkNotNullParameter(editCardPayload, "<this>");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        return toChoice(CardBrand.INSTANCE.fromCode(editCardPayload.getDisplayBrand()), cardBrandFilter);
    }

    public static final List<CardBrandChoice> getAvailableNetworks(EditCardPayload editCardPayload, CardBrandFilter cardBrandFilter) {
        Intrinsics.checkNotNullParameter(editCardPayload, "<this>");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Set<String> networks = editCardPayload.getNetworks();
        if (networks != null) {
            Set<String> set = networks;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(toChoice(CardBrand.INSTANCE.fromCode((String) it.next()), cardBrandFilter));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    private static final CardBrandChoice toChoice(CardBrand cardBrand, CardBrandFilter cardBrandFilter) {
        return new CardBrandChoice(cardBrand, cardBrandFilter.isAccepted(cardBrand));
    }
}
