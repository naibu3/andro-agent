package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListPaymentMethodsParams.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\t\u0010\u0013\u001a\u00020\u0004HÂ\u0003J\u000e\u0010\u0014\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÂ\u0003JF\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\bJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/stripe/android/model/ListPaymentMethodsParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "customerId", "", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", ListPaymentMethodsParams.PARAM_LIMIT, "", "endingBefore", "startingAfter", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentMethodType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "Ljava/lang/Integer;", "toParamMap", "", "", "component1", "component2", "component2$payments_core_release", "component3", "()Ljava/lang/Integer;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ListPaymentMethodsParams;", "describeContents", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ListPaymentMethodsParams implements StripeParamsModel, Parcelable {
    private static final String PARAM_CUSTOMER = "customer";
    private static final String PARAM_ENDING_BEFORE = "ending_before";
    private static final String PARAM_LIMIT = "limit";
    private static final String PARAM_STARTING_AFTER = "starting_after";
    private static final String PARAM_TYPE = "type";
    private final String customerId;
    private final String endingBefore;
    private final Integer limit;
    private final PaymentMethod.Type paymentMethodType;
    private final String startingAfter;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ListPaymentMethodsParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: ListPaymentMethodsParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ListPaymentMethodsParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPaymentMethodsParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ListPaymentMethodsParams(parcel.readString(), PaymentMethod.Type.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPaymentMethodsParams[] newArray(int i) {
            return new ListPaymentMethodsParams[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getCustomerId() {
        return this.customerId;
    }

    /* renamed from: component3, reason: from getter */
    private final Integer getLimit() {
        return this.limit;
    }

    /* renamed from: component4, reason: from getter */
    private final String getEndingBefore() {
        return this.endingBefore;
    }

    /* renamed from: component5, reason: from getter */
    private final String getStartingAfter() {
        return this.startingAfter;
    }

    public static /* synthetic */ ListPaymentMethodsParams copy$default(ListPaymentMethodsParams listPaymentMethodsParams, String str, PaymentMethod.Type type, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listPaymentMethodsParams.customerId;
        }
        if ((i & 2) != 0) {
            type = listPaymentMethodsParams.paymentMethodType;
        }
        if ((i & 4) != 0) {
            num = listPaymentMethodsParams.limit;
        }
        if ((i & 8) != 0) {
            str2 = listPaymentMethodsParams.endingBefore;
        }
        if ((i & 16) != 0) {
            str3 = listPaymentMethodsParams.startingAfter;
        }
        String str4 = str3;
        Integer num2 = num;
        return listPaymentMethodsParams.copy(str, type, num2, str2, str4);
    }

    /* renamed from: component2$payments_core_release, reason: from getter */
    public final PaymentMethod.Type getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final ListPaymentMethodsParams copy(String customerId, PaymentMethod.Type paymentMethodType, Integer limit, String endingBefore, String startingAfter) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        return new ListPaymentMethodsParams(customerId, paymentMethodType, limit, endingBefore, startingAfter);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListPaymentMethodsParams)) {
            return false;
        }
        ListPaymentMethodsParams listPaymentMethodsParams = (ListPaymentMethodsParams) other;
        return Intrinsics.areEqual(this.customerId, listPaymentMethodsParams.customerId) && this.paymentMethodType == listPaymentMethodsParams.paymentMethodType && Intrinsics.areEqual(this.limit, listPaymentMethodsParams.limit) && Intrinsics.areEqual(this.endingBefore, listPaymentMethodsParams.endingBefore) && Intrinsics.areEqual(this.startingAfter, listPaymentMethodsParams.startingAfter);
    }

    public int hashCode() {
        int iHashCode = ((this.customerId.hashCode() * 31) + this.paymentMethodType.hashCode()) * 31;
        Integer num = this.limit;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.endingBefore;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startingAfter;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ListPaymentMethodsParams(customerId=" + this.customerId + ", paymentMethodType=" + this.paymentMethodType + ", limit=" + this.limit + ", endingBefore=" + this.endingBefore + ", startingAfter=" + this.startingAfter + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.customerId);
        this.paymentMethodType.writeToParcel(dest, flags);
        Integer num = this.limit;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.endingBefore);
        dest.writeString(this.startingAfter);
    }

    public ListPaymentMethodsParams(String customerId, PaymentMethod.Type paymentMethodType, Integer num, String str, String str2) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        this.customerId = customerId;
        this.paymentMethodType = paymentMethodType;
        this.limit = num;
        this.endingBefore = str;
        this.startingAfter = str2;
    }

    public /* synthetic */ ListPaymentMethodsParams(String str, PaymentMethod.Type type, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public final PaymentMethod.Type getPaymentMethodType$payments_core_release() {
        return this.paymentMethodType;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        List<Pair> listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("customer", this.customerId), TuplesKt.to("type", this.paymentMethodType.code), TuplesKt.to(PARAM_LIMIT, this.limit), TuplesKt.to(PARAM_ENDING_BEFORE, this.endingBefore), TuplesKt.to(PARAM_STARTING_AFTER, this.startingAfter)});
        Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
        for (Pair pair : listListOf) {
            String str = (String) pair.component1();
            Object objComponent2 = pair.component2();
            Map mapMapOf = objComponent2 != null ? MapsKt.mapOf(TuplesKt.to(str, objComponent2)) : null;
            if (mapMapOf == null) {
                mapMapOf = MapsKt.emptyMap();
            }
            mapEmptyMap = MapsKt.plus(mapEmptyMap, mapMapOf);
        }
        return mapEmptyMap;
    }

    /* compiled from: ListPaymentMethodsParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/ListPaymentMethodsParams$Companion;", "", "<init>", "()V", "PARAM_CUSTOMER", "", "PARAM_TYPE", "PARAM_LIMIT", "PARAM_ENDING_BEFORE", "PARAM_STARTING_AFTER", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
