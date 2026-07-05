package com.stripe.android.financialconnections;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheet.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\u00020\u000b*\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;", "", "financialConnectionsSheetLauncher", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "<init>", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;)V", "present", "", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "toInternal", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "Configuration", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheet {
    private final FinancialConnectionsSheetLauncher financialConnectionsSheetLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FinancialConnectionsSheet create(ComponentActivity componentActivity, FinancialConnectionsSheetResultCallback financialConnectionsSheetResultCallback) {
        return INSTANCE.create(componentActivity, financialConnectionsSheetResultCallback);
    }

    @JvmStatic
    public static final FinancialConnectionsSheet create(Fragment fragment, FinancialConnectionsSheetResultCallback financialConnectionsSheetResultCallback) {
        return INSTANCE.create(fragment, financialConnectionsSheetResultCallback);
    }

    @JvmStatic
    public static final FinancialConnectionsSheet createForBankAccountToken(ComponentActivity componentActivity, FinancialConnectionsSheetResultForTokenCallback financialConnectionsSheetResultForTokenCallback) {
        return INSTANCE.createForBankAccountToken(componentActivity, financialConnectionsSheetResultForTokenCallback);
    }

    @JvmStatic
    public static final FinancialConnectionsSheet createForBankAccountToken(Fragment fragment, FinancialConnectionsSheetResultForTokenCallback financialConnectionsSheetResultForTokenCallback) {
        return INSTANCE.createForBankAccountToken(fragment, financialConnectionsSheetResultForTokenCallback);
    }

    public FinancialConnectionsSheet(FinancialConnectionsSheetLauncher financialConnectionsSheetLauncher) {
        Intrinsics.checkNotNullParameter(financialConnectionsSheetLauncher, "financialConnectionsSheetLauncher");
        this.financialConnectionsSheetLauncher = financialConnectionsSheetLauncher;
    }

    /* compiled from: FinancialConnectionsSheet.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "Landroid/os/Parcelable;", "financialConnectionsSessionClientSecret", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFinancialConnectionsSessionClientSecret", "()Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {
        private final String financialConnectionsSessionClientSecret;
        private final String publishableKey;
        private final String stripeAccountId;
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: FinancialConnectionsSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Configuration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Configuration(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = configuration.financialConnectionsSessionClientSecret;
            }
            if ((i & 2) != 0) {
                str2 = configuration.publishableKey;
            }
            if ((i & 4) != 0) {
                str3 = configuration.stripeAccountId;
            }
            return configuration.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFinancialConnectionsSessionClientSecret() {
            return this.financialConnectionsSessionClientSecret;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPublishableKey() {
            return this.publishableKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final Configuration copy(String financialConnectionsSessionClientSecret, String publishableKey, String stripeAccountId) {
            Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            return new Configuration(financialConnectionsSessionClientSecret, publishableKey, stripeAccountId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return Intrinsics.areEqual(this.financialConnectionsSessionClientSecret, configuration.financialConnectionsSessionClientSecret) && Intrinsics.areEqual(this.publishableKey, configuration.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, configuration.stripeAccountId);
        }

        public int hashCode() {
            int iHashCode = ((this.financialConnectionsSessionClientSecret.hashCode() * 31) + this.publishableKey.hashCode()) * 31;
            String str = this.stripeAccountId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Configuration(financialConnectionsSessionClientSecret=" + this.financialConnectionsSessionClientSecret + ", publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.financialConnectionsSessionClientSecret);
            dest.writeString(this.publishableKey);
            dest.writeString(this.stripeAccountId);
        }

        public Configuration(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
            Intrinsics.checkNotNullParameter(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            this.financialConnectionsSessionClientSecret = financialConnectionsSessionClientSecret;
            this.publishableKey = publishableKey;
            this.stripeAccountId = str;
        }

        public /* synthetic */ Configuration(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        public final String getFinancialConnectionsSessionClientSecret() {
            return this.financialConnectionsSessionClientSecret;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }
    }

    public final void present(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.financialConnectionsSheetLauncher.present(toInternal(configuration), null);
    }

    private final FinancialConnectionsSheetConfiguration toInternal(Configuration configuration) {
        return new FinancialConnectionsSheetConfiguration(configuration.getFinancialConnectionsSessionClientSecret(), configuration.getPublishableKey(), configuration.getStripeAccountId());
    }

    /* compiled from: FinancialConnectionsSheet.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rH\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;", "fragment", "Landroidx/fragment/app/Fragment;", "createForBankAccountToken", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FinancialConnectionsSheet create(ComponentActivity activity, FinancialConnectionsSheetResultCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForDataLauncher(activity, FinancialConnectionsSheetKt.intentBuilder(activity), callback));
        }

        @JvmStatic
        public final FinancialConnectionsSheet create(Fragment fragment, FinancialConnectionsSheetResultCallback callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Context contextRequireContext = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForDataLauncher(fragment, FinancialConnectionsSheetKt.intentBuilder(contextRequireContext), callback));
        }

        @JvmStatic
        public final FinancialConnectionsSheet createForBankAccountToken(ComponentActivity activity, FinancialConnectionsSheetResultForTokenCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForTokenLauncher(activity, FinancialConnectionsSheetKt.intentBuilder(activity), callback));
        }

        @JvmStatic
        public final FinancialConnectionsSheet createForBankAccountToken(Fragment fragment, FinancialConnectionsSheetResultForTokenCallback callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Context contextRequireContext = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForTokenLauncher(fragment, FinancialConnectionsSheetKt.intentBuilder(contextRequireContext), callback));
        }
    }
}
