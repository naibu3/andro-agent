package com.reactnativestripesdk.customersheet;

import android.app.Activity;
import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactnativestripesdk.PaymentSheetAppearanceKt;
import com.reactnativestripesdk.PaymentSheetFragmentKt;
import com.reactnativestripesdk.ReactNativeCustomerAdapter;
import com.reactnativestripesdk.customersheet.CustomerSheetFragment;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.KeepJsAwakeTask;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.PaymentSheetAppearanceException;
import com.reactnativestripesdk.utils.StripeFragment;
import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.customersheet.CustomerEphemeralKey;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetResult;
import com.stripe.android.customersheet.CustomerSheetResultCallback;
import com.stripe.android.customersheet.PaymentOptionSelection;
import com.stripe.android.customersheet.SetupIntentClientSecretProvider;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CustomerSheetFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001d\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0013¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\u0015\u0010&\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0013H\u0000¢\u0006\u0002\b'J\u0012\u0010(\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;", "Lcom/reactnativestripesdk/utils/StripeFragment;", "<init>", "()V", "customerSheet", "Lcom/stripe/android/customersheet/CustomerSheet;", "customerAdapter", "Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;", "getCustomerAdapter$stripe_stripe_react_native_release", "()Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;", "setCustomerAdapter$stripe_stripe_react_native_release", "(Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;)V", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getContext$stripe_stripe_react_native_release", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "setContext$stripe_stripe_react_native_release", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "initPromise", "Lcom/facebook/react/bridge/Promise;", "getInitPromise$stripe_stripe_react_native_release", "()Lcom/facebook/react/bridge/Promise;", "setInitPromise$stripe_stripe_react_native_release", "(Lcom/facebook/react/bridge/Promise;)V", "presentPromise", "keepJsAwake", "Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;", "prepare", "", "handleResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/customersheet/CustomerSheetResult;", "present", "timeout", "", BaseJavaModule.METHOD_TYPE_PROMISE, "(Ljava/lang/Long;Lcom/facebook/react/bridge/Promise;)V", "presentWithTimeout", "retrievePaymentOptionSelection", "retrievePaymentOptionSelection$stripe_stripe_react_native_release", "resolvePresentPromise", "value", "", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetFragment extends StripeFragment {
    public static final String TAG = "customer_sheet_launch_fragment";
    private ReactApplicationContext context;
    private ReactNativeCustomerAdapter customerAdapter;
    private CustomerSheet customerSheet;
    private Promise initPromise;
    private KeepJsAwakeTask keepJsAwake;
    private Promise presentPromise;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: getCustomerAdapter$stripe_stripe_react_native_release, reason: from getter */
    public final ReactNativeCustomerAdapter getCustomerAdapter() {
        return this.customerAdapter;
    }

    public final void setCustomerAdapter$stripe_stripe_react_native_release(ReactNativeCustomerAdapter reactNativeCustomerAdapter) {
        this.customerAdapter = reactNativeCustomerAdapter;
    }

    /* renamed from: getContext$stripe_stripe_react_native_release, reason: from getter */
    public final ReactApplicationContext getContext() {
        return this.context;
    }

    public final void setContext$stripe_stripe_react_native_release(ReactApplicationContext reactApplicationContext) {
        this.context = reactApplicationContext;
    }

    /* renamed from: getInitPromise$stripe_stripe_react_native_release, reason: from getter */
    public final Promise getInitPromise() {
        return this.initPromise;
    }

    public final void setInitPromise$stripe_stripe_react_native_release(Promise promise) {
        this.initPromise = promise;
    }

    @Override // com.reactnativestripesdk.utils.StripeFragment
    public void prepare() {
        ReactApplicationContext reactApplicationContext = this.context;
        if (reactApplicationContext == null) {
            Log.e("StripeReactNative", "No context found during CustomerSheet.initialize. Please file an issue: https://github.com/stripe/stripe-react-native/issues");
            return;
        }
        Promise promise = this.initPromise;
        if (promise == null) {
            Log.e("StripeReactNative", "No promise found for CustomerSheet.initialize. Please file an issue: https://github.com/stripe/stripe-react-native/issues");
            return;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("headerTextForSelectionScreen") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("merchantDisplayName") : null;
        Bundle arguments3 = getArguments();
        boolean z = arguments3 != null ? arguments3.getBoolean("googlePayEnabled") : false;
        Bundle arguments4 = getArguments();
        Bundle bundle = arguments4 != null ? arguments4.getBundle("defaultBillingDetails") : null;
        Bundle arguments5 = getArguments();
        Bundle bundle2 = arguments5 != null ? arguments5.getBundle("billingDetailsCollectionConfiguration") : null;
        Bundle arguments6 = getArguments();
        String string3 = arguments6 != null ? arguments6.getString("setupIntentClientSecret") : null;
        Bundle arguments7 = getArguments();
        String string4 = arguments7 != null ? arguments7.getString("customerId") : null;
        Bundle arguments8 = getArguments();
        String string5 = arguments8 != null ? arguments8.getString("customerEphemeralKeySecret") : null;
        Bundle arguments9 = getArguments();
        Bundle bundle3 = arguments9 != null ? arguments9.getBundle("customerAdapter") : null;
        Bundle arguments10 = getArguments();
        boolean z2 = arguments10 != null ? arguments10.getBoolean("allowsRemovalOfLastSavedPaymentMethod", true) : true;
        Bundle arguments11 = getArguments();
        ArrayList<String> stringArrayList = arguments11 != null ? arguments11.getStringArrayList("paymentMethodOrder") : null;
        if (string4 == null) {
            promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), "You must provide a value for `customerId`"));
            return;
        }
        if (string5 == null) {
            promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), "You must provide a value for `customerEphemeralKeySecret`"));
            return;
        }
        try {
            Bundle arguments12 = getArguments();
            PaymentSheet.Appearance appearanceBuildPaymentSheetAppearance = PaymentSheetAppearanceKt.buildPaymentSheetAppearance(arguments12 != null ? arguments12.getBundle("appearance") : null, reactApplicationContext);
            CustomerSheet.Configuration.Companion companion = CustomerSheet.Configuration.INSTANCE;
            if (string2 == null) {
                string2 = "";
            }
            CustomerSheet.Configuration.Builder builderHeaderTextForSelectionScreen = companion.builder(string2).appearance(appearanceBuildPaymentSheetAppearance).googlePayEnabled(z).headerTextForSelectionScreen(string);
            Bundle arguments13 = getArguments();
            CustomerSheet.Configuration.Builder builderCardBrandAcceptance = builderHeaderTextForSelectionScreen.preferredNetworks(MappersKt.mapToPreferredNetworks(arguments13 != null ? arguments13.getIntegerArrayList("preferredNetworks") : null)).allowsRemovalOfLastSavedPaymentMethod(z2).cardBrandAcceptance(PaymentSheetFragmentKt.mapToCardBrandAcceptance(getArguments()));
            if (stringArrayList != null) {
                builderCardBrandAcceptance.paymentMethodOrder(stringArrayList);
            }
            if (bundle != null) {
                builderCardBrandAcceptance.defaultBillingDetails(INSTANCE.createDefaultBillingDetails$stripe_stripe_react_native_release(bundle));
            }
            if (bundle2 != null) {
                builderCardBrandAcceptance.billingDetailsCollectionConfiguration(INSTANCE.createBillingDetailsCollectionConfiguration$stripe_stripe_react_native_release(bundle2));
            }
            ReactNativeCustomerAdapter reactNativeCustomerAdapterCreateCustomerAdapter$stripe_stripe_react_native_release = INSTANCE.createCustomerAdapter$stripe_stripe_react_native_release(reactApplicationContext, string4, string5, string3, bundle3);
            this.customerAdapter = reactNativeCustomerAdapterCreateCustomerAdapter$stripe_stripe_react_native_release;
            CustomerSheet customerSheetCreate = CustomerSheet.INSTANCE.create(this, reactNativeCustomerAdapterCreateCustomerAdapter$stripe_stripe_react_native_release, new AnonymousClass4());
            this.customerSheet = customerSheetCreate;
            if (customerSheetCreate != null) {
                customerSheetCreate.configure(builderCardBrandAcceptance.build());
            }
            promise.resolve(new WritableNativeMap());
        } catch (PaymentSheetAppearanceException e) {
            promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), (Exception) e));
        }
    }

    /* compiled from: CustomerSheetFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.reactnativestripesdk.customersheet.CustomerSheetFragment$prepare$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 implements CustomerSheetResultCallback, FunctionAdapter {
        AnonymousClass4() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof CustomerSheetResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CustomerSheetFragment.this, CustomerSheetFragment.class, "handleResult", "handleResult(Lcom/stripe/android/customersheet/CustomerSheetResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.customersheet.CustomerSheetResultCallback
        public final void onCustomerSheetResult(CustomerSheetResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            CustomerSheetFragment.this.handleResult(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(CustomerSheetResult result) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        if (result instanceof CustomerSheetResult.Failed) {
            resolvePresentPromise(ErrorsKt.createError(ErrorType.Failed.toString(), ((CustomerSheetResult.Failed) result).getException()));
        } else if (result instanceof CustomerSheetResult.Selected) {
            writableMapCreateMap = INSTANCE.createPaymentOptionResult$stripe_stripe_react_native_release(((CustomerSheetResult.Selected) result).getSelection());
        } else {
            if (!(result instanceof CustomerSheetResult.Canceled)) {
                throw new NoWhenBranchMatchedException();
            }
            writableMapCreateMap = INSTANCE.createPaymentOptionResult$stripe_stripe_react_native_release(((CustomerSheetResult.Canceled) result).getSelection());
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("code", ErrorType.Canceled.toString());
            Unit unit = Unit.INSTANCE;
            writableMapCreateMap.putMap("error", writableMapCreateMap2);
        }
        resolvePresentPromise(writableMapCreateMap);
    }

    public final void present(Long timeout, Promise promise) {
        KeepJsAwakeTask keepJsAwakeTask;
        Intrinsics.checkNotNullParameter(promise, "promise");
        ReactApplicationContext reactApplicationContext = this.context;
        if (reactApplicationContext != null) {
            keepJsAwakeTask = new KeepJsAwakeTask(reactApplicationContext);
            keepJsAwakeTask.start();
        } else {
            keepJsAwakeTask = null;
        }
        this.keepJsAwake = keepJsAwakeTask;
        this.presentPromise = promise;
        if (timeout != null) {
            presentWithTimeout(timeout.longValue());
        }
        CustomerSheet customerSheet = this.customerSheet;
        if (customerSheet != null) {
            customerSheet.present();
        } else {
            resolvePresentPromise(INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.List] */
    private final void presentWithTimeout(long timeout) {
        Activity currentActivity;
        Application application;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.reactnativestripesdk.customersheet.CustomerSheetFragment$presentWithTimeout$activityLifecycleCallbacks$1
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

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                objectRef.element.add(activity);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.List] */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Activity currentActivity2;
                Application application2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                objectRef.element = new ArrayList();
                ReactApplicationContext context = this.getContext();
                if (context == null || (currentActivity2 = context.getCurrentActivity()) == null || (application2 = currentActivity2.getApplication()) == null) {
                    return;
                }
                application2.unregisterActivityLifecycleCallbacks(this);
            }
        };
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.reactnativestripesdk.customersheet.CustomerSheetFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CustomerSheetFragment.presentWithTimeout$lambda$10(objectRef);
            }
        }, timeout);
        ReactApplicationContext reactApplicationContext = this.context;
        if (reactApplicationContext != null && (currentActivity = reactApplicationContext.getCurrentActivity()) != null && (application = currentActivity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        CustomerSheet customerSheet = this.customerSheet;
        if (customerSheet != null) {
            customerSheet.present();
        } else {
            resolvePresentPromise(INSTANCE.createMissingInitError$stripe_stripe_react_native_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentWithTimeout$lambda$10(Ref.ObjectRef objectRef) {
        Iterator it = ((List) objectRef.element).iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).finish();
        }
    }

    public final void retrievePaymentOptionSelection$stripe_stripe_react_native_release(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CustomerSheetFragment$retrievePaymentOptionSelection$1(this, promise, null), 3, null);
    }

    private final void resolvePresentPromise(Object value) {
        Promise promise = this.presentPromise;
        if (promise == null) {
            Log.e("StripeReactNative", "No promise found for CustomerSheet.present");
            return;
        }
        KeepJsAwakeTask keepJsAwakeTask = this.keepJsAwake;
        if (keepJsAwakeTask != null) {
            keepJsAwakeTask.stop();
        }
        this.keepJsAwake = null;
        promise.resolve(value);
    }

    /* compiled from: CustomerSheetFragment.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0010J9\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0002\b\u001dJ\"\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;", "", "<init>", "()V", "TAG", "", "createMissingInitError", "Lcom/facebook/react/bridge/WritableMap;", "createMissingInitError$stripe_stripe_react_native_release", "createDefaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "bundle", "Landroid/os/Bundle;", "createDefaultBillingDetails$stripe_stripe_react_native_release", "createBillingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "createBillingDetailsCollectionConfiguration$stripe_stripe_react_native_release", "createCustomerAdapter", "Lcom/reactnativestripesdk/ReactNativeCustomerAdapter;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "customerId", "customerEphemeralKeySecret", "setupIntentClientSecret", "customerAdapterOverrideParams", "createCustomerAdapter$stripe_stripe_react_native_release", "createPaymentOptionResult", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/customersheet/PaymentOptionSelection;", "createPaymentOptionResult$stripe_stripe_react_native_release", "buildResult", "label", "drawable", "Landroid/graphics/drawable/Drawable;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WritableMap createMissingInitError$stripe_stripe_react_native_release() {
            return ErrorsKt.createError(ErrorType.Failed.toString(), "No customer sheet has been initialized yet.");
        }

        public final PaymentSheet.BillingDetails createDefaultBillingDetails$stripe_stripe_react_native_release(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Bundle bundle2 = bundle.getBundle("address");
            return new PaymentSheet.BillingDetails(new PaymentSheet.Address(bundle2 != null ? bundle2.getString("city") : null, bundle2 != null ? bundle2.getString("country") : null, bundle2 != null ? bundle2.getString("line1") : null, bundle2 != null ? bundle2.getString("line2") : null, bundle2 != null ? bundle2.getString(HintConstants.AUTOFILL_HINT_POSTAL_CODE) : null, bundle2 != null ? bundle2.getString(ServerProtocol.DIALOG_PARAM_STATE) : null), bundle.getString("email"), bundle.getString("name"), bundle.getString("phone"));
        }

        public final PaymentSheet.BillingDetailsCollectionConfiguration createBillingDetailsCollectionConfiguration$stripe_stripe_react_native_release(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new PaymentSheet.BillingDetailsCollectionConfiguration(PaymentSheetFragmentKt.mapToCollectionMode(bundle.getString("name")), PaymentSheetFragmentKt.mapToCollectionMode(bundle.getString("phone")), PaymentSheetFragmentKt.mapToCollectionMode(bundle.getString("email")), PaymentSheetFragmentKt.mapToAddressCollectionMode(bundle.getString("address")), bundle.getBoolean("attachDefaultsToPaymentMethod", false));
        }

        public final ReactNativeCustomerAdapter createCustomerAdapter$stripe_stripe_react_native_release(ReactApplicationContext context, final String customerId, final String customerEphemeralKeySecret, final String setupIntentClientSecret, Bundle customerAdapterOverrideParams) {
            CustomerAdapter customerAdapterCreate$default;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            Intrinsics.checkNotNullParameter(customerEphemeralKeySecret, "customerEphemeralKeySecret");
            Function0 function0 = new Function0() { // from class: com.reactnativestripesdk.customersheet.CustomerSheetFragment$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheetFragment.Companion.createCustomerAdapter$lambda$0(customerId, customerEphemeralKeySecret);
                }
            };
            if (setupIntentClientSecret != null) {
                customerAdapterCreate$default = CustomerAdapter.Companion.create$default(CustomerAdapter.INSTANCE, context, new CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$1(function0), new SetupIntentClientSecretProvider() { // from class: com.reactnativestripesdk.customersheet.CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$2
                    @Override // com.stripe.android.customersheet.SetupIntentClientSecretProvider
                    public final Object provideSetupIntentClientSecret(String str, Continuation<? super CustomerAdapter.Result<String>> continuation) {
                        return CustomerAdapter.Result.INSTANCE.success(setupIntentClientSecret);
                    }
                }, null, 8, null);
            } else {
                customerAdapterCreate$default = CustomerAdapter.Companion.create$default(CustomerAdapter.INSTANCE, context, new CustomerSheetFragment$Companion$createCustomerAdapter$customerAdapter$3(function0), null, null, 8, null);
            }
            return new ReactNativeCustomerAdapter(context, customerAdapterCreate$default, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("fetchPaymentMethods") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("attachPaymentMethod") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("detachPaymentMethod") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("setSelectedPaymentOption") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("fetchSelectedPaymentOption") : false, customerAdapterOverrideParams != null ? customerAdapterOverrideParams.getBoolean("setupIntentClientSecretForCustomerAttach") : false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CustomerAdapter.Result createCustomerAdapter$lambda$0(String str, String str2) {
            return CustomerAdapter.Result.INSTANCE.success(CustomerEphemeralKey.INSTANCE.create(str, str2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object createCustomerAdapter$suspendConversion0(Function0 function0, Continuation continuation) {
            return function0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object createCustomerAdapter$suspendConversion1(Function0 function0, Continuation continuation) {
            return function0.invoke();
        }

        public final WritableMap createPaymentOptionResult$stripe_stripe_react_native_release(PaymentOptionSelection selection) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            if (selection instanceof PaymentOptionSelection.GooglePay) {
                PaymentOptionSelection.GooglePay googlePay = (PaymentOptionSelection.GooglePay) selection;
                return buildResult(googlePay.getPaymentOption().getLabel(), googlePay.getPaymentOption().icon(), null);
            }
            if (selection instanceof PaymentOptionSelection.PaymentMethod) {
                PaymentOptionSelection.PaymentMethod paymentMethod = (PaymentOptionSelection.PaymentMethod) selection;
                return buildResult(paymentMethod.getPaymentOption().getLabel(), paymentMethod.getPaymentOption().icon(), paymentMethod.getPaymentMethod());
            }
            if (selection == null) {
                return writableMapCreateMap;
            }
            throw new NoWhenBranchMatchedException();
        }

        private final WritableMap buildResult(String label, Drawable drawable, PaymentMethod paymentMethod) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putString("label", label);
            writableMapCreateMap2.putString("image", PaymentSheetFragmentKt.getBase64FromBitmap(PaymentSheetFragmentKt.getBitmapFromDrawable(drawable)));
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "also(...)");
            writableMapCreateMap.putMap("paymentOption", writableMapCreateMap2);
            if (paymentMethod != null) {
                writableMapCreateMap.putMap("paymentMethod", MappersKt.mapFromPaymentMethod(paymentMethod));
            }
            return writableMapCreateMap;
        }
    }
}
