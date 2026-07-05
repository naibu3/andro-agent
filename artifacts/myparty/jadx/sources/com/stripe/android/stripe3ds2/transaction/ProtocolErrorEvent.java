package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProtocolErrorEvent.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;", "Landroid/os/Parcelable;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "errorMessage", "Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;)V", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getErrorMessage", "()Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ProtocolErrorEvent implements Parcelable {
    public static final Parcelable.Creator<ProtocolErrorEvent> CREATOR = new Creator();
    private final ErrorMessage errorMessage;
    private final SdkTransactionId sdkTransactionId;

    /* compiled from: ProtocolErrorEvent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProtocolErrorEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolErrorEvent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProtocolErrorEvent(parcel.readInt() == 0 ? null : SdkTransactionId.CREATOR.createFromParcel(parcel), ErrorMessage.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolErrorEvent[] newArray(int i) {
            return new ProtocolErrorEvent[i];
        }
    }

    public static /* synthetic */ ProtocolErrorEvent copy$default(ProtocolErrorEvent protocolErrorEvent, SdkTransactionId sdkTransactionId, ErrorMessage errorMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkTransactionId = protocolErrorEvent.sdkTransactionId;
        }
        if ((i & 2) != 0) {
            errorMessage = protocolErrorEvent.errorMessage;
        }
        return protocolErrorEvent.copy(sdkTransactionId, errorMessage);
    }

    /* renamed from: component1, reason: from getter */
    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public final ProtocolErrorEvent copy(SdkTransactionId sdkTransactionId, ErrorMessage errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new ProtocolErrorEvent(sdkTransactionId, errorMessage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolErrorEvent)) {
            return false;
        }
        ProtocolErrorEvent protocolErrorEvent = (ProtocolErrorEvent) other;
        return Intrinsics.areEqual(this.sdkTransactionId, protocolErrorEvent.sdkTransactionId) && Intrinsics.areEqual(this.errorMessage, protocolErrorEvent.errorMessage);
    }

    public int hashCode() {
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        return ((sdkTransactionId == null ? 0 : sdkTransactionId.hashCode()) * 31) + this.errorMessage.hashCode();
    }

    public String toString() {
        return "ProtocolErrorEvent(sdkTransactionId=" + this.sdkTransactionId + ", errorMessage=" + this.errorMessage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sdkTransactionId.writeToParcel(dest, flags);
        }
        this.errorMessage.writeToParcel(dest, flags);
    }

    public ProtocolErrorEvent(SdkTransactionId sdkTransactionId, ErrorMessage errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.sdkTransactionId = sdkTransactionId;
        this.errorMessage = errorMessage;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public final ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }
}
