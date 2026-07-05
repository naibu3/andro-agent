package com.stripe.android.paymentsheet;

import com.stripe.android.link.ui.inline.InlineSignupViewState;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.ui.AddPaymentMethodKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: DefaultFormHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "formValues", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "", "inlineSignupViewState", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultFormHelper$paymentSelection$1", f = "DefaultFormHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultFormHelper$paymentSelection$1 extends SuspendLambda implements Function3<Pair<? extends FormFieldValues, ? extends String>, InlineSignupViewState, Continuation<? super PaymentSelection>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DefaultFormHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFormHelper$paymentSelection$1(DefaultFormHelper defaultFormHelper, Continuation<? super DefaultFormHelper$paymentSelection$1> continuation) {
        super(3, continuation);
        this.this$0 = defaultFormHelper;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends FormFieldValues, ? extends String> pair, InlineSignupViewState inlineSignupViewState, Continuation<? super PaymentSelection> continuation) {
        return invoke2((Pair<FormFieldValues, String>) pair, inlineSignupViewState, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<FormFieldValues, String> pair, InlineSignupViewState inlineSignupViewState, Continuation<? super PaymentSelection> continuation) {
        DefaultFormHelper$paymentSelection$1 defaultFormHelper$paymentSelection$1 = new DefaultFormHelper$paymentSelection$1(this.this$0, continuation);
        defaultFormHelper$paymentSelection$1.L$0 = pair;
        defaultFormHelper$paymentSelection$1.L$1 = inlineSignupViewState;
        return defaultFormHelper$paymentSelection$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PaymentSelection paymentSelectionTransformToPaymentSelection;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.L$0;
        InlineSignupViewState inlineSignupViewState = (InlineSignupViewState) this.L$1;
        FormFieldValues formFieldValues = (FormFieldValues) pair.getFirst();
        PaymentSelection.New.LinkInline linkInline = null;
        if (formFieldValues == null || (paymentSelectionTransformToPaymentSelection = AddPaymentMethodKt.transformToPaymentSelection(formFieldValues, this.this$0.supportedPaymentMethodForCode((String) pair.getSecond()), this.this$0.paymentMethodMetadata)) == null) {
            return null;
        }
        if (!(paymentSelectionTransformToPaymentSelection instanceof PaymentSelection.New.Card)) {
            return paymentSelectionTransformToPaymentSelection;
        }
        if (inlineSignupViewState != null && inlineSignupViewState.getUseLink()) {
            UserInput userInput = inlineSignupViewState.getUserInput();
            if (userInput != null) {
                PaymentSelection.New.Card card = (PaymentSelection.New.Card) paymentSelectionTransformToPaymentSelection;
                linkInline = new PaymentSelection.New.LinkInline(card.getPaymentMethodCreateParams(), card.getBrand(), card.getCustomerRequestedSave(), card.getPaymentMethodOptionsParams(), card.getPaymentMethodExtraParams(), userInput);
            }
            return linkInline;
        }
        return (PaymentSelection.New) paymentSelectionTransformToPaymentSelection;
    }
}
