package com.stripe.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeFileParams.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/core/model/StripeFileParams;", "", "file", "Ljava/io/File;", "purpose", "Lcom/stripe/android/core/model/StripeFilePurpose;", "<init>", "(Ljava/io/File;Lcom/stripe/android/core/model/StripeFilePurpose;)V", "getFile$stripe_core_release", "()Ljava/io/File;", "getPurpose$stripe_core_release", "()Lcom/stripe/android/core/model/StripeFilePurpose;", "fileLink", "Lcom/stripe/android/core/model/StripeFileParams$FileLink;", "getFileLink$stripe_core_release", "()Lcom/stripe/android/core/model/StripeFileParams$FileLink;", "component1", "component1$stripe_core_release", "component2", "component2$stripe_core_release", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "FileLink", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StripeFileParams {
    private final File file;
    private final FileLink fileLink;
    private final StripeFilePurpose purpose;

    public static /* synthetic */ StripeFileParams copy$default(StripeFileParams stripeFileParams, File file, StripeFilePurpose stripeFilePurpose, int i, Object obj) {
        if ((i & 1) != 0) {
            file = stripeFileParams.file;
        }
        if ((i & 2) != 0) {
            stripeFilePurpose = stripeFileParams.purpose;
        }
        return stripeFileParams.copy(file, stripeFilePurpose);
    }

    /* renamed from: component1$stripe_core_release, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* renamed from: component2$stripe_core_release, reason: from getter */
    public final StripeFilePurpose getPurpose() {
        return this.purpose;
    }

    public final StripeFileParams copy(File file, StripeFilePurpose purpose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        return new StripeFileParams(file, purpose);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeFileParams)) {
            return false;
        }
        StripeFileParams stripeFileParams = (StripeFileParams) other;
        return Intrinsics.areEqual(this.file, stripeFileParams.file) && this.purpose == stripeFileParams.purpose;
    }

    public int hashCode() {
        return (this.file.hashCode() * 31) + this.purpose.hashCode();
    }

    public String toString() {
        return "StripeFileParams(file=" + this.file + ", purpose=" + this.purpose + ")";
    }

    public StripeFileParams(File file, StripeFilePurpose purpose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.file = file;
        this.purpose = purpose;
    }

    public final File getFile$stripe_core_release() {
        return this.file;
    }

    public final StripeFilePurpose getPurpose$stripe_core_release() {
        return this.purpose;
    }

    /* renamed from: getFileLink$stripe_core_release, reason: from getter */
    public final FileLink getFileLink() {
        return this.fileLink;
    }

    /* compiled from: StripeFileParams.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b\u0017J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/stripe/android/core/model/StripeFileParams$FileLink;", "Landroid/os/Parcelable;", "create", "", "expiresAt", "", "metadata", "", "", "<init>", "(ZLjava/lang/Long;Ljava/util/Map;)V", "getCreate$stripe_core_release", "()Z", "getExpiresAt$stripe_core_release", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMetadata$stripe_core_release", "()Ljava/util/Map;", "component1", "component1$stripe_core_release", "component2", "component2$stripe_core_release", "component3", "component3$stripe_core_release", "copy", "(ZLjava/lang/Long;Ljava/util/Map;)Lcom/stripe/android/core/model/StripeFileParams$FileLink;", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FileLink implements Parcelable {
        public static final Parcelable.Creator<FileLink> CREATOR = new Creator();
        private final boolean create;
        private final Long expiresAt;
        private final Map<String, String> metadata;

        /* compiled from: StripeFileParams.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FileLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FileLink createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                LinkedHashMap linkedHashMap = null;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new FileLink(z, lValueOf, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FileLink[] newArray(int i) {
                return new FileLink[i];
            }
        }

        public FileLink() {
            this(false, null, null, 7, null);
        }

        public FileLink(boolean z) {
            this(z, null, null, 6, null);
        }

        public FileLink(boolean z, Long l) {
            this(z, l, null, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FileLink copy$default(FileLink fileLink, boolean z, Long l, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                z = fileLink.create;
            }
            if ((i & 2) != 0) {
                l = fileLink.expiresAt;
            }
            if ((i & 4) != 0) {
                map = fileLink.metadata;
            }
            return fileLink.copy(z, l, map);
        }

        /* renamed from: component1$stripe_core_release, reason: from getter */
        public final boolean getCreate() {
            return this.create;
        }

        /* renamed from: component2$stripe_core_release, reason: from getter */
        public final Long getExpiresAt() {
            return this.expiresAt;
        }

        public final Map<String, String> component3$stripe_core_release() {
            return this.metadata;
        }

        public final FileLink copy(boolean create, Long expiresAt, Map<String, String> metadata) {
            return new FileLink(create, expiresAt, metadata);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileLink)) {
                return false;
            }
            FileLink fileLink = (FileLink) other;
            return this.create == fileLink.create && Intrinsics.areEqual(this.expiresAt, fileLink.expiresAt) && Intrinsics.areEqual(this.metadata, fileLink.metadata);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.create) * 31;
            Long l = this.expiresAt;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Map<String, String> map = this.metadata;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "FileLink(create=" + this.create + ", expiresAt=" + this.expiresAt + ", metadata=" + this.metadata + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.create ? 1 : 0);
            Long l = this.expiresAt;
            if (l == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l.longValue());
            }
            Map<String, String> map = this.metadata;
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

        public FileLink(boolean z, Long l, Map<String, String> map) {
            this.create = z;
            this.expiresAt = l;
            this.metadata = map;
        }

        public /* synthetic */ FileLink(boolean z, Long l, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : map);
        }

        public final boolean getCreate$stripe_core_release() {
            return this.create;
        }

        public final Long getExpiresAt$stripe_core_release() {
            return this.expiresAt;
        }

        public final Map<String, String> getMetadata$stripe_core_release() {
            return this.metadata;
        }
    }
}
