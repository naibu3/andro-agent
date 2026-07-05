package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.uicore.forms.FormFieldEntry;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingDetailsEntry.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0019\u0010\u0015\u001a\u00020\t*\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0082\u0004J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\t*\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;", "", "billingDetailsFormState", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;", "<init>", "(Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;)V", "getBillingDetailsFormState", "()Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;", "hasChanged", "", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "contactInformationChanged", "configuration", "isComplete", "contactInfoComplete", "isValid", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Z", "nullableNeq", "", "other", "component1", "copy", "equals", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BillingDetailsEntry {
    public static final int $stable = (((((((FormFieldEntry.$stable | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable;
    private final BillingDetailsFormState billingDetailsFormState;

    /* compiled from: BillingDetailsEntry.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.values().length];
            try {
                iArr[PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Full.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ BillingDetailsEntry copy$default(BillingDetailsEntry billingDetailsEntry, BillingDetailsFormState billingDetailsFormState, int i, Object obj) {
        if ((i & 1) != 0) {
            billingDetailsFormState = billingDetailsEntry.billingDetailsFormState;
        }
        return billingDetailsEntry.copy(billingDetailsFormState);
    }

    /* renamed from: component1, reason: from getter */
    public final BillingDetailsFormState getBillingDetailsFormState() {
        return this.billingDetailsFormState;
    }

    public final BillingDetailsEntry copy(BillingDetailsFormState billingDetailsFormState) {
        Intrinsics.checkNotNullParameter(billingDetailsFormState, "billingDetailsFormState");
        return new BillingDetailsEntry(billingDetailsFormState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BillingDetailsEntry) && Intrinsics.areEqual(this.billingDetailsFormState, ((BillingDetailsEntry) other).billingDetailsFormState);
    }

    public int hashCode() {
        return this.billingDetailsFormState.hashCode();
    }

    public String toString() {
        return "BillingDetailsEntry(billingDetailsFormState=" + this.billingDetailsFormState + ")";
    }

    public BillingDetailsEntry(BillingDetailsFormState billingDetailsFormState) {
        Intrinsics.checkNotNullParameter(billingDetailsFormState, "billingDetailsFormState");
        this.billingDetailsFormState = billingDetailsFormState;
    }

    public final BillingDetailsFormState getBillingDetailsFormState() {
        return this.billingDetailsFormState;
    }

    public final boolean hasChanged(PaymentMethod.BillingDetails billingDetails, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
        Address address;
        Address address2;
        boolean z;
        Address address3;
        Address address4;
        Address address5;
        Address address6;
        Address address7;
        Address address8;
        Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        boolean zContactInformationChanged = contactInformationChanged(billingDetailsCollectionConfiguration, billingDetails);
        int i = WhenMappings.$EnumSwitchMapping$0[billingDetailsCollectionConfiguration.getAddress().ordinal()];
        String country = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!nullableNeq((billingDetails == null || (address8 = billingDetails.address) == null) ? null : address8.getPostalCode(), this.billingDetailsFormState.getPostalCode())) {
                    if (!nullableNeq((billingDetails == null || (address7 = billingDetails.address) == null) ? null : address7.getCountry(), this.billingDetailsFormState.getCountry())) {
                        if (!nullableNeq((billingDetails == null || (address6 = billingDetails.address) == null) ? null : address6.getLine1(), this.billingDetailsFormState.getLine1())) {
                            if (!nullableNeq((billingDetails == null || (address5 = billingDetails.address) == null) ? null : address5.getLine2(), this.billingDetailsFormState.getLine2())) {
                                if (!nullableNeq((billingDetails == null || (address4 = billingDetails.address) == null) ? null : address4.getCity(), this.billingDetailsFormState.getCity())) {
                                    if (billingDetails != null && (address3 = billingDetails.address) != null) {
                                        country = address3.getState();
                                    }
                                    if (nullableNeq(country, this.billingDetailsFormState.getState())) {
                                    }
                                }
                            }
                        }
                    }
                }
                z = true;
            }
            z = false;
        } else {
            if (!nullableNeq((billingDetails == null || (address2 = billingDetails.address) == null) ? null : address2.getPostalCode(), this.billingDetailsFormState.getPostalCode())) {
                if (billingDetails != null && (address = billingDetails.address) != null) {
                    country = address.getCountry();
                }
                if (!nullableNeq(country, this.billingDetailsFormState.getCountry())) {
                    z = false;
                }
            }
            z = true;
        }
        return zContactInformationChanged || z;
    }

    private final boolean contactInformationChanged(PaymentSheet.BillingDetailsCollectionConfiguration configuration, PaymentMethod.BillingDetails billingDetails) {
        boolean zNullableNeq;
        boolean zNullableNeq2;
        boolean zNullableNeq3;
        if (configuration.getCollectsName$paymentsheet_release()) {
            zNullableNeq = nullableNeq(billingDetails != null ? billingDetails.name : null, this.billingDetailsFormState.getName());
        } else {
            zNullableNeq = false;
        }
        if (configuration.getCollectsEmail$paymentsheet_release()) {
            zNullableNeq2 = nullableNeq(billingDetails != null ? billingDetails.email : null, this.billingDetailsFormState.getEmail());
        } else {
            zNullableNeq2 = false;
        }
        if (configuration.getCollectsPhone$paymentsheet_release()) {
            zNullableNeq3 = nullableNeq(billingDetails != null ? billingDetails.phone : null, this.billingDetailsFormState.getPhone());
        } else {
            zNullableNeq3 = false;
        }
        return zNullableNeq || zNullableNeq2 || zNullableNeq3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isComplete(PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
        boolean z;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        boolean zContactInfoComplete = contactInfoComplete(configuration);
        int i = WhenMappings.$EnumSwitchMapping$0[configuration.getAddress().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!isValid(this.billingDetailsFormState.getCountry()) || !isValid(this.billingDetailsFormState.getState()) || !isValid(this.billingDetailsFormState.getPostalCode()) || !isValid(this.billingDetailsFormState.getLine1()) || !isValid(this.billingDetailsFormState.getCity())) {
                    z = false;
                }
            }
            z = true;
        } else if (isValid(this.billingDetailsFormState.getCountry()) && isValid(this.billingDetailsFormState.getPostalCode())) {
            z = true;
        }
        return zContactInfoComplete && z;
    }

    private final boolean contactInfoComplete(PaymentSheet.BillingDetailsCollectionConfiguration configuration) {
        return (configuration.getCollectsName$paymentsheet_release() ? isValid(this.billingDetailsFormState.getName()) : true) && (configuration.getCollectsEmail$paymentsheet_release() ? isValid(this.billingDetailsFormState.getEmail()) : true) && (configuration.getCollectsPhone$paymentsheet_release() ? isValid(this.billingDetailsFormState.getPhone()) : true);
    }

    private final boolean isValid(FormFieldEntry formFieldEntry) {
        if (formFieldEntry != null) {
            return formFieldEntry.isComplete();
        }
        return true;
    }

    private final boolean nullableNeq(String str, FormFieldEntry formFieldEntry) {
        if (formFieldEntry == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return !Intrinsics.areEqual(str, formFieldEntry.getValue() != null ? r3 : "");
    }
}
