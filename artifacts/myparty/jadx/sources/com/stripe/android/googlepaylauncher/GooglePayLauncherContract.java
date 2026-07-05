package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayLauncherContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u000f\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "PaymentIntentArgs", "SetupIntentArgs", "Args", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayLauncherContract extends ActivityResultContract<Args, GooglePayLauncher.Result> {
    public static final int $stable = 0;
    public static final String EXTRA_RESULT = "extra_result";

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) GooglePayLauncherActivity.class).putExtras(input.toBundle$payments_core_release());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public GooglePayLauncher.Result parseResult(int resultCode, Intent intent) {
        GooglePayLauncher.Result result;
        return (intent == null || (result = (GooglePayLauncher.Result) intent.getParcelableExtra("extra_result")) == null) ? new GooglePayLauncher.Result.Failed(new IllegalStateException("Error while processing result from Google Pay.")) : result;
    }

    /* compiled from: GooglePayLauncherContract.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000fJ\u000e\u0010\u0010\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u0013J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\""}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "clientSecret", "", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "label", "<init>", "(Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Ljava/lang/String;)V", "getClientSecret$payments_core_release", "()Ljava/lang/String;", "getConfig$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getLabel$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentIntentArgs extends Args {
        private final String clientSecret;
        private final GooglePayLauncher.Config config;
        private final String label;
        public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GooglePayLauncherContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentIntentArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentIntentArgs(parcel.readString(), GooglePayLauncher.Config.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentIntentArgs[] newArray(int i) {
                return new PaymentIntentArgs[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PaymentIntentArgs(String clientSecret, GooglePayLauncher.Config config) {
            this(clientSecret, config, null, 4, null);
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(config, "config");
        }

        public static /* synthetic */ PaymentIntentArgs copy$default(PaymentIntentArgs paymentIntentArgs, String str, GooglePayLauncher.Config config, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentIntentArgs.clientSecret;
            }
            if ((i & 2) != 0) {
                config = paymentIntentArgs.config;
            }
            if ((i & 4) != 0) {
                str2 = paymentIntentArgs.label;
            }
            return paymentIntentArgs.copy(str, config, str2);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2$payments_core_release, reason: from getter */
        public final GooglePayLauncher.Config getConfig() {
            return this.config;
        }

        /* renamed from: component3$payments_core_release, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final PaymentIntentArgs copy(String clientSecret, GooglePayLauncher.Config config, String label) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(config, "config");
            return new PaymentIntentArgs(clientSecret, config, label);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentIntentArgs)) {
                return false;
            }
            PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) other;
            return Intrinsics.areEqual(this.clientSecret, paymentIntentArgs.clientSecret) && Intrinsics.areEqual(this.config, paymentIntentArgs.config) && Intrinsics.areEqual(this.label, paymentIntentArgs.label);
        }

        public int hashCode() {
            int iHashCode = ((this.clientSecret.hashCode() * 31) + this.config.hashCode()) * 31;
            String str = this.label;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentIntentArgs(clientSecret=" + this.clientSecret + ", config=" + this.config + ", label=" + this.label + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.clientSecret);
            this.config.writeToParcel(dest, flags);
            dest.writeString(this.label);
        }

        public /* synthetic */ PaymentIntentArgs(String str, GooglePayLauncher.Config config, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, config, (i & 4) != 0 ? null : str2);
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public String getClientSecret$payments_core_release() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public GooglePayLauncher.Config getConfig$payments_core_release() {
            return this.config;
        }

        public final String getLabel$payments_core_release() {
            return this.label;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentIntentArgs(String clientSecret, GooglePayLauncher.Config config, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(config, "config");
            this.clientSecret = clientSecret;
            this.config = config;
            this.label = str;
        }
    }

    /* compiled from: GooglePayLauncherContract.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0015\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0016J\u000e\u0010\u0017\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0018J\u000e\u0010\u0019\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001eJD\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006."}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "clientSecret", "", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "currencyCode", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "label", "<init>", "(Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getClientSecret$payments_core_release", "()Ljava/lang/String;", "getConfig$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getCurrencyCode$payments_core_release", "getAmount$payments_core_release", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLabel$payments_core_release", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "copy", "(Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetupIntentArgs extends Args {
        private final Long amount;
        private final String clientSecret;
        private final GooglePayLauncher.Config config;
        private final String currencyCode;
        private final String label;
        public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GooglePayLauncherContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SetupIntentArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetupIntentArgs(parcel.readString(), GooglePayLauncher.Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetupIntentArgs[] newArray(int i) {
                return new SetupIntentArgs[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SetupIntentArgs(String clientSecret, GooglePayLauncher.Config config, String currencyCode) {
            this(clientSecret, config, currencyCode, null, null, 24, null);
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SetupIntentArgs(String clientSecret, GooglePayLauncher.Config config, String currencyCode, Long l) {
            this(clientSecret, config, currencyCode, l, null, 16, null);
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        }

        public static /* synthetic */ SetupIntentArgs copy$default(SetupIntentArgs setupIntentArgs, String str, GooglePayLauncher.Config config, String str2, Long l, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupIntentArgs.clientSecret;
            }
            if ((i & 2) != 0) {
                config = setupIntentArgs.config;
            }
            if ((i & 4) != 0) {
                str2 = setupIntentArgs.currencyCode;
            }
            if ((i & 8) != 0) {
                l = setupIntentArgs.amount;
            }
            if ((i & 16) != 0) {
                str3 = setupIntentArgs.label;
            }
            String str4 = str3;
            String str5 = str2;
            return setupIntentArgs.copy(str, config, str5, l, str4);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2$payments_core_release, reason: from getter */
        public final GooglePayLauncher.Config getConfig() {
            return this.config;
        }

        /* renamed from: component3$payments_core_release, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component4$payments_core_release, reason: from getter */
        public final Long getAmount() {
            return this.amount;
        }

        /* renamed from: component5$payments_core_release, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final SetupIntentArgs copy(String clientSecret, GooglePayLauncher.Config config, String currencyCode, Long amount, String label) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            return new SetupIntentArgs(clientSecret, config, currencyCode, amount, label);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetupIntentArgs)) {
                return false;
            }
            SetupIntentArgs setupIntentArgs = (SetupIntentArgs) other;
            return Intrinsics.areEqual(this.clientSecret, setupIntentArgs.clientSecret) && Intrinsics.areEqual(this.config, setupIntentArgs.config) && Intrinsics.areEqual(this.currencyCode, setupIntentArgs.currencyCode) && Intrinsics.areEqual(this.amount, setupIntentArgs.amount) && Intrinsics.areEqual(this.label, setupIntentArgs.label);
        }

        public int hashCode() {
            int iHashCode = ((((this.clientSecret.hashCode() * 31) + this.config.hashCode()) * 31) + this.currencyCode.hashCode()) * 31;
            Long l = this.amount;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.label;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SetupIntentArgs(clientSecret=" + this.clientSecret + ", config=" + this.config + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", label=" + this.label + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.clientSecret);
            this.config.writeToParcel(dest, flags);
            dest.writeString(this.currencyCode);
            Long l = this.amount;
            if (l == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l.longValue());
            }
            dest.writeString(this.label);
        }

        public /* synthetic */ SetupIntentArgs(String str, GooglePayLauncher.Config config, String str2, Long l, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, config, str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3);
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public String getClientSecret$payments_core_release() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args
        public GooglePayLauncher.Config getConfig$payments_core_release() {
            return this.config;
        }

        public final String getCurrencyCode$payments_core_release() {
            return this.currencyCode;
        }

        public final Long getAmount$payments_core_release() {
            return this.amount;
        }

        public final String getLabel$payments_core_release() {
            return this.label;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetupIntentArgs(String clientSecret, GooglePayLauncher.Config config, String currencyCode, Long l, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            this.clientSecret = clientSecret;
            this.config = config;
            this.currencyCode = currencyCode;
            this.amount = l;
            this.label = str;
        }
    }

    /* compiled from: GooglePayLauncherContract.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u0012\u0010\u0004\u001a\u00020\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX \u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "Landroid/os/Parcelable;", "<init>", "()V", "clientSecret", "", "getClientSecret$payments_core_release", "()Ljava/lang/String;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "getConfig$payments_core_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "toBundle", "Landroid/os/Bundle;", "toBundle$payments_core_release", "Companion", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Args implements Parcelable {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String EXTRA_ARGS = "extra_args";

        public /* synthetic */ Args(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract String getClientSecret$payments_core_release();

        public abstract GooglePayLauncher.Config getConfig$payments_core_release();

        private Args() {
        }

        public final Bundle toBundle$payments_core_release() {
            return BundleKt.bundleOf(TuplesKt.to(EXTRA_ARGS, this));
        }

        /* compiled from: GooglePayLauncherContract.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args$Companion;", "", "<init>", "()V", "EXTRA_ARGS", "", "fromIntent", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "fromIntent$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent$payments_core_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(Args.EXTRA_ARGS);
            }
        }
    }
}
