package com.stripe.android.uicore.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillNode;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutofillModifier.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\u0016\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u008a\u0084\u0002"}, d2 = {"autofill", "Landroidx/compose/ui/Modifier;", "types", "", "Landroidx/compose/ui/autofill/AutofillType;", "onFill", "Lkotlin/Function1;", "", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "stripe-ui-core_release", "currentOnFill"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutofillModifierKt {
    public static final Modifier autofill(Modifier modifier, List<? extends AutofillType> types, Function1<? super String, Unit> onFill, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(onFill, "onFill");
        composer.startReplaceGroup(-322372817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-322372817, i, -1, "com.stripe.android.uicore.text.autofill (AutofillModifier.kt:23)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onFill, composer, (i >> 6) & 14);
        composer.startReplaceGroup(-1148860887);
        boolean zChanged = composer.changed(types);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object autofillNode = new AutofillNode(types, null, autofill$lambda$0(stateRememberUpdatedState), 2, null);
            composer.updateRememberedValue(autofillNode);
            objRememberedValue = autofillNode;
        }
        final AutofillNode autofillNode2 = (AutofillNode) objRememberedValue;
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Autofill> localAutofill = CompositionLocalsKt.getLocalAutofill();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localAutofill);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Autofill autofill = (Autofill) objConsume;
        ProvidableCompositionLocal<AutofillTree> localAutofillTree = CompositionLocalsKt.getLocalAutofillTree();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localAutofillTree);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ((AutofillTree) objConsume2).plusAssign(autofillNode2);
        composer.startReplaceGroup(-1148853015);
        boolean zChangedInstance = composer.changedInstance(autofillNode2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.text.AutofillModifierKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutofillModifierKt.autofill$lambda$3$lambda$2(autofillNode2, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (Function1) objRememberedValue2);
        composer.startReplaceGroup(-1148850260);
        boolean zChangedInstance2 = composer.changedInstance(autofillNode2) | composer.changedInstance(autofill);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.stripe.android.uicore.text.AutofillModifierKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutofillModifierKt.autofill$lambda$6$lambda$5(autofillNode2, autofill, (FocusState) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierOnGloballyPositioned, (Function1) objRememberedValue3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierOnFocusChanged;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit autofill$lambda$3$lambda$2(AutofillNode autofillNode, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        autofillNode.setBoundingBox(LayoutCoordinatesKt.boundsInWindow(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit autofill$lambda$6$lambda$5(AutofillNode autofillNode, Autofill autofill, FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (autofillNode.getBoundingBox() != null && autofill != null) {
            if (focusState.isFocused()) {
                autofill.requestAutofillForNode(autofillNode);
            } else {
                autofill.cancelAutofillForNode(autofillNode);
            }
        }
        return Unit.INSTANCE;
    }

    private static final Function1<String, Unit> autofill$lambda$0(State<? extends Function1<? super String, Unit>> state) {
        return (Function1) state.getValue();
    }
}
