package com.stripe.android.stripe3ds2.views;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeProgressArgs.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0001$B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0005J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs;", "Landroid/os/Parcelable;", "directoryServerName", "", "accentColor", "", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "getDirectoryServerName", "()Ljava/lang/String;", "getAccentColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "toBundle", "Landroid/os/Bundle;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChallengeProgressArgs implements Parcelable {
    private static final String EXTRA_ARGS = "com.stripe.android.stripe3ds2.views.ChallengeProgressArgs";
    private final Integer accentColor;
    private final String directoryServerName;
    private final SdkTransactionId sdkTransactionId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ChallengeProgressArgs> CREATOR = new Creator();

    /* compiled from: ChallengeProgressArgs.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChallengeProgressArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeProgressArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengeProgressArgs(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), SdkTransactionId.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeProgressArgs[] newArray(int i) {
            return new ChallengeProgressArgs[i];
        }
    }

    public static /* synthetic */ ChallengeProgressArgs copy$default(ChallengeProgressArgs challengeProgressArgs, String str, Integer num, SdkTransactionId sdkTransactionId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeProgressArgs.directoryServerName;
        }
        if ((i & 2) != 0) {
            num = challengeProgressArgs.accentColor;
        }
        if ((i & 4) != 0) {
            sdkTransactionId = challengeProgressArgs.sdkTransactionId;
        }
        return challengeProgressArgs.copy(str, num, sdkTransactionId);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAccentColor() {
        return this.accentColor;
    }

    /* renamed from: component3, reason: from getter */
    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public final ChallengeProgressArgs copy(String directoryServerName, Integer accentColor, SdkTransactionId sdkTransactionId) {
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        return new ChallengeProgressArgs(directoryServerName, accentColor, sdkTransactionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeProgressArgs)) {
            return false;
        }
        ChallengeProgressArgs challengeProgressArgs = (ChallengeProgressArgs) other;
        return Intrinsics.areEqual(this.directoryServerName, challengeProgressArgs.directoryServerName) && Intrinsics.areEqual(this.accentColor, challengeProgressArgs.accentColor) && Intrinsics.areEqual(this.sdkTransactionId, challengeProgressArgs.sdkTransactionId);
    }

    public int hashCode() {
        int iHashCode = this.directoryServerName.hashCode() * 31;
        Integer num = this.accentColor;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.sdkTransactionId.hashCode();
    }

    public String toString() {
        return "ChallengeProgressArgs(directoryServerName=" + this.directoryServerName + ", accentColor=" + this.accentColor + ", sdkTransactionId=" + this.sdkTransactionId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.directoryServerName);
        Integer num = this.accentColor;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        this.sdkTransactionId.writeToParcel(dest, flags);
    }

    public ChallengeProgressArgs(String directoryServerName, Integer num, SdkTransactionId sdkTransactionId) {
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        this.directoryServerName = directoryServerName;
        this.accentColor = num;
        this.sdkTransactionId = sdkTransactionId;
    }

    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public final Bundle toBundle() {
        return BundleKt.bundleOf(TuplesKt.to(EXTRA_ARGS, this));
    }

    /* compiled from: ChallengeProgressArgs.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs$Companion;", "", "<init>", "()V", "EXTRA_ARGS", "", "fromBundle", "Lcom/stripe/android/stripe3ds2/views/ChallengeProgressArgs;", "bundle", "Landroid/os/Bundle;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChallengeProgressArgs fromBundle(Bundle bundle) {
            if (bundle != null) {
                return (ChallengeProgressArgs) BundleCompat.getParcelable(bundle, ChallengeProgressArgs.EXTRA_ARGS, ChallengeProgressArgs.class);
            }
            return null;
        }
    }
}
