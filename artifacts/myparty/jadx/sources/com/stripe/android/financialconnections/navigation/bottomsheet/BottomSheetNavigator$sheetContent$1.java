package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BottomSheetNavigation.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class BottomSheetNavigator$sheetContent$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ BottomSheetNavigator this$0;

    BottomSheetNavigator$sheetContent$1(BottomSheetNavigator bottomSheetNavigator) {
        this.this$0 = bottomSheetNavigator;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope columnScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        if ((i & 6) == 0) {
            i |= composer.changed(columnScope) ? 4 : 2;
        }
        if ((i & 19) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1706159018, i, -1, "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator.sheetContent.<anonymous> (BottomSheetNavigation.kt:153)");
            }
            SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composer, 0);
            final State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.this$0.getTransitionsInProgress$financial_connections_release(), null, composer, 0, 1);
            StateFlow backStack = this.this$0.getBackStack();
            composer.startReplaceGroup(-581041375);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            BottomSheetNavigator bottomSheetNavigator = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function2) new BottomSheetNavigator$sheetContent$1$retainedEntry$2$1(bottomSheetNavigator, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final State stateProduceState = SnapshotStateKt.produceState((Object) null, backStack, (Function2<? super ProduceStateScope<Object>, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 6);
            composer.startReplaceGroup(-581013952);
            if (invoke$lambda$2(stateProduceState) != null) {
                NavBackStackEntry navBackStackEntryInvoke$lambda$2 = invoke$lambda$2(stateProduceState);
                composer.startReplaceGroup(-581011888);
                boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                BottomSheetNavigator bottomSheetNavigator2 = this.this$0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = (Function2) new BottomSheetNavigator$sheetContent$1$1$1(bottomSheetNavigator2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(navBackStackEntryInvoke$lambda$2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                composer.startReplaceGroup(-581009436);
                boolean zChangedInstance3 = composer.changedInstance(this.this$0) | composer.changed(stateProduceState);
                final BottomSheetNavigator bottomSheetNavigator3 = this.this$0;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BottomSheetNavigator$sheetContent$1.invoke$lambda$5$lambda$4(bottomSheetNavigator3, stateProduceState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                BackHandlerKt.BackHandler(false, (Function0) objRememberedValue3, composer, 0, 1);
            }
            composer.endReplaceGroup();
            NavBackStackEntry navBackStackEntryInvoke$lambda$22 = invoke$lambda$2(stateProduceState);
            ModalBottomSheetState sheetState = this.this$0.getSheetState();
            composer.startReplaceGroup(-580999774);
            boolean zChanged = composer.changed(stateCollectAsState) | composer.changedInstance(this.this$0);
            final BottomSheetNavigator bottomSheetNavigator4 = this.this$0;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BottomSheetNavigator$sheetContent$1.invoke$lambda$7$lambda$6(bottomSheetNavigator4, stateCollectAsState, (NavBackStackEntry) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function1 = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-580994863);
            boolean zChanged2 = composer.changed(stateCollectAsState) | composer.changedInstance(this.this$0);
            final BottomSheetNavigator bottomSheetNavigator5 = this.this$0;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BottomSheetNavigator$sheetContent$1.invoke$lambda$9$lambda$8(bottomSheetNavigator5, stateCollectAsState, (NavBackStackEntry) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            SheetContentHostKt.SheetContentHost(columnScope, navBackStackEntryInvoke$lambda$22, sheetState, saveableStateHolderRememberSaveableStateHolder, function1, (Function1) objRememberedValue5, composer, (i & 14) | (ModalBottomSheetState.$stable << 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(BottomSheetNavigator bottomSheetNavigator, State state) {
        NavigatorState state2 = bottomSheetNavigator.getState();
        NavBackStackEntry navBackStackEntryInvoke$lambda$2 = invoke$lambda$2(state);
        Intrinsics.checkNotNull(navBackStackEntryInvoke$lambda$2);
        state2.popWithTransition(navBackStackEntryInvoke$lambda$2, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(BottomSheetNavigator bottomSheetNavigator, State state, NavBackStackEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Set<NavBackStackEntry> setInvoke$lambda$0 = invoke$lambda$0(state);
        NavigatorState state2 = bottomSheetNavigator.getState();
        Iterator<T> it2 = setInvoke$lambda$0.iterator();
        while (it2.hasNext()) {
            state2.markTransitionComplete((NavBackStackEntry) it2.next());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(BottomSheetNavigator bottomSheetNavigator, State state, NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (invoke$lambda$0(state).contains(backStackEntry)) {
            bottomSheetNavigator.getState().markTransitionComplete(backStackEntry);
        } else {
            bottomSheetNavigator.getState().pop(backStackEntry, false);
        }
        return Unit.INSTANCE;
    }

    private static final Set<NavBackStackEntry> invoke$lambda$0(State<? extends Set<NavBackStackEntry>> state) {
        return state.getValue();
    }

    private static final NavBackStackEntry invoke$lambda$2(State<NavBackStackEntry> state) {
        return state.getValue();
    }
}
