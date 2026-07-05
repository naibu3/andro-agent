package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.PaymentFlowResult;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PollingContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PollingContract extends ActivityResultContract<Args, PaymentFlowResult.Unvalidated> {
    public static final int $stable = 0;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) PollingActivity.class).putExtras(BundleKt.bundleOf(TuplesKt.to("extra_args", input)));
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public PaymentFlowResult.Unvalidated parseResult(int resultCode, Intent intent) {
        return PaymentFlowResult.Unvalidated.INSTANCE.fromIntent(intent);
    }

    /* compiled from: PollingContract.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0001-BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u0005J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006."}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "Landroid/os/Parcelable;", "clientSecret", "", "statusBarColor", "", "timeLimitInSeconds", "initialDelayInSeconds", "maxAttempts", "ctaText", NamedConstantsKt.STRIPE_ACCOUNT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;IIIILjava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeLimitInSeconds", "()I", "getInitialDelayInSeconds", "getMaxAttempts", "getCtaText", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;IIIILjava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final String clientSecret;
        private final int ctaText;
        private final int initialDelayInSeconds;
        private final int maxAttempts;
        private final Integer statusBarColor;
        private final String stripeAccountId;
        private final int timeLimitInSeconds;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PollingContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, Integer num, int i, int i2, int i3, int i4, String str2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = args.clientSecret;
            }
            if ((i5 & 2) != 0) {
                num = args.statusBarColor;
            }
            if ((i5 & 4) != 0) {
                i = args.timeLimitInSeconds;
            }
            if ((i5 & 8) != 0) {
                i2 = args.initialDelayInSeconds;
            }
            if ((i5 & 16) != 0) {
                i3 = args.maxAttempts;
            }
            if ((i5 & 32) != 0) {
                i4 = args.ctaText;
            }
            if ((i5 & 64) != 0) {
                str2 = args.stripeAccountId;
            }
            int i6 = i4;
            String str3 = str2;
            int i7 = i3;
            int i8 = i;
            return args.copy(str, num, i8, i2, i7, i6, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTimeLimitInSeconds() {
            return this.timeLimitInSeconds;
        }

        /* renamed from: component4, reason: from getter */
        public final int getInitialDelayInSeconds() {
            return this.initialDelayInSeconds;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        /* renamed from: component6, reason: from getter */
        public final int getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component7, reason: from getter */
        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final Args copy(String clientSecret, Integer statusBarColor, int timeLimitInSeconds, int initialDelayInSeconds, int maxAttempts, int ctaText, String stripeAccountId) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new Args(clientSecret, statusBarColor, timeLimitInSeconds, initialDelayInSeconds, maxAttempts, ctaText, stripeAccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && this.timeLimitInSeconds == args.timeLimitInSeconds && this.initialDelayInSeconds == args.initialDelayInSeconds && this.maxAttempts == args.maxAttempts && this.ctaText == args.ctaText && Intrinsics.areEqual(this.stripeAccountId, args.stripeAccountId);
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            Integer num = this.statusBarColor;
            int iHashCode2 = (((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.timeLimitInSeconds)) * 31) + Integer.hashCode(this.initialDelayInSeconds)) * 31) + Integer.hashCode(this.maxAttempts)) * 31) + Integer.hashCode(this.ctaText)) * 31;
            String str = this.stripeAccountId;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Args(clientSecret=" + this.clientSecret + ", statusBarColor=" + this.statusBarColor + ", timeLimitInSeconds=" + this.timeLimitInSeconds + ", initialDelayInSeconds=" + this.initialDelayInSeconds + ", maxAttempts=" + this.maxAttempts + ", ctaText=" + this.ctaText + ", stripeAccountId=" + this.stripeAccountId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.clientSecret);
            Integer num = this.statusBarColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeInt(this.timeLimitInSeconds);
            dest.writeInt(this.initialDelayInSeconds);
            dest.writeInt(this.maxAttempts);
            dest.writeInt(this.ctaText);
            dest.writeString(this.stripeAccountId);
        }

        public Args(String clientSecret, Integer num, int i, int i2, int i3, int i4, String str) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.statusBarColor = num;
            this.timeLimitInSeconds = i;
            this.initialDelayInSeconds = i2;
            this.maxAttempts = i3;
            this.ctaText = i4;
            this.stripeAccountId = str;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final int getTimeLimitInSeconds() {
            return this.timeLimitInSeconds;
        }

        public final int getInitialDelayInSeconds() {
            return this.initialDelayInSeconds;
        }

        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        public final int getCtaText() {
            return this.ctaText;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        /* compiled from: PollingContract.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_args");
            }
        }
    }
}
