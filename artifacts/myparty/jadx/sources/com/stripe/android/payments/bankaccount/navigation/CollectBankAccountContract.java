package com.stripe.android.payments.bankaccount.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u000f\u0010\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "Result", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollectBankAccountContract extends ActivityResultContract<Args, CollectBankAccountResultInternal> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args";
    private static final String EXTRA_RESULT = "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result";

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) CollectBankAccountActivity.class).putExtra(EXTRA_ARGS, input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public CollectBankAccountResultInternal parseResult(int resultCode, Intent intent) {
        Result result;
        CollectBankAccountResultInternal collectBankAccountResult = (intent == null || (result = (Result) intent.getParcelableExtra(EXTRA_RESULT)) == null) ? null : result.getCollectBankAccountResult();
        return collectBankAccountResult == null ? new CollectBankAccountResultInternal.Failed(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult.")) : collectBankAccountResult;
    }

    /* compiled from: CollectBankAccountContract.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \"2\u00020\u0001:\u0005\u001e\u001f !\"BI\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010\u0082\u0001\u0004#$%&¨\u0006'"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "Landroid/os/Parcelable;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "attachToIntent", "", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;)V", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "getClientSecret", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getAttachToIntent", "()Z", "getFinancialConnectionsAvailability", "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "getHostedSurface", "toBundle", "Landroid/os/Bundle;", "product", "getProduct", "ForPaymentIntent", "ForSetupIntent", "ForDeferredPaymentIntent", "ForDeferredSetupIntent", "Companion", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Args implements Parcelable {
        private final boolean attachToIntent;
        private final String clientSecret;
        private final CollectBankAccountConfiguration configuration;
        private final FinancialConnectionsAvailability financialConnectionsAvailability;
        private final String hostedSurface;
        private final String publishableKey;
        private final String stripeAccountId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Args(String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z, FinancialConnectionsAvailability financialConnectionsAvailability, String str4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, collectBankAccountConfiguration, z, financialConnectionsAvailability, str4);
        }

        private Args(String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z, FinancialConnectionsAvailability financialConnectionsAvailability, String str4) {
            this.publishableKey = str;
            this.stripeAccountId = str2;
            this.clientSecret = str3;
            this.configuration = collectBankAccountConfiguration;
            this.attachToIntent = z;
            this.financialConnectionsAvailability = financialConnectionsAvailability;
            this.hostedSurface = str4;
        }

        public String getPublishableKey() {
            return this.publishableKey;
        }

        public String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public String getClientSecret() {
            return this.clientSecret;
        }

        public CollectBankAccountConfiguration getConfiguration() {
            return this.configuration;
        }

        public boolean getAttachToIntent() {
            return this.attachToIntent;
        }

        public FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
            return this.financialConnectionsAvailability;
        }

        public String getHostedSurface() {
            return this.hostedSurface;
        }

        public final Bundle toBundle() {
            return BundleKt.bundleOf(TuplesKt.to(CollectBankAccountContract.EXTRA_ARGS, this));
        }

        public final String getProduct() {
            CollectBankAccountConfiguration configuration = getConfiguration();
            if (configuration instanceof CollectBankAccountConfiguration.InstantDebits) {
                return "instant_debits";
            }
            if ((configuration instanceof CollectBankAccountConfiguration.USBankAccountInternal) || (configuration instanceof CollectBankAccountConfiguration.USBankAccount)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006."}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "attachToIntent", "", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;)V", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "getClientSecret", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getAttachToIntent", "()Z", "getFinancialConnectionsAvailability", "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "getHostedSurface", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ForPaymentIntent extends Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ForPaymentIntent> CREATOR = new Creator();
            private final boolean attachToIntent;
            private final String clientSecret;
            private final CollectBankAccountConfiguration configuration;
            private final FinancialConnectionsAvailability financialConnectionsAvailability;
            private final String hostedSurface;
            private final String publishableKey;
            private final String stripeAccountId;

            /* compiled from: CollectBankAccountContract.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ForPaymentIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForPaymentIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForPaymentIntent(parcel.readString(), parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(ForPaymentIntent.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel.readString()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForPaymentIntent[] newArray(int i) {
                    return new ForPaymentIntent[i];
                }
            }

            public static /* synthetic */ ForPaymentIntent copy$default(ForPaymentIntent forPaymentIntent, String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z, FinancialConnectionsAvailability financialConnectionsAvailability, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = forPaymentIntent.publishableKey;
                }
                if ((i & 2) != 0) {
                    str2 = forPaymentIntent.stripeAccountId;
                }
                if ((i & 4) != 0) {
                    str3 = forPaymentIntent.clientSecret;
                }
                if ((i & 8) != 0) {
                    collectBankAccountConfiguration = forPaymentIntent.configuration;
                }
                if ((i & 16) != 0) {
                    z = forPaymentIntent.attachToIntent;
                }
                if ((i & 32) != 0) {
                    financialConnectionsAvailability = forPaymentIntent.financialConnectionsAvailability;
                }
                if ((i & 64) != 0) {
                    str4 = forPaymentIntent.hostedSurface;
                }
                FinancialConnectionsAvailability financialConnectionsAvailability2 = financialConnectionsAvailability;
                String str5 = str4;
                boolean z2 = z;
                String str6 = str3;
                return forPaymentIntent.copy(str, str2, str6, collectBankAccountConfiguration, z2, financialConnectionsAvailability2, str5);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            /* renamed from: component2, reason: from getter */
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            /* renamed from: component4, reason: from getter */
            public final CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            /* renamed from: component6, reason: from getter */
            public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            /* renamed from: component7, reason: from getter */
            public final String getHostedSurface() {
                return this.hostedSurface;
            }

            public final ForPaymentIntent copy(String publishableKey, String stripeAccountId, String clientSecret, CollectBankAccountConfiguration configuration, boolean attachToIntent, FinancialConnectionsAvailability financialConnectionsAvailability, String hostedSurface) {
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new ForPaymentIntent(publishableKey, stripeAccountId, clientSecret, configuration, attachToIntent, financialConnectionsAvailability, hostedSurface);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ForPaymentIntent)) {
                    return false;
                }
                ForPaymentIntent forPaymentIntent = (ForPaymentIntent) other;
                return Intrinsics.areEqual(this.publishableKey, forPaymentIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forPaymentIntent.stripeAccountId) && Intrinsics.areEqual(this.clientSecret, forPaymentIntent.clientSecret) && Intrinsics.areEqual(this.configuration, forPaymentIntent.configuration) && this.attachToIntent == forPaymentIntent.attachToIntent && this.financialConnectionsAvailability == forPaymentIntent.financialConnectionsAvailability && Intrinsics.areEqual(this.hostedSurface, forPaymentIntent.hostedSurface);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.clientSecret.hashCode()) * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.attachToIntent)) * 31;
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                int iHashCode3 = (iHashCode2 + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31;
                String str2 = this.hostedSurface;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "ForPaymentIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", clientSecret=" + this.clientSecret + ", configuration=" + this.configuration + ", attachToIntent=" + this.attachToIntent + ", financialConnectionsAvailability=" + this.financialConnectionsAvailability + ", hostedSurface=" + this.hostedSurface + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.publishableKey);
                dest.writeString(this.stripeAccountId);
                dest.writeString(this.clientSecret);
                dest.writeParcelable(this.configuration, flags);
                dest.writeInt(this.attachToIntent ? 1 : 0);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                if (financialConnectionsAvailability == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(financialConnectionsAvailability.name());
                }
                dest.writeString(this.hostedSurface);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForPaymentIntent(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration, boolean z, FinancialConnectionsAvailability financialConnectionsAvailability, String str2) {
                super(publishableKey, str, clientSecret, configuration, z, financialConnectionsAvailability, str2, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z;
                this.financialConnectionsAvailability = financialConnectionsAvailability;
                this.hostedSurface = str2;
            }
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006."}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForSetupIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "attachToIntent", "", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;ZLcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;)V", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "getClientSecret", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getAttachToIntent", "()Z", "getFinancialConnectionsAvailability", "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "getHostedSurface", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ForSetupIntent extends Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ForSetupIntent> CREATOR = new Creator();
            private final boolean attachToIntent;
            private final String clientSecret;
            private final CollectBankAccountConfiguration configuration;
            private final FinancialConnectionsAvailability financialConnectionsAvailability;
            private final String hostedSurface;
            private final String publishableKey;
            private final String stripeAccountId;

            /* compiled from: CollectBankAccountContract.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ForSetupIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForSetupIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForSetupIntent(parcel.readString(), parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(ForSetupIntent.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel.readString()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForSetupIntent[] newArray(int i) {
                    return new ForSetupIntent[i];
                }
            }

            public static /* synthetic */ ForSetupIntent copy$default(ForSetupIntent forSetupIntent, String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, boolean z, FinancialConnectionsAvailability financialConnectionsAvailability, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = forSetupIntent.publishableKey;
                }
                if ((i & 2) != 0) {
                    str2 = forSetupIntent.stripeAccountId;
                }
                if ((i & 4) != 0) {
                    str3 = forSetupIntent.clientSecret;
                }
                if ((i & 8) != 0) {
                    collectBankAccountConfiguration = forSetupIntent.configuration;
                }
                if ((i & 16) != 0) {
                    z = forSetupIntent.attachToIntent;
                }
                if ((i & 32) != 0) {
                    financialConnectionsAvailability = forSetupIntent.financialConnectionsAvailability;
                }
                if ((i & 64) != 0) {
                    str4 = forSetupIntent.hostedSurface;
                }
                FinancialConnectionsAvailability financialConnectionsAvailability2 = financialConnectionsAvailability;
                String str5 = str4;
                boolean z2 = z;
                String str6 = str3;
                return forSetupIntent.copy(str, str2, str6, collectBankAccountConfiguration, z2, financialConnectionsAvailability2, str5);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            /* renamed from: component2, reason: from getter */
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            /* renamed from: component4, reason: from getter */
            public final CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            /* renamed from: component6, reason: from getter */
            public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            /* renamed from: component7, reason: from getter */
            public final String getHostedSurface() {
                return this.hostedSurface;
            }

            public final ForSetupIntent copy(String publishableKey, String stripeAccountId, String clientSecret, CollectBankAccountConfiguration configuration, boolean attachToIntent, FinancialConnectionsAvailability financialConnectionsAvailability, String hostedSurface) {
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new ForSetupIntent(publishableKey, stripeAccountId, clientSecret, configuration, attachToIntent, financialConnectionsAvailability, hostedSurface);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ForSetupIntent)) {
                    return false;
                }
                ForSetupIntent forSetupIntent = (ForSetupIntent) other;
                return Intrinsics.areEqual(this.publishableKey, forSetupIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forSetupIntent.stripeAccountId) && Intrinsics.areEqual(this.clientSecret, forSetupIntent.clientSecret) && Intrinsics.areEqual(this.configuration, forSetupIntent.configuration) && this.attachToIntent == forSetupIntent.attachToIntent && this.financialConnectionsAvailability == forSetupIntent.financialConnectionsAvailability && Intrinsics.areEqual(this.hostedSurface, forSetupIntent.hostedSurface);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.clientSecret.hashCode()) * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.attachToIntent)) * 31;
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                int iHashCode3 = (iHashCode2 + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31;
                String str2 = this.hostedSurface;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "ForSetupIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", clientSecret=" + this.clientSecret + ", configuration=" + this.configuration + ", attachToIntent=" + this.attachToIntent + ", financialConnectionsAvailability=" + this.financialConnectionsAvailability + ", hostedSurface=" + this.hostedSurface + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.publishableKey);
                dest.writeString(this.stripeAccountId);
                dest.writeString(this.clientSecret);
                dest.writeParcelable(this.configuration, flags);
                dest.writeInt(this.attachToIntent ? 1 : 0);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                if (financialConnectionsAvailability == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(financialConnectionsAvailability.name());
                }
                dest.writeString(this.hostedSurface);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForSetupIntent(String publishableKey, String str, String clientSecret, CollectBankAccountConfiguration configuration, boolean z, FinancialConnectionsAvailability financialConnectionsAvailability, String str2) {
                super(publishableKey, str, clientSecret, configuration, z, financialConnectionsAvailability, str2, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z;
                this.financialConnectionsAvailability = financialConnectionsAvailability;
                this.hostedSurface = str2;
            }
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0080\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u000eJ\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u000eHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00069"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "hostedSurface", "elementsSessionId", "customerId", "onBehalfOf", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getFinancialConnectionsAvailability", "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "getHostedSurface", "getElementsSessionId", "getCustomerId", "getOnBehalfOf", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredPaymentIntent;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ForDeferredPaymentIntent extends Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ForDeferredPaymentIntent> CREATOR = new Creator();
            private final Integer amount;
            private final CollectBankAccountConfiguration configuration;
            private final String currency;
            private final String customerId;
            private final String elementsSessionId;
            private final FinancialConnectionsAvailability financialConnectionsAvailability;
            private final String hostedSurface;
            private final String onBehalfOf;
            private final String publishableKey;
            private final String stripeAccountId;

            /* compiled from: CollectBankAccountContract.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ForDeferredPaymentIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForDeferredPaymentIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForDeferredPaymentIntent(parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(ForDeferredPaymentIntent.class.getClassLoader()), parcel.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForDeferredPaymentIntent[] newArray(int i) {
                    return new ForDeferredPaymentIntent[i];
                }
            }

            public static /* synthetic */ ForDeferredPaymentIntent copy$default(ForDeferredPaymentIntent forDeferredPaymentIntent, String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, FinancialConnectionsAvailability financialConnectionsAvailability, String str3, String str4, String str5, String str6, Integer num, String str7, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = forDeferredPaymentIntent.publishableKey;
                }
                if ((i & 2) != 0) {
                    str2 = forDeferredPaymentIntent.stripeAccountId;
                }
                if ((i & 4) != 0) {
                    collectBankAccountConfiguration = forDeferredPaymentIntent.configuration;
                }
                if ((i & 8) != 0) {
                    financialConnectionsAvailability = forDeferredPaymentIntent.financialConnectionsAvailability;
                }
                if ((i & 16) != 0) {
                    str3 = forDeferredPaymentIntent.hostedSurface;
                }
                if ((i & 32) != 0) {
                    str4 = forDeferredPaymentIntent.elementsSessionId;
                }
                if ((i & 64) != 0) {
                    str5 = forDeferredPaymentIntent.customerId;
                }
                if ((i & 128) != 0) {
                    str6 = forDeferredPaymentIntent.onBehalfOf;
                }
                if ((i & 256) != 0) {
                    num = forDeferredPaymentIntent.amount;
                }
                if ((i & 512) != 0) {
                    str7 = forDeferredPaymentIntent.currency;
                }
                Integer num2 = num;
                String str8 = str7;
                String str9 = str5;
                String str10 = str6;
                String str11 = str3;
                String str12 = str4;
                return forDeferredPaymentIntent.copy(str, str2, collectBankAccountConfiguration, financialConnectionsAvailability, str11, str12, str9, str10, num2, str8);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            /* renamed from: component10, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            /* renamed from: component2, reason: from getter */
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* renamed from: component3, reason: from getter */
            public final CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            /* renamed from: component4, reason: from getter */
            public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            /* renamed from: component5, reason: from getter */
            public final String getHostedSurface() {
                return this.hostedSurface;
            }

            /* renamed from: component6, reason: from getter */
            public final String getElementsSessionId() {
                return this.elementsSessionId;
            }

            /* renamed from: component7, reason: from getter */
            public final String getCustomerId() {
                return this.customerId;
            }

            /* renamed from: component8, reason: from getter */
            public final String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            /* renamed from: component9, reason: from getter */
            public final Integer getAmount() {
                return this.amount;
            }

            public final ForDeferredPaymentIntent copy(String publishableKey, String stripeAccountId, CollectBankAccountConfiguration configuration, FinancialConnectionsAvailability financialConnectionsAvailability, String hostedSurface, String elementsSessionId, String customerId, String onBehalfOf, Integer amount, String currency) {
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
                return new ForDeferredPaymentIntent(publishableKey, stripeAccountId, configuration, financialConnectionsAvailability, hostedSurface, elementsSessionId, customerId, onBehalfOf, amount, currency);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ForDeferredPaymentIntent)) {
                    return false;
                }
                ForDeferredPaymentIntent forDeferredPaymentIntent = (ForDeferredPaymentIntent) other;
                return Intrinsics.areEqual(this.publishableKey, forDeferredPaymentIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forDeferredPaymentIntent.stripeAccountId) && Intrinsics.areEqual(this.configuration, forDeferredPaymentIntent.configuration) && this.financialConnectionsAvailability == forDeferredPaymentIntent.financialConnectionsAvailability && Intrinsics.areEqual(this.hostedSurface, forDeferredPaymentIntent.hostedSurface) && Intrinsics.areEqual(this.elementsSessionId, forDeferredPaymentIntent.elementsSessionId) && Intrinsics.areEqual(this.customerId, forDeferredPaymentIntent.customerId) && Intrinsics.areEqual(this.onBehalfOf, forDeferredPaymentIntent.onBehalfOf) && Intrinsics.areEqual(this.amount, forDeferredPaymentIntent.amount) && Intrinsics.areEqual(this.currency, forDeferredPaymentIntent.currency);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.configuration.hashCode()) * 31;
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                int iHashCode3 = (iHashCode2 + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31;
                String str2 = this.hostedSurface;
                int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.elementsSessionId.hashCode()) * 31;
                String str3 = this.customerId;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.onBehalfOf;
                int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.amount;
                int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.currency;
                return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
            }

            public String toString() {
                return "ForDeferredPaymentIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", configuration=" + this.configuration + ", financialConnectionsAvailability=" + this.financialConnectionsAvailability + ", hostedSurface=" + this.hostedSurface + ", elementsSessionId=" + this.elementsSessionId + ", customerId=" + this.customerId + ", onBehalfOf=" + this.onBehalfOf + ", amount=" + this.amount + ", currency=" + this.currency + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.publishableKey);
                dest.writeString(this.stripeAccountId);
                dest.writeParcelable(this.configuration, flags);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                if (financialConnectionsAvailability == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(financialConnectionsAvailability.name());
                }
                dest.writeString(this.hostedSurface);
                dest.writeString(this.elementsSessionId);
                dest.writeString(this.customerId);
                dest.writeString(this.onBehalfOf);
                Integer num = this.amount;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(num.intValue());
                }
                dest.writeString(this.currency);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            public final String getElementsSessionId() {
                return this.elementsSessionId;
            }

            public final String getCustomerId() {
                return this.customerId;
            }

            public final String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public final Integer getAmount() {
                return this.amount;
            }

            public final String getCurrency() {
                return this.currency;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForDeferredPaymentIntent(String publishableKey, String str, CollectBankAccountConfiguration configuration, FinancialConnectionsAvailability financialConnectionsAvailability, String str2, String elementsSessionId, String str3, String str4, Integer num, String str5) {
                super(publishableKey, str, null, configuration, false, financialConnectionsAvailability, str2, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.configuration = configuration;
                this.financialConnectionsAvailability = financialConnectionsAvailability;
                this.hostedSurface = str2;
                this.elementsSessionId = elementsSessionId;
                this.customerId = str3;
                this.onBehalfOf = str4;
                this.amount = num;
                this.currency = str5;
            }
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u00060"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$ForDeferredSetupIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "hostedSurface", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "elementsSessionId", "customerId", "onBehalfOf", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "getConfiguration", "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "getHostedSurface", "getFinancialConnectionsAvailability", "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "getElementsSessionId", "getCustomerId", "getOnBehalfOf", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ForDeferredSetupIntent extends Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ForDeferredSetupIntent> CREATOR = new Creator();
            private final CollectBankAccountConfiguration configuration;
            private final String customerId;
            private final String elementsSessionId;
            private final FinancialConnectionsAvailability financialConnectionsAvailability;
            private final String hostedSurface;
            private final String onBehalfOf;
            private final String publishableKey;
            private final String stripeAccountId;

            /* compiled from: CollectBankAccountContract.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ForDeferredSetupIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForDeferredSetupIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForDeferredSetupIntent(parcel.readString(), parcel.readString(), (CollectBankAccountConfiguration) parcel.readParcelable(ForDeferredSetupIntent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForDeferredSetupIntent[] newArray(int i) {
                    return new ForDeferredSetupIntent[i];
                }
            }

            public static /* synthetic */ ForDeferredSetupIntent copy$default(ForDeferredSetupIntent forDeferredSetupIntent, String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, String str3, FinancialConnectionsAvailability financialConnectionsAvailability, String str4, String str5, String str6, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = forDeferredSetupIntent.publishableKey;
                }
                if ((i & 2) != 0) {
                    str2 = forDeferredSetupIntent.stripeAccountId;
                }
                if ((i & 4) != 0) {
                    collectBankAccountConfiguration = forDeferredSetupIntent.configuration;
                }
                if ((i & 8) != 0) {
                    str3 = forDeferredSetupIntent.hostedSurface;
                }
                if ((i & 16) != 0) {
                    financialConnectionsAvailability = forDeferredSetupIntent.financialConnectionsAvailability;
                }
                if ((i & 32) != 0) {
                    str4 = forDeferredSetupIntent.elementsSessionId;
                }
                if ((i & 64) != 0) {
                    str5 = forDeferredSetupIntent.customerId;
                }
                if ((i & 128) != 0) {
                    str6 = forDeferredSetupIntent.onBehalfOf;
                }
                String str7 = str5;
                String str8 = str6;
                FinancialConnectionsAvailability financialConnectionsAvailability2 = financialConnectionsAvailability;
                String str9 = str4;
                return forDeferredSetupIntent.copy(str, str2, collectBankAccountConfiguration, str3, financialConnectionsAvailability2, str9, str7, str8);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPublishableKey() {
                return this.publishableKey;
            }

            /* renamed from: component2, reason: from getter */
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* renamed from: component3, reason: from getter */
            public final CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            /* renamed from: component4, reason: from getter */
            public final String getHostedSurface() {
                return this.hostedSurface;
            }

            /* renamed from: component5, reason: from getter */
            public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            /* renamed from: component6, reason: from getter */
            public final String getElementsSessionId() {
                return this.elementsSessionId;
            }

            /* renamed from: component7, reason: from getter */
            public final String getCustomerId() {
                return this.customerId;
            }

            /* renamed from: component8, reason: from getter */
            public final String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public final ForDeferredSetupIntent copy(String publishableKey, String stripeAccountId, CollectBankAccountConfiguration configuration, String hostedSurface, FinancialConnectionsAvailability financialConnectionsAvailability, String elementsSessionId, String customerId, String onBehalfOf) {
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
                return new ForDeferredSetupIntent(publishableKey, stripeAccountId, configuration, hostedSurface, financialConnectionsAvailability, elementsSessionId, customerId, onBehalfOf);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ForDeferredSetupIntent)) {
                    return false;
                }
                ForDeferredSetupIntent forDeferredSetupIntent = (ForDeferredSetupIntent) other;
                return Intrinsics.areEqual(this.publishableKey, forDeferredSetupIntent.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, forDeferredSetupIntent.stripeAccountId) && Intrinsics.areEqual(this.configuration, forDeferredSetupIntent.configuration) && Intrinsics.areEqual(this.hostedSurface, forDeferredSetupIntent.hostedSurface) && this.financialConnectionsAvailability == forDeferredSetupIntent.financialConnectionsAvailability && Intrinsics.areEqual(this.elementsSessionId, forDeferredSetupIntent.elementsSessionId) && Intrinsics.areEqual(this.customerId, forDeferredSetupIntent.customerId) && Intrinsics.areEqual(this.onBehalfOf, forDeferredSetupIntent.onBehalfOf);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.configuration.hashCode()) * 31;
                String str2 = this.hostedSurface;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                int iHashCode4 = (((iHashCode3 + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31) + this.elementsSessionId.hashCode()) * 31;
                String str3 = this.customerId;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.onBehalfOf;
                return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "ForDeferredSetupIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", configuration=" + this.configuration + ", hostedSurface=" + this.hostedSurface + ", financialConnectionsAvailability=" + this.financialConnectionsAvailability + ", elementsSessionId=" + this.elementsSessionId + ", customerId=" + this.customerId + ", onBehalfOf=" + this.onBehalfOf + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.publishableKey);
                dest.writeString(this.stripeAccountId);
                dest.writeParcelable(this.configuration, flags);
                dest.writeString(this.hostedSurface);
                FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
                if (financialConnectionsAvailability == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(financialConnectionsAvailability.name());
                }
                dest.writeString(this.elementsSessionId);
                dest.writeString(this.customerId);
                dest.writeString(this.onBehalfOf);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public CollectBankAccountConfiguration getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.Args
            public FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
                return this.financialConnectionsAvailability;
            }

            public final String getElementsSessionId() {
                return this.elementsSessionId;
            }

            public final String getCustomerId() {
                return this.customerId;
            }

            public final String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForDeferredSetupIntent(String publishableKey, String str, CollectBankAccountConfiguration configuration, String str2, FinancialConnectionsAvailability financialConnectionsAvailability, String elementsSessionId, String str3, String str4) {
                super(publishableKey, str, null, configuration, false, financialConnectionsAvailability, str2, null);
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.configuration = configuration;
                this.hostedSurface = str2;
                this.financialConnectionsAvailability = financialConnectionsAvailability;
                this.elementsSessionId = elementsSessionId;
                this.customerId = str3;
                this.onBehalfOf = str4;
            }
        }

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(CollectBankAccountContract.EXTRA_ARGS);
            }
        }
    }

    /* compiled from: CollectBankAccountContract.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Result;", "Landroid/os/Parcelable;", "collectBankAccountResult", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)V", "getCollectBankAccountResult", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "toBundle", "Landroid/os/Bundle;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {
        private final CollectBankAccountResultInternal collectBankAccountResult;
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CollectBankAccountContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result((CollectBankAccountResultInternal) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public static /* synthetic */ Result copy$default(Result result, CollectBankAccountResultInternal collectBankAccountResultInternal, int i, Object obj) {
            if ((i & 1) != 0) {
                collectBankAccountResultInternal = result.collectBankAccountResult;
            }
            return result.copy(collectBankAccountResultInternal);
        }

        /* renamed from: component1, reason: from getter */
        public final CollectBankAccountResultInternal getCollectBankAccountResult() {
            return this.collectBankAccountResult;
        }

        public final Result copy(CollectBankAccountResultInternal collectBankAccountResult) {
            Intrinsics.checkNotNullParameter(collectBankAccountResult, "collectBankAccountResult");
            return new Result(collectBankAccountResult);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && Intrinsics.areEqual(this.collectBankAccountResult, ((Result) other).collectBankAccountResult);
        }

        public int hashCode() {
            return this.collectBankAccountResult.hashCode();
        }

        public String toString() {
            return "Result(collectBankAccountResult=" + this.collectBankAccountResult + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.collectBankAccountResult, flags);
        }

        public Result(CollectBankAccountResultInternal collectBankAccountResult) {
            Intrinsics.checkNotNullParameter(collectBankAccountResult, "collectBankAccountResult");
            this.collectBankAccountResult = collectBankAccountResult;
        }

        public final CollectBankAccountResultInternal getCollectBankAccountResult() {
            return this.collectBankAccountResult;
        }

        public final Bundle toBundle() {
            return BundleKt.bundleOf(TuplesKt.to(CollectBankAccountContract.EXTRA_RESULT, this));
        }
    }

    /* compiled from: CollectBankAccountContract.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Companion;", "", "<init>", "()V", "EXTRA_ARGS", "", "getEXTRA_ARGS$annotations", "EXTRA_RESULT", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEXTRA_ARGS$annotations() {
        }

        private Companion() {
        }
    }
}
