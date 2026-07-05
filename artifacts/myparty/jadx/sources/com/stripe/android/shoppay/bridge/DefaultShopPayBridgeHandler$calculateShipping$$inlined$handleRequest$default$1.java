package com.stripe.android.shoppay.bridge;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.ShopPayHandlers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* compiled from: DefaultShopPayBridgeHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleRequest$2$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.shoppay.bridge.DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1", f = "DefaultShopPayBridgeHandler.kt", i = {}, l = {206}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ JSONObject $jsonObject;
    final /* synthetic */ DefaultShopPayBridgeHandler $this_runCatching;
    int label;
    final /* synthetic */ DefaultShopPayBridgeHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1(JSONObject jSONObject, DefaultShopPayBridgeHandler defaultShopPayBridgeHandler, Continuation continuation, DefaultShopPayBridgeHandler defaultShopPayBridgeHandler2) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.$this_runCatching = defaultShopPayBridgeHandler;
        this.this$0 = defaultShopPayBridgeHandler2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1(this.$jsonObject, this.$this_runCatching, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DefaultShopPayBridgeHandler$calculateShipping$$inlined$handleRequest$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        ShippingResponse shippingResponse = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ShippingCalculationRequest shippingCalculationRequest = (ShippingCalculationRequest) this.this$0.shippingRateRequestJsonParser.parse(this.$jsonObject);
            if (shippingCalculationRequest == null) {
                throw new IllegalArgumentException("Failed to parse shipping rate request");
            }
            DefaultShopPayBridgeHandler.logMessage$default(this.this$0, "Parsed calculateShipping request: " + shippingCalculationRequest, null, 2, null);
            ECEPartialAddress address = shippingCalculationRequest.getShippingAddress().getAddress();
            String city = address.getCity();
            if (city == null) {
                city = "";
            }
            String state = address.getState();
            if (state == null) {
                state = "";
            }
            String postalCode = address.getPostalCode();
            if (postalCode == null) {
                postalCode = "";
            }
            String country = address.getCountry();
            ShopPayHandlers.SelectedAddress selectedAddress = new ShopPayHandlers.SelectedAddress(city, state, postalCode, country != null ? country : "");
            ShopPayHandlers.ShippingContactHandler shippingContactHandler = this.this$0.shopPayHandlers.getShippingContactHandler();
            this.label = 1;
            obj = shippingContactHandler.onAddressSelected(selectedAddress, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ShopPayHandlers.ShippingContactUpdate shippingContactUpdate = (ShopPayHandlers.ShippingContactUpdate) obj;
        if (shippingContactUpdate != null) {
            List<PaymentSheet.ShopPayConfiguration.LineItem> lineItems = shippingContactUpdate.getLineItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lineItems, 10));
            Iterator<T> it = lineItems.iterator();
            while (it.hasNext()) {
                arrayList.add(ShopPayMapperKt.toECELineItem((PaymentSheet.ShopPayConfiguration.LineItem) it.next()));
            }
            ArrayList arrayList2 = arrayList;
            List<PaymentSheet.ShopPayConfiguration.ShippingRate> shippingRates = shippingContactUpdate.getShippingRates();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(shippingRates, 10));
            Iterator<T> it2 = shippingRates.iterator();
            while (it2.hasNext()) {
                arrayList3.add(ShopPayMapperKt.toECEShippingRate((PaymentSheet.ShopPayConfiguration.ShippingRate) it2.next()));
            }
            ArrayList arrayList4 = arrayList3;
            Iterator<T> it3 = shippingContactUpdate.getLineItems().iterator();
            int amount = 0;
            while (it3.hasNext()) {
                amount += ((PaymentSheet.ShopPayConfiguration.LineItem) it3.next()).getAmount();
            }
            shippingResponse = new ShippingResponse(arrayList2, arrayList4, Boxing.boxInt(amount));
        }
        return this.$this_runCatching.wrapInBridgeResponse(shippingResponse);
    }
}
