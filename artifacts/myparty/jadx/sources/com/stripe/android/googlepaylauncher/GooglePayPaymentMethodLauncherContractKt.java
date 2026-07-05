package com.stripe.android.googlepaylauncher;

import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import kotlin.Metadata;

/* compiled from: GooglePayPaymentMethodLauncherContract.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toV2", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayPaymentMethodLauncherContractKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final GooglePayPaymentMethodLauncherContractV2.Args toV2(GooglePayPaymentMethodLauncherContract.Args args) {
        return new GooglePayPaymentMethodLauncherContractV2.Args(args.getConfig$payments_core_release(), args.getCurrencyCode$payments_core_release(), args.getAmount$payments_core_release(), null, args.getTransactionId$payments_core_release(), DefaultCardBrandFilter.INSTANCE, 8, null);
    }
}
