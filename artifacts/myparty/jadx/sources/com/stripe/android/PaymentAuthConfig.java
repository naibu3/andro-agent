package com.stripe.android;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeLabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeTextBoxCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization;
import com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentAuthConfig.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig;", "", "stripe3ds2Config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "<init>", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)V", "getStripe3ds2Config$payments_core_release", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Builder", "Stripe3ds2Config", "Stripe3ds2ButtonCustomization", "Stripe3ds2LabelCustomization", "Stripe3ds2TextBoxCustomization", "Stripe3ds2ToolbarCustomization", "Stripe3ds2UiCustomization", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentAuthConfig {
    private static PaymentAuthConfig instance;
    private final Stripe3ds2Config stripe3ds2Config;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final PaymentAuthConfig DEFAULT = new Builder().set3ds2Config(new Stripe3ds2Config.Builder().build()).build();

    public /* synthetic */ PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripe3ds2Config);
    }

    @JvmStatic
    public static final PaymentAuthConfig get() {
        return INSTANCE.get();
    }

    @JvmStatic
    public static final void init(PaymentAuthConfig paymentAuthConfig) {
        INSTANCE.init(paymentAuthConfig);
    }

    private PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config) {
        this.stripe3ds2Config = stripe3ds2Config;
    }

    /* renamed from: getStripe3ds2Config$payments_core_release, reason: from getter */
    public final Stripe3ds2Config getStripe3ds2Config() {
        return this.stripe3ds2Config;
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Builder;", "", "<init>", "()V", "stripe3ds2Config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "set3ds2Config", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/PaymentAuthConfig;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Stripe3ds2Config stripe3ds2Config;

        public final Builder set3ds2Config(Stripe3ds2Config stripe3ds2Config) {
            Intrinsics.checkNotNullParameter(stripe3ds2Config, "stripe3ds2Config");
            this.stripe3ds2Config = stripe3ds2Config;
            return this;
        }

        public final PaymentAuthConfig build() {
            Stripe3ds2Config stripe3ds2Config = this.stripe3ds2Config;
            if (stripe3ds2Config != null) {
                return new PaymentAuthConfig(stripe3ds2Config, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u001b\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u000e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000fJ\u000e\u0010\u0010\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0011J\"\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÀ\u0001¢\u0006\u0002\b\u0013J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\""}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Landroid/os/Parcelable;", "timeout", "", "uiCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "<init>", "(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)V", "getTimeout$payments_core_release", "()I", "getUiCustomization$payments_core_release", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "checkValidTimeout", "", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "copy$payments_core_release", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2Config implements Parcelable {
        public static final int DEFAULT_TIMEOUT = 5;
        private final int timeout;
        private final Stripe3ds2UiCustomization uiCustomization;
        public static final Parcelable.Creator<Stripe3ds2Config> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Stripe3ds2Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2Config createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stripe3ds2Config(parcel.readInt(), Stripe3ds2UiCustomization.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2Config[] newArray(int i) {
                return new Stripe3ds2Config[i];
            }
        }

        public static /* synthetic */ Stripe3ds2Config copy$payments_core_release$default(Stripe3ds2Config stripe3ds2Config, int i, Stripe3ds2UiCustomization stripe3ds2UiCustomization, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stripe3ds2Config.timeout;
            }
            if ((i2 & 2) != 0) {
                stripe3ds2UiCustomization = stripe3ds2Config.uiCustomization;
            }
            return stripe3ds2Config.copy$payments_core_release(i, stripe3ds2UiCustomization);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final int getTimeout() {
            return this.timeout;
        }

        /* renamed from: component2$payments_core_release, reason: from getter */
        public final Stripe3ds2UiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        public final Stripe3ds2Config copy$payments_core_release(int timeout, Stripe3ds2UiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            return new Stripe3ds2Config(timeout, uiCustomization);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stripe3ds2Config)) {
                return false;
            }
            Stripe3ds2Config stripe3ds2Config = (Stripe3ds2Config) other;
            return this.timeout == stripe3ds2Config.timeout && Intrinsics.areEqual(this.uiCustomization, stripe3ds2Config.uiCustomization);
        }

        public int hashCode() {
            return (Integer.hashCode(this.timeout) * 31) + this.uiCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2Config(timeout=" + this.timeout + ", uiCustomization=" + this.uiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.timeout);
            this.uiCustomization.writeToParcel(dest, flags);
        }

        public Stripe3ds2Config(int i, Stripe3ds2UiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.timeout = i;
            this.uiCustomization = uiCustomization;
            checkValidTimeout(i);
        }

        public final int getTimeout$payments_core_release() {
            return this.timeout;
        }

        public final Stripe3ds2UiCustomization getUiCustomization$payments_core_release() {
            return this.uiCustomization;
        }

        private final void checkValidTimeout(int timeout) {
            if (timeout < 5 || timeout > 99) {
                throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive".toString());
            }
        }

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;", "", "<init>", "()V", "timeout", "", "uiCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "setTimeout", "setUiCustomization", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private int timeout = 5;
            private Stripe3ds2UiCustomization uiCustomization = new Stripe3ds2UiCustomization.Builder().build();

            public final Builder setTimeout(int timeout) {
                this.timeout = timeout;
                return this;
            }

            public final Builder setUiCustomization(Stripe3ds2UiCustomization uiCustomization) {
                Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
                this.uiCustomization = uiCustomization;
                return this;
            }

            public final Stripe3ds2Config build() {
                return new Stripe3ds2Config(this.timeout, this.uiCustomization);
            }
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\tJ\u0018\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V", "getButtonCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "component1", "component1$payments_core_release", "copy", "copy$payments_core_release", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2ButtonCustomization {
        public static final int $stable = 8;
        private final ButtonCustomization buttonCustomization;

        public static /* synthetic */ Stripe3ds2ButtonCustomization copy$payments_core_release$default(Stripe3ds2ButtonCustomization stripe3ds2ButtonCustomization, ButtonCustomization buttonCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                buttonCustomization = stripe3ds2ButtonCustomization.buttonCustomization;
            }
            return stripe3ds2ButtonCustomization.copy$payments_core_release(buttonCustomization);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final ButtonCustomization getButtonCustomization() {
            return this.buttonCustomization;
        }

        public final Stripe3ds2ButtonCustomization copy$payments_core_release(ButtonCustomization buttonCustomization) {
            Intrinsics.checkNotNullParameter(buttonCustomization, "buttonCustomization");
            return new Stripe3ds2ButtonCustomization(buttonCustomization);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2ButtonCustomization) && Intrinsics.areEqual(this.buttonCustomization, ((Stripe3ds2ButtonCustomization) other).buttonCustomization);
        }

        public int hashCode() {
            return this.buttonCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2ButtonCustomization(buttonCustomization=" + this.buttonCustomization + ")";
        }

        public Stripe3ds2ButtonCustomization(ButtonCustomization buttonCustomization) {
            Intrinsics.checkNotNullParameter(buttonCustomization, "buttonCustomization");
            this.buttonCustomization = buttonCustomization;
        }

        public final ButtonCustomization getButtonCustomization$payments_core_release() {
            return this.buttonCustomization;
        }

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization$Builder;", "", "<init>", "()V", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "setBackgroundColor", "hexColor", "", "setCornerRadius", "cornerRadius", "", "setTextFontName", "fontName", "setTextColor", "setTextFontSize", ViewProps.FONT_SIZE, InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private final ButtonCustomization buttonCustomization = new StripeButtonCustomization();

            public final Builder setBackgroundColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.buttonCustomization.setBackgroundColor(hexColor);
                return this;
            }

            public final Builder setCornerRadius(int cornerRadius) throws RuntimeException {
                this.buttonCustomization.setCornerRadius(cornerRadius);
                return this;
            }

            public final Builder setTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.buttonCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.buttonCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontSize(int fontSize) throws RuntimeException {
                this.buttonCustomization.setTextFontSize(fontSize);
                return this;
            }

            public final Stripe3ds2ButtonCustomization build() {
                return new Stripe3ds2ButtonCustomization(this.buttonCustomization);
            }
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\tJ\u0018\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", "getLabelCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "component1", "component1$payments_core_release", "copy", "copy$payments_core_release", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2LabelCustomization {
        public static final int $stable = 8;
        private final LabelCustomization labelCustomization;

        public static /* synthetic */ Stripe3ds2LabelCustomization copy$payments_core_release$default(Stripe3ds2LabelCustomization stripe3ds2LabelCustomization, LabelCustomization labelCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                labelCustomization = stripe3ds2LabelCustomization.labelCustomization;
            }
            return stripe3ds2LabelCustomization.copy$payments_core_release(labelCustomization);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final LabelCustomization getLabelCustomization() {
            return this.labelCustomization;
        }

        public final Stripe3ds2LabelCustomization copy$payments_core_release(LabelCustomization labelCustomization) {
            Intrinsics.checkNotNullParameter(labelCustomization, "labelCustomization");
            return new Stripe3ds2LabelCustomization(labelCustomization);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2LabelCustomization) && Intrinsics.areEqual(this.labelCustomization, ((Stripe3ds2LabelCustomization) other).labelCustomization);
        }

        public int hashCode() {
            return this.labelCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2LabelCustomization(labelCustomization=" + this.labelCustomization + ")";
        }

        public Stripe3ds2LabelCustomization(LabelCustomization labelCustomization) {
            Intrinsics.checkNotNullParameter(labelCustomization, "labelCustomization");
            this.labelCustomization = labelCustomization;
        }

        public final LabelCustomization getLabelCustomization$payments_core_release() {
            return this.labelCustomization;
        }

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization$Builder;", "", "<init>", "()V", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "setHeadingTextColor", "hexColor", "", "setHeadingTextFontName", "fontName", "setHeadingTextFontSize", ViewProps.FONT_SIZE, "", "setTextFontName", "setTextColor", "setTextFontSize", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private final LabelCustomization labelCustomization = new StripeLabelCustomization();

            public final Builder setHeadingTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.labelCustomization.setHeadingTextColor(hexColor);
                return this;
            }

            public final Builder setHeadingTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.labelCustomization.setHeadingTextFontName(fontName);
                return this;
            }

            public final Builder setHeadingTextFontSize(int fontSize) throws RuntimeException {
                this.labelCustomization.setHeadingTextFontSize(fontSize);
                return this;
            }

            public final Builder setTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.labelCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.labelCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontSize(int fontSize) throws RuntimeException {
                this.labelCustomization.setTextFontSize(fontSize);
                return this;
            }

            public final Stripe3ds2LabelCustomization build() {
                return new Stripe3ds2LabelCustomization(this.labelCustomization);
            }
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\tJ\u0018\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "", "textBoxCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V", "getTextBoxCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "component1", "component1$payments_core_release", "copy", "copy$payments_core_release", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2TextBoxCustomization {
        public static final int $stable = 8;
        private final TextBoxCustomization textBoxCustomization;

        public static /* synthetic */ Stripe3ds2TextBoxCustomization copy$payments_core_release$default(Stripe3ds2TextBoxCustomization stripe3ds2TextBoxCustomization, TextBoxCustomization textBoxCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                textBoxCustomization = stripe3ds2TextBoxCustomization.textBoxCustomization;
            }
            return stripe3ds2TextBoxCustomization.copy$payments_core_release(textBoxCustomization);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final TextBoxCustomization getTextBoxCustomization() {
            return this.textBoxCustomization;
        }

        public final Stripe3ds2TextBoxCustomization copy$payments_core_release(TextBoxCustomization textBoxCustomization) {
            Intrinsics.checkNotNullParameter(textBoxCustomization, "textBoxCustomization");
            return new Stripe3ds2TextBoxCustomization(textBoxCustomization);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2TextBoxCustomization) && Intrinsics.areEqual(this.textBoxCustomization, ((Stripe3ds2TextBoxCustomization) other).textBoxCustomization);
        }

        public int hashCode() {
            return this.textBoxCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2TextBoxCustomization(textBoxCustomization=" + this.textBoxCustomization + ")";
        }

        public Stripe3ds2TextBoxCustomization(TextBoxCustomization textBoxCustomization) {
            Intrinsics.checkNotNullParameter(textBoxCustomization, "textBoxCustomization");
            this.textBoxCustomization = textBoxCustomization;
        }

        public final TextBoxCustomization getTextBoxCustomization$payments_core_release() {
            return this.textBoxCustomization;
        }

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;", "", "<init>", "()V", "textBoxCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "setBorderWidth", "borderWidth", "", "setBorderColor", "hexColor", "", "setCornerRadius", "cornerRadius", "setTextFontName", "fontName", "setTextColor", "setTextFontSize", ViewProps.FONT_SIZE, InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private final TextBoxCustomization textBoxCustomization = new StripeTextBoxCustomization();

            public final Builder setBorderWidth(int borderWidth) throws RuntimeException {
                this.textBoxCustomization.setBorderWidth(borderWidth);
                return this;
            }

            public final Builder setBorderColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.textBoxCustomization.setBorderColor(hexColor);
                return this;
            }

            public final Builder setCornerRadius(int cornerRadius) throws RuntimeException {
                this.textBoxCustomization.setCornerRadius(cornerRadius);
                return this;
            }

            public final Builder setTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.textBoxCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.textBoxCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontSize(int fontSize) throws RuntimeException {
                this.textBoxCustomization.setTextFontSize(fontSize);
                return this;
            }

            public final Stripe3ds2TextBoxCustomization build() {
                return new Stripe3ds2TextBoxCustomization(this.textBoxCustomization);
            }
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\tJ\u0018\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V", "getToolbarCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "component1", "component1$payments_core_release", "copy", "copy$payments_core_release", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2ToolbarCustomization {
        public static final int $stable = 8;
        private final ToolbarCustomization toolbarCustomization;

        public static /* synthetic */ Stripe3ds2ToolbarCustomization copy$payments_core_release$default(Stripe3ds2ToolbarCustomization stripe3ds2ToolbarCustomization, ToolbarCustomization toolbarCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                toolbarCustomization = stripe3ds2ToolbarCustomization.toolbarCustomization;
            }
            return stripe3ds2ToolbarCustomization.copy$payments_core_release(toolbarCustomization);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final ToolbarCustomization getToolbarCustomization() {
            return this.toolbarCustomization;
        }

        public final Stripe3ds2ToolbarCustomization copy$payments_core_release(ToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            return new Stripe3ds2ToolbarCustomization(toolbarCustomization);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2ToolbarCustomization) && Intrinsics.areEqual(this.toolbarCustomization, ((Stripe3ds2ToolbarCustomization) other).toolbarCustomization);
        }

        public int hashCode() {
            return this.toolbarCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2ToolbarCustomization(toolbarCustomization=" + this.toolbarCustomization + ")";
        }

        public Stripe3ds2ToolbarCustomization(ToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            this.toolbarCustomization = toolbarCustomization;
        }

        public final ToolbarCustomization getToolbarCustomization$payments_core_release() {
            return this.toolbarCustomization;
        }

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;", "", "<init>", "()V", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "setBackgroundColor", "hexColor", "", "setStatusBarColor", "setHeaderText", "headerText", "setButtonText", "buttonText", "setTextFontName", "fontName", "setTextColor", "setTextFontSize", ViewProps.FONT_SIZE, "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private final ToolbarCustomization toolbarCustomization = new StripeToolbarCustomization();

            public final Builder setBackgroundColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.toolbarCustomization.setBackgroundColor(hexColor);
                return this;
            }

            public final Builder setStatusBarColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.toolbarCustomization.setStatusBarColor(hexColor);
                return this;
            }

            public final Builder setHeaderText(String headerText) throws RuntimeException {
                Intrinsics.checkNotNullParameter(headerText, "headerText");
                this.toolbarCustomization.setHeaderText(headerText);
                return this;
            }

            public final Builder setButtonText(String buttonText) throws RuntimeException {
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                this.toolbarCustomization.setButtonText(buttonText);
                return this;
            }

            public final Builder setTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.toolbarCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.toolbarCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontSize(int fontSize) throws RuntimeException {
                this.toolbarCustomization.setTextFontSize(fontSize);
                return this;
            }

            public final Stripe3ds2ToolbarCustomization build() {
                return new Stripe3ds2ToolbarCustomization(this.toolbarCustomization);
            }
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "Landroid/os/Parcelable;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "getUiCustomization", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "component1", "copy", "copy$payments_core_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "ButtonType", "Builder", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2UiCustomization implements Parcelable {
        private final StripeUiCustomization uiCustomization;
        public static final Parcelable.Creator<Stripe3ds2UiCustomization> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Stripe3ds2UiCustomization> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2UiCustomization createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stripe3ds2UiCustomization((StripeUiCustomization) parcel.readParcelable(Stripe3ds2UiCustomization.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2UiCustomization[] newArray(int i) {
                return new Stripe3ds2UiCustomization[i];
            }
        }

        public static /* synthetic */ Stripe3ds2UiCustomization copy$payments_core_release$default(Stripe3ds2UiCustomization stripe3ds2UiCustomization, StripeUiCustomization stripeUiCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                stripeUiCustomization = stripe3ds2UiCustomization.uiCustomization;
            }
            return stripe3ds2UiCustomization.copy$payments_core_release(stripeUiCustomization);
        }

        /* renamed from: component1, reason: from getter */
        public final StripeUiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        public final Stripe3ds2UiCustomization copy$payments_core_release(StripeUiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            return new Stripe3ds2UiCustomization(uiCustomization);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2UiCustomization) && Intrinsics.areEqual(this.uiCustomization, ((Stripe3ds2UiCustomization) other).uiCustomization);
        }

        public int hashCode() {
            return this.uiCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2UiCustomization(uiCustomization=" + this.uiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.uiCustomization, flags);
        }

        public Stripe3ds2UiCustomization(StripeUiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
        }

        public final StripeUiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "SUBMIT", "CONTINUE", "NEXT", "CANCEL", "RESEND", "SELECT", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ButtonType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ButtonType[] $VALUES;
            public static final ButtonType SUBMIT = new ButtonType("SUBMIT", 0);
            public static final ButtonType CONTINUE = new ButtonType("CONTINUE", 1);
            public static final ButtonType NEXT = new ButtonType("NEXT", 2);
            public static final ButtonType CANCEL = new ButtonType("CANCEL", 3);
            public static final ButtonType RESEND = new ButtonType("RESEND", 4);
            public static final ButtonType SELECT = new ButtonType("SELECT", 5);

            private static final /* synthetic */ ButtonType[] $values() {
                return new ButtonType[]{SUBMIT, CONTINUE, NEXT, CANCEL, RESEND, SELECT};
            }

            public static EnumEntries<ButtonType> getEntries() {
                return $ENTRIES;
            }

            private ButtonType(String str, int i) {
            }

            static {
                ButtonType[] buttonTypeArr$values = $values();
                $VALUES = buttonTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(buttonTypeArr$values);
            }

            public static ButtonType valueOf(String str) {
                return (ButtonType) Enum.valueOf(ButtonType.class, str);
            }

            public static ButtonType[] values() {
                return (ButtonType[]) $VALUES.clone();
            }
        }

        /* compiled from: PaymentAuthConfig.kt */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "()V", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getUiButtonType", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;", "buttonType", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;", "setButtonCustomization", "buttonCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "setToolbarCustomization", "toolbarCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "setLabelCustomization", "labelCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "setTextBoxCustomization", "textBoxCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "setAccentColor", "hexColor", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            private final StripeUiCustomization uiCustomization;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            /* compiled from: PaymentAuthConfig.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ButtonType.values().length];
                    try {
                        iArr[ButtonType.SUBMIT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ButtonType.CONTINUE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ButtonType.NEXT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ButtonType.CANCEL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ButtonType.RESEND.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ButtonType.SELECT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Builder(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
                this(activity);
            }

            @JvmStatic
            public static final Builder createWithAppTheme(Activity activity) {
                return INSTANCE.createWithAppTheme(activity);
            }

            private Builder(StripeUiCustomization stripeUiCustomization) {
                this.uiCustomization = stripeUiCustomization;
            }

            public Builder() {
                this(new StripeUiCustomization());
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private Builder(Activity activity) {
                StripeUiCustomization stripeUiCustomizationCreateWithAppTheme = StripeUiCustomization.createWithAppTheme(activity);
                Intrinsics.checkNotNullExpressionValue(stripeUiCustomizationCreateWithAppTheme, "createWithAppTheme(...)");
                this(stripeUiCustomizationCreateWithAppTheme);
            }

            private final UiCustomization.ButtonType getUiButtonType(ButtonType buttonType) throws RuntimeException {
                switch (WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()]) {
                    case 1:
                        return UiCustomization.ButtonType.SUBMIT;
                    case 2:
                        return UiCustomization.ButtonType.CONTINUE;
                    case 3:
                        return UiCustomization.ButtonType.NEXT;
                    case 4:
                        return UiCustomization.ButtonType.CANCEL;
                    case 5:
                        return UiCustomization.ButtonType.RESEND;
                    case 6:
                        return UiCustomization.ButtonType.SELECT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            public final Builder setButtonCustomization(Stripe3ds2ButtonCustomization buttonCustomization, ButtonType buttonType) throws RuntimeException {
                Intrinsics.checkNotNullParameter(buttonCustomization, "buttonCustomization");
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                this.uiCustomization.setButtonCustomization(buttonCustomization.getButtonCustomization$payments_core_release(), getUiButtonType(buttonType));
                return this;
            }

            public final Builder setToolbarCustomization(Stripe3ds2ToolbarCustomization toolbarCustomization) throws RuntimeException {
                Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
                this.uiCustomization.setToolbarCustomization(toolbarCustomization.getToolbarCustomization$payments_core_release());
                return this;
            }

            public final Builder setLabelCustomization(Stripe3ds2LabelCustomization labelCustomization) throws RuntimeException {
                Intrinsics.checkNotNullParameter(labelCustomization, "labelCustomization");
                this.uiCustomization.setLabelCustomization(labelCustomization.getLabelCustomization$payments_core_release());
                return this;
            }

            public final Builder setTextBoxCustomization(Stripe3ds2TextBoxCustomization textBoxCustomization) throws RuntimeException {
                Intrinsics.checkNotNullParameter(textBoxCustomization, "textBoxCustomization");
                this.uiCustomization.setTextBoxCustomization(textBoxCustomization.getTextBoxCustomization$payments_core_release());
                return this;
            }

            public final Builder setAccentColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.uiCustomization.setAccentColor(hexColor);
                return this;
            }

            public final Stripe3ds2UiCustomization build() {
                return new Stripe3ds2UiCustomization(this.uiCustomization);
            }

            /* compiled from: PaymentAuthConfig.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;", "", "<init>", "()V", "createWithAppTheme", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "activity", "Landroid/app/Activity;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Builder createWithAppTheme(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    return new Builder(activity, null);
                }
            }
        }
    }

    /* compiled from: PaymentAuthConfig.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\r\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0002\b\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Companion;", "", "<init>", "()V", "instance", "Lcom/stripe/android/PaymentAuthConfig;", "DEFAULT", "init", "", "config", "get", "reset", "reset$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void init(PaymentAuthConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            PaymentAuthConfig.instance = config;
        }

        @JvmStatic
        public final PaymentAuthConfig get() {
            PaymentAuthConfig paymentAuthConfig = PaymentAuthConfig.instance;
            return paymentAuthConfig == null ? PaymentAuthConfig.DEFAULT : paymentAuthConfig;
        }

        public final /* synthetic */ void reset$payments_core_release() {
            PaymentAuthConfig.instance = null;
        }
    }
}
