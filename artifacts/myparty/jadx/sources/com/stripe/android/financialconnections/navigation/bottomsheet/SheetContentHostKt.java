package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.NavBackStackEntryProviderKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SheetContentHost.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aq\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006%\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nX\u008a\u0084\u0002²\u0006%\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nX\u008a\u0084\u0002"}, d2 = {"SheetContentHost", "", "Landroidx/compose/foundation/layout/ColumnScope;", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "onSheetShown", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "entry", "onSheetDismissed", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", "currentOnSheetShown", "currentOnSheetDismissed"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SheetContentHostKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContentHost$lambda$3(ColumnScope columnScope, NavBackStackEntry navBackStackEntry, ModalBottomSheetState modalBottomSheetState, SaveableStateHolder saveableStateHolder, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        SheetContentHost(columnScope, navBackStackEntry, modalBottomSheetState, saveableStateHolder, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SheetContentHost(final ColumnScope columnScope, final NavBackStackEntry navBackStackEntry, final ModalBottomSheetState sheetState, final SaveableStateHolder saveableStateHolder, final Function1<? super NavBackStackEntry, Unit> onSheetShown, final Function1<? super NavBackStackEntry, Unit> onSheetDismissed, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(onSheetShown, "onSheetShown");
        Intrinsics.checkNotNullParameter(onSheetDismissed, "onSheetDismissed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1038184713);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(navBackStackEntry) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(sheetState) : composerStartRestartGroup.changedInstance(sheetState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(saveableStateHolder) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSheetShown) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSheetDismissed) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1038184713, i3, -1, "com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHost (SheetContentHost.kt:52)");
            }
            if (navBackStackEntry != null) {
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onSheetShown, composerStartRestartGroup, (i3 >> 12) & 14);
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onSheetDismissed, composerStartRestartGroup, (i3 >> 15) & 14);
                composerStartRestartGroup.startReplaceGroup(1893394802);
                boolean zChanged = ((i3 & 896) == 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(sheetState))) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(navBackStackEntry) | composerStartRestartGroup.changed(stateRememberUpdatedState2);
                SheetContentHostKt$SheetContentHost$1$1 sheetContentHostKt$SheetContentHost$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || sheetContentHostKt$SheetContentHost$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    sheetContentHostKt$SheetContentHost$1$1RememberedValue = new SheetContentHostKt$SheetContentHost$1$1(sheetState, navBackStackEntry, stateRememberUpdatedState, stateRememberUpdatedState2, null);
                    composerStartRestartGroup.updateRememberedValue(sheetContentHostKt$SheetContentHost$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i4 = i3 >> 6;
                EffectsKt.LaunchedEffect(sheetState, navBackStackEntry, (Function2) sheetContentHostKt$SheetContentHost$1$1RememberedValue, composerStartRestartGroup, ModalBottomSheetState.$stable | (i4 & 14) | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry, saveableStateHolder, ComposableLambdaKt.rememberComposableLambda(1012492116, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHostKt.SheetContentHost.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1012492116, i5, -1, "com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHost.<anonymous> (SheetContentHost.kt:71)");
                            }
                            NavDestination destination = navBackStackEntry.getDestination();
                            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator.Destination");
                            ((BottomSheetNavigator.Destination) destination).getContent$financial_connections_release().invoke(columnScope, navBackStackEntry, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 3) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHostKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SheetContentHostKt.SheetContentHost$lambda$3(columnScope, navBackStackEntry, sheetState, saveableStateHolder, onSheetShown, onSheetDismissed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<NavBackStackEntry, Unit> SheetContentHost$lambda$0(State<? extends Function1<? super NavBackStackEntry, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<NavBackStackEntry, Unit> SheetContentHost$lambda$1(State<? extends Function1<? super NavBackStackEntry, Unit>> state) {
        return (Function1) state.getValue();
    }
}
