package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.view.ActivityStarter;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetContract.kt */
@Deprecated(message = "This isn't meant for public usage and will be removed in a future release. If you're looking to integrate with PaymentSheet in Compose, use rememberPaymentSheet() instead.")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u000f\u0010\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "Result", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetContract extends ActivityResultContract<Args, PaymentSheetResult> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_args";
    private static final String EXTRA_RESULT = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_result";

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Window window;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Integer numValueOf = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            numValueOf = Integer.valueOf(window.getStatusBarColor());
        }
        Intent intentPutExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", Args.copy$paymentsheet_release$default(input, null, null, null, numValueOf, null, 23, null).toV2$paymentsheet_release(context));
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public PaymentSheetResult parseResult(int resultCode, Intent intent) {
        PaymentSheetContractV2.Result result;
        PaymentSheetResult paymentSheetResult = (intent == null || (result = (PaymentSheetContractV2.Result) intent.getParcelableExtra(EXTRA_RESULT)) == null) ? null : result.getPaymentSheetResult();
        return paymentSheetResult == null ? new PaymentSheetResult.Failed(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult.")) : paymentSheetResult;
    }

    /* compiled from: PaymentSheetContract.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00019B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b!J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b%J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b'\u0010\u0014J\u000e\u0010(\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b)JF\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u0007HÀ\u0001¢\u0006\u0004\b+\u0010,J\u0006\u0010-\u001a\u00020\tJ\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\tHÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006:"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentElementCallbackIdentifier", "", "statusBarColor", "", "injectorKey", "<init>", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getClientSecret$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/model/ClientSecret;", "getConfig$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getPaymentElementCallbackIdentifier$paymentsheet_release", "()Ljava/lang/String;", "getStatusBarColor$paymentsheet_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInjectorKey$paymentsheet_release", "googlePayConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getGooglePayConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "toV2", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "context", "Landroid/content/Context;", "toV2$paymentsheet_release", "component1", "component1$paymentsheet_release", "component2", "component2$paymentsheet_release", "component3", "component3$paymentsheet_release", "component4", "component4$paymentsheet_release", "component5", "component5$paymentsheet_release", "copy", "copy$paymentsheet_release", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements ActivityStarter.Args {
        private final ClientSecret clientSecret;
        private final PaymentSheet.Configuration config;
        private final String injectorKey;
        private final String paymentElementCallbackIdentifier;
        private final Integer statusBarColor;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheetContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ClientSecret) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentSheet.Configuration.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$paymentsheet_release$default(Args args, ClientSecret clientSecret, PaymentSheet.Configuration configuration, String str, Integer num, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                clientSecret = args.clientSecret;
            }
            if ((i & 2) != 0) {
                configuration = args.config;
            }
            if ((i & 4) != 0) {
                str = args.paymentElementCallbackIdentifier;
            }
            if ((i & 8) != 0) {
                num = args.statusBarColor;
            }
            if ((i & 16) != 0) {
                str2 = args.injectorKey;
            }
            String str3 = str2;
            String str4 = str;
            return args.copy$paymentsheet_release(clientSecret, configuration, str4, num, str3);
        }

        /* renamed from: component1$paymentsheet_release, reason: from getter */
        public final ClientSecret getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2$paymentsheet_release, reason: from getter */
        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        /* renamed from: component3$paymentsheet_release, reason: from getter */
        public final String getPaymentElementCallbackIdentifier() {
            return this.paymentElementCallbackIdentifier;
        }

        /* renamed from: component4$paymentsheet_release, reason: from getter */
        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        /* renamed from: component5$paymentsheet_release, reason: from getter */
        public final String getInjectorKey() {
            return this.injectorKey;
        }

        public final Args copy$paymentsheet_release(ClientSecret clientSecret, PaymentSheet.Configuration config, String paymentElementCallbackIdentifier, Integer statusBarColor, @InjectorKey String injectorKey) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            return new Args(clientSecret, config, paymentElementCallbackIdentifier, statusBarColor, injectorKey);
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
            return Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.paymentElementCallbackIdentifier, args.paymentElementCallbackIdentifier) && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.injectorKey, args.injectorKey);
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            PaymentSheet.Configuration configuration = this.config;
            int iHashCode2 = (((iHashCode + (configuration == null ? 0 : configuration.hashCode())) * 31) + this.paymentElementCallbackIdentifier.hashCode()) * 31;
            Integer num = this.statusBarColor;
            return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.injectorKey.hashCode();
        }

        public String toString() {
            return "Args(clientSecret=" + this.clientSecret + ", config=" + this.config + ", paymentElementCallbackIdentifier=" + this.paymentElementCallbackIdentifier + ", statusBarColor=" + this.statusBarColor + ", injectorKey=" + this.injectorKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.clientSecret, flags);
            PaymentSheet.Configuration configuration = this.config;
            if (configuration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                configuration.writeToParcel(dest, flags);
            }
            dest.writeString(this.paymentElementCallbackIdentifier);
            Integer num = this.statusBarColor;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeString(this.injectorKey);
        }

        public Args(ClientSecret clientSecret, PaymentSheet.Configuration configuration, String paymentElementCallbackIdentifier, Integer num, @InjectorKey String injectorKey) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            this.clientSecret = clientSecret;
            this.config = configuration;
            this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
            this.statusBarColor = num;
            this.injectorKey = injectorKey;
        }

        public final ClientSecret getClientSecret$paymentsheet_release() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration getConfig$paymentsheet_release() {
            return this.config;
        }

        public final String getPaymentElementCallbackIdentifier$paymentsheet_release() {
            return this.paymentElementCallbackIdentifier;
        }

        public final Integer getStatusBarColor$paymentsheet_release() {
            return this.statusBarColor;
        }

        public /* synthetic */ Args(ClientSecret clientSecret, PaymentSheet.Configuration configuration, String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(clientSecret, configuration, str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? InjectorKt.DUMMY_INJECTOR_KEY : str2);
        }

        public final String getInjectorKey$paymentsheet_release() {
            return this.injectorKey;
        }

        public final PaymentSheet.GooglePayConfiguration getGooglePayConfig() {
            PaymentSheet.Configuration configuration = this.config;
            if (configuration != null) {
                return configuration.getGooglePay();
            }
            return null;
        }

        public final PaymentSheetContractV2.Args toV2$paymentsheet_release(Context context) {
            PaymentElementLoader.InitializationMode.SetupIntent setupIntent;
            Intrinsics.checkNotNullParameter(context, "context");
            ClientSecret clientSecret = this.clientSecret;
            if (clientSecret instanceof PaymentIntentClientSecret) {
                setupIntent = new PaymentElementLoader.InitializationMode.PaymentIntent(((PaymentIntentClientSecret) this.clientSecret).getValue());
            } else {
                if (!(clientSecret instanceof SetupIntentClientSecret)) {
                    throw new NoWhenBranchMatchedException();
                }
                setupIntent = new PaymentElementLoader.InitializationMode.SetupIntent(((SetupIntentClientSecret) this.clientSecret).getValue());
            }
            PaymentElementLoader.InitializationMode initializationMode = setupIntent;
            PaymentSheet.Configuration configurationM8222default = this.config;
            if (configurationM8222default == null) {
                configurationM8222default = PaymentSheet.Configuration.INSTANCE.m8222default(context);
            }
            return new PaymentSheetContractV2.Args(initializationMode, configurationM8222default, this.paymentElementCallbackIdentifier, this.statusBarColor, false);
        }

        /* compiled from: PaymentSheetContract.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "createPaymentIntentArgs", "clientSecret", "", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "createSetupIntentArgs", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent$paymentsheet_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args");
            }

            public static /* synthetic */ Args createPaymentIntentArgs$default(Companion companion, String str, PaymentSheet.Configuration configuration, int i, Object obj) {
                if ((i & 2) != 0) {
                    configuration = null;
                }
                return companion.createPaymentIntentArgs(str, configuration);
            }

            public final Args createPaymentIntentArgs(String clientSecret, PaymentSheet.Configuration config) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new Args(new PaymentIntentClientSecret(clientSecret), config, PaymentSheetConstantsKt.PAYMENT_SHEET_DEFAULT_CALLBACK_IDENTIFIER, null, null, 24, null);
            }

            public static /* synthetic */ Args createSetupIntentArgs$default(Companion companion, String str, PaymentSheet.Configuration configuration, int i, Object obj) {
                if ((i & 2) != 0) {
                    configuration = null;
                }
                return companion.createSetupIntentArgs(str, configuration);
            }

            public final Args createSetupIntentArgs(String clientSecret, PaymentSheet.Configuration config) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new Args(new SetupIntentClientSecret(clientSecret), config, PaymentSheetConstantsKt.PAYMENT_SHEET_DEFAULT_CALLBACK_IDENTIFIER, null, null, 24, null);
            }
        }
    }

    /* compiled from: PaymentSheetContract.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "paymentSheetResult", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", "getPaymentSheetResult", "()Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "toBundle", "Landroid/os/Bundle;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result implements ActivityStarter.Result {
        private final PaymentSheetResult paymentSheetResult;
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheetContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result((PaymentSheetResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public static /* synthetic */ Result copy$default(Result result, PaymentSheetResult paymentSheetResult, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSheetResult = result.paymentSheetResult;
            }
            return result.copy(paymentSheetResult);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSheetResult getPaymentSheetResult() {
            return this.paymentSheetResult;
        }

        public final Result copy(PaymentSheetResult paymentSheetResult) {
            Intrinsics.checkNotNullParameter(paymentSheetResult, "paymentSheetResult");
            return new Result(paymentSheetResult);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && Intrinsics.areEqual(this.paymentSheetResult, ((Result) other).paymentSheetResult);
        }

        public int hashCode() {
            return this.paymentSheetResult.hashCode();
        }

        public String toString() {
            return "Result(paymentSheetResult=" + this.paymentSheetResult + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.paymentSheetResult, flags);
        }

        public Result(PaymentSheetResult paymentSheetResult) {
            Intrinsics.checkNotNullParameter(paymentSheetResult, "paymentSheetResult");
            this.paymentSheetResult = paymentSheetResult;
        }

        public final PaymentSheetResult getPaymentSheetResult() {
            return this.paymentSheetResult;
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return BundleKt.bundleOf(TuplesKt.to(PaymentSheetContract.EXTRA_RESULT, this));
        }
    }

    /* compiled from: PaymentSheetContract.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Companion;", "", "<init>", "()V", "EXTRA_ARGS", "", "getEXTRA_ARGS$annotations", "EXTRA_RESULT", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
