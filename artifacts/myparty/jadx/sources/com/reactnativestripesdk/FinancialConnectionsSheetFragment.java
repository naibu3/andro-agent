package com.reactnativestripesdk;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.StripeFragment;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultForTokenCallback;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventListener;
import com.stripe.android.financialconnections.model.Balance;
import com.stripe.android.financialconnections.model.BalanceRefresh;
import com.stripe.android.financialconnections.model.CashBalance;
import com.stripe.android.financialconnections.model.CreditBalance;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.parsers.TokenJsonParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: FinancialConnectionsSheetFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0013H\u0002J8\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment;", "Lcom/reactnativestripesdk/utils/StripeFragment;", "<init>", "()V", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "mode", "Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;", "prepare", "", "onDestroy", "onFinancialConnectionsSheetForTokenResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;", "onFinancialConnectionsSheetForDataResult", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "presentFinancialConnectionsSheet", "clientSecret", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "attemptToCleanupPreviousFragment", "currentActivity", "Landroidx/fragment/app/FragmentActivity;", "commitFragmentAndStartFlow", "Mode", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetFragment extends StripeFragment {
    public static final String TAG = "financial_connections_sheet_launch_fragment";
    private FinancialConnectionsSheet.Configuration configuration;
    private ReactApplicationContext context;
    private Mode mode;
    private Promise promise;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FinancialConnectionsSheetFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.ForToken.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.ForSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsSheetFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "ForToken", "ForSession", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ForToken = new Mode("ForToken", 0);
        public static final Mode ForSession = new Mode("ForSession", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{ForToken, ForSession};
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
        ReactApplicationContext reactApplicationContext = this.context;
        FinancialConnectionsSheet.Configuration configuration = null;
        if (reactApplicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            reactApplicationContext = null;
        }
        final StripeSdkModule stripeSdkModule = (StripeSdkModule) reactApplicationContext.getNativeModule(StripeSdkModule.class);
        FinancialConnections.setEventListener(new FinancialConnectionsEventListener() { // from class: com.reactnativestripesdk.FinancialConnectionsSheetFragment$$ExternalSyntheticLambda0
            @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsEventListener
            public final void onEvent(FinancialConnectionsEvent financialConnectionsEvent) {
                FinancialConnectionsSheetFragment.prepare$lambda$0(stripeSdkModule, financialConnectionsEvent);
            }
        });
        Mode mode = this.mode;
        if (mode == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mode");
            mode = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            FinancialConnectionsSheet financialConnectionsSheetCreateForBankAccountToken = FinancialConnectionsSheet.INSTANCE.createForBankAccountToken(this, new AnonymousClass2());
            FinancialConnectionsSheet.Configuration configuration2 = this.configuration;
            if (configuration2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("configuration");
            } else {
                configuration = configuration2;
            }
            financialConnectionsSheetCreateForBankAccountToken.present(configuration);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        FinancialConnectionsSheet financialConnectionsSheetCreate = FinancialConnectionsSheet.INSTANCE.create(this, new AnonymousClass3());
        FinancialConnectionsSheet.Configuration configuration3 = this.configuration;
        if (configuration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configuration");
        } else {
            configuration = configuration3;
        }
        financialConnectionsSheetCreate.present(configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepare$lambda$0(StripeSdkModule stripeSdkModule, FinancialConnectionsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        WritableMap writableMapMapFromFinancialConnectionsEvent = MappersKt.mapFromFinancialConnectionsEvent(event);
        if (stripeSdkModule != null) {
            stripeSdkModule.emitOnFinancialConnectionsEvent(writableMapMapFromFinancialConnectionsEvent);
        }
    }

    /* compiled from: FinancialConnectionsSheetFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.reactnativestripesdk.FinancialConnectionsSheetFragment$prepare$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 implements FinancialConnectionsSheetResultForTokenCallback, FunctionAdapter {
        AnonymousClass2() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FinancialConnectionsSheetResultForTokenCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, FinancialConnectionsSheetFragment.this, FinancialConnectionsSheetFragment.class, "onFinancialConnectionsSheetForTokenResult", "onFinancialConnectionsSheetForTokenResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.financialconnections.FinancialConnectionsSheetResultForTokenCallback
        public final void onFinancialConnectionsSheetResult(FinancialConnectionsSheetForTokenResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            FinancialConnectionsSheetFragment.this.onFinancialConnectionsSheetForTokenResult(p0);
        }
    }

    /* compiled from: FinancialConnectionsSheetFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.reactnativestripesdk.FinancialConnectionsSheetFragment$prepare$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 implements FinancialConnectionsSheetResultCallback, FunctionAdapter {
        AnonymousClass3() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FinancialConnectionsSheetResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, FinancialConnectionsSheetFragment.this, FinancialConnectionsSheetFragment.class, "onFinancialConnectionsSheetForDataResult", "onFinancialConnectionsSheetForDataResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback
        public final void onFinancialConnectionsSheetResult(FinancialConnectionsSheetResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            FinancialConnectionsSheetFragment.this.onFinancialConnectionsSheetForDataResult(p0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        FinancialConnections.clearEventListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinancialConnectionsSheetForTokenResult(FinancialConnectionsSheetForTokenResult result) {
        FragmentManager supportFragmentManager;
        FragmentTransaction fragmentTransactionBeginTransaction;
        FragmentTransaction fragmentTransactionRemove;
        Promise promise = null;
        Promise promise2 = null;
        if (result instanceof FinancialConnectionsSheetForTokenResult.Canceled) {
            Promise promise3 = this.promise;
            if (promise3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
            } else {
                promise = promise3;
            }
            promise.resolve(ErrorsKt.createError(ErrorType.Canceled.toString(), "The flow has been canceled"));
            return;
        }
        if (result instanceof FinancialConnectionsSheetForTokenResult.Failed) {
            Promise promise4 = this.promise;
            if (promise4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
            } else {
                promise2 = promise4;
            }
            promise2.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), ((FinancialConnectionsSheetForTokenResult.Failed) result).getError()));
            return;
        }
        if (!(result instanceof FinancialConnectionsSheetForTokenResult.Completed)) {
            throw new NoWhenBranchMatchedException();
        }
        Promise promise5 = this.promise;
        if (promise5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
            promise5 = null;
        }
        promise5.resolve(INSTANCE.createTokenResult((FinancialConnectionsSheetForTokenResult.Completed) result));
        ReactApplicationContext reactApplicationContext = this.context;
        if (reactApplicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            reactApplicationContext = null;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null || (fragmentTransactionRemove = fragmentTransactionBeginTransaction.remove(this)) == null) {
            return;
        }
        fragmentTransactionRemove.commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinancialConnectionsSheetForDataResult(FinancialConnectionsSheetResult result) {
        FragmentManager supportFragmentManager;
        FragmentTransaction fragmentTransactionBeginTransaction;
        FragmentTransaction fragmentTransactionRemove;
        Promise promise = null;
        Promise promise2 = null;
        if (result instanceof FinancialConnectionsSheetResult.Canceled) {
            Promise promise3 = this.promise;
            if (promise3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
            } else {
                promise = promise3;
            }
            promise.resolve(ErrorsKt.createError(ErrorType.Canceled.toString(), "The flow has been canceled"));
            return;
        }
        if (result instanceof FinancialConnectionsSheetResult.Failed) {
            Promise promise4 = this.promise;
            if (promise4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
            } else {
                promise2 = promise4;
            }
            promise2.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), ((FinancialConnectionsSheetResult.Failed) result).getError()));
            return;
        }
        if (!(result instanceof FinancialConnectionsSheetResult.Completed)) {
            throw new NoWhenBranchMatchedException();
        }
        Promise promise5 = this.promise;
        if (promise5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
            promise5 = null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("session", INSTANCE.mapFromSession(((FinancialConnectionsSheetResult.Completed) result).getFinancialConnectionsSession()));
        promise5.resolve(writableNativeMap);
        ReactApplicationContext reactApplicationContext = this.context;
        if (reactApplicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            reactApplicationContext = null;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null || (fragmentTransactionRemove = fragmentTransactionBeginTransaction.remove(this)) == null) {
            return;
        }
        fragmentTransactionRemove.commitAllowingStateLoss();
    }

    public final void presentFinancialConnectionsSheet(String clientSecret, Mode mode, String publishableKey, String stripeAccountId, Promise promise, ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(context, "context");
        this.promise = promise;
        this.context = context;
        this.mode = mode;
        this.configuration = new FinancialConnectionsSheet.Configuration(clientSecret, publishableKey, stripeAccountId);
        Activity currentActivity = context.getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (fragmentActivity != null) {
            attemptToCleanupPreviousFragment(fragmentActivity);
            commitFragmentAndStartFlow(fragmentActivity);
        } else {
            promise.resolve(ErrorsKt.createMissingActivityError());
        }
    }

    private final void attemptToCleanupPreviousFragment(FragmentActivity currentActivity) {
        currentActivity.getSupportFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    private final void commitFragmentAndStartFlow(FragmentActivity currentActivity) {
        try {
            currentActivity.getSupportFragmentManager().beginTransaction().add(this, TAG).commit();
        } catch (IllegalStateException e) {
            Promise promise = this.promise;
            if (promise == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                promise = null;
            }
            promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), e.getMessage()));
        }
    }

    /* compiled from: FinancialConnectionsSheetFragment.kt */
    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010'\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/reactnativestripesdk/FinancialConnectionsSheetFragment$Companion;", "", "<init>", "()V", "TAG", "", "createTokenResult", "Lcom/facebook/react/bridge/WritableMap;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult$Completed;", "mapFromSession", "financialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "mapFromAccountsList", "Lcom/facebook/react/bridge/ReadableArray;", "accounts", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "mapFromAccountBalance", "balance", "Lcom/stripe/android/financialconnections/model/Balance;", "mapFromCashAvailable", "Lcom/facebook/react/bridge/WritableNativeMap;", "mapFromCreditUsed", "mapFromAccountBalanceRefresh", "balanceRefresh", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "mapFromStatus", "status", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "mapFromCategory", "category", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "mapFromSubcategory", "subcategory", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "mapFromPermission", "permission", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "mapFromSupportedPaymentMethodTypes", "type", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "mapFromBalanceType", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "mapFromBalanceRefreshStatus", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: FinancialConnectionsSheetFragment.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            public static final /* synthetic */ int[] $EnumSwitchMapping$3;
            public static final /* synthetic */ int[] $EnumSwitchMapping$4;
            public static final /* synthetic */ int[] $EnumSwitchMapping$5;
            public static final /* synthetic */ int[] $EnumSwitchMapping$6;

            static {
                int[] iArr = new int[FinancialConnectionsAccount.Status.values().length];
                try {
                    iArr[FinancialConnectionsAccount.Status.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FinancialConnectionsAccount.Status.DISCONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FinancialConnectionsAccount.Status.INACTIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FinancialConnectionsAccount.Status.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[FinancialConnectionsAccount.Category.values().length];
                try {
                    iArr2[FinancialConnectionsAccount.Category.CASH.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[FinancialConnectionsAccount.Category.CREDIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[FinancialConnectionsAccount.Category.INVESTMENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[FinancialConnectionsAccount.Category.OTHER.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[FinancialConnectionsAccount.Category.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[FinancialConnectionsAccount.Subcategory.values().length];
                try {
                    iArr3[FinancialConnectionsAccount.Subcategory.CHECKING.ordinal()] = 1;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[FinancialConnectionsAccount.Subcategory.CREDIT_CARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[FinancialConnectionsAccount.Subcategory.LINE_OF_CREDIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr3[FinancialConnectionsAccount.Subcategory.MORTGAGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr3[FinancialConnectionsAccount.Subcategory.OTHER.ordinal()] = 5;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr3[FinancialConnectionsAccount.Subcategory.SAVINGS.ordinal()] = 6;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr3[FinancialConnectionsAccount.Subcategory.UNKNOWN.ordinal()] = 7;
                } catch (NoSuchFieldError unused16) {
                }
                $EnumSwitchMapping$2 = iArr3;
                int[] iArr4 = new int[FinancialConnectionsAccount.Permissions.values().length];
                try {
                    iArr4[FinancialConnectionsAccount.Permissions.PAYMENT_METHOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr4[FinancialConnectionsAccount.Permissions.BALANCES.ordinal()] = 2;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr4[FinancialConnectionsAccount.Permissions.OWNERSHIP.ordinal()] = 3;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr4[FinancialConnectionsAccount.Permissions.TRANSACTIONS.ordinal()] = 4;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr4[FinancialConnectionsAccount.Permissions.ACCOUNT_NUMBERS.ordinal()] = 5;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr4[FinancialConnectionsAccount.Permissions.UNKNOWN.ordinal()] = 6;
                } catch (NoSuchFieldError unused22) {
                }
                $EnumSwitchMapping$3 = iArr4;
                int[] iArr5 = new int[FinancialConnectionsAccount.SupportedPaymentMethodTypes.values().length];
                try {
                    iArr5[FinancialConnectionsAccount.SupportedPaymentMethodTypes.US_BANK_ACCOUNT.ordinal()] = 1;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr5[FinancialConnectionsAccount.SupportedPaymentMethodTypes.LINK.ordinal()] = 2;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr5[FinancialConnectionsAccount.SupportedPaymentMethodTypes.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused25) {
                }
                $EnumSwitchMapping$4 = iArr5;
                int[] iArr6 = new int[Balance.Type.values().length];
                try {
                    iArr6[Balance.Type.CASH.ordinal()] = 1;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr6[Balance.Type.CREDIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr6[Balance.Type.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused28) {
                }
                $EnumSwitchMapping$5 = iArr6;
                int[] iArr7 = new int[BalanceRefresh.BalanceRefreshStatus.values().length];
                try {
                    iArr7[BalanceRefresh.BalanceRefreshStatus.SUCCEEDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr7[BalanceRefresh.BalanceRefreshStatus.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr7[BalanceRefresh.BalanceRefreshStatus.PENDING.ordinal()] = 3;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr7[BalanceRefresh.BalanceRefreshStatus.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused32) {
                }
                $EnumSwitchMapping$6 = iArr7;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WritableMap createTokenResult(FinancialConnectionsSheetForTokenResult.Completed result) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("session", FinancialConnectionsSheetFragment.INSTANCE.mapFromSession(result.getFinancialConnectionsSession()));
            writableNativeMap.putMap("token", MappersKt.mapFromToken(result.getToken()));
            return writableNativeMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WritableMap mapFromSession(FinancialConnectionsSession financialConnectionsSession) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("id", financialConnectionsSession.getId());
            writableNativeMap.putString("clientSecret", financialConnectionsSession.getClientSecret());
            writableNativeMap.putBoolean(TokenJsonParser.FIELD_LIVEMODE, financialConnectionsSession.getLivemode());
            writableNativeMap.putArray("accounts", mapFromAccountsList(financialConnectionsSession.getAccounts()));
            return writableNativeMap;
        }

        private final ReadableArray mapFromAccountsList(FinancialConnectionsAccountList accounts) {
            ReadableArray readableArray;
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
            for (FinancialConnectionsAccount financialConnectionsAccount : accounts.getData()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("id", financialConnectionsAccount.getId());
                writableNativeMap.putBoolean(TokenJsonParser.FIELD_LIVEMODE, financialConnectionsAccount.getLivemode());
                writableNativeMap.putString("displayName", financialConnectionsAccount.getDisplayName());
                writableNativeMap.putString("status", mapFromStatus(financialConnectionsAccount.getStatus()));
                writableNativeMap.putString("institutionName", financialConnectionsAccount.getInstitutionName());
                writableNativeMap.putString("last4", financialConnectionsAccount.getLast4());
                writableNativeMap.putDouble("created", financialConnectionsAccount.getCreated() * 1000.0d);
                writableNativeMap.putMap("balance", mapFromAccountBalance(financialConnectionsAccount.getBalance()));
                writableNativeMap.putMap("balanceRefresh", mapFromAccountBalanceRefresh(financialConnectionsAccount.getBalanceRefresh()));
                writableNativeMap.putString("category", mapFromCategory(financialConnectionsAccount.getCategory()));
                writableNativeMap.putString("subcategory", mapFromSubcategory(financialConnectionsAccount.getSubcategory()));
                List<FinancialConnectionsAccount.Permissions> permissions = financialConnectionsAccount.getPermissions();
                if (permissions != null) {
                    List<FinancialConnectionsAccount.Permissions> list = permissions;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(FinancialConnectionsSheetFragment.INSTANCE.mapFromPermission((FinancialConnectionsAccount.Permissions) it.next()));
                    }
                    readableArray = FinancialConnectionsSheetFragmentKt.toReadableArray(arrayList);
                } else {
                    readableArray = null;
                }
                writableNativeMap.putArray("permissions", readableArray);
                List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes = financialConnectionsAccount.getSupportedPaymentMethodTypes();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportedPaymentMethodTypes, 10));
                Iterator<T> it2 = supportedPaymentMethodTypes.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(FinancialConnectionsSheetFragment.INSTANCE.mapFromSupportedPaymentMethodTypes((FinancialConnectionsAccount.SupportedPaymentMethodTypes) it2.next()));
                }
                writableNativeMap.putArray("supportedPaymentMethodTypes", FinancialConnectionsSheetFragmentKt.toReadableArray(arrayList2));
                writableArrayCreateArray.pushMap(writableNativeMap);
            }
            return writableArrayCreateArray;
        }

        private final WritableMap mapFromAccountBalance(Balance balance) {
            if (balance == null) {
                return null;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("asOf", balance.getAsOf() * 1000.0d);
            writableNativeMap.putString("type", mapFromBalanceType(balance.getType()));
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            for (Map.Entry<String, Integer> entry : balance.getCurrent().entrySet()) {
                writableNativeMap2.putInt(entry.getKey(), entry.getValue().intValue());
            }
            writableNativeMap.putMap("current", writableNativeMap2);
            writableNativeMap.putMap("cash", mapFromCashAvailable(balance));
            writableNativeMap.putMap("credit", mapFromCreditUsed(balance));
            return writableNativeMap;
        }

        private final WritableNativeMap mapFromCashAvailable(Balance balance) {
            Map<String, Integer> available;
            Set<Map.Entry<String, Integer>> setEntrySet;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            CashBalance cash = balance.getCash();
            if (cash != null && (available = cash.getAvailable()) != null && (setEntrySet = available.entrySet()) != null) {
                for (Map.Entry<String, Integer> entry : setEntrySet) {
                    writableNativeMap2.putInt(entry.getKey(), entry.getValue().intValue());
                }
            }
            writableNativeMap.putMap("available", writableNativeMap2);
            return writableNativeMap;
        }

        private final WritableNativeMap mapFromCreditUsed(Balance balance) {
            Map<String, Integer> used;
            Set<Map.Entry<String, Integer>> setEntrySet;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            CreditBalance credit = balance.getCredit();
            if (credit != null && (used = credit.getUsed()) != null && (setEntrySet = used.entrySet()) != null) {
                for (Map.Entry<String, Integer> entry : setEntrySet) {
                    writableNativeMap2.putInt(entry.getKey(), entry.getValue().intValue());
                }
            }
            writableNativeMap.putMap(TokenJsonParser.FIELD_USED, writableNativeMap2);
            return writableNativeMap;
        }

        private final WritableMap mapFromAccountBalanceRefresh(BalanceRefresh balanceRefresh) {
            if (balanceRefresh == null) {
                return null;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("status", mapFromBalanceRefreshStatus(balanceRefresh.getStatus()));
            writableNativeMap.putDouble("lastAttemptedAt", balanceRefresh.getLastAttemptedAt() * 1000.0d);
            return writableNativeMap;
        }

        private final String mapFromStatus(FinancialConnectionsAccount.Status status) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                return AppStateModule.APP_STATE_ACTIVE;
            }
            if (i == 2) {
                return "disconnected";
            }
            if (i == 3) {
                return "inactive";
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return "unparsable";
        }

        private final String mapFromCategory(FinancialConnectionsAccount.Category category) {
            int i = WhenMappings.$EnumSwitchMapping$1[category.ordinal()];
            if (i == 1) {
                return "cash";
            }
            if (i == 2) {
                return "credit";
            }
            if (i == 3) {
                return "investment";
            }
            if (i == 4) {
                return "other";
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return "unparsable";
        }

        private final String mapFromSubcategory(FinancialConnectionsAccount.Subcategory subcategory) {
            switch (WhenMappings.$EnumSwitchMapping$2[subcategory.ordinal()]) {
                case 1:
                    return "checking";
                case 2:
                    return "creditCard";
                case 3:
                    return "lineOfCredit";
                case 4:
                    return "mortgage";
                case 5:
                    return "other";
                case 6:
                    return "savings";
                case 7:
                    return "unparsable";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private final String mapFromPermission(FinancialConnectionsAccount.Permissions permission) {
            switch (WhenMappings.$EnumSwitchMapping$3[permission.ordinal()]) {
                case 1:
                    return "paymentMethod";
                case 2:
                    return "balances";
                case 3:
                    return "ownership";
                case 4:
                    return "transactions";
                case 5:
                    return "accountNumbers";
                case 6:
                    return "unparsable";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private final String mapFromSupportedPaymentMethodTypes(FinancialConnectionsAccount.SupportedPaymentMethodTypes type) {
            int i = WhenMappings.$EnumSwitchMapping$4[type.ordinal()];
            if (i == 1) {
                return "usBankAccount";
            }
            if (i == 2) {
                return "link";
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return "unparsable";
        }

        private final String mapFromBalanceType(Balance.Type type) {
            int i = WhenMappings.$EnumSwitchMapping$5[type.ordinal()];
            if (i == 1) {
                return "cash";
            }
            if (i == 2) {
                return "credit";
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return "unparsable";
        }

        private final String mapFromBalanceRefreshStatus(BalanceRefresh.BalanceRefreshStatus status) {
            int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$6[status.ordinal()];
            if (i == -1) {
                return AbstractJsonLexerKt.NULL;
            }
            if (i == 1) {
                return "succeeded";
            }
            if (i == 2) {
                return "failed";
            }
            if (i == 3) {
                return "pending";
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return "unparsable";
        }
    }
}
