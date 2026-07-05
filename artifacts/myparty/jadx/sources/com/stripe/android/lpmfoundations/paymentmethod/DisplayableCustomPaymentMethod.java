package com.stripe.android.lpmfoundations.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayableCustomPaymentMethod.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;", "Landroid/os/Parcelable;", "id", "", "displayName", "logoUrl", "subtitle", "Lcom/stripe/android/core/strings/ResolvableString;", "doesNotCollectBillingDetails", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Z)V", "getId", "()Ljava/lang/String;", "getDisplayName", "getLogoUrl", "getSubtitle", "()Lcom/stripe/android/core/strings/ResolvableString;", "getDoesNotCollectBillingDetails", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DisplayableCustomPaymentMethod implements Parcelable {
    private final String displayName;
    private final boolean doesNotCollectBillingDetails;
    private final String id;
    private final String logoUrl;
    private final ResolvableString subtitle;
    public static final Parcelable.Creator<DisplayableCustomPaymentMethod> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: DisplayableCustomPaymentMethod.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisplayableCustomPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayableCustomPaymentMethod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisplayableCustomPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), (ResolvableString) parcel.readParcelable(DisplayableCustomPaymentMethod.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisplayableCustomPaymentMethod[] newArray(int i) {
            return new DisplayableCustomPaymentMethod[i];
        }
    }

    public static /* synthetic */ DisplayableCustomPaymentMethod copy$default(DisplayableCustomPaymentMethod displayableCustomPaymentMethod, String str, String str2, String str3, ResolvableString resolvableString, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayableCustomPaymentMethod.id;
        }
        if ((i & 2) != 0) {
            str2 = displayableCustomPaymentMethod.displayName;
        }
        if ((i & 4) != 0) {
            str3 = displayableCustomPaymentMethod.logoUrl;
        }
        if ((i & 8) != 0) {
            resolvableString = displayableCustomPaymentMethod.subtitle;
        }
        if ((i & 16) != 0) {
            z = displayableCustomPaymentMethod.doesNotCollectBillingDetails;
        }
        boolean z2 = z;
        String str4 = str3;
        return displayableCustomPaymentMethod.copy(str, str2, str4, resolvableString, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final ResolvableString getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDoesNotCollectBillingDetails() {
        return this.doesNotCollectBillingDetails;
    }

    public final DisplayableCustomPaymentMethod copy(String id, String displayName, String logoUrl, ResolvableString subtitle, boolean doesNotCollectBillingDetails) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        return new DisplayableCustomPaymentMethod(id, displayName, logoUrl, subtitle, doesNotCollectBillingDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayableCustomPaymentMethod)) {
            return false;
        }
        DisplayableCustomPaymentMethod displayableCustomPaymentMethod = (DisplayableCustomPaymentMethod) other;
        return Intrinsics.areEqual(this.id, displayableCustomPaymentMethod.id) && Intrinsics.areEqual(this.displayName, displayableCustomPaymentMethod.displayName) && Intrinsics.areEqual(this.logoUrl, displayableCustomPaymentMethod.logoUrl) && Intrinsics.areEqual(this.subtitle, displayableCustomPaymentMethod.subtitle) && this.doesNotCollectBillingDetails == displayableCustomPaymentMethod.doesNotCollectBillingDetails;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.logoUrl.hashCode()) * 31;
        ResolvableString resolvableString = this.subtitle;
        return ((iHashCode + (resolvableString == null ? 0 : resolvableString.hashCode())) * 31) + Boolean.hashCode(this.doesNotCollectBillingDetails);
    }

    public String toString() {
        return "DisplayableCustomPaymentMethod(id=" + this.id + ", displayName=" + this.displayName + ", logoUrl=" + this.logoUrl + ", subtitle=" + this.subtitle + ", doesNotCollectBillingDetails=" + this.doesNotCollectBillingDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.displayName);
        dest.writeString(this.logoUrl);
        dest.writeParcelable(this.subtitle, flags);
        dest.writeInt(this.doesNotCollectBillingDetails ? 1 : 0);
    }

    public DisplayableCustomPaymentMethod(String id, String displayName, String logoUrl, ResolvableString resolvableString, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.id = id;
        this.displayName = displayName;
        this.logoUrl = logoUrl;
        this.subtitle = resolvableString;
        this.doesNotCollectBillingDetails = z;
    }

    public final String getId() {
        return this.id;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final ResolvableString getSubtitle() {
        return this.subtitle;
    }

    public final boolean getDoesNotCollectBillingDetails() {
        return this.doesNotCollectBillingDetails;
    }
}
