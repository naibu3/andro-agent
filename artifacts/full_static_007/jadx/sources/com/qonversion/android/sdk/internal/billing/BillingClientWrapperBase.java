package com.qonversion.android.sdk.internal.billing;

import android.app.Activity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase;
import com.qonversion.android.sdk.internal.logger.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: BillingClientWrapperBase.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ;\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\f0\u0015H\u0004J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0005J\u0018\u0010\u001f\u001a\u00020 *\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006#"}, d2 = {"Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;", "", "billingClientHolder", "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V", "getBillingClientHolder", "()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;", "getLogger", "()Lcom/qonversion/android/sdk/internal/logger/Logger;", "acknowledge", "", "purchaseToken", "", "consume", "handlePurchasesQueryError", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchaseType", "onQueryFailed", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, Constants.IPC_BUNDLE_KEY_SEND_ERROR, "launchBillingFlow", "activity", "Landroid/app/Activity;", "params", "Lcom/android/billingclient/api/BillingFlowParams;", "setSubscriptionUpdateParams", "Lcom/android/billingclient/api/BillingFlowParams$Builder;", "info", "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class BillingClientWrapperBase {
    private final BillingClientHolder billingClientHolder;
    private final Logger logger;

    public BillingClientWrapperBase(BillingClientHolder billingClientHolder, Logger logger) {
        Intrinsics.checkNotNullParameter(billingClientHolder, "billingClientHolder");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.billingClientHolder = billingClientHolder;
        this.logger = logger;
    }

    protected final BillingClientHolder getBillingClientHolder() {
        return this.billingClientHolder;
    }

    protected final Logger getLogger() {
        return this.logger;
    }

    public final void consume(String purchaseToken) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        ConsumeParams consumeParamsBuild = ConsumeParams.newBuilder().setPurchaseToken(purchaseToken).build();
        Intrinsics.checkNotNullExpressionValue(consumeParamsBuild, "build(...)");
        this.billingClientHolder.withReadyClient(new C01421(consumeParamsBuild, this));
    }

    /* compiled from: BillingClientWrapperBase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase$consume$1, reason: invalid class name and case insensitive filesystem */
    static final class C01421 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ ConsumeParams $params;
        final /* synthetic */ BillingClientWrapperBase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01421(ConsumeParams consumeParams, BillingClientWrapperBase billingClientWrapperBase) {
            super(1);
            this.$params = consumeParams;
            this.this$0 = billingClientWrapperBase;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            invoke2(billingClient);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BillingClient withReadyClient) {
            Intrinsics.checkNotNullParameter(withReadyClient, "$this$withReadyClient");
            ConsumeParams consumeParams = this.$params;
            final BillingClientWrapperBase billingClientWrapperBase = this.this$0;
            withReadyClient.consumeAsync(consumeParams, new ConsumeResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase$consume$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.ConsumeResponseListener
                public final void onConsumeResponse(BillingResult billingResult, String str) {
                    BillingClientWrapperBase.C01421.invoke$lambda$0(billingClientWrapperBase, billingResult, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(BillingClientWrapperBase this$0, BillingResult billingResult, String purchaseToken) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
            if (UtilsKt.isOk(billingResult)) {
                return;
            }
            this$0.getLogger().debug("consume() -> " + ("Failed to consume purchase with token " + purchaseToken + " " + UtilsKt.getDescription(billingResult)));
        }
    }

    public final void acknowledge(String purchaseToken) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        AcknowledgePurchaseParams acknowledgePurchaseParamsBuild = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchaseToken).build();
        Intrinsics.checkNotNullExpressionValue(acknowledgePurchaseParamsBuild, "build(...)");
        this.billingClientHolder.withReadyClient(new AnonymousClass1(acknowledgePurchaseParamsBuild, purchaseToken, this));
    }

    /* compiled from: BillingClientWrapperBase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase$acknowledge$1, reason: invalid class name */
    static final class AnonymousClass1 extends Lambda implements Function1<BillingClient, Unit> {
        final /* synthetic */ AcknowledgePurchaseParams $params;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ BillingClientWrapperBase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AcknowledgePurchaseParams acknowledgePurchaseParams, String str, BillingClientWrapperBase billingClientWrapperBase) {
            super(1);
            this.$params = acknowledgePurchaseParams;
            this.$purchaseToken = str;
            this.this$0 = billingClientWrapperBase;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
            invoke2(billingClient);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BillingClient withReadyClient) {
            Intrinsics.checkNotNullParameter(withReadyClient, "$this$withReadyClient");
            AcknowledgePurchaseParams acknowledgePurchaseParams = this.$params;
            final String str = this.$purchaseToken;
            final BillingClientWrapperBase billingClientWrapperBase = this.this$0;
            withReadyClient.acknowledgePurchase(acknowledgePurchaseParams, new AcknowledgePurchaseResponseListener() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase$acknowledge$1$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                    BillingClientWrapperBase.AnonymousClass1.invoke$lambda$0(str, billingClientWrapperBase, billingResult);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(String purchaseToken, BillingClientWrapperBase this$0, BillingResult billingResult) {
            Intrinsics.checkNotNullParameter(purchaseToken, "$purchaseToken");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            if (UtilsKt.isOk(billingResult)) {
                return;
            }
            this$0.getLogger().debug("acknowledge() -> " + ("Failed to acknowledge purchase with token " + purchaseToken + " " + UtilsKt.getDescription(billingResult)));
        }
    }

    protected final void launchBillingFlow(final Activity activity, final BillingFlowParams params) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        this.billingClientHolder.withReadyClient(new Function1<BillingClient, Unit>() { // from class: com.qonversion.android.sdk.internal.billing.BillingClientWrapperBase.launchBillingFlow.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
                invoke2(billingClient);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingClient withReadyClient) {
                Intrinsics.checkNotNullParameter(withReadyClient, "$this$withReadyClient");
                BillingResult billingResultLaunchBillingFlow = withReadyClient.launchBillingFlow(activity, params);
                Intrinsics.checkNotNull(billingResultLaunchBillingFlow);
                if (UtilsKt.isOk(billingResultLaunchBillingFlow)) {
                    billingResultLaunchBillingFlow = null;
                }
                if (billingResultLaunchBillingFlow != null) {
                    this.getLogger().error("launchBillingFlow() -> Failed to launch billing flow. " + UtilsKt.getDescription(billingResultLaunchBillingFlow));
                }
            }
        });
    }

    protected final void handlePurchasesQueryError(BillingResult billingResult, String purchaseType, Function1<? super BillingError, Unit> onQueryFailed) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(onQueryFailed, "onQueryFailed");
        String str = "Failed to query " + purchaseType + " purchases from cache: " + UtilsKt.getDescription(billingResult);
        onQueryFailed.invoke(new BillingError(billingResult.getResponseCode(), str));
        this.logger.error("queryPurchases() -> " + str);
    }

    public static /* synthetic */ BillingFlowParams.Builder setSubscriptionUpdateParams$default(BillingClientWrapperBase billingClientWrapperBase, BillingFlowParams.Builder builder, UpdatePurchaseInfo updatePurchaseInfo, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSubscriptionUpdateParams");
        }
        if ((i & 1) != 0) {
            updatePurchaseInfo = null;
        }
        return billingClientWrapperBase.setSubscriptionUpdateParams(builder, updatePurchaseInfo);
    }

    protected final BillingFlowParams.Builder setSubscriptionUpdateParams(BillingFlowParams.Builder builder, UpdatePurchaseInfo updatePurchaseInfo) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (updatePurchaseInfo != null) {
            BillingFlowParams.SubscriptionUpdateParams.Builder builderNewBuilder = BillingFlowParams.SubscriptionUpdateParams.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
            builderNewBuilder.setOldPurchaseToken(updatePurchaseInfo.getPurchaseToken());
            QPurchaseUpdatePolicy updatePolicy = updatePurchaseInfo.getUpdatePolicy();
            if (updatePolicy != null) {
                builderNewBuilder.setSubscriptionReplacementMode(updatePolicy.toReplacementMode$sdk_release());
            }
            BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParamsBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(subscriptionUpdateParamsBuild, "build(...)");
            builder.setSubscriptionUpdateParams(subscriptionUpdateParamsBuild);
        }
        return builder;
    }
}
