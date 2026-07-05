package com.reactnativestripesdk;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.StripeFragment;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventListener;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountLauncherFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;", "Lcom/reactnativestripesdk/utils/StripeFragment;", "<init>", "()V", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", com.stripe.android.payments.core.injection.NamedConstantsKt.IS_PAYMENT_INTENT, "", "collectParams", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "collectBankAccountLauncher", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "prepare", "", "onDestroy", "createBankAccountLauncher", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CollectBankAccountLauncherFragment extends StripeFragment {
    public static final String TAG = "collect_bank_account_launcher_fragment";
    private String clientSecret;
    private CollectBankAccountLauncher collectBankAccountLauncher;
    private CollectBankAccountConfiguration.USBankAccount collectParams;
    private ReactApplicationContext context;
    private boolean isPaymentIntent;
    private Promise promise;
    private String publishableKey;
    private String stripeAccountId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.reactnativestripesdk.utils.StripeFragment
    public void prepare() {
        this.collectBankAccountLauncher = createBankAccountLauncher();
        ReactApplicationContext reactApplicationContext = this.context;
        CollectBankAccountConfiguration.USBankAccount uSBankAccount = null;
        if (reactApplicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            reactApplicationContext = null;
        }
        final StripeSdkModule stripeSdkModule = (StripeSdkModule) reactApplicationContext.getNativeModule(StripeSdkModule.class);
        if (stripeSdkModule != null) {
            FinancialConnections.setEventListener(new FinancialConnectionsEventListener() { // from class: com.reactnativestripesdk.CollectBankAccountLauncherFragment$$ExternalSyntheticLambda1
                @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsEventListener
                public final void onEvent(FinancialConnectionsEvent financialConnectionsEvent) {
                    CollectBankAccountLauncherFragment.prepare$lambda$0(stripeSdkModule, financialConnectionsEvent);
                }
            });
        }
        if (this.isPaymentIntent) {
            CollectBankAccountLauncher collectBankAccountLauncher = this.collectBankAccountLauncher;
            if (collectBankAccountLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("collectBankAccountLauncher");
                collectBankAccountLauncher = null;
            }
            String str = this.publishableKey;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
                str = null;
            }
            String str2 = this.stripeAccountId;
            String str3 = this.clientSecret;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clientSecret");
                str3 = null;
            }
            CollectBankAccountConfiguration.USBankAccount uSBankAccount2 = this.collectParams;
            if (uSBankAccount2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("collectParams");
            } else {
                uSBankAccount = uSBankAccount2;
            }
            collectBankAccountLauncher.presentWithPaymentIntent(str, str2, str3, uSBankAccount);
            return;
        }
        CollectBankAccountLauncher collectBankAccountLauncher2 = this.collectBankAccountLauncher;
        if (collectBankAccountLauncher2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collectBankAccountLauncher");
            collectBankAccountLauncher2 = null;
        }
        String str4 = this.publishableKey;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
            str4 = null;
        }
        String str5 = this.stripeAccountId;
        String str6 = this.clientSecret;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clientSecret");
            str6 = null;
        }
        CollectBankAccountConfiguration.USBankAccount uSBankAccount3 = this.collectParams;
        if (uSBankAccount3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collectParams");
        } else {
            uSBankAccount = uSBankAccount3;
        }
        collectBankAccountLauncher2.presentWithSetupIntent(str4, str5, str6, uSBankAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepare$lambda$0(StripeSdkModule stripeSdkModule, FinancialConnectionsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        stripeSdkModule.emitOnFinancialConnectionsEvent(MappersKt.mapFromFinancialConnectionsEvent(event));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        FinancialConnections.clearEventListener();
    }

    private final CollectBankAccountLauncher createBankAccountLauncher() {
        return CollectBankAccountLauncher.INSTANCE.create(this, new Function1() { // from class: com.reactnativestripesdk.CollectBankAccountLauncherFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CollectBankAccountLauncherFragment.createBankAccountLauncher$lambda$1(this.f$0, (CollectBankAccountResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createBankAccountLauncher$lambda$1(CollectBankAccountLauncherFragment collectBankAccountLauncherFragment, CollectBankAccountResult result) {
        WritableMap writableMapCreateResult;
        Intrinsics.checkNotNullParameter(result, "result");
        ReactApplicationContext reactApplicationContext = null;
        if (result instanceof CollectBankAccountResult.Completed) {
            StripeIntent intent = ((CollectBankAccountResult.Completed) result).getResponse().getIntent();
            if (intent.getStatus() == StripeIntent.Status.RequiresPaymentMethod) {
                Promise promise = collectBankAccountLauncherFragment.promise;
                if (promise == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                    promise = null;
                }
                promise.resolve(ErrorsKt.createError(ErrorType.Canceled.toString(), "Bank account collection was canceled."));
            } else if (intent.getStatus() == StripeIntent.Status.RequiresConfirmation) {
                Promise promise2 = collectBankAccountLauncherFragment.promise;
                if (promise2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                    promise2 = null;
                }
                if (collectBankAccountLauncherFragment.isPaymentIntent) {
                    Intrinsics.checkNotNull(intent, "null cannot be cast to non-null type com.stripe.android.model.PaymentIntent");
                    writableMapCreateResult = MappersKt.createResult("paymentIntent", MappersKt.mapFromPaymentIntentResult((PaymentIntent) intent));
                } else {
                    Intrinsics.checkNotNull(intent, "null cannot be cast to non-null type com.stripe.android.model.SetupIntent");
                    writableMapCreateResult = MappersKt.createResult("setupIntent", MappersKt.mapFromSetupIntentResult((SetupIntent) intent));
                }
                promise2.resolve(writableMapCreateResult);
            }
        } else if (result instanceof CollectBankAccountResult.Cancelled) {
            Promise promise3 = collectBankAccountLauncherFragment.promise;
            if (promise3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                promise3 = null;
            }
            promise3.resolve(ErrorsKt.createError(ErrorType.Canceled.toString(), "Bank account collection was canceled."));
        } else {
            if (!(result instanceof CollectBankAccountResult.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            Promise promise4 = collectBankAccountLauncherFragment.promise;
            if (promise4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                promise4 = null;
            }
            promise4.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), ((CollectBankAccountResult.Failed) result).getError()));
        }
        CollectBankAccountLauncherFragment collectBankAccountLauncherFragment2 = collectBankAccountLauncherFragment;
        ReactApplicationContext reactApplicationContext2 = collectBankAccountLauncherFragment.context;
        if (reactApplicationContext2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            reactApplicationContext = reactApplicationContext2;
        }
        ExtensionsKt.removeFragment(collectBankAccountLauncherFragment2, reactApplicationContext);
        return Unit.INSTANCE;
    }

    /* compiled from: CollectBankAccountLauncherFragment.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment$Companion;", "", "<init>", "()V", "TAG", "", "create", "Lcom/reactnativestripesdk/CollectBankAccountLauncherFragment;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", com.stripe.android.payments.core.injection.NamedConstantsKt.IS_PAYMENT_INTENT, "", "collectParams", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ CollectBankAccountLauncherFragment create$default(Companion companion, ReactApplicationContext reactApplicationContext, String str, String str2, String str3, boolean z, CollectBankAccountConfiguration.USBankAccount uSBankAccount, Promise promise, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(reactApplicationContext, str, str2, str3, z, uSBankAccount, promise);
        }

        public final CollectBankAccountLauncherFragment create(ReactApplicationContext context, String publishableKey, String stripeAccountId, String clientSecret, boolean isPaymentIntent, CollectBankAccountConfiguration.USBankAccount collectParams, Promise promise) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(collectParams, "collectParams");
            Intrinsics.checkNotNullParameter(promise, "promise");
            CollectBankAccountLauncherFragment collectBankAccountLauncherFragment = new CollectBankAccountLauncherFragment();
            collectBankAccountLauncherFragment.context = context;
            collectBankAccountLauncherFragment.publishableKey = publishableKey;
            collectBankAccountLauncherFragment.stripeAccountId = stripeAccountId;
            collectBankAccountLauncherFragment.clientSecret = clientSecret;
            collectBankAccountLauncherFragment.isPaymentIntent = isPaymentIntent;
            collectBankAccountLauncherFragment.collectParams = collectParams;
            collectBankAccountLauncherFragment.promise = promise;
            return collectBankAccountLauncherFragment;
        }
    }
}
