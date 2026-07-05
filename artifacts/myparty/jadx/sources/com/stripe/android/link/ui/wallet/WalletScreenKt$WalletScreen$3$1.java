package com.stripe.android.link.ui.wallet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WalletScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class WalletScreenKt$WalletScreen$3$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    WalletScreenKt$WalletScreen$3$1(Object obj) {
        super(1, obj, WalletViewModel.class, "onExpandedChanged", "onExpandedChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((WalletViewModel) this.receiver).onExpandedChanged(z);
    }
}
