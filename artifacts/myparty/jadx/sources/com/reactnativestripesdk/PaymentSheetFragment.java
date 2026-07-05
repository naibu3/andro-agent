package com.reactnativestripesdk;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactnativestripesdk.addresssheet.AddressSheetView;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.reactnativestripesdk.utils.KeepJsAwakeTask;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.PaymentSheetAppearanceException;
import com.reactnativestripesdk.utils.PaymentSheetErrorType;
import com.reactnativestripesdk.utils.PaymentSheetException;
import com.reactnativestripesdk.utils.StripeFragment;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.paymentelement.CustomPaymentMethodResult;
import com.stripe.android.paymentelement.CustomPaymentMethodResultHandler;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.model.PaymentOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PaymentSheetFragment.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bJ\u0016\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020\bJ\u000e\u0010(\u001a\u00020\"2\u0006\u0010$\u001a\u00020\bJ\b\u0010)\u001a\u00020\"H\u0002J\u0012\u0010*\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00100\u001a\u00020\"2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/reactnativestripesdk/PaymentSheetFragment;", "Lcom/reactnativestripesdk/utils/StripeFragment;", "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;", "<init>", "()V", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "initPromise", "Lcom/facebook/react/bridge/Promise;", "paymentSheet", "Lcom/stripe/android/paymentsheet/PaymentSheet;", "flowController", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "paymentIntentClientSecret", "", "setupIntentClientSecret", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "paymentSheetConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "confirmPromise", "presentPromise", "paymentSheetTimedOut", "", "paymentSheetIntentCreationCallback", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/facebook/react/bridge/ReadableMap;", "getPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release", "()Lkotlinx/coroutines/CompletableDeferred;", "setPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release", "(Lkotlinx/coroutines/CompletableDeferred;)V", "keepJsAwake", "Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;", "prepare", "", "present", BaseJavaModule.METHOD_TYPE_PROMISE, "presentWithTimeout", "timeout", "", "confirmPayment", "configureFlowController", "resolvePresentPromise", "value", "", "resolvePaymentResult", "map", "Lcom/facebook/react/bridge/WritableMap;", "onConfirmCustomPaymentMethod", "customPaymentMethod", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentSheetFragment extends StripeFragment implements ConfirmCustomPaymentMethodCallback {
    public static final String TAG = "payment_sheet_launch_fragment";
    private Promise confirmPromise;
    private ReactApplicationContext context;
    private PaymentSheet.FlowController flowController;
    private Promise initPromise;
    private PaymentSheet.IntentConfiguration intentConfiguration;
    private KeepJsAwakeTask keepJsAwake;
    private String paymentIntentClientSecret;
    private PaymentSheet paymentSheet;
    private PaymentSheet.Configuration paymentSheetConfiguration;
    private CompletableDeferred<ReadableMap> paymentSheetIntentCreationCallback = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    private boolean paymentSheetTimedOut;
    private Promise presentPromise;
    private String setupIntentClientSecret;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Map<Integer, PaymentSheet.GooglePayConfiguration.ButtonType> mapIntToButtonType = MapsKt.mapOf(TuplesKt.to(1, PaymentSheet.GooglePayConfiguration.ButtonType.Buy), TuplesKt.to(6, PaymentSheet.GooglePayConfiguration.ButtonType.Book), TuplesKt.to(5, PaymentSheet.GooglePayConfiguration.ButtonType.Checkout), TuplesKt.to(4, PaymentSheet.GooglePayConfiguration.ButtonType.Donate), TuplesKt.to(11, PaymentSheet.GooglePayConfiguration.ButtonType.Order), TuplesKt.to(1000, PaymentSheet.GooglePayConfiguration.ButtonType.Pay), TuplesKt.to(7, PaymentSheet.GooglePayConfiguration.ButtonType.Subscribe), TuplesKt.to(1001, PaymentSheet.GooglePayConfiguration.ButtonType.Plain));

    public final CompletableDeferred<ReadableMap> getPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release() {
        return this.paymentSheetIntentCreationCallback;
    }

    public final void setPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release(CompletableDeferred<ReadableMap> completableDeferred) {
        Intrinsics.checkNotNullParameter(completableDeferred, "<set-?>");
        this.paymentSheetIntentCreationCallback = completableDeferred;
    }

    @Override // com.reactnativestripesdk.utils.StripeFragment
    public void prepare() {
        PaymentSheet.BillingDetails billingDetails;
        PaymentSheet paymentSheetBuild;
        Promise promise;
        PaymentSheet.FlowController flowControllerBuild;
        Bundle bundle;
        Promise promise2;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("merchantDisplayName") : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            Promise promise3 = this.initPromise;
            if (promise3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("initPromise");
                promise2 = null;
            } else {
                promise2 = promise3;
            }
            promise2.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), "merchantDisplayName cannot be empty or null."));
            return;
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("primaryButtonLabel") : null;
        Companion companion = INSTANCE;
        Bundle arguments3 = getArguments();
        PaymentSheet.GooglePayConfiguration googlePayConfigurationBuildGooglePayConfig$stripe_stripe_react_native_release = companion.buildGooglePayConfig$stripe_stripe_react_native_release(arguments3 != null ? arguments3.getBundle("googlePay") : null);
        Bundle arguments4 = getArguments();
        companion.buildLinkConfig$stripe_stripe_react_native_release(arguments4 != null ? arguments4.getBundle("link") : null);
        Bundle arguments5 = getArguments();
        Boolean boolValueOf = arguments5 != null ? Boolean.valueOf(arguments5.getBoolean("allowsDelayedPaymentMethods")) : null;
        Bundle arguments6 = getArguments();
        Bundle bundle2 = arguments6 != null ? arguments6.getBundle("defaultBillingDetails") : null;
        Bundle arguments7 = getArguments();
        Bundle bundle3 = arguments7 != null ? arguments7.getBundle("billingDetailsCollectionConfiguration") : null;
        Bundle arguments8 = getArguments();
        ArrayList<String> stringArrayList = arguments8 != null ? arguments8.getStringArrayList("paymentMethodOrder") : null;
        Bundle arguments9 = getArguments();
        boolean z = arguments9 != null ? arguments9.getBoolean("allowsRemovalOfLastSavedPaymentMethod", true) : true;
        Bundle arguments10 = getArguments();
        String string3 = arguments10 != null ? arguments10.getString("paymentIntentClientSecret") : null;
        if (string3 == null) {
            string3 = "";
        }
        this.paymentIntentClientSecret = string3;
        Bundle arguments11 = getArguments();
        String string4 = arguments11 != null ? arguments11.getString("setupIntentClientSecret") : null;
        this.setupIntentClientSecret = string4 != null ? string4 : "";
        try {
            Bundle arguments12 = getArguments();
            this.intentConfiguration = companion.buildIntentConfiguration$stripe_stripe_react_native_release(arguments12 != null ? arguments12.getBundle("intentConfiguration") : null);
            try {
                Bundle arguments13 = getArguments();
                Bundle bundle4 = arguments13 != null ? arguments13.getBundle("appearance") : null;
                ReactApplicationContext reactApplicationContext = this.context;
                if (reactApplicationContext == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    reactApplicationContext = null;
                }
                PaymentSheet.Appearance appearanceBuildPaymentSheetAppearance = PaymentSheetAppearanceKt.buildPaymentSheetAppearance(bundle4, reactApplicationContext);
                try {
                    PaymentSheet.CustomerConfiguration customerConfigurationBuildCustomerConfiguration$stripe_stripe_react_native_release = companion.buildCustomerConfiguration$stripe_stripe_react_native_release(getArguments());
                    Bundle arguments14 = getArguments();
                    AddressDetails addressDetailsBuildAddressDetails$stripe_stripe_react_native_release = (arguments14 == null || (bundle = arguments14.getBundle("defaultShippingDetails")) == null) ? null : AddressSheetView.INSTANCE.buildAddressDetails$stripe_stripe_react_native_release(bundle);
                    PaymentOptionCallback paymentOptionCallback = new PaymentOptionCallback() { // from class: com.reactnativestripesdk.PaymentSheetFragment$$ExternalSyntheticLambda1
                        @Override // com.stripe.android.paymentsheet.PaymentOptionCallback
                        public final void onPaymentOption(PaymentOption paymentOption) {
                            PaymentSheetFragment.prepare$lambda$3(this.f$0, paymentOption);
                        }
                    };
                    PaymentSheetResultCallback paymentSheetResultCallback = new PaymentSheetResultCallback() { // from class: com.reactnativestripesdk.PaymentSheetFragment$$ExternalSyntheticLambda2
                        @Override // com.stripe.android.paymentsheet.PaymentSheetResultCallback
                        public final void onPaymentSheetResult(PaymentSheetResult paymentSheetResult) {
                            PaymentSheetFragment.prepare$lambda$4(this.f$0, paymentSheetResult);
                        }
                    };
                    PaymentSheetFragment$prepare$createIntentCallback$1 paymentSheetFragment$prepare$createIntentCallback$1 = new PaymentSheetFragment$prepare$createIntentCallback$1(this);
                    Boolean bool = boolValueOf;
                    ArrayList<String> arrayList = stringArrayList;
                    PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = new PaymentSheet.BillingDetailsCollectionConfiguration(PaymentSheetFragmentKt.mapToCollectionMode(bundle3 != null ? bundle3.getString("name") : null), PaymentSheetFragmentKt.mapToCollectionMode(bundle3 != null ? bundle3.getString("phone") : null), PaymentSheetFragmentKt.mapToCollectionMode(bundle3 != null ? bundle3.getString("email") : null), PaymentSheetFragmentKt.mapToAddressCollectionMode(bundle3 != null ? bundle3.getString("address") : null), bundle3 != null ? bundle3.getBoolean("attachDefaultsToPaymentMethod", false) : false);
                    if (bundle2 != null) {
                        Bundle bundle5 = bundle2.getBundle("address");
                        billingDetails = new PaymentSheet.BillingDetails(new PaymentSheet.Address(bundle5 != null ? bundle5.getString("city") : null, bundle5 != null ? bundle5.getString("country") : null, bundle5 != null ? bundle5.getString("line1") : null, bundle5 != null ? bundle5.getString("line2") : null, bundle5 != null ? bundle5.getString(HintConstants.AUTOFILL_HINT_POSTAL_CODE) : null, bundle5 != null ? bundle5.getString(ServerProtocol.DIALOG_PARAM_STATE) : null), bundle2.getString("email"), bundle2.getString("name"), bundle2.getString("phone"));
                    } else {
                        billingDetails = null;
                    }
                    PaymentSheet.Configuration.Builder builderBillingDetailsCollectionConfiguration = new PaymentSheet.Configuration.Builder(string).allowsDelayedPaymentMethods(bool != null ? bool.booleanValue() : false).defaultBillingDetails(billingDetails).customer(customerConfigurationBuildCustomerConfiguration$stripe_stripe_react_native_release).googlePay(googlePayConfigurationBuildGooglePayConfig$stripe_stripe_react_native_release).appearance(appearanceBuildPaymentSheetAppearance).shippingDetails(addressDetailsBuildAddressDetails$stripe_stripe_react_native_release).billingDetailsCollectionConfiguration(billingDetailsCollectionConfiguration);
                    Bundle arguments15 = getArguments();
                    PaymentSheet.Configuration.Builder builderCustomPaymentMethods = builderBillingDetailsCollectionConfiguration.preferredNetworks(MappersKt.mapToPreferredNetworks(arguments15 != null ? arguments15.getIntegerArrayList("preferredNetworks") : null)).allowsRemovalOfLastSavedPaymentMethod(z).cardBrandAcceptance(PaymentSheetFragmentKt.mapToCardBrandAcceptance(getArguments())).customPaymentMethods(MappersKt.parseCustomPaymentMethods(getArguments()));
                    if (string2 != null) {
                        builderCustomPaymentMethods.primaryButtonLabel(string2);
                    }
                    if (arrayList != null) {
                        builderCustomPaymentMethods.paymentMethodOrder(arrayList);
                    }
                    Bundle arguments16 = getArguments();
                    builderCustomPaymentMethods.paymentMethodLayout(PaymentSheetFragmentKt.mapToPaymentMethodLayout(arguments16 != null ? arguments16.getString("paymentMethodLayout") : null));
                    this.paymentSheetConfiguration = builderCustomPaymentMethods.build();
                    Bundle arguments17 = getArguments();
                    if (arguments17 != null && arguments17.getBoolean("customFlow")) {
                        if (this.intentConfiguration != null) {
                            flowControllerBuild = new PaymentSheet.FlowController.Builder(paymentSheetResultCallback, paymentOptionCallback).createIntentCallback(paymentSheetFragment$prepare$createIntentCallback$1).confirmCustomPaymentMethodCallback(this).build(this);
                        } else {
                            flowControllerBuild = new PaymentSheet.FlowController.Builder(paymentSheetResultCallback, paymentOptionCallback).confirmCustomPaymentMethodCallback(this).build(this);
                        }
                        this.flowController = flowControllerBuild;
                        configureFlowController();
                        return;
                    }
                    if (this.intentConfiguration != null) {
                        paymentSheetBuild = new PaymentSheet.Builder(paymentSheetResultCallback).createIntentCallback(paymentSheetFragment$prepare$createIntentCallback$1).confirmCustomPaymentMethodCallback(this).build(this);
                    } else {
                        paymentSheetBuild = new PaymentSheet.Builder(paymentSheetResultCallback).confirmCustomPaymentMethodCallback(this).build(this);
                    }
                    this.paymentSheet = paymentSheetBuild;
                    Promise promise4 = this.initPromise;
                    if (promise4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("initPromise");
                        promise = null;
                    } else {
                        promise = promise4;
                    }
                    promise.resolve(new WritableNativeMap());
                } catch (PaymentSheetException e) {
                    Promise promise5 = this.initPromise;
                    if (promise5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("initPromise");
                        promise5 = null;
                    }
                    promise5.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), (Exception) e));
                }
            } catch (PaymentSheetAppearanceException e2) {
                Promise promise6 = this.initPromise;
                if (promise6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("initPromise");
                    promise6 = null;
                }
                promise6.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), (Exception) e2));
            }
        } catch (PaymentSheetException e3) {
            Promise promise7 = this.initPromise;
            if (promise7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("initPromise");
                promise7 = null;
            }
            promise7.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), (Exception) e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void prepare$lambda$3(PaymentSheetFragment paymentSheetFragment, PaymentOption paymentOption) {
        WritableMap writableMapCreateError;
        if (paymentOption != null) {
            ReactApplicationContext reactApplicationContext = paymentSheetFragment.context;
            if (reactApplicationContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                reactApplicationContext = null;
            }
            String base64FromBitmap = PaymentSheetFragmentKt.getBase64FromBitmap(PaymentSheetFragmentKt.getBitmapFromVectorDrawable(reactApplicationContext, paymentOption.getDrawableResourceId()));
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("label", paymentOption.getLabel());
            writableNativeMap.putString("image", base64FromBitmap);
            writableMapCreateError = MappersKt.createResult("paymentOption", writableNativeMap);
            if (writableMapCreateError == null) {
            }
        } else if (paymentSheetFragment.paymentSheetTimedOut) {
            paymentSheetFragment.paymentSheetTimedOut = false;
            writableMapCreateError = ErrorsKt.createError(PaymentSheetErrorType.Timeout.toString(), "The payment has timed out");
        } else {
            writableMapCreateError = ErrorsKt.createError(PaymentSheetErrorType.Canceled.toString(), "The payment option selection flow has been canceled");
        }
        paymentSheetFragment.resolvePresentPromise(writableMapCreateError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepare$lambda$4(PaymentSheetFragment paymentSheetFragment, PaymentSheetResult paymentResult) {
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        if (paymentSheetFragment.paymentSheetTimedOut) {
            paymentSheetFragment.paymentSheetTimedOut = false;
            paymentSheetFragment.resolvePaymentResult(ErrorsKt.createError(PaymentSheetErrorType.Timeout.toString(), "The payment has timed out"));
            return;
        }
        if (paymentResult instanceof PaymentSheetResult.Canceled) {
            paymentSheetFragment.resolvePaymentResult(ErrorsKt.createError(PaymentSheetErrorType.Canceled.toString(), "The payment flow has been canceled"));
            return;
        }
        if (paymentResult instanceof PaymentSheetResult.Failed) {
            paymentSheetFragment.resolvePaymentResult(ErrorsKt.createError(PaymentSheetErrorType.Failed.toString(), ((PaymentSheetResult.Failed) paymentResult).getError()));
            return;
        }
        if (!(paymentResult instanceof PaymentSheetResult.Completed)) {
            throw new NoWhenBranchMatchedException();
        }
        paymentSheetFragment.resolvePaymentResult(new WritableNativeMap());
        PaymentSheetFragment paymentSheetFragment2 = paymentSheetFragment;
        ReactApplicationContext reactApplicationContext = paymentSheetFragment.context;
        if (reactApplicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            reactApplicationContext = null;
        }
        ExtensionsKt.removeFragment(paymentSheetFragment2, reactApplicationContext);
        paymentSheetFragment.paymentSheet = null;
        paymentSheetFragment.flowController = null;
    }

    public final void present(Promise promise) {
        PaymentSheet paymentSheet;
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReactApplicationContext reactApplicationContext = this.context;
        PaymentSheet.Configuration configuration = null;
        if (reactApplicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            reactApplicationContext = null;
        }
        KeepJsAwakeTask keepJsAwakeTask = new KeepJsAwakeTask(reactApplicationContext);
        keepJsAwakeTask.start();
        this.keepJsAwake = keepJsAwakeTask;
        this.presentPromise = promise;
        if (this.paymentSheet != null) {
            String str = this.paymentIntentClientSecret;
            if (str != null && str.length() != 0) {
                PaymentSheet paymentSheet2 = this.paymentSheet;
                if (paymentSheet2 != null) {
                    String str2 = this.paymentIntentClientSecret;
                    Intrinsics.checkNotNull(str2);
                    PaymentSheet.Configuration configuration2 = this.paymentSheetConfiguration;
                    if (configuration2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("paymentSheetConfiguration");
                    } else {
                        configuration = configuration2;
                    }
                    paymentSheet2.presentWithPaymentIntent(str2, configuration);
                    return;
                }
                return;
            }
            String str3 = this.setupIntentClientSecret;
            if (str3 != null && str3.length() != 0) {
                PaymentSheet paymentSheet3 = this.paymentSheet;
                if (paymentSheet3 != null) {
                    String str4 = this.setupIntentClientSecret;
                    Intrinsics.checkNotNull(str4);
                    PaymentSheet.Configuration configuration3 = this.paymentSheetConfiguration;
                    if (configuration3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("paymentSheetConfiguration");
                    } else {
                        configuration = configuration3;
                    }
                    paymentSheet3.presentWithSetupIntent(str4, configuration);
                    return;
                }
                return;
            }
            PaymentSheet.IntentConfiguration intentConfiguration = this.intentConfiguration;
            if (intentConfiguration == null || (paymentSheet = this.paymentSheet) == null) {
                return;
            }
            Intrinsics.checkNotNull(intentConfiguration);
            PaymentSheet.Configuration configuration4 = this.paymentSheetConfiguration;
            if (configuration4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentSheetConfiguration");
            } else {
                configuration = configuration4;
            }
            paymentSheet.presentWithIntentConfiguration(intentConfiguration, configuration);
            return;
        }
        PaymentSheet.FlowController flowController = this.flowController;
        if (flowController == null) {
            promise.resolve(INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
        } else if (flowController != null) {
            flowController.presentPaymentOptions();
        }
    }

    public final void presentWithTimeout(long timeout, Promise promise) {
        Application application;
        Intrinsics.checkNotNullParameter(promise, "promise");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.reactnativestripesdk.PaymentSheetFragment$presentWithTimeout$activityLifecycleCallbacks$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                objectRef.element = activity;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Application application2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                ReactApplicationContext reactApplicationContext = null;
                objectRef.element = null;
                ReactApplicationContext reactApplicationContext2 = this.context;
                if (reactApplicationContext2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                } else {
                    reactApplicationContext = reactApplicationContext2;
                }
                Activity currentActivity = reactApplicationContext.getCurrentActivity();
                if (currentActivity == null || (application2 = currentActivity.getApplication()) == null) {
                    return;
                }
                application2.unregisterActivityLifecycleCallbacks(this);
            }
        };
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.reactnativestripesdk.PaymentSheetFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PaymentSheetFragment.presentWithTimeout$lambda$9(objectRef, this);
            }
        }, timeout);
        ReactApplicationContext reactApplicationContext = this.context;
        if (reactApplicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            reactApplicationContext = null;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity != null && (application = currentActivity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        present(promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void presentWithTimeout$lambda$9(Ref.ObjectRef objectRef, PaymentSheetFragment paymentSheetFragment) {
        Activity activity = (Activity) objectRef.element;
        if (activity != null) {
            activity.finish();
            paymentSheetFragment.paymentSheetTimedOut = true;
        }
    }

    public final void confirmPayment(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.confirmPromise = promise;
        PaymentSheet.FlowController flowController = this.flowController;
        if (flowController != null) {
            flowController.confirm();
        }
    }

    private final void configureFlowController() {
        PaymentSheet.FlowController.ConfigCallback configCallback = new PaymentSheet.FlowController.ConfigCallback() { // from class: com.reactnativestripesdk.PaymentSheetFragment$$ExternalSyntheticLambda3
            @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController.ConfigCallback
            public final void onConfigured(boolean z, Throwable th) {
                PaymentSheetFragment.configureFlowController$lambda$12(this.f$0, z, th);
            }
        };
        String str = this.paymentIntentClientSecret;
        Promise promise = null;
        PaymentSheet.Configuration configuration = null;
        PaymentSheet.Configuration configuration2 = null;
        PaymentSheet.Configuration configuration3 = null;
        if (str != null && str.length() != 0) {
            PaymentSheet.FlowController flowController = this.flowController;
            if (flowController != null) {
                String str2 = this.paymentIntentClientSecret;
                Intrinsics.checkNotNull(str2);
                PaymentSheet.Configuration configuration4 = this.paymentSheetConfiguration;
                if (configuration4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("paymentSheetConfiguration");
                } else {
                    configuration = configuration4;
                }
                flowController.configureWithPaymentIntent(str2, configuration, configCallback);
                return;
            }
            return;
        }
        String str3 = this.setupIntentClientSecret;
        if (str3 != null && str3.length() != 0) {
            PaymentSheet.FlowController flowController2 = this.flowController;
            if (flowController2 != null) {
                String str4 = this.setupIntentClientSecret;
                Intrinsics.checkNotNull(str4);
                PaymentSheet.Configuration configuration5 = this.paymentSheetConfiguration;
                if (configuration5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("paymentSheetConfiguration");
                } else {
                    configuration2 = configuration5;
                }
                flowController2.configureWithSetupIntent(str4, configuration2, configCallback);
                return;
            }
            return;
        }
        PaymentSheet.IntentConfiguration intentConfiguration = this.intentConfiguration;
        if (intentConfiguration != null) {
            PaymentSheet.FlowController flowController3 = this.flowController;
            if (flowController3 != null) {
                Intrinsics.checkNotNull(intentConfiguration);
                PaymentSheet.Configuration configuration6 = this.paymentSheetConfiguration;
                if (configuration6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("paymentSheetConfiguration");
                } else {
                    configuration3 = configuration6;
                }
                flowController3.configureWithIntentConfiguration(intentConfiguration, configuration3, configCallback);
                return;
            }
            return;
        }
        Promise promise2 = this.initPromise;
        if (promise2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("initPromise");
        } else {
            promise = promise2;
        }
        promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), "One of `paymentIntentClientSecret`, `setupIntentClientSecret`, or `intentConfiguration` is required"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void configureFlowController$lambda$12(PaymentSheetFragment paymentSheetFragment, boolean z, Throwable th) {
        WritableNativeMap writableNativeMap;
        PaymentOption paymentOption;
        PaymentSheet.FlowController flowController = paymentSheetFragment.flowController;
        Promise promise = null;
        if (flowController != null && (paymentOption = flowController.getPaymentOption()) != null) {
            ReactApplicationContext reactApplicationContext = paymentSheetFragment.context;
            if (reactApplicationContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                reactApplicationContext = null;
            }
            String base64FromBitmap = PaymentSheetFragmentKt.getBase64FromBitmap(PaymentSheetFragmentKt.getBitmapFromVectorDrawable(reactApplicationContext, paymentOption.getDrawableResourceId()));
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString("label", paymentOption.getLabel());
            writableNativeMap2.putString("image", base64FromBitmap);
            writableNativeMap = MappersKt.createResult("paymentOption", writableNativeMap2);
            if (writableNativeMap == null) {
            }
        } else {
            writableNativeMap = new WritableNativeMap();
        }
        Promise promise2 = paymentSheetFragment.initPromise;
        if (promise2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("initPromise");
        } else {
            promise = promise2;
        }
        promise.resolve(writableNativeMap);
    }

    private final void resolvePresentPromise(Object value) {
        KeepJsAwakeTask keepJsAwakeTask = this.keepJsAwake;
        if (keepJsAwakeTask != null) {
            keepJsAwakeTask.stop();
        }
        Promise promise = this.presentPromise;
        if (promise != null) {
            promise.resolve(value);
        }
    }

    private final void resolvePaymentResult(WritableMap map) {
        Promise promise = this.confirmPromise;
        if (promise == null) {
            resolvePresentPromise(map);
        } else {
            promise.resolve(map);
            this.confirmPromise = null;
        }
    }

    @Override // com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback
    public void onConfirmCustomPaymentMethod(PaymentSheet.CustomPaymentMethod customPaymentMethod, PaymentMethod.BillingDetails billingDetails) {
        Intrinsics.checkNotNullParameter(customPaymentMethod, "customPaymentMethod");
        Intrinsics.checkNotNullParameter(billingDetails, "billingDetails");
        ReactApplicationContext reactApplicationContext = null;
        try {
            ReactApplicationContext reactApplicationContext2 = this.context;
            if (reactApplicationContext2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                reactApplicationContext2 = null;
            }
            Intent intent = new Intent(reactApplicationContext2, (Class<?>) CustomPaymentMethodActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(65536);
            ReactApplicationContext reactApplicationContext3 = this.context;
            if (reactApplicationContext3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                reactApplicationContext3 = null;
            }
            reactApplicationContext3.startActivity(intent);
        } catch (Exception e) {
            Log.e("StripeReactNative", "Failed to start CustomPaymentMethodActivity", e);
        }
        try {
            ReactApplicationContext reactApplicationContext4 = this.context;
            if (reactApplicationContext4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                reactApplicationContext4 = null;
            }
            StripeSdkModule stripeSdkModule = (StripeSdkModule) reactApplicationContext4.getNativeModule(StripeSdkModule.class);
            if (stripeSdkModule == null) {
                throw new IllegalArgumentException("StripeSdkModule not found");
            }
            ReactApplicationContext reactApplicationContext5 = this.context;
            if (reactApplicationContext5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            } else {
                reactApplicationContext = reactApplicationContext5;
            }
            KeepJsAwakeTask keepJsAwakeTask = new KeepJsAwakeTask(reactApplicationContext);
            keepJsAwakeTask.start();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AnonymousClass1(stripeSdkModule, customPaymentMethod, billingDetails, keepJsAwakeTask, this, null), 3, null);
        } catch (IllegalArgumentException e2) {
            Log.e("StripeReactNative", "StripeSdkModule not found for CPM callback", e2);
            CustomPaymentMethodActivity.INSTANCE.finishCurrent();
        }
    }

    /* compiled from: PaymentSheetFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.reactnativestripesdk.PaymentSheetFragment$onConfirmCustomPaymentMethod$1", f = "PaymentSheetFragment.kt", i = {}, l = {479, 487}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.reactnativestripesdk.PaymentSheetFragment$onConfirmCustomPaymentMethod$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentMethod.BillingDetails $billingDetails;
        final /* synthetic */ PaymentSheet.CustomPaymentMethod $customPaymentMethod;
        final /* synthetic */ KeepJsAwakeTask $keepJsAwakeTask;
        final /* synthetic */ StripeSdkModule $stripeSdkModule;
        int label;
        final /* synthetic */ PaymentSheetFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StripeSdkModule stripeSdkModule, PaymentSheet.CustomPaymentMethod customPaymentMethod, PaymentMethod.BillingDetails billingDetails, KeepJsAwakeTask keepJsAwakeTask, PaymentSheetFragment paymentSheetFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$stripeSdkModule = stripeSdkModule;
            this.$customPaymentMethod = customPaymentMethod;
            this.$billingDetails = billingDetails;
            this.$keepJsAwakeTask = keepJsAwakeTask;
            this.this$0 = paymentSheetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$stripeSdkModule, this.$customPaymentMethod, this.$billingDetails, this.$keepJsAwakeTask, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r6 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CustomPaymentMethodResult customPaymentMethodResultFailed;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ReadableMap readableMap = (ReadableMap) obj;
                    this.$keepJsAwakeTask.stop();
                    String string = readableMap.getString("status");
                    if (string != null) {
                        int iHashCode = string.hashCode();
                        if (iHashCode != -1402931637) {
                            if (iHashCode != -1281977283) {
                                if (iHashCode == -123173735 && string.equals("canceled")) {
                                    customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.canceled();
                                } else {
                                    customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed("Unknown status");
                                }
                            } else if (string.equals("failed")) {
                                String string2 = readableMap.getString("error");
                                if (string2 == null) {
                                    string2 = "Custom payment failed";
                                }
                                customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed(string2);
                            } else {
                                customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed("Unknown status");
                            }
                        } else if (string.equals("completed")) {
                            customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.completed();
                        } else {
                            customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed("Unknown status");
                        }
                    } else {
                        customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed("Unknown status");
                    }
                    ReactApplicationContext reactApplicationContext = this.this$0.context;
                    if (reactApplicationContext == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        reactApplicationContext = null;
                    }
                    CustomPaymentMethodResultHandler.handleCustomPaymentMethodResult(reactApplicationContext, customPaymentMethodResultFailed);
                    CustomPaymentMethodActivity.INSTANCE.finishCurrent();
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.$stripeSdkModule.emitOnCustomPaymentMethodConfirmHandlerCallback(MappersKt.mapFromCustomPaymentMethod(this.$customPaymentMethod, this.$billingDetails));
                this.label = 2;
                obj = this.$stripeSdkModule.getCustomPaymentMethodResultCallback$stripe_stripe_react_native_release().await(this);
            } catch (Throwable th) {
                CustomPaymentMethodActivity.INSTANCE.finishCurrent();
                throw th;
            }
        }
    }

    /* compiled from: PaymentSheetFragment.kt */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\u0019J\u0017\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\u001cJ\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0019\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b#J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0002J\u0019\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/reactnativestripesdk/PaymentSheetFragment$Companion;", "", "<init>", "()V", "TAG", "", "create", "Lcom/reactnativestripesdk/PaymentSheetFragment;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "arguments", "Landroid/os/Bundle;", "initPromise", "Lcom/facebook/react/bridge/Promise;", "create$stripe_stripe_react_native_release", "mapIntToButtonType", "", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;", "createMissingInitError", "Lcom/facebook/react/bridge/WritableMap;", "createMissingInitError$stripe_stripe_react_native_release", "buildGooglePayConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", NativeProtocol.WEB_DIALOG_PARAMS, "buildGooglePayConfig$stripe_stripe_react_native_release", "buildLinkConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "buildLinkConfig$stripe_stripe_react_native_release", "mapStringToLinkDisplay", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;", "value", "buildIntentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "intentConfigurationParams", "buildIntentConfiguration$stripe_stripe_react_native_release", "buildIntentConfigurationMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "modeParams", "buildCustomerConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "bundle", "buildCustomerConfiguration$stripe_stripe_react_native_release", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentSheetFragment create$stripe_stripe_react_native_release(ReactApplicationContext context, Bundle arguments, Promise initPromise) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(initPromise, "initPromise");
            PaymentSheetFragment paymentSheetFragment = new PaymentSheetFragment();
            paymentSheetFragment.context = context;
            paymentSheetFragment.initPromise = initPromise;
            paymentSheetFragment.setArguments(arguments);
            return paymentSheetFragment;
        }

        public final WritableMap createMissingInitError$stripe_stripe_react_native_release() {
            return ErrorsKt.createError(PaymentSheetErrorType.Failed.toString(), "No payment sheet has been initialized yet. You must call `initPaymentSheet` before `presentPaymentSheet`.");
        }

        public final PaymentSheet.GooglePayConfiguration buildGooglePayConfig$stripe_stripe_react_native_release(Bundle params) {
            PaymentSheet.GooglePayConfiguration.Environment environment;
            if (params == null || params.isEmpty()) {
                return null;
            }
            String string = params.getString("merchantCountryCode");
            String str = string == null ? "" : string;
            String string2 = params.getString("currencyCode");
            String str2 = string2 == null ? "" : string2;
            boolean z = params.getBoolean("testEnv");
            String string3 = params.getString(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT);
            Long longOrNull = string3 != null ? StringsKt.toLongOrNull(string3) : null;
            String string4 = params.getString("label");
            PaymentSheet.GooglePayConfiguration.ButtonType buttonType = (PaymentSheet.GooglePayConfiguration.ButtonType) PaymentSheetFragment.mapIntToButtonType.get(Integer.valueOf(params.getInt("buttonType")));
            if (buttonType == null) {
                buttonType = PaymentSheet.GooglePayConfiguration.ButtonType.Pay;
            }
            PaymentSheet.GooglePayConfiguration.ButtonType buttonType2 = buttonType;
            if (z) {
                environment = PaymentSheet.GooglePayConfiguration.Environment.Test;
            } else {
                environment = PaymentSheet.GooglePayConfiguration.Environment.Production;
            }
            return new PaymentSheet.GooglePayConfiguration(environment, str, str2, longOrNull, string4, buttonType2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final PaymentSheet.LinkConfiguration buildLinkConfig$stripe_stripe_react_native_release(Bundle params) {
            if (params == null) {
                return new PaymentSheet.LinkConfiguration((PaymentSheet.LinkConfiguration.Display) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }
            return new PaymentSheet.LinkConfiguration(mapStringToLinkDisplay(params.getString("display")));
        }

        private final PaymentSheet.LinkConfiguration.Display mapStringToLinkDisplay(String value) {
            return Intrinsics.areEqual(value, AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC) ? PaymentSheet.LinkConfiguration.Display.Automatic : Intrinsics.areEqual(value, "never") ? PaymentSheet.LinkConfiguration.Display.Never : PaymentSheet.LinkConfiguration.Display.Automatic;
        }

        public final PaymentSheet.IntentConfiguration buildIntentConfiguration$stripe_stripe_react_native_release(Bundle intentConfigurationParams) throws PaymentSheetException {
            List listEmptyList;
            if (intentConfigurationParams == null) {
                return null;
            }
            Bundle bundle = intentConfigurationParams.getBundle("mode");
            if (bundle == null) {
                throw new PaymentSheetException("If `intentConfiguration` is provided, `intentConfiguration.mode` is required");
            }
            PaymentSheet.IntentConfiguration.Mode modeBuildIntentConfigurationMode = buildIntentConfigurationMode(bundle);
            ArrayList<String> stringArrayList = intentConfigurationParams.getStringArrayList("paymentMethodTypes");
            if (stringArrayList == null || (listEmptyList = CollectionsKt.toList(stringArrayList)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new PaymentSheet.IntentConfiguration(modeBuildIntentConfigurationMode, listEmptyList, null, null, false, 28, null);
        }

        private final PaymentSheet.IntentConfiguration.Mode buildIntentConfigurationMode(Bundle modeParams) throws PaymentSheetException {
            if (modeParams.containsKey(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT)) {
                String string = modeParams.getString("currencyCode");
                if (string == null) {
                    throw new PaymentSheetException("You must provide a value to intentConfiguration.mode.currencyCode");
                }
                return new PaymentSheet.IntentConfiguration.Mode.Payment(modeParams.getInt(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT), string, PaymentSheetFragmentKt.mapToSetupFutureUse(modeParams.getString("setupFutureUsage")), PaymentSheetFragmentKt.mapToCaptureMethod(modeParams.getString("captureMethod")), PaymentSheetFragmentKt.mapToPaymentMethodOptions(modeParams.getBundle("paymentMethodOptions")));
            }
            PaymentSheet.IntentConfiguration.SetupFutureUse setupFutureUseMapToSetupFutureUse = PaymentSheetFragmentKt.mapToSetupFutureUse(modeParams.getString("setupFutureUsage"));
            if (setupFutureUseMapToSetupFutureUse == null) {
                throw new PaymentSheetException("You must provide a value to intentConfiguration.mode.setupFutureUsage");
            }
            return new PaymentSheet.IntentConfiguration.Mode.Setup(modeParams.getString("currencyCode"), setupFutureUseMapToSetupFutureUse);
        }

        public final PaymentSheet.CustomerConfiguration buildCustomerConfiguration$stripe_stripe_react_native_release(Bundle bundle) throws PaymentSheetException {
            String string = bundle != null ? bundle.getString("customerId") : null;
            if (string == null) {
                string = "";
            }
            String string2 = bundle != null ? bundle.getString("customerEphemeralKeySecret") : null;
            if (string2 == null) {
                string2 = "";
            }
            String string3 = bundle != null ? bundle.getString("customerSessionClientSecret") : null;
            String str = string3 != null ? string3 : "";
            String str2 = str;
            if (str2.length() > 0 && string2.length() > 0) {
                throw new PaymentSheetException("`customerEphemeralKeySecret` and `customerSessionClientSecret` cannot both be set");
            }
            String str3 = string;
            if (str3.length() > 0 && str2.length() > 0) {
                return PaymentSheet.CustomerConfiguration.INSTANCE.createWithCustomerSession(string, str);
            }
            if (str3.length() <= 0 || string2.length() <= 0) {
                return null;
            }
            return new PaymentSheet.CustomerConfiguration(string, string2);
        }
    }
}
