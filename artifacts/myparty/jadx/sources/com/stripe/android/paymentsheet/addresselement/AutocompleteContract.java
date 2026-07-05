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
import com.stripe.android.view.ActivityStarter;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteContract.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "EXTRA_ARGS", "", "EXTRA_RESULT", "Args", "Result", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteContract extends ActivityResultContract<Args, Result> {
    public static final int $stable = 0;
    public static final String EXTRA_ARGS = "com.stripe.android.paymentsheet.addresselement.AutocompleteContract.extra_args";
    public static final String EXTRA_RESULT = "com.stripe.android.paymentsheet.addresselement.AutocompleteContract.extra_result";
    public static final AutocompleteContract INSTANCE = new AutocompleteContract();

    private AutocompleteContract() {
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) AutocompleteActivity.class).putExtra(EXTRA_ARGS, input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public Result parseResult(int resultCode, Intent intent) {
        Result result;
        if (intent == null || (result = (Result) intent.getParcelableExtra(EXTRA_RESULT)) == null) {
            throw new IllegalStateException("Unknown MPE address autocomplete result!");
        }
        return result;
    }

    /* compiled from: AutocompleteContract.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0011J\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0017J6\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÀ\u0001¢\u0006\u0002\b\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006("}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "id", "", "country", "googlePlacesApiKey", "appearanceContext", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V", "getId$paymentsheet_release", "()Ljava/lang/String;", "getCountry$paymentsheet_release", "getGooglePlacesApiKey$paymentsheet_release", "getAppearanceContext$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;", "component1", "component1$paymentsheet_release", "component2", "component2$paymentsheet_release", "component3", "component3$paymentsheet_release", "component4", "component4$paymentsheet_release", "copy", "copy$paymentsheet_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements ActivityStarter.Args {
        public static final int $stable = 0;
        private final AutocompleteAppearanceContext appearanceContext;
        private final String country;
        private final String googlePlacesApiKey;
        private final String id;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        /* compiled from: AutocompleteContract.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readString(), (AutocompleteAppearanceContext) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$paymentsheet_release$default(Args args, String str, String str2, String str3, AutocompleteAppearanceContext autocompleteAppearanceContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.id;
            }
            if ((i & 2) != 0) {
                str2 = args.country;
            }
            if ((i & 4) != 0) {
                str3 = args.googlePlacesApiKey;
            }
            if ((i & 8) != 0) {
                autocompleteAppearanceContext = args.appearanceContext;
            }
            return args.copy$paymentsheet_release(str, str2, str3, autocompleteAppearanceContext);
        }

        /* renamed from: component1$paymentsheet_release, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2$paymentsheet_release, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component3$paymentsheet_release, reason: from getter */
        public final String getGooglePlacesApiKey() {
            return this.googlePlacesApiKey;
        }

        /* renamed from: component4$paymentsheet_release, reason: from getter */
        public final AutocompleteAppearanceContext getAppearanceContext() {
            return this.appearanceContext;
        }

        public final Args copy$paymentsheet_release(String id, String country, String googlePlacesApiKey, AutocompleteAppearanceContext appearanceContext) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(googlePlacesApiKey, "googlePlacesApiKey");
            Intrinsics.checkNotNullParameter(appearanceContext, "appearanceContext");
            return new Args(id, country, googlePlacesApiKey, appearanceContext);
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
            return Intrinsics.areEqual(this.id, args.id) && Intrinsics.areEqual(this.country, args.country) && Intrinsics.areEqual(this.googlePlacesApiKey, args.googlePlacesApiKey) && Intrinsics.areEqual(this.appearanceContext, args.appearanceContext);
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.country.hashCode()) * 31) + this.googlePlacesApiKey.hashCode()) * 31) + this.appearanceContext.hashCode();
        }

        public String toString() {
            return "Args(id=" + this.id + ", country=" + this.country + ", googlePlacesApiKey=" + this.googlePlacesApiKey + ", appearanceContext=" + this.appearanceContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.country);
            dest.writeString(this.googlePlacesApiKey);
            dest.writeParcelable(this.appearanceContext, flags);
        }

        public Args(String id, String country, String googlePlacesApiKey, AutocompleteAppearanceContext appearanceContext) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(googlePlacesApiKey, "googlePlacesApiKey");
            Intrinsics.checkNotNullParameter(appearanceContext, "appearanceContext");
            this.id = id;
            this.country = country;
            this.googlePlacesApiKey = googlePlacesApiKey;
            this.appearanceContext = appearanceContext;
        }

        public final String getId$paymentsheet_release() {
            return this.id;
        }

        public final String getCountry$paymentsheet_release() {
            return this.country;
        }

        public final String getGooglePlacesApiKey$paymentsheet_release() {
            return this.googlePlacesApiKey;
        }

        public final AutocompleteAppearanceContext getAppearanceContext$paymentsheet_release() {
            return this.appearanceContext;
        }

        /* compiled from: AutocompleteContract.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args$Companion;", "", "<init>", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Args fromIntent$paymentsheet_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(AutocompleteContract.EXTRA_ARGS);
            }
        }
    }

    /* compiled from: AutocompleteContract.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "toBundle", "Landroid/os/Bundle;", "EnterManually", "Address", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$EnterManually;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Result implements ActivityStarter.Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract AddressDetails getAddressDetails();

        public abstract String getId();

        private Result() {
        }

        /* compiled from: AutocompleteContract.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$EnterManually;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;", "id", "", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getId", "()Ljava/lang/String;", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class EnterManually extends Result {
            public static final int $stable = 0;
            public static final Parcelable.Creator<EnterManually> CREATOR = new Creator();
            private final AddressDetails addressDetails;
            private final String id;

            /* compiled from: AutocompleteContract.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<EnterManually> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EnterManually createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EnterManually(parcel.readString(), parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EnterManually[] newArray(int i) {
                    return new EnterManually[i];
                }
            }

            public static /* synthetic */ EnterManually copy$default(EnterManually enterManually, String str, AddressDetails addressDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = enterManually.id;
                }
                if ((i & 2) != 0) {
                    addressDetails = enterManually.addressDetails;
                }
                return enterManually.copy(str, addressDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final AddressDetails getAddressDetails() {
                return this.addressDetails;
            }

            public final EnterManually copy(String id, AddressDetails addressDetails) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new EnterManually(id, addressDetails);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EnterManually)) {
                    return false;
                }
                EnterManually enterManually = (EnterManually) other;
                return Intrinsics.areEqual(this.id, enterManually.id) && Intrinsics.areEqual(this.addressDetails, enterManually.addressDetails);
            }

            public int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                AddressDetails addressDetails = this.addressDetails;
                return iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode());
            }

            public String toString() {
                return "EnterManually(id=" + this.id + ", addressDetails=" + this.addressDetails + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.id);
                AddressDetails addressDetails = this.addressDetails;
                if (addressDetails == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    addressDetails.writeToParcel(dest, flags);
                }
            }

            @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteContract.Result
            public String getId() {
                return this.id;
            }

            @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteContract.Result
            public AddressDetails getAddressDetails() {
                return this.addressDetails;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EnterManually(String id, AddressDetails addressDetails) {
                super(null);
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
                this.addressDetails = addressDetails;
            }
        }

        /* compiled from: AutocompleteContract.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;", "id", "", "addressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "getId", "()Ljava/lang/String;", "getAddressDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Address extends Result {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Address> CREATOR = new Creator();
            private final AddressDetails addressDetails;
            private final String id;

            /* compiled from: AutocompleteContract.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Address> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Address createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Address(parcel.readString(), parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Address[] newArray(int i) {
                    return new Address[i];
                }
            }

            public static /* synthetic */ Address copy$default(Address address, String str, AddressDetails addressDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = address.id;
                }
                if ((i & 2) != 0) {
                    addressDetails = address.addressDetails;
                }
                return address.copy(str, addressDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final AddressDetails getAddressDetails() {
                return this.addressDetails;
            }

            public final Address copy(String id, AddressDetails addressDetails) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new Address(id, addressDetails);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Address)) {
                    return false;
                }
                Address address = (Address) other;
                return Intrinsics.areEqual(this.id, address.id) && Intrinsics.areEqual(this.addressDetails, address.addressDetails);
            }

            public int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                AddressDetails addressDetails = this.addressDetails;
                return iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode());
            }

            public String toString() {
                return "Address(id=" + this.id + ", addressDetails=" + this.addressDetails + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.id);
                AddressDetails addressDetails = this.addressDetails;
                if (addressDetails == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    addressDetails.writeToParcel(dest, flags);
                }
            }

            @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteContract.Result
            public String getId() {
                return this.id;
            }

            @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteContract.Result
            public AddressDetails getAddressDetails() {
                return this.addressDetails;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Address(String id, AddressDetails addressDetails) {
                super(null);
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
                this.addressDetails = addressDetails;
            }
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return BundleKt.bundleOf(TuplesKt.to(AutocompleteContract.EXTRA_RESULT, this));
        }
    }
}
