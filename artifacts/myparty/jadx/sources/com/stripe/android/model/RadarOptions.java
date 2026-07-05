package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarOptions.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0016J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/RadarOptions;", "Lcom/stripe/android/model/StripeParamsModel;", "hCaptchaToken", "", "<init>", "(Ljava/lang/String;)V", "getHCaptchaToken", "()Ljava/lang/String;", "toParamMap", "", "", "component1", "copy", "describeContents", "", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RadarOptions implements StripeParamsModel {

    @Deprecated
    public static final String PARAM_HCAPTCHA_TOKEN = "hcaptcha_token";
    private final String hCaptchaToken;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RadarOptions> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: RadarOptions.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RadarOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarOptions createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RadarOptions(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarOptions[] newArray(int i) {
            return new RadarOptions[i];
        }
    }

    public static /* synthetic */ RadarOptions copy$default(RadarOptions radarOptions, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = radarOptions.hCaptchaToken;
        }
        return radarOptions.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHCaptchaToken() {
        return this.hCaptchaToken;
    }

    public final RadarOptions copy(String hCaptchaToken) {
        Intrinsics.checkNotNullParameter(hCaptchaToken, "hCaptchaToken");
        return new RadarOptions(hCaptchaToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RadarOptions) && Intrinsics.areEqual(this.hCaptchaToken, ((RadarOptions) other).hCaptchaToken);
    }

    public int hashCode() {
        return this.hCaptchaToken.hashCode();
    }

    public String toString() {
        return "RadarOptions(hCaptchaToken=" + this.hCaptchaToken + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.hCaptchaToken);
    }

    public RadarOptions(String hCaptchaToken) {
        Intrinsics.checkNotNullParameter(hCaptchaToken, "hCaptchaToken");
        this.hCaptchaToken = hCaptchaToken;
    }

    public final String getHCaptchaToken() {
        return this.hCaptchaToken;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        return MapsKt.mapOf(TuplesKt.to(PARAM_HCAPTCHA_TOKEN, this.hCaptchaToken));
    }

    /* compiled from: RadarOptions.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/RadarOptions$Companion;", "", "<init>", "()V", "PARAM_HCAPTCHA_TOKEN", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
