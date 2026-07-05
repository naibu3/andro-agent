package com.stripe.android.shoppay.bridge;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ShopPayInitParamsResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "shopId", "", "customerSessionClientSecret", "amountTotal", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getShopId", "()Ljava/lang/String;", "getCustomerSessionClientSecret", "getAmountTotal", "()I", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ShopPayInitParamsResponse implements JsonSerializer {
    public static final int $stable = 0;
    private final int amountTotal;
    private final String customerSessionClientSecret;
    private final String shopId;

    public static /* synthetic */ ShopPayInitParamsResponse copy$default(ShopPayInitParamsResponse shopPayInitParamsResponse, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shopPayInitParamsResponse.shopId;
        }
        if ((i2 & 2) != 0) {
            str2 = shopPayInitParamsResponse.customerSessionClientSecret;
        }
        if ((i2 & 4) != 0) {
            i = shopPayInitParamsResponse.amountTotal;
        }
        return shopPayInitParamsResponse.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getShopId() {
        return this.shopId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAmountTotal() {
        return this.amountTotal;
    }

    public final ShopPayInitParamsResponse copy(String shopId, String customerSessionClientSecret, int amountTotal) {
        Intrinsics.checkNotNullParameter(shopId, "shopId");
        Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
        return new ShopPayInitParamsResponse(shopId, customerSessionClientSecret, amountTotal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopPayInitParamsResponse)) {
            return false;
        }
        ShopPayInitParamsResponse shopPayInitParamsResponse = (ShopPayInitParamsResponse) other;
        return Intrinsics.areEqual(this.shopId, shopPayInitParamsResponse.shopId) && Intrinsics.areEqual(this.customerSessionClientSecret, shopPayInitParamsResponse.customerSessionClientSecret) && this.amountTotal == shopPayInitParamsResponse.amountTotal;
    }

    public int hashCode() {
        return (((this.shopId.hashCode() * 31) + this.customerSessionClientSecret.hashCode()) * 31) + Integer.hashCode(this.amountTotal);
    }

    public String toString() {
        return "ShopPayInitParamsResponse(shopId=" + this.shopId + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", amountTotal=" + this.amountTotal + ")";
    }

    public ShopPayInitParamsResponse(String shopId, String customerSessionClientSecret, int i) {
        Intrinsics.checkNotNullParameter(shopId, "shopId");
        Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
        this.shopId = shopId;
        this.customerSessionClientSecret = customerSessionClientSecret;
        this.amountTotal = i;
    }

    public final String getShopId() {
        return this.shopId;
    }

    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    public final int getAmountTotal() {
        return this.amountTotal;
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("shopId", this.shopId);
        jSONObject.put("customerSessionClientSecret", this.customerSessionClientSecret);
        jSONObject.put("amountTotal", this.amountTotal);
        return jSONObject;
    }
}
