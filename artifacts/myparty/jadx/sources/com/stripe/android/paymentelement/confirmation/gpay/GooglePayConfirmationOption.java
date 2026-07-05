package com.stripe.android.paymentelement.confirmation.gpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayConfirmationOption.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "config", "Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption$Config;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption$Config;)V", "getConfig", "()Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption$Config;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Config", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GooglePayConfirmationOption implements ConfirmationHandler.Option {
    private final Config config;
    public static final Parcelable.Creator<GooglePayConfirmationOption> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: GooglePayConfirmationOption.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GooglePayConfirmationOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayConfirmationOption createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayConfirmationOption(Config.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayConfirmationOption[] newArray(int i) {
            return new GooglePayConfirmationOption[i];
        }
    }

    public static /* synthetic */ GooglePayConfirmationOption copy$default(GooglePayConfirmationOption googlePayConfirmationOption, Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = googlePayConfirmationOption.config;
        }
        return googlePayConfirmationOption.copy(config);
    }

    /* renamed from: component1, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    public final GooglePayConfirmationOption copy(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new GooglePayConfirmationOption(config);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GooglePayConfirmationOption) && Intrinsics.areEqual(this.config, ((GooglePayConfirmationOption) other).config);
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    public String toString() {
        return "GooglePayConfirmationOption(config=" + this.config + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.config.writeToParcel(dest, flags);
    }

    public GooglePayConfirmationOption(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    public final Config getConfig() {
        return this.config;
    }

    /* compiled from: GooglePayConfirmationOption.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Jf\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00066"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption$Config;", "Landroid/os/Parcelable;", "environment", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "merchantName", "", "merchantCountryCode", "merchantCurrencyCode", "customAmount", "", "customLabel", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/CardBrandFilter;)V", "getEnvironment", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "getMerchantName", "()Ljava/lang/String;", "getMerchantCountryCode", "getMerchantCurrencyCode", "getCustomAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCustomLabel", "getBillingDetailsCollectionConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getCardBrandFilter", "()Lcom/stripe/android/CardBrandFilter;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/CardBrandFilter;)Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption$Config;", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {
        private final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
        private final CardBrandFilter cardBrandFilter;
        private final Long customAmount;
        private final String customLabel;
        private final PaymentSheet.GooglePayConfiguration.Environment environment;
        private final String merchantCountryCode;
        private final String merchantCurrencyCode;
        private final String merchantName;
        public static final Parcelable.Creator<Config> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GooglePayConfirmationOption.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Config(parcel.readInt() == 0 ? null : PaymentSheet.GooglePayConfiguration.Environment.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), PaymentSheet.BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel), (CardBrandFilter) parcel.readParcelable(Config.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i) {
                return new Config[i];
            }
        }

        public static /* synthetic */ Config copy$default(Config config, PaymentSheet.GooglePayConfiguration.Environment environment, String str, String str2, String str3, Long l, String str4, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, CardBrandFilter cardBrandFilter, int i, Object obj) {
            if ((i & 1) != 0) {
                environment = config.environment;
            }
            if ((i & 2) != 0) {
                str = config.merchantName;
            }
            if ((i & 4) != 0) {
                str2 = config.merchantCountryCode;
            }
            if ((i & 8) != 0) {
                str3 = config.merchantCurrencyCode;
            }
            if ((i & 16) != 0) {
                l = config.customAmount;
            }
            if ((i & 32) != 0) {
                str4 = config.customLabel;
            }
            if ((i & 64) != 0) {
                billingDetailsCollectionConfiguration = config.billingDetailsCollectionConfiguration;
            }
            if ((i & 128) != 0) {
                cardBrandFilter = config.cardBrandFilter;
            }
            PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration2 = billingDetailsCollectionConfiguration;
            CardBrandFilter cardBrandFilter2 = cardBrandFilter;
            Long l2 = l;
            String str5 = str4;
            return config.copy(environment, str, str2, str3, l2, str5, billingDetailsCollectionConfiguration2, cardBrandFilter2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSheet.GooglePayConfiguration.Environment getEnvironment() {
            return this.environment;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMerchantCountryCode() {
            return this.merchantCountryCode;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMerchantCurrencyCode() {
            return this.merchantCurrencyCode;
        }

        /* renamed from: component5, reason: from getter */
        public final Long getCustomAmount() {
            return this.customAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCustomLabel() {
            return this.customLabel;
        }

        /* renamed from: component7, reason: from getter */
        public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        /* renamed from: component8, reason: from getter */
        public final CardBrandFilter getCardBrandFilter() {
            return this.cardBrandFilter;
        }

        public final Config copy(PaymentSheet.GooglePayConfiguration.Environment environment, String merchantName, String merchantCountryCode, String merchantCurrencyCode, Long customAmount, String customLabel, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, CardBrandFilter cardBrandFilter) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
            return new Config(environment, merchantName, merchantCountryCode, merchantCurrencyCode, customAmount, customLabel, billingDetailsCollectionConfiguration, cardBrandFilter);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.environment == config.environment && Intrinsics.areEqual(this.merchantName, config.merchantName) && Intrinsics.areEqual(this.merchantCountryCode, config.merchantCountryCode) && Intrinsics.areEqual(this.merchantCurrencyCode, config.merchantCurrencyCode) && Intrinsics.areEqual(this.customAmount, config.customAmount) && Intrinsics.areEqual(this.customLabel, config.customLabel) && Intrinsics.areEqual(this.billingDetailsCollectionConfiguration, config.billingDetailsCollectionConfiguration) && Intrinsics.areEqual(this.cardBrandFilter, config.cardBrandFilter);
        }

        public int hashCode() {
            PaymentSheet.GooglePayConfiguration.Environment environment = this.environment;
            int iHashCode = (((((environment == null ? 0 : environment.hashCode()) * 31) + this.merchantName.hashCode()) * 31) + this.merchantCountryCode.hashCode()) * 31;
            String str = this.merchantCurrencyCode;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.customAmount;
            int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.customLabel;
            return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + this.cardBrandFilter.hashCode();
        }

        public String toString() {
            return "Config(environment=" + this.environment + ", merchantName=" + this.merchantName + ", merchantCountryCode=" + this.merchantCountryCode + ", merchantCurrencyCode=" + this.merchantCurrencyCode + ", customAmount=" + this.customAmount + ", customLabel=" + this.customLabel + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", cardBrandFilter=" + this.cardBrandFilter + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            PaymentSheet.GooglePayConfiguration.Environment environment = this.environment;
            if (environment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(environment.name());
            }
            dest.writeString(this.merchantName);
            dest.writeString(this.merchantCountryCode);
            dest.writeString(this.merchantCurrencyCode);
            Long l = this.customAmount;
            if (l == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l.longValue());
            }
            dest.writeString(this.customLabel);
            this.billingDetailsCollectionConfiguration.writeToParcel(dest, flags);
            dest.writeParcelable(this.cardBrandFilter, flags);
        }

        public Config(PaymentSheet.GooglePayConfiguration.Environment environment, String merchantName, String merchantCountryCode, String str, Long l, String str2, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, CardBrandFilter cardBrandFilter) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
            this.environment = environment;
            this.merchantName = merchantName;
            this.merchantCountryCode = merchantCountryCode;
            this.merchantCurrencyCode = str;
            this.customAmount = l;
            this.customLabel = str2;
            this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            this.cardBrandFilter = cardBrandFilter;
        }

        public final PaymentSheet.GooglePayConfiguration.Environment getEnvironment() {
            return this.environment;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final String getMerchantCountryCode() {
            return this.merchantCountryCode;
        }

        public final String getMerchantCurrencyCode() {
            return this.merchantCurrencyCode;
        }

        public final Long getCustomAmount() {
            return this.customAmount;
        }

        public final String getCustomLabel() {
            return this.customLabel;
        }

        public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        public final CardBrandFilter getCardBrandFilter() {
            return this.cardBrandFilter;
        }
    }
}
