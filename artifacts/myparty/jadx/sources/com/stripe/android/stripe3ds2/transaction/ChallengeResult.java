package com.stripe.android.stripe3ds2.transaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeResult.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00152\u00020\u0001:\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "Landroid/os/Parcelable;", "<init>", "()V", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "toBundle", "Landroid/os/Bundle;", "toBundle$3ds2sdk_release", "Succeeded", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Canceled", NativeProtocol.ERROR_PROTOCOL_ERROR, "RuntimeError", "Timeout", "Companion", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ChallengeResult implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_RESULT = "extra_result";

    public /* synthetic */ ChallengeResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UiType getInitialUiType();

    public abstract IntentData getIntentData();

    private ChallengeResult() {
    }

    public final Bundle toBundle$3ds2sdk_release() {
        return BundleKt.bundleOf(TuplesKt.to("extra_result", this));
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Succeeded;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "uiTypeCode", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getUiTypeCode", "()Ljava/lang/String;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Succeeded extends ChallengeResult {
        public static final Parcelable.Creator<Succeeded> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* compiled from: ChallengeResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Succeeded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Succeeded(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded[] newArray(int i) {
                return new Succeeded[i];
            }
        }

        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, String str, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = succeeded.uiTypeCode;
            }
            if ((i & 2) != 0) {
                uiType = succeeded.initialUiType;
            }
            if ((i & 4) != 0) {
                intentData = succeeded.intentData;
            }
            return succeeded.copy(str, uiType, intentData);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        /* renamed from: component2, reason: from getter */
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        /* renamed from: component3, reason: from getter */
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final Succeeded copy(String uiTypeCode, UiType initialUiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new Succeeded(uiTypeCode, initialUiType, intentData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Succeeded)) {
                return false;
            }
            Succeeded succeeded = (Succeeded) other;
            return Intrinsics.areEqual(this.uiTypeCode, succeeded.uiTypeCode) && this.initialUiType == succeeded.initialUiType && Intrinsics.areEqual(this.intentData, succeeded.intentData);
        }

        public int hashCode() {
            int iHashCode = this.uiTypeCode.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType == null ? 0 : uiType.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Succeeded(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(uiType.name());
            }
            this.intentData.writeToParcel(dest, flags);
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(String uiTypeCode, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Failed;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "uiTypeCode", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getUiTypeCode", "()Ljava/lang/String;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed extends ChallengeResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* compiled from: ChallengeResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.uiTypeCode;
            }
            if ((i & 2) != 0) {
                uiType = failed.initialUiType;
            }
            if ((i & 4) != 0) {
                intentData = failed.intentData;
            }
            return failed.copy(str, uiType, intentData);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        /* renamed from: component2, reason: from getter */
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        /* renamed from: component3, reason: from getter */
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final Failed copy(String uiTypeCode, UiType initialUiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new Failed(uiTypeCode, initialUiType, intentData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.uiTypeCode, failed.uiTypeCode) && this.initialUiType == failed.initialUiType && Intrinsics.areEqual(this.intentData, failed.intentData);
        }

        public int hashCode() {
            int iHashCode = this.uiTypeCode.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType == null ? 0 : uiType.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Failed(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(uiType.name());
            }
            this.intentData.writeToParcel(dest, flags);
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(String uiTypeCode, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(uiTypeCode, "uiTypeCode");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = uiTypeCode;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Canceled;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "uiTypeCode", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getUiTypeCode", "()Ljava/lang/String;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Canceled extends ChallengeResult {
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* compiled from: ChallengeResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Canceled(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, String str, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = canceled.uiTypeCode;
            }
            if ((i & 2) != 0) {
                uiType = canceled.initialUiType;
            }
            if ((i & 4) != 0) {
                intentData = canceled.intentData;
            }
            return canceled.copy(str, uiType, intentData);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        /* renamed from: component2, reason: from getter */
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        /* renamed from: component3, reason: from getter */
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final Canceled copy(String uiTypeCode, UiType initialUiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new Canceled(uiTypeCode, initialUiType, intentData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Canceled)) {
                return false;
            }
            Canceled canceled = (Canceled) other;
            return Intrinsics.areEqual(this.uiTypeCode, canceled.uiTypeCode) && this.initialUiType == canceled.initialUiType && Intrinsics.areEqual(this.intentData, canceled.intentData);
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType != null ? uiType.hashCode() : 0)) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Canceled(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(uiType.name());
            }
            this.intentData.writeToParcel(dest, flags);
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(String str, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "data", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "<init>", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getData", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProtocolError extends ChallengeResult {
        public static final Parcelable.Creator<ProtocolError> CREATOR = new Creator();
        private final ErrorData data;
        private final UiType initialUiType;
        private final IntentData intentData;

        /* compiled from: ChallengeResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProtocolError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProtocolError(ErrorData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError[] newArray(int i) {
                return new ProtocolError[i];
            }
        }

        public static /* synthetic */ ProtocolError copy$default(ProtocolError protocolError, ErrorData errorData, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                errorData = protocolError.data;
            }
            if ((i & 2) != 0) {
                uiType = protocolError.initialUiType;
            }
            if ((i & 4) != 0) {
                intentData = protocolError.intentData;
            }
            return protocolError.copy(errorData, uiType, intentData);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorData getData() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        /* renamed from: component3, reason: from getter */
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final ProtocolError copy(ErrorData data, UiType initialUiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new ProtocolError(data, initialUiType, intentData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProtocolError)) {
                return false;
            }
            ProtocolError protocolError = (ProtocolError) other;
            return Intrinsics.areEqual(this.data, protocolError.data) && this.initialUiType == protocolError.initialUiType && Intrinsics.areEqual(this.intentData, protocolError.intentData);
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType == null ? 0 : uiType.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.data + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.data.writeToParcel(dest, flags);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(uiType.name());
            }
            this.intentData.writeToParcel(dest, flags);
        }

        public final ErrorData getData() {
            return this.data;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProtocolError(ErrorData data, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.data = data;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "throwable", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getThrowable", "()Ljava/lang/Throwable;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RuntimeError extends ChallengeResult {
        public static final Parcelable.Creator<RuntimeError> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final Throwable throwable;

        /* compiled from: ChallengeResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RuntimeError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RuntimeError((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError[] newArray(int i) {
                return new RuntimeError[i];
            }
        }

        public static /* synthetic */ RuntimeError copy$default(RuntimeError runtimeError, Throwable th, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                th = runtimeError.throwable;
            }
            if ((i & 2) != 0) {
                uiType = runtimeError.initialUiType;
            }
            if ((i & 4) != 0) {
                intentData = runtimeError.intentData;
            }
            return runtimeError.copy(th, uiType, intentData);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component2, reason: from getter */
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        /* renamed from: component3, reason: from getter */
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final RuntimeError copy(Throwable throwable, UiType initialUiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new RuntimeError(throwable, initialUiType, intentData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RuntimeError)) {
                return false;
            }
            RuntimeError runtimeError = (RuntimeError) other;
            return Intrinsics.areEqual(this.throwable, runtimeError.throwable) && this.initialUiType == runtimeError.initialUiType && Intrinsics.areEqual(this.intentData, runtimeError.intentData);
        }

        public int hashCode() {
            int iHashCode = this.throwable.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType == null ? 0 : uiType.hashCode())) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.throwable + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.throwable);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(uiType.name());
            }
            this.intentData.writeToParcel(dest, flags);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuntimeError(Throwable throwable, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.throwable = throwable;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "uiTypeCode", "", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V", "getUiTypeCode", "()Ljava/lang/String;", "getInitialUiType", "()Lcom/stripe/android/stripe3ds2/transactions/UiType;", "getIntentData", "()Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Timeout extends ChallengeResult {
        public static final Parcelable.Creator<Timeout> CREATOR = new Creator();
        private final UiType initialUiType;
        private final IntentData intentData;
        private final String uiTypeCode;

        /* compiled from: ChallengeResult.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Timeout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Timeout(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout[] newArray(int i) {
                return new Timeout[i];
            }
        }

        public static /* synthetic */ Timeout copy$default(Timeout timeout, String str, UiType uiType, IntentData intentData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timeout.uiTypeCode;
            }
            if ((i & 2) != 0) {
                uiType = timeout.initialUiType;
            }
            if ((i & 4) != 0) {
                intentData = timeout.intentData;
            }
            return timeout.copy(str, uiType, intentData);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        /* renamed from: component2, reason: from getter */
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        /* renamed from: component3, reason: from getter */
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final Timeout copy(String uiTypeCode, UiType initialUiType, IntentData intentData) {
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            return new Timeout(uiTypeCode, initialUiType, intentData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timeout)) {
                return false;
            }
            Timeout timeout = (Timeout) other;
            return Intrinsics.areEqual(this.uiTypeCode, timeout.uiTypeCode) && this.initialUiType == timeout.initialUiType && Intrinsics.areEqual(this.intentData, timeout.intentData);
        }

        public int hashCode() {
            String str = this.uiTypeCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UiType uiType = this.initialUiType;
            return ((iHashCode + (uiType != null ? uiType.hashCode() : 0)) * 31) + this.intentData.hashCode();
        }

        public String toString() {
            return "Timeout(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(uiType.name());
            }
            this.intentData.writeToParcel(dest, flags);
        }

        public final String getUiTypeCode() {
            return this.uiTypeCode;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public IntentData getIntentData() {
            return this.intentData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(String str, UiType uiType, IntentData intentData) {
            super(null);
            Intrinsics.checkNotNullParameter(intentData, "intentData");
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }
    }

    /* compiled from: ChallengeResult.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Companion;", "", "<init>", "()V", "EXTRA_RESULT", "", "fromIntent", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChallengeResult fromIntent(Intent intent) {
            ChallengeResult challengeResult;
            return (intent == null || (challengeResult = (ChallengeResult) IntentCompat.getParcelableExtra(intent, "extra_result", ChallengeResult.class)) == null) ? new RuntimeError(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, IntentData.INSTANCE.getEMPTY()) : challengeResult;
        }
    }
}
