package com.stripe.android.shoppay;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShopPayArgs.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006("}, d2 = {"Lcom/stripe/android/shoppay/ShopPayArgs;", "Landroid/os/Parcelable;", "shopPayConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "paymentElementCallbackIdentifier", "customerSessionClientSecret", "businessName", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShopPayConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "getPaymentElementCallbackIdentifier", "getCustomerSessionClientSecret", "getBusinessName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ShopPayArgs implements Parcelable {
    private final String businessName;
    private final String customerSessionClientSecret;
    private final String paymentElementCallbackIdentifier;
    private final String publishableKey;
    private final PaymentSheet.ShopPayConfiguration shopPayConfiguration;
    private final String stripeAccountId;
    public static final Parcelable.Creator<ShopPayArgs> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ShopPayArgs.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShopPayArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopPayArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopPayArgs(PaymentSheet.ShopPayConfiguration.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShopPayArgs[] newArray(int i) {
            return new ShopPayArgs[i];
        }
    }

    public static /* synthetic */ ShopPayArgs copy$default(ShopPayArgs shopPayArgs, PaymentSheet.ShopPayConfiguration shopPayConfiguration, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            shopPayConfiguration = shopPayArgs.shopPayConfiguration;
        }
        if ((i & 2) != 0) {
            str = shopPayArgs.publishableKey;
        }
        if ((i & 4) != 0) {
            str2 = shopPayArgs.stripeAccountId;
        }
        if ((i & 8) != 0) {
            str3 = shopPayArgs.paymentElementCallbackIdentifier;
        }
        if ((i & 16) != 0) {
            str4 = shopPayArgs.customerSessionClientSecret;
        }
        if ((i & 32) != 0) {
            str5 = shopPayArgs.businessName;
        }
        String str6 = str4;
        String str7 = str5;
        return shopPayArgs.copy(shopPayConfiguration, str, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentSheet.ShopPayConfiguration getShopPayConfiguration() {
        return this.shopPayConfiguration;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPaymentElementCallbackIdentifier() {
        return this.paymentElementCallbackIdentifier;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBusinessName() {
        return this.businessName;
    }

    public final ShopPayArgs copy(PaymentSheet.ShopPayConfiguration shopPayConfiguration, String publishableKey, String stripeAccountId, String paymentElementCallbackIdentifier, String customerSessionClientSecret, String businessName) {
        Intrinsics.checkNotNullParameter(shopPayConfiguration, "shopPayConfiguration");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        return new ShopPayArgs(shopPayConfiguration, publishableKey, stripeAccountId, paymentElementCallbackIdentifier, customerSessionClientSecret, businessName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopPayArgs)) {
            return false;
        }
        ShopPayArgs shopPayArgs = (ShopPayArgs) other;
        return Intrinsics.areEqual(this.shopPayConfiguration, shopPayArgs.shopPayConfiguration) && Intrinsics.areEqual(this.publishableKey, shopPayArgs.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, shopPayArgs.stripeAccountId) && Intrinsics.areEqual(this.paymentElementCallbackIdentifier, shopPayArgs.paymentElementCallbackIdentifier) && Intrinsics.areEqual(this.customerSessionClientSecret, shopPayArgs.customerSessionClientSecret) && Intrinsics.areEqual(this.businessName, shopPayArgs.businessName);
    }

    public int hashCode() {
        int iHashCode = ((this.shopPayConfiguration.hashCode() * 31) + this.publishableKey.hashCode()) * 31;
        String str = this.stripeAccountId;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paymentElementCallbackIdentifier.hashCode()) * 31) + this.customerSessionClientSecret.hashCode()) * 31) + this.businessName.hashCode();
    }

    public String toString() {
        return "ShopPayArgs(shopPayConfiguration=" + this.shopPayConfiguration + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", paymentElementCallbackIdentifier=" + this.paymentElementCallbackIdentifier + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", businessName=" + this.businessName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.shopPayConfiguration.writeToParcel(dest, flags);
        dest.writeString(this.publishableKey);
        dest.writeString(this.stripeAccountId);
        dest.writeString(this.paymentElementCallbackIdentifier);
        dest.writeString(this.customerSessionClientSecret);
        dest.writeString(this.businessName);
    }

    public ShopPayArgs(PaymentSheet.ShopPayConfiguration shopPayConfiguration, String publishableKey, String str, String paymentElementCallbackIdentifier, String customerSessionClientSecret, String businessName) {
        Intrinsics.checkNotNullParameter(shopPayConfiguration, "shopPayConfiguration");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        this.shopPayConfiguration = shopPayConfiguration;
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        this.customerSessionClientSecret = customerSessionClientSecret;
        this.businessName = businessName;
    }

    public final PaymentSheet.ShopPayConfiguration getShopPayConfiguration() {
        return this.shopPayConfiguration;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public final String getPaymentElementCallbackIdentifier() {
        return this.paymentElementCallbackIdentifier;
    }

    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    public final String getBusinessName() {
        return this.businessName;
    }
}
