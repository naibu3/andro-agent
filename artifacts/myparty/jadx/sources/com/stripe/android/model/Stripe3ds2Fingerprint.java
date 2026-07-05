package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.StripeIntent;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: Stripe3ds2Fingerprint.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J6\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÀ\u0001¢\u0006\u0002\b\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "Landroid/os/Parcelable;", "source", "", "directoryServerName", "serverTransactionId", "directoryServerEncryption", "Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;)V", "sdkData", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "(Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;)V", "getSource", "()Ljava/lang/String;", "getDirectoryServerName", "getServerTransactionId", "getDirectoryServerEncryption", "()Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "component1", "component2", "component3", "component4", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "DirectoryServerEncryption", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Stripe3ds2Fingerprint implements Parcelable {
    private final DirectoryServerEncryption directoryServerEncryption;
    private final String directoryServerName;
    private final String serverTransactionId;
    private final String source;
    public static final Parcelable.Creator<Stripe3ds2Fingerprint> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: Stripe3ds2Fingerprint.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Stripe3ds2Fingerprint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2Fingerprint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Stripe3ds2Fingerprint(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2Fingerprint[] newArray(int i) {
            return new Stripe3ds2Fingerprint[i];
        }
    }

    public static /* synthetic */ Stripe3ds2Fingerprint copy$payments_core_release$default(Stripe3ds2Fingerprint stripe3ds2Fingerprint, String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stripe3ds2Fingerprint.source;
        }
        if ((i & 2) != 0) {
            str2 = stripe3ds2Fingerprint.directoryServerName;
        }
        if ((i & 4) != 0) {
            str3 = stripe3ds2Fingerprint.serverTransactionId;
        }
        if ((i & 8) != 0) {
            directoryServerEncryption = stripe3ds2Fingerprint.directoryServerEncryption;
        }
        return stripe3ds2Fingerprint.copy$payments_core_release(str, str2, str3, directoryServerEncryption);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getServerTransactionId() {
        return this.serverTransactionId;
    }

    /* renamed from: component4, reason: from getter */
    public final DirectoryServerEncryption getDirectoryServerEncryption() {
        return this.directoryServerEncryption;
    }

    public final Stripe3ds2Fingerprint copy$payments_core_release(String source, String directoryServerName, String serverTransactionId, DirectoryServerEncryption directoryServerEncryption) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(serverTransactionId, "serverTransactionId");
        Intrinsics.checkNotNullParameter(directoryServerEncryption, "directoryServerEncryption");
        return new Stripe3ds2Fingerprint(source, directoryServerName, serverTransactionId, directoryServerEncryption);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stripe3ds2Fingerprint)) {
            return false;
        }
        Stripe3ds2Fingerprint stripe3ds2Fingerprint = (Stripe3ds2Fingerprint) other;
        return Intrinsics.areEqual(this.source, stripe3ds2Fingerprint.source) && Intrinsics.areEqual(this.directoryServerName, stripe3ds2Fingerprint.directoryServerName) && Intrinsics.areEqual(this.serverTransactionId, stripe3ds2Fingerprint.serverTransactionId) && Intrinsics.areEqual(this.directoryServerEncryption, stripe3ds2Fingerprint.directoryServerEncryption);
    }

    public int hashCode() {
        return (((((this.source.hashCode() * 31) + this.directoryServerName.hashCode()) * 31) + this.serverTransactionId.hashCode()) * 31) + this.directoryServerEncryption.hashCode();
    }

    public String toString() {
        return "Stripe3ds2Fingerprint(source=" + this.source + ", directoryServerName=" + this.directoryServerName + ", serverTransactionId=" + this.serverTransactionId + ", directoryServerEncryption=" + this.directoryServerEncryption + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source);
        dest.writeString(this.directoryServerName);
        dest.writeString(this.serverTransactionId);
        this.directoryServerEncryption.writeToParcel(dest, flags);
    }

    public Stripe3ds2Fingerprint(String source, String directoryServerName, String serverTransactionId, DirectoryServerEncryption directoryServerEncryption) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(serverTransactionId, "serverTransactionId");
        Intrinsics.checkNotNullParameter(directoryServerEncryption, "directoryServerEncryption");
        this.source = source;
        this.directoryServerName = directoryServerName;
        this.serverTransactionId = serverTransactionId;
        this.directoryServerEncryption = directoryServerEncryption;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    public final String getServerTransactionId() {
        return this.serverTransactionId;
    }

    public final DirectoryServerEncryption getDirectoryServerEncryption() {
        return this.directoryServerEncryption;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2Fingerprint(StripeIntent.NextActionData.SdkData.Use3DS2 sdkData) throws CertificateException {
        this(sdkData.getSource(), sdkData.getServerName(), sdkData.getTransactionId(), new DirectoryServerEncryption(sdkData.getServerEncryption().getDirectoryServerId(), sdkData.getServerEncryption().getDsCertificateData(), sdkData.getServerEncryption().getRootCertsData(), sdkData.getServerEncryption().getKeyId()));
        Intrinsics.checkNotNullParameter(sdkData, "sdkData");
    }

    /* compiled from: Stripe3ds2Fingerprint.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0001)B1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bB1\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÀ\u0001¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006*"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "Landroid/os/Parcelable;", "directoryServerId", "", "directoryServerPublicKey", "Ljava/security/PublicKey;", "rootCerts", "", "Ljava/security/cert/X509Certificate;", "keyId", "<init>", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/util/List;Ljava/lang/String;)V", "dsCertificateData", "rootCertsData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDirectoryServerId", "()Ljava/lang/String;", "getDirectoryServerPublicKey", "()Ljava/security/PublicKey;", "getRootCerts", "()Ljava/util/List;", "getKeyId", "component1", "component2", "component3", "component4", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DirectoryServerEncryption implements Parcelable {
        private final String directoryServerId;
        private final PublicKey directoryServerPublicKey;
        private final String keyId;
        private final List<X509Certificate> rootCerts;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: Stripe3ds2Fingerprint.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DirectoryServerEncryption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new DirectoryServerEncryption(string, publicKey, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectoryServerEncryption[] newArray(int i) {
                return new DirectoryServerEncryption[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DirectoryServerEncryption copy$payments_core_release$default(DirectoryServerEncryption directoryServerEncryption, String str, PublicKey publicKey, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = directoryServerEncryption.directoryServerId;
            }
            if ((i & 2) != 0) {
                publicKey = directoryServerEncryption.directoryServerPublicKey;
            }
            if ((i & 4) != 0) {
                list = directoryServerEncryption.rootCerts;
            }
            if ((i & 8) != 0) {
                str2 = directoryServerEncryption.keyId;
            }
            return directoryServerEncryption.copy$payments_core_release(str, publicKey, list, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDirectoryServerId() {
            return this.directoryServerId;
        }

        /* renamed from: component2, reason: from getter */
        public final PublicKey getDirectoryServerPublicKey() {
            return this.directoryServerPublicKey;
        }

        public final List<X509Certificate> component3() {
            return this.rootCerts;
        }

        /* renamed from: component4, reason: from getter */
        public final String getKeyId() {
            return this.keyId;
        }

        public final DirectoryServerEncryption copy$payments_core_release(String directoryServerId, PublicKey directoryServerPublicKey, List<? extends X509Certificate> rootCerts, String keyId) {
            Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
            Intrinsics.checkNotNullParameter(directoryServerPublicKey, "directoryServerPublicKey");
            Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
            return new DirectoryServerEncryption(directoryServerId, directoryServerPublicKey, rootCerts, keyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DirectoryServerEncryption)) {
                return false;
            }
            DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) other;
            return Intrinsics.areEqual(this.directoryServerId, directoryServerEncryption.directoryServerId) && Intrinsics.areEqual(this.directoryServerPublicKey, directoryServerEncryption.directoryServerPublicKey) && Intrinsics.areEqual(this.rootCerts, directoryServerEncryption.rootCerts) && Intrinsics.areEqual(this.keyId, directoryServerEncryption.keyId);
        }

        public int hashCode() {
            int iHashCode = ((((this.directoryServerId.hashCode() * 31) + this.directoryServerPublicKey.hashCode()) * 31) + this.rootCerts.hashCode()) * 31;
            String str = this.keyId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DirectoryServerEncryption(directoryServerId=" + this.directoryServerId + ", directoryServerPublicKey=" + this.directoryServerPublicKey + ", rootCerts=" + this.rootCerts + ", keyId=" + this.keyId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.directoryServerId);
            dest.writeSerializable(this.directoryServerPublicKey);
            List<X509Certificate> list = this.rootCerts;
            dest.writeInt(list.size());
            Iterator<X509Certificate> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
            dest.writeString(this.keyId);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DirectoryServerEncryption(String directoryServerId, PublicKey directoryServerPublicKey, List<? extends X509Certificate> rootCerts, String str) {
            Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
            Intrinsics.checkNotNullParameter(directoryServerPublicKey, "directoryServerPublicKey");
            Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
            this.directoryServerId = directoryServerId;
            this.directoryServerPublicKey = directoryServerPublicKey;
            this.rootCerts = rootCerts;
            this.keyId = str;
        }

        public final String getDirectoryServerId() {
            return this.directoryServerId;
        }

        public final PublicKey getDirectoryServerPublicKey() {
            return this.directoryServerPublicKey;
        }

        public final List<X509Certificate> getRootCerts() {
            return this.rootCerts;
        }

        public final String getKeyId() {
            return this.keyId;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DirectoryServerEncryption(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
            Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
            Intrinsics.checkNotNullParameter(dsCertificateData, "dsCertificateData");
            Intrinsics.checkNotNullParameter(rootCertsData, "rootCertsData");
            Companion companion = Companion;
            PublicKey publicKey = companion.generateCertificate(dsCertificateData).getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "getPublicKey(...)");
            this(directoryServerId, publicKey, (List<? extends X509Certificate>) companion.generateCertificates(rootCertsData), str);
        }

        /* compiled from: Stripe3ds2Fingerprint.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption$Companion;", "", "<init>", "()V", "generateCertificates", "", "Ljava/security/cert/X509Certificate;", "certificatesData", "", "generateCertificate", "certificateData", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final List<X509Certificate> generateCertificates(List<String> certificatesData) throws CertificateException {
                List<String> list = certificatesData;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(DirectoryServerEncryption.Companion.generateCertificate((String) it.next()));
                }
                return arrayList;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final X509Certificate generateCertificate(String certificateData) throws CertificateException {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = certificateData.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                Intrinsics.checkNotNull(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return (X509Certificate) certificateGenerateCertificate;
            }
        }
    }
}
