package com.stripe.android.link.ui.verification;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VerificationDialog.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class VerificationDialogKt$VerificationDialog$4$1 extends FunctionReferenceImpl implements Function0<Unit> {
    VerificationDialogKt$VerificationDialog$4$1(Object obj) {
        super(0, obj, VerificationViewModel.class, "onFocusRequested", "onFocusRequested()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((VerificationViewModel) this.receiver).onFocusRequested();
    }
}
