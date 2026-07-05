package com.stripe.android.ui.core.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.CheckboxElementUIKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveForFutureUseElementUI.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {SaveForFutureUseElementUIKt.SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG, "", "SaveForFutureUseElementUI", "", ViewProps.ENABLED, "", "element", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLcom/stripe/android/ui/core/elements/SaveForFutureUseElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "payments-ui-core_release", "checked", "label", "Lcom/stripe/android/core/strings/ResolvableString;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SaveForFutureUseElementUIKt {
    public static final String SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG = "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveForFutureUseElementUI$lambda$4(boolean z, SaveForFutureUseElement saveForFutureUseElement, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SaveForFutureUseElementUI(z, saveForFutureUseElement, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SaveForFutureUseElementUI(boolean z, final SaveForFutureUseElement element, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(element, "element");
        Composer composerStartRestartGroup = composer.startRestartGroup(1061070076);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(element) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1061070076, i3, -1, "com.stripe.android.ui.core.elements.SaveForFutureUseElementUI (SaveForFutureUseElementUI.kt:18)");
            }
            final SaveForFutureUseController controller = element.getController();
            final State stateCollectAsState = StateFlowsComposeKt.collectAsState(controller.getSaveForFutureUse(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(controller.getLabel(), null, composerStartRestartGroup, 0, 1);
            boolean zSaveForFutureUseElementUI$lambda$0 = SaveForFutureUseElementUI$lambda$0(stateCollectAsState);
            String strResolve = ResolvableStringComposeUtilsKt.resolve(SaveForFutureUseElementUI$lambda$1(stateCollectAsState2), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-230117885);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(controller) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.ui.core.elements.SaveForFutureUseElementUIKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SaveForFutureUseElementUIKt.SaveForFutureUseElementUI$lambda$3$lambda$2(controller, stateCollectAsState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            z2 = z;
            CheckboxElementUIKt.CheckboxElementUI(modifier3, SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG, zSaveForFutureUseElementUI$lambda$0, strResolve, z2, (Function1) objRememberedValue, composerStartRestartGroup, ((i3 >> 6) & 14) | 48 | ((i3 << 12) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z3 = z2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.elements.SaveForFutureUseElementUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SaveForFutureUseElementUIKt.SaveForFutureUseElementUI$lambda$4(z3, element, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SaveForFutureUseElementUI$lambda$3$lambda$2(SaveForFutureUseController saveForFutureUseController, State state, boolean z) {
        saveForFutureUseController.onValueChange(!SaveForFutureUseElementUI$lambda$0(state));
        return Unit.INSTANCE;
    }

    private static final boolean SaveForFutureUseElementUI$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final ResolvableString SaveForFutureUseElementUI$lambda$1(State<? extends ResolvableString> state) {
        return state.getValue();
    }
}
