package com.stripe.android.customersheet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: CustomerPermissions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/customersheet/CustomerPermissions;", "", "canRemovePaymentMethods", "", "canRemoveLastPaymentMethod", "canUpdateFullPaymentMethodDetails", "<init>", "(ZZZ)V", "getCanRemovePaymentMethods", "()Z", "getCanRemoveLastPaymentMethod", "getCanUpdateFullPaymentMethodDetails", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomerPermissions {
    public static final int $stable = 0;
    private final boolean canRemoveLastPaymentMethod;
    private final boolean canRemovePaymentMethods;
    private final boolean canUpdateFullPaymentMethodDetails;

    public static /* synthetic */ CustomerPermissions copy$default(CustomerPermissions customerPermissions, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = customerPermissions.canRemovePaymentMethods;
        }
        if ((i & 2) != 0) {
            z2 = customerPermissions.canRemoveLastPaymentMethod;
        }
        if ((i & 4) != 0) {
            z3 = customerPermissions.canUpdateFullPaymentMethodDetails;
        }
        return customerPermissions.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCanRemovePaymentMethods() {
        return this.canRemovePaymentMethods;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanRemoveLastPaymentMethod() {
        return this.canRemoveLastPaymentMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanUpdateFullPaymentMethodDetails() {
        return this.canUpdateFullPaymentMethodDetails;
    }

    public final CustomerPermissions copy(boolean canRemovePaymentMethods, boolean canRemoveLastPaymentMethod, boolean canUpdateFullPaymentMethodDetails) {
        return new CustomerPermissions(canRemovePaymentMethods, canRemoveLastPaymentMethod, canUpdateFullPaymentMethodDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerPermissions)) {
            return false;
        }
        CustomerPermissions customerPermissions = (CustomerPermissions) other;
        return this.canRemovePaymentMethods == customerPermissions.canRemovePaymentMethods && this.canRemoveLastPaymentMethod == customerPermissions.canRemoveLastPaymentMethod && this.canUpdateFullPaymentMethodDetails == customerPermissions.canUpdateFullPaymentMethodDetails;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.canRemovePaymentMethods) * 31) + Boolean.hashCode(this.canRemoveLastPaymentMethod)) * 31) + Boolean.hashCode(this.canUpdateFullPaymentMethodDetails);
    }

    public String toString() {
        return "CustomerPermissions(canRemovePaymentMethods=" + this.canRemovePaymentMethods + ", canRemoveLastPaymentMethod=" + this.canRemoveLastPaymentMethod + ", canUpdateFullPaymentMethodDetails=" + this.canUpdateFullPaymentMethodDetails + ")";
    }

    public CustomerPermissions(boolean z, boolean z2, boolean z3) {
        this.canRemovePaymentMethods = z;
        this.canRemoveLastPaymentMethod = z2;
        this.canUpdateFullPaymentMethodDetails = z3;
    }

    public final boolean getCanRemovePaymentMethods() {
        return this.canRemovePaymentMethods;
    }

    public final boolean getCanRemoveLastPaymentMethod() {
        return this.canRemoveLastPaymentMethod;
    }

    public final boolean getCanUpdateFullPaymentMethodDetails() {
        return this.canUpdateFullPaymentMethodDetails;
    }
}
