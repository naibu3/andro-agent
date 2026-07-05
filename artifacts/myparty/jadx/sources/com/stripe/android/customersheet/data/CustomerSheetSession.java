package com.stripe.android.customersheet.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.customersheet.CustomerPermissions;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodSaveConsentBehavior;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetSession.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/stripe/android/customersheet/data/CustomerSheetSession;", "", "elementsSession", "Lcom/stripe/android/model/ElementsSession;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "savedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "paymentMethodSaveConsentBehavior", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;", "permissions", "Lcom/stripe/android/customersheet/CustomerPermissions;", "defaultPaymentMethodId", "", "<init>", "(Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;)V", "getElementsSession", "()Lcom/stripe/android/model/ElementsSession;", "getPaymentMethods", "()Ljava/util/List;", "getSavedSelection", "()Lcom/stripe/android/paymentsheet/model/SavedSelection;", "getPaymentMethodSaveConsentBehavior", "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;", "getPermissions", "()Lcom/stripe/android/customersheet/CustomerPermissions;", "getDefaultPaymentMethodId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomerSheetSession {
    public static final int $stable = 8;
    private final String defaultPaymentMethodId;
    private final ElementsSession elementsSession;
    private final PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior;
    private final List<PaymentMethod> paymentMethods;
    private final CustomerPermissions permissions;
    private final SavedSelection savedSelection;

    public static /* synthetic */ CustomerSheetSession copy$default(CustomerSheetSession customerSheetSession, ElementsSession elementsSession, List list, SavedSelection savedSelection, PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior, CustomerPermissions customerPermissions, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            elementsSession = customerSheetSession.elementsSession;
        }
        if ((i & 2) != 0) {
            list = customerSheetSession.paymentMethods;
        }
        if ((i & 4) != 0) {
            savedSelection = customerSheetSession.savedSelection;
        }
        if ((i & 8) != 0) {
            paymentMethodSaveConsentBehavior = customerSheetSession.paymentMethodSaveConsentBehavior;
        }
        if ((i & 16) != 0) {
            customerPermissions = customerSheetSession.permissions;
        }
        if ((i & 32) != 0) {
            str = customerSheetSession.defaultPaymentMethodId;
        }
        CustomerPermissions customerPermissions2 = customerPermissions;
        String str2 = str;
        return customerSheetSession.copy(elementsSession, list, savedSelection, paymentMethodSaveConsentBehavior, customerPermissions2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ElementsSession getElementsSession() {
        return this.elementsSession;
    }

    public final List<PaymentMethod> component2() {
        return this.paymentMethods;
    }

    /* renamed from: component3, reason: from getter */
    public final SavedSelection getSavedSelection() {
        return this.savedSelection;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentMethodSaveConsentBehavior getPaymentMethodSaveConsentBehavior() {
        return this.paymentMethodSaveConsentBehavior;
    }

    /* renamed from: component5, reason: from getter */
    public final CustomerPermissions getPermissions() {
        return this.permissions;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDefaultPaymentMethodId() {
        return this.defaultPaymentMethodId;
    }

    public final CustomerSheetSession copy(ElementsSession elementsSession, List<PaymentMethod> paymentMethods, SavedSelection savedSelection, PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior, CustomerPermissions permissions, String defaultPaymentMethodId) {
        Intrinsics.checkNotNullParameter(elementsSession, "elementsSession");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return new CustomerSheetSession(elementsSession, paymentMethods, savedSelection, paymentMethodSaveConsentBehavior, permissions, defaultPaymentMethodId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerSheetSession)) {
            return false;
        }
        CustomerSheetSession customerSheetSession = (CustomerSheetSession) other;
        return Intrinsics.areEqual(this.elementsSession, customerSheetSession.elementsSession) && Intrinsics.areEqual(this.paymentMethods, customerSheetSession.paymentMethods) && Intrinsics.areEqual(this.savedSelection, customerSheetSession.savedSelection) && Intrinsics.areEqual(this.paymentMethodSaveConsentBehavior, customerSheetSession.paymentMethodSaveConsentBehavior) && Intrinsics.areEqual(this.permissions, customerSheetSession.permissions) && Intrinsics.areEqual(this.defaultPaymentMethodId, customerSheetSession.defaultPaymentMethodId);
    }

    public int hashCode() {
        int iHashCode = ((this.elementsSession.hashCode() * 31) + this.paymentMethods.hashCode()) * 31;
        SavedSelection savedSelection = this.savedSelection;
        int iHashCode2 = (((((iHashCode + (savedSelection == null ? 0 : savedSelection.hashCode())) * 31) + this.paymentMethodSaveConsentBehavior.hashCode()) * 31) + this.permissions.hashCode()) * 31;
        String str = this.defaultPaymentMethodId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CustomerSheetSession(elementsSession=" + this.elementsSession + ", paymentMethods=" + this.paymentMethods + ", savedSelection=" + this.savedSelection + ", paymentMethodSaveConsentBehavior=" + this.paymentMethodSaveConsentBehavior + ", permissions=" + this.permissions + ", defaultPaymentMethodId=" + this.defaultPaymentMethodId + ")";
    }

    public CustomerSheetSession(ElementsSession elementsSession, List<PaymentMethod> paymentMethods, SavedSelection savedSelection, PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior, CustomerPermissions permissions, String str) {
        Intrinsics.checkNotNullParameter(elementsSession, "elementsSession");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.elementsSession = elementsSession;
        this.paymentMethods = paymentMethods;
        this.savedSelection = savedSelection;
        this.paymentMethodSaveConsentBehavior = paymentMethodSaveConsentBehavior;
        this.permissions = permissions;
        this.defaultPaymentMethodId = str;
    }

    public final ElementsSession getElementsSession() {
        return this.elementsSession;
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final SavedSelection getSavedSelection() {
        return this.savedSelection;
    }

    public final PaymentMethodSaveConsentBehavior getPaymentMethodSaveConsentBehavior() {
        return this.paymentMethodSaveConsentBehavior;
    }

    public final CustomerPermissions getPermissions() {
        return this.permissions;
    }

    public final String getDefaultPaymentMethodId() {
        return this.defaultPaymentMethodId;
    }
}
