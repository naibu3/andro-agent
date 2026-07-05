package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarSessionWithHCaptcha.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/RadarSessionWithHCaptcha;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "passiveCaptchaSiteKey", "passiveCaptchaRqdata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPassiveCaptchaSiteKey", "getPassiveCaptchaRqdata", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RadarSessionWithHCaptcha implements StripeModel {
    private final String id;
    private final String passiveCaptchaRqdata;
    private final String passiveCaptchaSiteKey;
    public static final Parcelable.Creator<RadarSessionWithHCaptcha> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: RadarSessionWithHCaptcha.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RadarSessionWithHCaptcha> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarSessionWithHCaptcha createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RadarSessionWithHCaptcha(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarSessionWithHCaptcha[] newArray(int i) {
            return new RadarSessionWithHCaptcha[i];
        }
    }

    public static /* synthetic */ RadarSessionWithHCaptcha copy$default(RadarSessionWithHCaptcha radarSessionWithHCaptcha, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = radarSessionWithHCaptcha.id;
        }
        if ((i & 2) != 0) {
            str2 = radarSessionWithHCaptcha.passiveCaptchaSiteKey;
        }
        if ((i & 4) != 0) {
            str3 = radarSessionWithHCaptcha.passiveCaptchaRqdata;
        }
        return radarSessionWithHCaptcha.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassiveCaptchaSiteKey() {
        return this.passiveCaptchaSiteKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPassiveCaptchaRqdata() {
        return this.passiveCaptchaRqdata;
    }

    public final RadarSessionWithHCaptcha copy(String id, String passiveCaptchaSiteKey, String passiveCaptchaRqdata) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new RadarSessionWithHCaptcha(id, passiveCaptchaSiteKey, passiveCaptchaRqdata);
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
        if (!(other instanceof RadarSessionWithHCaptcha)) {
            return false;
        }
        RadarSessionWithHCaptcha radarSessionWithHCaptcha = (RadarSessionWithHCaptcha) other;
        return Intrinsics.areEqual(this.id, radarSessionWithHCaptcha.id) && Intrinsics.areEqual(this.passiveCaptchaSiteKey, radarSessionWithHCaptcha.passiveCaptchaSiteKey) && Intrinsics.areEqual(this.passiveCaptchaRqdata, radarSessionWithHCaptcha.passiveCaptchaRqdata);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.passiveCaptchaSiteKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.passiveCaptchaRqdata;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RadarSessionWithHCaptcha(id=" + this.id + ", passiveCaptchaSiteKey=" + this.passiveCaptchaSiteKey + ", passiveCaptchaRqdata=" + this.passiveCaptchaRqdata + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.passiveCaptchaSiteKey);
        dest.writeString(this.passiveCaptchaRqdata);
    }

    public RadarSessionWithHCaptcha(String id, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.passiveCaptchaSiteKey = str;
        this.passiveCaptchaRqdata = str2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPassiveCaptchaSiteKey() {
        return this.passiveCaptchaSiteKey;
    }

    public final String getPassiveCaptchaRqdata() {
        return this.passiveCaptchaRqdata;
    }
}
