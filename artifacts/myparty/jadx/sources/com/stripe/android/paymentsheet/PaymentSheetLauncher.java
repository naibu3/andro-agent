package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;

/* compiled from: PaymentSheetLauncher.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;", "", "present", "", "mode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentSheetLauncher {
    void present(PaymentElementLoader.InitializationMode mode, PaymentSheet.Configuration configuration);

    /* compiled from: PaymentSheetLauncher.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void present$default(PaymentSheetLauncher paymentSheetLauncher, PaymentElementLoader.InitializationMode initializationMode, PaymentSheet.Configuration configuration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: present");
            }
            if ((i & 2) != 0) {
                configuration = null;
            }
            paymentSheetLauncher.present(initializationMode, configuration);
        }
    }
}
