package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcRecollectionActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class CvcRecollectionActivity$onCreate$1$1$3$1$1 extends FunctionReferenceImpl implements Function1<CvcRecollectionViewAction, Unit> {
    CvcRecollectionActivity$onCreate$1$1$3$1$1(Object obj) {
        super(1, obj, CvcRecollectionViewModel.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CvcRecollectionViewAction cvcRecollectionViewAction) {
        invoke2(cvcRecollectionViewAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CvcRecollectionViewAction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CvcRecollectionViewModel) this.receiver).handleViewAction(p0);
    }
}
