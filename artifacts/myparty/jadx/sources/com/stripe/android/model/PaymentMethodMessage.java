package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodMessage.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/PaymentMethodMessage;", "Lcom/stripe/android/core/model/StripeModel;", "displayHtml", "", "learnMoreUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayHtml", "()Ljava/lang/String;", "getLearnMoreUrl", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentMethodMessage implements StripeModel {
    private final String displayHtml;
    private final String learnMoreUrl;
    public static final Parcelable.Creator<PaymentMethodMessage> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: PaymentMethodMessage.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentMethodMessage(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodMessage[] newArray(int i) {
            return new PaymentMethodMessage[i];
        }
    }

    public static /* synthetic */ PaymentMethodMessage copy$default(PaymentMethodMessage paymentMethodMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodMessage.displayHtml;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodMessage.learnMoreUrl;
        }
        return paymentMethodMessage.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayHtml() {
        return this.displayHtml;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final PaymentMethodMessage copy(String displayHtml, String learnMoreUrl) {
        Intrinsics.checkNotNullParameter(displayHtml, "displayHtml");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        return new PaymentMethodMessage(displayHtml, learnMoreUrl);
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
        if (!(other instanceof PaymentMethodMessage)) {
            return false;
        }
        PaymentMethodMessage paymentMethodMessage = (PaymentMethodMessage) other;
        return Intrinsics.areEqual(this.displayHtml, paymentMethodMessage.displayHtml) && Intrinsics.areEqual(this.learnMoreUrl, paymentMethodMessage.learnMoreUrl);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.displayHtml.hashCode() * 31) + this.learnMoreUrl.hashCode();
    }

    public String toString() {
        return "PaymentMethodMessage(displayHtml=" + this.displayHtml + ", learnMoreUrl=" + this.learnMoreUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.displayHtml);
        dest.writeString(this.learnMoreUrl);
    }

    public PaymentMethodMessage(String displayHtml, String learnMoreUrl) {
        Intrinsics.checkNotNullParameter(displayHtml, "displayHtml");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        this.displayHtml = displayHtml;
        this.learnMoreUrl = learnMoreUrl;
    }

    public final String getDisplayHtml() {
        return this.displayHtml;
    }

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }
}
