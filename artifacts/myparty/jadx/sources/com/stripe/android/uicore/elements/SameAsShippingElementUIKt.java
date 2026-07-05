package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SameAsShippingElementUI.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {SameAsShippingElementUIKt.SAME_AS_SHIPPING_CHECKBOX_TEST_TAG, "", "SameAsShippingElementUI", "", "controller", "Lcom/stripe/android/uicore/elements/SameAsShippingController;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/uicore/elements/SameAsShippingController;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "stripe-ui-core_release", "checked", "", "label", "Lcom/stripe/android/core/strings/ResolvableString;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SameAsShippingElementUIKt {
    public static final String SAME_AS_SHIPPING_CHECKBOX_TEST_TAG = "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SameAsShippingElementUI$lambda$4(SameAsShippingController sameAsShippingController, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SameAsShippingElementUI(sameAsShippingController, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SameAsShippingElementUI(final SameAsShippingController controller, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer composerStartRestartGroup = composer.startRestartGroup(-181120090);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-181120090, i3, -1, "com.stripe.android.uicore.elements.SameAsShippingElementUI (SameAsShippingElementUI.kt:16)");
            }
            final State stateCollectAsState = StateFlowsComposeKt.collectAsState(controller.getValue(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(controller.getLabel(), null, composerStartRestartGroup, 0, 1);
            boolean zSameAsShippingElementUI$lambda$0 = SameAsShippingElementUI$lambda$0(stateCollectAsState);
            String strResolve = ResolvableStringComposeUtilsKt.resolve(SameAsShippingElementUI$lambda$1(stateCollectAsState2), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(119073301);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(controller) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.SameAsShippingElementUIKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SameAsShippingElementUIKt.SameAsShippingElementUI$lambda$3$lambda$2(controller, stateCollectAsState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CheckboxElementUIKt.CheckboxElementUI(modifier2, SAME_AS_SHIPPING_CHECKBOX_TEST_TAG, zSameAsShippingElementUI$lambda$0, strResolve, true, (Function1) objRememberedValue, composerStartRestartGroup, ((i3 >> 3) & 14) | 24624, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.SameAsShippingElementUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SameAsShippingElementUIKt.SameAsShippingElementUI$lambda$4(controller, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SameAsShippingElementUI$lambda$3$lambda$2(SameAsShippingController sameAsShippingController, State state, boolean z) {
        sameAsShippingController.onValueChange(!SameAsShippingElementUI$lambda$0(state));
        return Unit.INSTANCE;
    }

    private static final boolean SameAsShippingElementUI$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final ResolvableString SameAsShippingElementUI$lambda$1(State<? extends ResolvableString> state) {
        return state.getValue();
    }
}
