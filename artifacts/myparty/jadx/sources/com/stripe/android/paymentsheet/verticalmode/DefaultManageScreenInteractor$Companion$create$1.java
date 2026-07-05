package com.stripe.android.paymentsheet.verticalmode;

import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ManageScreenInteractor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class DefaultManageScreenInteractor$Companion$create$1 extends FunctionReferenceImpl implements Function0<Unit> {
    DefaultManageScreenInteractor$Companion$create$1(Object obj) {
        super(0, obj, SavedPaymentMethodMutator.class, "toggleEditing", "toggleEditing()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SavedPaymentMethodMutator) this.receiver).toggleEditing();
    }
}
