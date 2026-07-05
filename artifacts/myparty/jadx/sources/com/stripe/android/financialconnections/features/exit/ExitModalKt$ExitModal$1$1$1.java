package com.stripe.android.financialconnections.features.exit;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ExitModal.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class ExitModalKt$ExitModal$1$1$1 extends AdaptedFunctionReference implements Function0<Unit> {
    ExitModalKt$ExitModal$1$1$1(Object obj) {
        super(0, obj, ExitViewModel.class, "onCloseConfirm", "onCloseConfirm()Lkotlinx/coroutines/Job;", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ExitViewModel) this.receiver).onCloseConfirm();
    }
}
