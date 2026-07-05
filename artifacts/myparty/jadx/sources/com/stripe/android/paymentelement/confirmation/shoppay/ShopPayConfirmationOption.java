package com.stripe.android.paymentelement.confirmation.shoppay;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShopPayConfirmationOption.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "shopPayConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "customerSessionClientSecret", "", "businessName", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/lang/String;Ljava/lang/String;)V", "getShopPayConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "getCustomerSessionClientSecret", "()Ljava/lang/String;", "getBusinessName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShopPayConfirmationOption implements ConfirmationHandler.Option {
    private final String businessName;
    private final String customerSessionClientSecret;
    private final PaymentSheet.ShopPayConfiguration shopPayConfiguration;
    public static final Parcelable.Creator<ShopPayConfirmationOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ShopPayConfirmationOption.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShopPayConfirmationOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopPayConfirmationOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopPayConfirmationOption(PaymentSheet.ShopPayConfiguration.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopPayConfirmationOption[] newArray(int i) {
            return new ShopPayConfirmationOption[i];
        }
    }

    public static /* synthetic */ ShopPayConfirmationOption copy$default(ShopPayConfirmationOption shopPayConfirmationOption, PaymentSheet.ShopPayConfiguration shopPayConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            shopPayConfiguration = shopPayConfirmationOption.shopPayConfiguration;
        }
        if ((i & 2) != 0) {
            str = shopPayConfirmationOption.customerSessionClientSecret;
        }
        if ((i & 4) != 0) {
            str2 = shopPayConfirmationOption.businessName;
        }
        return shopPayConfirmationOption.copy(shopPayConfiguration, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentSheet.ShopPayConfiguration getShopPayConfiguration() {
        return this.shopPayConfiguration;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBusinessName() {
        return this.businessName;
    }

    public final ShopPayConfirmationOption copy(PaymentSheet.ShopPayConfiguration shopPayConfiguration, String customerSessionClientSecret, String businessName) {
        Intrinsics.checkNotNullParameter(shopPayConfiguration, "shopPayConfiguration");
        Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        return new ShopPayConfirmationOption(shopPayConfiguration, customerSessionClientSecret, businessName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopPayConfirmationOption)) {
            return false;
        }
        ShopPayConfirmationOption shopPayConfirmationOption = (ShopPayConfirmationOption) other;
        return Intrinsics.areEqual(this.shopPayConfiguration, shopPayConfirmationOption.shopPayConfiguration) && Intrinsics.areEqual(this.customerSessionClientSecret, shopPayConfirmationOption.customerSessionClientSecret) && Intrinsics.areEqual(this.businessName, shopPayConfirmationOption.businessName);
    }

    public int hashCode() {
        return (((this.shopPayConfiguration.hashCode() * 31) + this.customerSessionClientSecret.hashCode()) * 31) + this.businessName.hashCode();
    }

    public String toString() {
        return "ShopPayConfirmationOption(shopPayConfiguration=" + this.shopPayConfiguration + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", businessName=" + this.businessName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.shopPayConfiguration.writeToParcel(dest, flags);
        dest.writeString(this.customerSessionClientSecret);
        dest.writeString(this.businessName);
    }

    public ShopPayConfirmationOption(PaymentSheet.ShopPayConfiguration shopPayConfiguration, String customerSessionClientSecret, String businessName) {
        Intrinsics.checkNotNullParameter(shopPayConfiguration, "shopPayConfiguration");
        Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        this.shopPayConfiguration = shopPayConfiguration;
        this.customerSessionClientSecret = customerSessionClientSecret;
        this.businessName = businessName;
    }

    public final PaymentSheet.ShopPayConfiguration getShopPayConfiguration() {
        return this.shopPayConfiguration;
    }

    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    public final String getBusinessName() {
        return this.businessName;
    }
}
