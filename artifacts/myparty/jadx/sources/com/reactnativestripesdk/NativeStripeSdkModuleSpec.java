package com.reactnativestripesdk;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class NativeStripeSdkModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "StripeSdk";

    @ReactMethod
    public abstract void canAddCardToWallet(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void clearEmbeddedPaymentOption(double d, Promise promise);

    @ReactMethod
    public abstract void collectBankAccount(boolean z, String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void collectBankAccountToken(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void collectFinancialConnectionsAccounts(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void configureOrderTracking(String str, String str2, String str3, String str4, Promise promise);

    @ReactMethod
    public abstract void confirmEmbeddedPaymentElement(double d, Promise promise);

    @ReactMethod
    public abstract void confirmPayment(String str, @Nullable ReadableMap readableMap, @Nullable ReadableMap readableMap2, Promise promise);

    @ReactMethod
    public abstract void confirmPaymentSheetPayment(Promise promise);

    @ReactMethod
    public abstract void confirmPlatformPay(String str, ReadableMap readableMap, boolean z, Promise promise);

    @ReactMethod
    public abstract void confirmSetupIntent(String str, ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    public abstract void createEmbeddedPaymentElement(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    public abstract void createPaymentMethod(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    public abstract void createPlatformPayPaymentMethod(ReadableMap readableMap, boolean z, Promise promise);

    @ReactMethod
    public abstract void createToken(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void createTokenForCVCUpdate(String str, Promise promise);

    @ReactMethod
    public abstract void customPaymentMethodResultCallback(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void customerAdapterAttachPaymentMethodCallback(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void customerAdapterDetachPaymentMethodCallback(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void customerAdapterFetchPaymentMethodsCallback(ReadableArray readableArray, Promise promise);

    @ReactMethod
    public abstract void customerAdapterFetchSelectedPaymentOptionCallback(@Nullable String str, Promise promise);

    @ReactMethod
    public abstract void customerAdapterSetSelectedPaymentOptionCallback(Promise promise);

    @ReactMethod
    public abstract void customerAdapterSetupIntentClientSecretForCustomerAttachCallback(String str, Promise promise);

    @ReactMethod
    public abstract void dismissPlatformPay(Promise promise);

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    public abstract void handleNextAction(String str, @Nullable String str2, Promise promise);

    @ReactMethod
    public abstract void handleNextActionForSetup(String str, @Nullable String str2, Promise promise);

    @ReactMethod
    public abstract void handleURLCallback(String str, Promise promise);

    @ReactMethod
    public abstract void initCustomerSheet(ReadableMap readableMap, ReadableMap readableMap2, Promise promise);

    @ReactMethod
    public abstract void initPaymentSheet(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void initialise(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void intentCreationCallback(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void isCardInWallet(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void isPlatformPaySupported(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void openApplePaySetup(Promise promise);

    @ReactMethod
    public abstract void presentCustomerSheet(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void presentPaymentSheet(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void resetPaymentSheetCustomer(Promise promise);

    @ReactMethod
    public abstract void retrieveCustomerSheetPaymentOptionSelection(Promise promise);

    @ReactMethod
    public abstract void retrievePaymentIntent(String str, Promise promise);

    @ReactMethod
    public abstract void retrieveSetupIntent(String str, Promise promise);

    @ReactMethod
    public abstract void updateEmbeddedPaymentElement(ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void updatePlatformPaySheet(ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, Promise promise);

    @ReactMethod
    public abstract void verifyMicrodeposits(boolean z, String str, ReadableMap readableMap, Promise promise);

    public NativeStripeSdkModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "StripeSdk";
    }

    protected final void emitOnConfirmHandlerCallback(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onConfirmHandlerCallback", readableMap);
    }

    protected final void emitOnFinancialConnectionsEvent(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onFinancialConnectionsEvent", readableMap);
    }

    protected final void emitOnOrderTrackingCallback() {
        this.mEventEmitterCallback.invoke("onOrderTrackingCallback");
    }

    protected final void emitOnCustomerAdapterFetchPaymentMethodsCallback() {
        this.mEventEmitterCallback.invoke("onCustomerAdapterFetchPaymentMethodsCallback");
    }

    protected final void emitOnCustomerAdapterAttachPaymentMethodCallback(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onCustomerAdapterAttachPaymentMethodCallback", readableMap);
    }

    protected final void emitOnCustomerAdapterDetachPaymentMethodCallback(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onCustomerAdapterDetachPaymentMethodCallback", readableMap);
    }

    protected final void emitOnCustomerAdapterSetSelectedPaymentOptionCallback(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onCustomerAdapterSetSelectedPaymentOptionCallback", readableMap);
    }

    protected final void emitOnCustomerAdapterFetchSelectedPaymentOptionCallback() {
        this.mEventEmitterCallback.invoke("onCustomerAdapterFetchSelectedPaymentOptionCallback");
    }

    protected final void emitOnCustomerAdapterSetupIntentClientSecretForCustomerAttachCallback() {
        this.mEventEmitterCallback.invoke("onCustomerAdapterSetupIntentClientSecretForCustomerAttachCallback");
    }

    protected final void emitEmbeddedPaymentElementDidUpdateHeight(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("embeddedPaymentElementDidUpdateHeight", readableMap);
    }

    protected final void emitEmbeddedPaymentElementWillPresent() {
        this.mEventEmitterCallback.invoke("embeddedPaymentElementWillPresent");
    }

    protected final void emitEmbeddedPaymentElementDidUpdatePaymentOption(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("embeddedPaymentElementDidUpdatePaymentOption", readableMap);
    }

    protected final void emitEmbeddedPaymentElementFormSheetConfirmComplete(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("embeddedPaymentElementFormSheetConfirmComplete", readableMap);
    }

    protected final void emitEmbeddedPaymentElementRowSelectionImmediateAction() {
        this.mEventEmitterCallback.invoke("embeddedPaymentElementRowSelectionImmediateAction");
    }

    protected final void emitEmbeddedPaymentElementLoadingFailed(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("embeddedPaymentElementLoadingFailed", readableMap);
    }

    protected final void emitOnCustomPaymentMethodConfirmHandlerCallback(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onCustomPaymentMethodConfirmHandlerCallback", readableMap);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
            HashSet hashSet = new HashSet(Arrays.asList("API_VERSIONS"));
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (!hashSet3.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
            hashSet.removeAll(typedExportedConstants.keySet());
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
            }
        }
        return typedExportedConstants;
    }
}
