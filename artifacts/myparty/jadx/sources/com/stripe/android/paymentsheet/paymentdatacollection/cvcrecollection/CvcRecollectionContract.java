package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.model.CardBrand;
import com.stripe.android.paymentsheet.PaymentSheet;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcRecollectionContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$Args;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CvcRecollectionContract extends ActivityResultContract<Args, CvcRecollectionResult> {
    public static final int $stable = 0;
    public static final String EXTRA_ARGS = "extra_activity_args";

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) CvcRecollectionActivity.class).putExtra("extra_activity_args", input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public CvcRecollectionResult parseResult(int resultCode, Intent intent) {
        return CvcRecollectionResult.INSTANCE.fromIntent(intent);
    }

    /* compiled from: CvcRecollectionContract.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006%"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$Args;", "Landroid/os/Parcelable;", "lastFour", "", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "isTestMode", "", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Z)V", "getLastFour", "()Ljava/lang/String;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        private final PaymentSheet.Appearance appearance;
        private final CardBrand cardBrand;
        private final boolean isTestMode;
        private final String lastFour;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        /* compiled from: CvcRecollectionContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), CardBrand.valueOf(parcel.readString()), PaymentSheet.Appearance.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, CardBrand cardBrand, PaymentSheet.Appearance appearance, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.lastFour;
            }
            if ((i & 2) != 0) {
                cardBrand = args.cardBrand;
            }
            if ((i & 4) != 0) {
                appearance = args.appearance;
            }
            if ((i & 8) != 0) {
                z = args.isTestMode;
            }
            return args.copy(str, cardBrand, appearance, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLastFour() {
            return this.lastFour;
        }

        /* renamed from: component2, reason: from getter */
        public final CardBrand getCardBrand() {
            return this.cardBrand;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsTestMode() {
            return this.isTestMode;
        }

        public final Args copy(String lastFour, CardBrand cardBrand, PaymentSheet.Appearance appearance, boolean isTestMode) {
            Intrinsics.checkNotNullParameter(lastFour, "lastFour");
            Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            return new Args(lastFour, cardBrand, appearance, isTestMode);
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
            return Intrinsics.areEqual(this.lastFour, args.lastFour) && this.cardBrand == args.cardBrand && Intrinsics.areEqual(this.appearance, args.appearance) && this.isTestMode == args.isTestMode;
        }

        public int hashCode() {
            return (((((this.lastFour.hashCode() * 31) + this.cardBrand.hashCode()) * 31) + this.appearance.hashCode()) * 31) + Boolean.hashCode(this.isTestMode);
        }

        public String toString() {
            return "Args(lastFour=" + this.lastFour + ", cardBrand=" + this.cardBrand + ", appearance=" + this.appearance + ", isTestMode=" + this.isTestMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.lastFour);
            dest.writeString(this.cardBrand.name());
            this.appearance.writeToParcel(dest, flags);
            dest.writeInt(this.isTestMode ? 1 : 0);
        }

        public Args(String lastFour, CardBrand cardBrand, PaymentSheet.Appearance appearance, boolean z) {
            Intrinsics.checkNotNullParameter(lastFour, "lastFour");
            Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            this.lastFour = lastFour;
            this.cardBrand = cardBrand;
            this.appearance = appearance;
            this.isTestMode = z;
        }

        public final String getLastFour() {
            return this.lastFour;
        }

        public final CardBrand getCardBrand() {
            return this.cardBrand;
        }

        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        public final boolean isTestMode() {
            return this.isTestMode;
        }

        /* compiled from: CvcRecollectionContract.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$Args$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return (Args) BundleCompat.getParcelable(extras, "extra_activity_args", Args.class);
                }
                return null;
            }
        }
    }
}
