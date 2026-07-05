package com.stripe.android.paymentsheet.ui;

import com.stripe.android.paymentsheet.forms.FormFieldValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PaymentMethodForm.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.ui.PaymentMethodFormKt$PaymentMethodForm$2$1", f = "PaymentMethodForm.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentMethodFormKt$PaymentMethodForm$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<FormFieldValues> $completeFormValues;
    final /* synthetic */ Function1<FormFieldValues, Unit> $onFormFieldValuesChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentMethodFormKt$PaymentMethodForm$2$1(Flow<FormFieldValues> flow, Function1<? super FormFieldValues, Unit> function1, Continuation<? super PaymentMethodFormKt$PaymentMethodForm$2$1> continuation) {
        super(2, continuation);
        this.$completeFormValues = flow;
        this.$onFormFieldValuesChanged = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentMethodFormKt$PaymentMethodForm$2$1(this.$completeFormValues, this.$onFormFieldValuesChanged, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentMethodFormKt$PaymentMethodForm$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.$completeFormValues);
            final Function1<FormFieldValues, Unit> function1 = this.$onFormFieldValuesChanged;
            this.label = 1;
            if (flowDistinctUntilChanged.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.PaymentMethodFormKt$PaymentMethodForm$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((FormFieldValues) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(FormFieldValues formFieldValues, Continuation<? super Unit> continuation) {
                    function1.invoke(formFieldValues);
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
        return Unit.INSTANCE;
    }
}
