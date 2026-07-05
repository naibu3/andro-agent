package com.stripe.android.paymentsheet.utils;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.GooglePayButtonType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GooglePayUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"asGooglePayButtonType", "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;", "getAsGooglePayButtonType", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;)Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayUtilsKt {

    /* compiled from: GooglePayUtils.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.GooglePayConfiguration.ButtonType.values().length];
            try {
                iArr[PaymentSheet.GooglePayConfiguration.ButtonType.Buy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.GooglePayConfiguration.ButtonType.Book.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentSheet.GooglePayConfiguration.ButtonType.Checkout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentSheet.GooglePayConfiguration.ButtonType.Donate.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentSheet.GooglePayConfiguration.ButtonType.Order.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentSheet.GooglePayConfiguration.ButtonType.Subscribe.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentSheet.GooglePayConfiguration.ButtonType.Plain.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentSheet.GooglePayConfiguration.ButtonType.Pay.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final GooglePayButtonType getAsGooglePayButtonType(PaymentSheet.GooglePayConfiguration.ButtonType buttonType) {
        switch (buttonType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()]) {
            case -1:
            case 8:
                return GooglePayButtonType.Pay;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return GooglePayButtonType.Buy;
            case 2:
                return GooglePayButtonType.Book;
            case 3:
                return GooglePayButtonType.Checkout;
            case 4:
                return GooglePayButtonType.Donate;
            case 5:
                return GooglePayButtonType.Order;
            case 6:
                return GooglePayButtonType.Subscribe;
            case 7:
                return GooglePayButtonType.Plain;
        }
    }
}
