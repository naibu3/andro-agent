package com.stripe.android.payments.bankaccount;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountForACHLauncher.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J*\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0016JW\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010\u001eJ>\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/stripe/android/payments/bankaccount/CollectBankAccountForACHLauncher;", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;", "hostActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "hostedSurface", "", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/String;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V", "attachToIntent", "", "getAttachToIntent", "()Z", "presentWithPaymentIntent", "", "publishableKey", NamedConstantsKt.STRIPE_ACCOUNT_ID, "clientSecret", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "presentWithSetupIntent", "presentWithDeferredPayment", "elementsSessionId", "customerId", "onBehalfOf", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "presentWithDeferredSetup", "unregister", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CollectBankAccountForACHLauncher implements CollectBankAccountLauncher {
    public static final int $stable = 8;
    private final FinancialConnectionsAvailability financialConnectionsAvailability;
    private final ActivityResultLauncher<CollectBankAccountContract.Args> hostActivityLauncher;
    private final String hostedSurface;

    public CollectBankAccountForACHLauncher(ActivityResultLauncher<CollectBankAccountContract.Args> hostActivityLauncher, String str, FinancialConnectionsAvailability financialConnectionsAvailability) {
        Intrinsics.checkNotNullParameter(hostActivityLauncher, "hostActivityLauncher");
        this.hostActivityLauncher = hostActivityLauncher;
        this.hostedSurface = str;
        this.financialConnectionsAvailability = financialConnectionsAvailability;
    }

    private final boolean getAttachToIntent() {
        return this.hostedSurface == null;
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithPaymentIntent(String publishableKey, String stripeAccountId, String clientSecret, CollectBankAccountConfiguration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.hostActivityLauncher.launch(new CollectBankAccountContract.Args.ForPaymentIntent(publishableKey, stripeAccountId, clientSecret, configuration, getAttachToIntent(), this.financialConnectionsAvailability, this.hostedSurface));
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithSetupIntent(String publishableKey, String stripeAccountId, String clientSecret, CollectBankAccountConfiguration configuration) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.hostActivityLauncher.launch(new CollectBankAccountContract.Args.ForSetupIntent(publishableKey, stripeAccountId, clientSecret, configuration, getAttachToIntent(), this.financialConnectionsAvailability, this.hostedSurface));
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
}
