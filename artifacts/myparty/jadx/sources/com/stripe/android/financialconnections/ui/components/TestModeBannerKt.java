package com.stripe.android.financialconnections.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TestModeBanner.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"TestModeBanner", "", ViewProps.ENABLED, "", "buttonLabel", "", "onButtonClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "description", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "TestModeBannerPreviewEnabled", "(Landroidx/compose/runtime/Composer;I)V", "TestModeBannerPreviewDisabled", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TestModeBannerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TestModeBanner$lambda$1(boolean z, String str, Function0 function0, Modifier modifier, String str2, int i, int i2, Composer composer, int i3) {
        TestModeBanner(z, str, function0, modifier, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TestModeBannerPreviewDisabled$lambda$3(int i, Composer composer, int i2) {
        TestModeBannerPreviewDisabled(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TestModeBannerPreviewEnabled$lambda$2(int i, Composer composer, int i2) {
        TestModeBannerPreviewEnabled(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TestModeBanner(final boolean z, final String buttonLabel, final Function0<Unit> onButtonClick, Modifier modifier, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String str2;
        String strStringResource;
        int i4;
        Modifier modifier3;
        float disabled;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final String str3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(buttonLabel, "buttonLabel");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1420994006);
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
            i3 |= composerStartRestartGroup.changed(buttonLabel) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    str2 = str;
                    int i6 = composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    str2 = str;
                }
                i3 |= i6;
            } else {
                str2 = str;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 16) == 0) {
                        strStringResource = StringResources_androidKt.stringResource(R.string.stripe_verification_inTestMode, composerStartRestartGroup, 0);
                        Modifier modifier5 = modifier2;
                        i4 = i3 & (-57345);
                        modifier3 = modifier5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1420994006, i4, -1, "com.stripe.android.financialconnections.ui.components.TestModeBanner (TestModeBanner.kt:31)");
                    }
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(1167019282);
                        disabled = ContentAlpha.INSTANCE.getHigh(composerStartRestartGroup, ContentAlpha.$stable);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1167020022);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    float f = 8;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f));
                    Modifier modifierM1021paddingVpY3zN4 = PaddingKt.m1021paddingVpY3zN4(AlphaKt.alpha(BackgroundKt.m574backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7649getWarningLight0d7_KjU(), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12))), disabled), Dp.m6117constructorimpl(16), Dp.m6117constructorimpl(f));
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1021paddingVpY3zN4);
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
                    composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i7 = i4;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_info, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7648getWarning0d7_KjU(), 0, 2, null), composerStartRestartGroup, 48, 60);
                    String str4 = strStringResource;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m2076Text4IGK_g(str4, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium(), composer2, (i7 >> 12) & 14, 0, 65532);
                    Modifier modifier6 = modifier3;
                    androidx.compose.material.TextKt.m2076Text4IGK_g(buttonLabel, ClickableKt.m608clickableXHw0xAI$default(Modifier.INSTANCE, z, null, null, onButtonClick, 6, null), FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7643getTextAction0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getBodyMediumEmphasized(), composer2, (i7 >> 3) & 14, 0, 65528);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str3 = str4;
                    modifier4 = modifier6;
                }
                Modifier modifier7 = modifier2;
                i4 = i3;
                modifier3 = modifier7;
                strStringResource = str2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                float f2 = 8;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_42 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f2));
                Modifier modifierM1021paddingVpY3zN42 = PaddingKt.m1021paddingVpY3zN4(AlphaKt.alpha(BackgroundKt.m574backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7649getWarningLight0d7_KjU(), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12))), disabled), Dp.m6117constructorimpl(16), Dp.m6117constructorimpl(f2));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_42, centerVertically2, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1021paddingVpY3zN42);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting()) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i72 = i4;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_info, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7648getWarning0d7_KjU(), 0, 2, null), composerStartRestartGroup, 48, 60);
                    String str42 = strStringResource;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m2076Text4IGK_g(str42, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium(), composer2, (i72 >> 12) & 14, 0, 65532);
                    Modifier modifier62 = modifier3;
                    androidx.compose.material.TextKt.m2076Text4IGK_g(buttonLabel, ClickableKt.m608clickableXHw0xAI$default(Modifier.INSTANCE, z, null, null, onButtonClick, 6, null), FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7643getTextAction0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getBodyMediumEmphasized(), composer2, (i72 >> 3) & 14, 0, 65528);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str42;
                    modifier4 = modifier62;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TestModeBannerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TestModeBannerKt.TestModeBanner$lambda$1(z, buttonLabel, onButtonClick, modifier4, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 != 0) {
                }
                if ((i2 & 16) == 0) {
                    Modifier modifier72 = modifier2;
                    i4 = i3;
                    modifier3 = modifier72;
                    strStringResource = str2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                float f22 = 8;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_422 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f22));
                Modifier modifierM1021paddingVpY3zN422 = PaddingKt.m1021paddingVpY3zN4(AlphaKt.alpha(BackgroundKt.m574backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7649getWarningLight0d7_KjU(), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12))), disabled), Dp.m6117constructorimpl(16), Dp.m6117constructorimpl(f22));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy22 = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_422, centerVertically22, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1021paddingVpY3zN422);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void TestModeBannerPreviewEnabled(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1868296086);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1868296086, i, -1, "com.stripe.android.financialconnections.ui.components.TestModeBannerPreviewEnabled (TestModeBanner.kt:77)");
            }
            ThemeKt.FinancialConnectionsTheme(null, ComposableSingletons$TestModeBannerKt.INSTANCE.m7566getLambda1$financial_connections_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TestModeBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TestModeBannerKt.TestModeBannerPreviewEnabled$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TestModeBannerPreviewDisabled(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1255725289);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1255725289, i, -1, "com.stripe.android.financialconnections.ui.components.TestModeBannerPreviewDisabled (TestModeBanner.kt:93)");
            }
            ThemeKt.FinancialConnectionsTheme(null, ComposableSingletons$TestModeBannerKt.INSTANCE.m7567getLambda2$financial_connections_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.TestModeBannerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TestModeBannerKt.TestModeBannerPreviewDisabled$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
