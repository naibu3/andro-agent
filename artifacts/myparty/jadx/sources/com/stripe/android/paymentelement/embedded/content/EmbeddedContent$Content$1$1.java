package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmbeddedContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.EmbeddedContent$Content$1$1", f = "EmbeddedContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class EmbeddedContent$Content$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EmbeddedContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmbeddedContent$Content$1$1(EmbeddedContent embeddedContent, Continuation<? super EmbeddedContent$Content$1$1> continuation) {
        super(2, continuation);
        this.this$0 = embeddedContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmbeddedContent$Content$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmbeddedContent$Content$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if ((this.this$0.appearance.getStyle() instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) && !this.this$0.isImmediateAction) {
                throw new IllegalArgumentException("EmbeddedPaymentElement.Builder.rowSelectionBehavior() must be set to ImmediateAction when using FlatWithDisclosure RowStyle. Use a different style or enable ImmediateAction rowSelectionBehavior");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
