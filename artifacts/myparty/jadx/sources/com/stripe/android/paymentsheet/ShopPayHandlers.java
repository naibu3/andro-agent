package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.paymentsheet.PaymentSheet;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShopPayHandlers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/ShopPayHandlers;", "", "shippingMethodUpdateHandler", "Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;", "shippingContactHandler", "Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;", "<init>", "(Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;)V", "getShippingMethodUpdateHandler", "()Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;", "getShippingContactHandler", "()Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;", "ShippingRateUpdate", "ShippingContactUpdate", "SelectedAddress", "SelectedShippingRate", "ShippingMethodHandler", "ShippingContactHandler", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShopPayHandlers {
    public static final int $stable = 0;
    private final ShippingContactHandler shippingContactHandler;
    private final ShippingMethodHandler shippingMethodUpdateHandler;

    /* compiled from: ShopPayHandlers.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactHandler;", "", "onAddressSelected", "Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactUpdate;", "address", "Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedAddress;", "(Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ShippingContactHandler {
        Object onAddressSelected(SelectedAddress selectedAddress, Continuation<? super ShippingContactUpdate> continuation);
    }

    /* compiled from: ShopPayHandlers.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingMethodHandler;", "", "onRateSelected", "Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingRateUpdate;", "selectedRate", "Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedShippingRate;", "(Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedShippingRate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ShippingMethodHandler {
        Object onRateSelected(SelectedShippingRate selectedShippingRate, Continuation<? super ShippingRateUpdate> continuation);
    }

    public ShopPayHandlers(ShippingMethodHandler shippingMethodUpdateHandler, ShippingContactHandler shippingContactHandler) {
        Intrinsics.checkNotNullParameter(shippingMethodUpdateHandler, "shippingMethodUpdateHandler");
        Intrinsics.checkNotNullParameter(shippingContactHandler, "shippingContactHandler");
        this.shippingMethodUpdateHandler = shippingMethodUpdateHandler;
        this.shippingContactHandler = shippingContactHandler;
    }

    public final ShippingMethodHandler getShippingMethodUpdateHandler() {
        return this.shippingMethodUpdateHandler;
    }

    public final ShippingContactHandler getShippingContactHandler() {
        return this.shippingContactHandler;
    }

    /* compiled from: ShopPayHandlers.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingRateUpdate;", "Landroid/os/Parcelable;", "lineItems", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;", "shippingRates", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLineItems", "()Ljava/util/List;", "getShippingRates", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShippingRateUpdate implements Parcelable {
        private final List<PaymentSheet.ShopPayConfiguration.LineItem> lineItems;
        private final List<PaymentSheet.ShopPayConfiguration.ShippingRate> shippingRates;
        public static final Parcelable.Creator<ShippingRateUpdate> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ShopPayHandlers.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShippingRateUpdate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingRateUpdate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PaymentSheet.ShopPayConfiguration.LineItem.CREATOR.createFromParcel(parcel));
                }
                ArrayList arrayList2 = arrayList;
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(PaymentSheet.ShopPayConfiguration.ShippingRate.CREATOR.createFromParcel(parcel));
                }
                return new ShippingRateUpdate(arrayList2, arrayList3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingRateUpdate[] newArray(int i) {
                return new ShippingRateUpdate[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShippingRateUpdate)) {
                return false;
            }
            ShippingRateUpdate shippingRateUpdate = (ShippingRateUpdate) obj;
            return Intrinsics.areEqual(this.lineItems, shippingRateUpdate.lineItems) && Intrinsics.areEqual(this.shippingRates, shippingRateUpdate.shippingRates);
        }

        public int hashCode() {
            return (this.lineItems.hashCode() * 31) + this.shippingRates.hashCode();
        }

        public String toString() {
            return "ShippingRateUpdate(lineItems=" + this.lineItems + ", shippingRates=" + this.shippingRates + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<PaymentSheet.ShopPayConfiguration.LineItem> list = this.lineItems;
            dest.writeInt(list.size());
            Iterator<PaymentSheet.ShopPayConfiguration.LineItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<PaymentSheet.ShopPayConfiguration.ShippingRate> list2 = this.shippingRates;
            dest.writeInt(list2.size());
            Iterator<PaymentSheet.ShopPayConfiguration.ShippingRate> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }

        public ShippingRateUpdate(List<PaymentSheet.ShopPayConfiguration.LineItem> lineItems, List<PaymentSheet.ShopPayConfiguration.ShippingRate> shippingRates) {
            Intrinsics.checkNotNullParameter(lineItems, "lineItems");
            Intrinsics.checkNotNullParameter(shippingRates, "shippingRates");
            this.lineItems = lineItems;
            this.shippingRates = shippingRates;
        }

        public final List<PaymentSheet.ShopPayConfiguration.LineItem> getLineItems() {
            return this.lineItems;
        }

        public final List<PaymentSheet.ShopPayConfiguration.ShippingRate> getShippingRates() {
            return this.shippingRates;
        }
    }

    /* compiled from: ShopPayHandlers.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/ShopPayHandlers$ShippingContactUpdate;", "Landroid/os/Parcelable;", "lineItems", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;", "shippingRates", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLineItems", "()Ljava/util/List;", "getShippingRates", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShippingContactUpdate implements Parcelable {
        private final List<PaymentSheet.ShopPayConfiguration.LineItem> lineItems;
        private final List<PaymentSheet.ShopPayConfiguration.ShippingRate> shippingRates;
        public static final Parcelable.Creator<ShippingContactUpdate> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ShopPayHandlers.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShippingContactUpdate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingContactUpdate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PaymentSheet.ShopPayConfiguration.LineItem.CREATOR.createFromParcel(parcel));
                }
                ArrayList arrayList2 = arrayList;
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(PaymentSheet.ShopPayConfiguration.ShippingRate.CREATOR.createFromParcel(parcel));
                }
                return new ShippingContactUpdate(arrayList2, arrayList3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShippingContactUpdate[] newArray(int i) {
                return new ShippingContactUpdate[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShippingContactUpdate)) {
                return false;
            }
            ShippingContactUpdate shippingContactUpdate = (ShippingContactUpdate) obj;
            return Intrinsics.areEqual(this.lineItems, shippingContactUpdate.lineItems) && Intrinsics.areEqual(this.shippingRates, shippingContactUpdate.shippingRates);
        }

        public int hashCode() {
            return (this.lineItems.hashCode() * 31) + this.shippingRates.hashCode();
        }

        public String toString() {
            return "ShippingContactUpdate(lineItems=" + this.lineItems + ", shippingRates=" + this.shippingRates + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<PaymentSheet.ShopPayConfiguration.LineItem> list = this.lineItems;
            dest.writeInt(list.size());
            Iterator<PaymentSheet.ShopPayConfiguration.LineItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<PaymentSheet.ShopPayConfiguration.ShippingRate> list2 = this.shippingRates;
            dest.writeInt(list2.size());
            Iterator<PaymentSheet.ShopPayConfiguration.ShippingRate> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }

        public ShippingContactUpdate(List<PaymentSheet.ShopPayConfiguration.LineItem> lineItems, List<PaymentSheet.ShopPayConfiguration.ShippingRate> shippingRates) {
            Intrinsics.checkNotNullParameter(lineItems, "lineItems");
            Intrinsics.checkNotNullParameter(shippingRates, "shippingRates");
            this.lineItems = lineItems;
            this.shippingRates = shippingRates;
        }

        public final List<PaymentSheet.ShopPayConfiguration.LineItem> getLineItems() {
            return this.lineItems;
        }

        public final List<PaymentSheet.ShopPayConfiguration.ShippingRate> getShippingRates() {
            return this.shippingRates;
        }
    }

    /* compiled from: ShopPayHandlers.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedAddress;", "Landroid/os/Parcelable;", "city", "", ServerProtocol.DIALOG_PARAM_STATE, HintConstants.AUTOFILL_HINT_POSTAL_CODE, "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getState", "getPostalCode", "getCountry", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectedAddress implements Parcelable {
        private final String city;
        private final String country;
        private final String postalCode;
        private final String state;
        public static final Parcelable.Creator<SelectedAddress> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ShopPayHandlers.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectedAddress> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedAddress createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectedAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedAddress[] newArray(int i) {
                return new SelectedAddress[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedAddress)) {
                return false;
            }
            SelectedAddress selectedAddress = (SelectedAddress) obj;
            return Intrinsics.areEqual(this.city, selectedAddress.city) && Intrinsics.areEqual(this.state, selectedAddress.state) && Intrinsics.areEqual(this.postalCode, selectedAddress.postalCode) && Intrinsics.areEqual(this.country, selectedAddress.country);
        }

        public int hashCode() {
            return (((((this.city.hashCode() * 31) + this.state.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.country.hashCode();
        }

        public String toString() {
            return "SelectedAddress(city=" + this.city + ", state=" + this.state + ", postalCode=" + this.postalCode + ", country=" + this.country + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.city);
            dest.writeString(this.state);
            dest.writeString(this.postalCode);
            dest.writeString(this.country);
        }

        public SelectedAddress(String city, String state, String postalCode, String country) {
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(postalCode, "postalCode");
            Intrinsics.checkNotNullParameter(country, "country");
            this.city = city;
            this.state = state;
            this.postalCode = postalCode;
            this.country = country;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getState() {
            return this.state;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final String getCountry() {
            return this.country;
        }
    }

    /* compiled from: ShopPayHandlers.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/ShopPayHandlers$SelectedShippingRate;", "Landroid/os/Parcelable;", "shippingRate", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;)V", "getShippingRate", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectedShippingRate implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SelectedShippingRate> CREATOR = new Creator();
        private final PaymentSheet.ShopPayConfiguration.ShippingRate shippingRate;

        /* compiled from: ShopPayHandlers.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectedShippingRate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedShippingRate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectedShippingRate(PaymentSheet.ShopPayConfiguration.ShippingRate.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedShippingRate[] newArray(int i) {
                return new SelectedShippingRate[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectedShippingRate) && Intrinsics.areEqual(this.shippingRate, ((SelectedShippingRate) obj).shippingRate);
        }

        public int hashCode() {
            return this.shippingRate.hashCode();
        }

        public String toString() {
            return "SelectedShippingRate(shippingRate=" + this.shippingRate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.shippingRate.writeToParcel(dest, flags);
        }

        public SelectedShippingRate(PaymentSheet.ShopPayConfiguration.ShippingRate shippingRate) {
            Intrinsics.checkNotNullParameter(shippingRate, "shippingRate");
            this.shippingRate = shippingRate;
        }

        public final PaymentSheet.ShopPayConfiguration.ShippingRate getShippingRate() {
            return this.shippingRate;
        }
    }
}
