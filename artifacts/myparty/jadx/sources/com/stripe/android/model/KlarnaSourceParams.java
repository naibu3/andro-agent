package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.PointerIconCompat;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.material.internal.ViewUtils;
import com.stripe.android.model.KlarnaSourceParams;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: KlarnaSourceParams.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0004ABCDB\u0083\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020)0(H\u0016J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0087\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0006\u00105\u001a\u000206J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010:\u001a\u000206HÖ\u0001J\t\u0010;\u001a\u00020\u0004HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000206R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006E"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "purchaseCountry", "", "lineItems", "", "Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "customPaymentMethods", "", "Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "billingEmail", "billingPhone", "billingAddress", "Lcom/stripe/android/model/Address;", "billingFirstName", "billingLastName", "billingDob", "Lcom/stripe/android/model/DateOfBirth;", "pageOptions", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DateOfBirth;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;)V", "getPurchaseCountry", "()Ljava/lang/String;", "getLineItems", "()Ljava/util/List;", "getCustomPaymentMethods", "()Ljava/util/Set;", "getBillingEmail", "getBillingPhone", "getBillingAddress", "()Lcom/stripe/android/model/Address;", "getBillingFirstName", "getBillingLastName", "getBillingDob", "()Lcom/stripe/android/model/DateOfBirth;", "getPageOptions", "()Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "toParamMap", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "LineItem", "CustomPaymentMethods", "PaymentPageOptions", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class KlarnaSourceParams implements StripeParamsModel, Parcelable {
    private static final String PARAM_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
    private static final String PARAM_DOB_DAY = "owner_dob_day";
    private static final String PARAM_DOB_MONTH = "owner_dob_month";
    private static final String PARAM_DOB_YEAR = "owner_dob_year";
    private static final String PARAM_FIRST_NAME = "first_name";
    private static final String PARAM_LAST_NAME = "last_name";
    private static final String PARAM_PRODUCT = "product";
    private static final String PARAM_PURCHASE_COUNTRY = "purchase_country";
    private final Address billingAddress;
    private final DateOfBirth billingDob;
    private final String billingEmail;
    private final String billingFirstName;
    private final String billingLastName;
    private final String billingPhone;
    private final Set<CustomPaymentMethods> customPaymentMethods;
    private final List<LineItem> lineItems;
    private final PaymentPageOptions pageOptions;
    private final String purchaseCountry;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KlarnaSourceParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: KlarnaSourceParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<KlarnaSourceParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlarnaSourceParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(LineItem.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList2 = arrayList;
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashSet.add(CustomPaymentMethods.valueOf(parcel.readString()));
            }
            return new KlarnaSourceParams(string, arrayList2, linkedHashSet, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DateOfBirth.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentPageOptions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlarnaSourceParams[] newArray(int i) {
            return new KlarnaSourceParams[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems) {
        this(purchaseCountry, lineItems, null, null, null, null, null, null, null, null, PointerIconCompat.TYPE_GRAB, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods) {
        this(purchaseCountry, lineItems, customPaymentMethods, null, null, null, null, null, null, null, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, null, null, null, null, null, null, PointerIconCompat.TYPE_TEXT, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, null, null, null, null, null, 992, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, null, null, null, null, 960, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, null, null, null, 896, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, str4, null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4, DateOfBirth dateOfBirth) {
        this(purchaseCountry, lineItems, customPaymentMethods, str, str2, address, str3, str4, dateOfBirth, null, 512, null);
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
    }

    public static /* synthetic */ KlarnaSourceParams copy$default(KlarnaSourceParams klarnaSourceParams, String str, List list, Set set, String str2, String str3, Address address, String str4, String str5, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            str = klarnaSourceParams.purchaseCountry;
        }
        if ((i & 2) != 0) {
            list = klarnaSourceParams.lineItems;
        }
        if ((i & 4) != 0) {
            set = klarnaSourceParams.customPaymentMethods;
        }
        if ((i & 8) != 0) {
            str2 = klarnaSourceParams.billingEmail;
        }
        if ((i & 16) != 0) {
            str3 = klarnaSourceParams.billingPhone;
        }
        if ((i & 32) != 0) {
            address = klarnaSourceParams.billingAddress;
        }
        if ((i & 64) != 0) {
            str4 = klarnaSourceParams.billingFirstName;
        }
        if ((i & 128) != 0) {
            str5 = klarnaSourceParams.billingLastName;
        }
        if ((i & 256) != 0) {
            dateOfBirth = klarnaSourceParams.billingDob;
        }
        if ((i & 512) != 0) {
            paymentPageOptions = klarnaSourceParams.pageOptions;
        }
        DateOfBirth dateOfBirth2 = dateOfBirth;
        PaymentPageOptions paymentPageOptions2 = paymentPageOptions;
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        Address address2 = address;
        return klarnaSourceParams.copy(str, list, set, str2, str8, address2, str6, str7, dateOfBirth2, paymentPageOptions2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseCountry() {
        return this.purchaseCountry;
    }

    /* renamed from: component10, reason: from getter */
    public final PaymentPageOptions getPageOptions() {
        return this.pageOptions;
    }

    public final List<LineItem> component2() {
        return this.lineItems;
    }

    public final Set<CustomPaymentMethods> component3() {
        return this.customPaymentMethods;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBillingEmail() {
        return this.billingEmail;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBillingPhone() {
        return this.billingPhone;
    }

    /* renamed from: component6, reason: from getter */
    public final Address getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBillingFirstName() {
        return this.billingFirstName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBillingLastName() {
        return this.billingLastName;
    }

    /* renamed from: component9, reason: from getter */
    public final DateOfBirth getBillingDob() {
        return this.billingDob;
    }

    public final KlarnaSourceParams copy(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String billingEmail, String billingPhone, Address billingAddress, String billingFirstName, String billingLastName, DateOfBirth billingDob, PaymentPageOptions pageOptions) {
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
        return new KlarnaSourceParams(purchaseCountry, lineItems, customPaymentMethods, billingEmail, billingPhone, billingAddress, billingFirstName, billingLastName, billingDob, pageOptions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KlarnaSourceParams)) {
            return false;
        }
        KlarnaSourceParams klarnaSourceParams = (KlarnaSourceParams) other;
        return Intrinsics.areEqual(this.purchaseCountry, klarnaSourceParams.purchaseCountry) && Intrinsics.areEqual(this.lineItems, klarnaSourceParams.lineItems) && Intrinsics.areEqual(this.customPaymentMethods, klarnaSourceParams.customPaymentMethods) && Intrinsics.areEqual(this.billingEmail, klarnaSourceParams.billingEmail) && Intrinsics.areEqual(this.billingPhone, klarnaSourceParams.billingPhone) && Intrinsics.areEqual(this.billingAddress, klarnaSourceParams.billingAddress) && Intrinsics.areEqual(this.billingFirstName, klarnaSourceParams.billingFirstName) && Intrinsics.areEqual(this.billingLastName, klarnaSourceParams.billingLastName) && Intrinsics.areEqual(this.billingDob, klarnaSourceParams.billingDob) && Intrinsics.areEqual(this.pageOptions, klarnaSourceParams.pageOptions);
    }

    public int hashCode() {
        int iHashCode = ((((this.purchaseCountry.hashCode() * 31) + this.lineItems.hashCode()) * 31) + this.customPaymentMethods.hashCode()) * 31;
        String str = this.billingEmail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billingPhone;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.billingAddress;
        int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.billingFirstName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingLastName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateOfBirth dateOfBirth = this.billingDob;
        int iHashCode7 = (iHashCode6 + (dateOfBirth == null ? 0 : dateOfBirth.hashCode())) * 31;
        PaymentPageOptions paymentPageOptions = this.pageOptions;
        return iHashCode7 + (paymentPageOptions != null ? paymentPageOptions.hashCode() : 0);
    }

    public String toString() {
        return "KlarnaSourceParams(purchaseCountry=" + this.purchaseCountry + ", lineItems=" + this.lineItems + ", customPaymentMethods=" + this.customPaymentMethods + ", billingEmail=" + this.billingEmail + ", billingPhone=" + this.billingPhone + ", billingAddress=" + this.billingAddress + ", billingFirstName=" + this.billingFirstName + ", billingLastName=" + this.billingLastName + ", billingDob=" + this.billingDob + ", pageOptions=" + this.pageOptions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.purchaseCountry);
        List<LineItem> list = this.lineItems;
        dest.writeInt(list.size());
        Iterator<LineItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        dest.writeInt(set.size());
        Iterator<CustomPaymentMethods> it2 = set.iterator();
        while (it2.hasNext()) {
            dest.writeString(it2.next().name());
        }
        dest.writeString(this.billingEmail);
        dest.writeString(this.billingPhone);
        Address address = this.billingAddress;
        if (address == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            address.writeToParcel(dest, flags);
        }
        dest.writeString(this.billingFirstName);
        dest.writeString(this.billingLastName);
        DateOfBirth dateOfBirth = this.billingDob;
        if (dateOfBirth == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dateOfBirth.writeToParcel(dest, flags);
        }
        PaymentPageOptions paymentPageOptions = this.pageOptions;
        if (paymentPageOptions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentPageOptions.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KlarnaSourceParams(String purchaseCountry, List<LineItem> lineItems, Set<? extends CustomPaymentMethods> customPaymentMethods, String str, String str2, Address address, String str3, String str4, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions) {
        Intrinsics.checkNotNullParameter(purchaseCountry, "purchaseCountry");
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
        this.purchaseCountry = purchaseCountry;
        this.lineItems = lineItems;
        this.customPaymentMethods = customPaymentMethods;
        this.billingEmail = str;
        this.billingPhone = str2;
        this.billingAddress = address;
        this.billingFirstName = str3;
        this.billingLastName = str4;
        this.billingDob = dateOfBirth;
        this.pageOptions = paymentPageOptions;
    }

    public final String getPurchaseCountry() {
        return this.purchaseCountry;
    }

    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ KlarnaSourceParams(java.lang.String r14, java.util.List r15, java.util.Set r16, java.lang.String r17, java.lang.String r18, com.stripe.android.model.Address r19, java.lang.String r20, java.lang.String r21, com.stripe.android.model.DateOfBirth r22, com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 4
            if (r1 == 0) goto Lc
            java.util.Set r1 = kotlin.collections.SetsKt.emptySet()
            r5 = r1
            goto Le
        Lc:
            r5 = r16
        Le:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L15
            r6 = r2
            goto L17
        L15:
            r6 = r17
        L17:
            r1 = r0 & 16
            if (r1 == 0) goto L1d
            r7 = r2
            goto L1f
        L1d:
            r7 = r18
        L1f:
            r1 = r0 & 32
            if (r1 == 0) goto L25
            r8 = r2
            goto L27
        L25:
            r8 = r19
        L27:
            r1 = r0 & 64
            if (r1 == 0) goto L2d
            r9 = r2
            goto L2f
        L2d:
            r9 = r20
        L2f:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L35
            r10 = r2
            goto L37
        L35:
            r10 = r21
        L37:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3d
            r11 = r2
            goto L3f
        L3d:
            r11 = r22
        L3f:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L48
            r12 = r2
            r3 = r14
            r4 = r15
            r2 = r13
            goto L4d
        L48:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
        L4d:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.KlarnaSourceParams.<init>(java.lang.String, java.util.List, java.util.Set, java.lang.String, java.lang.String, com.stripe.android.model.Address, java.lang.String, java.lang.String, com.stripe.android.model.DateOfBirth, com.stripe.android.model.KlarnaSourceParams$PaymentPageOptions, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Set<CustomPaymentMethods> getCustomPaymentMethods() {
        return this.customPaymentMethods;
    }

    public final String getBillingEmail() {
        return this.billingEmail;
    }

    public final String getBillingPhone() {
        return this.billingPhone;
    }

    public final Address getBillingAddress() {
        return this.billingAddress;
    }

    public final String getBillingFirstName() {
        return this.billingFirstName;
    }

    public final String getBillingLastName() {
        return this.billingLastName;
    }

    public final DateOfBirth getBillingDob() {
        return this.billingDob;
    }

    public final PaymentPageOptions getPageOptions() {
        return this.pageOptions;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("product", "payment"), TuplesKt.to(PARAM_PURCHASE_COUNTRY, this.purchaseCountry));
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        if (set.isEmpty()) {
            set = null;
        }
        Map mapMapOf2 = set != null ? MapsKt.mapOf(TuplesKt.to("custom_payment_methods", CollectionsKt.joinToString$default(CollectionsKt.sortedWith(CollectionsKt.toList(set), new Comparator() { // from class: com.stripe.android.model.KlarnaSourceParams$toParamMap$lambda$3$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((KlarnaSourceParams.CustomPaymentMethods) t).ordinal()), Integer.valueOf(((KlarnaSourceParams.CustomPaymentMethods) t2).ordinal()));
            }
        }), ",", null, null, 0, null, new Function1() { // from class: com.stripe.android.model.KlarnaSourceParams$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KlarnaSourceParams.toParamMap$lambda$3$lambda$2((KlarnaSourceParams.CustomPaymentMethods) obj);
            }
        }, 30, null))) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        Map mapPlus = MapsKt.plus(mapMapOf, mapMapOf2);
        String str = this.billingFirstName;
        Map mapMapOf3 = str != null ? MapsKt.mapOf(TuplesKt.to(PARAM_FIRST_NAME, str)) : null;
        if (mapMapOf3 == null) {
            mapMapOf3 = MapsKt.emptyMap();
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf3);
        String str2 = this.billingLastName;
        Map mapMapOf4 = str2 != null ? MapsKt.mapOf(TuplesKt.to(PARAM_LAST_NAME, str2)) : null;
        if (mapMapOf4 == null) {
            mapMapOf4 = MapsKt.emptyMap();
        }
        Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf4);
        DateOfBirth dateOfBirth = this.billingDob;
        Map mapMapOf5 = dateOfBirth != null ? MapsKt.mapOf(TuplesKt.to(PARAM_DOB_DAY, StringsKt.padStart(String.valueOf(dateOfBirth.getDay()), 2, '0')), TuplesKt.to(PARAM_DOB_MONTH, StringsKt.padStart(String.valueOf(dateOfBirth.getMonth()), 2, '0')), TuplesKt.to(PARAM_DOB_YEAR, String.valueOf(dateOfBirth.getYear()))) : null;
        if (mapMapOf5 == null) {
            mapMapOf5 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapPlus3, mapMapOf5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toParamMap$lambda$3$lambda$2(CustomPaymentMethods it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCode();
    }

    /* compiled from: KlarnaSourceParams.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "Landroid/os/Parcelable;", "itemType", "Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "itemDescription", "", "totalAmount", "", "quantity", "<init>", "(Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;Ljava/lang/String;ILjava/lang/Integer;)V", "getItemType", "()Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "getItemDescription", "()Ljava/lang/String;", "getTotalAmount", "()I", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;Ljava/lang/String;ILjava/lang/Integer;)Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Type", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LineItem implements Parcelable {
        private final String itemDescription;
        private final Type itemType;
        private final Integer quantity;
        private final int totalAmount;
        public static final Parcelable.Creator<LineItem> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: KlarnaSourceParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LineItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LineItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LineItem(Type.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LineItem[] newArray(int i) {
                return new LineItem[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LineItem(Type itemType, String itemDescription, int i) {
            this(itemType, itemDescription, i, null, 8, null);
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(itemDescription, "itemDescription");
        }

        public static /* synthetic */ LineItem copy$default(LineItem lineItem, Type type, String str, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                type = lineItem.itemType;
            }
            if ((i2 & 2) != 0) {
                str = lineItem.itemDescription;
            }
            if ((i2 & 4) != 0) {
                i = lineItem.totalAmount;
            }
            if ((i2 & 8) != 0) {
                num = lineItem.quantity;
            }
            return lineItem.copy(type, str, i, num);
        }

        /* renamed from: component1, reason: from getter */
        public final Type getItemType() {
            return this.itemType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getItemDescription() {
            return this.itemDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTotalAmount() {
            return this.totalAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getQuantity() {
            return this.quantity;
        }

        public final LineItem copy(Type itemType, String itemDescription, int totalAmount, Integer quantity) {
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(itemDescription, "itemDescription");
            return new LineItem(itemType, itemDescription, totalAmount, quantity);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LineItem)) {
                return false;
            }
            LineItem lineItem = (LineItem) other;
            return this.itemType == lineItem.itemType && Intrinsics.areEqual(this.itemDescription, lineItem.itemDescription) && this.totalAmount == lineItem.totalAmount && Intrinsics.areEqual(this.quantity, lineItem.quantity);
        }

        public int hashCode() {
            int iHashCode = ((((this.itemType.hashCode() * 31) + this.itemDescription.hashCode()) * 31) + Integer.hashCode(this.totalAmount)) * 31;
            Integer num = this.quantity;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "LineItem(itemType=" + this.itemType + ", itemDescription=" + this.itemDescription + ", totalAmount=" + this.totalAmount + ", quantity=" + this.quantity + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.itemType.name());
            dest.writeString(this.itemDescription);
            dest.writeInt(this.totalAmount);
            Integer num = this.quantity;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
        }

        public LineItem(Type itemType, String itemDescription, int i, Integer num) {
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            Intrinsics.checkNotNullParameter(itemDescription, "itemDescription");
            this.itemType = itemType;
            this.itemDescription = itemDescription;
            this.totalAmount = i;
            this.quantity = num;
        }

        public /* synthetic */ LineItem(Type type, String str, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, str, i, (i2 & 8) != 0 ? null : num);
        }

        public final Type getItemType() {
            return this.itemType;
        }

        public final String getItemDescription() {
            return this.itemDescription;
        }

        public final int getTotalAmount() {
            return this.totalAmount;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: KlarnaSourceParams.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Sku", "Tax", "Shipping", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private final String code;
            public static final Type Sku = new Type("Sku", 0, "sku");
            public static final Type Tax = new Type("Tax", 1, "tax");
            public static final Type Shipping = new Type("Shipping", 2, "shipping");

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{Sku, Tax, Shipping};
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i, String str2) {
                this.code = str2;
            }

            /* renamed from: getCode$payments_core_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KlarnaSourceParams.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "PayIn4", "Installments", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomPaymentMethods {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CustomPaymentMethods[] $VALUES;
        private final String code;
        public static final CustomPaymentMethods PayIn4 = new CustomPaymentMethods("PayIn4", 0, "payin4");
        public static final CustomPaymentMethods Installments = new CustomPaymentMethods("Installments", 1, "installments");

        private static final /* synthetic */ CustomPaymentMethods[] $values() {
            return new CustomPaymentMethods[]{PayIn4, Installments};
        }

        public static EnumEntries<CustomPaymentMethods> getEntries() {
            return $ENTRIES;
        }

        private CustomPaymentMethods(String str, int i, String str2) {
            this.code = str2;
        }

        /* renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        static {
            CustomPaymentMethods[] customPaymentMethodsArr$values = $values();
            $VALUES = customPaymentMethodsArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(customPaymentMethodsArr$values);
        }

        public static CustomPaymentMethods valueOf(String str) {
            return (CustomPaymentMethods) Enum.valueOf(CustomPaymentMethods.class, str);
        }

        public static CustomPaymentMethods[] values() {
            return (CustomPaymentMethods[]) $VALUES.clone();
        }
    }

    /* compiled from: KlarnaSourceParams.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002%&B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006'"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "logoUrl", "", "backgroundImageUrl", "pageTitle", "purchaseType", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;)V", "getLogoUrl", "()Ljava/lang/String;", "getBackgroundImageUrl", "getPageTitle", "getPurchaseType", "()Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "toParamMap", "", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "PurchaseType", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentPageOptions implements StripeParamsModel, Parcelable {
        private static final String PARAM_BACKGROUND_IMAGE_URL = "background_image_url";
        private static final String PARAM_LOGO_URL = "logo_url";
        private static final String PARAM_PAGE_TITLE = "page_title";
        private static final String PARAM_PURCHASE_TYPE = "purchase_type";
        private final String backgroundImageUrl;
        private final String logoUrl;
        private final String pageTitle;
        private final PurchaseType purchaseType;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<PaymentPageOptions> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: KlarnaSourceParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentPageOptions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPageOptions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentPageOptions(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PurchaseType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentPageOptions[] newArray(int i) {
                return new PaymentPageOptions[i];
            }
        }

        public PaymentPageOptions() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PaymentPageOptions copy$default(PaymentPageOptions paymentPageOptions, String str, String str2, String str3, PurchaseType purchaseType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentPageOptions.logoUrl;
            }
            if ((i & 2) != 0) {
                str2 = paymentPageOptions.backgroundImageUrl;
            }
            if ((i & 4) != 0) {
                str3 = paymentPageOptions.pageTitle;
            }
            if ((i & 8) != 0) {
                purchaseType = paymentPageOptions.purchaseType;
            }
            return paymentPageOptions.copy(str, str2, str3, purchaseType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPageTitle() {
            return this.pageTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }

        public final PaymentPageOptions copy(String logoUrl, String backgroundImageUrl, String pageTitle, PurchaseType purchaseType) {
            return new PaymentPageOptions(logoUrl, backgroundImageUrl, pageTitle, purchaseType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentPageOptions)) {
                return false;
            }
            PaymentPageOptions paymentPageOptions = (PaymentPageOptions) other;
            return Intrinsics.areEqual(this.logoUrl, paymentPageOptions.logoUrl) && Intrinsics.areEqual(this.backgroundImageUrl, paymentPageOptions.backgroundImageUrl) && Intrinsics.areEqual(this.pageTitle, paymentPageOptions.pageTitle) && this.purchaseType == paymentPageOptions.purchaseType;
        }

        public int hashCode() {
            String str = this.logoUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backgroundImageUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.pageTitle;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PurchaseType purchaseType = this.purchaseType;
            return iHashCode3 + (purchaseType != null ? purchaseType.hashCode() : 0);
        }

        public String toString() {
            return "PaymentPageOptions(logoUrl=" + this.logoUrl + ", backgroundImageUrl=" + this.backgroundImageUrl + ", pageTitle=" + this.pageTitle + ", purchaseType=" + this.purchaseType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.logoUrl);
            dest.writeString(this.backgroundImageUrl);
            dest.writeString(this.pageTitle);
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(purchaseType.name());
            }
        }

        public PaymentPageOptions(String str, String str2, String str3, PurchaseType purchaseType) {
            this.logoUrl = str;
            this.backgroundImageUrl = str2;
            this.pageTitle = str3;
            this.purchaseType = purchaseType;
        }

        public /* synthetic */ PaymentPageOptions(String str, String str2, String str3, PurchaseType purchaseType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : purchaseType);
        }

        public final String getLogoUrl() {
            return this.logoUrl;
        }

        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final String getPageTitle() {
            return this.pageTitle;
        }

        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map mapEmptyMap = MapsKt.emptyMap();
            String str = this.logoUrl;
            Map mapMapOf = str != null ? MapsKt.mapOf(TuplesKt.to("logo_url", str)) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            Map mapPlus = MapsKt.plus(mapEmptyMap, mapMapOf);
            String str2 = this.backgroundImageUrl;
            Map mapMapOf2 = str2 != null ? MapsKt.mapOf(TuplesKt.to(PARAM_BACKGROUND_IMAGE_URL, str2)) : null;
            if (mapMapOf2 == null) {
                mapMapOf2 = MapsKt.emptyMap();
            }
            Map mapPlus2 = MapsKt.plus(mapPlus, mapMapOf2);
            String str3 = this.pageTitle;
            Map mapMapOf3 = str3 != null ? MapsKt.mapOf(TuplesKt.to(PARAM_PAGE_TITLE, str3)) : null;
            if (mapMapOf3 == null) {
                mapMapOf3 = MapsKt.emptyMap();
            }
            Map mapPlus3 = MapsKt.plus(mapPlus2, mapMapOf3);
            PurchaseType purchaseType = this.purchaseType;
            Map mapMapOf4 = purchaseType != null ? MapsKt.mapOf(TuplesKt.to(PARAM_PURCHASE_TYPE, purchaseType.getCode())) : null;
            if (mapMapOf4 == null) {
                mapMapOf4 = MapsKt.emptyMap();
            }
            return MapsKt.plus(mapPlus3, mapMapOf4);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: KlarnaSourceParams.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Buy", "Rent", "Book", AppEventsConstants.EVENT_NAME_SUBSCRIBE, "Download", "Order", "Continue", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PurchaseType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ PurchaseType[] $VALUES;
            private final String code;
            public static final PurchaseType Buy = new PurchaseType("Buy", 0, "buy");
            public static final PurchaseType Rent = new PurchaseType("Rent", 1, "rent");
            public static final PurchaseType Book = new PurchaseType("Book", 2, "book");
            public static final PurchaseType Subscribe = new PurchaseType(AppEventsConstants.EVENT_NAME_SUBSCRIBE, 3, "subscribe");
            public static final PurchaseType Download = new PurchaseType("Download", 4, "download");
            public static final PurchaseType Order = new PurchaseType("Order", 5, "order");
            public static final PurchaseType Continue = new PurchaseType("Continue", 6, "continue");

            private static final /* synthetic */ PurchaseType[] $values() {
                return new PurchaseType[]{Buy, Rent, Book, Subscribe, Download, Order, Continue};
            }

            public static EnumEntries<PurchaseType> getEntries() {
                return $ENTRIES;
            }

            private PurchaseType(String str, int i, String str2) {
                this.code = str2;
            }

            public final String getCode() {
                return this.code;
            }

            static {
                PurchaseType[] purchaseTypeArr$values = $values();
                $VALUES = purchaseTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(purchaseTypeArr$values);
            }

            public static PurchaseType valueOf(String str) {
                return (PurchaseType) Enum.valueOf(PurchaseType.class, str);
            }

            public static PurchaseType[] values() {
                return (PurchaseType[]) $VALUES.clone();
            }
        }

        /* compiled from: KlarnaSourceParams.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$Companion;", "", "<init>", "()V", "PARAM_LOGO_URL", "", "PARAM_BACKGROUND_IMAGE_URL", "PARAM_PAGE_TITLE", "PARAM_PURCHASE_TYPE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: KlarnaSourceParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$Companion;", "", "<init>", "()V", "PARAM_PURCHASE_COUNTRY", "", "PARAM_PRODUCT", "PARAM_CUSTOM_PAYMENT_METHODS", "PARAM_FIRST_NAME", "PARAM_LAST_NAME", "PARAM_DOB_DAY", "PARAM_DOB_MONTH", "PARAM_DOB_YEAR", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
