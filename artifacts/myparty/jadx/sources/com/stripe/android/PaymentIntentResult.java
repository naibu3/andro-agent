package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.model.PaymentIntent;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentIntentResult.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÂ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0005J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/PaymentIntentResult;", "Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/model/PaymentIntent;", SDKConstants.PARAM_INTENT, "outcomeFromFlow", "", "failureMessage", "", "<init>", "(Lcom/stripe/android/model/PaymentIntent;ILjava/lang/String;)V", "getIntent", "()Lcom/stripe/android/model/PaymentIntent;", "getFailureMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentIntentResult extends StripeIntentResult<PaymentIntent> {
    private final String failureMessage;
    private final PaymentIntent intent;
    private final int outcomeFromFlow;
    public static final Parcelable.Creator<PaymentIntentResult> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: PaymentIntentResult.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentIntentResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntentResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentIntentResult(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntentResult[] newArray(int i) {
            return new PaymentIntentResult[i];
        }
    }

    /* renamed from: component2, reason: from getter */
    private final int getOutcomeFromFlow() {
        return this.outcomeFromFlow;
    }

    public static /* synthetic */ PaymentIntentResult copy$default(PaymentIntentResult paymentIntentResult, PaymentIntent paymentIntent, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paymentIntent = paymentIntentResult.intent;
        }
        if ((i2 & 2) != 0) {
            i = paymentIntentResult.outcomeFromFlow;
        }
        if ((i2 & 4) != 0) {
            str = paymentIntentResult.failureMessage;
        }
        return paymentIntentResult.copy(paymentIntent, i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final PaymentIntentResult copy(PaymentIntent intent, int outcomeFromFlow, String failureMessage) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new PaymentIntentResult(intent, outcomeFromFlow, failureMessage);
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
        if (!(other instanceof PaymentIntentResult)) {
            return false;
        }
        PaymentIntentResult paymentIntentResult = (PaymentIntentResult) other;
        return Intrinsics.areEqual(this.intent, paymentIntentResult.intent) && this.outcomeFromFlow == paymentIntentResult.outcomeFromFlow && Intrinsics.areEqual(this.failureMessage, paymentIntentResult.failureMessage);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = ((this.intent.hashCode() * 31) + Integer.hashCode(this.outcomeFromFlow)) * 31;
        String str = this.failureMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PaymentIntentResult(intent=" + this.intent + ", outcomeFromFlow=" + this.outcomeFromFlow + ", failureMessage=" + this.failureMessage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.intent.writeToParcel(dest, flags);
        dest.writeInt(this.outcomeFromFlow);
        dest.writeString(this.failureMessage);
    }

    public /* synthetic */ PaymentIntentResult(PaymentIntent paymentIntent, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentIntent, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }

    @Override // com.stripe.android.StripeIntentResult
    public PaymentIntent getIntent() {
        return this.intent;
    }

    @Override // com.stripe.android.StripeIntentResult
    public String getFailureMessage() {
        return this.failureMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentResult(PaymentIntent intent, int i, String str) {
        super(i);
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.intent = intent;
        this.outcomeFromFlow = i;
        this.failureMessage = str;
    }
}
