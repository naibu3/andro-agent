package com.stripe.android.payments.bankaccount;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.fragment.app.Fragment;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultKt;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.payments.financialconnections.GetFinancialConnectionsAvailability;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountLauncher.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J,\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&JY\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0002\u0010\u0012J@\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H'J\b\u0010\u0014\u001a\u00020\u0003H'¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "", "presentWithPaymentIntent", "", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "presentWithSetupIntent", "presentWithDeferredPayment", "elementsSessionId", "customerId", "onBehalfOf", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "presentWithDeferredSetup", "unregister", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CollectBankAccountLauncher {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String HOSTED_SURFACE_CUSTOMER_SHEET = "customer_sheet";
    public static final String HOSTED_SURFACE_PAYMENT_ELEMENT = "payment_element";

    void presentWithDeferredPayment(String publishableKey, String stripeAccountId, CollectBankAccountConfiguration configuration, String elementsSessionId, String customerId, String onBehalfOf, Integer amount, String currency);

    void presentWithDeferredSetup(String publishableKey, String stripeAccountId, CollectBankAccountConfiguration configuration, String elementsSessionId, String customerId, String onBehalfOf);

    void presentWithPaymentIntent(String publishableKey, String stripeAccountId, String clientSecret, CollectBankAccountConfiguration configuration);

    void presentWithSetupIntent(String publishableKey, String stripeAccountId, String clientSecret, CollectBankAccountConfiguration configuration);

    void unregister();

    /* compiled from: CollectBankAccountLauncher.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void presentWithPaymentIntent$default(CollectBankAccountLauncher collectBankAccountLauncher, String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: presentWithPaymentIntent");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            collectBankAccountLauncher.presentWithPaymentIntent(str, str2, str3, collectBankAccountConfiguration);
        }

        public static /* synthetic */ void presentWithSetupIntent$default(CollectBankAccountLauncher collectBankAccountLauncher, String str, String str2, String str3, CollectBankAccountConfiguration collectBankAccountConfiguration, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: presentWithSetupIntent");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            collectBankAccountLauncher.presentWithSetupIntent(str, str2, str3, collectBankAccountConfiguration);
        }

        public static /* synthetic */ void presentWithDeferredPayment$default(CollectBankAccountLauncher collectBankAccountLauncher, String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, String str3, String str4, String str5, Integer num, String str6, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: presentWithDeferredPayment");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            collectBankAccountLauncher.presentWithDeferredPayment(str, str2, collectBankAccountConfiguration, str3, str4, str5, num, str6);
        }

        public static /* synthetic */ void presentWithDeferredSetup$default(CollectBankAccountLauncher collectBankAccountLauncher, String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration, String str3, String str4, String str5, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: presentWithDeferredSetup");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            collectBankAccountLauncher.presentWithDeferredSetup(str, str2, collectBankAccountConfiguration, str3, str4, str5);
        }
    }

    /* compiled from: CollectBankAccountLauncher.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rJ\"\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rJ6\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\rH\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;", "", "<init>", "()V", "HOSTED_SURFACE_PAYMENT_ELEMENT", "", "HOSTED_SURFACE_CUSTOMER_SHEET", "LAUNCHER_KEY", "create", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lkotlin/Function1;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;", "", "fragment", "Landroidx/fragment/app/Fragment;", "createForPaymentSheet", "hostedSurface", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String HOSTED_SURFACE_CUSTOMER_SHEET = "customer_sheet";
        public static final String HOSTED_SURFACE_PAYMENT_ELEMENT = "payment_element";
        private static final String LAUNCHER_KEY = "CollectBankAccountLauncher";

        private Companion() {
        }

        public final CollectBankAccountLauncher create(ComponentActivity activity, final Function1<? super CollectBankAccountResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new CollectBankAccountForACHLauncher(activity.registerForActivityResult(new CollectBankAccountContract(), new ActivityResultCallback() { // from class: com.stripe.android.payments.bankaccount.CollectBankAccountLauncher$Companion$$ExternalSyntheticLambda0
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    CollectBankAccountLauncher.Companion.create$lambda$0(callback, (CollectBankAccountResultInternal) obj);
                }
            }), null, GetFinancialConnectionsAvailability.invoke$default(GetFinancialConnectionsAvailability.INSTANCE, null, null, 2, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void create$lambda$0(Function1 function1, CollectBankAccountResultInternal it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(CollectBankAccountResultKt.toUSBankAccountResult(it));
        }

        public final CollectBankAccountLauncher create(Fragment fragment, final Function1<? super CollectBankAccountResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new CollectBankAccountContract(), new ActivityResultCallback() { // from class: com.stripe.android.payments.bankaccount.CollectBankAccountLauncher$Companion$$ExternalSyntheticLambda1
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    CollectBankAccountLauncher.Companion.create$lambda$1(callback, (CollectBankAccountResultInternal) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
            return new CollectBankAccountForACHLauncher(activityResultLauncherRegisterForActivityResult, null, GetFinancialConnectionsAvailability.invoke$default(GetFinancialConnectionsAvailability.INSTANCE, null, null, 2, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void create$lambda$1(Function1 function1, CollectBankAccountResultInternal it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(CollectBankAccountResultKt.toUSBankAccountResult(it));
        }

        public final CollectBankAccountLauncher createForPaymentSheet(String hostedSurface, FinancialConnectionsAvailability financialConnectionsAvailability, ActivityResultRegistryOwner activityResultRegistryOwner, Function1<? super CollectBankAccountResultInternal, Unit> callback) {
            Intrinsics.checkNotNullParameter(hostedSurface, "hostedSurface");
            Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new CollectBankAccountForACHLauncher(activityResultRegistryOwner.getActivityResultRegistry().register(LAUNCHER_KEY, new CollectBankAccountContract(), new CollectBankAccountLauncher$sam$androidx_activity_result_ActivityResultCallback$0(callback)), hostedSurface, GetFinancialConnectionsAvailability.invoke$default(GetFinancialConnectionsAvailability.INSTANCE, null, null, 2, null));
        }
    }
}
