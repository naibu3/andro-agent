package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Customer.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\t2\u0006\u0010%\u001a\u00020\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\u0088\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000bHÀ\u0001¢\u0006\u0004\b1\u00102J\u0006\u00103\u001a\u00020\rJ\u0013\u00104\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\rHÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001c¨\u0006>"}, d2 = {"Lcom/stripe/android/model/Customer;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "defaultSource", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "sources", "", "Lcom/stripe/android/model/CustomerPaymentSource;", "hasMore", "", "totalCount", "", "url", "description", "email", "liveMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getDefaultSource", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "getSources", "()Ljava/util/List;", "getHasMore", "()Z", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "getDescription", "getEmail", "getLiveMode", "getSourceById", "sourceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "copy$payments_core_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/model/Customer;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Customer implements StripeModel {
    private final String defaultSource;
    private final String description;
    private final String email;
    private final boolean hasMore;
    private final String id;
    private final boolean liveMode;
    private final ShippingInformation shippingInformation;
    private final List<CustomerPaymentSource> sources;
    private final Integer totalCount;
    private final String url;
    public static final Parcelable.Creator<Customer> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: Customer.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Customer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Customer createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ShippingInformation shippingInformationCreateFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z2 = false;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(Customer.class.getClassLoader()));
            }
            ArrayList arrayList2 = arrayList;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new Customer(string, string2, shippingInformationCreateFromParcel, arrayList2, z2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? true : z);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Customer[] newArray(int i) {
            return new Customer[i];
        }
    }

    public static /* synthetic */ Customer copy$payments_core_release$default(Customer customer, String str, String str2, ShippingInformation shippingInformation, List list, boolean z, Integer num, String str3, String str4, String str5, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customer.id;
        }
        if ((i & 2) != 0) {
            str2 = customer.defaultSource;
        }
        if ((i & 4) != 0) {
            shippingInformation = customer.shippingInformation;
        }
        if ((i & 8) != 0) {
            list = customer.sources;
        }
        if ((i & 16) != 0) {
            z = customer.hasMore;
        }
        if ((i & 32) != 0) {
            num = customer.totalCount;
        }
        if ((i & 64) != 0) {
            str3 = customer.url;
        }
        if ((i & 128) != 0) {
            str4 = customer.description;
        }
        if ((i & 256) != 0) {
            str5 = customer.email;
        }
        if ((i & 512) != 0) {
            z2 = customer.liveMode;
        }
        String str6 = str5;
        boolean z3 = z2;
        String str7 = str3;
        String str8 = str4;
        boolean z4 = z;
        Integer num2 = num;
        return customer.copy$payments_core_release(str, str2, shippingInformation, list, z4, num2, str7, str8, str6, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getLiveMode() {
        return this.liveMode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDefaultSource() {
        return this.defaultSource;
    }

    /* renamed from: component3, reason: from getter */
    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final List<CustomerPaymentSource> component4() {
        return this.sources;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final Customer copy$payments_core_release(String id, String defaultSource, ShippingInformation shippingInformation, List<? extends CustomerPaymentSource> sources, boolean hasMore, Integer totalCount, String url, String description, String email, boolean liveMode) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        return new Customer(id, defaultSource, shippingInformation, sources, hasMore, totalCount, url, description, email, liveMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) other;
        return Intrinsics.areEqual(this.id, customer.id) && Intrinsics.areEqual(this.defaultSource, customer.defaultSource) && Intrinsics.areEqual(this.shippingInformation, customer.shippingInformation) && Intrinsics.areEqual(this.sources, customer.sources) && this.hasMore == customer.hasMore && Intrinsics.areEqual(this.totalCount, customer.totalCount) && Intrinsics.areEqual(this.url, customer.url) && Intrinsics.areEqual(this.description, customer.description) && Intrinsics.areEqual(this.email, customer.email) && this.liveMode == customer.liveMode;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultSource;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        int iHashCode3 = (((((iHashCode2 + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31) + this.sources.hashCode()) * 31) + Boolean.hashCode(this.hasMore)) * 31;
        Integer num = this.totalCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        return ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.liveMode);
    }

    public String toString() {
        return "Customer(id=" + this.id + ", defaultSource=" + this.defaultSource + ", shippingInformation=" + this.shippingInformation + ", sources=" + this.sources + ", hasMore=" + this.hasMore + ", totalCount=" + this.totalCount + ", url=" + this.url + ", description=" + this.description + ", email=" + this.email + ", liveMode=" + this.liveMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.defaultSource);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shippingInformation.writeToParcel(dest, flags);
        }
        List<CustomerPaymentSource> list = this.sources;
        dest.writeInt(list.size());
        Iterator<CustomerPaymentSource> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeInt(this.hasMore ? 1 : 0);
        Integer num = this.totalCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.url);
        dest.writeString(this.description);
        dest.writeString(this.email);
        dest.writeInt(this.liveMode ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Customer(String str, String str2, ShippingInformation shippingInformation, List<? extends CustomerPaymentSource> sources, boolean z, Integer num, String str3, String str4, String str5, boolean z2) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.id = str;
        this.defaultSource = str2;
        this.shippingInformation = shippingInformation;
        this.sources = sources;
        this.hasMore = z;
        this.totalCount = num;
        this.url = str3;
        this.description = str4;
        this.email = str5;
        this.liveMode = z2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getDefaultSource() {
        return this.defaultSource;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final List<CustomerPaymentSource> getSources() {
        return this.sources;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getLiveMode() {
        return this.liveMode;
    }

    public final CustomerPaymentSource getSourceById(String sourceId) {
        Object next;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Iterator<T> it = this.sources.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((CustomerPaymentSource) next).getId(), sourceId)) {
                break;
            }
        }
        return (CustomerPaymentSource) next;
    }
}
