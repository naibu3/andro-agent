package com.stripe.android.paymentelement.confirmation.bacs;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BacsConfirmationOption.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationOption;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "optionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "<init>", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;)V", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "getOptionsParams", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BacsConfirmationOption implements ConfirmationHandler.Option {
    private final PaymentMethodCreateParams createParams;
    private final PaymentMethodOptionsParams optionsParams;
    public static final Parcelable.Creator<BacsConfirmationOption> CREATOR = new Creator();
    public static final int $stable = PaymentMethodOptionsParams.$stable | PaymentMethodCreateParams.$stable;

    /* compiled from: BacsConfirmationOption.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BacsConfirmationOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacsConfirmationOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BacsConfirmationOption((PaymentMethodCreateParams) parcel.readParcelable(BacsConfirmationOption.class.getClassLoader()), (PaymentMethodOptionsParams) parcel.readParcelable(BacsConfirmationOption.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacsConfirmationOption[] newArray(int i) {
            return new BacsConfirmationOption[i];
        }
    }

    public static /* synthetic */ BacsConfirmationOption copy$default(BacsConfirmationOption bacsConfirmationOption, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentMethodCreateParams = bacsConfirmationOption.createParams;
        }
        if ((i & 2) != 0) {
            paymentMethodOptionsParams = bacsConfirmationOption.optionsParams;
        }
        return bacsConfirmationOption.copy(paymentMethodCreateParams, paymentMethodOptionsParams);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentMethodCreateParams getCreateParams() {
        return this.createParams;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentMethodOptionsParams getOptionsParams() {
        return this.optionsParams;
    }

    public final BacsConfirmationOption copy(PaymentMethodCreateParams createParams, PaymentMethodOptionsParams optionsParams) {
        Intrinsics.checkNotNullParameter(createParams, "createParams");
        return new BacsConfirmationOption(createParams, optionsParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsConfirmationOption)) {
            return false;
        }
        BacsConfirmationOption bacsConfirmationOption = (BacsConfirmationOption) other;
        return Intrinsics.areEqual(this.createParams, bacsConfirmationOption.createParams) && Intrinsics.areEqual(this.optionsParams, bacsConfirmationOption.optionsParams);
    }

    public int hashCode() {
        int iHashCode = this.createParams.hashCode() * 31;
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.optionsParams;
        return iHashCode + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode());
    }

    public String toString() {
        return "BacsConfirmationOption(createParams=" + this.createParams + ", optionsParams=" + this.optionsParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.createParams, flags);
        dest.writeParcelable(this.optionsParams, flags);
    }

    public BacsConfirmationOption(PaymentMethodCreateParams createParams, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        Intrinsics.checkNotNullParameter(createParams, "createParams");
        this.createParams = createParams;
        this.optionsParams = paymentMethodOptionsParams;
    }

    public final PaymentMethodCreateParams getCreateParams() {
        return this.createParams;
    }

    public final PaymentMethodOptionsParams getOptionsParams() {
        return this.optionsParams;
    }
}
