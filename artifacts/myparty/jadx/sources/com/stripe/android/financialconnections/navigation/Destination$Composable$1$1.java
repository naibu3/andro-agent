package com.stripe.android.financialconnections.navigation;

import androidx.compose.runtime.MutableState;
import androidx.navigation.NavBackStackEntry;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Destination.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.navigation.Destination$Composable$1$1", f = "Destination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class Destination$Composable$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavBackStackEntry $navBackStackEntry;
    final /* synthetic */ MutableState<Boolean> $paneLaunchedTriggered$delegate;
    final /* synthetic */ FinancialConnectionsSheetNativeViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Destination$Composable$1$1(NavBackStackEntry navBackStackEntry, FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, MutableState<Boolean> mutableState, Continuation<? super Destination$Composable$1$1> continuation) {
        super(2, continuation);
        this.$navBackStackEntry = navBackStackEntry;
        this.$viewModel = financialConnectionsSheetNativeViewModel;
        this.$paneLaunchedTriggered$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Destination$Composable$1$1(this.$navBackStackEntry, this.$viewModel, this.$paneLaunchedTriggered$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Destination$Composable$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FinancialConnectionsSessionManifest.Pane paneReferrer$financial_connections_release = Destination.INSTANCE.referrer$financial_connections_release(this.$navBackStackEntry.getArguments());
        this.$viewModel.onPaneLaunched(DestinationMappersKt.getPane(this.$navBackStackEntry.getDestination()), paneReferrer$financial_connections_release);
        Destination.Composable$lambda$7(this.$paneLaunchedTriggered$delegate, true);
        return Unit.INSTANCE;
    }
}
