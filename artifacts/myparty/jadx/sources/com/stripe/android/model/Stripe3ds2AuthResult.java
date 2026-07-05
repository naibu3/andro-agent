package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3ds2AuthResult.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003789Bm\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÂ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0004\b)\u0010*J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u0006:"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "ares", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "created", "", "source", ServerProtocol.DIALOG_PARAM_STATE, "liveMode", "", "error", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "fallbackRedirectUrl", "creq", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAres", "()Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "getCreated", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSource", "getState", "getError", "()Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "getFallbackRedirectUrl", "getCreq", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy$payments_core_release", "(Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Stripe3ds2AuthResult;", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Ares", "MessageExtension", "ThreeDS2Error", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Stripe3ds2AuthResult implements StripeModel {
    private final Ares ares;
    private final Long created;
    private final String creq;
    private final ThreeDS2Error error;
    private final String fallbackRedirectUrl;
    private final String id;
    private final boolean liveMode;
    private final String source;
    private final String state;
    public static final Parcelable.Creator<Stripe3ds2AuthResult> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: Stripe3ds2AuthResult.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Stripe3ds2AuthResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Stripe3ds2AuthResult(parcel.readString(), parcel.readInt() == 0 ? null : Ares.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? ThreeDS2Error.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthResult[] newArray(int i) {
            return new Stripe3ds2AuthResult[i];
        }
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getLiveMode() {
        return this.liveMode;
    }

    public static /* synthetic */ Stripe3ds2AuthResult copy$payments_core_release$default(Stripe3ds2AuthResult stripe3ds2AuthResult, String str, Ares ares, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stripe3ds2AuthResult.id;
        }
        if ((i & 2) != 0) {
            ares = stripe3ds2AuthResult.ares;
        }
        if ((i & 4) != 0) {
            l = stripe3ds2AuthResult.created;
        }
        if ((i & 8) != 0) {
            str2 = stripe3ds2AuthResult.source;
        }
        if ((i & 16) != 0) {
            str3 = stripe3ds2AuthResult.state;
        }
        if ((i & 32) != 0) {
            z = stripe3ds2AuthResult.liveMode;
        }
        if ((i & 64) != 0) {
            threeDS2Error = stripe3ds2AuthResult.error;
        }
        if ((i & 128) != 0) {
            str4 = stripe3ds2AuthResult.fallbackRedirectUrl;
        }
        if ((i & 256) != 0) {
            str5 = stripe3ds2AuthResult.creq;
        }
        String str6 = str4;
        String str7 = str5;
        boolean z2 = z;
        ThreeDS2Error threeDS2Error2 = threeDS2Error;
        String str8 = str3;
        Long l2 = l;
        return stripe3ds2AuthResult.copy$payments_core_release(str, ares, l2, str2, str8, z2, threeDS2Error2, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Ares getAres() {
        return this.ares;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getCreated() {
        return this.created;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component7, reason: from getter */
    public final ThreeDS2Error getError() {
        return this.error;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFallbackRedirectUrl() {
        return this.fallbackRedirectUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCreq() {
        return this.creq;
    }

    public final Stripe3ds2AuthResult copy$payments_core_release(String id, Ares ares, Long created, String source, String state, boolean liveMode, ThreeDS2Error error, String fallbackRedirectUrl, String creq) {
        return new Stripe3ds2AuthResult(id, ares, created, source, state, liveMode, error, fallbackRedirectUrl, creq);
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
        if (!(other instanceof Stripe3ds2AuthResult)) {
            return false;
        }
        Stripe3ds2AuthResult stripe3ds2AuthResult = (Stripe3ds2AuthResult) other;
        return Intrinsics.areEqual(this.id, stripe3ds2AuthResult.id) && Intrinsics.areEqual(this.ares, stripe3ds2AuthResult.ares) && Intrinsics.areEqual(this.created, stripe3ds2AuthResult.created) && Intrinsics.areEqual(this.source, stripe3ds2AuthResult.source) && Intrinsics.areEqual(this.state, stripe3ds2AuthResult.state) && this.liveMode == stripe3ds2AuthResult.liveMode && Intrinsics.areEqual(this.error, stripe3ds2AuthResult.error) && Intrinsics.areEqual(this.fallbackRedirectUrl, stripe3ds2AuthResult.fallbackRedirectUrl) && Intrinsics.areEqual(this.creq, stripe3ds2AuthResult.creq);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Ares ares = this.ares;
        int iHashCode2 = (iHashCode + (ares == null ? 0 : ares.hashCode())) * 31;
        Long l = this.created;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.liveMode)) * 31;
        ThreeDS2Error threeDS2Error = this.error;
        int iHashCode6 = (iHashCode5 + (threeDS2Error == null ? 0 : threeDS2Error.hashCode())) * 31;
        String str4 = this.fallbackRedirectUrl;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.creq;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "Stripe3ds2AuthResult(id=" + this.id + ", ares=" + this.ares + ", created=" + this.created + ", source=" + this.source + ", state=" + this.state + ", liveMode=" + this.liveMode + ", error=" + this.error + ", fallbackRedirectUrl=" + this.fallbackRedirectUrl + ", creq=" + this.creq + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        Ares ares = this.ares;
        if (ares == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ares.writeToParcel(dest, flags);
        }
        Long l = this.created;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        dest.writeString(this.source);
        dest.writeString(this.state);
        dest.writeInt(this.liveMode ? 1 : 0);
        ThreeDS2Error threeDS2Error = this.error;
        if (threeDS2Error == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            threeDS2Error.writeToParcel(dest, flags);
        }
        dest.writeString(this.fallbackRedirectUrl);
        dest.writeString(this.creq);
    }

    public Stripe3ds2AuthResult(String str, Ares ares, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5) {
        this.id = str;
        this.ares = ares;
        this.created = l;
        this.source = str2;
        this.state = str3;
        this.liveMode = z;
        this.error = threeDS2Error;
        this.fallbackRedirectUrl = str4;
        this.creq = str5;
    }

    public /* synthetic */ Stripe3ds2AuthResult(String str, Ares ares, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : ares, l, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : threeDS2Error, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5);
    }

    public final String getId() {
        return this.id;
    }

    public final Ares getAres() {
        return this.ares;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getState() {
        return this.state;
    }

    public final ThreeDS2Error getError() {
        return this.error;
    }

    public final String getFallbackRedirectUrl() {
        return this.fallbackRedirectUrl;
    }

    public final String getCreq() {
        return this.creq;
    }

    /* compiled from: Stripe3ds2AuthResult.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017B\u0093\u0001\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÂ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÂ\u0003J¤\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b*J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019¨\u00068"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "Lcom/stripe/android/core/model/StripeModel;", "threeDSServerTransId", "", "acsChallengeMandated", "acsSignedContent", "acsTransId", "acsUrl", "authenticationType", "cardholderInfo", "messageExtension", "", "Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", ChallengeRequestData.FIELD_MESSAGE_TYPE, ChallengeRequestData.FIELD_MESSAGE_VERSION, "sdkTransId", "transStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getThreeDSServerTransId$payments_core_release", "()Ljava/lang/String;", "getAcsSignedContent$payments_core_release", "getAcsTransId$payments_core_release", "isChallenge", "", "()Z", "component1", "component1$payments_core_release", "component2", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "copy$payments_core_release", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Ares implements StripeModel {
        public static final String VALUE_CHALLENGE = "C";
        private final String acsChallengeMandated;
        private final String acsSignedContent;
        private final String acsTransId;
        private final String acsUrl;
        private final String authenticationType;
        private final String cardholderInfo;
        private final List<MessageExtension> messageExtension;
        private final String messageType;
        private final String messageVersion;
        private final String sdkTransId;
        private final String threeDSServerTransId;
        private final String transStatus;
        public static final Parcelable.Creator<Ares> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: Stripe3ds2AuthResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Ares> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ares createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new Ares(string, string2, string3, string4, string5, string6, string7, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ares[] newArray(int i) {
                return new Ares[i];
            }
        }

        /* renamed from: component10, reason: from getter */
        private final String getMessageVersion() {
            return this.messageVersion;
        }

        /* renamed from: component11, reason: from getter */
        private final String getSdkTransId() {
            return this.sdkTransId;
        }

        /* renamed from: component12, reason: from getter */
        private final String getTransStatus() {
            return this.transStatus;
        }

        /* renamed from: component2, reason: from getter */
        private final String getAcsChallengeMandated() {
            return this.acsChallengeMandated;
        }

        /* renamed from: component5, reason: from getter */
        private final String getAcsUrl() {
            return this.acsUrl;
        }

        /* renamed from: component6, reason: from getter */
        private final String getAuthenticationType() {
            return this.authenticationType;
        }

        /* renamed from: component7, reason: from getter */
        private final String getCardholderInfo() {
            return this.cardholderInfo;
        }

        private final List<MessageExtension> component8() {
            return this.messageExtension;
        }

        /* renamed from: component9, reason: from getter */
        private final String getMessageType() {
            return this.messageType;
        }

        public static /* synthetic */ Ares copy$payments_core_release$default(Ares ares, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ares.threeDSServerTransId;
            }
            if ((i & 2) != 0) {
                str2 = ares.acsChallengeMandated;
            }
            if ((i & 4) != 0) {
                str3 = ares.acsSignedContent;
            }
            if ((i & 8) != 0) {
                str4 = ares.acsTransId;
            }
            if ((i & 16) != 0) {
                str5 = ares.acsUrl;
            }
            if ((i & 32) != 0) {
                str6 = ares.authenticationType;
            }
            if ((i & 64) != 0) {
                str7 = ares.cardholderInfo;
            }
            if ((i & 128) != 0) {
                list = ares.messageExtension;
            }
            if ((i & 256) != 0) {
                str8 = ares.messageType;
            }
            if ((i & 512) != 0) {
                str9 = ares.messageVersion;
            }
            if ((i & 1024) != 0) {
                str10 = ares.sdkTransId;
            }
            if ((i & 2048) != 0) {
                str11 = ares.transStatus;
            }
            String str12 = str10;
            String str13 = str11;
            String str14 = str8;
            String str15 = str9;
            String str16 = str7;
            List list2 = list;
            String str17 = str5;
            String str18 = str6;
            return ares.copy$payments_core_release(str, str2, str3, str4, str17, str18, str16, list2, str14, str15, str12, str13);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final String getThreeDSServerTransId() {
            return this.threeDSServerTransId;
        }

        /* renamed from: component3$payments_core_release, reason: from getter */
        public final String getAcsSignedContent() {
            return this.acsSignedContent;
        }

        /* renamed from: component4$payments_core_release, reason: from getter */
        public final String getAcsTransId() {
            return this.acsTransId;
        }

        public final Ares copy$payments_core_release(String threeDSServerTransId, String acsChallengeMandated, String acsSignedContent, String acsTransId, String acsUrl, String authenticationType, String cardholderInfo, List<MessageExtension> messageExtension, String messageType, String messageVersion, String sdkTransId, String transStatus) {
            return new Ares(threeDSServerTransId, acsChallengeMandated, acsSignedContent, acsTransId, acsUrl, authenticationType, cardholderInfo, messageExtension, messageType, messageVersion, sdkTransId, transStatus);
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
            if (!(other instanceof Ares)) {
                return false;
            }
            Ares ares = (Ares) other;
            return Intrinsics.areEqual(this.threeDSServerTransId, ares.threeDSServerTransId) && Intrinsics.areEqual(this.acsChallengeMandated, ares.acsChallengeMandated) && Intrinsics.areEqual(this.acsSignedContent, ares.acsSignedContent) && Intrinsics.areEqual(this.acsTransId, ares.acsTransId) && Intrinsics.areEqual(this.acsUrl, ares.acsUrl) && Intrinsics.areEqual(this.authenticationType, ares.authenticationType) && Intrinsics.areEqual(this.cardholderInfo, ares.cardholderInfo) && Intrinsics.areEqual(this.messageExtension, ares.messageExtension) && Intrinsics.areEqual(this.messageType, ares.messageType) && Intrinsics.areEqual(this.messageVersion, ares.messageVersion) && Intrinsics.areEqual(this.sdkTransId, ares.sdkTransId) && Intrinsics.areEqual(this.transStatus, ares.transStatus);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.threeDSServerTransId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsChallengeMandated;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.acsSignedContent;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.acsTransId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.acsUrl;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.authenticationType;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cardholderInfo;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List<MessageExtension> list = this.messageExtension;
            int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            String str8 = this.messageType;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageVersion;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.sdkTransId;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.transStatus;
            return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
        }

        public String toString() {
            return "Ares(threeDSServerTransId=" + this.threeDSServerTransId + ", acsChallengeMandated=" + this.acsChallengeMandated + ", acsSignedContent=" + this.acsSignedContent + ", acsTransId=" + this.acsTransId + ", acsUrl=" + this.acsUrl + ", authenticationType=" + this.authenticationType + ", cardholderInfo=" + this.cardholderInfo + ", messageExtension=" + this.messageExtension + ", messageType=" + this.messageType + ", messageVersion=" + this.messageVersion + ", sdkTransId=" + this.sdkTransId + ", transStatus=" + this.transStatus + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.threeDSServerTransId);
            dest.writeString(this.acsChallengeMandated);
            dest.writeString(this.acsSignedContent);
            dest.writeString(this.acsTransId);
            dest.writeString(this.acsUrl);
            dest.writeString(this.authenticationType);
            dest.writeString(this.cardholderInfo);
            List<MessageExtension> list = this.messageExtension;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<MessageExtension> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.messageType);
            dest.writeString(this.messageVersion);
            dest.writeString(this.sdkTransId);
            dest.writeString(this.transStatus);
        }

        public Ares(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<MessageExtension> list, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsChallengeMandated = str2;
            this.acsSignedContent = str3;
            this.acsTransId = str4;
            this.acsUrl = str5;
            this.authenticationType = str6;
            this.cardholderInfo = str7;
            this.messageExtension = list;
            this.messageType = str8;
            this.messageVersion = str9;
            this.sdkTransId = str10;
            this.transStatus = str11;
        }

        public /* synthetic */ Ares(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : list, str8, str9, str10, (i & 2048) != 0 ? null : str11);
        }

        public final String getThreeDSServerTransId$payments_core_release() {
            return this.threeDSServerTransId;
        }

        public final String getAcsSignedContent$payments_core_release() {
            return this.acsSignedContent;
        }

        public final String getAcsTransId$payments_core_release() {
            return this.acsTransId;
        }

        public final boolean isChallenge() {
            return Intrinsics.areEqual(VALUE_CHALLENGE, this.transStatus);
        }
    }

    /* compiled from: Stripe3ds2AuthResult.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÂ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JH\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÀ\u0001¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "Lcom/stripe/android/core/model/StripeModel;", "name", "", com.stripe.android.stripe3ds2.transactions.MessageExtension.FIELD_CRITICALITY_INDICATOR, "", "id", "data", "", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getId", "getData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "copy$payments_core_release", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageExtension implements StripeModel {
        private final boolean criticalityIndicator;
        private final Map<String, String> data;
        private final String id;
        private final String name;
        public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: Stripe3ds2AuthResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MessageExtension> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessageExtension createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new MessageExtension(string, z, string2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessageExtension[] newArray(int i) {
                return new MessageExtension[i];
            }
        }

        /* renamed from: component2, reason: from getter */
        private final boolean getCriticalityIndicator() {
            return this.criticalityIndicator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessageExtension copy$payments_core_release$default(MessageExtension messageExtension, String str, boolean z, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageExtension.name;
            }
            if ((i & 2) != 0) {
                z = messageExtension.criticalityIndicator;
            }
            if ((i & 4) != 0) {
                str2 = messageExtension.id;
            }
            if ((i & 8) != 0) {
                map = messageExtension.data;
            }
            return messageExtension.copy$payments_core_release(str, z, str2, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Map<String, String> component4() {
            return this.data;
        }

        public final MessageExtension copy$payments_core_release(String name, boolean criticalityIndicator, String id, Map<String, String> data) {
            return new MessageExtension(name, criticalityIndicator, id, data);
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
            if (!(other instanceof MessageExtension)) {
                return false;
            }
            MessageExtension messageExtension = (MessageExtension) other;
            return Intrinsics.areEqual(this.name, messageExtension.name) && this.criticalityIndicator == messageExtension.criticalityIndicator && Intrinsics.areEqual(this.id, messageExtension.id) && Intrinsics.areEqual(this.data, messageExtension.data);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.name;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.criticalityIndicator)) * 31;
            String str2 = this.id;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, String> map = this.data;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "MessageExtension(name=" + this.name + ", criticalityIndicator=" + this.criticalityIndicator + ", id=" + this.id + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeInt(this.criticalityIndicator ? 1 : 0);
            dest.writeString(this.id);
            Map<String, String> map = this.data;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }

        public MessageExtension(String str, boolean z, String str2, Map<String, String> map) {
            this.name = str;
            this.criticalityIndicator = z;
            this.id = str2;
            this.data = map;
        }

        public final String getName() {
            return this.name;
        }

        public final String getId() {
            return this.id;
        }

        public final Map<String, String> getData() {
            return this.data;
        }
    }

    /* compiled from: Stripe3ds2AuthResult.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b(J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00066"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "Lcom/stripe/android/core/model/StripeModel;", "threeDSServerTransId", "", "acsTransId", "dsTransId", "errorCode", "errorComponent", "errorDescription", "errorDetail", "errorMessageType", ChallengeRequestData.FIELD_MESSAGE_TYPE, ChallengeRequestData.FIELD_MESSAGE_VERSION, "sdkTransId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getThreeDSServerTransId", "()Ljava/lang/String;", "getAcsTransId", "getDsTransId", "getErrorCode", "getErrorComponent", "getErrorDescription", "getErrorDetail", "getErrorMessageType", "getMessageType", "getMessageVersion", "getSdkTransId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ThreeDS2Error implements StripeModel {
        private final String acsTransId;
        private final String dsTransId;
        private final String errorCode;
        private final String errorComponent;
        private final String errorDescription;
        private final String errorDetail;
        private final String errorMessageType;
        private final String messageType;
        private final String messageVersion;
        private final String sdkTransId;
        private final String threeDSServerTransId;
        public static final Parcelable.Creator<ThreeDS2Error> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: Stripe3ds2AuthResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ThreeDS2Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ThreeDS2Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThreeDS2Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ThreeDS2Error[] newArray(int i) {
                return new ThreeDS2Error[i];
            }
        }

        public static /* synthetic */ ThreeDS2Error copy$payments_core_release$default(ThreeDS2Error threeDS2Error, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
            if ((i & 1) != 0) {
                str = threeDS2Error.threeDSServerTransId;
            }
            if ((i & 2) != 0) {
                str2 = threeDS2Error.acsTransId;
            }
            if ((i & 4) != 0) {
                str3 = threeDS2Error.dsTransId;
            }
            if ((i & 8) != 0) {
                str4 = threeDS2Error.errorCode;
            }
            if ((i & 16) != 0) {
                str5 = threeDS2Error.errorComponent;
            }
            if ((i & 32) != 0) {
                str6 = threeDS2Error.errorDescription;
            }
            if ((i & 64) != 0) {
                str7 = threeDS2Error.errorDetail;
            }
            if ((i & 128) != 0) {
                str8 = threeDS2Error.errorMessageType;
            }
            if ((i & 256) != 0) {
                str9 = threeDS2Error.messageType;
            }
            if ((i & 512) != 0) {
                str10 = threeDS2Error.messageVersion;
            }
            if ((i & 1024) != 0) {
                str11 = threeDS2Error.sdkTransId;
            }
            String str12 = str10;
            String str13 = str11;
            String str14 = str8;
            String str15 = str9;
            String str16 = str6;
            String str17 = str7;
            String str18 = str5;
            String str19 = str3;
            return threeDS2Error.copy$payments_core_release(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
        }

        /* renamed from: component1, reason: from getter */
        public final String getThreeDSServerTransId() {
            return this.threeDSServerTransId;
        }

        /* renamed from: component10, reason: from getter */
        public final String getMessageVersion() {
            return this.messageVersion;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSdkTransId() {
            return this.sdkTransId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAcsTransId() {
            return this.acsTransId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDsTransId() {
            return this.dsTransId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component5, reason: from getter */
        public final String getErrorComponent() {
            return this.errorComponent;
        }

        /* renamed from: component6, reason: from getter */
        public final String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component7, reason: from getter */
        public final String getErrorDetail() {
            return this.errorDetail;
        }

        /* renamed from: component8, reason: from getter */
        public final String getErrorMessageType() {
            return this.errorMessageType;
        }

        /* renamed from: component9, reason: from getter */
        public final String getMessageType() {
            return this.messageType;
        }

        public final ThreeDS2Error copy$payments_core_release(String threeDSServerTransId, String acsTransId, String dsTransId, String errorCode, String errorComponent, String errorDescription, String errorDetail, String errorMessageType, String messageType, String messageVersion, String sdkTransId) {
            return new ThreeDS2Error(threeDSServerTransId, acsTransId, dsTransId, errorCode, errorComponent, errorDescription, errorDetail, errorMessageType, messageType, messageVersion, sdkTransId);
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
            if (!(other instanceof ThreeDS2Error)) {
                return false;
            }
            ThreeDS2Error threeDS2Error = (ThreeDS2Error) other;
            return Intrinsics.areEqual(this.threeDSServerTransId, threeDS2Error.threeDSServerTransId) && Intrinsics.areEqual(this.acsTransId, threeDS2Error.acsTransId) && Intrinsics.areEqual(this.dsTransId, threeDS2Error.dsTransId) && Intrinsics.areEqual(this.errorCode, threeDS2Error.errorCode) && Intrinsics.areEqual(this.errorComponent, threeDS2Error.errorComponent) && Intrinsics.areEqual(this.errorDescription, threeDS2Error.errorDescription) && Intrinsics.areEqual(this.errorDetail, threeDS2Error.errorDetail) && Intrinsics.areEqual(this.errorMessageType, threeDS2Error.errorMessageType) && Intrinsics.areEqual(this.messageType, threeDS2Error.messageType) && Intrinsics.areEqual(this.messageVersion, threeDS2Error.messageVersion) && Intrinsics.areEqual(this.sdkTransId, threeDS2Error.sdkTransId);
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.threeDSServerTransId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsTransId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dsTransId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.errorCode;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.errorComponent;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.errorDescription;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.errorDetail;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.errorMessageType;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageType;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.messageVersion;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.sdkTransId;
            return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
        }

        public String toString() {
            return "ThreeDS2Error(threeDSServerTransId=" + this.threeDSServerTransId + ", acsTransId=" + this.acsTransId + ", dsTransId=" + this.dsTransId + ", errorCode=" + this.errorCode + ", errorComponent=" + this.errorComponent + ", errorDescription=" + this.errorDescription + ", errorDetail=" + this.errorDetail + ", errorMessageType=" + this.errorMessageType + ", messageType=" + this.messageType + ", messageVersion=" + this.messageVersion + ", sdkTransId=" + this.sdkTransId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.threeDSServerTransId);
            dest.writeString(this.acsTransId);
            dest.writeString(this.dsTransId);
            dest.writeString(this.errorCode);
            dest.writeString(this.errorComponent);
            dest.writeString(this.errorDescription);
            dest.writeString(this.errorDetail);
            dest.writeString(this.errorMessageType);
            dest.writeString(this.messageType);
            dest.writeString(this.messageVersion);
            dest.writeString(this.sdkTransId);
        }

        public ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsTransId = str2;
            this.dsTransId = str3;
            this.errorCode = str4;
            this.errorComponent = str5;
            this.errorDescription = str6;
            this.errorDetail = str7;
            this.errorMessageType = str8;
            this.messageType = str9;
            this.messageVersion = str10;
            this.sdkTransId = str11;
        }

        public /* synthetic */ ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, str8, str9, str10, str11);
        }

        public final String getThreeDSServerTransId() {
            return this.threeDSServerTransId;
        }

        public final String getAcsTransId() {
            return this.acsTransId;
        }

        public final String getDsTransId() {
            return this.dsTransId;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorComponent() {
            return this.errorComponent;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final String getErrorDetail() {
            return this.errorDetail;
        }

        public final String getErrorMessageType() {
            return this.errorMessageType;
        }

        public final String getMessageType() {
            return this.messageType;
        }

        public final String getMessageVersion() {
            return this.messageVersion;
        }

        public final String getSdkTransId() {
            return this.sdkTransId;
        }
    }
}
