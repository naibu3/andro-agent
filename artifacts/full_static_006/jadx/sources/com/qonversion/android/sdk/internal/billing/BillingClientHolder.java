package com.qonversion.android.sdk.internal.billing;

import android.os.Handler;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.internal.logger.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingClientHolder.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u000bJ\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0002J\u001f\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u001f¢\u0006\u0002\b R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "Lcom/android/billingclient/api/BillingClientStateListener;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "mainHandler", "Landroid/os/Handler;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "connectionListener", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;", "isConnected", "", "()Z", "purchasesUpdatedListener", "onBillingServiceDisconnected", "", "onBillingSetupFinished", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "onPurchasesUpdated", "purchases", "", "Lcom/android/billingclient/api/Purchase;", "setBillingClient", "startConnection", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "subscribeOnPurchasesUpdates", "withReadyClient", "billingFunction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ConnectionListener", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class BillingClientHolder implements BillingClientStateListener, PurchasesUpdatedListener {
    private BillingClient billingClient;
    private ConnectionListener connectionListener;
    private final Logger logger;
    private final Handler mainHandler;
    private PurchasesUpdatedListener purchasesUpdatedListener;

    /* compiled from: BillingClientHolder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;", "", "onBillingClientConnected", "", "onBillingClientUnavailable", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface ConnectionListener {
        void onBillingClientConnected();

        void onBillingClientUnavailable(BillingError error);
    }

    public BillingClientHolder(Handler mainHandler, Logger logger) {
        Intrinsics.checkNotNullParameter(mainHandler, "mainHandler");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.mainHandler = mainHandler;
        this.logger = logger;
    }

    public final boolean isConnected() {
        BillingClient billingClient = this.billingClient;
        return billingClient != null && billingClient.isReady();
    }

    public final void startConnection(ConnectionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.connectionListener = listener;
        this.mainHandler.post(new Runnable() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientHolder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientHolder.startConnection$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnection$lambda$1(BillingClientHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0) {
            BillingClient billingClient = this$0.billingClient;
            if (billingClient != null) {
                billingClient.startConnection(this$0);
            }
            this$0.logger.debug("startConnection() -> for " + this$0.billingClient);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void withReadyClient(Function1<? super BillingClient, Unit> billingFunction) {
        Intrinsics.checkNotNullParameter(billingFunction, "billingFunction");
        BillingClient billingClient = this.billingClient;
        Unit unit = null;
        if (!isConnected()) {
            billingClient = null;
        }
        if (billingClient != null) {
            billingFunction.invoke(billingClient);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.logger.debug("Connection to the BillingClient was lost");
        }
    }

    public final void subscribeOnPurchasesUpdates(PurchasesUpdatedListener purchasesUpdatedListener) {
        Intrinsics.checkNotNullParameter(purchasesUpdatedListener, "purchasesUpdatedListener");
        this.purchasesUpdatedListener = purchasesUpdatedListener;
    }

    public final void setBillingClient(BillingClient billingClient) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        this.billingClient = billingClient;
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> purchases) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        PurchasesUpdatedListener purchasesUpdatedListener = this.purchasesUpdatedListener;
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesUpdated(billingResult, purchases);
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.logger.debug("onBillingServiceDisconnected() -> for " + this.billingClient);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode != -2) {
            if (responseCode == 0) {
                this.logger.debug("onBillingSetupFinished() -> successfully for " + this.billingClient + ".");
                ConnectionListener connectionListener = this.connectionListener;
                if (connectionListener != null) {
                    connectionListener.onBillingClientConnected();
                    return;
                }
                return;
            }
            if (responseCode != 3) {
                if (responseCode != 5) {
                    this.logger.error("onBillingSetupFinished with error: " + UtilsKt.getDescription(billingResult));
                    return;
                }
                return;
            }
        }
        this.logger.error("onBillingSetupFinished() -> with error: " + UtilsKt.getDescription(billingResult));
        BillingError billingError = new BillingError(billingResult.getResponseCode(), "Billing is not available on this device. " + UtilsKt.getDescription(billingResult));
        ConnectionListener connectionListener2 = this.connectionListener;
        if (connectionListener2 != null) {
            connectionListener2.onBillingClientUnavailable(billingError);
        }
    }
}
