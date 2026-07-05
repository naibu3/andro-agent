package com.reactnativestripesdk.pushprovisioning;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.pushProvisioning.EphemeralKeyUpdateListener;
import com.stripe.android.pushProvisioning.PushProvisioningEphemeralKeyProvider;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EphemeralKeyProvider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;", "Lcom/stripe/android/pushProvisioning/PushProvisioningEphemeralKeyProvider;", "ephemeralKey", "", "<init>", "(Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "describeContents", "", "writeToParcel", "", "dest", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "createEphemeralKey", "apiVersion", "keyUpdateListener", "Lcom/stripe/android/pushProvisioning/EphemeralKeyUpdateListener;", "CREATOR", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EphemeralKeyProvider implements PushProvisioningEphemeralKeyProvider {
    public static final int $stable = 0;

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String ephemeralKey;

    public /* synthetic */ EphemeralKeyProvider(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public EphemeralKeyProvider(String ephemeralKey) {
        Intrinsics.checkNotNullParameter(ephemeralKey, "ephemeralKey");
        this.ephemeralKey = ephemeralKey;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private EphemeralKeyProvider(Parcel parcel) {
        String string = parcel.readString();
        this(string == null ? "" : string);
    }

    public int describeContents() {
        return hashCode();
    }

    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.ephemeralKey);
    }

    public void createEphemeralKey(String apiVersion, EphemeralKeyUpdateListener keyUpdateListener) {
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(keyUpdateListener, "keyUpdateListener");
        keyUpdateListener.onKeyUpdate(this.ephemeralKey);
    }

    /* compiled from: EphemeralKeyProvider.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.reactnativestripesdk.pushprovisioning.EphemeralKeyProvider$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<EphemeralKeyProvider> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EphemeralKeyProvider createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EphemeralKeyProvider(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EphemeralKeyProvider[] newArray(int size) {
            return new EphemeralKeyProvider[size];
        }
    }
}
