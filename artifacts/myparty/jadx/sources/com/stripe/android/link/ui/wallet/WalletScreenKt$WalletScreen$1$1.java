package com.stripe.android.link.ui.wallet;

import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WalletScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletScreenKt$WalletScreen$1$1", f = "WalletScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class WalletScreenKt$WalletScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FinancialConnectionsSheetConfiguration $financialConnectionsSheetConfig;
    final /* synthetic */ FinancialConnectionsSheetForDataLauncher $financialConnectionsSheetLauncher;
    final /* synthetic */ WalletViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WalletScreenKt$WalletScreen$1$1(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, FinancialConnectionsSheetForDataLauncher financialConnectionsSheetForDataLauncher, WalletViewModel walletViewModel, Continuation<? super WalletScreenKt$WalletScreen$1$1> continuation) {
        super(2, continuation);
        this.$financialConnectionsSheetConfig = financialConnectionsSheetConfiguration;
        this.$financialConnectionsSheetLauncher = financialConnectionsSheetForDataLauncher;
        this.$viewModel = walletViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletScreenKt$WalletScreen$1$1(this.$financialConnectionsSheetConfig, this.$financialConnectionsSheetLauncher, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletScreenKt$WalletScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = this.$financialConnectionsSheetConfig;
        if (financialConnectionsSheetConfiguration != null) {
            FinancialConnectionsSheetForDataLauncher financialConnectionsSheetForDataLauncher = this.$financialConnectionsSheetLauncher;
            if (financialConnectionsSheetForDataLauncher != null) {
                FinancialConnectionsSheetLauncher.DefaultImpls.present$default(financialConnectionsSheetForDataLauncher, financialConnectionsSheetConfiguration, null, 2, null);
                this.$viewModel.onPresentFinancialConnections(true);
            } else {
                this.$viewModel.onPresentFinancialConnections(false);
            }
        }
        return Unit.INSTANCE;
    }
}
