package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.TextFieldIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class TextFieldUIKt$TextField$4$1 extends FunctionReferenceImpl implements Function1<TextFieldIcon.Dropdown.Item, Unit> {
    TextFieldUIKt$TextField$4$1(Object obj) {
        super(1, obj, TextFieldController.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldIcon.Dropdown.Item item) {
        invoke2(item);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TextFieldIcon.Dropdown.Item p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((TextFieldController) this.receiver).onDropdownItemClicked(p0);
    }
}
