package com.stripe.android.paymentelement.embedded.form;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormContract.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;", "Lcom/stripe/android/paymentelement/embedded/form/FormResult;", "<init>", "()V", "EXTRA_ARGS", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "Args", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormContract extends ActivityResultContract<Args, FormResult> {
    public static final int $stable = 0;
    public static final String EXTRA_ARGS = "extra_activity_args";
    public static final FormContract INSTANCE = new FormContract();

    private FormContract() {
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) FormActivity.class).putExtra("extra_activity_args", input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public FormResult parseResult(int resultCode, Intent intent) {
        return FormResult.INSTANCE.fromIntent(intent);
    }

    /* compiled from: FormContract.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 82\u00020\u0001:\u00018BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jb\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u000eJ\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u000eHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00069"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;", "Landroid/os/Parcelable;", "selectedPaymentMethodCode", "", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "hasSavedPaymentMethods", "", "configuration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "paymentElementCallbackIdentifier", "statusBarColor", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Ljava/lang/Integer;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "getSelectedPaymentMethodCode", "()Ljava/lang/String;", "getPaymentMethodMetadata", "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "getHasSavedPaymentMethods", "()Z", "getConfiguration", "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "getInitializationMode", "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "getPaymentElementCallbackIdentifier", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;ZLcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Ljava/lang/Integer;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final EmbeddedPaymentElement.Configuration configuration;
        private final boolean hasSavedPaymentMethods;
        private final PaymentElementLoader.InitializationMode initializationMode;
        private final String paymentElementCallbackIdentifier;
        private final PaymentMethodMetadata paymentMethodMetadata;
        private final PaymentSelection paymentSelection;
        private final String selectedPaymentMethodCode;
        private final Integer statusBarColor;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: FormContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), PaymentMethodMetadata.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, EmbeddedPaymentElement.Configuration.CREATOR.createFromParcel(parcel), (PaymentElementLoader.InitializationMode) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (PaymentSelection) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, PaymentMethodMetadata paymentMethodMetadata, boolean z, EmbeddedPaymentElement.Configuration configuration, PaymentElementLoader.InitializationMode initializationMode, String str2, Integer num, PaymentSelection paymentSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.selectedPaymentMethodCode;
            }
            if ((i & 2) != 0) {
                paymentMethodMetadata = args.paymentMethodMetadata;
            }
            if ((i & 4) != 0) {
                z = args.hasSavedPaymentMethods;
            }
            if ((i & 8) != 0) {
                configuration = args.configuration;
            }
            if ((i & 16) != 0) {
                initializationMode = args.initializationMode;
            }
            if ((i & 32) != 0) {
                str2 = args.paymentElementCallbackIdentifier;
            }
            if ((i & 64) != 0) {
                num = args.statusBarColor;
            }
            if ((i & 128) != 0) {
                paymentSelection = args.paymentSelection;
            }
            Integer num2 = num;
            PaymentSelection paymentSelection2 = paymentSelection;
            PaymentElementLoader.InitializationMode initializationMode2 = initializationMode;
            String str3 = str2;
            return args.copy(str, paymentMethodMetadata, z, configuration, initializationMode2, str3, num2, paymentSelection2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSelectedPaymentMethodCode() {
            return this.selectedPaymentMethodCode;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasSavedPaymentMethods() {
            return this.hasSavedPaymentMethods;
        }

        /* renamed from: component4, reason: from getter */
        public final EmbeddedPaymentElement.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component5, reason: from getter */
        public final PaymentElementLoader.InitializationMode getInitializationMode() {
            return this.initializationMode;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPaymentElementCallbackIdentifier() {
            return this.paymentElementCallbackIdentifier;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        /* renamed from: component8, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final Args copy(String selectedPaymentMethodCode, PaymentMethodMetadata paymentMethodMetadata, boolean hasSavedPaymentMethods, EmbeddedPaymentElement.Configuration configuration, PaymentElementLoader.InitializationMode initializationMode, String paymentElementCallbackIdentifier, Integer statusBarColor, PaymentSelection paymentSelection) {
            Intrinsics.checkNotNullParameter(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            return new Args(selectedPaymentMethodCode, paymentMethodMetadata, hasSavedPaymentMethods, configuration, initializationMode, paymentElementCallbackIdentifier, statusBarColor, paymentSelection);
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
            return Intrinsics.areEqual(this.selectedPaymentMethodCode, args.selectedPaymentMethodCode) && Intrinsics.areEqual(this.paymentMethodMetadata, args.paymentMethodMetadata) && this.hasSavedPaymentMethods == args.hasSavedPaymentMethods && Intrinsics.areEqual(this.configuration, args.configuration) && Intrinsics.areEqual(this.initializationMode, args.initializationMode) && Intrinsics.areEqual(this.paymentElementCallbackIdentifier, args.paymentElementCallbackIdentifier) && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.paymentSelection, args.paymentSelection);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.selectedPaymentMethodCode.hashCode() * 31) + this.paymentMethodMetadata.hashCode()) * 31) + Boolean.hashCode(this.hasSavedPaymentMethods)) * 31) + this.configuration.hashCode()) * 31) + this.initializationMode.hashCode()) * 31) + this.paymentElementCallbackIdentifier.hashCode()) * 31;
            Integer num = this.statusBarColor;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            PaymentSelection paymentSelection = this.paymentSelection;
            return iHashCode2 + (paymentSelection != null ? paymentSelection.hashCode() : 0);
        }

        public String toString() {
            return "Args(selectedPaymentMethodCode=" + this.selectedPaymentMethodCode + ", paymentMethodMetadata=" + this.paymentMethodMetadata + ", hasSavedPaymentMethods=" + this.hasSavedPaymentMethods + ", configuration=" + this.configuration + ", initializationMode=" + this.initializationMode + ", paymentElementCallbackIdentifier=" + this.paymentElementCallbackIdentifier + ", statusBarColor=" + this.statusBarColor + ", paymentSelection=" + this.paymentSelection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.selectedPaymentMethodCode);
            this.paymentMethodMetadata.writeToParcel(dest, flags);
            dest.writeInt(this.hasSavedPaymentMethods ? 1 : 0);
            this.configuration.writeToParcel(dest, flags);
            dest.writeParcelable(this.initializationMode, flags);
            dest.writeString(this.paymentElementCallbackIdentifier);
            Integer num = this.statusBarColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeParcelable(this.paymentSelection, flags);
        }

        public Args(String selectedPaymentMethodCode, PaymentMethodMetadata paymentMethodMetadata, boolean z, EmbeddedPaymentElement.Configuration configuration, PaymentElementLoader.InitializationMode initializationMode, String paymentElementCallbackIdentifier, Integer num, PaymentSelection paymentSelection) {
            Intrinsics.checkNotNullParameter(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            this.selectedPaymentMethodCode = selectedPaymentMethodCode;
            this.paymentMethodMetadata = paymentMethodMetadata;
            this.hasSavedPaymentMethods = z;
            this.configuration = configuration;
            this.initializationMode = initializationMode;
            this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
            this.statusBarColor = num;
            this.paymentSelection = paymentSelection;
        }

        public final String getSelectedPaymentMethodCode() {
            return this.selectedPaymentMethodCode;
        }

        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        public final boolean getHasSavedPaymentMethods() {
            return this.hasSavedPaymentMethods;
        }

        public final EmbeddedPaymentElement.Configuration getConfiguration() {
            return this.configuration;
        }

        public final PaymentElementLoader.InitializationMode getInitializationMode() {
            return this.initializationMode;
        }

        public final String getPaymentElementCallbackIdentifier() {
            return this.paymentElementCallbackIdentifier;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        /* compiled from: FormContract.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
