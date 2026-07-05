package com.stripe.android.paymentsheet.addresselement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import com.stripe.android.view.ActivityStarter;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressElementActivityContract.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "EXTRA_ARGS", "", "EXTRA_RESULT", "Args", "Result", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressElementActivityContract extends ActivityResultContract<Args, AddressLauncherResult> {
    public static final int $stable = 0;
    public static final String EXTRA_ARGS = "com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_args";
    public static final String EXTRA_RESULT = "com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_result";
    public static final AddressElementActivityContract INSTANCE = new AddressElementActivityContract();

    private AddressElementActivityContract() {
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) AddressElementActivity.class).putExtra(EXTRA_ARGS, input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public AddressLauncherResult parseResult(int resultCode, Intent intent) {
        Result result;
        AddressLauncherResult addressOptionsResult;
        return (intent == null || (result = (Result) intent.getParcelableExtra(EXTRA_RESULT)) == null || (addressOptionsResult = result.getAddressOptionsResult()) == null) ? AddressLauncherResult.Canceled.INSTANCE : addressOptionsResult;
    }

    /* compiled from: AddressElementActivityContract.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÀ\u0001¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "publishableKey", "", "config", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;)V", "getPublishableKey$paymentsheet_release", "()Ljava/lang/String;", "getConfig$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "component1", "component1$paymentsheet_release", "component2", "component2$paymentsheet_release", "copy", "copy$paymentsheet_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements ActivityStarter.Args {
        private final AddressLauncher.Configuration config;
        private final String publishableKey;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: AddressElementActivityContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : AddressLauncher.Configuration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$paymentsheet_release$default(Args args, String str, AddressLauncher.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.publishableKey;
            }
            if ((i & 2) != 0) {
                configuration = args.config;
            }
            return args.copy$paymentsheet_release(str, configuration);
        }

        /* renamed from: component1$paymentsheet_release, reason: from getter */
        public final String getPublishableKey() {
            return this.publishableKey;
        }

        /* renamed from: component2$paymentsheet_release, reason: from getter */
        public final AddressLauncher.Configuration getConfig() {
            return this.config;
        }

        public final Args copy$paymentsheet_release(String publishableKey, AddressLauncher.Configuration config) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            return new Args(publishableKey, config);
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
            return Intrinsics.areEqual(this.publishableKey, args.publishableKey) && Intrinsics.areEqual(this.config, args.config);
        }

        public int hashCode() {
            int iHashCode = this.publishableKey.hashCode() * 31;
            AddressLauncher.Configuration configuration = this.config;
            return iHashCode + (configuration == null ? 0 : configuration.hashCode());
        }

        public String toString() {
            return "Args(publishableKey=" + this.publishableKey + ", config=" + this.config + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.publishableKey);
            AddressLauncher.Configuration configuration = this.config;
            if (configuration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                configuration.writeToParcel(dest, flags);
            }
        }

        public Args(String publishableKey, AddressLauncher.Configuration configuration) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            this.publishableKey = publishableKey;
            this.config = configuration;
        }

        public final String getPublishableKey$paymentsheet_release() {
            return this.publishableKey;
        }

        public final AddressLauncher.Configuration getConfig$paymentsheet_release() {
            return this.config;
        }

        /* compiled from: AddressElementActivityContract.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent$paymentsheet_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(AddressElementActivityContract.EXTRA_ARGS);
            }
        }
    }

    /* compiled from: AddressElementActivityContract.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "addressOptionsResult", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", "getAddressOptionsResult", "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "toBundle", "Landroid/os/Bundle;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result implements ActivityStarter.Result {
        private final AddressLauncherResult addressOptionsResult;
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: AddressElementActivityContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result((AddressLauncherResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public static /* synthetic */ Result copy$default(Result result, AddressLauncherResult addressLauncherResult, int i, Object obj) {
            if ((i & 1) != 0) {
                addressLauncherResult = result.addressOptionsResult;
            }
            return result.copy(addressLauncherResult);
        }

        /* renamed from: component1, reason: from getter */
        public final AddressLauncherResult getAddressOptionsResult() {
            return this.addressOptionsResult;
        }

        public final Result copy(AddressLauncherResult addressOptionsResult) {
            Intrinsics.checkNotNullParameter(addressOptionsResult, "addressOptionsResult");
            return new Result(addressOptionsResult);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && Intrinsics.areEqual(this.addressOptionsResult, ((Result) other).addressOptionsResult);
        }

        public int hashCode() {
            return this.addressOptionsResult.hashCode();
        }

        public String toString() {
            return "Result(addressOptionsResult=" + this.addressOptionsResult + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.addressOptionsResult, flags);
        }

        public Result(AddressLauncherResult addressOptionsResult) {
            Intrinsics.checkNotNullParameter(addressOptionsResult, "addressOptionsResult");
            this.addressOptionsResult = addressOptionsResult;
        }

        public final AddressLauncherResult getAddressOptionsResult() {
            return this.addressOptionsResult;
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return BundleKt.bundleOf(TuplesKt.to(AddressElementActivityContract.EXTRA_RESULT, this));
        }
    }
}
