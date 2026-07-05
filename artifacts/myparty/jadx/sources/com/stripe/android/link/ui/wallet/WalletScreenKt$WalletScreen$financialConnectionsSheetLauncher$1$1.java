package com.stripe.android.link.ui.wallet;

import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class WalletScreenKt$WalletScreen$financialConnectionsSheetLauncher$1$1 extends FunctionReferenceImpl implements Function1<FinancialConnectionsSheetResult, Unit> {
    WalletScreenKt$WalletScreen$financialConnectionsSheetLauncher$1$1(Object obj) {
        super(1, obj, WalletViewModel.class, "onFinancialConnectionsResult", "onFinancialConnectionsResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        invoke2(financialConnectionsSheetResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FinancialConnectionsSheetResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((WalletViewModel) this.receiver).onFinancialConnectionsResult(p0);
    }
}
