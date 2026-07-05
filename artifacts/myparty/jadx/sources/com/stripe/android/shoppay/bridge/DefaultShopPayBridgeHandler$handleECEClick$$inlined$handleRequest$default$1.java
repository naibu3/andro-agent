package com.stripe.android.shoppay.bridge;

import com.stripe.android.paymentsheet.PaymentSheet;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* compiled from: DefaultShopPayBridgeHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler$handleRequest$2$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.shoppay.bridge.DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1", f = "DefaultShopPayBridgeHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ JSONObject $jsonObject;
    final /* synthetic */ DefaultShopPayBridgeHandler $this_runCatching;
    int label;
    final /* synthetic */ DefaultShopPayBridgeHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1(JSONObject jSONObject, DefaultShopPayBridgeHandler defaultShopPayBridgeHandler, Continuation continuation, DefaultShopPayBridgeHandler defaultShopPayBridgeHandler2) {
        super(2, continuation);
        this.$jsonObject = jSONObject;
        this.$this_runCatching = defaultShopPayBridgeHandler;
        this.this$0 = defaultShopPayBridgeHandler2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1(this.$jsonObject, this.$this_runCatching, continuation, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DefaultShopPayBridgeHandler$handleECEClick$$inlined$handleRequest$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HandleClickRequest handleClickRequest = (HandleClickRequest) this.this$0.handleClickRequestJsonParser.parse(this.$jsonObject);
        if (handleClickRequest == null) {
            throw new IllegalArgumentException("Failed to parse handle click request");
        }
        ArrayList arrayList = null;
        DefaultShopPayBridgeHandler.logMessage$default(this.this$0, "Parsed handle click request: " + handleClickRequest, null, 2, null);
        Function0 function0 = this.this$0.onECEClickCallback;
        if (function0 != null) {
            function0.invoke();
        }
        PaymentSheet.ShopPayConfiguration shopPayConfiguration = this.this$0.shopPayArgs.getShopPayConfiguration();
        List<PaymentSheet.ShopPayConfiguration.LineItem> lineItems = shopPayConfiguration.getLineItems();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(lineItems, 10));
        Iterator<T> it = lineItems.iterator();
        while (it.hasNext()) {
            arrayList2.add(ShopPayMapperKt.toECELineItem((PaymentSheet.ShopPayConfiguration.LineItem) it.next()));
        }
        ArrayList arrayList3 = arrayList2;
        List<PaymentSheet.ShopPayConfiguration.ShippingRate> shippingRates = shopPayConfiguration.getShippingRates();
        if (!shopPayConfiguration.getShippingAddressRequired()) {
            shippingRates = null;
        }
        if (shippingRates != null) {
            List<PaymentSheet.ShopPayConfiguration.ShippingRate> list = shippingRates;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList4.add(ShopPayMapperKt.toECEShippingRate((PaymentSheet.ShopPayConfiguration.ShippingRate) it2.next()));
            }
            arrayList = arrayList4;
        }
        return this.$this_runCatching.wrapInBridgeResponse(new HandleClickResponse(arrayList3, arrayList, Boxing.boxBoolean(shopPayConfiguration.getBillingAddressRequired()), Boxing.boxBoolean(shopPayConfiguration.getEmailRequired()), Boxing.boxBoolean(true), Boxing.boxBoolean(shopPayConfiguration.getShippingAddressRequired()), shopPayConfiguration.getAllowedShippingCountries(), this.this$0.shopPayArgs.getBusinessName(), shopPayConfiguration.getShopId()));
    }
}
