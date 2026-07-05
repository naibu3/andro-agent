package com.stripe.android.link.verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkInlineState.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/link/verification/LinkInlineState;", "Landroid/os/Parcelable;", "verificationState", "Lcom/stripe/android/link/verification/VerificationState;", "<init>", "(Lcom/stripe/android/link/verification/VerificationState;)V", "getVerificationState", "()Lcom/stripe/android/link/verification/VerificationState;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkInlineState implements Parcelable {
    private final VerificationState verificationState;
    public static final Parcelable.Creator<LinkInlineState> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: LinkInlineState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkInlineState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkInlineState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkInlineState((VerificationState) parcel.readParcelable(LinkInlineState.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkInlineState[] newArray(int i) {
            return new LinkInlineState[i];
        }
    }

    public static /* synthetic */ LinkInlineState copy$default(LinkInlineState linkInlineState, VerificationState verificationState, int i, Object obj) {
        if ((i & 1) != 0) {
            verificationState = linkInlineState.verificationState;
        }
        return linkInlineState.copy(verificationState);
    }

    /* renamed from: component1, reason: from getter */
    public final VerificationState getVerificationState() {
        return this.verificationState;
    }

    public final LinkInlineState copy(VerificationState verificationState) {
        Intrinsics.checkNotNullParameter(verificationState, "verificationState");
        return new LinkInlineState(verificationState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LinkInlineState) && Intrinsics.areEqual(this.verificationState, ((LinkInlineState) other).verificationState);
    }

    public int hashCode() {
        return this.verificationState.hashCode();
    }

    public String toString() {
        return "LinkInlineState(verificationState=" + this.verificationState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.verificationState, flags);
    }

    public LinkInlineState(VerificationState verificationState) {
        Intrinsics.checkNotNullParameter(verificationState, "verificationState");
        this.verificationState = verificationState;
    }

    public final VerificationState getVerificationState() {
        return this.verificationState;
    }
}
