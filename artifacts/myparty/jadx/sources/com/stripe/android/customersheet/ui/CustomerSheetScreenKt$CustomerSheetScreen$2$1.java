package com.stripe.android.customersheet.ui;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.customersheet.CustomerSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CustomerSheetScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class CustomerSheetScreenKt$CustomerSheetScreen$2$1 extends FunctionReferenceImpl implements Function1<String, ResolvableString> {
    CustomerSheetScreenKt$CustomerSheetScreen$2$1(Object obj) {
        super(1, obj, CustomerSheetViewModel.class, "providePaymentMethodName", "providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ResolvableString invoke(String str) {
        return ((CustomerSheetViewModel) this.receiver).providePaymentMethodName(str);
    }
}
