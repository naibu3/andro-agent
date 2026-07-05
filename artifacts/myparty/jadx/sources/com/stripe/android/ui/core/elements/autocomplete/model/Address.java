package com.stripe.android.ui.core.elements.autocomplete.model;

import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransformGoogleToStripeAddress.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006*"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/Address;", "", "locality", "", "country", "addressLine1", "addressLine2", "administrativeArea", "dependentLocality", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLocality", "()Ljava/lang/String;", "setLocality", "(Ljava/lang/String;)V", "getCountry", "setCountry", "getAddressLine1", "setAddressLine1", "getAddressLine2", "setAddressLine2", "getAdministrativeArea", "setAdministrativeArea", "getDependentLocality", "setDependentLocality", "getPostalCode", "setPostalCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Address {
    public static final int $stable = 8;
    private String addressLine1;
    private String addressLine2;
    private String administrativeArea;
    private String country;
    private String dependentLocality;
    private String locality;
    private String postalCode;

    public Address() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.locality;
        }
        if ((i & 2) != 0) {
            str2 = address.country;
        }
        if ((i & 4) != 0) {
            str3 = address.addressLine1;
        }
        if ((i & 8) != 0) {
            str4 = address.addressLine2;
        }
        if ((i & 16) != 0) {
            str5 = address.administrativeArea;
        }
        if ((i & 32) != 0) {
            str6 = address.dependentLocality;
        }
        if ((i & 64) != 0) {
            str7 = address.postalCode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return address.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAdministrativeArea() {
        return this.administrativeArea;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDependentLocality() {
        return this.dependentLocality;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public final Address copy(String locality, String country, String addressLine1, String addressLine2, String administrativeArea, String dependentLocality, String postalCode) {
        return new Address(locality, country, addressLine1, addressLine2, administrativeArea, dependentLocality, postalCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return Intrinsics.areEqual(this.locality, address.locality) && Intrinsics.areEqual(this.country, address.country) && Intrinsics.areEqual(this.addressLine1, address.addressLine1) && Intrinsics.areEqual(this.addressLine2, address.addressLine2) && Intrinsics.areEqual(this.administrativeArea, address.administrativeArea) && Intrinsics.areEqual(this.dependentLocality, address.dependentLocality) && Intrinsics.areEqual(this.postalCode, address.postalCode);
    }

    public int hashCode() {
        String str = this.locality;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.administrativeArea;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dependentLocality;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.postalCode;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "Address(locality=" + this.locality + ", country=" + this.country + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", administrativeArea=" + this.administrativeArea + ", dependentLocality=" + this.dependentLocality + ", postalCode=" + this.postalCode + ")";
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.locality = str;
        this.country = str2;
        this.addressLine1 = str3;
        this.addressLine2 = str4;
        this.administrativeArea = str5;
        this.dependentLocality = str6;
        this.postalCode = str7;
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public final String getLocality() {
        return this.locality;
    }

    public final void setLocality(String str) {
        this.locality = str;
    }

    public final String getCountry() {
        return this.country;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final void setAddressLine1(String str) {
        this.addressLine1 = str;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final void setAddressLine2(String str) {
        this.addressLine2 = str;
    }

    public final String getAdministrativeArea() {
        return this.administrativeArea;
    }

    public final void setAdministrativeArea(String str) {
        this.administrativeArea = str;
    }

    public final String getDependentLocality() {
        return this.dependentLocality;
    }

    public final void setDependentLocality(String str) {
        this.dependentLocality = str;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }
}
