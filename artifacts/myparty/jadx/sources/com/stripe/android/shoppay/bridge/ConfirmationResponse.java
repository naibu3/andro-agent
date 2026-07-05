package com.stripe.android.shoppay.bridge;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfirmationResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/shoppay/bridge/ConfirmationResponse;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "status", "", "requiresAction", "", "<init>", "(Ljava/lang/String;Z)V", "getStatus", "()Ljava/lang/String;", "getRequiresAction", "()Z", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConfirmationResponse implements JsonSerializer {
    public static final int $stable = 0;
    private final boolean requiresAction;
    private final String status;

    public static /* synthetic */ ConfirmationResponse copy$default(ConfirmationResponse confirmationResponse, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmationResponse.status;
        }
        if ((i & 2) != 0) {
            z = confirmationResponse.requiresAction;
        }
        return confirmationResponse.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequiresAction() {
        return this.requiresAction;
    }

    public final ConfirmationResponse copy(String status, boolean requiresAction) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new ConfirmationResponse(status, requiresAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmationResponse)) {
            return false;
        }
        ConfirmationResponse confirmationResponse = (ConfirmationResponse) other;
        return Intrinsics.areEqual(this.status, confirmationResponse.status) && this.requiresAction == confirmationResponse.requiresAction;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + Boolean.hashCode(this.requiresAction);
    }

    public String toString() {
        return "ConfirmationResponse(status=" + this.status + ", requiresAction=" + this.requiresAction + ")";
    }

    public ConfirmationResponse(String status, boolean z) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.requiresAction = z;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean getRequiresAction() {
        return this.requiresAction;
    }

    @Override // com.stripe.android.shoppay.bridge.JsonSerializer
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", this.status);
        jSONObject.put("requiresAction", this.requiresAction);
        return jSONObject;
    }
}
