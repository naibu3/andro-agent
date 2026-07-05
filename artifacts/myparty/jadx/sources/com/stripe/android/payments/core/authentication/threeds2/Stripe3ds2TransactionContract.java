package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.BankAccountJsonParser;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3ds2TransactionContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionContract extends ActivityResultContract<Args, PaymentFlowResult.Unvalidated> {
    public static final int $stable = 0;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) Stripe3ds2TransactionActivity.class).putExtras(input.toBundle());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public PaymentFlowResult.Unvalidated parseResult(int resultCode, Intent intent) {
        return PaymentFlowResult.Unvalidated.INSTANCE.fromIntent(intent);
    }

    /* compiled from: Stripe3ds2TransactionContract.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0001EBW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010-\u001a\u00020.J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00106\u001a\u00020\u0011HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013HÆ\u0003Jp\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013HÆ\u0001¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020\u000fJ\u0013\u0010;\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u000fHÖ\u0001J\t\u0010?\u001a\u00020\u0011HÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006F"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Landroid/os/Parcelable;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", NamedConstantsKt.ENABLE_LOGGING, "", "statusBarColor", "", "publishableKey", "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;Lcom/stripe/android/core/networking/ApiRequest$Options;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/Set;)V", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getConfig", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "getRequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "getEnableLogging", "()Z", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPublishableKey", "()Ljava/lang/String;", "getProductUsage", "()Ljava/util/Set;", BankAccountJsonParser.FIELD_FINGERPRINT, "Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "getFingerprint", "()Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "toBundle", "Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;Lcom/stripe/android/core/networking/ApiRequest$Options;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private static final String EXTRA_ARGS = "extra_args";
        private final PaymentAuthConfig.Stripe3ds2Config config;
        private final boolean enableLogging;
        private final StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData;
        private final Set<String> productUsage;
        private final String publishableKey;
        private final ApiRequest.Options requestOptions;
        private final SdkTransactionId sdkTransactionId;
        private final Integer statusBarColor;
        private final StripeIntent stripeIntent;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: Stripe3ds2TransactionContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                SdkTransactionId sdkTransactionId = (SdkTransactionId) parcel.readParcelable(Args.class.getClassLoader());
                PaymentAuthConfig.Stripe3ds2Config stripe3ds2ConfigCreateFromParcel = PaymentAuthConfig.Stripe3ds2Config.CREATOR.createFromParcel(parcel);
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Args.class.getClassLoader());
                StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2CreateFromParcel = StripeIntent.NextActionData.SdkData.Use3DS2.CREATOR.createFromParcel(parcel);
                ApiRequest.Options options = (ApiRequest.Options) parcel.readParcelable(Args.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(sdkTransactionId, stripe3ds2ConfigCreateFromParcel, stripeIntent, use3DS2CreateFromParcel, options, z, numValueOf, string, linkedHashSet);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, SdkTransactionId sdkTransactionId, PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config, StripeIntent stripeIntent, StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2, ApiRequest.Options options, boolean z, Integer num, String str, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                sdkTransactionId = args.sdkTransactionId;
            }
            if ((i & 2) != 0) {
                stripe3ds2Config = args.config;
            }
            if ((i & 4) != 0) {
                stripeIntent = args.stripeIntent;
            }
            if ((i & 8) != 0) {
                use3DS2 = args.nextActionData;
            }
            if ((i & 16) != 0) {
                options = args.requestOptions;
            }
            if ((i & 32) != 0) {
                z = args.enableLogging;
            }
            if ((i & 64) != 0) {
                num = args.statusBarColor;
            }
            if ((i & 128) != 0) {
                str = args.publishableKey;
            }
            if ((i & 256) != 0) {
                set = args.productUsage;
            }
            String str2 = str;
            Set set2 = set;
            boolean z2 = z;
            Integer num2 = num;
            ApiRequest.Options options2 = options;
            StripeIntent stripeIntent2 = stripeIntent;
            return args.copy(sdkTransactionId, stripe3ds2Config, stripeIntent2, use3DS2, options2, z2, num2, str2, set2);
        }

        /* renamed from: component1, reason: from getter */
        public final SdkTransactionId getSdkTransactionId() {
            return this.sdkTransactionId;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentAuthConfig.Stripe3ds2Config getConfig() {
            return this.config;
        }

        /* renamed from: component3, reason: from getter */
        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        /* renamed from: component4, reason: from getter */
        public final StripeIntent.NextActionData.SdkData.Use3DS2 getNextActionData() {
            return this.nextActionData;
        }

        /* renamed from: component5, reason: from getter */
        public final ApiRequest.Options getRequestOptions() {
            return this.requestOptions;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final Set<String> component9() {
            return this.productUsage;
        }

        public final Args copy(SdkTransactionId sdkTransactionId, PaymentAuthConfig.Stripe3ds2Config config, StripeIntent stripeIntent, StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData, ApiRequest.Options requestOptions, boolean enableLogging, Integer statusBarColor, String publishableKey, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(nextActionData, "nextActionData");
            Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            return new Args(sdkTransactionId, config, stripeIntent, nextActionData, requestOptions, enableLogging, statusBarColor, publishableKey, productUsage);
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
            return Intrinsics.areEqual(this.sdkTransactionId, args.sdkTransactionId) && Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.stripeIntent, args.stripeIntent) && Intrinsics.areEqual(this.nextActionData, args.nextActionData) && Intrinsics.areEqual(this.requestOptions, args.requestOptions) && this.enableLogging == args.enableLogging && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.publishableKey, args.publishableKey) && Intrinsics.areEqual(this.productUsage, args.productUsage);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.sdkTransactionId.hashCode() * 31) + this.config.hashCode()) * 31) + this.stripeIntent.hashCode()) * 31) + this.nextActionData.hashCode()) * 31) + this.requestOptions.hashCode()) * 31) + Boolean.hashCode(this.enableLogging)) * 31;
            Integer num = this.statusBarColor;
            return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.publishableKey.hashCode()) * 31) + this.productUsage.hashCode();
        }

        public String toString() {
            return "Args(sdkTransactionId=" + this.sdkTransactionId + ", config=" + this.config + ", stripeIntent=" + this.stripeIntent + ", nextActionData=" + this.nextActionData + ", requestOptions=" + this.requestOptions + ", enableLogging=" + this.enableLogging + ", statusBarColor=" + this.statusBarColor + ", publishableKey=" + this.publishableKey + ", productUsage=" + this.productUsage + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.sdkTransactionId, flags);
            this.config.writeToParcel(dest, flags);
            dest.writeParcelable(this.stripeIntent, flags);
            this.nextActionData.writeToParcel(dest, flags);
            dest.writeParcelable(this.requestOptions, flags);
            dest.writeInt(this.enableLogging ? 1 : 0);
            Integer num = this.statusBarColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeString(this.publishableKey);
            Set<String> set = this.productUsage;
            dest.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next());
            }
        }

        public Args(SdkTransactionId sdkTransactionId, PaymentAuthConfig.Stripe3ds2Config config, StripeIntent stripeIntent, StripeIntent.NextActionData.SdkData.Use3DS2 nextActionData, ApiRequest.Options requestOptions, boolean z, Integer num, String publishableKey, Set<String> productUsage) {
            Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(nextActionData, "nextActionData");
            Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            this.sdkTransactionId = sdkTransactionId;
            this.config = config;
            this.stripeIntent = stripeIntent;
            this.nextActionData = nextActionData;
            this.requestOptions = requestOptions;
            this.enableLogging = z;
            this.statusBarColor = num;
            this.publishableKey = publishableKey;
            this.productUsage = productUsage;
        }

        public final SdkTransactionId getSdkTransactionId() {
            return this.sdkTransactionId;
        }

        public final PaymentAuthConfig.Stripe3ds2Config getConfig() {
            return this.config;
        }

        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        public final StripeIntent.NextActionData.SdkData.Use3DS2 getNextActionData() {
            return this.nextActionData;
        }

        public final ApiRequest.Options getRequestOptions() {
            return this.requestOptions;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public final Set<String> getProductUsage() {
            return this.productUsage;
        }

        public final Stripe3ds2Fingerprint getFingerprint() {
            return new Stripe3ds2Fingerprint(this.nextActionData);
        }

        public final Bundle toBundle() {
            return BundleKt.bundleOf(TuplesKt.to(EXTRA_ARGS, this));
        }

        /* compiled from: Stripe3ds2TransactionContract.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args$Companion;", "", "<init>", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(Args.EXTRA_ARGS);
            }
        }
    }
}
