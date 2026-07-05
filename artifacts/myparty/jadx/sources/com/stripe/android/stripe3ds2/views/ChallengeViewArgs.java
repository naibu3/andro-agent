package com.stripe.android.stripe3ds2.views;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeViewArgs.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0001BB?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b'J\u000e\u0010(\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b)J\u000e\u0010*\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b-J\u000e\u0010.\u001a\u00020\u000bHÀ\u0003¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\rHÀ\u0003¢\u0006\u0002\b1J\u000e\u00102\u001a\u00020\u000fHÀ\u0003¢\u0006\u0002\b3JO\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0006\u00105\u001a\u00020\rJ\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\rHÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006C"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "Landroid/os/Parcelable;", "cresData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "creqExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "timeoutMins", "", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getCresData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "getCreqData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "getUiCustomization$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "getCreqExecutorConfig$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "getCreqExecutorFactory$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "getTimeoutMins$3ds2sdk_release", "()I", "getIntentData$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "toBundle", "Landroid/os/Bundle;", "component1", "component1$3ds2sdk_release", "component2", "component2$3ds2sdk_release", "component3", "component3$3ds2sdk_release", "component4", "component4$3ds2sdk_release", "component5", "component5$3ds2sdk_release", "component6", "component6$3ds2sdk_release", "component7", "component7$3ds2sdk_release", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ChallengeViewArgs implements Parcelable {
    private static final String EXTRA_ARGS = "extra_args";
    private final ChallengeRequestData creqData;
    private final ChallengeRequestExecutor.Config creqExecutorConfig;
    private final ChallengeRequestExecutor.Factory creqExecutorFactory;
    private final ChallengeResponseData cresData;
    private final IntentData intentData;
    private final int timeoutMins;
    private final StripeUiCustomization uiCustomization;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ChallengeViewArgs> CREATOR = new Creator();

    /* compiled from: ChallengeViewArgs.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChallengeViewArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeViewArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengeViewArgs(ChallengeResponseData.CREATOR.createFromParcel(parcel), ChallengeRequestData.CREATOR.createFromParcel(parcel), (StripeUiCustomization) parcel.readParcelable(ChallengeViewArgs.class.getClassLoader()), ChallengeRequestExecutor.Config.CREATOR.createFromParcel(parcel), (ChallengeRequestExecutor.Factory) parcel.readSerializable(), parcel.readInt(), IntentData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChallengeViewArgs[] newArray(int i) {
            return new ChallengeViewArgs[i];
        }
    }

    public static /* synthetic */ ChallengeViewArgs copy$default(ChallengeViewArgs challengeViewArgs, ChallengeResponseData challengeResponseData, ChallengeRequestData challengeRequestData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, ChallengeRequestExecutor.Factory factory, int i, IntentData intentData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            challengeResponseData = challengeViewArgs.cresData;
        }
        if ((i2 & 2) != 0) {
            challengeRequestData = challengeViewArgs.creqData;
        }
        if ((i2 & 4) != 0) {
            stripeUiCustomization = challengeViewArgs.uiCustomization;
        }
        if ((i2 & 8) != 0) {
            config = challengeViewArgs.creqExecutorConfig;
        }
        if ((i2 & 16) != 0) {
            factory = challengeViewArgs.creqExecutorFactory;
        }
        if ((i2 & 32) != 0) {
            i = challengeViewArgs.timeoutMins;
        }
        if ((i2 & 64) != 0) {
            intentData = challengeViewArgs.intentData;
        }
        int i3 = i;
        IntentData intentData2 = intentData;
        ChallengeRequestExecutor.Factory factory2 = factory;
        StripeUiCustomization stripeUiCustomization2 = stripeUiCustomization;
        return challengeViewArgs.copy(challengeResponseData, challengeRequestData, stripeUiCustomization2, config, factory2, i3, intentData2);
    }

    /* renamed from: component1$3ds2sdk_release, reason: from getter */
    public final ChallengeResponseData getCresData() {
        return this.cresData;
    }

    /* renamed from: component2$3ds2sdk_release, reason: from getter */
    public final ChallengeRequestData getCreqData() {
        return this.creqData;
    }

    /* renamed from: component3$3ds2sdk_release, reason: from getter */
    public final StripeUiCustomization getUiCustomization() {
        return this.uiCustomization;
    }

    /* renamed from: component4$3ds2sdk_release, reason: from getter */
    public final ChallengeRequestExecutor.Config getCreqExecutorConfig() {
        return this.creqExecutorConfig;
    }

    /* renamed from: component5$3ds2sdk_release, reason: from getter */
    public final ChallengeRequestExecutor.Factory getCreqExecutorFactory() {
        return this.creqExecutorFactory;
    }

    /* renamed from: component6$3ds2sdk_release, reason: from getter */
    public final int getTimeoutMins() {
        return this.timeoutMins;
    }

    /* renamed from: component7$3ds2sdk_release, reason: from getter */
    public final IntentData getIntentData() {
        return this.intentData;
    }

    public final ChallengeViewArgs copy(ChallengeResponseData cresData, ChallengeRequestData creqData, StripeUiCustomization uiCustomization, ChallengeRequestExecutor.Config creqExecutorConfig, ChallengeRequestExecutor.Factory creqExecutorFactory, int timeoutMins, IntentData intentData) {
        Intrinsics.checkNotNullParameter(cresData, "cresData");
        Intrinsics.checkNotNullParameter(creqData, "creqData");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
        Intrinsics.checkNotNullParameter(creqExecutorFactory, "creqExecutorFactory");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        return new ChallengeViewArgs(cresData, creqData, uiCustomization, creqExecutorConfig, creqExecutorFactory, timeoutMins, intentData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeViewArgs)) {
            return false;
        }
        ChallengeViewArgs challengeViewArgs = (ChallengeViewArgs) other;
        return Intrinsics.areEqual(this.cresData, challengeViewArgs.cresData) && Intrinsics.areEqual(this.creqData, challengeViewArgs.creqData) && Intrinsics.areEqual(this.uiCustomization, challengeViewArgs.uiCustomization) && Intrinsics.areEqual(this.creqExecutorConfig, challengeViewArgs.creqExecutorConfig) && Intrinsics.areEqual(this.creqExecutorFactory, challengeViewArgs.creqExecutorFactory) && this.timeoutMins == challengeViewArgs.timeoutMins && Intrinsics.areEqual(this.intentData, challengeViewArgs.intentData);
    }

    public int hashCode() {
        return (((((((((((this.cresData.hashCode() * 31) + this.creqData.hashCode()) * 31) + this.uiCustomization.hashCode()) * 31) + this.creqExecutorConfig.hashCode()) * 31) + this.creqExecutorFactory.hashCode()) * 31) + Integer.hashCode(this.timeoutMins)) * 31) + this.intentData.hashCode();
    }

    public String toString() {
        return "ChallengeViewArgs(cresData=" + this.cresData + ", creqData=" + this.creqData + ", uiCustomization=" + this.uiCustomization + ", creqExecutorConfig=" + this.creqExecutorConfig + ", creqExecutorFactory=" + this.creqExecutorFactory + ", timeoutMins=" + this.timeoutMins + ", intentData=" + this.intentData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.cresData.writeToParcel(dest, flags);
        this.creqData.writeToParcel(dest, flags);
        dest.writeParcelable(this.uiCustomization, flags);
        this.creqExecutorConfig.writeToParcel(dest, flags);
        dest.writeSerializable(this.creqExecutorFactory);
        dest.writeInt(this.timeoutMins);
        this.intentData.writeToParcel(dest, flags);
    }

    public ChallengeViewArgs(ChallengeResponseData cresData, ChallengeRequestData creqData, StripeUiCustomization uiCustomization, ChallengeRequestExecutor.Config creqExecutorConfig, ChallengeRequestExecutor.Factory creqExecutorFactory, int i, IntentData intentData) {
        Intrinsics.checkNotNullParameter(cresData, "cresData");
        Intrinsics.checkNotNullParameter(creqData, "creqData");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
        Intrinsics.checkNotNullParameter(creqExecutorFactory, "creqExecutorFactory");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        this.cresData = cresData;
        this.creqData = creqData;
        this.uiCustomization = uiCustomization;
        this.creqExecutorConfig = creqExecutorConfig;
        this.creqExecutorFactory = creqExecutorFactory;
        this.timeoutMins = i;
        this.intentData = intentData;
    }

    public final ChallengeResponseData getCresData$3ds2sdk_release() {
        return this.cresData;
    }

    public final ChallengeRequestData getCreqData$3ds2sdk_release() {
        return this.creqData;
    }

    public final StripeUiCustomization getUiCustomization$3ds2sdk_release() {
        return this.uiCustomization;
    }

    public final ChallengeRequestExecutor.Config getCreqExecutorConfig$3ds2sdk_release() {
        return this.creqExecutorConfig;
    }

    public final ChallengeRequestExecutor.Factory getCreqExecutorFactory$3ds2sdk_release() {
        return this.creqExecutorFactory;
    }

    public final int getTimeoutMins$3ds2sdk_release() {
        return this.timeoutMins;
    }

    public final IntentData getIntentData$3ds2sdk_release() {
        return this.intentData;
    }

    public final SdkTransactionId getSdkTransactionId$3ds2sdk_release() {
        return this.creqData.getSdkTransId();
    }

    public final Bundle toBundle() {
        return BundleKt.bundleOf(TuplesKt.to(EXTRA_ARGS, this));
    }

    /* compiled from: ChallengeViewArgs.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs$Companion;", "", "<init>", "()V", "EXTRA_ARGS", "", "create", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "extras", "Landroid/os/Bundle;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChallengeViewArgs create(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            Object parcelable = BundleCompat.getParcelable(extras, ChallengeViewArgs.EXTRA_ARGS, ChallengeViewArgs.class);
            if (parcelable != null) {
                return (ChallengeViewArgs) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
