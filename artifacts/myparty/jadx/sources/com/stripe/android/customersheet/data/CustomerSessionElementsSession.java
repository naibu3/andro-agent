package com.stripe.android.customersheet.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.ElementsSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSessionElementsSessionManager.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;", "", "elementsSession", "Lcom/stripe/android/model/ElementsSession;", "customer", "Lcom/stripe/android/model/ElementsSession$Customer;", "ephemeralKey", "Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;", "<init>", "(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/model/ElementsSession$Customer;Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;)V", "getElementsSession", "()Lcom/stripe/android/model/ElementsSession;", "getCustomer", "()Lcom/stripe/android/model/ElementsSession$Customer;", "getEphemeralKey", "()Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomerSessionElementsSession {
    public static final int $stable = ElementsSession.Customer.$stable | ElementsSession.$stable;
    private final ElementsSession.Customer customer;
    private final ElementsSession elementsSession;
    private final CachedCustomerEphemeralKey ephemeralKey;

    public static /* synthetic */ CustomerSessionElementsSession copy$default(CustomerSessionElementsSession customerSessionElementsSession, ElementsSession elementsSession, ElementsSession.Customer customer, CachedCustomerEphemeralKey cachedCustomerEphemeralKey, int i, Object obj) {
        if ((i & 1) != 0) {
            elementsSession = customerSessionElementsSession.elementsSession;
        }
        if ((i & 2) != 0) {
            customer = customerSessionElementsSession.customer;
        }
        if ((i & 4) != 0) {
            cachedCustomerEphemeralKey = customerSessionElementsSession.ephemeralKey;
        }
        return customerSessionElementsSession.copy(elementsSession, customer, cachedCustomerEphemeralKey);
    }

    /* renamed from: component1, reason: from getter */
    public final ElementsSession getElementsSession() {
        return this.elementsSession;
    }

    /* renamed from: component2, reason: from getter */
    public final ElementsSession.Customer getCustomer() {
        return this.customer;
    }

    /* renamed from: component3, reason: from getter */
    public final CachedCustomerEphemeralKey getEphemeralKey() {
        return this.ephemeralKey;
    }

    public final CustomerSessionElementsSession copy(ElementsSession elementsSession, ElementsSession.Customer customer, CachedCustomerEphemeralKey ephemeralKey) {
        Intrinsics.checkNotNullParameter(elementsSession, "elementsSession");
        Intrinsics.checkNotNullParameter(customer, "customer");
        Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
        return new CustomerSessionElementsSession(elementsSession, customer, ephemeralKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerSessionElementsSession)) {
            return false;
        }
        CustomerSessionElementsSession customerSessionElementsSession = (CustomerSessionElementsSession) other;
        return Intrinsics.areEqual(this.elementsSession, customerSessionElementsSession.elementsSession) && Intrinsics.areEqual(this.customer, customerSessionElementsSession.customer) && Intrinsics.areEqual(this.ephemeralKey, customerSessionElementsSession.ephemeralKey);
    }

    public int hashCode() {
        return (((this.elementsSession.hashCode() * 31) + this.customer.hashCode()) * 31) + this.ephemeralKey.hashCode();
    }

    public String toString() {
        return "CustomerSessionElementsSession(elementsSession=" + this.elementsSession + ", customer=" + this.customer + ", ephemeralKey=" + this.ephemeralKey + ")";
    }

    public CustomerSessionElementsSession(ElementsSession elementsSession, ElementsSession.Customer customer, CachedCustomerEphemeralKey ephemeralKey) {
        Intrinsics.checkNotNullParameter(elementsSession, "elementsSession");
        Intrinsics.checkNotNullParameter(customer, "customer");
        Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
        this.elementsSession = elementsSession;
        this.customer = customer;
        this.ephemeralKey = ephemeralKey;
    }

    public final ElementsSession getElementsSession() {
        return this.elementsSession;
    }

    public final ElementsSession.Customer getCustomer() {
        return this.customer;
    }

    public final CachedCustomerEphemeralKey getEphemeralKey() {
        return this.ephemeralKey;
    }
}
