package com.stripe.android.uicore.navigation;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyboardController.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberKeyboardController", "Lcom/stripe/android/uicore/navigation/KeyboardController;", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/navigation/KeyboardController;", "isKeyboardVisibleAsState", "Landroidx/compose/runtime/State;", "", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyboardControllerKt {
    public static final KeyboardController rememberKeyboardController(Composer composer, int i) {
        composer.startReplaceGroup(-443494456);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-443494456, i, -1, "com.stripe.android.uicore.navigation.rememberKeyboardController (KeyboardController.kt:36)");
        }
        ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localSoftwareKeyboardController);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) objConsume;
        State<Boolean> stateIsKeyboardVisibleAsState = isKeyboardVisibleAsState(composer, 0);
        composer.startReplaceGroup(-268282668);
        boolean zChanged = composer.changed(softwareKeyboardController);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.stripe.android.uicore.navigation.KeyboardControllerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KeyboardControllerKt.rememberKeyboardController$lambda$1$lambda$0(softwareKeyboardController);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        KeyboardController keyboardController = new KeyboardController((Function0) objRememberedValue, stateIsKeyboardVisibleAsState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return keyboardController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberKeyboardController$lambda$1$lambda$0(SoftwareKeyboardController softwareKeyboardController) {
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }

    private static final State<Boolean> isKeyboardVisibleAsState(Composer composer, int i) {
        composer.startReplaceGroup(-1707824022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1707824022, i, -1, "com.stripe.android.uicore.navigation.isKeyboardVisibleAsState (KeyboardController.kt:49)");
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final View view = (View) objConsume;
        composer.startReplaceGroup(-411248270);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-411245819);
        boolean zChangedInstance = composer.changedInstance(view);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.navigation.KeyboardControllerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KeyboardControllerKt.isKeyboardVisibleAsState$lambda$6$lambda$5(view, mutableState, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.DisposableEffect(view, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult isKeyboardVisibleAsState$lambda$6$lambda$5(final View view, final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.stripe.android.uicore.navigation.KeyboardControllerKt$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                KeyboardControllerKt.isKeyboardVisibleAsState$lambda$6$lambda$5$lambda$3(view, mutableState);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return new DisposableEffectResult() { // from class: com.stripe.android.uicore.navigation.KeyboardControllerKt$isKeyboardVisibleAsState$lambda$6$lambda$5$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isKeyboardVisibleAsState$lambda$6$lambda$5$lambda$3(View view, MutableState mutableState) {
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        mutableState.setValue(Boolean.valueOf(rootWindowInsets != null ? rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime()) : true));
    }
}
