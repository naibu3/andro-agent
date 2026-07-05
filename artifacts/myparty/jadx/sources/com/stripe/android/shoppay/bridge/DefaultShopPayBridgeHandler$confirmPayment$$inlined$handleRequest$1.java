package com.stripe.android.shoppay.bridge;

import com.facebook.GraphResponse;
import com.stripe.android.shoppay.bridge.ECEPaymentMethodOptions;
import com.stripe.android.shoppay.bridge.ShopPayConfirmationState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.json.JSONObject;

/* compiled from: DefaultShopPayBridgeHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleRequest$2$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.shoppay.bridge.DefaultShopPayBridgeHandler$confirmPayment$$inlined$handleRequest$1", f = "DefaultShopPayBridgeHandler.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DefaultShopPayBridgeHandler$confirmPayment$$inlined$handleRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ JSONObject $jsonObject;
    final /* synthetic */ DefaultShopPayBridgeHandler $this_runCatching;
    int label;
    final /* synthetic */ DefaultShopPayBridgeHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultShopPayBridgeHandler$confirmPayment$$inlined$handleRequest$1(JSONObject jSONObject, DefaultShopPayBridgeHandler defaultShopPayBridgeHandler, Continuation continuation, DefaultShopPayBridgeHandler defaultShopPayBridgeHandler2) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.$this_runCatching = defaultShopPayBridgeHandler;
        this.this$0 = defaultShopPayBridgeHandler2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultShopPayBridgeHandler$confirmPayment$$inlined$handleRequest$1(this.$jsonObject, this.$this_runCatching, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DefaultShopPayBridgeHandler$confirmPayment$$inlined$handleRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ECEPaymentMethodOptions.ShopPay shopPay;
        String externalSourceId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConfirmationRequest confirmationRequest = (ConfirmationRequest) this.this$0.confirmationRequestJsonParser.parse(this.$jsonObject);
            if (confirmationRequest == null) {
                throw new IllegalArgumentException("Failed to parse confirmation request");
            }
            DefaultShopPayBridgeHandler.logMessage$default(this.this$0, "Parsed confirmation request: " + confirmationRequest, null, 2, null);
            ECEPaymentMethodOptions paymentMethodOptions = confirmationRequest.getPaymentDetails().getPaymentMethodOptions();
            if (paymentMethodOptions == null || (shopPay = paymentMethodOptions.getShopPay()) == null || (externalSourceId = shopPay.getExternalSourceId()) == null) {
                throw new IllegalArgumentException("Missing external source id");
            }
            MutableStateFlow mutableStateFlow = this.this$0._confirmationState;
            ShopPayConfirmationState.Success success = new ShopPayConfirmationState.Success(externalSourceId, confirmationRequest.getPaymentDetails().getBillingDetails(), confirmationRequest.getPaymentDetails().getShippingAddress());
            this.label = 1;
            if (mutableStateFlow.emit(success, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return this.$this_runCatching.wrapInBridgeResponse(new ConfirmationResponse(GraphResponse.SUCCESS_KEY, false));
    }
}
