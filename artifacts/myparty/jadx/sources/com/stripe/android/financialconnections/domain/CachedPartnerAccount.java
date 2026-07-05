package com.stripe.android.financialconnections.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetCachedAccounts.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;", "Landroid/os/Parcelable;", "id", "", "linkedAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLinkedAccountId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CachedPartnerAccount implements Parcelable {
    private final String id;
    private final String linkedAccountId;
    public static final Parcelable.Creator<CachedPartnerAccount> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: GetCachedAccounts.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CachedPartnerAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CachedPartnerAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CachedPartnerAccount(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CachedPartnerAccount[] newArray(int i) {
            return new CachedPartnerAccount[i];
        }
    }

    public static /* synthetic */ CachedPartnerAccount copy$default(CachedPartnerAccount cachedPartnerAccount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cachedPartnerAccount.id;
        }
        if ((i & 2) != 0) {
            str2 = cachedPartnerAccount.linkedAccountId;
        }
        return cachedPartnerAccount.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLinkedAccountId() {
        return this.linkedAccountId;
    }

    public final CachedPartnerAccount copy(String id, String linkedAccountId) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new CachedPartnerAccount(id, linkedAccountId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedPartnerAccount)) {
            return false;
        }
        CachedPartnerAccount cachedPartnerAccount = (CachedPartnerAccount) other;
        return Intrinsics.areEqual(this.id, cachedPartnerAccount.id) && Intrinsics.areEqual(this.linkedAccountId, cachedPartnerAccount.linkedAccountId);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.linkedAccountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CachedPartnerAccount(id=" + this.id + ", linkedAccountId=" + this.linkedAccountId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.linkedAccountId);
    }

    public CachedPartnerAccount(String id, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.linkedAccountId = str;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLinkedAccountId() {
        return this.linkedAccountId;
    }
}
