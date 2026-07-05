package com.stripe.android.paymentsheet.addresselement;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteLauncher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\tJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;", "", "launch", "", "country", "", "googlePlacesApiKey", "resultHandler", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;", "Result", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AutocompleteLauncher {
    void launch(String country, String googlePlacesApiKey, AutocompleteLauncherResultHandler resultHandler);

    /* compiled from: AutocompleteLauncher.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;", "Landroid/os/Parcelable;", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "EnterManually", "OnBack", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$EnterManually;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$OnBack;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result extends Parcelable {
        AddressDetails getAddressDetails();

        /* compiled from: AutocompleteLauncher.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$EnterManually;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class EnterManually implements Result {
            public static final int $stable = 0;
            public static final Parcelable.Creator<EnterManually> CREATOR = new Creator();
            private final AddressDetails addressDetails;

            /* compiled from: AutocompleteLauncher.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<EnterManually> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EnterManually createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EnterManually(parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EnterManually[] newArray(int i) {
                    return new EnterManually[i];
                }
            }

            public static /* synthetic */ EnterManually copy$default(EnterManually enterManually, AddressDetails addressDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressDetails = enterManually.addressDetails;
                }
                return enterManually.copy(addressDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final AddressDetails getAddressDetails() {
                return this.addressDetails;
            }

            public final EnterManually copy(AddressDetails addressDetails) {
                return new EnterManually(addressDetails);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EnterManually) && Intrinsics.areEqual(this.addressDetails, ((EnterManually) other).addressDetails);
            }

            public int hashCode() {
                AddressDetails addressDetails = this.addressDetails;
                if (addressDetails == null) {
                    return 0;
                }
                return addressDetails.hashCode();
            }

            public String toString() {
                return "EnterManually(addressDetails=" + this.addressDetails + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                AddressDetails addressDetails = this.addressDetails;
                if (addressDetails == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    addressDetails.writeToParcel(dest, flags);
                }
            }

            public EnterManually(AddressDetails addressDetails) {
                this.addressDetails = addressDetails;
            }

            @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteLauncher.Result
            public AddressDetails getAddressDetails() {
                return this.addressDetails;
            }
        }

        /* compiled from: AutocompleteLauncher.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result$OnBack;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher$Result;", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnBack implements Result {
            public static final int $stable = 0;
            public static final Parcelable.Creator<OnBack> CREATOR = new Creator();
            private final AddressDetails addressDetails;

            /* compiled from: AutocompleteLauncher.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OnBack> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OnBack createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OnBack(parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OnBack[] newArray(int i) {
                    return new OnBack[i];
                }
            }

            public static /* synthetic */ OnBack copy$default(OnBack onBack, AddressDetails addressDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressDetails = onBack.addressDetails;
                }
                return onBack.copy(addressDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final AddressDetails getAddressDetails() {
                return this.addressDetails;
            }

            public final OnBack copy(AddressDetails addressDetails) {
                return new OnBack(addressDetails);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnBack) && Intrinsics.areEqual(this.addressDetails, ((OnBack) other).addressDetails);
            }

            public int hashCode() {
                AddressDetails addressDetails = this.addressDetails;
                if (addressDetails == null) {
                    return 0;
                }
                return addressDetails.hashCode();
            }

            public String toString() {
                return "OnBack(addressDetails=" + this.addressDetails + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                AddressDetails addressDetails = this.addressDetails;
                if (addressDetails == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    addressDetails.writeToParcel(dest, flags);
                }
            }

            public OnBack(AddressDetails addressDetails) {
                this.addressDetails = addressDetails;
            }

            @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteLauncher.Result
            public AddressDetails getAddressDetails() {
                return this.addressDetails;
            }
        }
    }
}
