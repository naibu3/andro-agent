package com.stripe.android.paymentsheet.verticalmode;

import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodVerticalLayoutInteractor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$1 extends FunctionReferenceImpl implements Function2<FormFieldValues, String, Unit> {
    DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$1(Object obj) {
        super(2, obj, FormHelper.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FormFieldValues formFieldValues, String str) {
        invoke2(formFieldValues, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FormFieldValues formFieldValues, String p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((FormHelper) this.receiver).onFormFieldValuesChanged(formFieldValues, p1);
    }
}
