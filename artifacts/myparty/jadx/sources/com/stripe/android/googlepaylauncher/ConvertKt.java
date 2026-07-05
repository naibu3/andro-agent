package com.stripe.android.googlepaylauncher;

import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Convert.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"convert", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConvertKt {

    /* compiled from: Convert.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GooglePayLauncher.BillingAddressConfig.Format.values().length];
            try {
                iArr[GooglePayLauncher.BillingAddressConfig.Format.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GooglePayLauncher.BillingAddressConfig.Format.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.values().length];
            try {
                iArr2[GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final GooglePayJsonFactory.BillingAddressParameters convert(GooglePayLauncher.BillingAddressConfig billingAddressConfig) {
        GooglePayJsonFactory.BillingAddressParameters.Format format;
        Intrinsics.checkNotNullParameter(billingAddressConfig, "<this>");
        boolean zIsRequired$payments_core_release = billingAddressConfig.isRequired$payments_core_release();
        int i = WhenMappings.$EnumSwitchMapping$0[billingAddressConfig.getFormat$payments_core_release().ordinal()];
        if (i == 1) {
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
        }
        return new GooglePayJsonFactory.BillingAddressParameters(zIsRequired$payments_core_release, format, billingAddressConfig.isPhoneNumberRequired$payments_core_release());
    }

    public static final GooglePayJsonFactory.BillingAddressParameters convert(GooglePayPaymentMethodLauncher.BillingAddressConfig billingAddressConfig) {
        GooglePayJsonFactory.BillingAddressParameters.Format format;
        Intrinsics.checkNotNullParameter(billingAddressConfig, "<this>");
        boolean zIsRequired = billingAddressConfig.isRequired();
        int i = WhenMappings.$EnumSwitchMapping$1[billingAddressConfig.getFormat().ordinal()];
        if (i == 1) {
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            format = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
        }
        return new GooglePayJsonFactory.BillingAddressParameters(zIsRequired, format, billingAddressConfig.isPhoneNumberRequired());
    }
}
