package com.stripe.android.paymentelement.callbacks;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.ExternalPaymentMethodConfirmHandler;
import com.stripe.android.paymentsheet.ShopPayHandlers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentElementCallbacks.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u00011B[\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ji\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÂ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;", "", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "confirmCustomPaymentMethodCallback", "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;", "externalPaymentMethodConfirmHandler", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "analyticEventCallback", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "rowSelectionCallback", "Lkotlin/Function0;", "", "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;", "shopPayHandlers", "Lcom/stripe/android/paymentsheet/ShopPayHandlers;", "preparePaymentMethodHandler", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "<init>", "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentelement/AnalyticEventCallback;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ShopPayHandlers;Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)V", "getCreateIntentCallback", "()Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "getConfirmCustomPaymentMethodCallback", "()Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;", "getExternalPaymentMethodConfirmHandler", "()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "getAnalyticEventCallback", "()Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "getRowSelectionCallback", "()Lkotlin/jvm/functions/Function0;", "getShopPayHandlers", "()Lcom/stripe/android/paymentsheet/ShopPayHandlers;", "getPreparePaymentMethodHandler", "()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentElementCallbacks {
    public static final int $stable = 0;
    private final AnalyticEventCallback analyticEventCallback;
    private final ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback;
    private final CreateIntentCallback createIntentCallback;
    private final ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler;
    private final PreparePaymentMethodHandler preparePaymentMethodHandler;
    private final Function0<Unit> rowSelectionCallback;
    private final ShopPayHandlers shopPayHandlers;

    public /* synthetic */ PaymentElementCallbacks(CreateIntentCallback createIntentCallback, ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, AnalyticEventCallback analyticEventCallback, Function0 function0, ShopPayHandlers shopPayHandlers, PreparePaymentMethodHandler preparePaymentMethodHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(createIntentCallback, confirmCustomPaymentMethodCallback, externalPaymentMethodConfirmHandler, analyticEventCallback, function0, shopPayHandlers, preparePaymentMethodHandler);
    }

    private final PaymentElementCallbacks copy(CreateIntentCallback createIntentCallback, ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, AnalyticEventCallback analyticEventCallback, Function0<Unit> rowSelectionCallback, ShopPayHandlers shopPayHandlers, PreparePaymentMethodHandler preparePaymentMethodHandler) {
        return new PaymentElementCallbacks(createIntentCallback, confirmCustomPaymentMethodCallback, externalPaymentMethodConfirmHandler, analyticEventCallback, rowSelectionCallback, shopPayHandlers, preparePaymentMethodHandler);
    }

    static /* synthetic */ PaymentElementCallbacks copy$default(PaymentElementCallbacks paymentElementCallbacks, CreateIntentCallback createIntentCallback, ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, AnalyticEventCallback analyticEventCallback, Function0 function0, ShopPayHandlers shopPayHandlers, PreparePaymentMethodHandler preparePaymentMethodHandler, int i, Object obj) {
        if ((i & 1) != 0) {
            createIntentCallback = paymentElementCallbacks.createIntentCallback;
        }
        if ((i & 2) != 0) {
            confirmCustomPaymentMethodCallback = paymentElementCallbacks.confirmCustomPaymentMethodCallback;
        }
        if ((i & 4) != 0) {
            externalPaymentMethodConfirmHandler = paymentElementCallbacks.externalPaymentMethodConfirmHandler;
        }
        if ((i & 8) != 0) {
            analyticEventCallback = paymentElementCallbacks.analyticEventCallback;
        }
        if ((i & 16) != 0) {
            function0 = paymentElementCallbacks.rowSelectionCallback;
        }
        if ((i & 32) != 0) {
            shopPayHandlers = paymentElementCallbacks.shopPayHandlers;
        }
        if ((i & 64) != 0) {
            preparePaymentMethodHandler = paymentElementCallbacks.preparePaymentMethodHandler;
        }
        ShopPayHandlers shopPayHandlers2 = shopPayHandlers;
        PreparePaymentMethodHandler preparePaymentMethodHandler2 = preparePaymentMethodHandler;
        Function0 function02 = function0;
        ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler2 = externalPaymentMethodConfirmHandler;
        return paymentElementCallbacks.copy(createIntentCallback, confirmCustomPaymentMethodCallback, externalPaymentMethodConfirmHandler2, analyticEventCallback, function02, shopPayHandlers2, preparePaymentMethodHandler2);
    }

    /* renamed from: component1, reason: from getter */
    public final CreateIntentCallback getCreateIntentCallback() {
        return this.createIntentCallback;
    }

    /* renamed from: component2, reason: from getter */
    public final ConfirmCustomPaymentMethodCallback getConfirmCustomPaymentMethodCallback() {
        return this.confirmCustomPaymentMethodCallback;
    }

    /* renamed from: component3, reason: from getter */
    public final ExternalPaymentMethodConfirmHandler getExternalPaymentMethodConfirmHandler() {
        return this.externalPaymentMethodConfirmHandler;
    }

    /* renamed from: component4, reason: from getter */
    public final AnalyticEventCallback getAnalyticEventCallback() {
        return this.analyticEventCallback;
    }

    public final Function0<Unit> component5() {
        return this.rowSelectionCallback;
    }

    /* renamed from: component6, reason: from getter */
    public final ShopPayHandlers getShopPayHandlers() {
        return this.shopPayHandlers;
    }

    /* renamed from: component7, reason: from getter */
    public final PreparePaymentMethodHandler getPreparePaymentMethodHandler() {
        return this.preparePaymentMethodHandler;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentElementCallbacks)) {
            return false;
        }
        PaymentElementCallbacks paymentElementCallbacks = (PaymentElementCallbacks) other;
        return Intrinsics.areEqual(this.createIntentCallback, paymentElementCallbacks.createIntentCallback) && Intrinsics.areEqual(this.confirmCustomPaymentMethodCallback, paymentElementCallbacks.confirmCustomPaymentMethodCallback) && Intrinsics.areEqual(this.externalPaymentMethodConfirmHandler, paymentElementCallbacks.externalPaymentMethodConfirmHandler) && Intrinsics.areEqual(this.analyticEventCallback, paymentElementCallbacks.analyticEventCallback) && Intrinsics.areEqual(this.rowSelectionCallback, paymentElementCallbacks.rowSelectionCallback) && Intrinsics.areEqual(this.shopPayHandlers, paymentElementCallbacks.shopPayHandlers) && Intrinsics.areEqual(this.preparePaymentMethodHandler, paymentElementCallbacks.preparePaymentMethodHandler);
    }

    public int hashCode() {
        CreateIntentCallback createIntentCallback = this.createIntentCallback;
        int iHashCode = (createIntentCallback == null ? 0 : createIntentCallback.hashCode()) * 31;
        ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback = this.confirmCustomPaymentMethodCallback;
        int iHashCode2 = (iHashCode + (confirmCustomPaymentMethodCallback == null ? 0 : confirmCustomPaymentMethodCallback.hashCode())) * 31;
        ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler = this.externalPaymentMethodConfirmHandler;
        int iHashCode3 = (iHashCode2 + (externalPaymentMethodConfirmHandler == null ? 0 : externalPaymentMethodConfirmHandler.hashCode())) * 31;
        AnalyticEventCallback analyticEventCallback = this.analyticEventCallback;
        int iHashCode4 = (iHashCode3 + (analyticEventCallback == null ? 0 : analyticEventCallback.hashCode())) * 31;
        Function0<Unit> function0 = this.rowSelectionCallback;
        int iHashCode5 = (iHashCode4 + (function0 == null ? 0 : function0.hashCode())) * 31;
        ShopPayHandlers shopPayHandlers = this.shopPayHandlers;
        int iHashCode6 = (iHashCode5 + (shopPayHandlers == null ? 0 : shopPayHandlers.hashCode())) * 31;
        PreparePaymentMethodHandler preparePaymentMethodHandler = this.preparePaymentMethodHandler;
        return iHashCode6 + (preparePaymentMethodHandler != null ? preparePaymentMethodHandler.hashCode() : 0);
    }

    public String toString() {
        return "PaymentElementCallbacks(createIntentCallback=" + this.createIntentCallback + ", confirmCustomPaymentMethodCallback=" + this.confirmCustomPaymentMethodCallback + ", externalPaymentMethodConfirmHandler=" + this.externalPaymentMethodConfirmHandler + ", analyticEventCallback=" + this.analyticEventCallback + ", rowSelectionCallback=" + this.rowSelectionCallback + ", shopPayHandlers=" + this.shopPayHandlers + ", preparePaymentMethodHandler=" + this.preparePaymentMethodHandler + ")";
    }

    private PaymentElementCallbacks(CreateIntentCallback createIntentCallback, ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, AnalyticEventCallback analyticEventCallback, Function0<Unit> function0, ShopPayHandlers shopPayHandlers, PreparePaymentMethodHandler preparePaymentMethodHandler) {
        this.createIntentCallback = createIntentCallback;
        this.confirmCustomPaymentMethodCallback = confirmCustomPaymentMethodCallback;
        this.externalPaymentMethodConfirmHandler = externalPaymentMethodConfirmHandler;
        this.analyticEventCallback = analyticEventCallback;
        this.rowSelectionCallback = function0;
        this.shopPayHandlers = shopPayHandlers;
        this.preparePaymentMethodHandler = preparePaymentMethodHandler;
    }

    public final CreateIntentCallback getCreateIntentCallback() {
        return this.createIntentCallback;
    }

    public final ConfirmCustomPaymentMethodCallback getConfirmCustomPaymentMethodCallback() {
        return this.confirmCustomPaymentMethodCallback;
    }

    public final ExternalPaymentMethodConfirmHandler getExternalPaymentMethodConfirmHandler() {
        return this.externalPaymentMethodConfirmHandler;
    }

    public final AnalyticEventCallback getAnalyticEventCallback() {
        return this.analyticEventCallback;
    }

    public final Function0<Unit> getRowSelectionCallback() {
        return this.rowSelectionCallback;
    }

    public final ShopPayHandlers getShopPayHandlers() {
        return this.shopPayHandlers;
    }

    public final PreparePaymentMethodHandler getPreparePaymentMethodHandler() {
        return this.preparePaymentMethodHandler;
    }

    /* compiled from: PaymentElementCallbacks.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u001a\u001a\u00020\u001bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;", "", "<init>", "()V", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "confirmCustomPaymentMethodCallback", "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;", "externalPaymentMethodConfirmHandler", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "analyticEventCallback", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "rowSelectionCallback", "Lkotlin/Function0;", "", "Lcom/stripe/android/paymentelement/embedded/InternalRowSelectionCallback;", "shopPayHandlers", "Lcom/stripe/android/paymentsheet/ShopPayHandlers;", "preparePaymentMethodHandler", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "handler", "rowSelectionImmediateActionCallback", "rowSelectionBehavior", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;", "element", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AnalyticEventCallback analyticEventCallback;
        private ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback;
        private CreateIntentCallback createIntentCallback;
        private ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler;
        private PreparePaymentMethodHandler preparePaymentMethodHandler;
        private Function0<Unit> rowSelectionCallback;
        private ShopPayHandlers shopPayHandlers;

        public final Builder createIntentCallback(CreateIntentCallback createIntentCallback) {
            this.createIntentCallback = createIntentCallback;
            return this;
        }

        public final Builder confirmCustomPaymentMethodCallback(ConfirmCustomPaymentMethodCallback confirmCustomPaymentMethodCallback) {
            this.confirmCustomPaymentMethodCallback = confirmCustomPaymentMethodCallback;
            return this;
        }

        public final Builder externalPaymentMethodConfirmHandler(ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler) {
            this.externalPaymentMethodConfirmHandler = externalPaymentMethodConfirmHandler;
            return this;
        }

        public final Builder analyticEventCallback(AnalyticEventCallback analyticEventCallback) {
            this.analyticEventCallback = analyticEventCallback;
            return this;
        }

        public final Builder preparePaymentMethodHandler(PreparePaymentMethodHandler handler) {
            this.preparePaymentMethodHandler = handler;
            return this;
        }

        public final Builder rowSelectionImmediateActionCallback(EmbeddedPaymentElement.RowSelectionBehavior rowSelectionBehavior, EmbeddedPaymentElement element) {
            Intrinsics.checkNotNullParameter(rowSelectionBehavior, "rowSelectionBehavior");
            Intrinsics.checkNotNullParameter(element, "element");
            this.rowSelectionCallback = EmbeddedPaymentElement.RowSelectionBehavior.INSTANCE.getInternalRowSelectionCallback$paymentsheet_release(rowSelectionBehavior, element);
            return this;
        }

        public final Builder shopPayHandlers(ShopPayHandlers shopPayHandlers) {
            this.shopPayHandlers = shopPayHandlers;
            return this;
        }

        public final PaymentElementCallbacks build() {
            return new PaymentElementCallbacks(this.createIntentCallback, this.confirmCustomPaymentMethodCallback, this.externalPaymentMethodConfirmHandler, this.analyticEventCallback, this.rowSelectionCallback, this.shopPayHandlers, this.preparePaymentMethodHandler, null);
        }
    }
}
