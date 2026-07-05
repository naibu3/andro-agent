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

/* compiled from: SetAsDefaultPaymentMethodElementUI.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {SetAsDefaultPaymentMethodElementUIKt.SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG, "", "SetAsDefaultPaymentMethodElementUI", "", ViewProps.ENABLED, "", "element", "Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "payments-ui-core_release", "checked", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "shouldShow"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetAsDefaultPaymentMethodElementUIKt {
    public static final String SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG = "SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SetAsDefaultPaymentMethodElementUI$lambda$5(boolean z, SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SetAsDefaultPaymentMethodElementUI(z, setAsDefaultPaymentMethodElement, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SetAsDefaultPaymentMethodElementUI(boolean z, final SetAsDefaultPaymentMethodElement element, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(element, "element");
        Composer composerStartRestartGroup = composer.startRestartGroup(-132865092);
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
                ComposerKt.traceEventStart(-132865092, i3, -1, "com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElementUI (SetAsDefaultPaymentMethodElementUI.kt:19)");
            }
            final SetAsDefaultPaymentMethodController controller = element.getController();
            final State stateCollectAsState = StateFlowsComposeKt.collectAsState(controller.getSetAsDefaultPaymentMethodChecked(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(controller.getLabel(), null, composerStartRestartGroup, 0, 1);
            if (SetAsDefaultPaymentMethodElementUI$lambda$2(StateFlowsComposeKt.collectAsState(element.getShouldShowElementFlow(), null, composerStartRestartGroup, 0, 1))) {
                boolean zSetAsDefaultPaymentMethodElementUI$lambda$0 = SetAsDefaultPaymentMethodElementUI$lambda$0(stateCollectAsState);
                String strResolve = ResolvableStringComposeUtilsKt.resolve(SetAsDefaultPaymentMethodElementUI$lambda$1(stateCollectAsState2), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1206117081);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(controller) | composerStartRestartGroup.changed(stateCollectAsState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SetAsDefaultPaymentMethodElementUIKt.SetAsDefaultPaymentMethodElementUI$lambda$4$lambda$3(controller, stateCollectAsState, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                z2 = z;
                CheckboxElementUIKt.CheckboxElementUI(modifier3, SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG, zSetAsDefaultPaymentMethodElementUI$lambda$0, strResolve, z2, (Function1) objRememberedValue, composerStartRestartGroup, ((i3 >> 6) & 14) | 48 | ((i3 << 12) & 57344), 0);
            } else {
                z2 = z;
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SetAsDefaultPaymentMethodElementUIKt.SetAsDefaultPaymentMethodElementUI$lambda$5(z3, element, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SetAsDefaultPaymentMethodElementUI$lambda$4$lambda$3(SetAsDefaultPaymentMethodController setAsDefaultPaymentMethodController, State state, boolean z) {
        setAsDefaultPaymentMethodController.onValueChange(!SetAsDefaultPaymentMethodElementUI$lambda$0(state));
        return Unit.INSTANCE;
    }

    private static final boolean SetAsDefaultPaymentMethodElementUI$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final ResolvableString SetAsDefaultPaymentMethodElementUI$lambda$1(State<? extends ResolvableString> state) {
        return state.getValue();
    }

    private static final boolean SetAsDefaultPaymentMethodElementUI$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
