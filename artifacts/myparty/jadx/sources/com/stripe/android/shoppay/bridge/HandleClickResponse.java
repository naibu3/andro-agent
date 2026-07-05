package com.stripe.android.shoppay.bridge;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HandleClickResponse.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001f\u001a\u00020 H\u0016J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\u0088\u0001\u0010*\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\rHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u00062"}, d2 = {"Lcom/stripe/android/shoppay/bridge/HandleClickResponse;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "lineItems", "", "Lcom/stripe/android/shoppay/bridge/ECELineItem;", "shippingRates", "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;", "billingAddressRequired", "", "emailRequired", "phoneNumberRequired", "shippingAddressRequired", "allowedShippingCountries", "", "businessName", "shopId", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getLineItems", "()Ljava/util/List;", "getShippingRates", "getBillingAddressRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEmailRequired", "getPhoneNumberRequired", "getShippingAddressRequired", "getAllowedShippingCountries", "getBusinessName", "()Ljava/lang/String;", "getShopId", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/shoppay/bridge/HandleClickResponse;", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HandleClickResponse implements JsonSerializer {
    public static final int $stable = 8;
    private final List<String> allowedShippingCountries;
    private final Boolean billingAddressRequired;
    private final String businessName;
    private final Boolean emailRequired;
    private final List<ECELineItem> lineItems;
    private final Boolean phoneNumberRequired;
    private final Boolean shippingAddressRequired;
    private final List<ECEShippingRate> shippingRates;
    private final String shopId;

    public static /* synthetic */ HandleClickResponse copy$default(HandleClickResponse handleClickResponse, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = handleClickResponse.lineItems;
        }
        if ((i & 2) != 0) {
            list2 = handleClickResponse.shippingRates;
        }
        if ((i & 4) != 0) {
            bool = handleClickResponse.billingAddressRequired;
        }
        if ((i & 8) != 0) {
            bool2 = handleClickResponse.emailRequired;
        }
        if ((i & 16) != 0) {
            bool3 = handleClickResponse.phoneNumberRequired;
        }
        if ((i & 32) != 0) {
            bool4 = handleClickResponse.shippingAddressRequired;
        }
        if ((i & 64) != 0) {
            list3 = handleClickResponse.allowedShippingCountries;
        }
        if ((i & 128) != 0) {
            str = handleClickResponse.businessName;
        }
        if ((i & 256) != 0) {
            str2 = handleClickResponse.shopId;
        }
        String str3 = str;
        String str4 = str2;
        Boolean bool5 = bool4;
        List list4 = list3;
        Boolean bool6 = bool3;
        Boolean bool7 = bool;
        return handleClickResponse.copy(list, list2, bool7, bool2, bool6, bool5, list4, str3, str4);
    }

    public final List<ECELineItem> component1() {
        return this.lineItems;
    }

    public final List<ECEShippingRate> component2() {
        return this.shippingRates;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getBillingAddressRequired() {
        return this.billingAddressRequired;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getEmailRequired() {
        return this.emailRequired;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getPhoneNumberRequired() {
        return this.phoneNumberRequired;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getShippingAddressRequired() {
        return this.shippingAddressRequired;
    }

    public final List<String> component7() {
        return this.allowedShippingCountries;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBusinessName() {
        return this.businessName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getShopId() {
        return this.shopId;
    }

    public final HandleClickResponse copy(List<ECELineItem> lineItems, List<ECEShippingRate> shippingRates, Boolean billingAddressRequired, Boolean emailRequired, Boolean phoneNumberRequired, Boolean shippingAddressRequired, List<String> allowedShippingCountries, String businessName, String shopId) {
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        Intrinsics.checkNotNullParameter(shopId, "shopId");
        return new HandleClickResponse(lineItems, shippingRates, billingAddressRequired, emailRequired, phoneNumberRequired, shippingAddressRequired, allowedShippingCountries, businessName, shopId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandleClickResponse)) {
            return false;
        }
        HandleClickResponse handleClickResponse = (HandleClickResponse) other;
        return Intrinsics.areEqual(this.lineItems, handleClickResponse.lineItems) && Intrinsics.areEqual(this.shippingRates, handleClickResponse.shippingRates) && Intrinsics.areEqual(this.billingAddressRequired, handleClickResponse.billingAddressRequired) && Intrinsics.areEqual(this.emailRequired, handleClickResponse.emailRequired) && Intrinsics.areEqual(this.phoneNumberRequired, handleClickResponse.phoneNumberRequired) && Intrinsics.areEqual(this.shippingAddressRequired, handleClickResponse.shippingAddressRequired) && Intrinsics.areEqual(this.allowedShippingCountries, handleClickResponse.allowedShippingCountries) && Intrinsics.areEqual(this.businessName, handleClickResponse.businessName) && Intrinsics.areEqual(this.shopId, handleClickResponse.shopId);
    }

    public int hashCode() {
        List<ECELineItem> list = this.lineItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ECEShippingRate> list2 = this.shippingRates;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.billingAddressRequired;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.emailRequired;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phoneNumberRequired;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.shippingAddressRequired;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list3 = this.allowedShippingCountries;
        return ((((iHashCode6 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.businessName.hashCode()) * 31) + this.shopId.hashCode();
    }

    public String toString() {
        return "HandleClickResponse(lineItems=" + this.lineItems + ", shippingRates=" + this.shippingRates + ", billingAddressRequired=" + this.billingAddressRequired + ", emailRequired=" + this.emailRequired + ", phoneNumberRequired=" + this.phoneNumberRequired + ", shippingAddressRequired=" + this.shippingAddressRequired + ", allowedShippingCountries=" + this.allowedShippingCountries + ", businessName=" + this.businessName + ", shopId=" + this.shopId + ")";
    }

    public HandleClickResponse(List<ECELineItem> list, List<ECEShippingRate> list2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<String> list3, String businessName, String shopId) {
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        Intrinsics.checkNotNullParameter(shopId, "shopId");
        this.lineItems = list;
        this.shippingRates = list2;
        this.billingAddressRequired = bool;
        this.emailRequired = bool2;
        this.phoneNumberRequired = bool3;
        this.shippingAddressRequired = bool4;
        this.allowedShippingCountries = list3;
        this.businessName = businessName;
        this.shopId = shopId;
    }

    public final List<ECELineItem> getLineItems() {
        return this.lineItems;
    }

    public final List<ECEShippingRate> getShippingRates() {
        return this.shippingRates;
    }

    public final Boolean getBillingAddressRequired() {
        return this.billingAddressRequired;
    }

    public final Boolean getEmailRequired() {
        return this.emailRequired;
    }

    public final Boolean getPhoneNumberRequired() {
        return this.phoneNumberRequired;
    }

    public final Boolean getShippingAddressRequired() {
        return this.shippingAddressRequired;
    }

    public final List<String> getAllowedShippingCountries() {
        return this.allowedShippingCountries;
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final String getShopId() {
        return this.shopId;
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject = new JSONObject();
        List<ECELineItem> list = this.lineItems;
        if (list != null) {
            List<ECELineItem> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ECELineItem) it.next()).toJson());
            }
            jSONArray = new JSONArray((Collection) arrayList);
        } else {
            jSONArray = null;
        }
        jSONObject.putOpt("lineItems", jSONArray);
        List<ECEShippingRate> list3 = this.shippingRates;
        if (list3 != null) {
            List<ECEShippingRate> list4 = list3;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ECEShippingRate) it2.next()).toJson());
            }
            jSONArray2 = new JSONArray((Collection) arrayList2);
        } else {
            jSONArray2 = null;
        }
        jSONObject.putOpt("shippingRates", jSONArray2);
        jSONObject.putOpt("billingAddressRequired", this.billingAddressRequired);
        jSONObject.putOpt("emailRequired", this.emailRequired);
        jSONObject.putOpt("phoneNumberRequired", this.phoneNumberRequired);
        jSONObject.putOpt("shippingAddressRequired", this.shippingAddressRequired);
        List<String> list5 = this.allowedShippingCountries;
        jSONObject.putOpt("allowedShippingCountries", list5 != null ? new JSONArray((Collection) list5) : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", this.businessName);
        Unit unit = Unit.INSTANCE;
        jSONObject.put("business", jSONObject2);
        jSONObject.put("shopId", this.shopId);
        return jSONObject;
    }
}
