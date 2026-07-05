package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import defpackage.toWritableMap;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EmbeddedPaymentElementView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativestripesdk.EmbeddedPaymentElementView$Content$2$1", f = "EmbeddedPaymentElementView.kt", i = {}, l = {278}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class EmbeddedPaymentElementView$Content$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EmbeddedPaymentElement $embedded;
    int label;
    final /* synthetic */ EmbeddedPaymentElementView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmbeddedPaymentElementView$Content$2$1(EmbeddedPaymentElement embeddedPaymentElement, EmbeddedPaymentElementView embeddedPaymentElementView, Continuation<? super EmbeddedPaymentElementView$Content$2$1> continuation) {
        super(2, continuation);
        this.$embedded = embeddedPaymentElement;
        this.this$0 = embeddedPaymentElementView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmbeddedPaymentElementView$Content$2$1(this.$embedded, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmbeddedPaymentElementView$Content$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<EmbeddedPaymentElement.PaymentOptionDisplayData> paymentOption = this.$embedded.getPaymentOption();
            final EmbeddedPaymentElementView embeddedPaymentElementView = this.this$0;
            this.label = 1;
            if (paymentOption.collect(new FlowCollector() { // from class: com.reactnativestripesdk.EmbeddedPaymentElementView$Content$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((EmbeddedPaymentElement.PaymentOptionDisplayData) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(EmbeddedPaymentElement.PaymentOptionDisplayData paymentOptionDisplayData, Continuation<? super Unit> continuation) {
                    WritableMap writableMap = paymentOptionDisplayData != null ? toWritableMap.toWritableMap(paymentOptionDisplayData) : null;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putMap("paymentOption", writableMap);
                    Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
                    embeddedPaymentElementView.requireStripeSdkModule().emitEmbeddedPaymentElementDidUpdatePaymentOption(writableMapCreateMap);
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
