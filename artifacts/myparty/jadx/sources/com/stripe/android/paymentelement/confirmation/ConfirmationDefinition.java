package com.stripe.android.paymentelement.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCaller;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler.Option;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmationDefinition.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u0004*\b\b\u0003\u0010\u0005*\u00020\u00062\u00020\u0007:\u0003*+,J\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00152\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0016J-\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u00022\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0012H&¢\u0006\u0002\u0010\u001bJ)\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00180 H&¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010#J/\u0010$\u001a\u00020%2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00028\u0003H&¢\u0006\u0002\u0010)R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "TConfirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "TLauncher", "TLauncherArgs", "TLauncherResult", "Landroid/os/Parcelable;", "", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "option", "confirmationOption", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "canConfirm", "", "confirmationParameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "", "launcher", "arguments", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V", "createLauncher", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "onResult", "Lkotlin/Function1;", "(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "unregister", "(Ljava/lang/Object;)V", "toResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Landroid/os/Parcelable;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "Parameters", "Result", "Action", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ConfirmationDefinition<TConfirmationOption extends ConfirmationHandler.Option, TLauncher, TLauncherArgs, TLauncherResult extends Parcelable> {

    /* compiled from: ConfirmationDefinition.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <TConfirmationOption extends ConfirmationHandler.Option, TLauncher, TLauncherArgs, TLauncherResult extends Parcelable> boolean canConfirm(ConfirmationDefinition<TConfirmationOption, TLauncher, TLauncherArgs, TLauncherResult> confirmationDefinition, TConfirmationOption confirmationOption, Parameters confirmationParameters) {
            Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
            Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
            return true;
        }

        public static <TConfirmationOption extends ConfirmationHandler.Option, TLauncher, TLauncherArgs, TLauncherResult extends Parcelable> void unregister(ConfirmationDefinition<TConfirmationOption, TLauncher, TLauncherArgs, TLauncherResult> confirmationDefinition, TLauncher tlauncher) {
        }
    }

    Object action(TConfirmationOption tconfirmationoption, Parameters parameters, Continuation<? super Action<TLauncherArgs>> continuation);

    boolean canConfirm(TConfirmationOption confirmationOption, Parameters confirmationParameters);

    TLauncher createLauncher(ActivityResultCaller activityResultCaller, Function1<? super TLauncherResult, Unit> onResult);

    String getKey();

    void launch(TLauncher launcher, TLauncherArgs arguments, TConfirmationOption confirmationOption, Parameters confirmationParameters);

    TConfirmationOption option(ConfirmationHandler.Option confirmationOption);

    Result toResult(TConfirmationOption confirmationOption, Parameters confirmationParameters, DeferredIntentConfirmationType deferredIntentConfirmationType, TLauncherResult result);

    void unregister(TLauncher launcher);

    /* compiled from: ConfirmationDefinition.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "Landroid/os/Parcelable;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getInitializationMode", "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Parameters implements Parcelable {
        private final PaymentSheet.Appearance appearance;
        private final PaymentElementLoader.InitializationMode initializationMode;
        private final StripeIntent intent;
        private final AddressDetails shippingDetails;
        public static final Parcelable.Creator<Parameters> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ConfirmationDefinition.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Parameters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Parameters createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Parameters((StripeIntent) parcel.readParcelable(Parameters.class.getClassLoader()), PaymentSheet.Appearance.CREATOR.createFromParcel(parcel), (PaymentElementLoader.InitializationMode) parcel.readParcelable(Parameters.class.getClassLoader()), parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Parameters[] newArray(int i) {
                return new Parameters[i];
            }
        }

        public static /* synthetic */ Parameters copy$default(Parameters parameters, StripeIntent stripeIntent, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, AddressDetails addressDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                stripeIntent = parameters.intent;
            }
            if ((i & 2) != 0) {
                appearance = parameters.appearance;
            }
            if ((i & 4) != 0) {
                initializationMode = parameters.initializationMode;
            }
            if ((i & 8) != 0) {
                addressDetails = parameters.shippingDetails;
            }
            return parameters.copy(stripeIntent, appearance, initializationMode, addressDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final StripeIntent getIntent() {
            return this.intent;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentElementLoader.InitializationMode getInitializationMode() {
            return this.initializationMode;
        }

        /* renamed from: component4, reason: from getter */
        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        public final Parameters copy(StripeIntent intent, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, AddressDetails shippingDetails) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            return new Parameters(intent, appearance, initializationMode, shippingDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return Intrinsics.areEqual(this.intent, parameters.intent) && Intrinsics.areEqual(this.appearance, parameters.appearance) && Intrinsics.areEqual(this.initializationMode, parameters.initializationMode) && Intrinsics.areEqual(this.shippingDetails, parameters.shippingDetails);
        }

        public int hashCode() {
            int iHashCode = ((((this.intent.hashCode() * 31) + this.appearance.hashCode()) * 31) + this.initializationMode.hashCode()) * 31;
            AddressDetails addressDetails = this.shippingDetails;
            return iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode());
        }

        public String toString() {
            return "Parameters(intent=" + this.intent + ", appearance=" + this.appearance + ", initializationMode=" + this.initializationMode + ", shippingDetails=" + this.shippingDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.intent, flags);
            this.appearance.writeToParcel(dest, flags);
            dest.writeParcelable(this.initializationMode, flags);
            AddressDetails addressDetails = this.shippingDetails;
            if (addressDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                addressDetails.writeToParcel(dest, flags);
            }
        }

        public Parameters(StripeIntent intent, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, AddressDetails addressDetails) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            this.intent = intent;
            this.appearance = appearance;
            this.initializationMode = initializationMode;
            this.shippingDetails = addressDetails;
        }

        public final StripeIntent getIntent() {
            return this.intent;
        }

        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        public final PaymentElementLoader.InitializationMode getInitializationMode() {
            return this.initializationMode;
        }

        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }
    }

    /* compiled from: ConfirmationDefinition.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "", "Canceled", "Succeeded", "NextStep", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Canceled;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result {

        /* compiled from: ConfirmationDefinition.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Canceled;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;)V", "getAction", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Canceled implements Result {
            public static final int $stable = 0;
            private final ConfirmationHandler.Result.Canceled.Action action;

            public static /* synthetic */ Canceled copy$default(Canceled canceled, ConfirmationHandler.Result.Canceled.Action action, int i, Object obj) {
                if ((i & 1) != 0) {
                    action = canceled.action;
                }
                return canceled.copy(action);
            }

            /* renamed from: component1, reason: from getter */
            public final ConfirmationHandler.Result.Canceled.Action getAction() {
                return this.action;
            }

            public final Canceled copy(ConfirmationHandler.Result.Canceled.Action action) {
                Intrinsics.checkNotNullParameter(action, "action");
                return new Canceled(action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Canceled) && this.action == ((Canceled) other).action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "Canceled(action=" + this.action + ")";
            }

            public Canceled(ConfirmationHandler.Result.Canceled.Action action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public final ConfirmationHandler.Result.Canceled.Action getAction() {
                return this.action;
            }
        }

        /* compiled from: ConfirmationDefinition.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Succeeded;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "completedFullPaymentFlow", "", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "getCompletedFullPaymentFlow", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Succeeded implements Result {
            public static final int $stable = 8;
            private final boolean completedFullPaymentFlow;
            private final DeferredIntentConfirmationType deferredIntentConfirmationType;
            private final StripeIntent intent;

            public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, StripeIntent stripeIntent, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    stripeIntent = succeeded.intent;
                }
                if ((i & 2) != 0) {
                    deferredIntentConfirmationType = succeeded.deferredIntentConfirmationType;
                }
                if ((i & 4) != 0) {
                    z = succeeded.completedFullPaymentFlow;
                }
                return succeeded.copy(stripeIntent, deferredIntentConfirmationType, z);
            }

            /* renamed from: component1, reason: from getter */
            public final StripeIntent getIntent() {
                return this.intent;
            }

            /* renamed from: component2, reason: from getter */
            public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return this.deferredIntentConfirmationType;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getCompletedFullPaymentFlow() {
                return this.completedFullPaymentFlow;
            }

            public final Succeeded copy(StripeIntent intent, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean completedFullPaymentFlow) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return new Succeeded(intent, deferredIntentConfirmationType, completedFullPaymentFlow);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Succeeded)) {
                    return false;
                }
                Succeeded succeeded = (Succeeded) other;
                return Intrinsics.areEqual(this.intent, succeeded.intent) && this.deferredIntentConfirmationType == succeeded.deferredIntentConfirmationType && this.completedFullPaymentFlow == succeeded.completedFullPaymentFlow;
            }

            public int hashCode() {
                int iHashCode = this.intent.hashCode() * 31;
                DeferredIntentConfirmationType deferredIntentConfirmationType = this.deferredIntentConfirmationType;
                return ((iHashCode + (deferredIntentConfirmationType == null ? 0 : deferredIntentConfirmationType.hashCode())) * 31) + Boolean.hashCode(this.completedFullPaymentFlow);
            }

            public String toString() {
                return "Succeeded(intent=" + this.intent + ", deferredIntentConfirmationType=" + this.deferredIntentConfirmationType + ", completedFullPaymentFlow=" + this.completedFullPaymentFlow + ")";
            }

            public Succeeded(StripeIntent intent, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean z) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.intent = intent;
                this.deferredIntentConfirmationType = deferredIntentConfirmationType;
                this.completedFullPaymentFlow = z;
            }

            public /* synthetic */ Succeeded(StripeIntent stripeIntent, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(stripeIntent, deferredIntentConfirmationType, (i & 4) != 0 ? true : z);
            }

            public final StripeIntent getIntent() {
                return this.intent;
            }

            public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return this.deferredIntentConfirmationType;
            }

            public final boolean getCompletedFullPaymentFlow() {
                return this.completedFullPaymentFlow;
            }
        }

        /* compiled from: ConfirmationDefinition.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$NextStep;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "parameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V", "getConfirmationOption", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "getParameters", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NextStep implements Result {
            public static final int $stable = 8;
            private final ConfirmationHandler.Option confirmationOption;
            private final Parameters parameters;

            public static /* synthetic */ NextStep copy$default(NextStep nextStep, ConfirmationHandler.Option option, Parameters parameters, int i, Object obj) {
                if ((i & 1) != 0) {
                    option = nextStep.confirmationOption;
                }
                if ((i & 2) != 0) {
                    parameters = nextStep.parameters;
                }
                return nextStep.copy(option, parameters);
            }

            /* renamed from: component1, reason: from getter */
            public final ConfirmationHandler.Option getConfirmationOption() {
                return this.confirmationOption;
            }

            /* renamed from: component2, reason: from getter */
            public final Parameters getParameters() {
                return this.parameters;
            }

            public final NextStep copy(ConfirmationHandler.Option confirmationOption, Parameters parameters) {
                Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                return new NextStep(confirmationOption, parameters);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NextStep)) {
                    return false;
                }
                NextStep nextStep = (NextStep) other;
                return Intrinsics.areEqual(this.confirmationOption, nextStep.confirmationOption) && Intrinsics.areEqual(this.parameters, nextStep.parameters);
            }

            public int hashCode() {
                return (this.confirmationOption.hashCode() * 31) + this.parameters.hashCode();
            }

            public String toString() {
                return "NextStep(confirmationOption=" + this.confirmationOption + ", parameters=" + this.parameters + ")";
            }

            public NextStep(ConfirmationHandler.Option confirmationOption, Parameters parameters) {
                Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                this.confirmationOption = confirmationOption;
                this.parameters = parameters;
            }

            public final ConfirmationHandler.Option getConfirmationOption() {
                return this.confirmationOption;
            }

            public final Parameters getParameters() {
                return this.parameters;
            }
        }

        /* compiled from: ConfirmationDefinition.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result$Failed;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "cause", "", "message", "Lcom/stripe/android/core/strings/ResolvableString;", "type", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "getType", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Failed implements Result {
            public static final int $stable = 8;
            private final Throwable cause;
            private final ResolvableString message;
            private final ConfirmationHandler.Result.Failed.ErrorType type;

            public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, ResolvableString resolvableString, ConfirmationHandler.Result.Failed.ErrorType errorType, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = failed.cause;
                }
                if ((i & 2) != 0) {
                    resolvableString = failed.message;
                }
                if ((i & 4) != 0) {
                    errorType = failed.type;
                }
                return failed.copy(th, resolvableString, errorType);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            /* renamed from: component2, reason: from getter */
            public final ResolvableString getMessage() {
                return this.message;
            }

            /* renamed from: component3, reason: from getter */
            public final ConfirmationHandler.Result.Failed.ErrorType getType() {
                return this.type;
            }

            public final Failed copy(Throwable cause, ResolvableString message, ConfirmationHandler.Result.Failed.ErrorType type) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(type, "type");
                return new Failed(cause, message, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failed)) {
                    return false;
                }
                Failed failed = (Failed) other;
                return Intrinsics.areEqual(this.cause, failed.cause) && Intrinsics.areEqual(this.message, failed.message) && Intrinsics.areEqual(this.type, failed.type);
            }

            public int hashCode() {
                return (((this.cause.hashCode() * 31) + this.message.hashCode()) * 31) + this.type.hashCode();
            }

            public String toString() {
                return "Failed(cause=" + this.cause + ", message=" + this.message + ", type=" + this.type + ")";
            }

            public Failed(Throwable cause, ResolvableString message, ConfirmationHandler.Result.Failed.ErrorType type) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(type, "type");
                this.cause = cause;
                this.message = message;
                this.type = type;
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public final ResolvableString getMessage() {
                return this.message;
            }

            public final ConfirmationHandler.Result.Failed.ErrorType getType() {
                return this.type;
            }
        }
    }

    /* compiled from: ConfirmationDefinition.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0004\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "TLauncherArgs", "", "Complete", "Fail", "Launch", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Fail;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action<TLauncherArgs> {

        /* compiled from: ConfirmationDefinition.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0005\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J9\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;", "TLauncherArgs", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "completedFullPaymentFlow", "", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "getConfirmationOption", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "getCompletedFullPaymentFlow", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Complete<TLauncherArgs> implements Action<TLauncherArgs> {
            public static final int $stable = 8;
            private final boolean completedFullPaymentFlow;
            private final ConfirmationHandler.Option confirmationOption;
            private final DeferredIntentConfirmationType deferredIntentConfirmationType;
            private final StripeIntent intent;

            public static /* synthetic */ Complete copy$default(Complete complete, StripeIntent stripeIntent, ConfirmationHandler.Option option, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    stripeIntent = complete.intent;
                }
                if ((i & 2) != 0) {
                    option = complete.confirmationOption;
                }
                if ((i & 4) != 0) {
                    deferredIntentConfirmationType = complete.deferredIntentConfirmationType;
                }
                if ((i & 8) != 0) {
                    z = complete.completedFullPaymentFlow;
                }
                return complete.copy(stripeIntent, option, deferredIntentConfirmationType, z);
            }

            /* renamed from: component1, reason: from getter */
            public final StripeIntent getIntent() {
                return this.intent;
            }

            /* renamed from: component2, reason: from getter */
            public final ConfirmationHandler.Option getConfirmationOption() {
                return this.confirmationOption;
            }

            /* renamed from: component3, reason: from getter */
            public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return this.deferredIntentConfirmationType;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getCompletedFullPaymentFlow() {
                return this.completedFullPaymentFlow;
            }

            public final Complete<TLauncherArgs> copy(StripeIntent intent, ConfirmationHandler.Option confirmationOption, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean completedFullPaymentFlow) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
                return new Complete<>(intent, confirmationOption, deferredIntentConfirmationType, completedFullPaymentFlow);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) other;
                return Intrinsics.areEqual(this.intent, complete.intent) && Intrinsics.areEqual(this.confirmationOption, complete.confirmationOption) && this.deferredIntentConfirmationType == complete.deferredIntentConfirmationType && this.completedFullPaymentFlow == complete.completedFullPaymentFlow;
            }

            public int hashCode() {
                int iHashCode = ((this.intent.hashCode() * 31) + this.confirmationOption.hashCode()) * 31;
                DeferredIntentConfirmationType deferredIntentConfirmationType = this.deferredIntentConfirmationType;
                return ((iHashCode + (deferredIntentConfirmationType == null ? 0 : deferredIntentConfirmationType.hashCode())) * 31) + Boolean.hashCode(this.completedFullPaymentFlow);
            }

            public String toString() {
                return "Complete(intent=" + this.intent + ", confirmationOption=" + this.confirmationOption + ", deferredIntentConfirmationType=" + this.deferredIntentConfirmationType + ", completedFullPaymentFlow=" + this.completedFullPaymentFlow + ")";
            }

            public Complete(StripeIntent intent, ConfirmationHandler.Option confirmationOption, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean z) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
                this.intent = intent;
                this.confirmationOption = confirmationOption;
                this.deferredIntentConfirmationType = deferredIntentConfirmationType;
                this.completedFullPaymentFlow = z;
            }

            public final StripeIntent getIntent() {
                return this.intent;
            }

            public final ConfirmationHandler.Option getConfirmationOption() {
                return this.confirmationOption;
            }

            public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return this.deferredIntentConfirmationType;
            }

            public final boolean getCompletedFullPaymentFlow() {
                return this.completedFullPaymentFlow;
            }
        }

        /* compiled from: ConfirmationDefinition.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0005\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Fail;", "TLauncherArgs", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "cause", "", "message", "Lcom/stripe/android/core/strings/ResolvableString;", "errorType", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "getErrorType", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Fail<TLauncherArgs> implements Action<TLauncherArgs> {
            public static final int $stable = 8;
            private final Throwable cause;
            private final ConfirmationHandler.Result.Failed.ErrorType errorType;
            private final ResolvableString message;

            public static /* synthetic */ Fail copy$default(Fail fail, Throwable th, ResolvableString resolvableString, ConfirmationHandler.Result.Failed.ErrorType errorType, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = fail.cause;
                }
                if ((i & 2) != 0) {
                    resolvableString = fail.message;
                }
                if ((i & 4) != 0) {
                    errorType = fail.errorType;
                }
                return fail.copy(th, resolvableString, errorType);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            /* renamed from: component2, reason: from getter */
            public final ResolvableString getMessage() {
                return this.message;
            }

            /* renamed from: component3, reason: from getter */
            public final ConfirmationHandler.Result.Failed.ErrorType getErrorType() {
                return this.errorType;
            }

            public final Fail<TLauncherArgs> copy(Throwable cause, ResolvableString message, ConfirmationHandler.Result.Failed.ErrorType errorType) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                return new Fail<>(cause, message, errorType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Fail)) {
                    return false;
                }
                Fail fail = (Fail) other;
                return Intrinsics.areEqual(this.cause, fail.cause) && Intrinsics.areEqual(this.message, fail.message) && Intrinsics.areEqual(this.errorType, fail.errorType);
            }

            public int hashCode() {
                return (((this.cause.hashCode() * 31) + this.message.hashCode()) * 31) + this.errorType.hashCode();
            }

            public String toString() {
                return "Fail(cause=" + this.cause + ", message=" + this.message + ", errorType=" + this.errorType + ")";
            }

            public Fail(Throwable cause, ResolvableString message, ConfirmationHandler.Result.Failed.ErrorType errorType) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                this.cause = cause;
                this.message = message;
                this.errorType = errorType;
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public final ResolvableString getMessage() {
                return this.message;
            }

            public final ConfirmationHandler.Result.Failed.ErrorType getErrorType() {
                return this.errorType;
            }
        }

        /* compiled from: ConfirmationDefinition.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0005\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\u0006\u0010\u0003\u001a\u00028\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00028\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;", "TLauncherArgs", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "launcherArguments", "receivesResultInProcess", "", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "<init>", "(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)V", "getLauncherArguments", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getReceivesResultInProcess", "()Z", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;ZLcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Launch;", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Launch<TLauncherArgs> implements Action<TLauncherArgs> {
            public static final int $stable = 0;
            private final DeferredIntentConfirmationType deferredIntentConfirmationType;
            private final TLauncherArgs launcherArguments;
            private final boolean receivesResultInProcess;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Launch copy$default(Launch launch, Object obj, boolean z, DeferredIntentConfirmationType deferredIntentConfirmationType, int i, Object obj2) {
                if ((i & 1) != 0) {
                    obj = launch.launcherArguments;
                }
                if ((i & 2) != 0) {
                    z = launch.receivesResultInProcess;
                }
                if ((i & 4) != 0) {
                    deferredIntentConfirmationType = launch.deferredIntentConfirmationType;
                }
                return launch.copy(obj, z, deferredIntentConfirmationType);
            }

            public final TLauncherArgs component1() {
                return this.launcherArguments;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getReceivesResultInProcess() {
                return this.receivesResultInProcess;
            }

            /* renamed from: component3, reason: from getter */
            public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return this.deferredIntentConfirmationType;
            }

            public final Launch<TLauncherArgs> copy(TLauncherArgs launcherArguments, boolean receivesResultInProcess, DeferredIntentConfirmationType deferredIntentConfirmationType) {
                return new Launch<>(launcherArguments, receivesResultInProcess, deferredIntentConfirmationType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Launch)) {
                    return false;
                }
                Launch launch = (Launch) other;
                return Intrinsics.areEqual(this.launcherArguments, launch.launcherArguments) && this.receivesResultInProcess == launch.receivesResultInProcess && this.deferredIntentConfirmationType == launch.deferredIntentConfirmationType;
            }

            public int hashCode() {
                TLauncherArgs tlauncherargs = this.launcherArguments;
                int iHashCode = (((tlauncherargs == null ? 0 : tlauncherargs.hashCode()) * 31) + Boolean.hashCode(this.receivesResultInProcess)) * 31;
                DeferredIntentConfirmationType deferredIntentConfirmationType = this.deferredIntentConfirmationType;
                return iHashCode + (deferredIntentConfirmationType != null ? deferredIntentConfirmationType.hashCode() : 0);
            }

            public String toString() {
                return "Launch(launcherArguments=" + this.launcherArguments + ", receivesResultInProcess=" + this.receivesResultInProcess + ", deferredIntentConfirmationType=" + this.deferredIntentConfirmationType + ")";
            }

            public Launch(TLauncherArgs tlauncherargs, boolean z, DeferredIntentConfirmationType deferredIntentConfirmationType) {
                this.launcherArguments = tlauncherargs;
                this.receivesResultInProcess = z;
                this.deferredIntentConfirmationType = deferredIntentConfirmationType;
            }

            public final TLauncherArgs getLauncherArguments() {
                return this.launcherArguments;
            }

            public final boolean getReceivesResultInProcess() {
                return this.receivesResultInProcess;
            }

            public final DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return this.deferredIntentConfirmationType;
            }
        }
    }
}
