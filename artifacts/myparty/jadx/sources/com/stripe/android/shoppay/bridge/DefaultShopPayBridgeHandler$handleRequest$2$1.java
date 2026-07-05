package com.stripe.android.shoppay.bridge;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* compiled from: DefaultShopPayBridgeHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.shoppay.bridge.DefaultShopPayBridgeHandler$handleRequest$2$1", f = "DefaultShopPayBridgeHandler.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DefaultShopPayBridgeHandler$handleRequest$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ JSONObject $jsonObject;
    final /* synthetic */ Function2<JSONObject, Continuation<? super T>, Object> $requestHandler;
    final /* synthetic */ DefaultShopPayBridgeHandler $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultShopPayBridgeHandler$handleRequest$2$1(Function2<? super JSONObject, ? super Continuation<? super T>, ? extends Object> function2, JSONObject jSONObject, DefaultShopPayBridgeHandler defaultShopPayBridgeHandler, Continuation<? super DefaultShopPayBridgeHandler$handleRequest$2$1> continuation) {
        super(2, continuation);
        this.$requestHandler = function2;
        this.$jsonObject = jSONObject;
        this.$this_runCatching = defaultShopPayBridgeHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultShopPayBridgeHandler$handleRequest$2$1(this.$requestHandler, this.$jsonObject, this.$this_runCatching, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DefaultShopPayBridgeHandler$handleRequest$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function2<JSONObject, Continuation<? super T>, Object> function2 = this.$requestHandler;
            JSONObject jSONObject = this.$jsonObject;
            this.label = 1;
            obj = function2.invoke(jSONObject, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return this.$this_runCatching.wrapInBridgeResponse((JsonSerializer) obj);
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$this_runCatching.wrapInBridgeResponse((JsonSerializer) this.$requestHandler.invoke(this.$jsonObject, this));
    }
}
