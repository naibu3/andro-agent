package com.stripe.android.paymentsheet.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentElementLoader.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fJ.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;", "", "load", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "metadata", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;", "load-BWLJW6A", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Metadata", "InitializationMode", "State", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PaymentElementLoader {
    /* renamed from: load-BWLJW6A */
    Object mo8425loadBWLJW6A(InitializationMode initializationMode, CommonConfiguration commonConfiguration, Metadata metadata, Continuation<? super Result<State>> continuation);

    /* compiled from: PaymentElementLoader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$Metadata;", "", "isReloadingAfterProcessDeath", "", "initializedViaCompose", "<init>", "(ZZ)V", "()Z", "getInitializedViaCompose", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Metadata {
        public static final int $stable = 0;
        private final boolean initializedViaCompose;
        private final boolean isReloadingAfterProcessDeath;

        public static /* synthetic */ Metadata copy$default(Metadata metadata, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = metadata.isReloadingAfterProcessDeath;
            }
            if ((i & 2) != 0) {
                z2 = metadata.initializedViaCompose;
            }
            return metadata.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsReloadingAfterProcessDeath() {
            return this.isReloadingAfterProcessDeath;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInitializedViaCompose() {
            return this.initializedViaCompose;
        }

        public final Metadata copy(boolean isReloadingAfterProcessDeath, boolean initializedViaCompose) {
            return new Metadata(isReloadingAfterProcessDeath, initializedViaCompose);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return this.isReloadingAfterProcessDeath == metadata.isReloadingAfterProcessDeath && this.initializedViaCompose == metadata.initializedViaCompose;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isReloadingAfterProcessDeath) * 31) + Boolean.hashCode(this.initializedViaCompose);
        }

        public String toString() {
            return "Metadata(isReloadingAfterProcessDeath=" + this.isReloadingAfterProcessDeath + ", initializedViaCompose=" + this.initializedViaCompose + ")";
        }

        public Metadata(boolean z, boolean z2) {
            this.isReloadingAfterProcessDeath = z;
            this.initializedViaCompose = z2;
        }

        public /* synthetic */ Metadata(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, z2);
        }

        public final boolean isReloadingAfterProcessDeath() {
            return this.isReloadingAfterProcessDeath;
        }

        public final boolean getInitializedViaCompose() {
            return this.initializedViaCompose;
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "Landroid/os/Parcelable;", "<init>", "()V", "validate", "", "PaymentIntent", "SetupIntent", "DeferredIntent", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class InitializationMode implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ InitializationMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract void validate();

        private InitializationMode() {
        }

        /* compiled from: PaymentElementLoader.kt */
        @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "clientSecret", "", "<init>", "(Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "validate", "", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PaymentIntent extends InitializationMode {
            private final String clientSecret;
            public static final Parcelable.Creator<PaymentIntent> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentElementLoader.kt */
            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PaymentIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PaymentIntent(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntent[] newArray(int i) {
                    return new PaymentIntent[i];
                }
            }

            public static /* synthetic */ PaymentIntent copy$default(PaymentIntent paymentIntent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = paymentIntent.clientSecret;
                }
                return paymentIntent.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            public final PaymentIntent copy(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new PaymentIntent(clientSecret);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentIntent) && Intrinsics.areEqual(this.clientSecret, ((PaymentIntent) other).clientSecret);
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                return "PaymentIntent(clientSecret=" + this.clientSecret + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.clientSecret);
            }

            public final String getClientSecret() {
                return this.clientSecret;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntent(String clientSecret) {
                super(null);
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.state.PaymentElementLoader.InitializationMode
            public void validate() {
                new PaymentIntentClientSecret(this.clientSecret).validate();
            }
        }

        /* compiled from: PaymentElementLoader.kt */
        @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "clientSecret", "", "<init>", "(Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "validate", "", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SetupIntent extends InitializationMode {
            private final String clientSecret;
            public static final Parcelable.Creator<SetupIntent> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentElementLoader.kt */
            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SetupIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SetupIntent(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntent[] newArray(int i) {
                    return new SetupIntent[i];
                }
            }

            public static /* synthetic */ SetupIntent copy$default(SetupIntent setupIntent, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = setupIntent.clientSecret;
                }
                return setupIntent.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            public final SetupIntent copy(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new SetupIntent(clientSecret);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupIntent) && Intrinsics.areEqual(this.clientSecret, ((SetupIntent) other).clientSecret);
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                return "SetupIntent(clientSecret=" + this.clientSecret + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.clientSecret);
            }

            public final String getClientSecret() {
                return this.clientSecret;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntent(String clientSecret) {
                super(null);
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.state.PaymentElementLoader.InitializationMode
            public void validate() {
                new SetupIntentClientSecret(this.clientSecret).validate();
            }
        }

        /* compiled from: PaymentElementLoader.kt */
        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)V", "getIntentConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "validate", "", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DeferredIntent extends InitializationMode {
            private final PaymentSheet.IntentConfiguration intentConfiguration;
            public static final Parcelable.Creator<DeferredIntent> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentElementLoader.kt */
            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DeferredIntent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeferredIntent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DeferredIntent(PaymentSheet.IntentConfiguration.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DeferredIntent[] newArray(int i) {
                    return new DeferredIntent[i];
                }
            }

            public static /* synthetic */ DeferredIntent copy$default(DeferredIntent deferredIntent, PaymentSheet.IntentConfiguration intentConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    intentConfiguration = deferredIntent.intentConfiguration;
                }
                return deferredIntent.copy(intentConfiguration);
            }

            /* renamed from: component1, reason: from getter */
            public final PaymentSheet.IntentConfiguration getIntentConfiguration() {
                return this.intentConfiguration;
            }

            public final DeferredIntent copy(PaymentSheet.IntentConfiguration intentConfiguration) {
                Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
                return new DeferredIntent(intentConfiguration);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeferredIntent) && Intrinsics.areEqual(this.intentConfiguration, ((DeferredIntent) other).intentConfiguration);
            }

            public int hashCode() {
                return this.intentConfiguration.hashCode();
            }

            public String toString() {
                return "DeferredIntent(intentConfiguration=" + this.intentConfiguration + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.intentConfiguration.writeToParcel(dest, flags);
            }

            public final PaymentSheet.IntentConfiguration getIntentConfiguration() {
                return this.intentConfiguration;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeferredIntent(PaymentSheet.IntentConfiguration intentConfiguration) {
                super(null);
                Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
                this.intentConfiguration = intentConfiguration;
            }

            @Override // com.stripe.android.paymentsheet.state.PaymentElementLoader.InitializationMode
            public void validate() {
                PaymentSheet.IntentConfiguration.Mode mode = this.intentConfiguration.getMode();
                PaymentSheet.IntentConfiguration.Mode.Payment payment = mode instanceof PaymentSheet.IntentConfiguration.Mode.Payment ? (PaymentSheet.IntentConfiguration.Mode.Payment) mode : null;
                if (payment != null && payment.getAmount() <= 0) {
                    throw new IllegalArgumentException("Payment IntentConfiguration requires a positive amount.");
                }
            }
        }
    }

    /* compiled from: PaymentElementLoader.kt */
    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "Landroid/os/Parcelable;", "config", "Lcom/stripe/android/common/model/CommonConfiguration;", "customer", "Lcom/stripe/android/paymentsheet/state/CustomerState;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "validationError", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "<init>", "(Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V", "getConfig", "()Lcom/stripe/android/common/model/CommonConfiguration;", "getCustomer", "()Lcom/stripe/android/paymentsheet/state/CustomerState;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getValidationError", "()Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "getPaymentMethodMetadata", "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        private final CommonConfiguration config;
        private final CustomerState customer;
        private final PaymentMethodMetadata paymentMethodMetadata;
        private final PaymentSelection paymentSelection;
        private final PaymentSheetLoadingException validationError;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentElementLoader.kt */
        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State(CommonConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CustomerState.CREATOR.createFromParcel(parcel), (PaymentSelection) parcel.readParcelable(State.class.getClassLoader()), (PaymentSheetLoadingException) parcel.readSerializable(), PaymentMethodMetadata.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public static /* synthetic */ State copy$default(State state, CommonConfiguration commonConfiguration, CustomerState customerState, PaymentSelection paymentSelection, PaymentSheetLoadingException paymentSheetLoadingException, PaymentMethodMetadata paymentMethodMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                commonConfiguration = state.config;
            }
            if ((i & 2) != 0) {
                customerState = state.customer;
            }
            if ((i & 4) != 0) {
                paymentSelection = state.paymentSelection;
            }
            if ((i & 8) != 0) {
                paymentSheetLoadingException = state.validationError;
            }
            if ((i & 16) != 0) {
                paymentMethodMetadata = state.paymentMethodMetadata;
            }
            PaymentMethodMetadata paymentMethodMetadata2 = paymentMethodMetadata;
            PaymentSelection paymentSelection2 = paymentSelection;
            return state.copy(commonConfiguration, customerState, paymentSelection2, paymentSheetLoadingException, paymentMethodMetadata2);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonConfiguration getConfig() {
            return this.config;
        }

        /* renamed from: component2, reason: from getter */
        public final CustomerState getCustomer() {
            return this.customer;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentSheetLoadingException getValidationError() {
            return this.validationError;
        }

        /* renamed from: component5, reason: from getter */
        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        public final State copy(CommonConfiguration config, CustomerState customer, PaymentSelection paymentSelection, PaymentSheetLoadingException validationError, PaymentMethodMetadata paymentMethodMetadata) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            return new State(config, customer, paymentSelection, validationError, paymentMethodMetadata);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.config, state.config) && Intrinsics.areEqual(this.customer, state.customer) && Intrinsics.areEqual(this.paymentSelection, state.paymentSelection) && Intrinsics.areEqual(this.validationError, state.validationError) && Intrinsics.areEqual(this.paymentMethodMetadata, state.paymentMethodMetadata);
        }

        public int hashCode() {
            int iHashCode = this.config.hashCode() * 31;
            CustomerState customerState = this.customer;
            int iHashCode2 = (iHashCode + (customerState == null ? 0 : customerState.hashCode())) * 31;
            PaymentSelection paymentSelection = this.paymentSelection;
            int iHashCode3 = (iHashCode2 + (paymentSelection == null ? 0 : paymentSelection.hashCode())) * 31;
            PaymentSheetLoadingException paymentSheetLoadingException = this.validationError;
            return ((iHashCode3 + (paymentSheetLoadingException != null ? paymentSheetLoadingException.hashCode() : 0)) * 31) + this.paymentMethodMetadata.hashCode();
        }

        public String toString() {
            return "State(config=" + this.config + ", customer=" + this.customer + ", paymentSelection=" + this.paymentSelection + ", validationError=" + this.validationError + ", paymentMethodMetadata=" + this.paymentMethodMetadata + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.config.writeToParcel(dest, flags);
            CustomerState customerState = this.customer;
            if (customerState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customerState.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.paymentSelection, flags);
            dest.writeSerializable(this.validationError);
            this.paymentMethodMetadata.writeToParcel(dest, flags);
        }

        public State(CommonConfiguration config, CustomerState customerState, PaymentSelection paymentSelection, PaymentSheetLoadingException paymentSheetLoadingException, PaymentMethodMetadata paymentMethodMetadata) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            this.config = config;
            this.customer = customerState;
            this.paymentSelection = paymentSelection;
            this.validationError = paymentSheetLoadingException;
            this.paymentMethodMetadata = paymentMethodMetadata;
        }

        public final CommonConfiguration getConfig() {
            return this.config;
        }

        public final CustomerState getCustomer() {
            return this.customer;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public final PaymentSheetLoadingException getValidationError() {
            return this.validationError;
        }

        public final PaymentMethodMetadata getPaymentMethodMetadata() {
            return this.paymentMethodMetadata;
        }

        public final StripeIntent getStripeIntent() {
            return this.paymentMethodMetadata.getStripeIntent();
        }
    }
}
