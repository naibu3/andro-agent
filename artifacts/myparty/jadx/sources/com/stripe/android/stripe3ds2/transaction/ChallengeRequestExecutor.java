package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeRequestExecutor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "", "execute", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "Config", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChallengeRequestExecutor {

    /* compiled from: ChallengeRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "Ljava/io/Serializable;", "create", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory extends Serializable {
        ChallengeRequestExecutor create(ErrorReporter errorReporter, CoroutineContext workContext);
    }

    Object execute(ChallengeRequestData challengeRequestData, Continuation<? super ChallengeRequestResult> continuation);

    /* compiled from: ChallengeRequestExecutor.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0017\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\u0018J\u000e\u0010\u0019\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u001aJ\u000e\u0010\u001b\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b\u001cJ\u000e\u0010\u001d\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u00020\u000bHÀ\u0003¢\u0006\u0002\b J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00060"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "sdkReferenceId", "", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "acsUrl", "keys", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;", "<init>", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)V", "getMessageTransformer$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "getSdkReferenceId$3ds2sdk_release", "()Ljava/lang/String;", "getCreqData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "getAcsUrl$3ds2sdk_release", "getKeys$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;", "component1", "component1$3ds2sdk_release", "component2", "component2$3ds2sdk_release", "component3", "component3$3ds2sdk_release", "component4", "component4$3ds2sdk_release", "component5", "component5$3ds2sdk_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Keys", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config implements Serializable, Parcelable {
        public static final Parcelable.Creator<Config> CREATOR = new Creator();
        private final String acsUrl;
        private final ChallengeRequestData creqData;
        private final Keys keys;
        private final MessageTransformer messageTransformer;
        private final String sdkReferenceId;

        /* compiled from: ChallengeRequestExecutor.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Config((MessageTransformer) parcel.readSerializable(), parcel.readString(), ChallengeRequestData.CREATOR.createFromParcel(parcel), parcel.readString(), Keys.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i) {
                return new Config[i];
            }
        }

        public static /* synthetic */ Config copy$default(Config config, MessageTransformer messageTransformer, String str, ChallengeRequestData challengeRequestData, String str2, Keys keys, int i, Object obj) {
            if ((i & 1) != 0) {
                messageTransformer = config.messageTransformer;
            }
            if ((i & 2) != 0) {
                str = config.sdkReferenceId;
            }
            if ((i & 4) != 0) {
                challengeRequestData = config.creqData;
            }
            if ((i & 8) != 0) {
                str2 = config.acsUrl;
            }
            if ((i & 16) != 0) {
                keys = config.keys;
            }
            Keys keys2 = keys;
            ChallengeRequestData challengeRequestData2 = challengeRequestData;
            return config.copy(messageTransformer, str, challengeRequestData2, str2, keys2);
        }

        /* renamed from: component1$3ds2sdk_release, reason: from getter */
        public final MessageTransformer getMessageTransformer() {
            return this.messageTransformer;
        }

        /* renamed from: component2$3ds2sdk_release, reason: from getter */
        public final String getSdkReferenceId() {
            return this.sdkReferenceId;
        }

        /* renamed from: component3$3ds2sdk_release, reason: from getter */
        public final ChallengeRequestData getCreqData() {
            return this.creqData;
        }

        /* renamed from: component4$3ds2sdk_release, reason: from getter */
        public final String getAcsUrl() {
            return this.acsUrl;
        }

        /* renamed from: component5$3ds2sdk_release, reason: from getter */
        public final Keys getKeys() {
            return this.keys;
        }

        public final Config copy(MessageTransformer messageTransformer, String sdkReferenceId, ChallengeRequestData creqData, String acsUrl, Keys keys) {
            Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
            Intrinsics.checkNotNullParameter(sdkReferenceId, "sdkReferenceId");
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
            Intrinsics.checkNotNullParameter(keys, "keys");
            return new Config(messageTransformer, sdkReferenceId, creqData, acsUrl, keys);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.areEqual(this.messageTransformer, config.messageTransformer) && Intrinsics.areEqual(this.sdkReferenceId, config.sdkReferenceId) && Intrinsics.areEqual(this.creqData, config.creqData) && Intrinsics.areEqual(this.acsUrl, config.acsUrl) && Intrinsics.areEqual(this.keys, config.keys);
        }

        public int hashCode() {
            return (((((((this.messageTransformer.hashCode() * 31) + this.sdkReferenceId.hashCode()) * 31) + this.creqData.hashCode()) * 31) + this.acsUrl.hashCode()) * 31) + this.keys.hashCode();
        }

        public String toString() {
            return "Config(messageTransformer=" + this.messageTransformer + ", sdkReferenceId=" + this.sdkReferenceId + ", creqData=" + this.creqData + ", acsUrl=" + this.acsUrl + ", keys=" + this.keys + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.messageTransformer);
            dest.writeString(this.sdkReferenceId);
            this.creqData.writeToParcel(dest, flags);
            dest.writeString(this.acsUrl);
            this.keys.writeToParcel(dest, flags);
        }

        public Config(MessageTransformer messageTransformer, String sdkReferenceId, ChallengeRequestData creqData, String acsUrl, Keys keys) {
            Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
            Intrinsics.checkNotNullParameter(sdkReferenceId, "sdkReferenceId");
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
            Intrinsics.checkNotNullParameter(keys, "keys");
            this.messageTransformer = messageTransformer;
            this.sdkReferenceId = sdkReferenceId;
            this.creqData = creqData;
            this.acsUrl = acsUrl;
            this.keys = keys;
        }

        public final MessageTransformer getMessageTransformer$3ds2sdk_release() {
            return this.messageTransformer;
        }

        public final String getSdkReferenceId$3ds2sdk_release() {
            return this.sdkReferenceId;
        }

        public final ChallengeRequestData getCreqData$3ds2sdk_release() {
            return this.creqData;
        }

        public final String getAcsUrl$3ds2sdk_release() {
            return this.acsUrl;
        }

        public final Keys getKeys$3ds2sdk_release() {
            return this.keys;
        }

        /* compiled from: ChallengeRequestExecutor.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000H\u0002J\u000e\u0010\u0013\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\u0014J\u000e\u0010\u0015\u001a\u00020\u0004HÀ\u0003¢\u0006\u0002\b\u0016J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\fJ\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006 "}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "sdkPrivateKeyEncoded", "", "acsPublicKeyEncoded", "<init>", "([B[B)V", "getSdkPrivateKeyEncoded$3ds2sdk_release", "()[B", "getAcsPublicKeyEncoded$3ds2sdk_release", "hashCode", "", "equals", "", "other", "", "typedEquals", "keys", "component1", "component1$3ds2sdk_release", "component2", "component2$3ds2sdk_release", "copy", "describeContents", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Keys implements Serializable, Parcelable {
            public static final Parcelable.Creator<Keys> CREATOR = new Creator();
            private final byte[] acsPublicKeyEncoded;
            private final byte[] sdkPrivateKeyEncoded;

            /* compiled from: ChallengeRequestExecutor.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Keys> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Keys createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Keys(parcel.createByteArray(), parcel.createByteArray());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Keys[] newArray(int i) {
                    return new Keys[i];
                }
            }

            public static /* synthetic */ Keys copy$default(Keys keys, byte[] bArr, byte[] bArr2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bArr = keys.sdkPrivateKeyEncoded;
                }
                if ((i & 2) != 0) {
                    bArr2 = keys.acsPublicKeyEncoded;
                }
                return keys.copy(bArr, bArr2);
            }

            /* renamed from: component1$3ds2sdk_release, reason: from getter */
            public final byte[] getSdkPrivateKeyEncoded() {
                return this.sdkPrivateKeyEncoded;
            }

            /* renamed from: component2$3ds2sdk_release, reason: from getter */
            public final byte[] getAcsPublicKeyEncoded() {
                return this.acsPublicKeyEncoded;
            }

            public final Keys copy(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                Intrinsics.checkNotNullParameter(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                Intrinsics.checkNotNullParameter(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                return new Keys(sdkPrivateKeyEncoded, acsPublicKeyEncoded);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public String toString() {
                return "Keys(sdkPrivateKeyEncoded=" + Arrays.toString(this.sdkPrivateKeyEncoded) + ", acsPublicKeyEncoded=" + Arrays.toString(this.acsPublicKeyEncoded) + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeByteArray(this.sdkPrivateKeyEncoded);
                dest.writeByteArray(this.acsPublicKeyEncoded);
            }

            public Keys(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                Intrinsics.checkNotNullParameter(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                Intrinsics.checkNotNullParameter(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                this.sdkPrivateKeyEncoded = sdkPrivateKeyEncoded;
                this.acsPublicKeyEncoded = acsPublicKeyEncoded;
            }

            public final byte[] getSdkPrivateKeyEncoded$3ds2sdk_release() {
                return this.sdkPrivateKeyEncoded;
            }

            public final byte[] getAcsPublicKeyEncoded$3ds2sdk_release() {
                return this.acsPublicKeyEncoded;
            }

            public int hashCode() {
                return ObjectUtils.hash(this.sdkPrivateKeyEncoded, this.acsPublicKeyEncoded);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (other instanceof Keys) {
                    return typedEquals((Keys) other);
                }
                return false;
            }

            private final boolean typedEquals(Keys keys) {
                return Arrays.equals(this.sdkPrivateKeyEncoded, keys.sdkPrivateKeyEncoded) && Arrays.equals(this.acsPublicKeyEncoded, keys.acsPublicKeyEncoded);
            }
        }
    }
}
