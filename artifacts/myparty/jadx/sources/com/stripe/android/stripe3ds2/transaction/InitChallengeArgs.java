package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.security.KeyPair;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitChallengeArgs.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0018\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u001bJ\u000e\u0010\u001c\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u000bHÀ\u0003¢\u0006\u0002\b!J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010#\u001a\u00020\tJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "Landroid/os/Parcelable;", "sdkReferenceNumber", "", "sdkKeyPair", "Ljava/security/KeyPair;", "challengeParameters", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "timeoutMins", "", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "<init>", "(Ljava/lang/String;Ljava/security/KeyPair;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getSdkReferenceNumber$3ds2sdk_release", "()Ljava/lang/String;", "getSdkKeyPair$3ds2sdk_release", "()Ljava/security/KeyPair;", "getChallengeParameters$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "getTimeoutMins$3ds2sdk_release", "()I", "getIntentData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "component1", "component1$3ds2sdk_release", "component2", "component2$3ds2sdk_release", "component3", "component3$3ds2sdk_release", "component4", "component4$3ds2sdk_release", "component5", "component5$3ds2sdk_release", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InitChallengeArgs implements Parcelable {
    public static final Parcelable.Creator<InitChallengeArgs> CREATOR = new Creator();
    private final ChallengeParameters challengeParameters;
    private final IntentData intentData;
    private final KeyPair sdkKeyPair;
    private final String sdkReferenceNumber;
    private final int timeoutMins;

    /* compiled from: InitChallengeArgs.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InitChallengeArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitChallengeArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InitChallengeArgs(parcel.readString(), (KeyPair) parcel.readSerializable(), ChallengeParameters.CREATOR.createFromParcel(parcel), parcel.readInt(), IntentData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InitChallengeArgs[] newArray(int i) {
            return new InitChallengeArgs[i];
        }
    }

    public static /* synthetic */ InitChallengeArgs copy$default(InitChallengeArgs initChallengeArgs, String str, KeyPair keyPair, ChallengeParameters challengeParameters, int i, IntentData intentData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = initChallengeArgs.sdkReferenceNumber;
        }
        if ((i2 & 2) != 0) {
            keyPair = initChallengeArgs.sdkKeyPair;
        }
        if ((i2 & 4) != 0) {
            challengeParameters = initChallengeArgs.challengeParameters;
        }
        if ((i2 & 8) != 0) {
            i = initChallengeArgs.timeoutMins;
        }
        if ((i2 & 16) != 0) {
            intentData = initChallengeArgs.intentData;
        }
        IntentData intentData2 = intentData;
        ChallengeParameters challengeParameters2 = challengeParameters;
        return initChallengeArgs.copy(str, keyPair, challengeParameters2, i, intentData2);
    }

    /* renamed from: component1$3ds2sdk_release, reason: from getter */
    public final String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    /* renamed from: component2$3ds2sdk_release, reason: from getter */
    public final KeyPair getSdkKeyPair() {
        return this.sdkKeyPair;
    }

    /* renamed from: component3$3ds2sdk_release, reason: from getter */
    public final ChallengeParameters getChallengeParameters() {
        return this.challengeParameters;
    }

    /* renamed from: component4$3ds2sdk_release, reason: from getter */
    public final int getTimeoutMins() {
        return this.timeoutMins;
    }

    /* renamed from: component5$3ds2sdk_release, reason: from getter */
    public final IntentData getIntentData() {
        return this.intentData;
    }

    public final InitChallengeArgs copy(String sdkReferenceNumber, KeyPair sdkKeyPair, ChallengeParameters challengeParameters, int timeoutMins, IntentData intentData) {
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkKeyPair, "sdkKeyPair");
        Intrinsics.checkNotNullParameter(challengeParameters, "challengeParameters");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        return new InitChallengeArgs(sdkReferenceNumber, sdkKeyPair, challengeParameters, timeoutMins, intentData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitChallengeArgs)) {
            return false;
        }
        InitChallengeArgs initChallengeArgs = (InitChallengeArgs) other;
        return Intrinsics.areEqual(this.sdkReferenceNumber, initChallengeArgs.sdkReferenceNumber) && Intrinsics.areEqual(this.sdkKeyPair, initChallengeArgs.sdkKeyPair) && Intrinsics.areEqual(this.challengeParameters, initChallengeArgs.challengeParameters) && this.timeoutMins == initChallengeArgs.timeoutMins && Intrinsics.areEqual(this.intentData, initChallengeArgs.intentData);
    }

    public int hashCode() {
        return (((((((this.sdkReferenceNumber.hashCode() * 31) + this.sdkKeyPair.hashCode()) * 31) + this.challengeParameters.hashCode()) * 31) + Integer.hashCode(this.timeoutMins)) * 31) + this.intentData.hashCode();
    }

    public String toString() {
        return "InitChallengeArgs(sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkKeyPair=" + this.sdkKeyPair + ", challengeParameters=" + this.challengeParameters + ", timeoutMins=" + this.timeoutMins + ", intentData=" + this.intentData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sdkReferenceNumber);
        dest.writeSerializable(this.sdkKeyPair);
        this.challengeParameters.writeToParcel(dest, flags);
        dest.writeInt(this.timeoutMins);
        this.intentData.writeToParcel(dest, flags);
    }

    public InitChallengeArgs(String sdkReferenceNumber, KeyPair sdkKeyPair, ChallengeParameters challengeParameters, int i, IntentData intentData) {
        Intrinsics.checkNotNullParameter(sdkReferenceNumber, "sdkReferenceNumber");
        Intrinsics.checkNotNullParameter(sdkKeyPair, "sdkKeyPair");
        Intrinsics.checkNotNullParameter(challengeParameters, "challengeParameters");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkKeyPair = sdkKeyPair;
        this.challengeParameters = challengeParameters;
        this.timeoutMins = i;
        this.intentData = intentData;
    }

    public final String getSdkReferenceNumber$3ds2sdk_release() {
        return this.sdkReferenceNumber;
    }

    public final KeyPair getSdkKeyPair$3ds2sdk_release() {
        return this.sdkKeyPair;
    }

    public final ChallengeParameters getChallengeParameters$3ds2sdk_release() {
        return this.challengeParameters;
    }

    public final int getTimeoutMins$3ds2sdk_release() {
        return this.timeoutMins;
    }

    public final IntentData getIntentData$3ds2sdk_release() {
        return this.intentData;
    }
}
