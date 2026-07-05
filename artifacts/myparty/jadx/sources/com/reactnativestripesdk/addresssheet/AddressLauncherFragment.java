package com.reactnativestripesdk.addresssheet;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.StripeFragment;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressLauncherFragment.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J \u0001\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#2:\u0010\b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tJ\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000RD\u0010\b\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/AddressLauncherFragment;", "Lcom/reactnativestripesdk/utils/StripeFragment;", "<init>", "()V", "addressLauncher", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;", "configuration", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "callback", "Lkotlin/Function2;", "Lcom/facebook/react/bridge/WritableMap;", "Lkotlin/ParameterName;", "name", "error", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "address", "", "prepare", "onAddressLauncherResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "presentAddressSheet", "context", "Lcom/facebook/react/bridge/ReactContext;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "defaultAddress", "allowedCountries", "", "", "buttonTitle", "title", "googlePlacesApiKey", "autocompleteCountries", "additionalFields", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration;", "attemptToCleanupPreviousFragment", "currentActivity", "Landroidx/fragment/app/FragmentActivity;", "commitFragmentAndStartFlow", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressLauncherFragment extends StripeFragment {
    public static final String TAG = "address_launcher_fragment";
    private static String publishableKey;
    private AddressLauncher addressLauncher;
    private Function2<? super WritableMap, ? super AddressDetails, Unit> callback;
    private AddressLauncher.Configuration configuration = new AddressLauncher.Configuration(null, null, null, null, null, null, null, null, 255, null);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AddressLauncherFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/AddressLauncherFragment$Companion;", "", "<init>", "()V", "publishableKey", "", "getPublishableKey$stripe_stripe_react_native_release", "()Ljava/lang/String;", "setPublishableKey$stripe_stripe_react_native_release", "(Ljava/lang/String;)V", "TAG", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getPublishableKey$stripe_stripe_react_native_release() {
            return AddressLauncherFragment.publishableKey;
        }

        public final void setPublishableKey$stripe_stripe_react_native_release(String str) {
            AddressLauncherFragment.publishableKey = str;
        }
    }

    @Override // com.reactnativestripesdk.utils.StripeFragment
    public void prepare() {
        String str = publishableKey;
        if (str != null) {
            AddressLauncher addressLauncher = new AddressLauncher(this, new AddressLauncherFragment$prepare$1$1(this));
            addressLauncher.present(str, this.configuration);
            this.addressLauncher = addressLauncher;
        } else {
            Function2<? super WritableMap, ? super AddressDetails, Unit> function2 = this.callback;
            if (function2 != null) {
                function2.invoke(ErrorsKt.createError(ErrorType.Failed.toString(), "No publishable key set. Stripe has not been initialized. Initialize Stripe in your app with the StripeProvider component or the initStripe method."), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddressLauncherResult(AddressLauncherResult result) {
        if (result instanceof AddressLauncherResult.Canceled) {
            Function2<? super WritableMap, ? super AddressDetails, Unit> function2 = this.callback;
            if (function2 != null) {
                function2.invoke(ErrorsKt.createError(ErrorType.Canceled.toString(), "The flow has been canceled."), null);
                return;
            }
            return;
        }
        if (!(result instanceof AddressLauncherResult.Succeeded)) {
            throw new NoWhenBranchMatchedException();
        }
        Function2<? super WritableMap, ? super AddressDetails, Unit> function22 = this.callback;
        if (function22 != null) {
            function22.invoke(null, ((AddressLauncherResult.Succeeded) result).getAddress());
        }
    }

    public final void presentAddressSheet(ReactContext context, PaymentSheet.Appearance appearance, AddressDetails defaultAddress, Set<String> allowedCountries, String buttonTitle, String title, String googlePlacesApiKey, Set<String> autocompleteCountries, AddressLauncher.AdditionalFieldsConfiguration additionalFields, Function2<? super WritableMap, ? super AddressDetails, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(allowedCountries, "allowedCountries");
        Intrinsics.checkNotNullParameter(autocompleteCountries, "autocompleteCountries");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.configuration = new AddressLauncher.Configuration(appearance, defaultAddress, allowedCountries, buttonTitle, additionalFields, title, googlePlacesApiKey, autocompleteCountries);
        this.callback = callback;
        Activity currentActivity = context.getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity != null) {
            attemptToCleanupPreviousFragment(fragmentActivity);
            commitFragmentAndStartFlow(fragmentActivity);
        }
    }

    private final void attemptToCleanupPreviousFragment(FragmentActivity currentActivity) {
        currentActivity.getSupportFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    private final void commitFragmentAndStartFlow(FragmentActivity currentActivity) {
        try {
            currentActivity.getSupportFragmentManager().beginTransaction().add(this, TAG).commit();
        } catch (IllegalStateException unused) {
        }
    }
}
