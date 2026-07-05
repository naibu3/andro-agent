package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.model.StripeModel;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BinRange.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/BinRange;", "Lcom/stripe/android/core/model/StripeModel;", "low", "", "high", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLow", "()Ljava/lang/String;", "getHigh", "matches", "", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BinRange implements StripeModel {
    private final String high;
    private final String low;
    public static final Parcelable.Creator<BinRange> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BinRange.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BinRange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinRange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BinRange(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinRange[] newArray(int i) {
            return new BinRange[i];
        }
    }

    public static /* synthetic */ BinRange copy$default(BinRange binRange, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = binRange.low;
        }
        if ((i & 2) != 0) {
            str2 = binRange.high;
        }
        return binRange.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLow() {
        return this.low;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHigh() {
        return this.high;
    }

    public final BinRange copy(String low, String high) {
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(high, "high");
        return new BinRange(low, high);
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
        if (!(other instanceof BinRange)) {
            return false;
        }
        BinRange binRange = (BinRange) other;
        return Intrinsics.areEqual(this.low, binRange.low) && Intrinsics.areEqual(this.high, binRange.high);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.low.hashCode() * 31) + this.high.hashCode();
    }

    public String toString() {
        return "BinRange(low=" + this.low + ", high=" + this.high + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.low);
        dest.writeString(this.high);
    }

    public BinRange(String low, String high) {
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(high, "high");
        this.low = low;
        this.high = high;
    }

    public final String getLow() {
        return this.low;
    }

    public final String getHigh() {
        return this.high;
    }

    public final boolean matches(CardNumber.Unvalidated cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        String normalized = cardNumber.getNormalized();
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(normalized);
        if (bigDecimalOrNull == null) {
            return false;
        }
        return (normalized.length() >= this.low.length() ? new BigDecimal(StringsKt.take(normalized, this.low.length())).compareTo(new BigDecimal(this.low)) >= 0 : bigDecimalOrNull.compareTo(new BigDecimal(StringsKt.take(this.low, normalized.length()))) >= 0) && (normalized.length() >= this.high.length() ? new BigDecimal(StringsKt.take(normalized, this.high.length())).compareTo(new BigDecimal(this.high)) <= 0 : bigDecimalOrNull.compareTo(new BigDecimal(StringsKt.take(this.high, normalized.length()))) <= 0);
    }
}
