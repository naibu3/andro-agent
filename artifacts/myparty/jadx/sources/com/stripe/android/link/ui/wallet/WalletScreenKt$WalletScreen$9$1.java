package com.stripe.android.link.ui.wallet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class WalletScreenKt$WalletScreen$9$1 extends FunctionReferenceImpl implements Function1<AddPaymentMethodOption, Unit> {
    WalletScreenKt$WalletScreen$9$1(Object obj) {
        super(1, obj, WalletViewModel.class, "onAddPaymentMethodOptionClicked", "onAddPaymentMethodOptionClicked(Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddPaymentMethodOption addPaymentMethodOption) {
        invoke2(addPaymentMethodOption);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddPaymentMethodOption p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((WalletViewModel) this.receiver).onAddPaymentMethodOptionClicked(p0);
    }
}
