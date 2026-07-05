package com.stripe.android.customersheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.customersheet.InternalCustomerSheetResult;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;", "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetContract extends ActivityResultContract<Args, InternalCustomerSheetResult> {
    public static final int $stable = 0;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) CustomerSheetActivity.class).putExtra(CardScanActivity.ARGS, input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public InternalCustomerSheetResult parseResult(int resultCode, Intent intent) {
        InternalCustomerSheetResult internalCustomerSheetResultFromIntent$paymentsheet_release = InternalCustomerSheetResult.INSTANCE.fromIntent$paymentsheet_release(intent);
        return internalCustomerSheetResultFromIntent$paymentsheet_release == null ? new InternalCustomerSheetResult.Error(new IllegalArgumentException("Failed to retrieve a CustomerSheetResult")) : internalCustomerSheetResultFromIntent$paymentsheet_release;
    }

    /* compiled from: CustomerSheetContract.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001#B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetContract$Args;", "Landroid/os/Parcelable;", "integrationType", "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "statusBarColor", "", "<init>", "(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)V", "getIntegrationType", "()Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;", "getConfiguration", "()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)Lcom/stripe/android/customersheet/CustomerSheetContract$Args;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final CustomerSheet.Configuration configuration;
        private final CustomerSheetIntegration.Type integrationType;
        private final Integer statusBarColor;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CustomerSheetContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(CustomerSheetIntegration.Type.valueOf(parcel.readString()), CustomerSheet.Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CustomerSheetIntegration.Type type, CustomerSheet.Configuration configuration, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                type = args.integrationType;
            }
            if ((i & 2) != 0) {
                configuration = args.configuration;
            }
            if ((i & 4) != 0) {
                num = args.statusBarColor;
            }
            return args.copy(type, configuration, num);
        }

        /* renamed from: component1, reason: from getter */
        public final CustomerSheetIntegration.Type getIntegrationType() {
            return this.integrationType;
        }

        /* renamed from: component2, reason: from getter */
        public final CustomerSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final Args copy(CustomerSheetIntegration.Type integrationType, CustomerSheet.Configuration configuration, Integer statusBarColor) {
            Intrinsics.checkNotNullParameter(integrationType, "integrationType");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Args(integrationType, configuration, statusBarColor);
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
            return this.integrationType == args.integrationType && Intrinsics.areEqual(this.configuration, args.configuration) && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor);
        }

        public int hashCode() {
            int iHashCode = ((this.integrationType.hashCode() * 31) + this.configuration.hashCode()) * 31;
            Integer num = this.statusBarColor;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Args(integrationType=" + this.integrationType + ", configuration=" + this.configuration + ", statusBarColor=" + this.statusBarColor + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.integrationType.name());
            this.configuration.writeToParcel(dest, flags);
            Integer num = this.statusBarColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
        }

        public Args(CustomerSheetIntegration.Type integrationType, CustomerSheet.Configuration configuration, Integer num) {
            Intrinsics.checkNotNullParameter(integrationType, "integrationType");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.integrationType = integrationType;
            this.configuration = configuration;
            this.statusBarColor = num;
        }

        public final CustomerSheetIntegration.Type getIntegrationType() {
            return this.integrationType;
        }

        public final CustomerSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        /* compiled from: CustomerSheetContract.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetContract$Args$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(CardScanActivity.ARGS);
            }
        }
    }
}
