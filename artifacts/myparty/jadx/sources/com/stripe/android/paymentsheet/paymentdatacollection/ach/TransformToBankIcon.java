package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* compiled from: TransformToBankIcon.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0086\u0002¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon;", "", "<init>", "()V", "invoke", "", "bankName", "", "fallbackIcon", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformToBankIcon {
    public static final int $stable = 0;
    public static final TransformToBankIcon INSTANCE = new TransformToBankIcon();

    private TransformToBankIcon() {
    }

    public static /* synthetic */ int invoke$default(TransformToBankIcon transformToBankIcon, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = R.drawable.stripe_ic_fc_bank;
        }
        return transformToBankIcon.invoke(str, i);
    }

    public final int invoke(String bankName, int fallbackIcon) {
        if (bankName == null) {
            return fallbackIcon;
        }
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(new Regex("Bank of America", RegexOption.IGNORE_CASE), "boa"), TuplesKt.to(new Regex("Capital One", RegexOption.IGNORE_CASE), "capitalone"), TuplesKt.to(new Regex("Citibank", RegexOption.IGNORE_CASE), "citibank"), TuplesKt.to(new Regex("BBVA|COMPASS", RegexOption.IGNORE_CASE), "compass"), TuplesKt.to(new Regex("MORGAN CHASE|JP MORGAN|Chase", RegexOption.IGNORE_CASE), "morganchase"), TuplesKt.to(new Regex("NAVY FEDERAL CREDIT UNION", RegexOption.IGNORE_CASE), "nfcu"), TuplesKt.to(new Regex("PNC\\s?BANK|PNC Bank", RegexOption.IGNORE_CASE), "pnc"), TuplesKt.to(new Regex("SUNTRUST|SunTrust Bank", RegexOption.IGNORE_CASE), "suntrust"), TuplesKt.to(new Regex("Silicon Valley Bank", RegexOption.IGNORE_CASE), "svb"), TuplesKt.to(new Regex("Stripe|TestInstitution|Test Institution", RegexOption.IGNORE_CASE), "stripe"), TuplesKt.to(new Regex("TD Bank", RegexOption.IGNORE_CASE), "td"), TuplesKt.to(new Regex("USAA FEDERAL SAVINGS BANK|USAA Bank", RegexOption.IGNORE_CASE), "usaa"), TuplesKt.to(new Regex("U\\.?S\\. BANK|US Bank", RegexOption.IGNORE_CASE), "usbank"), TuplesKt.to(new Regex("Wells Fargo", RegexOption.IGNORE_CASE), "wellsfargo"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = mapMapOf.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (SequencesKt.any(Regex.findAll$default((Regex) entry.getKey(), bankName, 0, 2, null))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        Integer numValueOf = it2.hasNext() ? Integer.valueOf(TransformBankIconCodeToBankIconKt.transformBankIconCodeToBankIcon((String) ((Map.Entry) it2.next()).getValue(), fallbackIcon)) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return R.drawable.stripe_ic_fc_bank;
    }
}
