package com.stripe.android.paymentsheet.ui;

import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.uicore.forms.FormFieldEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingDetailsFormState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006)"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;", "", "name", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "email", "phone", "line1", "line2", "city", HintConstants.AUTOFILL_HINT_POSTAL_CODE, ServerProtocol.DIALOG_PARAM_STATE, "country", "<init>", "(Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;)V", "getName", "()Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getEmail", "getPhone", "getLine1", "getLine2", "getCity", "getPostalCode", "getState", "getCountry", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BillingDetailsFormState {
    public static final int $stable = (((((((FormFieldEntry.$stable | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable) | FormFieldEntry.$stable;
    private final FormFieldEntry city;
    private final FormFieldEntry country;
    private final FormFieldEntry email;
    private final FormFieldEntry line1;
    private final FormFieldEntry line2;
    private final FormFieldEntry name;
    private final FormFieldEntry phone;
    private final FormFieldEntry postalCode;
    private final FormFieldEntry state;

    public static /* synthetic */ BillingDetailsFormState copy$default(BillingDetailsFormState billingDetailsFormState, FormFieldEntry formFieldEntry, FormFieldEntry formFieldEntry2, FormFieldEntry formFieldEntry3, FormFieldEntry formFieldEntry4, FormFieldEntry formFieldEntry5, FormFieldEntry formFieldEntry6, FormFieldEntry formFieldEntry7, FormFieldEntry formFieldEntry8, FormFieldEntry formFieldEntry9, int i, Object obj) {
        if ((i & 1) != 0) {
            formFieldEntry = billingDetailsFormState.name;
        }
        if ((i & 2) != 0) {
            formFieldEntry2 = billingDetailsFormState.email;
        }
        if ((i & 4) != 0) {
            formFieldEntry3 = billingDetailsFormState.phone;
        }
        if ((i & 8) != 0) {
            formFieldEntry4 = billingDetailsFormState.line1;
        }
        if ((i & 16) != 0) {
            formFieldEntry5 = billingDetailsFormState.line2;
        }
        if ((i & 32) != 0) {
            formFieldEntry6 = billingDetailsFormState.city;
        }
        if ((i & 64) != 0) {
            formFieldEntry7 = billingDetailsFormState.postalCode;
        }
        if ((i & 128) != 0) {
            formFieldEntry8 = billingDetailsFormState.state;
        }
        if ((i & 256) != 0) {
            formFieldEntry9 = billingDetailsFormState.country;
        }
        FormFieldEntry formFieldEntry10 = formFieldEntry8;
        FormFieldEntry formFieldEntry11 = formFieldEntry9;
        FormFieldEntry formFieldEntry12 = formFieldEntry6;
        FormFieldEntry formFieldEntry13 = formFieldEntry7;
        FormFieldEntry formFieldEntry14 = formFieldEntry5;
        FormFieldEntry formFieldEntry15 = formFieldEntry3;
        return billingDetailsFormState.copy(formFieldEntry, formFieldEntry2, formFieldEntry15, formFieldEntry4, formFieldEntry14, formFieldEntry12, formFieldEntry13, formFieldEntry10, formFieldEntry11);
    }

    /* renamed from: component1, reason: from getter */
    public final FormFieldEntry getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final FormFieldEntry getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final FormFieldEntry getPhone() {
        return this.phone;
    }

    /* renamed from: component4, reason: from getter */
    public final FormFieldEntry getLine1() {
        return this.line1;
    }

    /* renamed from: component5, reason: from getter */
    public final FormFieldEntry getLine2() {
        return this.line2;
    }

    /* renamed from: component6, reason: from getter */
    public final FormFieldEntry getCity() {
        return this.city;
    }

    /* renamed from: component7, reason: from getter */
    public final FormFieldEntry getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component8, reason: from getter */
    public final FormFieldEntry getState() {
        return this.state;
    }

    /* renamed from: component9, reason: from getter */
    public final FormFieldEntry getCountry() {
        return this.country;
    }

    public final BillingDetailsFormState copy(FormFieldEntry name, FormFieldEntry email, FormFieldEntry phone, FormFieldEntry line1, FormFieldEntry line2, FormFieldEntry city, FormFieldEntry postalCode, FormFieldEntry state, FormFieldEntry country) {
        return new BillingDetailsFormState(name, email, phone, line1, line2, city, postalCode, state, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingDetailsFormState)) {
            return false;
        }
        BillingDetailsFormState billingDetailsFormState = (BillingDetailsFormState) other;
        return Intrinsics.areEqual(this.name, billingDetailsFormState.name) && Intrinsics.areEqual(this.email, billingDetailsFormState.email) && Intrinsics.areEqual(this.phone, billingDetailsFormState.phone) && Intrinsics.areEqual(this.line1, billingDetailsFormState.line1) && Intrinsics.areEqual(this.line2, billingDetailsFormState.line2) && Intrinsics.areEqual(this.city, billingDetailsFormState.city) && Intrinsics.areEqual(this.postalCode, billingDetailsFormState.postalCode) && Intrinsics.areEqual(this.state, billingDetailsFormState.state) && Intrinsics.areEqual(this.country, billingDetailsFormState.country);
    }

    public int hashCode() {
        FormFieldEntry formFieldEntry = this.name;
        int iHashCode = (formFieldEntry == null ? 0 : formFieldEntry.hashCode()) * 31;
        FormFieldEntry formFieldEntry2 = this.email;
        int iHashCode2 = (iHashCode + (formFieldEntry2 == null ? 0 : formFieldEntry2.hashCode())) * 31;
        FormFieldEntry formFieldEntry3 = this.phone;
        int iHashCode3 = (iHashCode2 + (formFieldEntry3 == null ? 0 : formFieldEntry3.hashCode())) * 31;
        FormFieldEntry formFieldEntry4 = this.line1;
        int iHashCode4 = (iHashCode3 + (formFieldEntry4 == null ? 0 : formFieldEntry4.hashCode())) * 31;
        FormFieldEntry formFieldEntry5 = this.line2;
        int iHashCode5 = (iHashCode4 + (formFieldEntry5 == null ? 0 : formFieldEntry5.hashCode())) * 31;
        FormFieldEntry formFieldEntry6 = this.city;
        int iHashCode6 = (iHashCode5 + (formFieldEntry6 == null ? 0 : formFieldEntry6.hashCode())) * 31;
        FormFieldEntry formFieldEntry7 = this.postalCode;
        int iHashCode7 = (iHashCode6 + (formFieldEntry7 == null ? 0 : formFieldEntry7.hashCode())) * 31;
        FormFieldEntry formFieldEntry8 = this.state;
        int iHashCode8 = (iHashCode7 + (formFieldEntry8 == null ? 0 : formFieldEntry8.hashCode())) * 31;
        FormFieldEntry formFieldEntry9 = this.country;
        return iHashCode8 + (formFieldEntry9 != null ? formFieldEntry9.hashCode() : 0);
    }

    public String toString() {
        return "BillingDetailsFormState(name=" + this.name + ", email=" + this.email + ", phone=" + this.phone + ", line1=" + this.line1 + ", line2=" + this.line2 + ", city=" + this.city + ", postalCode=" + this.postalCode + ", state=" + this.state + ", country=" + this.country + ")";
    }

    public BillingDetailsFormState(FormFieldEntry formFieldEntry, FormFieldEntry formFieldEntry2, FormFieldEntry formFieldEntry3, FormFieldEntry formFieldEntry4, FormFieldEntry formFieldEntry5, FormFieldEntry formFieldEntry6, FormFieldEntry formFieldEntry7, FormFieldEntry formFieldEntry8, FormFieldEntry formFieldEntry9) {
        this.name = formFieldEntry;
        this.email = formFieldEntry2;
        this.phone = formFieldEntry3;
        this.line1 = formFieldEntry4;
        this.line2 = formFieldEntry5;
        this.city = formFieldEntry6;
        this.postalCode = formFieldEntry7;
        this.state = formFieldEntry8;
        this.country = formFieldEntry9;
    }

    public final FormFieldEntry getName() {
        return this.name;
    }

    public final FormFieldEntry getEmail() {
        return this.email;
    }

    public final FormFieldEntry getPhone() {
        return this.phone;
    }

    public final FormFieldEntry getLine1() {
        return this.line1;
    }

    public final FormFieldEntry getLine2() {
        return this.line2;
    }

    public final FormFieldEntry getCity() {
        return this.city;
    }

    public final FormFieldEntry getPostalCode() {
        return this.postalCode;
    }

    public final FormFieldEntry getState() {
        return this.state;
    }

    public final FormFieldEntry getCountry() {
        return this.country;
    }
}
