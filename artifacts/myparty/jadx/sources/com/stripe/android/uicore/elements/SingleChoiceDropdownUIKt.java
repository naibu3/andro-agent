package com.stripe.android.uicore.elements;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.AndroidMenu_androidKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.strings.ResolvableString;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleChoiceDropdownUI.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001as\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aI\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00052\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\"\u0010\u0010\u001f\u001a\u00020\u00168\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"SingleChoiceDropdown", "", "TDropdownChoice", "Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;", "expanded", "", "title", "Lcom/stripe/android/core/strings/ResolvableString;", "currentChoice", "choices", "", "onChoiceSelected", "Lkotlin/Function1;", "headerTextColor", "Landroidx/compose/ui/graphics/Color;", "optionTextColor", "onDismiss", "Lkotlin/Function0;", "SingleChoiceDropdown-WMdw5o4", "(ZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;Ljava/util/List;Lkotlin/jvm/functions/Function1;JJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Choice", "label", "", PaymentSheetAppearanceKeys.ICON, "", "isSelected", "currentTextColor", ViewProps.ENABLED, ViewProps.ON_CLICK, "Choice-fWhpE4E", "(Ljava/lang/String;Ljava/lang/Integer;ZJZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", SingleChoiceDropdownUIKt.TEST_TAG_DROP_DOWN_CHOICE, "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SingleChoiceDropdownUIKt {
    public static final String TEST_TAG_DROP_DOWN_CHOICE = "TEST_TAG_DROP_DOWN_CHOICE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Choice_fWhpE4E$lambda$7(String str, Integer num, boolean z, long j, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        m8834ChoicefWhpE4E(str, num, z, j, z2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceDropdown_WMdw5o4$lambda$0(boolean z, ResolvableString resolvableString, SingleChoiceDropdownItem singleChoiceDropdownItem, List list, Function1 function1, long j, long j2, Function0 function0, int i, Composer composer, int i2) {
        m8835SingleChoiceDropdownWMdw5o4(z, resolvableString, singleChoiceDropdownItem, list, function1, j, j2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: SingleChoiceDropdown-WMdw5o4, reason: not valid java name */
    public static final <TDropdownChoice extends SingleChoiceDropdownItem> void m8835SingleChoiceDropdownWMdw5o4(final boolean z, final ResolvableString title, final TDropdownChoice tdropdownchoice, final List<? extends TDropdownChoice> choices, final Function1<? super TDropdownChoice, Unit> onChoiceSelected, final long j, final long j2, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(choices, "choices");
        Intrinsics.checkNotNullParameter(onChoiceSelected, "onChoiceSelected");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1512223510);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(title) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(tdropdownchoice) : composerStartRestartGroup.changedInstance(tdropdownchoice) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(choices) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onChoiceSelected) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1512223510, i2, -1, "com.stripe.android.uicore.elements.SingleChoiceDropdown (SingleChoiceDropdownUI.kt:44)");
            }
            int i3 = i2;
            composer2 = composerStartRestartGroup;
            AndroidMenu_androidKt.m1755DropdownMenu4kj_NE(z, onDismiss, null, 0L, null, null, ComposableLambdaKt.rememberComposableLambda(-2072682231, true, new SingleChoiceDropdownUIKt$SingleChoiceDropdown$1(title, j, choices, tdropdownchoice, j2, onChoiceSelected), composerStartRestartGroup, 54), composer2, (i3 & 14) | 1572864 | ((i3 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.SingleChoiceDropdownUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SingleChoiceDropdownUIKt.SingleChoiceDropdown_WMdw5o4$lambda$0(z, title, tdropdownchoice, choices, onChoiceSelected, j, j2, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ce  */
    /* renamed from: Choice-fWhpE4E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8834ChoicefWhpE4E(final String str, final Integer num, final boolean z, final long j, final boolean z2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        final Function0<Unit> function03;
        boolean z3;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z4;
        int i5;
        int i6;
        Composer composer2;
        FontWeight normal;
        Composer composer3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(252925629);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
            }
            i4 = i3;
            if ((74899 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                if (i7 == 0) {
                    composerStartRestartGroup.startReplaceGroup(-1742393902);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.stripe.android.uicore.elements.SingleChoiceDropdownUIKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function03 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    function03 = function02;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(252925629, i4, -1, "com.stripe.android.uicore.elements.Choice (SingleChoiceDropdownUI.kt:78)");
                }
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Modifier modifierM1061requiredSizeInqDBjuR0$default = SizeKt.m1061requiredSizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(48), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceGroup(-1742385315);
                z3 = (458752 & i4) == 131072;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.uicore.elements.SingleChoiceDropdownUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SingleChoiceDropdownUIKt.Choice_fWhpE4E$lambda$4$lambda$3(function03);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function05 = function03;
                Modifier modifierTestTag = TestTagKt.testTag(ClickableKt.m608clickableXHw0xAI$default(modifierM1061requiredSizeInqDBjuR0$default, z2, null, null, (Function0) objRememberedValue, 6, null), "TEST_TAG_DROP_DOWN_CHOICE_" + str);
                composerStartRestartGroup.startReplaceGroup(-1742382310);
                float disabled = !z2 ? 1.0f : ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAlpha = AlphaKt.alpha(modifierTestTag, disabled);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(677686788);
                if (num != null) {
                    composer2 = composerStartRestartGroup;
                    i5 = i4;
                    i6 = 16;
                    z4 = false;
                } else {
                    z4 = false;
                    i5 = i4;
                    i6 = 16;
                    ImageKt.Image(PainterResources_androidKt.painterResource(num.intValue(), composerStartRestartGroup, 0), (String) null, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(13), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
                float f = i6;
                Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceGroup(677697265);
                long jM1833getPrimary0d7_KjU = !z ? MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1833getPrimary0d7_KjU() : j;
                composer2.endReplaceGroup();
                if (!z) {
                    normal = FontWeight.INSTANCE.getBold();
                } else {
                    normal = FontWeight.INSTANCE.getNormal();
                }
                Composer composer4 = composer2;
                TextKt.m2076Text4IGK_g(str, modifierM1024paddingqDBjuR0$default, jM1833getPrimary0d7_KjU, 0L, (FontStyle) null, normal, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, (i5 & 14) | 48, 3072, 122840);
                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0);
                composer3 = composer4;
                IconKt.m1926Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), (String) null, AlphaKt.alpha(PaddingKt.m1024paddingqDBjuR0$default(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(20)), Dp.m6117constructorimpl(8), 0.0f, Dp.m6117constructorimpl(f), 0.0f, 10, null), !z ? 1.0f : 0.0f), MaterialTheme.INSTANCE.getColors(composer4, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), composer3, 48, 0);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function04 = function05;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function04 = function02;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.SingleChoiceDropdownUIKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SingleChoiceDropdownUIKt.Choice_fWhpE4E$lambda$7(str, num, z, j, z2, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function02 = function0;
        i4 = i3;
        if ((74899 & i4) == 74898) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            Modifier modifierM1061requiredSizeInqDBjuR0$default2 = SizeKt.m1061requiredSizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(48), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(-1742385315);
            if ((458752 & i4) == 131072) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z3) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.uicore.elements.SingleChoiceDropdownUIKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SingleChoiceDropdownUIKt.Choice_fWhpE4E$lambda$4$lambda$3(function03);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Function0<Unit> function052 = function03;
                Modifier modifierTestTag2 = TestTagKt.testTag(ClickableKt.m608clickableXHw0xAI$default(modifierM1061requiredSizeInqDBjuR0$default2, z2, null, null, (Function0) objRememberedValue, 6, null), "TEST_TAG_DROP_DOWN_CHOICE_" + str);
                composerStartRestartGroup.startReplaceGroup(-1742382310);
                if (!z2) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAlpha2 = AlphaKt.alpha(modifierTestTag2, disabled);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting()) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(677686788);
                    if (num != null) {
                    }
                    composer2.endReplaceGroup();
                    float f2 = i6;
                    Modifier modifierM1024paddingqDBjuR0$default2 = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null);
                    composer2.startReplaceGroup(677697265);
                    if (!z) {
                    }
                    composer2.endReplaceGroup();
                    if (!z) {
                    }
                    Composer composer42 = composer2;
                    TextKt.m2076Text4IGK_g(str, modifierM1024paddingqDBjuR0$default2, jM1833getPrimary0d7_KjU, 0L, (FontStyle) null, normal, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer42, (i5 & 14) | 48, 3072, 122840);
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer42, 0);
                    composer3 = composer42;
                    IconKt.m1926Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), (String) null, AlphaKt.alpha(PaddingKt.m1024paddingqDBjuR0$default(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(20)), Dp.m6117constructorimpl(8), 0.0f, Dp.m6117constructorimpl(f2), 0.0f, 10, null), !z ? 1.0f : 0.0f), MaterialTheme.INSTANCE.getColors(composer42, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), composer3, 48, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function04 = function052;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Choice_fWhpE4E$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
