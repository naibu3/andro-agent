package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;

/* compiled from: PaymentSheetEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\tH\u0000\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\tH\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"toAnalyticsParam", "", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "asSeconds", "", "Lkotlin/time/Duration;", "getAsSeconds-LRDsOJo", "(J)F", "code", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "linkContext", "primaryButtonColorUsage", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetEventKt {

    /* compiled from: PaymentSheetEvent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsAvailability.values().length];
            try {
                iArr[FinancialConnectionsAvailability.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsAvailability.Lite.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toAnalyticsParam(FinancialConnectionsAvailability financialConnectionsAvailability) {
        int i = financialConnectionsAvailability == null ? -1 : WhenMappings.$EnumSwitchMapping$0[financialConnectionsAvailability.ordinal()];
        if (i == -1) {
            return "NONE";
        }
        if (i == 1) {
            return "FULL";
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "LITE";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAsSeconds-LRDsOJo, reason: not valid java name */
    public static final float m8256getAsSecondsLRDsOJo(long j) {
        return (float) Duration.m10518toDoubleimpl(j, DurationUnit.SECONDS);
    }

    public static final String code(PaymentSelection paymentSelection) {
        String str;
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.GooglePay) {
            return "google_pay";
        }
        if (paymentSelection instanceof PaymentSelection.Link) {
            return "link";
        }
        if (paymentSelection instanceof PaymentSelection.ShopPay) {
            return "shop_pay";
        }
        if (paymentSelection instanceof PaymentSelection.New) {
            return ((PaymentSelection.New) paymentSelection).getPaymentMethodCreateParams().getTypeCode();
        }
        if (paymentSelection instanceof PaymentSelection.Saved) {
            PaymentMethod.Type type = ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().type;
            return (type == null || (str = type.code) == null) ? "saved" : str;
        }
        if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return ((PaymentSelection.ExternalPaymentMethod) paymentSelection).getType();
        }
        if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return ((PaymentSelection.CustomPaymentMethod) paymentSelection).getId();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String linkContext(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.Link) {
            return "wallet";
        }
        if (paymentSelection instanceof PaymentSelection.New.USBankAccount) {
            PaymentSelection.New.USBankAccount.InstantDebitsInfo instantDebits = ((PaymentSelection.New.USBankAccount) paymentSelection).getInstantDebits();
            if (instantDebits == null) {
                return null;
            }
            if (instantDebits.getLinkMode() == LinkMode.LinkCardBrand) {
                return "link_card_brand";
            }
            return "instant_debits";
        }
        if ((paymentSelection instanceof PaymentSelection.GooglePay) || (paymentSelection instanceof PaymentSelection.New) || (paymentSelection instanceof PaymentSelection.Saved) || (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) || (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) || (paymentSelection instanceof PaymentSelection.ShopPay)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean primaryButtonColorUsage(PaymentSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return configuration.getPrimaryButtonColor() != null;
    }
}
