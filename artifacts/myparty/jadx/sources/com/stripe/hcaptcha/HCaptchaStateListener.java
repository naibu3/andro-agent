package com.stripe.hcaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.service.NotificationsService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaStateListener.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J$\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J$\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003Jc\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032#\b\u0002\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u00062#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\u0016\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R,\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R,\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006%"}, d2 = {"Lcom/stripe/hcaptcha/HCaptchaStateListener;", "Landroid/os/Parcelable;", "onOpen", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "token", "onFailure", "Lcom/stripe/hcaptcha/HCaptchaException;", NotificationsService.EXCEPTION_KEY, "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnOpen", "()Lkotlin/jvm/functions/Function0;", "getOnSuccess", "()Lkotlin/jvm/functions/Function1;", "getOnFailure", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HCaptchaStateListener implements Parcelable {
    public static final Parcelable.Creator<HCaptchaStateListener> CREATOR = new Creator();
    private final Function1<HCaptchaException, Unit> onFailure;
    private final Function0<Unit> onOpen;
    private final Function1<String, Unit> onSuccess;

    /* compiled from: HCaptchaStateListener.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HCaptchaStateListener> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HCaptchaStateListener createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HCaptchaStateListener((Function0) parcel.readSerializable(), (Function1) parcel.readSerializable(), (Function1) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HCaptchaStateListener[] newArray(int i) {
            return new HCaptchaStateListener[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HCaptchaStateListener copy$default(HCaptchaStateListener hCaptchaStateListener, Function0 function0, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = hCaptchaStateListener.onOpen;
        }
        if ((i & 2) != 0) {
            function1 = hCaptchaStateListener.onSuccess;
        }
        if ((i & 4) != 0) {
            function12 = hCaptchaStateListener.onFailure;
        }
        return hCaptchaStateListener.copy(function0, function1, function12);
    }

    public final Function0<Unit> component1() {
        return this.onOpen;
    }

    public final Function1<String, Unit> component2() {
        return this.onSuccess;
    }

    public final Function1<HCaptchaException, Unit> component3() {
        return this.onFailure;
    }

    public final HCaptchaStateListener copy(Function0<Unit> onOpen, Function1<? super String, Unit> onSuccess, Function1<? super HCaptchaException, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        return new HCaptchaStateListener(onOpen, onSuccess, onFailure);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HCaptchaStateListener)) {
            return false;
        }
        HCaptchaStateListener hCaptchaStateListener = (HCaptchaStateListener) other;
        return Intrinsics.areEqual(this.onOpen, hCaptchaStateListener.onOpen) && Intrinsics.areEqual(this.onSuccess, hCaptchaStateListener.onSuccess) && Intrinsics.areEqual(this.onFailure, hCaptchaStateListener.onFailure);
    }

    public int hashCode() {
        return (((this.onOpen.hashCode() * 31) + this.onSuccess.hashCode()) * 31) + this.onFailure.hashCode();
    }

    public String toString() {
        return "HCaptchaStateListener(onOpen=" + this.onOpen + ", onSuccess=" + this.onSuccess + ", onFailure=" + this.onFailure + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable((Serializable) this.onOpen);
        dest.writeSerializable((Serializable) this.onSuccess);
        dest.writeSerializable((Serializable) this.onFailure);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HCaptchaStateListener(Function0<Unit> onOpen, Function1<? super String, Unit> onSuccess, Function1<? super HCaptchaException, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.onOpen = onOpen;
        this.onSuccess = onSuccess;
        this.onFailure = onFailure;
    }

    public final Function0<Unit> getOnOpen() {
        return this.onOpen;
    }

    public final Function1<String, Unit> getOnSuccess() {
        return this.onSuccess;
    }

    public final Function1<HCaptchaException, Unit> getOnFailure() {
        return this.onFailure;
    }
}
