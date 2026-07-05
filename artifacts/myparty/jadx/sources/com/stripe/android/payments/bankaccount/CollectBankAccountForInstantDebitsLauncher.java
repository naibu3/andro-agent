package com.stripe.android.payments.bankaccount;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.payments.bankaccount.CollectBankAccountForInstantDebitsLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountForInstantDebitsResult;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountForInstantDebitsResultKt;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountForInstantDebitsLauncher.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J*\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016JW\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u001aJ>\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "hostActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "hostedSurface", "", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Ljava/lang/String;)V", "presentWithPaymentIntent", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "presentWithSetupIntent", "presentWithDeferredPayment", "elementsSessionId", "customerId", "onBehalfOf", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "presentWithDeferredSetup", "unregister", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollectBankAccountForInstantDebitsLauncher implements CollectBankAccountLauncher {
    private static final String LAUNCHER_KEY = "CollectBankAccountForInstantDebitsLauncher";
    private final FinancialConnectionsAvailability financialConnectionsAvailability;
    private final ActivityResultLauncher<CollectBankAccountContract.Args> hostActivityLauncher;
    private final String hostedSurface;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CollectBankAccountForInstantDebitsLauncher(ActivityResultLauncher<CollectBankAccountContract.Args> hostActivityLauncher, FinancialConnectionsAvailability financialConnectionsAvailability, String str) {
        Intrinsics.checkNotNullParameter(hostActivityLauncher, "hostActivityLauncher");
        this.hostActivityLauncher = hostActivityLauncher;
        this.financialConnectionsAvailability = financialConnectionsAvailability;
        this.hostedSurface = str;
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithPaymentIntent(String publishableKey, String stripeAccountId, String clientSecret, CollectBankAccountConfiguration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.hostActivityLauncher.launch(new CollectBankAccountContract.Args.ForPaymentIntent(publishableKey, stripeAccountId, clientSecret, configuration, true, this.financialConnectionsAvailability, this.hostedSurface));
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithSetupIntent(String publishableKey, String stripeAccountId, String clientSecret, CollectBankAccountConfiguration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.hostActivityLauncher.launch(new CollectBankAccountContract.Args.ForSetupIntent(publishableKey, stripeAccountId, clientSecret, configuration, true, this.financialConnectionsAvailability, this.hostedSurface));
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithDeferredPayment(String publishableKey, String stripeAccountId, CollectBankAccountConfiguration configuration, String elementsSessionId, String customerId, String onBehalfOf, Integer amount, String currency) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
        this.hostActivityLauncher.launch(new CollectBankAccountContract.Args.ForDeferredPaymentIntent(publishableKey, stripeAccountId, configuration, this.financialConnectionsAvailability, this.hostedSurface, elementsSessionId, customerId, onBehalfOf, amount, currency));
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithDeferredSetup(String publishableKey, String stripeAccountId, CollectBankAccountConfiguration configuration, String elementsSessionId, String customerId, String onBehalfOf) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
        this.hostActivityLauncher.launch(new CollectBankAccountContract.Args.ForDeferredSetupIntent(publishableKey, stripeAccountId, configuration, this.hostedSurface, this.financialConnectionsAvailability, elementsSessionId, customerId, onBehalfOf));
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void unregister() {
        this.hostActivityLauncher.unregister();
    }

    /* compiled from: CollectBankAccountForInstantDebitsLauncher.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountForInstantDebitsLauncher$Companion;", "", "<init>", "()V", "LAUNCHER_KEY", "", "createForPaymentSheet", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "hostedSurface", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "callback", "Lkotlin/Function1;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CollectBankAccountLauncher createForPaymentSheet(String hostedSurface, FinancialConnectionsAvailability financialConnectionsAvailability, ActivityResultRegistryOwner activityResultRegistryOwner, final Function1<? super CollectBankAccountForInstantDebitsResult, Unit> callback) {
            Intrinsics.checkNotNullParameter(hostedSurface, "hostedSurface");
            Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new CollectBankAccountForInstantDebitsLauncher(activityResultRegistryOwner.getActivityResultRegistry().register(CollectBankAccountForInstantDebitsLauncher.LAUNCHER_KEY, new CollectBankAccountContract(), new ActivityResultCallback() { // from class: com.stripe.android.payments.bankaccount.CollectBankAccountForInstantDebitsLauncher$Companion$$ExternalSyntheticLambda0
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    CollectBankAccountForInstantDebitsLauncher.Companion.createForPaymentSheet$lambda$0(callback, (CollectBankAccountResultInternal) obj);
                }
            }), financialConnectionsAvailability, hostedSurface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createForPaymentSheet$lambda$0(Function1 function1, CollectBankAccountResultInternal it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(CollectBankAccountForInstantDebitsResultKt.toInstantDebitsResult(it));
        }
    }
}
