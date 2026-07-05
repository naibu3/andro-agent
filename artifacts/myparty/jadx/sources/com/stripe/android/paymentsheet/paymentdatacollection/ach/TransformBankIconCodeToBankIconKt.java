package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.R;
import kotlin.Metadata;

/* compiled from: TransformBankIconCodeToBankIcon.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"transformBankIconCodeToBankIcon", "", "iconCode", "", "fallbackIcon", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformBankIconCodeToBankIconKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int transformBankIconCodeToBankIcon(String str, int i) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1765633026:
                    if (str.equals("capitalone")) {
                        return R.drawable.stripe_ic_bank_capitalone;
                    }
                    break;
                case -1716678772:
                    if (str.equals("suntrust")) {
                        return R.drawable.stripe_ic_bank_suntrust;
                    }
                    break;
                case -1435862505:
                    if (str.equals("citibank")) {
                        return R.drawable.stripe_ic_bank_citi;
                    }
                    break;
                case -891985843:
                    if (str.equals("stripe")) {
                        return R.drawable.stripe_ic_bank_stripe;
                    }
                    break;
                case -836135462:
                    if (str.equals("usbank")) {
                        return R.drawable.stripe_ic_bank_usbank;
                    }
                    break;
                case -270531414:
                    if (str.equals("morganchase")) {
                        return R.drawable.stripe_ic_bank_morganchase;
                    }
                    break;
                case -78918662:
                    if (str.equals("wellsfargo")) {
                        return R.drawable.stripe_ic_bank_wellsfargo;
                    }
                    break;
                case 3696:
                    if (str.equals("td")) {
                        return R.drawable.stripe_ic_bank_td;
                    }
                    break;
                case 97716:
                    if (str.equals("boa")) {
                        return R.drawable.stripe_ic_bank_boa;
                    }
                    break;
                case 111141:
                    if (str.equals("pnc")) {
                        return R.drawable.stripe_ic_bank_pnc;
                    }
                    break;
                case 114271:
                    if (str.equals("svb")) {
                        return R.drawable.stripe_ic_bank_svb;
                    }
                    break;
                case 3378218:
                    if (str.equals("nfcu")) {
                        return R.drawable.stripe_ic_bank_nfcu;
                    }
                    break;
                case 3599166:
                    if (str.equals("usaa")) {
                        return R.drawable.stripe_ic_bank_usaa;
                    }
                    break;
                case 950484242:
                    if (str.equals("compass")) {
                        return R.drawable.stripe_ic_bank_compass;
                    }
                    break;
            }
        }
        return i;
    }
}
