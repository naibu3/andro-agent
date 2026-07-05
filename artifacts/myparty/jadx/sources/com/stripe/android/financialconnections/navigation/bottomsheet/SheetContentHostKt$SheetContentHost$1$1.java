package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SheetContentHost.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHostKt$SheetContentHost$1$1", f = "SheetContentHost.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class SheetContentHostKt$SheetContentHost$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ State<Function1<NavBackStackEntry, Unit>> $currentOnSheetDismissed$delegate;
    final /* synthetic */ State<Function1<NavBackStackEntry, Unit>> $currentOnSheetShown$delegate;
    final /* synthetic */ ModalBottomSheetState $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SheetContentHostKt$SheetContentHost$1$1(ModalBottomSheetState modalBottomSheetState, NavBackStackEntry navBackStackEntry, State<? extends Function1<? super NavBackStackEntry, Unit>> state, State<? extends Function1<? super NavBackStackEntry, Unit>> state2, Continuation<? super SheetContentHostKt$SheetContentHost$1$1> continuation) {
        super(2, continuation);
        this.$sheetState = modalBottomSheetState;
        this.$backStackEntry = navBackStackEntry;
        this.$currentOnSheetShown$delegate = state;
        this.$currentOnSheetDismissed$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SheetContentHostKt$SheetContentHost$1$1(this.$sheetState, this.$backStackEntry, this.$currentOnSheetShown$delegate, this.$currentOnSheetDismissed$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SheetContentHostKt$SheetContentHost$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            Flow flowDrop = FlowKt.drop(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHostKt$SheetContentHost$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(modalBottomSheetState.isVisible());
                }
            })), 1);
            final NavBackStackEntry navBackStackEntry = this.$backStackEntry;
            final State<Function1<NavBackStackEntry, Unit>> state = this.$currentOnSheetShown$delegate;
            final State<Function1<NavBackStackEntry, Unit>> state2 = this.$currentOnSheetDismissed$delegate;
            this.label = 1;
            if (flowDrop.collect(new FlowCollector() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHostKt$SheetContentHost$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    if (z) {
                        SheetContentHostKt.SheetContentHost$lambda$0(state).invoke(navBackStackEntry);
                    } else {
                        SheetContentHostKt.SheetContentHost$lambda$1(state2).invoke(navBackStackEntry);
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
