package com.stripe.android.link.ui.paymentmenthod;

import com.stripe.android.paymentsheet.forms.FormFieldValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PaymentMethodScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class PaymentMethodScreenKt$PaymentMethodScreen$1$1 extends FunctionReferenceImpl implements Function1<FormFieldValues, Unit> {
    PaymentMethodScreenKt$PaymentMethodScreen$1$1(Object obj) {
        super(1, obj, PaymentMethodViewModel.class, "formValuesChanged", "formValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FormFieldValues formFieldValues) {
        invoke2(formFieldValues);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FormFieldValues formFieldValues) {
        ((PaymentMethodViewModel) this.receiver).formValuesChanged(formFieldValues);
    }
}
