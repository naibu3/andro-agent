package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import com.stripe.android.view.PaymentRelayActivity;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import expo.modules.notifications.service.NotificationsService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;

/* compiled from: PaymentRelayStarter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Legacy", "Modern", "Args", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PaymentRelayStarter extends AuthActivityStarter<Args> {

    /* compiled from: PaymentRelayStarter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Legacy;", "Lcom/stripe/android/PaymentRelayStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "<init>", "(Lcom/stripe/android/view/AuthActivityStarterHost;)V", ViewProps.START, "", CardScanActivity.ARGS, "Lcom/stripe/android/PaymentRelayStarter$Args;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Legacy implements PaymentRelayStarter {
        public static final int $stable = 8;
        private final AuthActivityStarterHost host;

        public Legacy(AuthActivityStarterHost host) {
            Intrinsics.checkNotNullParameter(host, "host");
            this.host = host;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.host.startActivityForResult(PaymentRelayActivity.class, args.toResult().toBundle(), args.getRequestCode());
        }
    }

    /* compiled from: PaymentRelayStarter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Modern;", "Lcom/stripe/android/PaymentRelayStarter;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", ViewProps.START, "", CardScanActivity.ARGS, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Modern implements PaymentRelayStarter {
        public static final int $stable = 8;
        private final ActivityResultLauncher<Args> launcher;

        public Modern(ActivityResultLauncher<Args> launcher) {
            Intrinsics.checkNotNullParameter(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.launcher.launch(args);
        }
    }

    /* compiled from: PaymentRelayStarter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args;", "Landroid/os/Parcelable;", "<init>", "()V", "requestCode", "", "getRequestCode", "()I", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "PaymentIntentArgs", "SetupIntentArgs", "SourceArgs", "ErrorArgs", "Companion", "Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Args implements Parcelable {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ Args(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getRequestCode();

        public abstract PaymentFlowResult.Unvalidated toResult();

        private Args() {
        }

        /* compiled from: PaymentRelayStarter.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u0015J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\rJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\rHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "<init>", "(Lcom/stripe/android/model/PaymentIntent;Ljava/lang/String;)V", "getPaymentIntent$payments_core_release", "()Lcom/stripe/android/model/PaymentIntent;", "getStripeAccountId$payments_core_release", "()Ljava/lang/String;", "requestCode", "", "getRequestCode", "()I", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PaymentIntentArgs extends Args {
            private final PaymentIntent paymentIntent;
            private final String stripeAccountId;
            public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentRelayStarter.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PaymentIntentArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentArgs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PaymentIntentArgs(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentArgs[] newArray(int i) {
                    return new PaymentIntentArgs[i];
                }
            }

            public static /* synthetic */ PaymentIntentArgs copy$default(PaymentIntentArgs paymentIntentArgs, PaymentIntent paymentIntent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentIntent = paymentIntentArgs.paymentIntent;
                }
                if ((i & 2) != 0) {
                    str = paymentIntentArgs.stripeAccountId;
                }
                return paymentIntentArgs.copy(paymentIntent, str);
            }

            /* renamed from: component1$payments_core_release, reason: from getter */
            public final PaymentIntent getPaymentIntent() {
                return this.paymentIntent;
            }

            /* renamed from: component2$payments_core_release, reason: from getter */
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final PaymentIntentArgs copy(PaymentIntent paymentIntent, String stripeAccountId) {
                Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
                return new PaymentIntentArgs(paymentIntent, stripeAccountId);
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
                return Intrinsics.areEqual(this.paymentIntent, paymentIntentArgs.paymentIntent) && Intrinsics.areEqual(this.stripeAccountId, paymentIntentArgs.stripeAccountId);
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return StripePaymentController.PAYMENT_REQUEST_CODE;
            }

            public int hashCode() {
                int iHashCode = this.paymentIntent.hashCode() * 31;
                String str = this.stripeAccountId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "PaymentIntentArgs(paymentIntent=" + this.paymentIntent + ", stripeAccountId=" + this.stripeAccountId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.paymentIntent.writeToParcel(dest, flags);
                dest.writeString(this.stripeAccountId);
            }

            public /* synthetic */ PaymentIntentArgs(PaymentIntent paymentIntent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(paymentIntent, (i & 2) != 0 ? null : str);
            }

            public final PaymentIntent getPaymentIntent$payments_core_release() {
                return this.paymentIntent;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntentArgs(PaymentIntent paymentIntent, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentIntent, "paymentIntent");
                this.paymentIntent = paymentIntent;
                this.stripeAccountId = str;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(this.paymentIntent.getClientSecret(), 0, null, false, null, null, this.stripeAccountId, 62, null);
            }
        }

        /* compiled from: PaymentRelayStarter.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u0015J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\rJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\rHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "setupIntent", "Lcom/stripe/android/model/SetupIntent;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "<init>", "(Lcom/stripe/android/model/SetupIntent;Ljava/lang/String;)V", "getSetupIntent$payments_core_release", "()Lcom/stripe/android/model/SetupIntent;", "getStripeAccountId$payments_core_release", "()Ljava/lang/String;", "requestCode", "", "getRequestCode", "()I", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SetupIntentArgs extends Args {
            private final SetupIntent setupIntent;
            private final String stripeAccountId;
            public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentRelayStarter.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SetupIntentArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentArgs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SetupIntentArgs(SetupIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentArgs[] newArray(int i) {
                    return new SetupIntentArgs[i];
                }
            }

            public static /* synthetic */ SetupIntentArgs copy$default(SetupIntentArgs setupIntentArgs, SetupIntent setupIntent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    setupIntent = setupIntentArgs.setupIntent;
                }
                if ((i & 2) != 0) {
                    str = setupIntentArgs.stripeAccountId;
                }
                return setupIntentArgs.copy(setupIntent, str);
            }

            /* renamed from: component1$payments_core_release, reason: from getter */
            public final SetupIntent getSetupIntent() {
                return this.setupIntent;
            }

            /* renamed from: component2$payments_core_release, reason: from getter */
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final SetupIntentArgs copy(SetupIntent setupIntent, String stripeAccountId) {
                Intrinsics.checkNotNullParameter(setupIntent, "setupIntent");
                return new SetupIntentArgs(setupIntent, stripeAccountId);
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
                return Intrinsics.areEqual(this.setupIntent, setupIntentArgs.setupIntent) && Intrinsics.areEqual(this.stripeAccountId, setupIntentArgs.stripeAccountId);
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return StripePaymentController.SETUP_REQUEST_CODE;
            }

            public int hashCode() {
                int iHashCode = this.setupIntent.hashCode() * 31;
                String str = this.stripeAccountId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SetupIntentArgs(setupIntent=" + this.setupIntent + ", stripeAccountId=" + this.stripeAccountId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.setupIntent.writeToParcel(dest, flags);
                dest.writeString(this.stripeAccountId);
            }

            public /* synthetic */ SetupIntentArgs(SetupIntent setupIntent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(setupIntent, (i & 2) != 0 ? null : str);
            }

            public final SetupIntent getSetupIntent$payments_core_release() {
                return this.setupIntent;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntentArgs(SetupIntent setupIntent, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(setupIntent, "setupIntent");
                this.setupIntent = setupIntent;
                this.stripeAccountId = str;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(this.setupIntent.getClientSecret(), 0, null, false, null, null, this.stripeAccountId, 62, null);
            }
        }

        /* compiled from: PaymentRelayStarter.kt */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u0015J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\rJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\rHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "source", "Lcom/stripe/android/model/Source;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "<init>", "(Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "getStripeAccountId$payments_core_release", "()Ljava/lang/String;", "requestCode", "", "getRequestCode", "()I", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SourceArgs extends Args {
            private final Source source;
            private final String stripeAccountId;
            public static final Parcelable.Creator<SourceArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentRelayStarter.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SourceArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SourceArgs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SourceArgs(Source.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SourceArgs[] newArray(int i) {
                    return new SourceArgs[i];
                }
            }

            public static /* synthetic */ SourceArgs copy$default(SourceArgs sourceArgs, Source source, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    source = sourceArgs.source;
                }
                if ((i & 2) != 0) {
                    str = sourceArgs.stripeAccountId;
                }
                return sourceArgs.copy(source, str);
            }

            /* renamed from: component1$payments_core_release, reason: from getter */
            public final Source getSource() {
                return this.source;
            }

            /* renamed from: component2$payments_core_release, reason: from getter */
            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public final SourceArgs copy(Source source, String stripeAccountId) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SourceArgs(source, stripeAccountId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SourceArgs)) {
                    return false;
                }
                SourceArgs sourceArgs = (SourceArgs) other;
                return Intrinsics.areEqual(this.source, sourceArgs.source) && Intrinsics.areEqual(this.stripeAccountId, sourceArgs.stripeAccountId);
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return StripePaymentController.SOURCE_REQUEST_CODE;
            }

            public int hashCode() {
                int iHashCode = this.source.hashCode() * 31;
                String str = this.stripeAccountId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SourceArgs(source=" + this.source + ", stripeAccountId=" + this.stripeAccountId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.source.writeToParcel(dest, flags);
                dest.writeString(this.stripeAccountId);
            }

            public /* synthetic */ SourceArgs(Source source, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(source, (i & 2) != 0 ? null : str);
            }

            public final Source getSource$payments_core_release() {
                return this.source;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SourceArgs(Source source, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(source, "source");
                this.source = source;
                this.stripeAccountId = str;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(null, 0, null, false, null, this.source, this.stripeAccountId, 31, null);
            }
        }

        /* compiled from: PaymentRelayStarter.kt */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000fJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0005J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", NotificationsService.EXCEPTION_KEY, "Lcom/stripe/android/core/exception/StripeException;", "requestCode", "", "<init>", "(Lcom/stripe/android/core/exception/StripeException;I)V", "getException$payments_core_release", "()Lcom/stripe/android/core/exception/StripeException;", "getRequestCode", "()I", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "component1", "component1$payments_core_release", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ErrorArgs extends Args {
            private final StripeException exception;
            private final int requestCode;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<ErrorArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentRelayStarter.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ErrorArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ErrorArgs createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return ErrorArgs.INSTANCE.create(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ErrorArgs[] newArray(int i) {
                    return new ErrorArgs[i];
                }
            }

            public static /* synthetic */ ErrorArgs copy$default(ErrorArgs errorArgs, StripeException stripeException, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    stripeException = errorArgs.exception;
                }
                if ((i2 & 2) != 0) {
                    i = errorArgs.requestCode;
                }
                return errorArgs.copy(stripeException, i);
            }

            /* renamed from: component1$payments_core_release, reason: from getter */
            public final StripeException getException() {
                return this.exception;
            }

            /* renamed from: component2, reason: from getter */
            public final int getRequestCode() {
                return this.requestCode;
            }

            public final ErrorArgs copy(StripeException exception, int requestCode) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new ErrorArgs(exception, requestCode);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorArgs)) {
                    return false;
                }
                ErrorArgs errorArgs = (ErrorArgs) other;
                return Intrinsics.areEqual(this.exception, errorArgs.exception) && this.requestCode == errorArgs.requestCode;
            }

            public int hashCode() {
                return (this.exception.hashCode() * 31) + Integer.hashCode(this.requestCode);
            }

            public String toString() {
                return "ErrorArgs(exception=" + this.exception + ", requestCode=" + this.requestCode + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                INSTANCE.write(this, dest, flags);
            }

            public final StripeException getException$payments_core_release() {
                return this.exception;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return this.requestCode;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorArgs(StripeException exception, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.exception = exception;
                this.requestCode = i;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(null, 0, this.exception, false, null, null, null, 123, null);
            }

            /* compiled from: PaymentRelayStarter.kt */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "<init>", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion implements Parceler<ErrorArgs> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlinx.parcelize.Parceler
                public ErrorArgs[] newArray(int i) {
                    return (ErrorArgs[]) Parceler.DefaultImpls.newArray(this, i);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlinx.parcelize.Parceler
                public ErrorArgs create(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Serializable serializable = parcel.readSerializable();
                    Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.stripe.android.core.exception.StripeException");
                    return new ErrorArgs((StripeException) serializable, parcel.readInt());
                }

                @Override // kotlinx.parcelize.Parceler
                public void write(ErrorArgs errorArgs, Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(errorArgs, "<this>");
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.writeSerializable(errorArgs.getException$payments_core_release());
                    parcel.writeInt(errorArgs.getRequestCode());
                }
            }
        }

        /* compiled from: PaymentRelayStarter.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/PaymentRelayStarter$Args;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public static /* synthetic */ Args create$default(Companion companion, StripeIntent stripeIntent, String str, int i, Object obj) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return companion.create(stripeIntent, str);
            }

            public final Args create(StripeIntent stripeIntent, String stripeAccountId) {
                Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
                if (stripeIntent instanceof PaymentIntent) {
                    return new PaymentIntentArgs((PaymentIntent) stripeIntent, stripeAccountId);
                }
                if (!(stripeIntent instanceof SetupIntent)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new SetupIntentArgs((SetupIntent) stripeIntent, stripeAccountId);
            }
        }
    }
}
