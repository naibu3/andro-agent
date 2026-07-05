package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.uicore.utils.AnimationConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressLauncher.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;", "", "application", "Landroid/app/Application;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "<init>", "(Landroid/app/Application;Landroidx/activity/result/ActivityResultLauncher;)V", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;)V", "present", "", "publishableKey", "", "configuration", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "Configuration", "AdditionalFieldsConfiguration", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressLauncher {
    public static final int $stable = 8;
    private final ActivityResultLauncher<AddressElementActivityContract.Args> activityResultLauncher;
    private final Application application;

    public final void present(String publishableKey) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        present$default(this, publishableKey, null, 2, null);
    }

    public AddressLauncher(Application application, ActivityResultLauncher<AddressElementActivityContract.Args> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        this.application = application;
        this.activityResultLauncher = activityResultLauncher;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AddressLauncher(ComponentActivity activity, final AddressLauncherResultCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Application application = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        this(application, (ActivityResultLauncher<AddressElementActivityContract.Args>) activity.registerForActivityResult(AddressElementActivityContract.INSTANCE, new ActivityResultCallback() { // from class: com.stripe.android.paymentsheet.addresselement.AddressLauncher$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AddressLauncher._init_$lambda$0(callback, (AddressLauncherResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(AddressLauncherResultCallback addressLauncherResultCallback, AddressLauncherResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        addressLauncherResultCallback.onAddressLauncherResult(it);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AddressLauncher(Fragment fragment, final AddressLauncherResultCallback callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Application application = fragment.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(AddressElementActivityContract.INSTANCE, new ActivityResultCallback() { // from class: com.stripe.android.paymentsheet.addresselement.AddressLauncher$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AddressLauncher._init_$lambda$1(callback, (AddressLauncherResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(application, (ActivityResultLauncher<AddressElementActivityContract.Args>) activityResultLauncherRegisterForActivityResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AddressLauncherResultCallback addressLauncherResultCallback, AddressLauncherResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        addressLauncherResultCallback.onAddressLauncherResult(it);
    }

    public static /* synthetic */ void present$default(AddressLauncher addressLauncher, String str, Configuration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = new Configuration(null, null, null, null, null, null, null, null, 255, null);
        }
        addressLauncher.present(str, configuration);
    }

    public final void present(String publishableKey, Configuration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        AddressElementActivityContract.Args args = new AddressElementActivityContract.Args(publishableKey, configuration);
        ActivityOptionsCompat activityOptionsCompatMakeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(this.application.getApplicationContext(), AnimationConstants.INSTANCE.getFADE_IN(), AnimationConstants.INSTANCE.getFADE_OUT());
        Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeCustomAnimation, "makeCustomAnimation(...)");
        this.activityResultLauncher.launch(args, activityOptionsCompatMakeCustomAnimation);
    }

    /* compiled from: AddressLauncher.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<By\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012Bo\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0011\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0010HÀ\u0003¢\u0006\u0002\b,J\u0080\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÀ\u0001¢\u0006\u0002\b.J\u0006\u0010/\u001a\u000200J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000200HÖ\u0001J\t\u00106\u001a\u00020\bHÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000200R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006="}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "Landroid/os/Parcelable;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "address", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowedCountries", "", "", "buttonTitle", "additionalFields", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", "title", "googlePlacesApiKey", "autocompleteCountries", "billingAddress", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)V", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getAddress", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getAllowedCountries", "()Ljava/util/Set;", "getButtonTitle", "()Ljava/lang/String;", "getAdditionalFields", "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", "getTitle", "getGooglePlacesApiKey", "getAutocompleteCountries", "getBillingAddress$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component9$paymentsheet_release", "copy", "copy$paymentsheet_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {
        private final AdditionalFieldsConfiguration additionalFields;
        private final AddressDetails address;
        private final Set<String> allowedCountries;
        private final PaymentSheet.Appearance appearance;
        private final Set<String> autocompleteCountries;
        private final PaymentSheet.BillingDetails billingAddress;
        private final String buttonTitle;
        private final String googlePlacesApiKey;
        private final String title;
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: AddressLauncher.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Configuration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PaymentSheet.Appearance appearanceCreateFromParcel = PaymentSheet.Appearance.CREATOR.createFromParcel(parcel);
                AddressDetails addressDetailsCreateFromParcel = parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(parcel.readString());
                }
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                String string = parcel.readString();
                AdditionalFieldsConfiguration additionalFieldsConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : AdditionalFieldsConfiguration.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet3.add(parcel.readString());
                }
                return new Configuration(appearanceCreateFromParcel, addressDetailsCreateFromParcel, linkedHashSet2, string, additionalFieldsConfigurationCreateFromParcel, string2, string3, linkedHashSet3, parcel.readInt() != 0 ? PaymentSheet.BillingDetails.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(PaymentSheet.Appearance appearance) {
            this(appearance, null, null, null, null, null, null, null, 254, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails) {
            this(appearance, addressDetails, null, null, null, null, null, null, 252, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries) {
            this(appearance, addressDetails, allowedCountries, null, null, null, null, null, 248, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str) {
            this(appearance, addressDetails, allowedCountries, str, null, null, null, null, 240, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration) {
            this(appearance, addressDetails, allowedCountries, str, additionalFieldsConfiguration, null, null, null, 224, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2) {
            this(appearance, addressDetails, allowedCountries, str, additionalFieldsConfiguration, str2, null, null, 192, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3) {
            this(appearance, addressDetails, allowedCountries, str, additionalFieldsConfiguration, str2, str3, null, 128, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        }

        public static /* synthetic */ Configuration copy$paymentsheet_release$default(Configuration configuration, PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set set, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set set2, PaymentSheet.BillingDetails billingDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                appearance = configuration.appearance;
            }
            if ((i & 2) != 0) {
                addressDetails = configuration.address;
            }
            if ((i & 4) != 0) {
                set = configuration.allowedCountries;
            }
            if ((i & 8) != 0) {
                str = configuration.buttonTitle;
            }
            if ((i & 16) != 0) {
                additionalFieldsConfiguration = configuration.additionalFields;
            }
            if ((i & 32) != 0) {
                str2 = configuration.title;
            }
            if ((i & 64) != 0) {
                str3 = configuration.googlePlacesApiKey;
            }
            if ((i & 128) != 0) {
                set2 = configuration.autocompleteCountries;
            }
            if ((i & 256) != 0) {
                billingDetails = configuration.billingAddress;
            }
            Set set3 = set2;
            PaymentSheet.BillingDetails billingDetails2 = billingDetails;
            String str4 = str2;
            String str5 = str3;
            AdditionalFieldsConfiguration additionalFieldsConfiguration2 = additionalFieldsConfiguration;
            Set set4 = set;
            return configuration.copy$paymentsheet_release(appearance, addressDetails, set4, str, additionalFieldsConfiguration2, str4, str5, set3, billingDetails2);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        /* renamed from: component2, reason: from getter */
        public final AddressDetails getAddress() {
            return this.address;
        }

        public final Set<String> component3() {
            return this.allowedCountries;
        }

        /* renamed from: component4, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* renamed from: component5, reason: from getter */
        public final AdditionalFieldsConfiguration getAdditionalFields() {
            return this.additionalFields;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component7, reason: from getter */
        public final String getGooglePlacesApiKey() {
            return this.googlePlacesApiKey;
        }

        public final Set<String> component8() {
            return this.autocompleteCountries;
        }

        /* renamed from: component9$paymentsheet_release, reason: from getter */
        public final PaymentSheet.BillingDetails getBillingAddress() {
            return this.billingAddress;
        }

        public final Configuration copy$paymentsheet_release(PaymentSheet.Appearance appearance, AddressDetails address, Set<String> allowedCountries, String buttonTitle, AdditionalFieldsConfiguration additionalFields, String title, String googlePlacesApiKey, Set<String> autocompleteCountries, PaymentSheet.BillingDetails billingAddress) {
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
            Intrinsics.checkNotNullParameter(autocompleteCountries, "autocompleteCountries");
            return new Configuration(appearance, address, allowedCountries, buttonTitle, additionalFields, title, googlePlacesApiKey, autocompleteCountries, billingAddress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return Intrinsics.areEqual(this.appearance, configuration.appearance) && Intrinsics.areEqual(this.address, configuration.address) && Intrinsics.areEqual(this.allowedCountries, configuration.allowedCountries) && Intrinsics.areEqual(this.buttonTitle, configuration.buttonTitle) && Intrinsics.areEqual(this.additionalFields, configuration.additionalFields) && Intrinsics.areEqual(this.title, configuration.title) && Intrinsics.areEqual(this.googlePlacesApiKey, configuration.googlePlacesApiKey) && Intrinsics.areEqual(this.autocompleteCountries, configuration.autocompleteCountries) && Intrinsics.areEqual(this.billingAddress, configuration.billingAddress);
        }

        public int hashCode() {
            int iHashCode = this.appearance.hashCode() * 31;
            AddressDetails addressDetails = this.address;
            int iHashCode2 = (((iHashCode + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + this.allowedCountries.hashCode()) * 31;
            String str = this.buttonTitle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            AdditionalFieldsConfiguration additionalFieldsConfiguration = this.additionalFields;
            int iHashCode4 = (iHashCode3 + (additionalFieldsConfiguration == null ? 0 : additionalFieldsConfiguration.hashCode())) * 31;
            String str2 = this.title;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.googlePlacesApiKey;
            int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.autocompleteCountries.hashCode()) * 31;
            PaymentSheet.BillingDetails billingDetails = this.billingAddress;
            return iHashCode6 + (billingDetails != null ? billingDetails.hashCode() : 0);
        }

        public String toString() {
            return "Configuration(appearance=" + this.appearance + ", address=" + this.address + ", allowedCountries=" + this.allowedCountries + ", buttonTitle=" + this.buttonTitle + ", additionalFields=" + this.additionalFields + ", title=" + this.title + ", googlePlacesApiKey=" + this.googlePlacesApiKey + ", autocompleteCountries=" + this.autocompleteCountries + ", billingAddress=" + this.billingAddress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.appearance.writeToParcel(dest, flags);
            AddressDetails addressDetails = this.address;
            if (addressDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                addressDetails.writeToParcel(dest, flags);
            }
            Set<String> set = this.allowedCountries;
            dest.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next());
            }
            dest.writeString(this.buttonTitle);
            AdditionalFieldsConfiguration additionalFieldsConfiguration = this.additionalFields;
            if (additionalFieldsConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                additionalFieldsConfiguration.writeToParcel(dest, flags);
            }
            dest.writeString(this.title);
            dest.writeString(this.googlePlacesApiKey);
            Set<String> set2 = this.autocompleteCountries;
            dest.writeInt(set2.size());
            Iterator<String> it2 = set2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next());
            }
            PaymentSheet.BillingDetails billingDetails = this.billingAddress;
            if (billingDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                billingDetails.writeToParcel(dest, flags);
            }
        }

        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set<String> autocompleteCountries, PaymentSheet.BillingDetails billingDetails) {
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
            Intrinsics.checkNotNullParameter(autocompleteCountries, "autocompleteCountries");
            this.appearance = appearance;
            this.address = addressDetails;
            this.allowedCountries = allowedCountries;
            this.buttonTitle = str;
            this.additionalFields = additionalFieldsConfiguration;
            this.title = str2;
            this.googlePlacesApiKey = str3;
            this.autocompleteCountries = autocompleteCountries;
            this.billingAddress = billingDetails;
        }

        public /* synthetic */ Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set set, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set set2, PaymentSheet.BillingDetails billingDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new PaymentSheet.Appearance() : appearance, (i & 2) != 0 ? null : addressDetails, (i & 4) != 0 ? SetsKt.emptySet() : set, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : additionalFieldsConfiguration, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? AddressElementDefaultsKt.getAUTOCOMPLETE_DEFAULT_COUNTRIES() : set2, billingDetails);
        }

        public final PaymentSheet.Appearance getAppearance() {
            return this.appearance;
        }

        public final AddressDetails getAddress() {
            return this.address;
        }

        public final Set<String> getAllowedCountries() {
            return this.allowedCountries;
        }

        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        public final AdditionalFieldsConfiguration getAdditionalFields() {
            return this.additionalFields;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getGooglePlacesApiKey() {
            return this.googlePlacesApiKey;
        }

        public final Set<String> getAutocompleteCountries() {
            return this.autocompleteCountries;
        }

        public final PaymentSheet.BillingDetails getBillingAddress$paymentsheet_release() {
            return this.billingAddress;
        }

        public /* synthetic */ Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set set, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new PaymentSheet.Appearance() : appearance, (i & 2) != 0 ? null : addressDetails, (i & 4) != 0 ? SetsKt.emptySet() : set, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : additionalFieldsConfiguration, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? AddressElementDefaultsKt.getAUTOCOMPLETE_DEFAULT_COUNTRIES() : set2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(PaymentSheet.Appearance appearance, AddressDetails addressDetails, Set<String> allowedCountries, String str, AdditionalFieldsConfiguration additionalFieldsConfiguration, String str2, String str3, Set<String> autocompleteCountries) {
            this(appearance, addressDetails, allowedCountries, str, additionalFieldsConfiguration, str2, str3, autocompleteCountries, null);
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
            Intrinsics.checkNotNullParameter(autocompleteCountries, "autocompleteCountries");
        }

        /* compiled from: AddressLauncher.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0012\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration$Builder;", "", "<init>", "()V", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "address", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowedCountries", "", "", "buttonTitle", "additionalFields", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", "title", "googlePlacesApiKey", "autocompleteCountries", "billingAddress", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private AdditionalFieldsConfiguration additionalFields;
            private AddressDetails address;
            private PaymentSheet.BillingDetails billingAddress;
            private String buttonTitle;
            private String googlePlacesApiKey;
            private String title;
            private PaymentSheet.Appearance appearance = new PaymentSheet.Appearance();
            private Set<String> allowedCountries = SetsKt.emptySet();
            private Set<String> autocompleteCountries = AddressElementDefaultsKt.getAUTOCOMPLETE_DEFAULT_COUNTRIES();

            public final Builder appearance(PaymentSheet.Appearance appearance) {
                Intrinsics.checkNotNullParameter(appearance, "appearance");
                this.appearance = appearance;
                return this;
            }

            public final Builder address(AddressDetails address) {
                this.address = address;
                return this;
            }

            public final Builder allowedCountries(Set<String> allowedCountries) {
                Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
                this.allowedCountries = allowedCountries;
                return this;
            }

            public final Builder buttonTitle(String buttonTitle) {
                this.buttonTitle = buttonTitle;
                return this;
            }

            public final Builder additionalFields(AdditionalFieldsConfiguration additionalFields) {
                Intrinsics.checkNotNullParameter(additionalFields, "additionalFields");
                this.additionalFields = additionalFields;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }

            public final Builder googlePlacesApiKey(String googlePlacesApiKey) {
                this.googlePlacesApiKey = googlePlacesApiKey;
                return this;
            }

            public final Builder autocompleteCountries(Set<String> autocompleteCountries) {
                Intrinsics.checkNotNullParameter(autocompleteCountries, "autocompleteCountries");
                this.autocompleteCountries = autocompleteCountries;
                return this;
            }

            public final Builder billingAddress(PaymentSheet.BillingDetails billingAddress) {
                this.billingAddress = billingAddress;
                return this;
            }

            public final Configuration build() {
                return new Configuration(this.appearance, this.address, this.allowedCountries, this.buttonTitle, this.additionalFields, this.title, this.googlePlacesApiKey, this.autocompleteCountries, this.billingAddress);
            }
        }
    }

    /* compiled from: AddressLauncher.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", "Landroid/os/Parcelable;", "phone", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;", "checkboxLabel", "", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;Ljava/lang/String;)V", "getPhone", "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;", "getCheckboxLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "FieldConfiguration", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdditionalFieldsConfiguration implements Parcelable {
        private final String checkboxLabel;
        private final FieldConfiguration phone;
        public static final Parcelable.Creator<AdditionalFieldsConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: AddressLauncher.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdditionalFieldsConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalFieldsConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalFieldsConfiguration(FieldConfiguration.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AdditionalFieldsConfiguration[] newArray(int i) {
                return new AdditionalFieldsConfiguration[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdditionalFieldsConfiguration() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AdditionalFieldsConfiguration copy$default(AdditionalFieldsConfiguration additionalFieldsConfiguration, FieldConfiguration fieldConfiguration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                fieldConfiguration = additionalFieldsConfiguration.phone;
            }
            if ((i & 2) != 0) {
                str = additionalFieldsConfiguration.checkboxLabel;
            }
            return additionalFieldsConfiguration.copy(fieldConfiguration, str);
        }

        /* renamed from: component1, reason: from getter */
        public final FieldConfiguration getPhone() {
            return this.phone;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCheckboxLabel() {
            return this.checkboxLabel;
        }

        public final AdditionalFieldsConfiguration copy(FieldConfiguration phone, String checkboxLabel) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            return new AdditionalFieldsConfiguration(phone, checkboxLabel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalFieldsConfiguration)) {
                return false;
            }
            AdditionalFieldsConfiguration additionalFieldsConfiguration = (AdditionalFieldsConfiguration) other;
            return this.phone == additionalFieldsConfiguration.phone && Intrinsics.areEqual(this.checkboxLabel, additionalFieldsConfiguration.checkboxLabel);
        }

        public int hashCode() {
            int iHashCode = this.phone.hashCode() * 31;
            String str = this.checkboxLabel;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AdditionalFieldsConfiguration(phone=" + this.phone + ", checkboxLabel=" + this.checkboxLabel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.phone.writeToParcel(dest, flags);
            dest.writeString(this.checkboxLabel);
        }

        public AdditionalFieldsConfiguration(FieldConfiguration phone, String str) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            this.phone = phone;
            this.checkboxLabel = str;
        }

        public /* synthetic */ AdditionalFieldsConfiguration(FieldConfiguration fieldConfiguration, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FieldConfiguration.HIDDEN : fieldConfiguration, (i & 2) != 0 ? null : str);
        }

        public final FieldConfiguration getPhone() {
            return this.phone;
        }

        public final String getCheckboxLabel() {
            return this.checkboxLabel;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AddressLauncher.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "OPTIONAL", "REQUIRED", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FieldConfiguration implements Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ FieldConfiguration[] $VALUES;
            public static final Parcelable.Creator<FieldConfiguration> CREATOR;
            public static final FieldConfiguration HIDDEN = new FieldConfiguration("HIDDEN", 0);
            public static final FieldConfiguration OPTIONAL = new FieldConfiguration("OPTIONAL", 1);
            public static final FieldConfiguration REQUIRED = new FieldConfiguration("REQUIRED", 2);

            /* compiled from: AddressLauncher.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FieldConfiguration> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldConfiguration createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return FieldConfiguration.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FieldConfiguration[] newArray(int i) {
                    return new FieldConfiguration[i];
                }
            }

            private static final /* synthetic */ FieldConfiguration[] $values() {
                return new FieldConfiguration[]{HIDDEN, OPTIONAL, REQUIRED};
            }

            public static EnumEntries<FieldConfiguration> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(name());
            }

            private FieldConfiguration(String str, int i) {
            }

            static {
                FieldConfiguration[] fieldConfigurationArr$values = $values();
                $VALUES = fieldConfigurationArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(fieldConfigurationArr$values);
                CREATOR = new Creator();
            }

            public static FieldConfiguration valueOf(String str) {
                return (FieldConfiguration) Enum.valueOf(FieldConfiguration.class, str);
            }

            public static FieldConfiguration[] values() {
                return (FieldConfiguration[]) $VALUES.clone();
            }
        }
    }
}
