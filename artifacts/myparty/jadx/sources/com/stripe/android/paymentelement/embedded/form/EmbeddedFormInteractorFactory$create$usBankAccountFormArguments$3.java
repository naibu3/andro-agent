package com.stripe.android.paymentelement.embedded.form;

import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedFormInteractorFactory.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$3 extends FunctionReferenceImpl implements Function1<Function1<? super PrimaryButton.UIState, ? extends PrimaryButton.UIState>, Unit> {
    EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$3(Object obj) {
        super(1, obj, FormActivityStateHelper.class, "updatePrimaryButton", "updatePrimaryButton(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Function1<? super PrimaryButton.UIState, ? extends PrimaryButton.UIState> function1) {
        invoke2((Function1<? super PrimaryButton.UIState, PrimaryButton.UIState>) function1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Function1<? super PrimaryButton.UIState, PrimaryButton.UIState> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FormActivityStateHelper) this.receiver).updatePrimaryButton(p0);
    }
}
