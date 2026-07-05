package com.stripe.android.shoppay.bridge;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShippingResponse.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShippingResponse;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "lineItems", "", "Lcom/stripe/android/shoppay/bridge/ECELineItem;", "shippingRates", "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "totalAmount", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getLineItems", "()Ljava/util/List;", "getShippingRates", "getTotalAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/shoppay/bridge/ShippingResponse;", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ShippingResponse implements JsonSerializer {
    public static final int $stable = 8;
    private final List<ECELineItem> lineItems;
    private final List<ECEShippingRate> shippingRates;
    private final Integer totalAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShippingResponse copy$default(ShippingResponse shippingResponse, List list, List list2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shippingResponse.lineItems;
        }
        if ((i & 2) != 0) {
            list2 = shippingResponse.shippingRates;
        }
        if ((i & 4) != 0) {
            num = shippingResponse.totalAmount;
        }
        return shippingResponse.copy(list, list2, num);
    }

    public final List<ECELineItem> component1() {
        return this.lineItems;
    }

    public final List<ECEShippingRate> component2() {
        return this.shippingRates;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTotalAmount() {
        return this.totalAmount;
    }

    public final ShippingResponse copy(List<ECELineItem> lineItems, List<ECEShippingRate> shippingRates, Integer totalAmount) {
        return new ShippingResponse(lineItems, shippingRates, totalAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShippingResponse)) {
            return false;
        }
        ShippingResponse shippingResponse = (ShippingResponse) other;
        return Intrinsics.areEqual(this.lineItems, shippingResponse.lineItems) && Intrinsics.areEqual(this.shippingRates, shippingResponse.shippingRates) && Intrinsics.areEqual(this.totalAmount, shippingResponse.totalAmount);
    }

    public int hashCode() {
        List<ECELineItem> list = this.lineItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ECEShippingRate> list2 = this.shippingRates;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.totalAmount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ShippingResponse(lineItems=" + this.lineItems + ", shippingRates=" + this.shippingRates + ", totalAmount=" + this.totalAmount + ")";
    }

    public ShippingResponse(List<ECELineItem> list, List<ECEShippingRate> list2, Integer num) {
        this.lineItems = list;
        this.shippingRates = list2;
        this.totalAmount = num;
    }

    public final List<ECELineItem> getLineItems() {
        return this.lineItems;
    }

    public final List<ECEShippingRate> getShippingRates() {
        return this.shippingRates;
    }

    public final Integer getTotalAmount() {
        return this.totalAmount;
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject();
        List<ECELineItem> list = this.lineItems;
        ArrayList arrayList2 = null;
        if (list != null) {
            List<ECELineItem> list2 = list;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ECELineItem) it.next()).toJson());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        jSONObject.putOpt("lineItems", new JSONArray((Collection) arrayList));
        List<ECEShippingRate> list3 = this.shippingRates;
        if (list3 != null) {
            List<ECEShippingRate> list4 = list3;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((ECEShippingRate) it2.next()).toJson());
            }
            arrayList2 = arrayList4;
        }
        jSONObject.putOpt("shippingRates", new JSONArray((Collection) arrayList2));
        jSONObject.putOpt("totalAmount", this.totalAmount);
        return jSONObject;
    }
}
