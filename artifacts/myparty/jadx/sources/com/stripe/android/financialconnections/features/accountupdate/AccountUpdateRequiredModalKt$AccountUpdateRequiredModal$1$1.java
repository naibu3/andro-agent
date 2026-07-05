package com.stripe.android.financialconnections.features.accountupdate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountUpdateRequiredModal.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AccountUpdateRequiredModalKt$AccountUpdateRequiredModal$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountUpdateRequiredModalKt$AccountUpdateRequiredModal$1$1(Object obj) {
        super(0, obj, AccountUpdateRequiredViewModel.class, "handleContinue", "handleContinue()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountUpdateRequiredViewModel) this.receiver).handleContinue();
    }
}
