package com.reactnativestripesdk;

import android.content.Context;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.EmbeddedPaymentElementViewManagerDelegate;
import com.facebook.react.viewmanagers.EmbeddedPaymentElementViewManagerInterface;
import com.reactnativestripesdk.addresssheet.AddressSheetView;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.PaymentSheetAppearanceException;
import com.reactnativestripesdk.utils.PaymentSheetException;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedPaymentElementViewManager.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001$B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007H\u0014J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/reactnativestripesdk/EmbeddedPaymentElementViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativestripesdk/EmbeddedPaymentElementView;", "Lcom/facebook/react/viewmanagers/EmbeddedPaymentElementViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/viewmanagers/EmbeddedPaymentElementViewManagerDelegate;", "kotlin.jvm.PlatformType", "getName", "", "getDelegate", "createViewInstance", "ctx", "Lcom/facebook/react/uimanager/ThemedReactContext;", "onDropViewInstance", "", ViewHierarchyConstants.VIEW_KEY, "needsCustomLayoutForChildren", "", "setConfiguration", "cfg", "Lcom/facebook/react/bridge/Dynamic;", "setIntentConfiguration", "parseElementConfiguration", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "parseRowSelectionBehavior", "Lcom/reactnativestripesdk/RowSelectionBehaviorType;", "parseIntentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "confirm", "clearPaymentOption", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = EmbeddedPaymentElementViewManager.NAME)
/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementViewManager extends ViewGroupManager<EmbeddedPaymentElementView> implements EmbeddedPaymentElementViewManagerInterface<EmbeddedPaymentElementView> {
    public static final String NAME = "EmbeddedPaymentElementView";
    private final EmbeddedPaymentElementViewManagerDelegate<EmbeddedPaymentElementView, EmbeddedPaymentElementViewManager> delegate;
    public static final int $stable = 8;

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public EmbeddedPaymentElementViewManager() {
        super(null, 1, null);
        this.delegate = new EmbeddedPaymentElementViewManagerDelegate<>(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public EmbeddedPaymentElementViewManagerDelegate<EmbeddedPaymentElementView, EmbeddedPaymentElementViewManager> getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public EmbeddedPaymentElementView createViewInstance(ThemedReactContext ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return new EmbeddedPaymentElementView(ctx);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(EmbeddedPaymentElementView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onDropViewInstance((EmbeddedPaymentElementViewManager) view);
        view.handleOnDropViewInstance();
    }

    @Override // com.facebook.react.viewmanagers.EmbeddedPaymentElementViewManagerInterface
    @ReactProp(name = "configuration")
    public void setConfiguration(final EmbeddedPaymentElementView view, Dynamic cfg) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cfg, "cfg");
        ReadableMap readableMapAsMap = cfg.asMap();
        if (readableMapAsMap == null) {
            return;
        }
        view.getRowSelectionBehaviorType().setValue(parseRowSelectionBehavior(readableMapAsMap));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EmbeddedPaymentElement.Configuration elementConfiguration = parseElementConfiguration(readableMapAsMap, context);
        view.setLatestElementConfig(elementConfiguration);
        PaymentSheet.IntentConfiguration latestIntentConfig = view.getLatestIntentConfig();
        if (latestIntentConfig != null) {
            view.configure(elementConfiguration, latestIntentConfig);
            view.post(new Runnable() { // from class: com.reactnativestripesdk.EmbeddedPaymentElementViewManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    EmbeddedPaymentElementViewManager.setConfiguration$lambda$1$lambda$0(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setConfiguration$lambda$1$lambda$0(EmbeddedPaymentElementView embeddedPaymentElementView) {
        embeddedPaymentElementView.requestLayout();
        embeddedPaymentElementView.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.EmbeddedPaymentElementViewManagerInterface
    @ReactProp(name = "intentConfiguration")
    public void setIntentConfiguration(EmbeddedPaymentElementView view, Dynamic cfg) throws PaymentSheetException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(cfg, "cfg");
        ReadableMap readableMapAsMap = cfg.asMap();
        if (readableMapAsMap == null) {
            return;
        }
        PaymentSheet.IntentConfiguration intentConfiguration = parseIntentConfiguration(readableMapAsMap);
        view.setLatestIntentConfig(intentConfiguration);
        EmbeddedPaymentElement.Configuration latestElementConfig = view.getLatestElementConfig();
        if (latestElementConfig != null) {
            view.configure(latestElementConfig, intentConfiguration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final EmbeddedPaymentElement.Configuration parseElementConfiguration(ReadableMap map, Context context) {
        PaymentSheet.BillingDetails billingDetails;
        EmbeddedPaymentElement.FormSheetAction formSheetAction;
        String string;
        String string2 = map.getString("merchantDisplayName");
        if (string2 == null) {
            string2 = "";
        }
        boolean z = (map.hasKey("allowsDelayedPaymentMethods") && map.getType("allowsDelayedPaymentMethods") == ReadableType.Boolean) ? map.getBoolean("allowsDelayedPaymentMethods") : false;
        ReadableMap map2 = map.getMap("defaultBillingDetails");
        if (map2 != null) {
            ReadableMap map3 = map2.getMap("address");
            billingDetails = new PaymentSheet.BillingDetails(new PaymentSheet.Address(map3 != null ? map3.getString("city") : null, map3 != null ? map3.getString("country") : null, map3 != null ? map3.getString("line1") : null, map3 != null ? map3.getString("line2") : null, map3 != null ? map3.getString(HintConstants.AUTOFILL_HINT_POSTAL_CODE) : null, map3 != null ? map3.getString(ServerProtocol.DIALOG_PARAM_STATE) : null), map2.getString("email"), map2.getString("name"), map2.getString("phone"));
        } else {
            billingDetails = null;
        }
        try {
            PaymentSheet.CustomerConfiguration customerConfigurationBuildCustomerConfiguration$stripe_stripe_react_native_release = PaymentSheetFragment.INSTANCE.buildCustomerConfiguration$stripe_stripe_react_native_release(MappersKt.toBundleObject(map));
            PaymentSheet.GooglePayConfiguration googlePayConfigurationBuildGooglePayConfig$stripe_stripe_react_native_release = PaymentSheetFragment.INSTANCE.buildGooglePayConfig$stripe_stripe_react_native_release(MappersKt.toBundleObject(map.getMap("googlePay")));
            ReadableMap map4 = map.getMap("defaultShippingDetails");
            AddressDetails addressDetailsBuildAddressDetails$stripe_stripe_react_native_release = map4 != null ? AddressSheetView.INSTANCE.buildAddressDetails$stripe_stripe_react_native_release(map4) : null;
            try {
                PaymentSheet.Appearance appearanceBuildPaymentSheetAppearance = PaymentSheetAppearanceKt.buildPaymentSheetAppearance(MappersKt.toBundleObject(map.getMap("appearance")), context);
                ReadableMap map5 = map.getMap("billingDetailsCollectionConfiguration");
                PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = new PaymentSheet.BillingDetailsCollectionConfiguration(PaymentSheetFragmentKt.mapToCollectionMode(map5 != null ? map5.getString("name") : null), PaymentSheetFragmentKt.mapToCollectionMode(map5 != null ? map5.getString("phone") : null), PaymentSheetFragmentKt.mapToCollectionMode(map5 != null ? map5.getString("email") : null), PaymentSheetFragmentKt.mapToAddressCollectionMode(map5 != null ? map5.getString("address") : null), map5 != null ? ExtensionsKt.getBooleanOr(map5, "attachDefaultsToPaymentMethod", false) : false);
                boolean z2 = map.hasKey("allowsRemovalOfLastSavedPaymentMethod") ? map.getBoolean("allowsRemovalOfLastSavedPaymentMethod") : true;
                String string3 = map.getString("primaryButtonLabel");
                List<String> stringArrayList = EmbeddedPaymentElementViewManagerKt.getStringArrayList(map, "paymentMethodOrder");
                ReadableMap map6 = map.getMap("formSheetAction");
                if (map6 != null && (string = map6.getString("type")) != null) {
                    formSheetAction = Intrinsics.areEqual(string, "confirm") ? EmbeddedPaymentElement.FormSheetAction.Confirm : EmbeddedPaymentElement.FormSheetAction.Continue;
                    if (formSheetAction == null) {
                    }
                } else {
                    formSheetAction = EmbeddedPaymentElement.FormSheetAction.Continue;
                }
                EmbeddedPaymentElement.Configuration.Builder builderBillingDetailsCollectionConfiguration = new EmbeddedPaymentElement.Configuration.Builder(string2).formSheetAction(formSheetAction).allowsDelayedPaymentMethods(z).defaultBillingDetails(billingDetails).customer(customerConfigurationBuildCustomerConfiguration$stripe_stripe_react_native_release).googlePay(googlePayConfigurationBuildGooglePayConfig$stripe_stripe_react_native_release).appearance(appearanceBuildPaymentSheetAppearance).shippingDetails(addressDetailsBuildAddressDetails$stripe_stripe_react_native_release).billingDetailsCollectionConfiguration(billingDetailsCollectionConfiguration);
                List<Integer> integerArrayList = EmbeddedPaymentElementViewManagerKt.getIntegerArrayList(map, "preferredNetworks");
                EmbeddedPaymentElement.Configuration.Builder builderCardBrandAcceptance = builderBillingDetailsCollectionConfiguration.preferredNetworks(MappersKt.mapToPreferredNetworks(integerArrayList != null ? new ArrayList(integerArrayList) : null)).allowsRemovalOfLastSavedPaymentMethod(z2).cardBrandAcceptance(PaymentSheetFragmentKt.mapToCardBrandAcceptance(MappersKt.toBundleObject(map)));
                Bundle bundleObject = MappersKt.toBundleObject(map.getMap("customPaymentMethodConfiguration"));
                ReadableMap map7 = map.getMap("customPaymentMethodConfiguration");
                if (map7 != null) {
                    bundleObject.putSerializable("customPaymentMethodConfigurationReadableMap", map7.toHashMap());
                }
                EmbeddedPaymentElement.Configuration.Builder builderCustomPaymentMethods = builderCardBrandAcceptance.customPaymentMethods(MappersKt.parseCustomPaymentMethods(bundleObject));
                if (string3 != null) {
                    builderCustomPaymentMethods.primaryButtonLabel(string3);
                }
                if (stringArrayList != null) {
                    builderCustomPaymentMethods.paymentMethodOrder(stringArrayList);
                }
                return builderCustomPaymentMethods.build();
            } catch (PaymentSheetAppearanceException unused) {
                throw new Error();
            }
        } catch (PaymentSheetException unused2) {
            throw new Error();
        }
    }

    private final RowSelectionBehaviorType parseRowSelectionBehavior(ReadableMap map) {
        String string;
        ReadableMap map2 = map.getMap("rowSelectionBehavior");
        if (map2 != null && (string = map2.getString("type")) != null) {
            RowSelectionBehaviorType rowSelectionBehaviorType = Intrinsics.areEqual(string, "immediateAction") ? RowSelectionBehaviorType.ImmediateAction : RowSelectionBehaviorType.Default;
            if (rowSelectionBehaviorType != null) {
                return rowSelectionBehaviorType;
            }
        }
        return RowSelectionBehaviorType.Default;
    }

    private final PaymentSheet.IntentConfiguration parseIntentConfiguration(ReadableMap map) throws PaymentSheetException {
        PaymentSheet.IntentConfiguration intentConfigurationBuildIntentConfiguration$stripe_stripe_react_native_release = PaymentSheetFragment.INSTANCE.buildIntentConfiguration$stripe_stripe_react_native_release(MappersKt.toBundleObject(map));
        if (intentConfigurationBuildIntentConfiguration$stripe_stripe_react_native_release != null) {
            return intentConfigurationBuildIntentConfiguration$stripe_stripe_react_native_release;
        }
        throw new IllegalArgumentException("IntentConfiguration is null");
    }

    @Override // com.facebook.react.viewmanagers.EmbeddedPaymentElementViewManagerInterface
    public void confirm(EmbeddedPaymentElementView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.confirm();
    }

    @Override // com.facebook.react.viewmanagers.EmbeddedPaymentElementViewManagerInterface
    public void clearPaymentOption(EmbeddedPaymentElementView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.clearPaymentOption();
    }
}
