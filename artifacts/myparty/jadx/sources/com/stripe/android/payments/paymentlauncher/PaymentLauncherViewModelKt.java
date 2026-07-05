package com.stripe.android.payments.paymentlauncher;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"toStripeId", "", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentLauncherViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toStripeId(String str) {
        return StringsKt.substringBefore$default(str, "_secret_", (String) null, 2, (Object) null);
    }
}
