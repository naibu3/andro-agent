package com.stripe.android.paymentsheet.model;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.res.ResourcesCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerShippingAddress;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.BankFormScreenState;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountTextBuilder;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.image.StripeImageLoader;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSelection.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007\u0082\u0001\u0007\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Landroid/os/Parcelable;", "<init>", "()V", "hasAcknowledgedSepaMandate", "", "getHasAcknowledgedSepaMandate", "()Z", "setHasAcknowledgedSepaMandate", "(Z)V", "requiresConfirmation", "getRequiresConfirmation", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "merchantName", "", "isSetupFlow", "GooglePay", "Link", "ShopPay", "ExternalPaymentMethod", "CustomPaymentMethod", "Saved", "CustomerRequestedSave", "New", "IconLoader", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentSelection implements Parcelable {
    public static final int $stable = 8;
    private boolean hasAcknowledgedSepaMandate;

    public /* synthetic */ PaymentSelection(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean getRequiresConfirmation();

    public abstract ResolvableString mandateText(String merchantName, boolean isSetupFlow);

    private PaymentSelection() {
    }

    public final boolean getHasAcknowledgedSepaMandate() {
        return this.hasAcknowledgedSepaMandate;
    }

    public final void setHasAcknowledgedSepaMandate(boolean z) {
        this.hasAcknowledgedSepaMandate = z;
    }

    /* compiled from: PaymentSelection.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "()V", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "merchantName", "", "isSetupFlow", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GooglePay extends PaymentSelection {
        public static final GooglePay INSTANCE = new GooglePay();
        public static final Parcelable.Creator<GooglePay> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSelection.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GooglePay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GooglePay.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePay[] newArray(int i) {
                return new GooglePay[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GooglePay)) {
                return false;
            }
            return true;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return false;
        }

        public int hashCode() {
            return -61554386;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public ResolvableString mandateText(String merchantName, boolean isSetupFlow) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            return null;
        }

        public String toString() {
            return "GooglePay";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private GooglePay() {
            super(null);
        }
    }

    /* compiled from: PaymentSelection.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\u001bHÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "linkExpressMode", "Lcom/stripe/android/link/LinkExpressMode;", "selectedPayment", "Lcom/stripe/android/link/LinkPaymentMethod;", "shippingAddress", "Lcom/stripe/android/model/ConsumerShippingAddress;", "<init>", "(Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)V", "getLinkExpressMode", "()Lcom/stripe/android/link/LinkExpressMode;", "getSelectedPayment", "()Lcom/stripe/android/link/LinkPaymentMethod;", "getShippingAddress", "()Lcom/stripe/android/model/ConsumerShippingAddress;", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "merchantName", "", "isSetupFlow", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link extends PaymentSelection {
        private final LinkExpressMode linkExpressMode;
        private final LinkPaymentMethod selectedPayment;
        private final ConsumerShippingAddress shippingAddress;
        public static final Parcelable.Creator<Link> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSelection.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Link> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Link(LinkExpressMode.valueOf(parcel.readString()), (LinkPaymentMethod) parcel.readParcelable(Link.class.getClassLoader()), (ConsumerShippingAddress) parcel.readParcelable(Link.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Link[] newArray(int i) {
                return new Link[i];
            }
        }

        public Link() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Link copy$default(Link link, LinkExpressMode linkExpressMode, LinkPaymentMethod linkPaymentMethod, ConsumerShippingAddress consumerShippingAddress, int i, Object obj) {
            if ((i & 1) != 0) {
                linkExpressMode = link.linkExpressMode;
            }
            if ((i & 2) != 0) {
                linkPaymentMethod = link.selectedPayment;
            }
            if ((i & 4) != 0) {
                consumerShippingAddress = link.shippingAddress;
            }
            return link.copy(linkExpressMode, linkPaymentMethod, consumerShippingAddress);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkExpressMode getLinkExpressMode() {
            return this.linkExpressMode;
        }

        /* renamed from: component2, reason: from getter */
        public final LinkPaymentMethod getSelectedPayment() {
            return this.selectedPayment;
        }

        /* renamed from: component3, reason: from getter */
        public final ConsumerShippingAddress getShippingAddress() {
            return this.shippingAddress;
        }

        public final Link copy(LinkExpressMode linkExpressMode, LinkPaymentMethod selectedPayment, ConsumerShippingAddress shippingAddress) {
            Intrinsics.checkNotNullParameter(linkExpressMode, "linkExpressMode");
            return new Link(linkExpressMode, selectedPayment, shippingAddress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return this.linkExpressMode == link.linkExpressMode && Intrinsics.areEqual(this.selectedPayment, link.selectedPayment) && Intrinsics.areEqual(this.shippingAddress, link.shippingAddress);
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return false;
        }

        public int hashCode() {
            int iHashCode = this.linkExpressMode.hashCode() * 31;
            LinkPaymentMethod linkPaymentMethod = this.selectedPayment;
            int iHashCode2 = (iHashCode + (linkPaymentMethod == null ? 0 : linkPaymentMethod.hashCode())) * 31;
            ConsumerShippingAddress consumerShippingAddress = this.shippingAddress;
            return iHashCode2 + (consumerShippingAddress != null ? consumerShippingAddress.hashCode() : 0);
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public ResolvableString mandateText(String merchantName, boolean isSetupFlow) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            return null;
        }

        public String toString() {
            return "Link(linkExpressMode=" + this.linkExpressMode + ", selectedPayment=" + this.selectedPayment + ", shippingAddress=" + this.shippingAddress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.linkExpressMode.name());
            dest.writeParcelable(this.selectedPayment, flags);
            dest.writeParcelable(this.shippingAddress, flags);
        }

        public /* synthetic */ Link(LinkExpressMode linkExpressMode, LinkPaymentMethod linkPaymentMethod, ConsumerShippingAddress consumerShippingAddress, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? LinkExpressMode.DISABLED : linkExpressMode, (i & 2) != 0 ? null : linkPaymentMethod, (i & 4) != 0 ? null : consumerShippingAddress);
        }

        public final LinkExpressMode getLinkExpressMode() {
            return this.linkExpressMode;
        }

        public final LinkPaymentMethod getSelectedPayment() {
            return this.selectedPayment;
        }

        public final ConsumerShippingAddress getShippingAddress() {
            return this.shippingAddress;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Link(LinkExpressMode linkExpressMode, LinkPaymentMethod linkPaymentMethod, ConsumerShippingAddress consumerShippingAddress) {
            super(null);
            Intrinsics.checkNotNullParameter(linkExpressMode, "linkExpressMode");
            this.linkExpressMode = linkExpressMode;
            this.selectedPayment = linkPaymentMethod;
            this.shippingAddress = consumerShippingAddress;
        }

        public final PaymentMethod.BillingDetails getBillingDetails() {
            CountryCode countryCode;
            LinkPaymentMethod linkPaymentMethod = this.selectedPayment;
            if (linkPaymentMethod == null) {
                return null;
            }
            ConsumerPaymentDetails.BillingAddress billingAddress = linkPaymentMethod.getDetails().getBillingAddress();
            return new PaymentMethod.BillingDetails(new Address(billingAddress != null ? billingAddress.getLocality() : null, (billingAddress == null || (countryCode = billingAddress.getCountryCode()) == null) ? null : countryCode.getValue(), billingAddress != null ? billingAddress.getLine1() : null, billingAddress != null ? billingAddress.getLine2() : null, billingAddress != null ? billingAddress.getPostalCode() : null, billingAddress != null ? billingAddress.getAdministrativeArea() : null), linkPaymentMethod.getDetails().getBillingEmailAddress(), billingAddress != null ? billingAddress.getName() : null, linkPaymentMethod.getBillingPhone());
        }
    }

    /* compiled from: PaymentSelection.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "()V", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "mandateText", "", "merchantName", "", "isSetupFlow", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShopPay extends PaymentSelection {
        public static final ShopPay INSTANCE = new ShopPay();
        public static final Parcelable.Creator<ShopPay> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSelection.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShopPay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShopPay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShopPay.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShopPay[] newArray(int i) {
                return new ShopPay[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShopPay)) {
                return false;
            }
            return true;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return false;
        }

        public int hashCode() {
            return 2007368465;
        }

        /* renamed from: mandateText, reason: collision with other method in class */
        public Void m8338mandateText(String merchantName, boolean isSetupFlow) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            return null;
        }

        public String toString() {
            return "ShopPay";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public /* bridge */ /* synthetic */ ResolvableString mandateText(String str, boolean z) {
            return (ResolvableString) m8338mandateText(str, z);
        }

        private ShopPay() {
            super(null);
        }
    }

    /* compiled from: PaymentSelection.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010&\u001a\u00020\tJ\u0013\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "type", "", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "iconResource", "", "lightThemeIconUrl", "darkThemeIconUrl", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getIconResource", "()I", "getLightThemeIconUrl", "getDarkThemeIconUrl", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "mandateText", "merchantName", "isSetupFlow", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExternalPaymentMethod extends PaymentSelection {
        private final PaymentMethod.BillingDetails billingDetails;
        private final String darkThemeIconUrl;
        private final int iconResource;
        private final ResolvableString label;
        private final String lightThemeIconUrl;
        private final String type;
        public static final Parcelable.Creator<ExternalPaymentMethod> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSelection.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ExternalPaymentMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExternalPaymentMethod createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalPaymentMethod(parcel.readString(), (PaymentMethod.BillingDetails) parcel.readParcelable(ExternalPaymentMethod.class.getClassLoader()), (ResolvableString) parcel.readParcelable(ExternalPaymentMethod.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ExternalPaymentMethod[] newArray(int i) {
                return new ExternalPaymentMethod[i];
            }
        }

        public static /* synthetic */ ExternalPaymentMethod copy$default(ExternalPaymentMethod externalPaymentMethod, String str, PaymentMethod.BillingDetails billingDetails, ResolvableString resolvableString, int i, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = externalPaymentMethod.type;
            }
            if ((i2 & 2) != 0) {
                billingDetails = externalPaymentMethod.billingDetails;
            }
            if ((i2 & 4) != 0) {
                resolvableString = externalPaymentMethod.label;
            }
            if ((i2 & 8) != 0) {
                i = externalPaymentMethod.iconResource;
            }
            if ((i2 & 16) != 0) {
                str2 = externalPaymentMethod.lightThemeIconUrl;
            }
            if ((i2 & 32) != 0) {
                str3 = externalPaymentMethod.darkThemeIconUrl;
            }
            String str4 = str2;
            String str5 = str3;
            return externalPaymentMethod.copy(str, billingDetails, resolvableString, i, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        /* renamed from: component3, reason: from getter */
        public final ResolvableString getLabel() {
            return this.label;
        }

        /* renamed from: component4, reason: from getter */
        public final int getIconResource() {
            return this.iconResource;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLightThemeIconUrl() {
            return this.lightThemeIconUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDarkThemeIconUrl() {
            return this.darkThemeIconUrl;
        }

        public final ExternalPaymentMethod copy(String type, PaymentMethod.BillingDetails billingDetails, ResolvableString label, int iconResource, String lightThemeIconUrl, String darkThemeIconUrl) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            return new ExternalPaymentMethod(type, billingDetails, label, iconResource, lightThemeIconUrl, darkThemeIconUrl);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExternalPaymentMethod)) {
                return false;
            }
            ExternalPaymentMethod externalPaymentMethod = (ExternalPaymentMethod) other;
            return Intrinsics.areEqual(this.type, externalPaymentMethod.type) && Intrinsics.areEqual(this.billingDetails, externalPaymentMethod.billingDetails) && Intrinsics.areEqual(this.label, externalPaymentMethod.label) && this.iconResource == externalPaymentMethod.iconResource && Intrinsics.areEqual(this.lightThemeIconUrl, externalPaymentMethod.lightThemeIconUrl) && Intrinsics.areEqual(this.darkThemeIconUrl, externalPaymentMethod.darkThemeIconUrl);
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return false;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            int iHashCode2 = (((((iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.iconResource)) * 31;
            String str = this.lightThemeIconUrl;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.darkThemeIconUrl;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public ResolvableString mandateText(String merchantName, boolean isSetupFlow) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            return null;
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.type + ", billingDetails=" + this.billingDetails + ", label=" + this.label + ", iconResource=" + this.iconResource + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            dest.writeParcelable(this.billingDetails, flags);
            dest.writeParcelable(this.label, flags);
            dest.writeInt(this.iconResource);
            dest.writeString(this.lightThemeIconUrl);
            dest.writeString(this.darkThemeIconUrl);
        }

        public final String getType() {
            return this.type;
        }

        public final PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public final ResolvableString getLabel() {
            return this.label;
        }

        public final int getIconResource() {
            return this.iconResource;
        }

        public final String getLightThemeIconUrl() {
            return this.lightThemeIconUrl;
        }

        public final String getDarkThemeIconUrl() {
            return this.darkThemeIconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalPaymentMethod(String type, PaymentMethod.BillingDetails billingDetails, ResolvableString label, int i, String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(label, "label");
            this.type = type;
            this.billingDetails = billingDetails;
            this.label = label;
            this.iconResource = i;
            this.lightThemeIconUrl = str;
            this.darkThemeIconUrl = str2;
        }
    }

    /* compiled from: PaymentSelection.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "id", "", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "lightThemeIconUrl", "darkThemeIconUrl", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getLightThemeIconUrl", "getDarkThemeIconUrl", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "mandateText", "merchantName", "isSetupFlow", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomPaymentMethod extends PaymentSelection {
        private final PaymentMethod.BillingDetails billingDetails;
        private final String darkThemeIconUrl;
        private final String id;
        private final ResolvableString label;
        private final String lightThemeIconUrl;
        public static final Parcelable.Creator<CustomPaymentMethod> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSelection.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomPaymentMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomPaymentMethod createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomPaymentMethod(parcel.readString(), (PaymentMethod.BillingDetails) parcel.readParcelable(CustomPaymentMethod.class.getClassLoader()), (ResolvableString) parcel.readParcelable(CustomPaymentMethod.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomPaymentMethod[] newArray(int i) {
                return new CustomPaymentMethod[i];
            }
        }

        public static /* synthetic */ CustomPaymentMethod copy$default(CustomPaymentMethod customPaymentMethod, String str, PaymentMethod.BillingDetails billingDetails, ResolvableString resolvableString, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customPaymentMethod.id;
            }
            if ((i & 2) != 0) {
                billingDetails = customPaymentMethod.billingDetails;
            }
            if ((i & 4) != 0) {
                resolvableString = customPaymentMethod.label;
            }
            if ((i & 8) != 0) {
                str2 = customPaymentMethod.lightThemeIconUrl;
            }
            if ((i & 16) != 0) {
                str3 = customPaymentMethod.darkThemeIconUrl;
            }
            String str4 = str3;
            ResolvableString resolvableString2 = resolvableString;
            return customPaymentMethod.copy(str, billingDetails, resolvableString2, str2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        /* renamed from: component3, reason: from getter */
        public final ResolvableString getLabel() {
            return this.label;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLightThemeIconUrl() {
            return this.lightThemeIconUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDarkThemeIconUrl() {
            return this.darkThemeIconUrl;
        }

        public final CustomPaymentMethod copy(String id, PaymentMethod.BillingDetails billingDetails, ResolvableString label, String lightThemeIconUrl, String darkThemeIconUrl) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            return new CustomPaymentMethod(id, billingDetails, label, lightThemeIconUrl, darkThemeIconUrl);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomPaymentMethod)) {
                return false;
            }
            CustomPaymentMethod customPaymentMethod = (CustomPaymentMethod) other;
            return Intrinsics.areEqual(this.id, customPaymentMethod.id) && Intrinsics.areEqual(this.billingDetails, customPaymentMethod.billingDetails) && Intrinsics.areEqual(this.label, customPaymentMethod.label) && Intrinsics.areEqual(this.lightThemeIconUrl, customPaymentMethod.lightThemeIconUrl) && Intrinsics.areEqual(this.darkThemeIconUrl, customPaymentMethod.darkThemeIconUrl);
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return false;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            PaymentMethod.BillingDetails billingDetails = this.billingDetails;
            int iHashCode2 = (((iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31) + this.label.hashCode()) * 31;
            String str = this.lightThemeIconUrl;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.darkThemeIconUrl;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public ResolvableString mandateText(String merchantName, boolean isSetupFlow) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            return null;
        }

        public String toString() {
            return "CustomPaymentMethod(id=" + this.id + ", billingDetails=" + this.billingDetails + ", label=" + this.label + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeParcelable(this.billingDetails, flags);
            dest.writeParcelable(this.label, flags);
            dest.writeString(this.lightThemeIconUrl);
            dest.writeString(this.darkThemeIconUrl);
        }

        public final String getId() {
            return this.id;
        }

        public final PaymentMethod.BillingDetails getBillingDetails() {
            return this.billingDetails;
        }

        public final ResolvableString getLabel() {
            return this.label;
        }

        public final String getLightThemeIconUrl() {
            return this.lightThemeIconUrl;
        }

        public final String getDarkThemeIconUrl() {
            return this.darkThemeIconUrl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomPaymentMethod(String id, PaymentMethod.BillingDetails billingDetails, ResolvableString label, String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            this.id = id;
            this.billingDetails = billingDetails;
            this.label = label;
            this.lightThemeIconUrl = str;
            this.darkThemeIconUrl = str2;
        }
    }

    /* compiled from: PaymentSelection.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0019HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "walletType", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getWalletType", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;", "getPaymentMethodOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "showMandateAbovePrimaryButton", "", "getShowMandateAbovePrimaryButton", "()Z", "requiresConfirmation", "getRequiresConfirmation", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "merchantName", "", "isSetupFlow", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "WalletType", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Saved extends PaymentSelection {
        private final PaymentMethod paymentMethod;
        private final PaymentMethodOptionsParams paymentMethodOptionsParams;
        private final WalletType walletType;
        public static final Parcelable.Creator<Saved> CREATOR = new Creator();
        public static final int $stable = PaymentMethodOptionsParams.$stable | PaymentMethod.$stable;

        /* compiled from: PaymentSelection.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Saved> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Saved((PaymentMethod) parcel.readParcelable(Saved.class.getClassLoader()), parcel.readInt() == 0 ? null : WalletType.valueOf(parcel.readString()), (PaymentMethodOptionsParams) parcel.readParcelable(Saved.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Saved[] newArray(int i) {
                return new Saved[i];
            }
        }

        /* compiled from: PaymentSelection.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaymentMethod.Type.values().length];
                try {
                    iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Saved copy$default(Saved saved, PaymentMethod paymentMethod, WalletType walletType, PaymentMethodOptionsParams paymentMethodOptionsParams, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod = saved.paymentMethod;
            }
            if ((i & 2) != 0) {
                walletType = saved.walletType;
            }
            if ((i & 4) != 0) {
                paymentMethodOptionsParams = saved.paymentMethodOptionsParams;
            }
            return saved.copy(paymentMethod, walletType, paymentMethodOptionsParams);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component2, reason: from getter */
        public final WalletType getWalletType() {
            return this.walletType;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
            return this.paymentMethodOptionsParams;
        }

        public final Saved copy(PaymentMethod paymentMethod, WalletType walletType, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new Saved(paymentMethod, walletType, paymentMethodOptionsParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Saved)) {
                return false;
            }
            Saved saved = (Saved) other;
            return Intrinsics.areEqual(this.paymentMethod, saved.paymentMethod) && this.walletType == saved.walletType && Intrinsics.areEqual(this.paymentMethodOptionsParams, saved.paymentMethodOptionsParams);
        }

        public int hashCode() {
            int iHashCode = this.paymentMethod.hashCode() * 31;
            WalletType walletType = this.walletType;
            int iHashCode2 = (iHashCode + (walletType == null ? 0 : walletType.hashCode())) * 31;
            PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptionsParams;
            return iHashCode2 + (paymentMethodOptionsParams != null ? paymentMethodOptionsParams.hashCode() : 0);
        }

        public String toString() {
            return "Saved(paymentMethod=" + this.paymentMethod + ", walletType=" + this.walletType + ", paymentMethodOptionsParams=" + this.paymentMethodOptionsParams + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentMethod, flags);
            WalletType walletType = this.walletType;
            if (walletType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(walletType.name());
            }
            dest.writeParcelable(this.paymentMethodOptionsParams, flags);
        }

        public /* synthetic */ Saved(PaymentMethod paymentMethod, WalletType walletType, PaymentMethodOptionsParams paymentMethodOptionsParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentMethod, (i & 2) != 0 ? null : walletType, (i & 4) != 0 ? null : paymentMethodOptionsParams);
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final WalletType getWalletType() {
            return this.walletType;
        }

        public final PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
            return this.paymentMethodOptionsParams;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Saved(PaymentMethod paymentMethod, WalletType walletType, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            this.walletType = walletType;
            this.paymentMethodOptionsParams = paymentMethodOptionsParams;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSelection.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "(Ljava/lang/String;ILcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "GooglePay", "Link", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class WalletType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ WalletType[] $VALUES;
            public static final WalletType GooglePay = new WalletType("GooglePay", 0, GooglePay.INSTANCE);
            public static final WalletType Link = new WalletType("Link", 1, new Link(null, null, null, 7, null));
            private final PaymentSelection paymentSelection;

            private static final /* synthetic */ WalletType[] $values() {
                return new WalletType[]{GooglePay, Link};
            }

            public static EnumEntries<WalletType> getEntries() {
                return $ENTRIES;
            }

            private WalletType(String str, int i, PaymentSelection paymentSelection) {
                this.paymentSelection = paymentSelection;
            }

            public final PaymentSelection getPaymentSelection() {
                return this.paymentSelection;
            }

            static {
                WalletType[] walletTypeArr$values = $values();
                $VALUES = walletTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(walletTypeArr$values);
            }

            public static WalletType valueOf(String str) {
                return (WalletType) Enum.valueOf(WalletType.class, str);
            }

            public static WalletType[] values() {
                return (WalletType[]) $VALUES.clone();
            }
        }

        public final boolean getShowMandateAbovePrimaryButton() {
            return this.paymentMethod.type == PaymentMethod.Type.SepaDebit;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return this.paymentMethod.type == PaymentMethod.Type.USBankAccount || this.paymentMethod.type == PaymentMethod.Type.SepaDebit;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public ResolvableString mandateText(String merchantName, boolean isSetupFlow) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            PaymentMethod.Type type = this.paymentMethod.type;
            int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return USBankAccountTextBuilder.INSTANCE.buildMandateAndMicrodepositsText(merchantName, false, false, false, isSetupFlow);
            }
            if (i != 2) {
                return null;
            }
            return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_sepa_mandate, new Object[]{merchantName}, null, 4, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentSelection.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "<init>", "(Ljava/lang/String;ILcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V", "getSetupFutureUsage", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "RequestReuse", "RequestNoReuse", "NoRequest", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomerRequestedSave {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CustomerRequestedSave[] $VALUES;
        private final ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
        public static final CustomerRequestedSave RequestReuse = new CustomerRequestedSave("RequestReuse", 0, ConfirmPaymentIntentParams.SetupFutureUsage.OffSession);
        public static final CustomerRequestedSave RequestNoReuse = new CustomerRequestedSave("RequestNoReuse", 1, ConfirmPaymentIntentParams.SetupFutureUsage.Blank);
        public static final CustomerRequestedSave NoRequest = new CustomerRequestedSave("NoRequest", 2, null);

        private static final /* synthetic */ CustomerRequestedSave[] $values() {
            return new CustomerRequestedSave[]{RequestReuse, RequestNoReuse, NoRequest};
        }

        public static EnumEntries<CustomerRequestedSave> getEntries() {
            return $ENTRIES;
        }

        private CustomerRequestedSave(String str, int i, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            this.setupFutureUsage = setupFutureUsage;
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage getSetupFutureUsage() {
            return this.setupFutureUsage;
        }

        static {
            CustomerRequestedSave[] customerRequestedSaveArr$values = $values();
            $VALUES = customerRequestedSaveArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(customerRequestedSaveArr$values);
        }

        public static CustomerRequestedSave valueOf(String str) {
            return (CustomerRequestedSave) Enum.valueOf(CustomerRequestedSave.class, str);
        }

        public static CustomerRequestedSave[] values() {
            return (CustomerRequestedSave[]) $VALUES.clone();
        }
    }

    /* compiled from: PaymentSelection.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0004!\"#$¨\u0006%"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "()V", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "getPaymentMethodOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "getPaymentMethodExtraParams", "()Lcom/stripe/android/model/PaymentMethodExtraParams;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "requiresConfirmation", "", "getRequiresConfirmation", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "merchantName", "", "isSetupFlow", "Card", "USBankAccount", "LinkInline", "GenericPaymentMethod", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class New extends PaymentSelection {
        public static final int $stable = 0;

        public /* synthetic */ New(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract CustomerRequestedSave getCustomerRequestedSave();

        public abstract PaymentMethodCreateParams getPaymentMethodCreateParams();

        public abstract PaymentMethodExtraParams getPaymentMethodExtraParams();

        public abstract PaymentMethodOptionsParams getPaymentMethodOptionsParams();

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public boolean getRequiresConfirmation() {
            return false;
        }

        @Override // com.stripe.android.paymentsheet.model.PaymentSelection
        public ResolvableString mandateText(String merchantName, boolean isSetupFlow) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            return null;
        }

        private New() {
            super(null);
        }

        /* compiled from: PaymentSelection.kt */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0019HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u0019¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "brand", "Lcom/stripe/android/model/CardBrand;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "<init>", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)V", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getPaymentMethodOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "getPaymentMethodExtraParams", "()Lcom/stripe/android/model/PaymentMethodExtraParams;", "last4", "", "getLast4$annotations", "()V", "getLast4", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Card extends New {
            private final CardBrand brand;
            private final CustomerRequestedSave customerRequestedSave;
            private final String last4;
            private final PaymentMethodCreateParams paymentMethodCreateParams;
            private final PaymentMethodExtraParams paymentMethodExtraParams;
            private final PaymentMethodOptionsParams paymentMethodOptionsParams;
            public static final Parcelable.Creator<Card> CREATOR = new Creator();
            public static final int $stable = (PaymentMethodExtraParams.$stable | PaymentMethodOptionsParams.$stable) | PaymentMethodCreateParams.$stable;

            /* compiled from: PaymentSelection.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Card> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Card((PaymentMethodCreateParams) parcel.readParcelable(Card.class.getClassLoader()), CardBrand.valueOf(parcel.readString()), CustomerRequestedSave.valueOf(parcel.readString()), (PaymentMethodOptionsParams) parcel.readParcelable(Card.class.getClassLoader()), (PaymentMethodExtraParams) parcel.readParcelable(Card.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Card[] newArray(int i) {
                    return new Card[i];
                }
            }

            public static /* synthetic */ Card copy$default(Card card, PaymentMethodCreateParams paymentMethodCreateParams, CardBrand cardBrand, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethodCreateParams = card.paymentMethodCreateParams;
                }
                if ((i & 2) != 0) {
                    cardBrand = card.brand;
                }
                if ((i & 4) != 0) {
                    customerRequestedSave = card.customerRequestedSave;
                }
                if ((i & 8) != 0) {
                    paymentMethodOptionsParams = card.paymentMethodOptionsParams;
                }
                if ((i & 16) != 0) {
                    paymentMethodExtraParams = card.paymentMethodExtraParams;
                }
                PaymentMethodExtraParams paymentMethodExtraParams2 = paymentMethodExtraParams;
                CustomerRequestedSave customerRequestedSave2 = customerRequestedSave;
                return card.copy(paymentMethodCreateParams, cardBrand, customerRequestedSave2, paymentMethodOptionsParams, paymentMethodExtraParams2);
            }

            public static /* synthetic */ void getLast4$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            /* renamed from: component2, reason: from getter */
            public final CardBrand getBrand() {
                return this.brand;
            }

            /* renamed from: component3, reason: from getter */
            public final CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            /* renamed from: component4, reason: from getter */
            public final PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            /* renamed from: component5, reason: from getter */
            public final PaymentMethodExtraParams getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            public final Card copy(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand brand, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams) {
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(brand, "brand");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                return new Card(paymentMethodCreateParams, brand, customerRequestedSave, paymentMethodOptionsParams, paymentMethodExtraParams);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Card)) {
                    return false;
                }
                Card card = (Card) other;
                return Intrinsics.areEqual(this.paymentMethodCreateParams, card.paymentMethodCreateParams) && this.brand == card.brand && this.customerRequestedSave == card.customerRequestedSave && Intrinsics.areEqual(this.paymentMethodOptionsParams, card.paymentMethodOptionsParams) && Intrinsics.areEqual(this.paymentMethodExtraParams, card.paymentMethodExtraParams);
            }

            public int hashCode() {
                int iHashCode = ((((this.paymentMethodCreateParams.hashCode() * 31) + this.brand.hashCode()) * 31) + this.customerRequestedSave.hashCode()) * 31;
                PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptionsParams;
                int iHashCode2 = (iHashCode + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31;
                PaymentMethodExtraParams paymentMethodExtraParams = this.paymentMethodExtraParams;
                return iHashCode2 + (paymentMethodExtraParams != null ? paymentMethodExtraParams.hashCode() : 0);
            }

            public String toString() {
                return "Card(paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", brand=" + this.brand + ", customerRequestedSave=" + this.customerRequestedSave + ", paymentMethodOptionsParams=" + this.paymentMethodOptionsParams + ", paymentMethodExtraParams=" + this.paymentMethodExtraParams + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.paymentMethodCreateParams, flags);
                dest.writeString(this.brand.name());
                dest.writeString(this.customerRequestedSave.name());
                dest.writeParcelable(this.paymentMethodOptionsParams, flags);
                dest.writeParcelable(this.paymentMethodExtraParams, flags);
            }

            public /* synthetic */ Card(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand cardBrand, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(paymentMethodCreateParams, cardBrand, customerRequestedSave, (i & 8) != 0 ? null : paymentMethodOptionsParams, (i & 16) != 0 ? null : paymentMethodExtraParams);
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public final CardBrand getBrand() {
                return this.brand;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodExtraParams getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Card(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand brand, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(brand, "brand");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.brand = brand;
                this.customerRequestedSave = customerRequestedSave;
                this.paymentMethodOptionsParams = paymentMethodOptionsParams;
                this.paymentMethodExtraParams = paymentMethodExtraParams;
                String strCardLast4 = getPaymentMethodCreateParams().cardLast4();
                this.last4 = strCardLast4 == null ? "" : strCardLast4;
            }

            public final String getLast4() {
                return this.last4;
            }
        }

        /* compiled from: PaymentSelection.kt */
        @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002BCB[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003Ji\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0006\u00107\u001a\u00020\u0005J\u0013\u00108\u001a\u00020,2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u0005HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006D"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "label", "", "iconResource", "", "input", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;", "screenState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;", "instantDebits", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "<init>", "(Ljava/lang/String;ILcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)V", "getLabel", "()Ljava/lang/String;", "getIconResource", "()I", "getInput", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;", "getScreenState", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;", "getInstantDebits", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getPaymentMethodOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "getPaymentMethodExtraParams", "()Lcom/stripe/android/model/PaymentMethodExtraParams;", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "merchantName", "isSetupFlow", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "InstantDebitsInfo", "Input", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class USBankAccount extends New {
            private final CustomerRequestedSave customerRequestedSave;
            private final int iconResource;
            private final Input input;
            private final InstantDebitsInfo instantDebits;
            private final String label;
            private final PaymentMethodCreateParams paymentMethodCreateParams;
            private final PaymentMethodExtraParams paymentMethodExtraParams;
            private final PaymentMethodOptionsParams paymentMethodOptionsParams;
            private final BankFormScreenState screenState;
            public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSelection.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<USBankAccount> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccount createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new USBankAccount(parcel.readString(), parcel.readInt(), Input.CREATOR.createFromParcel(parcel), BankFormScreenState.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InstantDebitsInfo.CREATOR.createFromParcel(parcel), (PaymentMethodCreateParams) parcel.readParcelable(USBankAccount.class.getClassLoader()), CustomerRequestedSave.valueOf(parcel.readString()), (PaymentMethodOptionsParams) parcel.readParcelable(USBankAccount.class.getClassLoader()), (PaymentMethodExtraParams) parcel.readParcelable(USBankAccount.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USBankAccount[] newArray(int i) {
                    return new USBankAccount[i];
                }
            }

            public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, String str, int i, Input input, BankFormScreenState bankFormScreenState, InstantDebitsInfo instantDebitsInfo, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = uSBankAccount.label;
                }
                if ((i2 & 2) != 0) {
                    i = uSBankAccount.iconResource;
                }
                if ((i2 & 4) != 0) {
                    input = uSBankAccount.input;
                }
                if ((i2 & 8) != 0) {
                    bankFormScreenState = uSBankAccount.screenState;
                }
                if ((i2 & 16) != 0) {
                    instantDebitsInfo = uSBankAccount.instantDebits;
                }
                if ((i2 & 32) != 0) {
                    paymentMethodCreateParams = uSBankAccount.paymentMethodCreateParams;
                }
                if ((i2 & 64) != 0) {
                    customerRequestedSave = uSBankAccount.customerRequestedSave;
                }
                if ((i2 & 128) != 0) {
                    paymentMethodOptionsParams = uSBankAccount.paymentMethodOptionsParams;
                }
                if ((i2 & 256) != 0) {
                    paymentMethodExtraParams = uSBankAccount.paymentMethodExtraParams;
                }
                PaymentMethodOptionsParams paymentMethodOptionsParams2 = paymentMethodOptionsParams;
                PaymentMethodExtraParams paymentMethodExtraParams2 = paymentMethodExtraParams;
                PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
                CustomerRequestedSave customerRequestedSave2 = customerRequestedSave;
                InstantDebitsInfo instantDebitsInfo2 = instantDebitsInfo;
                Input input2 = input;
                return uSBankAccount.copy(str, i, input2, bankFormScreenState, instantDebitsInfo2, paymentMethodCreateParams2, customerRequestedSave2, paymentMethodOptionsParams2, paymentMethodExtraParams2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final int getIconResource() {
                return this.iconResource;
            }

            /* renamed from: component3, reason: from getter */
            public final Input getInput() {
                return this.input;
            }

            /* renamed from: component4, reason: from getter */
            public final BankFormScreenState getScreenState() {
                return this.screenState;
            }

            /* renamed from: component5, reason: from getter */
            public final InstantDebitsInfo getInstantDebits() {
                return this.instantDebits;
            }

            /* renamed from: component6, reason: from getter */
            public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            /* renamed from: component7, reason: from getter */
            public final CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            /* renamed from: component8, reason: from getter */
            public final PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            /* renamed from: component9, reason: from getter */
            public final PaymentMethodExtraParams getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            public final USBankAccount copy(String label, int iconResource, Input input, BankFormScreenState screenState, InstantDebitsInfo instantDebits, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(screenState, "screenState");
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                return new USBankAccount(label, iconResource, input, screenState, instantDebits, paymentMethodCreateParams, customerRequestedSave, paymentMethodOptionsParams, paymentMethodExtraParams);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof USBankAccount)) {
                    return false;
                }
                USBankAccount uSBankAccount = (USBankAccount) other;
                return Intrinsics.areEqual(this.label, uSBankAccount.label) && this.iconResource == uSBankAccount.iconResource && Intrinsics.areEqual(this.input, uSBankAccount.input) && Intrinsics.areEqual(this.screenState, uSBankAccount.screenState) && Intrinsics.areEqual(this.instantDebits, uSBankAccount.instantDebits) && Intrinsics.areEqual(this.paymentMethodCreateParams, uSBankAccount.paymentMethodCreateParams) && this.customerRequestedSave == uSBankAccount.customerRequestedSave && Intrinsics.areEqual(this.paymentMethodOptionsParams, uSBankAccount.paymentMethodOptionsParams) && Intrinsics.areEqual(this.paymentMethodExtraParams, uSBankAccount.paymentMethodExtraParams);
            }

            public int hashCode() {
                int iHashCode = ((((((this.label.hashCode() * 31) + Integer.hashCode(this.iconResource)) * 31) + this.input.hashCode()) * 31) + this.screenState.hashCode()) * 31;
                InstantDebitsInfo instantDebitsInfo = this.instantDebits;
                int iHashCode2 = (((((iHashCode + (instantDebitsInfo == null ? 0 : instantDebitsInfo.hashCode())) * 31) + this.paymentMethodCreateParams.hashCode()) * 31) + this.customerRequestedSave.hashCode()) * 31;
                PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptionsParams;
                int iHashCode3 = (iHashCode2 + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31;
                PaymentMethodExtraParams paymentMethodExtraParams = this.paymentMethodExtraParams;
                return iHashCode3 + (paymentMethodExtraParams != null ? paymentMethodExtraParams.hashCode() : 0);
            }

            public String toString() {
                return "USBankAccount(label=" + this.label + ", iconResource=" + this.iconResource + ", input=" + this.input + ", screenState=" + this.screenState + ", instantDebits=" + this.instantDebits + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", customerRequestedSave=" + this.customerRequestedSave + ", paymentMethodOptionsParams=" + this.paymentMethodOptionsParams + ", paymentMethodExtraParams=" + this.paymentMethodExtraParams + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.label);
                dest.writeInt(this.iconResource);
                this.input.writeToParcel(dest, flags);
                this.screenState.writeToParcel(dest, flags);
                InstantDebitsInfo instantDebitsInfo = this.instantDebits;
                if (instantDebitsInfo == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    instantDebitsInfo.writeToParcel(dest, flags);
                }
                dest.writeParcelable(this.paymentMethodCreateParams, flags);
                dest.writeString(this.customerRequestedSave.name());
                dest.writeParcelable(this.paymentMethodOptionsParams, flags);
                dest.writeParcelable(this.paymentMethodExtraParams, flags);
            }

            public /* synthetic */ USBankAccount(String str, int i, Input input, BankFormScreenState bankFormScreenState, InstantDebitsInfo instantDebitsInfo, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, input, bankFormScreenState, instantDebitsInfo, paymentMethodCreateParams, customerRequestedSave, (i2 & 128) != 0 ? null : paymentMethodOptionsParams, (i2 & 256) != 0 ? null : paymentMethodExtraParams);
            }

            public final String getLabel() {
                return this.label;
            }

            public final int getIconResource() {
                return this.iconResource;
            }

            public final Input getInput() {
                return this.input;
            }

            public final BankFormScreenState getScreenState() {
                return this.screenState;
            }

            public final InstantDebitsInfo getInstantDebits() {
                return this.instantDebits;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodExtraParams getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public USBankAccount(String label, int i, Input input, BankFormScreenState screenState, InstantDebitsInfo instantDebitsInfo, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams) {
                super(null);
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(screenState, "screenState");
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                this.label = label;
                this.iconResource = i;
                this.input = input;
                this.screenState = screenState;
                this.instantDebits = instantDebitsInfo;
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.customerRequestedSave = customerRequestedSave;
                this.paymentMethodOptionsParams = paymentMethodOptionsParams;
                this.paymentMethodExtraParams = paymentMethodExtraParams;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New, com.stripe.android.paymentsheet.model.PaymentSelection
            public ResolvableString mandateText(String merchantName, boolean isSetupFlow) {
                Intrinsics.checkNotNullParameter(merchantName, "merchantName");
                BankFormScreenState.LinkedBankAccount linkedBankAccount = this.screenState.getLinkedBankAccount();
                if (linkedBankAccount != null) {
                    return linkedBankAccount.getMandateText();
                }
                return null;
            }

            /* compiled from: PaymentSelection.kt */
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;", "Landroid/os/Parcelable;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "linkMode", "Lcom/stripe/android/model/LinkMode;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/LinkMode;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getLinkMode", "()Lcom/stripe/android/model/LinkMode;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class InstantDebitsInfo implements Parcelable {
                private final LinkMode linkMode;
                private final PaymentMethod paymentMethod;
                public static final Parcelable.Creator<InstantDebitsInfo> CREATOR = new Creator();
                public static final int $stable = PaymentMethod.$stable;

                /* compiled from: PaymentSelection.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<InstantDebitsInfo> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final InstantDebitsInfo createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new InstantDebitsInfo((PaymentMethod) parcel.readParcelable(InstantDebitsInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkMode.valueOf(parcel.readString()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final InstantDebitsInfo[] newArray(int i) {
                        return new InstantDebitsInfo[i];
                    }
                }

                public static /* synthetic */ InstantDebitsInfo copy$default(InstantDebitsInfo instantDebitsInfo, PaymentMethod paymentMethod, LinkMode linkMode, int i, Object obj) {
                    if ((i & 1) != 0) {
                        paymentMethod = instantDebitsInfo.paymentMethod;
                    }
                    if ((i & 2) != 0) {
                        linkMode = instantDebitsInfo.linkMode;
                    }
                    return instantDebitsInfo.copy(paymentMethod, linkMode);
                }

                /* renamed from: component1, reason: from getter */
                public final PaymentMethod getPaymentMethod() {
                    return this.paymentMethod;
                }

                /* renamed from: component2, reason: from getter */
                public final LinkMode getLinkMode() {
                    return this.linkMode;
                }

                public final InstantDebitsInfo copy(PaymentMethod paymentMethod, LinkMode linkMode) {
                    Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                    return new InstantDebitsInfo(paymentMethod, linkMode);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof InstantDebitsInfo)) {
                        return false;
                    }
                    InstantDebitsInfo instantDebitsInfo = (InstantDebitsInfo) other;
                    return Intrinsics.areEqual(this.paymentMethod, instantDebitsInfo.paymentMethod) && this.linkMode == instantDebitsInfo.linkMode;
                }

                public int hashCode() {
                    int iHashCode = this.paymentMethod.hashCode() * 31;
                    LinkMode linkMode = this.linkMode;
                    return iHashCode + (linkMode == null ? 0 : linkMode.hashCode());
                }

                public String toString() {
                    return "InstantDebitsInfo(paymentMethod=" + this.paymentMethod + ", linkMode=" + this.linkMode + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.paymentMethod, flags);
                    LinkMode linkMode = this.linkMode;
                    if (linkMode == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(linkMode.name());
                    }
                }

                public InstantDebitsInfo(PaymentMethod paymentMethod, LinkMode linkMode) {
                    Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                    this.paymentMethod = paymentMethod;
                    this.linkMode = linkMode;
                }

                public final PaymentMethod getPaymentMethod() {
                    return this.paymentMethod;
                }

                public final LinkMode getLinkMode() {
                    return this.linkMode;
                }
            }

            /* compiled from: PaymentSelection.kt */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$Input;", "Landroid/os/Parcelable;", "name", "", "email", "phone", "address", "Lcom/stripe/android/model/Address;", "saveForFutureUse", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Z)V", "getName", "()Ljava/lang/String;", "getEmail", "getPhone", "getAddress", "()Lcom/stripe/android/model/Address;", "getSaveForFutureUse", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Input implements Parcelable {
                private final Address address;
                private final String email;
                private final String name;
                private final String phone;
                private final boolean saveForFutureUse;
                public static final Parcelable.Creator<Input> CREATOR = new Creator();
                public static final int $stable = Address.$stable;

                /* compiled from: PaymentSelection.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Input> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Input createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Input(parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(Input.class.getClassLoader()), parcel.readInt() != 0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Input[] newArray(int i) {
                        return new Input[i];
                    }
                }

                public static /* synthetic */ Input copy$default(Input input, String str, String str2, String str3, Address address, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = input.name;
                    }
                    if ((i & 2) != 0) {
                        str2 = input.email;
                    }
                    if ((i & 4) != 0) {
                        str3 = input.phone;
                    }
                    if ((i & 8) != 0) {
                        address = input.address;
                    }
                    if ((i & 16) != 0) {
                        z = input.saveForFutureUse;
                    }
                    boolean z2 = z;
                    String str4 = str3;
                    return input.copy(str, str2, str4, address, z2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                /* renamed from: component2, reason: from getter */
                public final String getEmail() {
                    return this.email;
                }

                /* renamed from: component3, reason: from getter */
                public final String getPhone() {
                    return this.phone;
                }

                /* renamed from: component4, reason: from getter */
                public final Address getAddress() {
                    return this.address;
                }

                /* renamed from: component5, reason: from getter */
                public final boolean getSaveForFutureUse() {
                    return this.saveForFutureUse;
                }

                public final Input copy(String name, String email, String phone, Address address, boolean saveForFutureUse) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    return new Input(name, email, phone, address, saveForFutureUse);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Input)) {
                        return false;
                    }
                    Input input = (Input) other;
                    return Intrinsics.areEqual(this.name, input.name) && Intrinsics.areEqual(this.email, input.email) && Intrinsics.areEqual(this.phone, input.phone) && Intrinsics.areEqual(this.address, input.address) && this.saveForFutureUse == input.saveForFutureUse;
                }

                public int hashCode() {
                    int iHashCode = this.name.hashCode() * 31;
                    String str = this.email;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.phone;
                    int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Address address = this.address;
                    return ((iHashCode3 + (address != null ? address.hashCode() : 0)) * 31) + Boolean.hashCode(this.saveForFutureUse);
                }

                public String toString() {
                    return "Input(name=" + this.name + ", email=" + this.email + ", phone=" + this.phone + ", address=" + this.address + ", saveForFutureUse=" + this.saveForFutureUse + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.name);
                    dest.writeString(this.email);
                    dest.writeString(this.phone);
                    dest.writeParcelable(this.address, flags);
                    dest.writeInt(this.saveForFutureUse ? 1 : 0);
                }

                public Input(String name, String str, String str2, Address address, boolean z) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    this.name = name;
                    this.email = str;
                    this.phone = str2;
                    this.address = address;
                    this.saveForFutureUse = z;
                }

                public final String getName() {
                    return this.name;
                }

                public final String getEmail() {
                    return this.email;
                }

                public final String getPhone() {
                    return this.phone;
                }

                public final Address getAddress() {
                    return this.address;
                }

                public final boolean getSaveForFutureUse() {
                    return this.saveForFutureUse;
                }
            }
        }

        /* compiled from: PaymentSelection.kt */
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003JI\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\t\u00100\u001a\u00020\u001dHÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u001d¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u00066"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "brand", "Lcom/stripe/android/model/CardBrand;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "input", "Lcom/stripe/android/link/ui/inline/UserInput;", "<init>", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/link/ui/inline/UserInput;)V", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getPaymentMethodOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "getPaymentMethodExtraParams", "()Lcom/stripe/android/model/PaymentMethodExtraParams;", "getInput", "()Lcom/stripe/android/link/ui/inline/UserInput;", "last4", "", "getLast4$annotations", "()V", "getLast4", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LinkInline extends New {
            private final CardBrand brand;
            private final CustomerRequestedSave customerRequestedSave;
            private final UserInput input;
            private final String last4;
            private final PaymentMethodCreateParams paymentMethodCreateParams;
            private final PaymentMethodExtraParams paymentMethodExtraParams;
            private final PaymentMethodOptionsParams paymentMethodOptionsParams;
            public static final Parcelable.Creator<LinkInline> CREATOR = new Creator();
            public static final int $stable = (PaymentMethodExtraParams.$stable | PaymentMethodOptionsParams.$stable) | PaymentMethodCreateParams.$stable;

            /* compiled from: PaymentSelection.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LinkInline> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LinkInline createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LinkInline((PaymentMethodCreateParams) parcel.readParcelable(LinkInline.class.getClassLoader()), CardBrand.valueOf(parcel.readString()), CustomerRequestedSave.valueOf(parcel.readString()), (PaymentMethodOptionsParams) parcel.readParcelable(LinkInline.class.getClassLoader()), (PaymentMethodExtraParams) parcel.readParcelable(LinkInline.class.getClassLoader()), (UserInput) parcel.readParcelable(LinkInline.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LinkInline[] newArray(int i) {
                    return new LinkInline[i];
                }
            }

            public static /* synthetic */ LinkInline copy$default(LinkInline linkInline, PaymentMethodCreateParams paymentMethodCreateParams, CardBrand cardBrand, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, UserInput userInput, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethodCreateParams = linkInline.paymentMethodCreateParams;
                }
                if ((i & 2) != 0) {
                    cardBrand = linkInline.brand;
                }
                if ((i & 4) != 0) {
                    customerRequestedSave = linkInline.customerRequestedSave;
                }
                if ((i & 8) != 0) {
                    paymentMethodOptionsParams = linkInline.paymentMethodOptionsParams;
                }
                if ((i & 16) != 0) {
                    paymentMethodExtraParams = linkInline.paymentMethodExtraParams;
                }
                if ((i & 32) != 0) {
                    userInput = linkInline.input;
                }
                PaymentMethodExtraParams paymentMethodExtraParams2 = paymentMethodExtraParams;
                UserInput userInput2 = userInput;
                return linkInline.copy(paymentMethodCreateParams, cardBrand, customerRequestedSave, paymentMethodOptionsParams, paymentMethodExtraParams2, userInput2);
            }

            public static /* synthetic */ void getLast4$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            /* renamed from: component2, reason: from getter */
            public final CardBrand getBrand() {
                return this.brand;
            }

            /* renamed from: component3, reason: from getter */
            public final CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            /* renamed from: component4, reason: from getter */
            public final PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            /* renamed from: component5, reason: from getter */
            public final PaymentMethodExtraParams getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            /* renamed from: component6, reason: from getter */
            public final UserInput getInput() {
                return this.input;
            }

            public final LinkInline copy(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand brand, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, UserInput input) {
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(brand, "brand");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                Intrinsics.checkNotNullParameter(input, "input");
                return new LinkInline(paymentMethodCreateParams, brand, customerRequestedSave, paymentMethodOptionsParams, paymentMethodExtraParams, input);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LinkInline)) {
                    return false;
                }
                LinkInline linkInline = (LinkInline) other;
                return Intrinsics.areEqual(this.paymentMethodCreateParams, linkInline.paymentMethodCreateParams) && this.brand == linkInline.brand && this.customerRequestedSave == linkInline.customerRequestedSave && Intrinsics.areEqual(this.paymentMethodOptionsParams, linkInline.paymentMethodOptionsParams) && Intrinsics.areEqual(this.paymentMethodExtraParams, linkInline.paymentMethodExtraParams) && Intrinsics.areEqual(this.input, linkInline.input);
            }

            public int hashCode() {
                int iHashCode = ((((this.paymentMethodCreateParams.hashCode() * 31) + this.brand.hashCode()) * 31) + this.customerRequestedSave.hashCode()) * 31;
                PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptionsParams;
                int iHashCode2 = (iHashCode + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31;
                PaymentMethodExtraParams paymentMethodExtraParams = this.paymentMethodExtraParams;
                return ((iHashCode2 + (paymentMethodExtraParams != null ? paymentMethodExtraParams.hashCode() : 0)) * 31) + this.input.hashCode();
            }

            public String toString() {
                return "LinkInline(paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", brand=" + this.brand + ", customerRequestedSave=" + this.customerRequestedSave + ", paymentMethodOptionsParams=" + this.paymentMethodOptionsParams + ", paymentMethodExtraParams=" + this.paymentMethodExtraParams + ", input=" + this.input + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.paymentMethodCreateParams, flags);
                dest.writeString(this.brand.name());
                dest.writeString(this.customerRequestedSave.name());
                dest.writeParcelable(this.paymentMethodOptionsParams, flags);
                dest.writeParcelable(this.paymentMethodExtraParams, flags);
                dest.writeParcelable(this.input, flags);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ LinkInline(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand cardBrand, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, UserInput userInput, int i, DefaultConstructorMarker defaultConstructorMarker) {
                UserInput userInput2;
                PaymentMethodExtraParams paymentMethodExtraParams2;
                paymentMethodOptionsParams = (i & 8) != 0 ? null : paymentMethodOptionsParams;
                if ((i & 16) != 0) {
                    userInput2 = userInput;
                    paymentMethodExtraParams2 = null;
                } else {
                    userInput2 = userInput;
                    paymentMethodExtraParams2 = paymentMethodExtraParams;
                }
                this(paymentMethodCreateParams, cardBrand, customerRequestedSave, paymentMethodOptionsParams, paymentMethodExtraParams2, userInput2);
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public final CardBrand getBrand() {
                return this.brand;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodExtraParams getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            public final UserInput getInput() {
                return this.input;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LinkInline(PaymentMethodCreateParams paymentMethodCreateParams, CardBrand brand, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, UserInput input) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(brand, "brand");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                Intrinsics.checkNotNullParameter(input, "input");
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.brand = brand;
                this.customerRequestedSave = customerRequestedSave;
                this.paymentMethodOptionsParams = paymentMethodOptionsParams;
                this.paymentMethodExtraParams = paymentMethodExtraParams;
                this.input = input;
                String strCardLast4 = getPaymentMethodCreateParams().cardLast4();
                this.last4 = strCardLast4 == null ? "" : strCardLast4;
            }

            public final String getLast4() {
                return this.last4;
            }
        }

        /* compiled from: PaymentSelection.kt */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0006\u0010+\u001a\u00020\u0005J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00067"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "iconResource", "", "lightThemeIconUrl", "", "darkThemeIconUrl", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)V", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getIconResource", "()I", "getLightThemeIconUrl", "()Ljava/lang/String;", "getDarkThemeIconUrl", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getPaymentMethodOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "getPaymentMethodExtraParams", "()Lcom/stripe/android/model/PaymentMethodExtraParams;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GenericPaymentMethod extends New {
            private final CustomerRequestedSave customerRequestedSave;
            private final String darkThemeIconUrl;
            private final int iconResource;
            private final ResolvableString label;
            private final String lightThemeIconUrl;
            private final PaymentMethodCreateParams paymentMethodCreateParams;
            private final PaymentMethodExtraParams paymentMethodExtraParams;
            private final PaymentMethodOptionsParams paymentMethodOptionsParams;
            public static final Parcelable.Creator<GenericPaymentMethod> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSelection.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<GenericPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GenericPaymentMethod createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new GenericPaymentMethod((ResolvableString) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), (PaymentMethodCreateParams) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()), CustomerRequestedSave.valueOf(parcel.readString()), (PaymentMethodOptionsParams) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()), (PaymentMethodExtraParams) parcel.readParcelable(GenericPaymentMethod.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GenericPaymentMethod[] newArray(int i) {
                    return new GenericPaymentMethod[i];
                }
            }

            public static /* synthetic */ GenericPaymentMethod copy$default(GenericPaymentMethod genericPaymentMethod, ResolvableString resolvableString, int i, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    resolvableString = genericPaymentMethod.label;
                }
                if ((i2 & 2) != 0) {
                    i = genericPaymentMethod.iconResource;
                }
                if ((i2 & 4) != 0) {
                    str = genericPaymentMethod.lightThemeIconUrl;
                }
                if ((i2 & 8) != 0) {
                    str2 = genericPaymentMethod.darkThemeIconUrl;
                }
                if ((i2 & 16) != 0) {
                    paymentMethodCreateParams = genericPaymentMethod.paymentMethodCreateParams;
                }
                if ((i2 & 32) != 0) {
                    customerRequestedSave = genericPaymentMethod.customerRequestedSave;
                }
                if ((i2 & 64) != 0) {
                    paymentMethodOptionsParams = genericPaymentMethod.paymentMethodOptionsParams;
                }
                if ((i2 & 128) != 0) {
                    paymentMethodExtraParams = genericPaymentMethod.paymentMethodExtraParams;
                }
                PaymentMethodOptionsParams paymentMethodOptionsParams2 = paymentMethodOptionsParams;
                PaymentMethodExtraParams paymentMethodExtraParams2 = paymentMethodExtraParams;
                PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
                CustomerRequestedSave customerRequestedSave2 = customerRequestedSave;
                return genericPaymentMethod.copy(resolvableString, i, str, str2, paymentMethodCreateParams2, customerRequestedSave2, paymentMethodOptionsParams2, paymentMethodExtraParams2);
            }

            /* renamed from: component1, reason: from getter */
            public final ResolvableString getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final int getIconResource() {
                return this.iconResource;
            }

            /* renamed from: component3, reason: from getter */
            public final String getLightThemeIconUrl() {
                return this.lightThemeIconUrl;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDarkThemeIconUrl() {
                return this.darkThemeIconUrl;
            }

            /* renamed from: component5, reason: from getter */
            public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            /* renamed from: component6, reason: from getter */
            public final CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            /* renamed from: component7, reason: from getter */
            public final PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            /* renamed from: component8, reason: from getter */
            public final PaymentMethodExtraParams getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            public final GenericPaymentMethod copy(ResolvableString label, int iconResource, String lightThemeIconUrl, String darkThemeIconUrl, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                return new GenericPaymentMethod(label, iconResource, lightThemeIconUrl, darkThemeIconUrl, paymentMethodCreateParams, customerRequestedSave, paymentMethodOptionsParams, paymentMethodExtraParams);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GenericPaymentMethod)) {
                    return false;
                }
                GenericPaymentMethod genericPaymentMethod = (GenericPaymentMethod) other;
                return Intrinsics.areEqual(this.label, genericPaymentMethod.label) && this.iconResource == genericPaymentMethod.iconResource && Intrinsics.areEqual(this.lightThemeIconUrl, genericPaymentMethod.lightThemeIconUrl) && Intrinsics.areEqual(this.darkThemeIconUrl, genericPaymentMethod.darkThemeIconUrl) && Intrinsics.areEqual(this.paymentMethodCreateParams, genericPaymentMethod.paymentMethodCreateParams) && this.customerRequestedSave == genericPaymentMethod.customerRequestedSave && Intrinsics.areEqual(this.paymentMethodOptionsParams, genericPaymentMethod.paymentMethodOptionsParams) && Intrinsics.areEqual(this.paymentMethodExtraParams, genericPaymentMethod.paymentMethodExtraParams);
            }

            public int hashCode() {
                int iHashCode = ((this.label.hashCode() * 31) + Integer.hashCode(this.iconResource)) * 31;
                String str = this.lightThemeIconUrl;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.darkThemeIconUrl;
                int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.paymentMethodCreateParams.hashCode()) * 31) + this.customerRequestedSave.hashCode()) * 31;
                PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptionsParams;
                int iHashCode4 = (iHashCode3 + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31;
                PaymentMethodExtraParams paymentMethodExtraParams = this.paymentMethodExtraParams;
                return iHashCode4 + (paymentMethodExtraParams != null ? paymentMethodExtraParams.hashCode() : 0);
            }

            public String toString() {
                return "GenericPaymentMethod(label=" + this.label + ", iconResource=" + this.iconResource + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", customerRequestedSave=" + this.customerRequestedSave + ", paymentMethodOptionsParams=" + this.paymentMethodOptionsParams + ", paymentMethodExtraParams=" + this.paymentMethodExtraParams + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.label, flags);
                dest.writeInt(this.iconResource);
                dest.writeString(this.lightThemeIconUrl);
                dest.writeString(this.darkThemeIconUrl);
                dest.writeParcelable(this.paymentMethodCreateParams, flags);
                dest.writeString(this.customerRequestedSave.name());
                dest.writeParcelable(this.paymentMethodOptionsParams, flags);
                dest.writeParcelable(this.paymentMethodExtraParams, flags);
            }

            public /* synthetic */ GenericPaymentMethod(ResolvableString resolvableString, int i, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(resolvableString, i, str, str2, paymentMethodCreateParams, customerRequestedSave, (i2 & 64) != 0 ? null : paymentMethodOptionsParams, (i2 & 128) != 0 ? null : paymentMethodExtraParams);
            }

            public final ResolvableString getLabel() {
                return this.label;
            }

            public final int getIconResource() {
                return this.iconResource;
            }

            public final String getLightThemeIconUrl() {
                return this.lightThemeIconUrl;
            }

            public final String getDarkThemeIconUrl() {
                return this.darkThemeIconUrl;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public CustomerRequestedSave getCustomerRequestedSave() {
                return this.customerRequestedSave;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodOptionsParams getPaymentMethodOptionsParams() {
                return this.paymentMethodOptionsParams;
            }

            @Override // com.stripe.android.paymentsheet.model.PaymentSelection.New
            public PaymentMethodExtraParams getPaymentMethodExtraParams() {
                return this.paymentMethodExtraParams;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericPaymentMethod(ResolvableString label, int i, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, CustomerRequestedSave customerRequestedSave, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams) {
                super(null);
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
                Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
                this.label = label;
                this.iconResource = i;
                this.lightThemeIconUrl = str;
                this.darkThemeIconUrl = str2;
                this.paymentMethodCreateParams = paymentMethodCreateParams;
                this.customerRequestedSave = customerRequestedSave;
                this.paymentMethodOptionsParams = paymentMethodOptionsParams;
                this.paymentMethodExtraParams = paymentMethodExtraParams;
            }
        }
    }

    /* compiled from: PaymentSelection.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J,\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;", "", "resources", "Landroid/content/res/Resources;", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "<init>", "(Landroid/content/res/Resources;Lcom/stripe/android/uicore/image/StripeImageLoader;)V", "isDarkTheme", "", "load", "Landroid/graphics/drawable/Drawable;", "drawableResourceId", "", "lightThemeIconUrl", "", "darkThemeIconUrl", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IconLoader {
        private final StripeImageLoader imageLoader;
        private final Resources resources;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final ShapeDrawable emptyDrawable = new ShapeDrawable();

        @Inject
        public IconLoader(Resources resources, StripeImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            this.resources = resources;
            this.imageLoader = imageLoader;
        }

        private final boolean isDarkTheme() {
            Configuration configuration = this.resources.getConfiguration();
            return configuration != null && (configuration.uiMode & 48) == 32;
        }

        private static final Drawable load$loadResource(IconLoader iconLoader, int i) {
            Object objM9118constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResourcesCompat.getDrawable(iconLoader.resources, i, null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            Drawable drawable = (Drawable) (Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
            return drawable == null ? emptyDrawable : drawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object load$loadIcon(IconLoader iconLoader, int i, String str, Continuation<? super Drawable> continuation) {
            PaymentSelection$IconLoader$load$loadIcon$1 paymentSelection$IconLoader$load$loadIcon$1;
            Object objM8887loadgIAlus;
            if (continuation instanceof PaymentSelection$IconLoader$load$loadIcon$1) {
                paymentSelection$IconLoader$load$loadIcon$1 = (PaymentSelection$IconLoader$load$loadIcon$1) continuation;
                if ((paymentSelection$IconLoader$load$loadIcon$1.label & Integer.MIN_VALUE) != 0) {
                    paymentSelection$IconLoader$load$loadIcon$1.label -= Integer.MIN_VALUE;
                } else {
                    paymentSelection$IconLoader$load$loadIcon$1 = new PaymentSelection$IconLoader$load$loadIcon$1(continuation);
                }
            }
            Object obj = paymentSelection$IconLoader$load$loadIcon$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = paymentSelection$IconLoader$load$loadIcon$1.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                StripeImageLoader stripeImageLoader = iconLoader.imageLoader;
                paymentSelection$IconLoader$load$loadIcon$1.L$0 = iconLoader;
                paymentSelection$IconLoader$load$loadIcon$1.I$0 = i;
                paymentSelection$IconLoader$load$loadIcon$1.label = 1;
                objM8887loadgIAlus = stripeImageLoader.m8887loadgIAlus(str, paymentSelection$IconLoader$load$loadIcon$1);
                if (objM8887loadgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = paymentSelection$IconLoader$load$loadIcon$1.I$0;
                iconLoader = (IconLoader) paymentSelection$IconLoader$load$loadIcon$1.L$0;
                ResultKt.throwOnFailure(obj);
                objM8887loadgIAlus = ((Result) obj).getValue();
            }
            if (Result.m9124isFailureimpl(objM8887loadgIAlus)) {
                objM8887loadgIAlus = null;
            }
            Bitmap bitmap = (Bitmap) objM8887loadgIAlus;
            if (bitmap != null) {
                return new BitmapDrawable(iconLoader.resources, bitmap);
            }
            return load$loadResource(iconLoader, i);
        }

        public final Object load(int i, String str, String str2, Continuation<? super Drawable> continuation) {
            if (isDarkTheme() && str2 != null) {
                return load$loadIcon(this, i, str2, continuation);
            }
            if (str != null) {
                return load$loadIcon(this, i, str, continuation);
            }
            return load$loadResource(this, i);
        }

        /* compiled from: PaymentSelection.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$Companion;", "", "<init>", "()V", "emptyDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "getEmptyDrawable$annotations", "getEmptyDrawable", "()Landroid/graphics/drawable/ShapeDrawable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void getEmptyDrawable$annotations() {
            }

            private Companion() {
            }

            public final ShapeDrawable getEmptyDrawable() {
                return IconLoader.emptyDrawable;
            }
        }
    }
}
