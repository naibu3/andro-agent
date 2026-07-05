package com.stripe.android.paymentsheet.addresselement;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AddressElementNavigator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0011J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H&J$\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000b\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "", "navigateTo", "", TypedValues.AttributesType.S_TARGET, "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;", "setResult", SDKConstants.PARAM_KEY, "", "value", "getResultFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "dismiss", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "onBack", "AutocompleteEvent", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddressElementNavigator {
    void dismiss(AddressLauncherResult result);

    <T> Flow<T> getResultFlow(String key);

    void navigateTo(AddressElementScreen target);

    void onBack();

    void setResult(String key, Object value);

    /* compiled from: AddressElementNavigator.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void dismiss$default(AddressElementNavigator addressElementNavigator, AddressLauncherResult addressLauncherResult, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismiss");
            }
            if ((i & 1) != 0) {
                addressLauncherResult = AddressLauncherResult.Canceled.INSTANCE;
            }
            addressElementNavigator.dismiss(addressLauncherResult);
        }
    }

    /* compiled from: AddressElementNavigator.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \b2\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent;", "Landroid/os/Parcelable;", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "OnBack", "OnEnterManually", "Companion", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$OnBack;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$OnEnterManually;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AutocompleteEvent extends Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final String KEY = "AutocompleteEvent";

        AddressDetails getAddressDetails();

        /* compiled from: AddressElementNavigator.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$OnBack;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent;", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnBack implements AutocompleteEvent {
            public static final int $stable = 0;
            public static final Parcelable.Creator<OnBack> CREATOR = new Creator();
            private final AddressDetails addressDetails;

            /* compiled from: AddressElementNavigator.kt */
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

            @Override // com.stripe.android.paymentsheet.addresselement.AddressElementNavigator.AutocompleteEvent
            public AddressDetails getAddressDetails() {
                return this.addressDetails;
            }
        }

        /* compiled from: AddressElementNavigator.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$OnEnterManually;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent;", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnEnterManually implements AutocompleteEvent {
            public static final int $stable = 0;
            public static final Parcelable.Creator<OnEnterManually> CREATOR = new Creator();
            private final AddressDetails addressDetails;

            /* compiled from: AddressElementNavigator.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OnEnterManually> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OnEnterManually createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OnEnterManually(parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OnEnterManually[] newArray(int i) {
                    return new OnEnterManually[i];
                }
            }

            public static /* synthetic */ OnEnterManually copy$default(OnEnterManually onEnterManually, AddressDetails addressDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    addressDetails = onEnterManually.addressDetails;
                }
                return onEnterManually.copy(addressDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final AddressDetails getAddressDetails() {
                return this.addressDetails;
            }

            public final OnEnterManually copy(AddressDetails addressDetails) {
                return new OnEnterManually(addressDetails);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnEnterManually) && Intrinsics.areEqual(this.addressDetails, ((OnEnterManually) other).addressDetails);
            }

            public int hashCode() {
                AddressDetails addressDetails = this.addressDetails;
                if (addressDetails == null) {
                    return 0;
                }
                return addressDetails.hashCode();
            }

            public String toString() {
                return "OnEnterManually(addressDetails=" + this.addressDetails + ")";
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

            public OnEnterManually(AddressDetails addressDetails) {
                this.addressDetails = addressDetails;
            }

            @Override // com.stripe.android.paymentsheet.addresselement.AddressElementNavigator.AutocompleteEvent
            public AddressDetails getAddressDetails() {
                return this.addressDetails;
            }
        }

        /* compiled from: AddressElementNavigator.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$AutocompleteEvent$Companion;", "", "<init>", "()V", "KEY", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String KEY = "AutocompleteEvent";

            private Companion() {
            }
        }
    }
}
