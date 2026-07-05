package com.reactnativestripesdk.addresssheet;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.autofill.HintConstants;
import com.facebook.GraphRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.reactnativestripesdk.PaymentSheetAppearanceKt;
import com.reactnativestripesdk.addresssheet.AddressSheetEvent;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.PaymentSheetAppearanceException;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressSheetView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0007J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\tJ\u0010\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\tJ\u0016\u0010\"\u001a\u00020\u00162\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010$J\u0016\u0010%\u001a\u00020\u00162\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010$J\u0010\u0010&\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010(\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010)\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/AddressSheetView;", "Landroid/widget/FrameLayout;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "isVisible", "", "appearanceParams", "Lcom/facebook/react/bridge/ReadableMap;", "defaultAddress", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowedCountries", "", "", "buttonTitle", "sheetTitle", "googlePlacesApiKey", "autocompleteCountries", "additionalFields", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", "onSubmit", "", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/facebook/react/bridge/WritableMap;", "onError", "setVisible", "newVisibility", "launchAddressSheet", "setAppearance", "setDefaultValues", "defaults", "setAdditionalFields", GraphRequest.FIELDS_PARAM, "setAllowedCountries", "countries", "", "setAutocompleteCountries", "setPrimaryButtonTitle", "title", "setSheetTitle", "setGooglePlacesApiKey", SDKConstants.PARAM_KEY, "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressSheetView extends FrameLayout {
    private AddressLauncher.AdditionalFieldsConfiguration additionalFields;
    private Set<String> allowedCountries;
    private ReadableMap appearanceParams;
    private Set<String> autocompleteCountries;
    private String buttonTitle;
    private final ThemedReactContext context;
    private AddressDetails defaultAddress;
    private String googlePlacesApiKey;
    private boolean isVisible;
    private String sheetTitle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressSheetView(ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.allowedCountries = SetsKt.emptySet();
        this.autocompleteCountries = SetsKt.emptySet();
    }

    private final void onSubmit(WritableMap params) {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new AddressSheetEvent(this.context.getSurfaceId(), getId(), AddressSheetEvent.EventType.OnSubmit, params));
        }
    }

    private final void onError(WritableMap params) {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new AddressSheetEvent(this.context.getSurfaceId(), getId(), AddressSheetEvent.EventType.OnError, params));
        }
    }

    public final void setVisible(boolean newVisibility) {
        if (newVisibility && !this.isVisible) {
            launchAddressSheet();
        } else if (!newVisibility && this.isVisible) {
            Log.w("StripeReactNative", "Programmatically dismissing the Address Sheet is not supported on Android.");
        }
        this.isVisible = newVisibility;
    }

    private final void launchAddressSheet() {
        try {
            new AddressLauncherFragment().presentAddressSheet(this.context, PaymentSheetAppearanceKt.buildPaymentSheetAppearance(MappersKt.toBundleObject(this.appearanceParams), this.context), this.defaultAddress, this.allowedCountries, this.buttonTitle, this.sheetTitle, this.googlePlacesApiKey, this.autocompleteCountries, this.additionalFields, new Function2() { // from class: com.reactnativestripesdk.addresssheet.AddressSheetView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddressSheetView.launchAddressSheet$lambda$0(this.f$0, (WritableMap) obj, (AddressDetails) obj2);
                }
            });
        } catch (PaymentSheetAppearanceException e) {
            onError(ErrorsKt.createError(ErrorType.Failed.toString(), (Exception) e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchAddressSheet$lambda$0(AddressSheetView addressSheetView, WritableMap writableMap, AddressDetails addressDetails) {
        if (addressDetails != null) {
            addressSheetView.onSubmit(INSTANCE.buildResult$stripe_stripe_react_native_release(addressDetails));
        } else {
            addressSheetView.onError(writableMap);
        }
        addressSheetView.isVisible = false;
        return Unit.INSTANCE;
    }

    public final void setAppearance(ReadableMap appearanceParams) {
        this.appearanceParams = appearanceParams;
    }

    public final void setDefaultValues(ReadableMap defaults) {
        this.defaultAddress = defaults != null ? INSTANCE.buildAddressDetails$stripe_stripe_react_native_release(defaults) : null;
    }

    public final void setAdditionalFields(ReadableMap fields) {
        this.additionalFields = fields != null ? INSTANCE.buildAdditionalFieldsConfiguration$stripe_stripe_react_native_release(fields) : null;
    }

    public final void setAllowedCountries(List<String> countries) {
        Set<String> setEmptySet;
        if (countries == null || (setEmptySet = CollectionsKt.toSet(countries)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        this.allowedCountries = setEmptySet;
    }

    public final void setAutocompleteCountries(List<String> countries) {
        Set<String> setEmptySet;
        if (countries == null || (setEmptySet = CollectionsKt.toSet(countries)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        this.autocompleteCountries = setEmptySet;
    }

    public final void setPrimaryButtonTitle(String title) {
        this.buttonTitle = title;
    }

    public final void setSheetTitle(String title) {
        this.sheetTitle = title;
    }

    public final void setGooglePlacesApiKey(String key) {
        this.googlePlacesApiKey = key;
    }

    /* compiled from: AddressSheetView.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/AddressSheetView$Companion;", "", "<init>", "()V", "buildAddressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "bundle", "Landroid/os/Bundle;", "buildAddressDetails$stripe_stripe_react_native_release", "map", "Lcom/facebook/react/bridge/ReadableMap;", "buildAddress", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "buildAddress$stripe_stripe_react_native_release", "getFieldConfiguration", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;", SDKConstants.PARAM_KEY, "", "getFieldConfiguration$stripe_stripe_react_native_release", "buildAdditionalFieldsConfiguration", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", NativeProtocol.WEB_DIALOG_PARAMS, "buildAdditionalFieldsConfiguration$stripe_stripe_react_native_release", "buildResult", "Lcom/facebook/react/bridge/WritableMap;", "addressDetails", "buildResult$stripe_stripe_react_native_release", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AddressDetails buildAddressDetails$stripe_stripe_react_native_release(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new AddressDetails(bundle.getString("name"), buildAddress$stripe_stripe_react_native_release(bundle.getBundle("address")), bundle.getString("phone"), Boolean.valueOf(bundle.getBoolean("isCheckboxSelected")));
        }

        public final AddressDetails buildAddressDetails$stripe_stripe_react_native_release(ReadableMap map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return buildAddressDetails$stripe_stripe_react_native_release(MappersKt.toBundleObject(map));
        }

        public final PaymentSheet.Address buildAddress$stripe_stripe_react_native_release(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return new PaymentSheet.Address(bundle.getString("city"), bundle.getString("country"), bundle.getString("line1"), bundle.getString("line2"), bundle.getString(HintConstants.AUTOFILL_HINT_POSTAL_CODE), bundle.getString(ServerProtocol.DIALOG_PARAM_STATE));
        }

        public final AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration getFieldConfiguration$stripe_stripe_react_native_release(String key) {
            if (key != null) {
                int iHashCode = key.hashCode();
                if (iHashCode != -1217487446) {
                    if (iHashCode != -393139297) {
                        if (iHashCode == -79017120 && key.equals("optional")) {
                            return AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.OPTIONAL;
                        }
                    } else if (key.equals("required")) {
                        return AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.REQUIRED;
                    }
                } else if (key.equals(ViewProps.HIDDEN)) {
                    return AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.HIDDEN;
                }
            }
            return AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.HIDDEN;
        }

        public final AddressLauncher.AdditionalFieldsConfiguration buildAdditionalFieldsConfiguration$stripe_stripe_react_native_release(ReadableMap params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new AddressLauncher.AdditionalFieldsConfiguration(getFieldConfiguration$stripe_stripe_react_native_release(params.getString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)), params.getString("checkboxLabel"));
        }

        public final WritableMap buildResult$stripe_stripe_react_native_release(AddressDetails addressDetails) {
            Intrinsics.checkNotNullParameter(addressDetails, "addressDetails");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("name", addressDetails.getName());
            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
            PaymentSheet.Address address = addressDetails.getAddress();
            writableNativeMap3.putString("city", address != null ? address.getCity() : null);
            PaymentSheet.Address address2 = addressDetails.getAddress();
            writableNativeMap3.putString("country", address2 != null ? address2.getCountry() : null);
            PaymentSheet.Address address3 = addressDetails.getAddress();
            writableNativeMap3.putString("line1", address3 != null ? address3.getLine1() : null);
            PaymentSheet.Address address4 = addressDetails.getAddress();
            writableNativeMap3.putString("line2", address4 != null ? address4.getLine2() : null);
            PaymentSheet.Address address5 = addressDetails.getAddress();
            writableNativeMap3.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, address5 != null ? address5.getPostalCode() : null);
            PaymentSheet.Address address6 = addressDetails.getAddress();
            writableNativeMap3.putString(ServerProtocol.DIALOG_PARAM_STATE, address6 != null ? address6.getState() : null);
            Unit unit = Unit.INSTANCE;
            writableNativeMap2.putMap("address", writableNativeMap3);
            writableNativeMap2.putString("phone", addressDetails.getPhoneNumber());
            Boolean boolIsCheckboxSelected = addressDetails.isCheckboxSelected();
            writableNativeMap2.putBoolean("isCheckboxSelected", boolIsCheckboxSelected != null ? boolIsCheckboxSelected.booleanValue() : false);
            Unit unit2 = Unit.INSTANCE;
            writableNativeMap.putMap(FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, writableNativeMap2);
            return writableNativeMap;
        }
    }
}
