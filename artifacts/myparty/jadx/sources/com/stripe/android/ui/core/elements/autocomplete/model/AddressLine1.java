package com.stripe.android.ui.core.elements.autocomplete.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransformGoogleToStripeAddress.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/AddressLine1;", "", "streetNumber", "", "route", "subLocalityLevel2", "subLocalityLevel3", "subLocalityLevel4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStreetNumber", "()Ljava/lang/String;", "setStreetNumber", "(Ljava/lang/String;)V", "getRoute", "setRoute", "getSubLocalityLevel2", "setSubLocalityLevel2", "getSubLocalityLevel3", "setSubLocalityLevel3", "getSubLocalityLevel4", "setSubLocalityLevel4", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AddressLine1 {
    public static final int $stable = 8;
    private String route;
    private String streetNumber;
    private String subLocalityLevel2;
    private String subLocalityLevel3;
    private String subLocalityLevel4;

    public AddressLine1() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AddressLine1 copy$default(AddressLine1 addressLine1, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressLine1.streetNumber;
        }
        if ((i & 2) != 0) {
            str2 = addressLine1.route;
        }
        if ((i & 4) != 0) {
            str3 = addressLine1.subLocalityLevel2;
        }
        if ((i & 8) != 0) {
            str4 = addressLine1.subLocalityLevel3;
        }
        if ((i & 16) != 0) {
            str5 = addressLine1.subLocalityLevel4;
        }
        String str6 = str5;
        String str7 = str3;
        return addressLine1.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStreetNumber() {
        return this.streetNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubLocalityLevel2() {
        return this.subLocalityLevel2;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubLocalityLevel3() {
        return this.subLocalityLevel3;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubLocalityLevel4() {
        return this.subLocalityLevel4;
    }

    public final AddressLine1 copy(String streetNumber, String route, String subLocalityLevel2, String subLocalityLevel3, String subLocalityLevel4) {
        return new AddressLine1(streetNumber, route, subLocalityLevel2, subLocalityLevel3, subLocalityLevel4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressLine1)) {
            return false;
        }
        AddressLine1 addressLine1 = (AddressLine1) other;
        return Intrinsics.areEqual(this.streetNumber, addressLine1.streetNumber) && Intrinsics.areEqual(this.route, addressLine1.route) && Intrinsics.areEqual(this.subLocalityLevel2, addressLine1.subLocalityLevel2) && Intrinsics.areEqual(this.subLocalityLevel3, addressLine1.subLocalityLevel3) && Intrinsics.areEqual(this.subLocalityLevel4, addressLine1.subLocalityLevel4);
    }

    public int hashCode() {
        String str = this.streetNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.route;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subLocalityLevel2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subLocalityLevel3;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subLocalityLevel4;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "AddressLine1(streetNumber=" + this.streetNumber + ", route=" + this.route + ", subLocalityLevel2=" + this.subLocalityLevel2 + ", subLocalityLevel3=" + this.subLocalityLevel3 + ", subLocalityLevel4=" + this.subLocalityLevel4 + ")";
    }

    public AddressLine1(String str, String str2, String str3, String str4, String str5) {
        this.streetNumber = str;
        this.route = str2;
        this.subLocalityLevel2 = str3;
        this.subLocalityLevel3 = str4;
        this.subLocalityLevel4 = str5;
    }

    public /* synthetic */ AddressLine1(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final String getStreetNumber() {
        return this.streetNumber;
    }

    public final void setStreetNumber(String str) {
        this.streetNumber = str;
    }

    public final String getRoute() {
        return this.route;
    }

    public final void setRoute(String str) {
        this.route = str;
    }

    public final String getSubLocalityLevel2() {
        return this.subLocalityLevel2;
    }

    public final void setSubLocalityLevel2(String str) {
        this.subLocalityLevel2 = str;
    }

    public final String getSubLocalityLevel3() {
        return this.subLocalityLevel3;
    }

    public final void setSubLocalityLevel3(String str) {
        this.subLocalityLevel3 = str;
    }

    public final String getSubLocalityLevel4() {
        return this.subLocalityLevel4;
    }

    public final void setSubLocalityLevel4(String str) {
        this.subLocalityLevel4 = str;
    }
}
