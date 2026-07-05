package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Stripe3ds2AuthParams.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\t\u0010\u0019\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÂ\u0003J\t\u0010 \u001a\u00020\fHÂ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÂ\u0003Je\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010#\u001a\u00020\fJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010'\u001a\u00020\fHÖ\u0001J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006/"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "sourceId", "", "sdkAppId", Stripe3ds2AuthParams.FIELD_SDK_REFERENCE_NUMBER, "sdkTransactionId", "deviceData", "sdkEphemeralPublicKey", "messageVersion", "maxTimeout", "", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toParamMap", "", "", "appParams", "Lorg/json/JSONObject;", "getAppParams$payments_core_release", "()Lorg/json/JSONObject;", Stripe3ds2AuthParams.FIELD_DEVICE_RENDER_OPTIONS, "getDeviceRenderOptions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Stripe3ds2AuthParams implements StripeParamsModel, Parcelable {
    public static final String FIELD_APP = "app";
    private static final String FIELD_DEVICE_RENDER_OPTIONS = "deviceRenderOptions";
    public static final String FIELD_FALLBACK_RETURN_URL = "fallback_return_url";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_SDK_APP_ID = "sdkAppID";
    private static final String FIELD_SDK_ENC_DATA = "sdkEncData";
    private static final String FIELD_SDK_EPHEM_PUB_KEY = "sdkEphemPubKey";
    private static final String FIELD_SDK_INTERFACE = "sdkInterface";
    private static final String FIELD_SDK_MAX_TIMEOUT = "sdkMaxTimeout";
    private static final String FIELD_SDK_REFERENCE_NUMBER = "sdkReferenceNumber";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String FIELD_SDK_UI_TYPE = "sdkUiType";
    public static final String FIELD_SOURCE = "source";
    private final String deviceData;
    private final int maxTimeout;
    private final String messageVersion;
    private final String returnUrl;
    private final String sdkAppId;
    private final String sdkEphemeralPublicKey;
    private final String sdkReferenceNumber;
    private final String sdkTransactionId;
    private final String sourceId;
    public static final Parcelable.Creator<Stripe3ds2AuthParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: Stripe3ds2AuthParams.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Stripe3ds2AuthParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Stripe3ds2AuthParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthParams[] newArray(int i) {
            return new Stripe3ds2AuthParams[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component2, reason: from getter */
    private final String getSdkAppId() {
        return this.sdkAppId;
    }

    /* renamed from: component3, reason: from getter */
    private final String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    /* renamed from: component4, reason: from getter */
    private final String getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    /* renamed from: component5, reason: from getter */
    private final String getDeviceData() {
        return this.deviceData;
    }

    /* renamed from: component6, reason: from getter */
    private final String getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    /* renamed from: component7, reason: from getter */
    private final String getMessageVersion() {
        return this.messageVersion;
    }

    /* renamed from: component8, reason: from getter */
    private final int getMaxTimeout() {
        return this.maxTimeout;
    }

    /* renamed from: component9, reason: from getter */
    private final String getReturnUrl() {
        return this.returnUrl;
    }

    public static /* synthetic */ Stripe3ds2AuthParams copy$default(Stripe3ds2AuthParams stripe3ds2AuthParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stripe3ds2AuthParams.sourceId;
        }
        if ((i2 & 2) != 0) {
            str2 = stripe3ds2AuthParams.sdkAppId;
        }
        if ((i2 & 4) != 0) {
            str3 = stripe3ds2AuthParams.sdkReferenceNumber;
        }
        if ((i2 & 8) != 0) {
            str4 = stripe3ds2AuthParams.sdkTransactionId;
        }
        if ((i2 & 16) != 0) {
            str5 = stripe3ds2AuthParams.deviceData;
        }
        if ((i2 & 32) != 0) {
            str6 = stripe3ds2AuthParams.sdkEphemeralPublicKey;
        }
        if ((i2 & 64) != 0) {
            str7 = stripe3ds2AuthParams.messageVersion;
        }
        if ((i2 & 128) != 0) {
            i = stripe3ds2AuthParams.maxTimeout;
        }
        if ((i2 & 256) != 0) {
            str8 = stripe3ds2AuthParams.returnUrl;
        }
        int i3 = i;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return stripe3ds2AuthParams.copy(str, str2, str13, str4, str12, str10, str11, i3, str9);
    }

    public final Stripe3ds2AuthParams copy(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int maxTimeout, String returnUrl) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sdkAppId, "sdkAppId");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        return new Stripe3ds2AuthParams(sourceId, sdkAppId, sdkReferenceNumber, sdkTransactionId, deviceData, sdkEphemeralPublicKey, messageVersion, maxTimeout, returnUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stripe3ds2AuthParams)) {
            return false;
        }
        Stripe3ds2AuthParams stripe3ds2AuthParams = (Stripe3ds2AuthParams) other;
        return Intrinsics.areEqual(this.sourceId, stripe3ds2AuthParams.sourceId) && Intrinsics.areEqual(this.sdkAppId, stripe3ds2AuthParams.sdkAppId) && Intrinsics.areEqual(this.sdkReferenceNumber, stripe3ds2AuthParams.sdkReferenceNumber) && Intrinsics.areEqual(this.sdkTransactionId, stripe3ds2AuthParams.sdkTransactionId) && Intrinsics.areEqual(this.deviceData, stripe3ds2AuthParams.deviceData) && Intrinsics.areEqual(this.sdkEphemeralPublicKey, stripe3ds2AuthParams.sdkEphemeralPublicKey) && Intrinsics.areEqual(this.messageVersion, stripe3ds2AuthParams.messageVersion) && this.maxTimeout == stripe3ds2AuthParams.maxTimeout && Intrinsics.areEqual(this.returnUrl, stripe3ds2AuthParams.returnUrl);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.sourceId.hashCode() * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkTransactionId.hashCode()) * 31) + this.deviceData.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode()) * 31) + Integer.hashCode(this.maxTimeout)) * 31;
        String str = this.returnUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Stripe3ds2AuthParams(sourceId=" + this.sourceId + ", sdkAppId=" + this.sdkAppId + ", sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkTransactionId=" + this.sdkTransactionId + ", deviceData=" + this.deviceData + ", sdkEphemeralPublicKey=" + this.sdkEphemeralPublicKey + ", messageVersion=" + this.messageVersion + ", maxTimeout=" + this.maxTimeout + ", returnUrl=" + this.returnUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sourceId);
        dest.writeString(this.sdkAppId);
        dest.writeString(this.sdkReferenceNumber);
        dest.writeString(this.sdkTransactionId);
        dest.writeString(this.deviceData);
        dest.writeString(this.sdkEphemeralPublicKey);
        dest.writeString(this.messageVersion);
        dest.writeInt(this.maxTimeout);
        dest.writeString(this.returnUrl);
    }

    public Stripe3ds2AuthParams(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i, String str) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sdkAppId, "sdkAppId");
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        Intrinsics.checkNotNullParameter(messageVersion, "messageVersion");
        this.sourceId = sourceId;
        this.sdkAppId = sdkAppId;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkTransactionId = sdkTransactionId;
        this.deviceData = deviceData;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.messageVersion = messageVersion;
        this.maxTimeout = i;
        this.returnUrl = str;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("source", this.sourceId), TuplesKt.to(FIELD_APP, getAppParams$payments_core_release().toString()));
        String str = this.returnUrl;
        Map mapMapOf2 = str != null ? MapsKt.mapOf(TuplesKt.to(FIELD_FALLBACK_RETURN_URL, str)) : null;
        if (mapMapOf2 == null) {
            mapMapOf2 = MapsKt.emptyMap();
        }
        return MapsKt.plus(mapMapOf, mapMapOf2);
    }

    public final /* synthetic */ JSONObject getAppParams$payments_core_release() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Stripe3ds2AuthParams stripe3ds2AuthParams = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new JSONObject().put(FIELD_SDK_APP_ID, this.sdkAppId).put("sdkTransID", this.sdkTransactionId).put(FIELD_SDK_ENC_DATA, this.deviceData).put("sdkEphemPubKey", new JSONObject(this.sdkEphemeralPublicKey)).put(FIELD_SDK_MAX_TIMEOUT, StringsKt.padStart(String.valueOf(this.maxTimeout), 2, '0')).put(FIELD_SDK_REFERENCE_NUMBER, this.sdkReferenceNumber).put("messageVersion", this.messageVersion).put(FIELD_DEVICE_RENDER_OPTIONS, getDeviceRenderOptions()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = jSONObject;
        }
        return (JSONObject) objM9118constructorimpl;
    }

    private final JSONObject getDeviceRenderOptions() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Stripe3ds2AuthParams stripe3ds2AuthParams = this;
            objM9118constructorimpl = Result.m9118constructorimpl(new JSONObject().put(FIELD_SDK_INTERFACE, "03").put(FIELD_SDK_UI_TYPE, new JSONArray((Collection) CollectionsKt.listOf((Object[]) new String[]{"01", "02", "03", "04", "05"}))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = jSONObject;
        }
        return (JSONObject) objM9118constructorimpl;
    }
}
