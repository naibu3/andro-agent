package com.stripe.android.paymentelement.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ConfirmationHandler.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u001cJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016H¦@¢\u0006\u0002\u0010\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "", "hasReloadedFromProcessDeath", "", "getHasReloadedFromProcessDeath", "()Z", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "register", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", ViewProps.START, "arguments", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "Args", "State", "Result", "Option", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ConfirmationHandler {

    /* compiled from: ConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;", "", "create", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        ConfirmationHandler create(CoroutineScope scope);
    }

    /* compiled from: ConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "Landroid/os/Parcelable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Option extends Parcelable {
    }

    Object awaitResult(Continuation<? super Result> continuation);

    boolean getHasReloadedFromProcessDeath();

    StateFlow<State> getState();

    void register(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner);

    Object start(Args args, Continuation<? super Unit> continuation);

    /* compiled from: ConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;", "Landroid/os/Parcelable;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "getConfirmationOption", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getInitializationMode", "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final PaymentSheet.Appearance appearance;
        private final Option confirmationOption;
        private final PaymentElementLoader.InitializationMode initializationMode;
        private final StripeIntent intent;
        private final AddressDetails shippingDetails;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: ConfirmationHandler.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((StripeIntent) parcel.readParcelable(Args.class.getClassLoader()), (Option) parcel.readParcelable(Args.class.getClassLoader()), PaymentSheet.Appearance.CREATOR.createFromParcel(parcel), (PaymentElementLoader.InitializationMode) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, StripeIntent stripeIntent, Option option, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, AddressDetails addressDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                stripeIntent = args.intent;
            }
            if ((i & 2) != 0) {
                option = args.confirmationOption;
            }
            if ((i & 4) != 0) {
                appearance = args.appearance;
            }
            if ((i & 8) != 0) {
                initializationMode = args.initializationMode;
            }
            if ((i & 16) != 0) {
                addressDetails = args.shippingDetails;
            }
            AddressDetails addressDetails2 = addressDetails;
            PaymentSheet.Appearance appearance2 = appearance;
            return args.copy(stripeIntent, option, appearance2, initializationMode, addressDetails2);
        }

        /* renamed from: component1, reason: from getter */
        public final StripeIntent getIntent() {
            return this.intent;
        }

        /* renamed from: component2, reason: from getter */
        public final Option getConfirmationOption() {
            return this.confirmationOption;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentElementLoader.InitializationMode getInitializationMode() {
            return this.initializationMode;
        }

        /* renamed from: component5, reason: from getter */
        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        public final Args copy(StripeIntent intent, Option confirmationOption, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, AddressDetails shippingDetails) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            return new Args(intent, confirmationOption, appearance, initializationMode, shippingDetails);
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
            return Intrinsics.areEqual(this.intent, args.intent) && Intrinsics.areEqual(this.confirmationOption, args.confirmationOption) && Intrinsics.areEqual(this.appearance, args.appearance) && Intrinsics.areEqual(this.initializationMode, args.initializationMode) && Intrinsics.areEqual(this.shippingDetails, args.shippingDetails);
        }

        public int hashCode() {
            int iHashCode = ((((((this.intent.hashCode() * 31) + this.confirmationOption.hashCode()) * 31) + this.appearance.hashCode()) * 31) + this.initializationMode.hashCode()) * 31;
            AddressDetails addressDetails = this.shippingDetails;
            return iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode());
        }

        public String toString() {
            return "Args(intent=" + this.intent + ", confirmationOption=" + this.confirmationOption + ", appearance=" + this.appearance + ", initializationMode=" + this.initializationMode + ", shippingDetails=" + this.shippingDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.intent, flags);
            dest.writeParcelable(this.confirmationOption, flags);
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

        public Args(StripeIntent intent, Option confirmationOption, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, AddressDetails addressDetails) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
            this.intent = intent;
            this.confirmationOption = confirmationOption;
            this.appearance = appearance;
            this.initializationMode = initializationMode;
            this.shippingDetails = addressDetails;
        }

        public final StripeIntent getIntent() {
            return this.intent;
        }

        public final Option getConfirmationOption() {
            return this.confirmationOption;
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

    /* compiled from: ConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;", "", "Idle", "Confirming", "Complete", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Idle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface State {

        /* compiled from: ConfirmationHandler.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Idle;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Idle implements State {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Idle)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -329797954;
            }

            public String toString() {
                return "Idle";
            }

            private Idle() {
            }
        }

        /* compiled from: ConfirmationHandler.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Confirming;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;", "option", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;)V", "getOption", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Confirming implements State {
            public static final int $stable = 8;
            private final Option option;

            public static /* synthetic */ Confirming copy$default(Confirming confirming, Option option, int i, Object obj) {
                if ((i & 1) != 0) {
                    option = confirming.option;
                }
                return confirming.copy(option);
            }

            /* renamed from: component1, reason: from getter */
            public final Option getOption() {
                return this.option;
            }

            public final Confirming copy(Option option) {
                Intrinsics.checkNotNullParameter(option, "option");
                return new Confirming(option);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Confirming) && Intrinsics.areEqual(this.option, ((Confirming) other).option);
            }

            public int hashCode() {
                return this.option.hashCode();
            }

            public String toString() {
                return "Confirming(option=" + this.option + ")";
            }

            public Confirming(Option option) {
                Intrinsics.checkNotNullParameter(option, "option");
                this.option = option;
            }

            public final Option getOption() {
                return this.option;
            }
        }

        /* compiled from: ConfirmationHandler.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State$Complete;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;)V", "getResult", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Complete implements State {
            public static final int $stable = 8;
            private final Result result;

            public static /* synthetic */ Complete copy$default(Complete complete, Result result, int i, Object obj) {
                if ((i & 1) != 0) {
                    result = complete.result;
                }
                return complete.copy(result);
            }

            /* renamed from: component1, reason: from getter */
            public final Result getResult() {
                return this.result;
            }

            public final Complete copy(Result result) {
                Intrinsics.checkNotNullParameter(result, "result");
                return new Complete(result);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Complete) && Intrinsics.areEqual(this.result, ((Complete) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "Complete(result=" + this.result + ")";
            }

            public Complete(Result result) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            public final Result getResult() {
                return this.result;
            }
        }
    }

    /* compiled from: ConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "", "Canceled", "Succeeded", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Succeeded;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result {

        /* compiled from: ConfirmationHandler.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;)V", "getAction", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Action", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Canceled implements Result {
            public static final int $stable = 0;
            private final Action action;

            public static /* synthetic */ Canceled copy$default(Canceled canceled, Action action, int i, Object obj) {
                if ((i & 1) != 0) {
                    action = canceled.action;
                }
                return canceled.copy(action);
            }

            /* renamed from: component1, reason: from getter */
            public final Action getAction() {
                return this.action;
            }

            public final Canceled copy(Action action) {
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

            public Canceled(Action action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
            }

            public final Action getAction() {
                return this.action;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ConfirmationHandler.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled$Action;", "", "<init>", "(Ljava/lang/String;I)V", "InformCancellation", "ModifyPaymentDetails", "None", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Action {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Action[] $VALUES;
                public static final Action InformCancellation = new Action("InformCancellation", 0);
                public static final Action ModifyPaymentDetails = new Action("ModifyPaymentDetails", 1);
                public static final Action None = new Action("None", 2);

                private static final /* synthetic */ Action[] $values() {
                    return new Action[]{InformCancellation, ModifyPaymentDetails, None};
                }

                public static EnumEntries<Action> getEntries() {
                    return $ENTRIES;
                }

                private Action(String str, int i) {
                }

                static {
                    Action[] actionArr$values = $values();
                    $VALUES = actionArr$values;
                    $ENTRIES = EnumEntriesKt.enumEntries(actionArr$values);
                }

                public static Action valueOf(String str) {
                    return (Action) Enum.valueOf(Action.class, str);
                }

                public static Action[] values() {
                    return (Action[]) $VALUES.clone();
                }
            }
        }

        /* compiled from: ConfirmationHandler.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Succeeded;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "completedFullPaymentFlow", "", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "getCompletedFullPaymentFlow", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        /* compiled from: ConfirmationHandler.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "cause", "", "message", "Lcom/stripe/android/core/strings/ResolvableString;", "type", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "getType", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "ErrorType", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Failed implements Result {
            public static final int $stable = 8;
            private final Throwable cause;
            private final ResolvableString message;
            private final ErrorType type;

            public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, ResolvableString resolvableString, ErrorType errorType, int i, Object obj) {
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
            public final ErrorType getType() {
                return this.type;
            }

            public final Failed copy(Throwable cause, ResolvableString message, ErrorType type) {
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

            public Failed(Throwable cause, ResolvableString message, ErrorType type) {
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

            public final ErrorType getType() {
                return this.type;
            }

            /* compiled from: ConfirmationHandler.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "", "Fatal", "Payment", "Internal", "MerchantIntegration", "ExternalPaymentMethod", "GooglePay", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$ExternalPaymentMethod;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Fatal;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$GooglePay;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Internal;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$MerchantIntegration;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Payment;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public interface ErrorType {

                /* compiled from: ConfirmationHandler.kt */
                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Fatal;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Fatal implements ErrorType {
                    public static final int $stable = 0;
                    public static final Fatal INSTANCE = new Fatal();

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Fatal)) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        return 39140843;
                    }

                    public String toString() {
                        return "Fatal";
                    }

                    private Fatal() {
                    }
                }

                /* compiled from: ConfirmationHandler.kt */
                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Payment;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Payment implements ErrorType {
                    public static final int $stable = 0;
                    public static final Payment INSTANCE = new Payment();

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Payment)) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        return -750281427;
                    }

                    public String toString() {
                        return "Payment";
                    }

                    private Payment() {
                    }
                }

                /* compiled from: ConfirmationHandler.kt */
                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$Internal;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class Internal implements ErrorType {
                    public static final int $stable = 0;
                    public static final Internal INSTANCE = new Internal();

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Internal)) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        return 1698807926;
                    }

                    public String toString() {
                        return "Internal";
                    }

                    private Internal() {
                    }
                }

                /* compiled from: ConfirmationHandler.kt */
                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$MerchantIntegration;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class MerchantIntegration implements ErrorType {
                    public static final int $stable = 0;
                    public static final MerchantIntegration INSTANCE = new MerchantIntegration();

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof MerchantIntegration)) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        return 818859923;
                    }

                    public String toString() {
                        return "MerchantIntegration";
                    }

                    private MerchantIntegration() {
                    }
                }

                /* compiled from: ConfirmationHandler.kt */
                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$ExternalPaymentMethod;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class ExternalPaymentMethod implements ErrorType {
                    public static final int $stable = 0;
                    public static final ExternalPaymentMethod INSTANCE = new ExternalPaymentMethod();

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof ExternalPaymentMethod)) {
                            return false;
                        }
                        return true;
                    }

                    public int hashCode() {
                        return -1281508509;
                    }

                    public String toString() {
                        return "ExternalPaymentMethod";
                    }

                    private ExternalPaymentMethod() {
                    }
                }

                /* compiled from: ConfirmationHandler.kt */
                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType$GooglePay;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed$ErrorType;", "errorCode", "", "<init>", "(I)V", "getErrorCode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final /* data */ class GooglePay implements ErrorType {
                    public static final int $stable = 0;
                    private final int errorCode;

                    public static /* synthetic */ GooglePay copy$default(GooglePay googlePay, int i, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            i = googlePay.errorCode;
                        }
                        return googlePay.copy(i);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final int getErrorCode() {
                        return this.errorCode;
                    }

                    public final GooglePay copy(int errorCode) {
                        return new GooglePay(errorCode);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof GooglePay) && this.errorCode == ((GooglePay) other).errorCode;
                    }

                    public int hashCode() {
                        return Integer.hashCode(this.errorCode);
                    }

                    public String toString() {
                        return "GooglePay(errorCode=" + this.errorCode + ")";
                    }

                    public GooglePay(int i) {
                        this.errorCode = i;
                    }

                    public final int getErrorCode() {
                        return this.errorCode;
                    }
                }
            }
        }
    }
}
