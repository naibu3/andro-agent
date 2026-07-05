package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodPreference.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethodPreference;", "Lcom/stripe/android/core/model/StripeModel;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "formUI", "", "<init>", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)V", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "getFormUI", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentMethodPreference implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PaymentMethodPreference> CREATOR = new Creator();
    private final String formUI;
    private final StripeIntent intent;

    /* compiled from: PaymentMethodPreference.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodPreference> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodPreference createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentMethodPreference((StripeIntent) parcel.readParcelable(PaymentMethodPreference.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodPreference[] newArray(int i) {
            return new PaymentMethodPreference[i];
        }
    }

    public static /* synthetic */ PaymentMethodPreference copy$default(PaymentMethodPreference paymentMethodPreference, StripeIntent stripeIntent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stripeIntent = paymentMethodPreference.intent;
        }
        if ((i & 2) != 0) {
            str = paymentMethodPreference.formUI;
        }
        return paymentMethodPreference.copy(stripeIntent, str);
    }

    /* renamed from: component1, reason: from getter */
    public final StripeIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormUI() {
        return this.formUI;
    }

    public final PaymentMethodPreference copy(StripeIntent intent, String formUI) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new PaymentMethodPreference(intent, formUI);
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
        if (!(other instanceof PaymentMethodPreference)) {
            return false;
        }
        PaymentMethodPreference paymentMethodPreference = (PaymentMethodPreference) other;
        return Intrinsics.areEqual(this.intent, paymentMethodPreference.intent) && Intrinsics.areEqual(this.formUI, paymentMethodPreference.formUI);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int iHashCode = this.intent.hashCode() * 31;
        String str = this.formUI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PaymentMethodPreference(intent=" + this.intent + ", formUI=" + this.formUI + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.intent, flags);
        dest.writeString(this.formUI);
    }

    public PaymentMethodPreference(StripeIntent intent, String str) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.intent = intent;
        this.formUI = str;
    }

    public /* synthetic */ PaymentMethodPreference(StripeIntent stripeIntent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeIntent, (i & 2) != 0 ? null : str);
    }

    public final StripeIntent getIntent() {
        return this.intent;
    }

    public final String getFormUI() {
        return this.formUI;
    }
}
