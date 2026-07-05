package com.stripe.android.link.utils;

import com.stripe.android.core.model.CountryCode;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkBillingDetailsUtils.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u000e\u0010\u000b\u001a\u00020\u0007*\u0004\u0018\u00010\fH\u0002\u001a\u001e\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\f*\u00020\u0001H\u0002\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\f*\u00020\u000fH\u0000¨\u0006\u0010"}, d2 = {"effectiveBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "supports", "", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "billingDetailsConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "isIncomplete", "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;", "withEffectiveBillingDetails", "toConsumerBillingAddress", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkBillingDetailsUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[PHI: r9
      0x0037: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v8 java.lang.String) binds: [B:7:0x0028, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[PHI: r9
      0x004b: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v7 java.lang.String) binds: [B:14:0x003c, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PaymentSheet.BillingDetails effectiveBillingDetails(LinkConfiguration configuration, LinkAccount linkAccount) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = configuration.getBillingDetailsCollectionConfiguration();
        PaymentSheet.BillingDetails defaultBillingDetails = configuration.getDefaultBillingDetails();
        PaymentSheet.BillingDetails billingDetails = defaultBillingDetails == null ? new PaymentSheet.BillingDetails(null, null, null, null, 15, null) : defaultBillingDetails;
        String email = billingDetails.getEmail();
        if (email == null) {
            email = linkAccount.getEmail();
            str = billingDetailsCollectionConfiguration.getCollectsEmail$paymentsheet_release() ? email : null;
        }
        String phone = billingDetails.getPhone();
        if (phone == null) {
            phone = linkAccount.getUnredactedPhoneNumber();
            str2 = billingDetailsCollectionConfiguration.getCollectsPhone$paymentsheet_release() ? phone : null;
        }
        return PaymentSheet.BillingDetails.copy$default(billingDetails, null, str, null, str2, 5, null);
    }

    public static final boolean supports(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsConfig, LinkAccount linkAccount) {
        Intrinsics.checkNotNullParameter(paymentDetails, "<this>");
        Intrinsics.checkNotNullParameter(billingDetailsConfig, "billingDetailsConfig");
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        if (!(paymentDetails instanceof ConsumerPaymentDetails.BankAccount) && !(paymentDetails instanceof ConsumerPaymentDetails.Card)) {
            return true;
        }
        if (billingDetailsConfig.getAddress() == PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Full && isIncomplete(paymentDetails.getBillingAddress())) {
            return false;
        }
        if (billingDetailsConfig.getCollectsPhone$paymentsheet_release() && linkAccount.getUnredactedPhoneNumber() == null) {
            return false;
        }
        if (billingDetailsConfig.getCollectsName$paymentsheet_release()) {
            ConsumerPaymentDetails.BillingAddress billingAddress = paymentDetails.getBillingAddress();
            if ((billingAddress != null ? billingAddress.getName() : null) == null) {
                return false;
            }
        }
        return true;
    }

    private static final boolean isIncomplete(ConsumerPaymentDetails.BillingAddress billingAddress) {
        return billingAddress == null || billingAddress.getLine1() == null || billingAddress.getLocality() == null || billingAddress.getPostalCode() == null || billingAddress.getCountryCode() == null;
    }

    public static final ConsumerPaymentDetails.PaymentDetails withEffectiveBillingDetails(ConsumerPaymentDetails.PaymentDetails paymentDetails, LinkConfiguration configuration, LinkAccount linkAccount) {
        Intrinsics.checkNotNullParameter(paymentDetails, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (linkAccount != null) {
            PaymentSheet.BillingDetails billingDetailsEffectiveBillingDetails = effectiveBillingDetails(configuration, linkAccount);
            ConsumerPaymentDetails.BillingAddress consumerBillingAddress = toConsumerBillingAddress(billingDetailsEffectiveBillingDetails);
            ConsumerPaymentDetails.BillingAddress billingAddress = paymentDetails.getBillingAddress();
            boolean z = false;
            if (billingAddress != null) {
                if (Intrinsics.areEqual(consumerBillingAddress != null ? consumerBillingAddress.getCountryCode() : null, billingAddress.getCountryCode())) {
                    if (Intrinsics.areEqual(consumerBillingAddress != null ? consumerBillingAddress.getPostalCode() : null, billingAddress.getPostalCode())) {
                        z = true;
                    }
                }
            }
            if (paymentDetails.getBillingAddress() != null && !z) {
                consumerBillingAddress = paymentDetails.getBillingAddress();
            }
            ConsumerPaymentDetails.BillingAddress billingAddress2 = consumerBillingAddress;
            String email = billingDetailsEffectiveBillingDetails.getEmail();
            if (email == null) {
                email = paymentDetails.getBillingEmailAddress();
            }
            String str = email;
            if (paymentDetails instanceof ConsumerPaymentDetails.Card) {
                return ConsumerPaymentDetails.Card.copy$default((ConsumerPaymentDetails.Card) paymentDetails, null, null, false, null, billingAddress2, str, 0, 0, null, null, null, null, 4047, null);
            }
            if (paymentDetails instanceof ConsumerPaymentDetails.BankAccount) {
                return ConsumerPaymentDetails.BankAccount.copy$default((ConsumerPaymentDetails.BankAccount) paymentDetails, null, null, false, null, null, null, billingAddress2, str, 63, null);
            }
            if (!(paymentDetails instanceof ConsumerPaymentDetails.Passthrough)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return paymentDetails;
    }

    private static final ConsumerPaymentDetails.BillingAddress toConsumerBillingAddress(PaymentSheet.BillingDetails billingDetails) {
        PaymentSheet.Address address = billingDetails.getAddress();
        if (address == null) {
            return null;
        }
        String name = billingDetails.getName();
        String line1 = address.getLine1();
        String line2 = address.getLine2();
        String city = address.getCity();
        String state = address.getState();
        String postalCode = address.getPostalCode();
        String country = address.getCountry();
        return new ConsumerPaymentDetails.BillingAddress(name, line1, line2, state, city, postalCode, country != null ? CountryCode.INSTANCE.create(country) : null);
    }

    public static final ConsumerPaymentDetails.BillingAddress toConsumerBillingAddress(PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(billingDetails, "<this>");
        return toConsumerBillingAddress(PaymentSelectionKt.toPaymentSheetBillingDetails(billingDetails));
    }
}
