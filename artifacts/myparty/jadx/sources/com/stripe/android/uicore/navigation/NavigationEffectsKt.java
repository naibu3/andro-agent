package com.stripe.android.uicore.navigation;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavHostControllerKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: NavigationEffects.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000e\u001a&\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0015²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002"}, d2 = {"NavigationEffects", "", "navigationChannel", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/stripe/android/uicore/navigation/NavigationIntent;", "navHostController", "Landroidx/navigation/NavHostController;", "keyboardController", "Lcom/stripe/android/uicore/navigation/KeyboardController;", "onPopBackStackResult", "Lkotlin/Function1;", "", "onBackStackEntryUpdated", "Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;", "(Lkotlinx/coroutines/flow/SharedFlow;Landroidx/navigation/NavHostController;Lcom/stripe/android/uicore/navigation/KeyboardController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "applyPop", "Landroidx/navigation/NavOptionsBuilder;", "currentRoute", "", "popUpTo", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "stripe-ui-core_release", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationEffectsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationEffects$lambda$5(SharedFlow sharedFlow, NavHostController navHostController, KeyboardController keyboardController, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        NavigationEffects(sharedFlow, navHostController, keyboardController, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationEffects$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationEffects(final SharedFlow<? extends NavigationIntent> navigationChannel, final NavHostController navHostController, final KeyboardController keyboardController, Function1<? super Boolean, Unit> function1, final Function1<? super NavBackStackEntryUpdate, Unit> onBackStackEntryUpdated, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Boolean, Unit> function12;
        int i4;
        Function1<? super Boolean, Unit> function13;
        Activity activity;
        State<NavBackStackEntry> stateCurrentBackStackEntryAsState;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Activity activity2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        Intrinsics.checkNotNullParameter(keyboardController, "keyboardController");
        Intrinsics.checkNotNullParameter(onBackStackEntryUpdated, "onBackStackEntryUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(-814812707);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navigationChannel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navHostController) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(keyboardController) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBackStackEntryUpdated) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i5 == 0) {
                    composerStartRestartGroup.startReplaceGroup(-1864796514);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.stripe.android.uicore.navigation.NavigationEffectsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavigationEffectsKt.NavigationEffects$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function13 = (Function1) objRememberedValue3;
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-814812707, i4, -1, "com.stripe.android.uicore.navigation.NavigationEffects (NavigationEffects.kt:24)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                activity = !(objConsume instanceof Activity) ? (Activity) objConsume : null;
                stateCurrentBackStackEntryAsState = NavHostControllerKt.currentBackStackEntryAsState(navHostController, composerStartRestartGroup, (i4 >> 3) & 14);
                NavBackStackEntry navBackStackEntryNavigationEffects$lambda$2 = NavigationEffects$lambda$2(stateCurrentBackStackEntryAsState);
                composerStartRestartGroup.startReplaceGroup(-1864788666);
                zChangedInstance = ((i4 & 57344) != 16384) | composerStartRestartGroup.changedInstance(navHostController) | composerStartRestartGroup.changed(stateCurrentBackStackEntryAsState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = (Function2) new NavigationEffectsKt$NavigationEffects$2$1(navHostController, onBackStackEntryUpdated, stateCurrentBackStackEntryAsState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(navBackStackEntryNavigationEffects$lambda$2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1864777936);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(navigationChannel) | composerStartRestartGroup.changedInstance(activity) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(navHostController) | ((i4 & 7168) == 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    activity2 = activity;
                    function12 = function13;
                    objRememberedValue2 = (Function2) new NavigationEffectsKt$NavigationEffects$3$1(navigationChannel, activity2, keyboardController, navHostController, function13, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    activity2 = activity;
                    function12 = function13;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                EffectsKt.LaunchedEffect(activity2, navHostController, navigationChannel, (Function2) objRememberedValue2, composer2, (i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function1<? super Boolean, Unit> function14 = function12;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.navigation.NavigationEffectsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavigationEffectsKt.NavigationEffects$lambda$5(navigationChannel, navHostController, keyboardController, function14, onBackStackEntryUpdated, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        function12 = function1;
        if ((i2 & 16) == 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (!(objConsume2 instanceof Activity)) {
            }
            stateCurrentBackStackEntryAsState = NavHostControllerKt.currentBackStackEntryAsState(navHostController, composerStartRestartGroup, (i4 >> 3) & 14);
            NavBackStackEntry navBackStackEntryNavigationEffects$lambda$22 = NavigationEffects$lambda$2(stateCurrentBackStackEntryAsState);
            composerStartRestartGroup.startReplaceGroup(-1864788666);
            zChangedInstance = ((i4 & 57344) != 16384) | composerStartRestartGroup.changedInstance(navHostController) | composerStartRestartGroup.changed(stateCurrentBackStackEntryAsState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = (Function2) new NavigationEffectsKt$NavigationEffects$2$1(navHostController, onBackStackEntryUpdated, stateCurrentBackStackEntryAsState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(navBackStackEntryNavigationEffects$lambda$22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1864777936);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(navigationChannel) | composerStartRestartGroup.changedInstance(activity) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(navHostController) | ((i4 & 7168) == 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    activity2 = activity;
                    function12 = function13;
                    objRememberedValue2 = (Function2) new NavigationEffectsKt$NavigationEffects$3$1(navigationChannel, activity2, keyboardController, navHostController, function13, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    EffectsKt.LaunchedEffect(activity2, navHostController, navigationChannel, (Function2) objRememberedValue2, composer2, (i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 << 6) & 896));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyPop(NavOptionsBuilder navOptionsBuilder, NavHostController navHostController, String str, final PopUpToBehavior popUpToBehavior) {
        if (popUpToBehavior instanceof PopUpToBehavior.Current) {
            if (str != null) {
                navOptionsBuilder.popUpTo(str, new Function1() { // from class: com.stripe.android.uicore.navigation.NavigationEffectsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavigationEffectsKt.applyPop$lambda$7$lambda$6(popUpToBehavior, (PopUpToBuilder) obj);
                    }
                });
            }
        } else if (popUpToBehavior instanceof PopUpToBehavior.Route) {
            navOptionsBuilder.popUpTo(((PopUpToBehavior.Route) popUpToBehavior).getRoute(), new Function1() { // from class: com.stripe.android.uicore.navigation.NavigationEffectsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavigationEffectsKt.applyPop$lambda$8(popUpToBehavior, (PopUpToBuilder) obj);
                }
            });
        } else {
            if (!Intrinsics.areEqual(popUpToBehavior, PopUpToBehavior.Start.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            navOptionsBuilder.popUpTo(navHostController.getGraph().getId(), new Function1() { // from class: com.stripe.android.uicore.navigation.NavigationEffectsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavigationEffectsKt.applyPop$lambda$9(popUpToBehavior, (PopUpToBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyPop$lambda$7$lambda$6(PopUpToBehavior popUpToBehavior, PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(((PopUpToBehavior.Current) popUpToBehavior).getInclusive());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyPop$lambda$8(PopUpToBehavior popUpToBehavior, PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(((PopUpToBehavior.Route) popUpToBehavior).getInclusive());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyPop$lambda$9(PopUpToBehavior popUpToBehavior, PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(popUpToBehavior.getInclusive());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavBackStackEntry NavigationEffects$lambda$2(State<NavBackStackEntry> state) {
        return state.getValue();
    }
}
