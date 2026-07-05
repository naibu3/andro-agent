package com.stripe.android.shoppay.bridge;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.shoppay.bridge.JsonSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BridgeResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002\u0007\bR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/shoppay/bridge/BridgeResponse;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "type", "", "getType", "()Ljava/lang/String;", "Data", "Error", "Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;", "Lcom/stripe/android/shoppay/bridge/BridgeResponse$Error;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BridgeResponse<T extends JsonSerializer> extends JsonSerializer {
    String getType();

    /* compiled from: BridgeResponse.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000bHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Lcom/stripe/android/shoppay/bridge/BridgeResponse;", "data", "<init>", "(Lcom/stripe/android/shoppay/bridge/JsonSerializer;)V", "getData", "()Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "type", "", "getType", "()Ljava/lang/String;", "toJson", "Lorg/json/JSONObject;", "component1", "copy", "(Lcom/stripe/android/shoppay/bridge/JsonSerializer;)Lcom/stripe/android/shoppay/bridge/BridgeResponse$Data;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data<T extends JsonSerializer> implements BridgeResponse<T> {
        public static final int $stable = 0;
        private final T data;
        private final String type = "data";

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, JsonSerializer jsonSerializer, int i, Object obj) {
            if ((i & 1) != 0) {
                jsonSerializer = data.data;
            }
            return data.copy(jsonSerializer);
        }

        public final T component1() {
            return this.data;
        }

        public final Data<T> copy(T data) {
            return new Data<>(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.areEqual(this.data, ((Data) other).data);
        }

        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Data(data=" + this.data + ")";
        }

        public Data(T t) {
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }

        @Override // com.stripe.android.shoppay.bridge.BridgeResponse
        public String getType() {
            return this.type;
        }

        @Override // com.stripe.android.shoppay.bridge.JsonSerializer
        public JSONObject toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            T t = this.data;
            jSONObject.put("data", t != null ? t.toJson() : null);
            jSONObject.put("type", getType());
            return jSONObject;
        }
    }

    /* compiled from: BridgeResponse.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/shoppay/bridge/BridgeResponse$Error;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/stripe/android/shoppay/bridge/JsonSerializer;", "Lcom/stripe/android/shoppay/bridge/BridgeResponse;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "type", "getType", "toJson", "Lorg/json/JSONObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error<T extends JsonSerializer> implements BridgeResponse<T> {
        public static final int $stable = 0;
        private final String message;
        private final String type;

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Error<T> copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error<>(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ")";
        }

        public Error(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.type = "error";
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // com.stripe.android.shoppay.bridge.BridgeResponse
        public String getType() {
            return this.type;
        }

        @Override // com.stripe.android.shoppay.bridge.JsonSerializer
        public JSONObject toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", this.message);
            jSONObject.put("type", getType());
            return jSONObject;
        }
    }
}
