package com.stripe.android.paymentsheet.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedPaymentMethodTab.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SavedPaymentMethodTabKt$SavedPaymentMethodTab$2 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ String $description;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ Color $iconTint;
    final /* synthetic */ boolean $isClickable;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ Integer $labelIcon;
    final /* synthetic */ String $labelText;
    final /* synthetic */ Function0<Unit> $onItemSelectedListener;
    final /* synthetic */ boolean $shouldShowDefaultBadge;
    final /* synthetic */ boolean $shouldTintLabelIcon;

    SavedPaymentMethodTabKt$SavedPaymentMethodTab$2(String str, boolean z, boolean z2, Function0<Unit> function0, int i, Color color, String str2, Integer num, boolean z3, boolean z4, boolean z5) {
        this.$labelText = str;
        this.$isSelected = z;
        this.$isClickable = z2;
        this.$onItemSelectedListener = function0;
        this.$iconRes = i;
        this.$iconTint = color;
        this.$description = str2;
        this.$labelIcon = num;
        this.$isEnabled = z3;
        this.$shouldTintLabelIcon = z4;
        this.$shouldShowDefaultBadge = z5;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope BadgedBox, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(427788175, i, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:96)");
            }
            Modifier modifierM1274selectableXHw0xAI$default = SelectableKt.m1274selectableXHw0xAI$default(TestTagKt.testTag(Modifier.INSTANCE, "SAVED_PAYMENT_METHOD_CARD_TEST_TAG_" + this.$labelText), this.$isSelected, this.$isClickable, null, this.$onItemSelectedListener, 4, null);
            composer.startReplaceGroup(1345986350);
            boolean zChanged = composer.changed(this.$isClickable);
            final boolean z = this.$isClickable;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$SavedPaymentMethodTab$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SavedPaymentMethodTabKt$SavedPaymentMethodTab$2.invoke$lambda$1$lambda$0(z, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM1274selectableXHw0xAI$default, false, (Function1) objRememberedValue, 1, null);
            boolean z2 = this.$isSelected;
            int i2 = this.$iconRes;
            Color color = this.$iconTint;
            final String str = this.$description;
            Integer num = this.$labelIcon;
            String str2 = this.$labelText;
            boolean z3 = this.$isEnabled;
            boolean z4 = this.$shouldTintLabelIcon;
            boolean z5 = this.$shouldShowDefaultBadge;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierSemantics$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SavedPaymentMethodTabKt.m8534SavedPaymentMethodCarddrOMvmE(z2, i2, color, null, composer, 0, 8);
            long jM1832getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1832getOnSurface0d7_KjU();
            float f = 4;
            float f2 = 6;
            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f2), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f2), 0.0f, 8, null);
            composer.startReplaceGroup(1159230003);
            boolean zChanged2 = composer.changed(str);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$SavedPaymentMethodTab$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SavedPaymentMethodTabKt$SavedPaymentMethodTab$2.invoke$lambda$4$lambda$3$lambda$2(str, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            LpmSelectorTextKt.m8468LpmSelectorTextFU0evQE(num, str2, jM1832getOnSurface0d7_KjU, SemanticsModifierKt.semantics$default(modifierM1024paddingqDBjuR0$default, false, (Function1) objRememberedValue2, 1, null), z3, z4, composer, 0, 0);
            composer.startReplaceGroup(1159235110);
            if (z5) {
                DefaultPaymentMethodLabelKt.DefaultPaymentMethodLabel(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f2), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f2), 0.0f, 8, null), composer, 0);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(boolean z, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (!z) {
            SemanticsPropertiesKt.invisibleToUser(semantics);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, AccessibilityKt.readNumbersAsIndividualDigits(str));
        return Unit.INSTANCE;
    }
}
