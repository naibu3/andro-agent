package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentsClientFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultPaymentsClientFactory;", "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "create", "Lcom/google/android/gms/wallet/PaymentsClient;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultPaymentsClientFactory implements PaymentsClientFactory {
    public static final int $stable = 8;
    private final Context context;

    @Inject
    public DefaultPaymentsClientFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.stripe.android.googlepaylauncher.PaymentsClientFactory
    public PaymentsClient create(GooglePayEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        Wallet.WalletOptions walletOptionsBuild = new Wallet.WalletOptions.Builder().setEnvironment(environment.getValue()).build();
        Intrinsics.checkNotNullExpressionValue(walletOptionsBuild, "build(...)");
        PaymentsClient paymentsClient = Wallet.getPaymentsClient(this.context, walletOptionsBuild);
        Intrinsics.checkNotNullExpressionValue(paymentsClient, "getPaymentsClient(...)");
        return paymentsClient;
    }
}
