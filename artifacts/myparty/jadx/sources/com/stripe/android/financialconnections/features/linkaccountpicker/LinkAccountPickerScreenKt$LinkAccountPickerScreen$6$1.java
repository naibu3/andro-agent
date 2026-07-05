package com.stripe.android.financialconnections.features.linkaccountpicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LinkAccountPickerScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class LinkAccountPickerScreenKt$LinkAccountPickerScreen$6$1 extends FunctionReferenceImpl implements Function0<Unit> {
    LinkAccountPickerScreenKt$LinkAccountPickerScreen$6$1(Object obj) {
        super(0, obj, LinkAccountPickerViewModel.class, "onSelectAccountsClick", "onSelectAccountsClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LinkAccountPickerViewModel) this.receiver).onSelectAccountsClick();
    }
}
