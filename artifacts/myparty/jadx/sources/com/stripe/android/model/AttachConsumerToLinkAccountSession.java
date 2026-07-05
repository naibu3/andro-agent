package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttachConsumerToLinkAccountSession.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/AttachConsumerToLinkAccountSession;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "clientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getClientSecret", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AttachConsumerToLinkAccountSession implements StripeModel {
    public static final Parcelable.Creator<AttachConsumerToLinkAccountSession> CREATOR = new Creator();
    private final String clientSecret;
    private final String id;

    /* compiled from: AttachConsumerToLinkAccountSession.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AttachConsumerToLinkAccountSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachConsumerToLinkAccountSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AttachConsumerToLinkAccountSession(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachConsumerToLinkAccountSession[] newArray(int i) {
            return new AttachConsumerToLinkAccountSession[i];
        }
    }

    public static /* synthetic */ AttachConsumerToLinkAccountSession copy$default(AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attachConsumerToLinkAccountSession.id;
        }
        if ((i & 2) != 0) {
            str2 = attachConsumerToLinkAccountSession.clientSecret;
        }
        return attachConsumerToLinkAccountSession.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final AttachConsumerToLinkAccountSession copy(String id, String clientSecret) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        return new AttachConsumerToLinkAccountSession(id, clientSecret);
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
        if (!(other instanceof AttachConsumerToLinkAccountSession)) {
            return false;
        }
        AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession = (AttachConsumerToLinkAccountSession) other;
        return Intrinsics.areEqual(this.id, attachConsumerToLinkAccountSession.id) && Intrinsics.areEqual(this.clientSecret, attachConsumerToLinkAccountSession.clientSecret);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.id.hashCode() * 31) + this.clientSecret.hashCode();
    }

    public String toString() {
        return "AttachConsumerToLinkAccountSession(id=" + this.id + ", clientSecret=" + this.clientSecret + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.clientSecret);
    }

    public AttachConsumerToLinkAccountSession(String id, String clientSecret) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.id = id;
        this.clientSecret = clientSecret;
    }

    public final String getId() {
        return this.id;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }
}
