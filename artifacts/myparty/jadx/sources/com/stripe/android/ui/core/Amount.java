package com.stripe.android.ui.core;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatDelegate;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.format.CurrencyFormatter;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Amount.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/ui/core/Amount;", "Landroid/os/Parcelable;", "value", "", "currencyCode", "", "<init>", "(JLjava/lang/String;)V", "getValue", "()J", "getCurrencyCode", "()Ljava/lang/String;", "buildPayButtonLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Amount implements Parcelable {
    private final String currencyCode;
    private final long value;
    public static final Parcelable.Creator<Amount> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: Amount.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Amount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Amount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Amount(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Amount[] newArray(int i) {
            return new Amount[i];
        }
    }

    public static /* synthetic */ Amount copy$default(Amount amount, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = amount.value;
        }
        if ((i & 2) != 0) {
            str = amount.currencyCode;
        }
        return amount.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Amount copy(long value, String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new Amount(value, currencyCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) other;
        return this.value == amount.value && Intrinsics.areEqual(this.currencyCode, amount.currencyCode);
    }

    public int hashCode() {
        return (Long.hashCode(this.value) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "Amount(value=" + this.value + ", currencyCode=" + this.currencyCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.value);
        dest.writeString(this.currencyCode);
    }

    public Amount(long j, String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.value = j;
        this.currencyCode = currencyCode;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final long getValue() {
        return this.value;
    }

    public final ResolvableString buildPayButtonLabel() {
        int i = R.string.stripe_pay_button_amount;
        CurrencyFormatter currencyFormatter = CurrencyFormatter.INSTANCE;
        long j = this.value;
        String str = this.currencyCode;
        Locale locale = AppCompatDelegate.getApplicationLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Intrinsics.checkNotNull(locale);
        return ResolvableStringUtilsKt.resolvableString$default(i, new Object[]{currencyFormatter.format(j, str, locale)}, null, 4, null);
    }
}
