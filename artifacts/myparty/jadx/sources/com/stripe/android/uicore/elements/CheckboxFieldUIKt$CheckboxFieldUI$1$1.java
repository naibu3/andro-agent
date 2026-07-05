package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CheckboxFieldUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class CheckboxFieldUIKt$CheckboxFieldUI$1$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    CheckboxFieldUIKt$CheckboxFieldUI$1$1(Object obj) {
        super(1, obj, CheckboxFieldController.class, "onValueChange", "onValueChange(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((CheckboxFieldController) this.receiver).onValueChange(z);
    }
}
