package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.model.SetupIntent;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SetupIntentResult.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÂ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÀ\u0001¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u0005J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/SetupIntentResult;", "Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/model/SetupIntent;", SDKConstants.PARAM_INTENT, "outcomeFromFlow", "", "failureMessage", "", "<init>", "(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)V", "getIntent", "()Lcom/stripe/android/model/SetupIntent;", "getFailureMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "copy$payments_core_release", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SetupIntentResult extends StripeIntentResult<SetupIntent> {
    private final String failureMessage;
    private final SetupIntent intent;
    private final int outcomeFromFlow;
    public static final Parcelable.Creator<SetupIntentResult> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: SetupIntentResult.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SetupIntentResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntentResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetupIntentResult(SetupIntent.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntentResult[] newArray(int i) {
            return new SetupIntentResult[i];
        }
    }

    /* renamed from: component2, reason: from getter */
    private final int getOutcomeFromFlow() {
        return this.outcomeFromFlow;
    }

    public static /* synthetic */ SetupIntentResult copy$payments_core_release$default(SetupIntentResult setupIntentResult, SetupIntent setupIntent, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            setupIntent = setupIntentResult.intent;
        }
        if ((i2 & 2) != 0) {
            i = setupIntentResult.outcomeFromFlow;
        }
        if ((i2 & 4) != 0) {
            str = setupIntentResult.failureMessage;
        }
        return setupIntentResult.copy$payments_core_release(setupIntent, i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final SetupIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final SetupIntentResult copy$payments_core_release(SetupIntent intent, int outcomeFromFlow, String failureMessage) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new SetupIntentResult(intent, outcomeFromFlow, failureMessage);
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
        if (!(other instanceof SetupIntentResult)) {
            return false;
        }
        SetupIntentResult setupIntentResult = (SetupIntentResult) other;
        return Intrinsics.areEqual(this.intent, setupIntentResult.intent) && this.outcomeFromFlow == setupIntentResult.outcomeFromFlow && Intrinsics.areEqual(this.failureMessage, setupIntentResult.failureMessage);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((this.intent.hashCode() * 31) + Integer.hashCode(this.outcomeFromFlow)) * 31;
        String str = this.failureMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SetupIntentResult(intent=" + this.intent + ", outcomeFromFlow=" + this.outcomeFromFlow + ", failureMessage=" + this.failureMessage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.intent.writeToParcel(dest, flags);
        dest.writeInt(this.outcomeFromFlow);
        dest.writeString(this.failureMessage);
    }

    public /* synthetic */ SetupIntentResult(SetupIntent setupIntent, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(setupIntent, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }

    @Override // com.stripe.android.StripeIntentResult
    public SetupIntent getIntent() {
        return this.intent;
    }

    @Override // com.stripe.android.StripeIntentResult
    public String getFailureMessage() {
        return this.failureMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupIntentResult(SetupIntent intent, int i, String str) {
        super(i);
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.intent = intent;
        this.outcomeFromFlow = i;
        this.failureMessage = str;
    }
}
