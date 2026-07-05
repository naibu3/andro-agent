package com.stripe.android.ui.core;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.ui.core.elements.AffirmElementUIKt;
import com.stripe.android.ui.core.elements.AffirmHeaderElement;
import com.stripe.android.ui.core.elements.AfterpayClearpayElementUIKt;
import com.stripe.android.ui.core.elements.AfterpayClearpayHeaderElement;
import com.stripe.android.ui.core.elements.AuBecsDebitMandateElementUIKt;
import com.stripe.android.ui.core.elements.AuBecsDebitMandateTextElement;
import com.stripe.android.ui.core.elements.BsbElement;
import com.stripe.android.ui.core.elements.BsbElementUIKt;
import com.stripe.android.ui.core.elements.CardDetailsSectionController;
import com.stripe.android.ui.core.elements.CardDetailsSectionElement;
import com.stripe.android.ui.core.elements.CardDetailsSectionElementUIKt;
import com.stripe.android.ui.core.elements.EmptyFormElement;
import com.stripe.android.ui.core.elements.MandateTextElement;
import com.stripe.android.ui.core.elements.MandateTextUIKt;
import com.stripe.android.ui.core.elements.RenderableFormElement;
import com.stripe.android.ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.ui.core.elements.SaveForFutureUseElementUIKt;
import com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElement;
import com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElementUIKt;
import com.stripe.android.ui.core.elements.StaticTextElement;
import com.stripe.android.ui.core.elements.StaticTextElementUIKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.CheckboxFieldController;
import com.stripe.android.uicore.elements.CheckboxFieldElement;
import com.stripe.android.uicore.elements.CheckboxFieldUIKt;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.OTPElementUIKt;
import com.stripe.android.uicore.elements.SameAsShippingController;
import com.stripe.android.uicore.elements.SameAsShippingElement;
import com.stripe.android.uicore.elements.SameAsShippingElementUIKt;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionElementUIKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FormUI.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a]\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001aE\u0010\u0000\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0013\u001aM\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0002\u0010\u001a\u001a3\u0010\u001b\u001a\u00020\r*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001aO\u0010\u001b\u001a\u00020\r*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%¨\u0006&²\u0006\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u008a\u0084\u0002"}, d2 = {"FormUI", "", "hiddenIdentifiersFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "enabledFlow", "", "elementsFlow", "", "Lcom/stripe/android/uicore/elements/FormElement;", "lastTextFieldIdentifierFlow", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "hiddenIdentifiers", ViewProps.ENABLED, "elements", "lastTextFieldIdentifier", "(Ljava/util/Set;ZLjava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FormUIElement", "element", "index", "", "maxIndex", "hasVerticalCustomSpacing", "(Lcom/stripe/android/uicore/elements/FormElement;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V", "formVerticalPadding", "vertical", "Landroidx/compose/ui/unit/Dp;", "formVerticalPadding-M2VBTUQ", "(Landroidx/compose/ui/Modifier;ZIIF)Landroidx/compose/ui/Modifier;", "top", "bottom", ViewProps.START, ViewProps.END, "formVerticalPadding-D6kDfKQ", "(Landroidx/compose/ui/Modifier;ZIIFFFF)Landroidx/compose/ui/Modifier;", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormUI$lambda$4(StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FormUI((StateFlow<? extends Set<IdentifierSpec>>) stateFlow, (StateFlow<Boolean>) stateFlow2, (StateFlow<? extends List<? extends FormElement>>) stateFlow3, (StateFlow<IdentifierSpec>) stateFlow4, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormUI$lambda$9(Set set, boolean z, List list, IdentifierSpec identifierSpec, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FormUI((Set<IdentifierSpec>) set, z, (List<? extends FormElement>) list, identifierSpec, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormUIElement$lambda$10(FormElement formElement, int i, int i2, boolean z, boolean z2, Set set, IdentifierSpec identifierSpec, int i3, Composer composer, int i4) {
        FormUIElement(formElement, i, i2, z, z2, set, identifierSpec, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FormUI(final StateFlow<? extends Set<IdentifierSpec>> hiddenIdentifiersFlow, final StateFlow<Boolean> enabledFlow, final StateFlow<? extends List<? extends FormElement>> elementsFlow, final StateFlow<IdentifierSpec> lastTextFieldIdentifierFlow, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(hiddenIdentifiersFlow, "hiddenIdentifiersFlow");
        Intrinsics.checkNotNullParameter(enabledFlow, "enabledFlow");
        Intrinsics.checkNotNullParameter(elementsFlow, "elementsFlow");
        Intrinsics.checkNotNullParameter(lastTextFieldIdentifierFlow, "lastTextFieldIdentifierFlow");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1475980057);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(hiddenIdentifiersFlow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(enabledFlow) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(elementsFlow) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lastTextFieldIdentifierFlow) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1475980057, i3, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:54)");
                }
                FormUI(FormUI$lambda$0(StateFlowsComposeKt.collectAsState(hiddenIdentifiersFlow, null, composerStartRestartGroup, i3 & 14, 1)), FormUI$lambda$1(StateFlowsComposeKt.collectAsState(enabledFlow, null, composerStartRestartGroup, (i3 >> 3) & 14, 1)), FormUI$lambda$2(StateFlowsComposeKt.collectAsState(elementsFlow, null, composerStartRestartGroup, (i3 >> 6) & 14, 1)), FormUI$lambda$3(StateFlowsComposeKt.collectAsState(lastTextFieldIdentifierFlow, null, composerStartRestartGroup, (i3 >> 9) & 14, 1)), modifier4, composerStartRestartGroup, (IdentifierSpec.$stable << 9) | (i3 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.FormUIKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FormUIKt.FormUI$lambda$4(hiddenIdentifiersFlow, enabledFlow, elementsFlow, lastTextFieldIdentifierFlow, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            FormUI(FormUI$lambda$0(StateFlowsComposeKt.collectAsState(hiddenIdentifiersFlow, null, composerStartRestartGroup, i3 & 14, 1)), FormUI$lambda$1(StateFlowsComposeKt.collectAsState(enabledFlow, null, composerStartRestartGroup, (i3 >> 3) & 14, 1)), FormUI$lambda$2(StateFlowsComposeKt.collectAsState(elementsFlow, null, composerStartRestartGroup, (i3 >> 6) & 14, 1)), FormUI$lambda$3(StateFlowsComposeKt.collectAsState(lastTextFieldIdentifierFlow, null, composerStartRestartGroup, (i3 >> 9) & 14, 1)), modifier4, composerStartRestartGroup, (IdentifierSpec.$stable << 9) | (i3 & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FormUI(final Set<IdentifierSpec> hiddenIdentifiers, final boolean z, final List<? extends FormElement> elements, final IdentifierSpec identifierSpec, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        Float f;
        Arrangement.HorizontalOrVertical top;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Composer composerStartRestartGroup = composer.startRestartGroup(1527302195);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(hiddenIdentifiers) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(elements) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(identifierSpec) : composerStartRestartGroup.changedInstance(identifierSpec) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i3;
                if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1527302195, i5, -1, "com.stripe.android.ui.core.FormUI (FormUI.kt:77)");
                    }
                    ProvidableCompositionLocal<Float> localSectionSpacing = StripeThemeKt.getLocalSectionSpacing();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localSectionSpacing);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    f = (Float) objConsume;
                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
                    if (f == null) {
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f.floatValue()));
                        if (horizontalOrVerticalM900spacedBy0680j_4 != null) {
                            top = horizontalOrVerticalM900spacedBy0680j_4;
                        } else {
                            top = Arrangement.INSTANCE.getTop();
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = elements.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            FormElement formElement = (FormElement) next;
                            if ((hiddenIdentifiers.contains(formElement.getIdentifier()) || (formElement instanceof EmptyFormElement)) ? false : true) {
                                arrayList.add(next);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        composerStartRestartGroup.startReplaceGroup(-1230439477);
                        int i6 = 0;
                        for (Object obj : arrayList2) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            FormUIElement((FormElement) obj, i6, arrayList2.size() - 1, z2, f != null, hiddenIdentifiers, identifierSpec, composerStartRestartGroup, ((i5 << 6) & 7168) | ((i5 << 15) & 458752) | (IdentifierSpec.$stable << 18) | ((i5 << 9) & 3670016));
                            z2 = z;
                            i6 = i7;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.FormUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return FormUIKt.FormUI$lambda$9(hiddenIdentifiers, z, elements, identifierSpec, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            i5 = i3;
            if ((i5 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Float> localSectionSpacing2 = StripeThemeKt.getLocalSectionSpacing();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localSectionSpacing2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                f = (Float) objConsume2;
                Modifier modifierFillMaxWidth2 = SizeKt.fillMaxWidth(modifier4, 1.0f);
                if (f == null) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((i5 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0355  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FormUIElement(final FormElement formElement, final int i, final int i2, boolean z, final boolean z2, final Set<IdentifierSpec> set, final IdentifierSpec identifierSpec, Composer composer, final int i3) {
        int i4;
        Set<IdentifierSpec> set2;
        Composer composer2;
        boolean z3 = z;
        Composer composerStartRestartGroup = composer.startRestartGroup(1087363646);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(formElement) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            set2 = set;
            i4 |= composerStartRestartGroup.changedInstance(set2) ? 131072 : 65536;
        } else {
            set2 = set;
        }
        if ((1572864 & i3) == 0) {
            i4 |= (2097152 & i3) == 0 ? composerStartRestartGroup.changed(identifierSpec) : composerStartRestartGroup.changedInstance(identifierSpec) ? 1048576 : 524288;
        }
        int i5 = i4;
        if ((599187 & i5) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1087363646, i5, -1, "com.stripe.android.ui.core.FormUIElement (FormUI.kt:114)");
            }
            if (!(formElement instanceof SectionElement)) {
                if (formElement instanceof CheckboxFieldElement) {
                    composerStartRestartGroup.startReplaceGroup(373317807);
                    CheckboxFieldUIKt.CheckboxFieldUI(m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(4)), ((CheckboxFieldElement) formElement).getController(), z, composerStartRestartGroup, (CheckboxFieldController.$stable << 3) | ((i5 >> 3) & 896), 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (formElement instanceof StaticTextElement) {
                    composerStartRestartGroup.startReplaceGroup(373329671);
                    StaticTextElementUIKt.StaticTextElementUI((StaticTextElement) formElement, m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(8)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (formElement instanceof SaveForFutureUseElement) {
                    composerStartRestartGroup.startReplaceGroup(-1311345642);
                    SaveForFutureUseElementUIKt.SaveForFutureUseElementUI(z, (SaveForFutureUseElement) formElement, m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(4)), composerStartRestartGroup, (i5 >> 9) & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (formElement instanceof SetAsDefaultPaymentMethodElement) {
                    composerStartRestartGroup.startReplaceGroup(-1310964435);
                    SetAsDefaultPaymentMethodElementUIKt.SetAsDefaultPaymentMethodElementUI(z, (SetAsDefaultPaymentMethodElement) formElement, m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(4)), composerStartRestartGroup, (i5 >> 9) & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (formElement instanceof SameAsShippingElement) {
                        composerStartRestartGroup.startReplaceGroup(373365017);
                        SameAsShippingElementUIKt.SameAsShippingElementUI(((SameAsShippingElement) formElement).getController(), m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(4)), composerStartRestartGroup, SameAsShippingController.$stable, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        z3 = z;
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        if (formElement instanceof AfterpayClearpayHeaderElement) {
                            composerStartRestartGroup.startReplaceGroup(373376704);
                            float f = 4;
                            z3 = z;
                            AfterpayClearpayElementUIKt.AfterpayClearpayElementUI(z3, (AfterpayClearpayHeaderElement) formElement, m8623formVerticalPaddingD6kDfKQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(8), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f)), composerStartRestartGroup, (i5 >> 9) & 14, 0);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = composerStartRestartGroup;
                            if (formElement instanceof AuBecsDebitMandateTextElement) {
                                composer2.startReplaceGroup(373391471);
                                AuBecsDebitMandateElementUIKt.AuBecsDebitMandateElementUI((AuBecsDebitMandateTextElement) formElement, m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(8)), composer2, 0, 0);
                                composer2.endReplaceGroup();
                            } else if (formElement instanceof AffirmHeaderElement) {
                                composer2.startReplaceGroup(373402372);
                                AffirmElementUIKt.AffirmElementUI(m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(8)), composer2, 0, 0);
                                composer2.endReplaceGroup();
                            } else if (formElement instanceof MandateTextElement) {
                                composer2.startReplaceGroup(373411977);
                                MandateTextElement mandateTextElement = (MandateTextElement) formElement;
                                MandateTextUIKt.MandateTextUI(mandateTextElement, m8624formVerticalPaddingD6kDfKQ$default(Modifier.INSTANCE, z2, i, i2, mandateTextElement.m8660getTopPaddingD9Ej5fM(), Dp.m6117constructorimpl(8), 0.0f, 0.0f, 96, null), composer2, 0, 0);
                                composer2.endReplaceGroup();
                            } else if (formElement instanceof CardDetailsSectionElement) {
                                composer2.startReplaceGroup(373424078);
                                CardDetailsSectionController controller = ((CardDetailsSectionElement) formElement).getController();
                                Modifier modifierM8625formVerticalPaddingM2VBTUQ = m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(8));
                                int i6 = i5 >> 9;
                                int i7 = (i6 & 910) | (IdentifierSpec.$stable << 9) | (i6 & 7168);
                                z3 = z;
                                CardDetailsSectionElementUIKt.CardDetailsSectionElementUI(z3, controller, set, identifierSpec, modifierM8625formVerticalPaddingM2VBTUQ, composer2, i7, 0);
                                composerStartRestartGroup = composer2;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup = composer2;
                                if (formElement instanceof BsbElement) {
                                    composerStartRestartGroup.startReplaceGroup(373439742);
                                    z3 = z;
                                    BsbElementUIKt.BsbElementUI(z3, (BsbElement) formElement, identifierSpec, m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(8)), composerStartRestartGroup, ((i5 >> 9) & 14) | (IdentifierSpec.$stable << 6) | ((i5 >> 12) & 896), 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else if (formElement instanceof OTPElement) {
                                    composerStartRestartGroup.startReplaceGroup(373452570);
                                    z3 = z;
                                    OTPElementUIKt.m8812OTPElementUIRE_urrM(z3, (OTPElement) formElement, null, null, null, 0.0f, 0.0f, null, null, 0.0f, null, composerStartRestartGroup, ((i5 >> 9) & 14) | (OTPElement.$stable << 3), 0, 2044);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    z3 = z;
                                    if (formElement instanceof RenderableFormElement) {
                                        composerStartRestartGroup.startReplaceGroup(373454958);
                                        ((RenderableFormElement) formElement).ComposeUI(z3, composerStartRestartGroup, (i5 >> 9) & 14);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-1307774938);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                }
                            }
                            z3 = z;
                        }
                        composerStartRestartGroup = composer2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(-1312519891);
                int i8 = i5 >> 9;
                SectionElementUIKt.SectionElementUI(z3, (SectionElement) formElement, set2, identifierSpec, m8625formVerticalPaddingM2VBTUQ(Modifier.INSTANCE, z2, i, i2, Dp.m6117constructorimpl(8)), composerStartRestartGroup, (i8 & 14) | (SectionElement.$stable << 3) | (i8 & 896) | (IdentifierSpec.$stable << 9) | (i8 & 7168), 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            z3 = z;
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z4 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.FormUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FormUIKt.FormUIElement$lambda$10(formElement, i, i2, z4, z2, set, identifierSpec, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: formVerticalPadding-M2VBTUQ, reason: not valid java name */
    private static final Modifier m8625formVerticalPaddingM2VBTUQ(Modifier modifier, boolean z, int i, int i2, float f) {
        return m8624formVerticalPaddingD6kDfKQ$default(modifier, z, i, i2, f, f, 0.0f, 0.0f, 96, null);
    }

    /* renamed from: formVerticalPadding-D6kDfKQ, reason: not valid java name */
    private static final Modifier m8623formVerticalPaddingD6kDfKQ(Modifier modifier, boolean z, int i, int i2, float f, float f2, float f3, float f4) {
        if (z || i2 == 0) {
            float f5 = 0;
            return PaddingKt.m1023paddingqDBjuR0(modifier, f3, Dp.m6117constructorimpl(f5), f4, Dp.m6117constructorimpl(f5));
        }
        if (i == 0) {
            return PaddingKt.m1023paddingqDBjuR0(modifier, f3, Dp.m6117constructorimpl(0), f4, f2);
        }
        if (i == i2) {
            return PaddingKt.m1023paddingqDBjuR0(modifier, f3, f, f4, Dp.m6117constructorimpl(0));
        }
        return PaddingKt.m1023paddingqDBjuR0(modifier, f3, f, f4, f2);
    }

    /* renamed from: formVerticalPadding-D6kDfKQ$default, reason: not valid java name */
    static /* synthetic */ Modifier m8624formVerticalPaddingD6kDfKQ$default(Modifier modifier, boolean z, int i, int i2, float f, float f2, float f3, float f4, int i3, Object obj) {
        return m8623formVerticalPaddingD6kDfKQ(modifier, z, i, i2, f, f2, (i3 & 32) != 0 ? Dp.m6117constructorimpl(0) : f3, (i3 & 64) != 0 ? Dp.m6117constructorimpl(0) : f4);
    }

    private static final Set<IdentifierSpec> FormUI$lambda$0(State<? extends Set<IdentifierSpec>> state) {
        return state.getValue();
    }

    private static final boolean FormUI$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final List<FormElement> FormUI$lambda$2(State<? extends List<? extends FormElement>> state) {
        return (List) state.getValue();
    }

    private static final IdentifierSpec FormUI$lambda$3(State<IdentifierSpec> state) {
        return state.getValue();
    }
}
