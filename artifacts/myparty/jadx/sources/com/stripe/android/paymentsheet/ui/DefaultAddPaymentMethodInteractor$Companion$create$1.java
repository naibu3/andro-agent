package com.stripe.android.paymentsheet.ui;

import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddPaymentMethodInteractor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class DefaultAddPaymentMethodInteractor$Companion$create$1 extends FunctionReferenceImpl implements Function1<String, FormArguments> {
    DefaultAddPaymentMethodInteractor$Companion$create$1(Object obj) {
        super(1, obj, FormHelper.class, "createFormArguments", "createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FormArguments invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((FormHelper) this.receiver).createFormArguments(p0);
    }
}
