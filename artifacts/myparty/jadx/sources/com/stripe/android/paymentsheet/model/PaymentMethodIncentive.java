package com.stripe.android.paymentsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodIncentive.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00002\n\u0010\n\u001a\u00060\u0003j\u0002`\u000bJ\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "Landroid/os/Parcelable;", NotificationsService.IDENTIFIER_KEY, "", "displayText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayText", "()Ljava/lang/String;", "takeIfMatches", "code", "Lcom/stripe/android/model/PaymentMethodCode;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentMethodIncentive implements Parcelable {
    private final String displayText;
    private final String identifier;
    public static final Parcelable.Creator<PaymentMethodIncentive> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: PaymentMethodIncentive.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodIncentive> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodIncentive createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentMethodIncentive(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodIncentive[] newArray(int i) {
            return new PaymentMethodIncentive[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    private final String getIdentifier() {
        return this.identifier;
    }

    public static /* synthetic */ PaymentMethodIncentive copy$default(PaymentMethodIncentive paymentMethodIncentive, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodIncentive.identifier;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodIncentive.displayText;
        }
        return paymentMethodIncentive.copy(str, str2);
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayText() {
        return this.displayText;
    }

    public final PaymentMethodIncentive copy(String identifier, String displayText) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        return new PaymentMethodIncentive(identifier, displayText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodIncentive)) {
            return false;
        }
        PaymentMethodIncentive paymentMethodIncentive = (PaymentMethodIncentive) other;
        return Intrinsics.areEqual(this.identifier, paymentMethodIncentive.identifier) && Intrinsics.areEqual(this.displayText, paymentMethodIncentive.displayText);
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.displayText.hashCode();
    }

    public String toString() {
        return "PaymentMethodIncentive(identifier=" + this.identifier + ", displayText=" + this.displayText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.identifier);
        dest.writeString(this.displayText);
    }

    public PaymentMethodIncentive(String identifier, String displayText) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        this.identifier = identifier;
        this.displayText = displayText;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final PaymentMethodIncentive takeIfMatches(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return (Intrinsics.areEqual(this.identifier, "link_instant_debits") && Intrinsics.areEqual(code, PaymentMethod.Type.Link.code)) ? this : null;
    }
}
