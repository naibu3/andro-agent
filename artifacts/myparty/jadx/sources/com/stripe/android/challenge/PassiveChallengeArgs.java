package com.stripe.android.challenge;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PassiveCaptchaParams;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassiveChallengeArgs.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/challenge/PassiveChallengeArgs;", "Landroid/os/Parcelable;", "passiveCaptchaParams", "Lcom/stripe/android/model/PassiveCaptchaParams;", "<init>", "(Lcom/stripe/android/model/PassiveCaptchaParams;)V", "getPassiveCaptchaParams", "()Lcom/stripe/android/model/PassiveCaptchaParams;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PassiveChallengeArgs implements Parcelable {
    private final PassiveCaptchaParams passiveCaptchaParams;
    public static final Parcelable.Creator<PassiveChallengeArgs> CREATOR = new Creator();
    public static final int $stable = PassiveCaptchaParams.$stable;

    /* compiled from: PassiveChallengeArgs.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassiveChallengeArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassiveChallengeArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PassiveChallengeArgs((PassiveCaptchaParams) parcel.readParcelable(PassiveChallengeArgs.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassiveChallengeArgs[] newArray(int i) {
            return new PassiveChallengeArgs[i];
        }
    }

    public static /* synthetic */ PassiveChallengeArgs copy$default(PassiveChallengeArgs passiveChallengeArgs, PassiveCaptchaParams passiveCaptchaParams, int i, Object obj) {
        if ((i & 1) != 0) {
            passiveCaptchaParams = passiveChallengeArgs.passiveCaptchaParams;
        }
        return passiveChallengeArgs.copy(passiveCaptchaParams);
    }

    /* renamed from: component1, reason: from getter */
    public final PassiveCaptchaParams getPassiveCaptchaParams() {
        return this.passiveCaptchaParams;
    }

    public final PassiveChallengeArgs copy(PassiveCaptchaParams passiveCaptchaParams) {
        Intrinsics.checkNotNullParameter(passiveCaptchaParams, "passiveCaptchaParams");
        return new PassiveChallengeArgs(passiveCaptchaParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PassiveChallengeArgs) && Intrinsics.areEqual(this.passiveCaptchaParams, ((PassiveChallengeArgs) other).passiveCaptchaParams);
    }

    public int hashCode() {
        return this.passiveCaptchaParams.hashCode();
    }

    public String toString() {
        return "PassiveChallengeArgs(passiveCaptchaParams=" + this.passiveCaptchaParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.passiveCaptchaParams, flags);
    }

    public PassiveChallengeArgs(PassiveCaptchaParams passiveCaptchaParams) {
        Intrinsics.checkNotNullParameter(passiveCaptchaParams, "passiveCaptchaParams");
        this.passiveCaptchaParams = passiveCaptchaParams;
    }

    public final PassiveCaptchaParams getPassiveCaptchaParams() {
        return this.passiveCaptchaParams;
    }
}
