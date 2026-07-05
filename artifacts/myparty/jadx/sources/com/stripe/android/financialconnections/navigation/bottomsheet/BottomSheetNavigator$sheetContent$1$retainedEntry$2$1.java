package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.runtime.ProduceStateScope;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BottomSheetNavigation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "Landroidx/navigation/NavBackStackEntry;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1", f = "BottomSheetNavigation.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class BottomSheetNavigator$sheetContent$1$retainedEntry$2$1 extends SuspendLambda implements Function2<ProduceStateScope<NavBackStackEntry>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BottomSheetNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomSheetNavigator$sheetContent$1$retainedEntry$2$1(BottomSheetNavigator bottomSheetNavigator, Continuation<? super BottomSheetNavigator$sheetContent$1$retainedEntry$2$1> continuation) {
        super(2, continuation);
        this.this$0 = bottomSheetNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BottomSheetNavigator$sheetContent$1$retainedEntry$2$1 bottomSheetNavigator$sheetContent$1$retainedEntry$2$1 = new BottomSheetNavigator$sheetContent$1$retainedEntry$2$1(this.this$0, continuation);
        bottomSheetNavigator$sheetContent$1$retainedEntry$2$1.L$0 = obj;
        return bottomSheetNavigator$sheetContent$1$retainedEntry$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProduceStateScope<NavBackStackEntry> produceStateScope, Continuation<? super Unit> continuation) {
        return ((BottomSheetNavigator$sheetContent$1$retainedEntry$2$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            this.label = 1;
            if (FlowKt.flow(new BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1(this.this$0.getBackStack(), null, this.this$0)).collect(new FlowCollector() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((NavBackStackEntry) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(NavBackStackEntry navBackStackEntry, Continuation<? super Unit> continuation) {
                    produceStateScope.setValue(navBackStackEntry);
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
