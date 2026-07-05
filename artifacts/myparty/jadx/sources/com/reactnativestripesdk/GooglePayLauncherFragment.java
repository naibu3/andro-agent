package com.reactnativestripesdk;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.NativeProtocol;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.reactnativestripesdk.utils.GooglePayErrorType;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.StripeFragment;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayLauncherFragment.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u0019H\u0016JS\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2+\u0010\u0011\u001a'\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0012J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000RB\u0010\u0011\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/reactnativestripesdk/GooglePayLauncherFragment;", "Lcom/reactnativestripesdk/utils/StripeFragment;", "<init>", "()V", "launcher", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher;", "clientSecret", "", "mode", "Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;", "configuration", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Config;", "currencyCode", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "Ljava/lang/Integer;", "label", "callback", "Lkotlin/Function2;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "Lkotlin/ParameterName;", "name", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/facebook/react/bridge/WritableMap;", "error", "", "prepare", "presentGooglePaySheet", "googlePayParams", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "attemptToCleanupPreviousFragment", "currentActivity", "Landroidx/fragment/app/FragmentActivity;", "commitFragmentAndStartFlow", "onGooglePayReady", "isReady", "", "onGooglePayResult", "Mode", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayLauncherFragment extends StripeFragment {
    public static final String TAG = "google_pay_launcher_fragment";
    private Integer amount;
    private Function2<? super GooglePayLauncher.Result, ? super WritableMap, Unit> callback;
    private String clientSecret;
    private GooglePayLauncher.Config configuration;
    private String currencyCode;
    private String label;
    private GooglePayLauncher launcher;
    private Mode mode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GooglePayLauncherFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.ForSetup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.ForPayment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GooglePayLauncherFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativestripesdk/GooglePayLauncherFragment$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "ForSetup", "ForPayment", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ForSetup = new Mode("ForSetup", 0);
        public static final Mode ForPayment = new Mode("ForPayment", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{ForSetup, ForPayment};
        }

        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        private Mode(String str, int i) {
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(modeArr$values);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    @Override // com.reactnativestripesdk.utils.StripeFragment
    public void prepare() {
        GooglePayLauncherFragment googlePayLauncherFragment = this;
        GooglePayLauncher.Config config = this.configuration;
        if (config == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configuration");
            config = null;
        }
        this.launcher = new GooglePayLauncher(googlePayLauncherFragment, config, new AnonymousClass1(), new AnonymousClass2());
    }

    /* compiled from: GooglePayLauncherFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.reactnativestripesdk.GooglePayLauncherFragment$prepare$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 implements GooglePayLauncher.ReadyCallback, FunctionAdapter {
        AnonymousClass1() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GooglePayLauncher.ReadyCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, GooglePayLauncherFragment.this, GooglePayLauncherFragment.class, "onGooglePayReady", "onGooglePayReady(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncher.ReadyCallback
        public final void onReady(boolean z) {
            GooglePayLauncherFragment.this.onGooglePayReady(z);
        }
    }

    /* compiled from: GooglePayLauncherFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.reactnativestripesdk.GooglePayLauncherFragment$prepare$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 implements GooglePayLauncher.ResultCallback, FunctionAdapter {
        AnonymousClass2() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GooglePayLauncher.ResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, GooglePayLauncherFragment.this, GooglePayLauncherFragment.class, "onGooglePayResult", "onGooglePayResult(Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncher.ResultCallback
        public final void onResult(GooglePayLauncher.Result p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            GooglePayLauncherFragment.this.onGooglePayResult(p0);
        }
    }

    public final void presentGooglePaySheet(String clientSecret, Mode mode, ReadableMap googlePayParams, ReactApplicationContext context, Function2<? super GooglePayLauncher.Result, ? super WritableMap, Unit> callback) {
        GooglePayEnvironment googlePayEnvironment;
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(googlePayParams, "googlePayParams");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.clientSecret = clientSecret;
        this.mode = mode;
        this.callback = callback;
        String string = googlePayParams.getString("currencyCode");
        if (string == null) {
            string = "USD";
        }
        this.currencyCode = string;
        this.amount = MappersKt.getIntOrNull(googlePayParams, CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT);
        this.label = googlePayParams.getString("label");
        if (googlePayParams.getBoolean("testEnv")) {
            googlePayEnvironment = GooglePayEnvironment.Test;
        } else {
            googlePayEnvironment = GooglePayEnvironment.Production;
        }
        GooglePayEnvironment googlePayEnvironment2 = googlePayEnvironment;
        String string2 = googlePayParams.getString("merchantCountryCode");
        String str = string2 == null ? "" : string2;
        String string3 = googlePayParams.getString("merchantName");
        this.configuration = new GooglePayLauncher.Config(googlePayEnvironment2, str, string3 == null ? "" : string3, ExtensionsKt.getBooleanOr(googlePayParams, "isEmailRequired", false), INSTANCE.buildBillingAddressParameters(googlePayParams.getMap("billingAddressConfig")), ExtensionsKt.getBooleanOr(googlePayParams, "existingPaymentMethodRequired", false), ExtensionsKt.getBooleanOr(googlePayParams, "allowCreditCards", true));
        Activity currentActivity = context.getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity != null) {
            attemptToCleanupPreviousFragment(fragmentActivity);
            commitFragmentAndStartFlow(fragmentActivity);
        } else {
            callback.invoke(null, ErrorsKt.createMissingActivityError());
        }
    }

    private final void attemptToCleanupPreviousFragment(FragmentActivity currentActivity) {
        currentActivity.getSupportFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    private final void commitFragmentAndStartFlow(FragmentActivity currentActivity) {
        try {
            currentActivity.getSupportFragmentManager().beginTransaction().add(this, TAG).commit();
        } catch (IllegalStateException e) {
            Function2<? super GooglePayLauncher.Result, ? super WritableMap, Unit> function2 = this.callback;
            if (function2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callback");
                function2 = null;
            }
            function2.invoke(null, ErrorsKt.createError(ErrorType.Failed.toString(), e.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGooglePayReady(boolean isReady) {
        String str = null;
        if (isReady) {
            Mode mode = this.mode;
            if (mode == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mode");
                mode = null;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                GooglePayLauncher googlePayLauncher = this.launcher;
                if (googlePayLauncher == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("launcher");
                    googlePayLauncher = null;
                }
                String str2 = this.clientSecret;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("clientSecret");
                } else {
                    str = str2;
                }
                googlePayLauncher.presentForPaymentIntent(str, this.label);
                return;
            }
            GooglePayLauncher googlePayLauncher2 = this.launcher;
            if (googlePayLauncher2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("launcher");
                googlePayLauncher2 = null;
            }
            String str3 = this.clientSecret;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientSecret");
                str3 = null;
            }
            String str4 = this.currencyCode;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currencyCode");
                str4 = null;
            }
            googlePayLauncher2.presentForSetupIntent(str3, str4, this.amount != null ? Long.valueOf(r3.intValue()) : null, this.label);
            return;
        }
        Function2<? super GooglePayLauncher.Result, ? super WritableMap, Unit> function2 = this.callback;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function2 = null;
        }
        function2.invoke(null, ErrorsKt.createError(GooglePayErrorType.Failed.toString(), "Google Pay is not available on this device. You can use isPlatformPaySupported to preemptively check for Google Pay support."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGooglePayResult(GooglePayLauncher.Result result) {
        Function2<? super GooglePayLauncher.Result, ? super WritableMap, Unit> function2 = this.callback;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            function2 = null;
        }
        function2.invoke(result, null);
    }

    /* compiled from: GooglePayLauncherFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/reactnativestripesdk/GooglePayLauncherFragment$Companion;", "", "<init>", "()V", "TAG", "", "buildBillingAddressParameters", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$BillingAddressConfig;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GooglePayLauncher.BillingAddressConfig buildBillingAddressParameters(ReadableMap params) {
            GooglePayLauncher.BillingAddressConfig.Format format;
            Boolean boolValueOf = params != null ? Boolean.valueOf(ExtensionsKt.getBooleanOr(params, "isRequired", false)) : null;
            Boolean boolValueOf2 = params != null ? Boolean.valueOf(ExtensionsKt.getBooleanOr(params, "isPhoneNumberRequired", false)) : null;
            String string = params != null ? params.getString("format") : null;
            if (string == null) {
                string = "";
            }
            if (Intrinsics.areEqual(string, "FULL")) {
                format = GooglePayLauncher.BillingAddressConfig.Format.Full;
            } else {
                format = Intrinsics.areEqual(string, "MIN") ? GooglePayLauncher.BillingAddressConfig.Format.Min : GooglePayLauncher.BillingAddressConfig.Format.Min;
            }
            return new GooglePayLauncher.BillingAddressConfig(boolValueOf != null ? boolValueOf.booleanValue() : false, format, boolValueOf2 != null ? boolValueOf2.booleanValue() : false);
        }
    }
}
