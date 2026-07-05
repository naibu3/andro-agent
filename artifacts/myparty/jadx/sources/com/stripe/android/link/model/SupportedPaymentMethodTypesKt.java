package com.stripe.android.link.model;

import com.stripe.android.model.StripeIntent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SupportedPaymentMethodTypes.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"supportedPaymentMethodTypes", "", "", "Lcom/stripe/android/model/StripeIntent;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SupportedPaymentMethodTypesKt {
    private static final Set<String> supportedPaymentMethodTypes = SetsKt.setOf((Object[]) new String[]{"card", "bank_account", "card"});

    public static final Set<String> supportedPaymentMethodTypes(StripeIntent stripeIntent, LinkAccount linkAccount) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        if (!stripeIntent.isLiveMode() && StringsKt.contains$default((CharSequence) linkAccount.getEmail(), (CharSequence) "+multiple_funding_sources@", false, 2, (Object) null)) {
            return supportedPaymentMethodTypes;
        }
        List<String> linkFundingSources = stripeIntent.getLinkFundingSources();
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkFundingSources) {
            if (supportedPaymentMethodTypes.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        Set<String> set = CollectionsKt.toSet(arrayList);
        Set<String> set2 = set.isEmpty() ? null : set;
        return set2 == null ? SetsKt.setOf("card") : set2;
    }
}
