package com.stripe.android.customersheet.ui;

import com.stripe.android.customersheet.CustomerSheetViewAction;
import com.stripe.android.customersheet.CustomerSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class CustomerSheetScreenKt$CustomerSheetScreen$1$1 extends FunctionReferenceImpl implements Function1<CustomerSheetViewAction, Unit> {
    CustomerSheetScreenKt$CustomerSheetScreen$1$1(Object obj) {
        super(1, obj, CustomerSheetViewModel.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CustomerSheetViewAction customerSheetViewAction) {
        invoke2(customerSheetViewAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CustomerSheetViewAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CustomerSheetViewModel) this.receiver).handleViewAction(p0);
    }
}
