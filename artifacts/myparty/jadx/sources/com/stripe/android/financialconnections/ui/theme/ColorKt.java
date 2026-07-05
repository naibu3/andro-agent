package com.stripe.android.financialconnections.ui.theme;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\r\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\u0010=\u001a\u001f\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0001H\u0003¢\u0006\u0004\bB\u0010C\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u0003\"\u0016\u0010\u000f\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0003\"\u0016\u0010\u0011\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0012\u0010\u0003\"\u0016\u0010\u0013\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0014\u0010\u0003\"\u0016\u0010\u0015\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0016\u0010\u0003\"\u0016\u0010\u0017\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0018\u0010\u0003\"\u0016\u0010\u0019\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001a\u0010\u0003\"\u0016\u0010\u001b\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001c\u0010\u0003\"\u0016\u0010\u001d\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001e\u0010\u0003\"\u0016\u0010\u001f\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b \u0010\u0003\"\u0016\u0010!\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\"\u0010\u0003\"\u0016\u0010#\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b$\u0010\u0003\"\u0016\u0010%\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b&\u0010\u0003\"\u0016\u0010'\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b(\u0010\u0003\"\u0016\u0010)\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b*\u0010\u0003\"\u0016\u0010+\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b,\u0010\u0003\"\u0016\u0010-\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b.\u0010\u0003\"\u0016\u0010/\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b0\u0010\u0003\"\u0016\u00101\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b2\u0010\u0003\"\u0016\u00103\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b4\u0010\u0003\"\u0016\u00105\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b6\u0010\u0003\"\u0016\u00107\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b8\u0010\u0003\"\u0016\u00109\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b:\u0010\u0003¨\u0006D"}, d2 = {"Neutral0", "Landroidx/compose/ui/graphics/Color;", "getNeutral0", "()J", "J", "Neutral0Dark", "getNeutral0Dark", "Neutral25", "getNeutral25", "Neutral25Dark", "getNeutral25Dark", "Neutral50", "getNeutral50", "Neutral50Dark", "getNeutral50Dark", "Neutral100", "getNeutral100", "Neutral100Dark", "getNeutral100Dark", "Neutral200", "getNeutral200", "Neutral600", "getNeutral600", "Neutral700", "getNeutral700", "Neutral800", "getNeutral800", "Neutral800Dark", "getNeutral800Dark", "Neutral900", "getNeutral900", "Attention50", "getAttention50", "Attention100Dark", "getAttention100Dark", "Attention300", "getAttention300", "FeedbackCritical600", "getFeedbackCritical600", "Brand25", "getBrand25", "Brand25Dark", "getBrand25Dark", "Brand400", "getBrand400", "Brand500", "getBrand500", "Brand600", "getBrand600", "LinkGreen50", "getLinkGreen50", "LinkGreen50Dark", "getLinkGreen50Dark", "LinkGreen200", "getLinkGreen200", "LinkGreen500", "getLinkGreen500", "LinkGreen900", "getLinkGreen900", "ColorsPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "ColorPreview", "colorText", "", "color", "ColorPreview-RPmYEkk", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ColorKt {
    private static final long Neutral0 = androidx.compose.ui.graphics.ColorKt.Color(4294967295L);
    private static final long Neutral0Dark = androidx.compose.ui.graphics.ColorKt.Color(4279506717L);
    private static final long Neutral25 = androidx.compose.ui.graphics.ColorKt.Color(4294309624L);
    private static final long Neutral25Dark = androidx.compose.ui.graphics.ColorKt.Color(4279967269L);
    private static final long Neutral50 = androidx.compose.ui.graphics.ColorKt.Color(4294375674L);
    private static final long Neutral50Dark = androidx.compose.ui.graphics.ColorKt.Color(4280362284L);
    private static final long Neutral100 = androidx.compose.ui.graphics.ColorKt.Color(4292402916L);
    private static final long Neutral100Dark = androidx.compose.ui.graphics.ColorKt.Color(4281020473L);
    private static final long Neutral200 = androidx.compose.ui.graphics.ColorKt.Color(4290824402L);
    private static final long Neutral600 = androidx.compose.ui.graphics.ColorKt.Color(4284047729L);
    private static final long Neutral700 = androidx.compose.ui.graphics.ColorKt.Color(4282863194L);
    private static final long Neutral800 = androidx.compose.ui.graphics.ColorKt.Color(4281678404L);
    private static final long Neutral800Dark = androidx.compose.ui.graphics.ColorKt.Color(4291415768L);
    private static final long Neutral900 = androidx.compose.ui.graphics.ColorKt.Color(4280362284L);
    private static final long Attention50 = androidx.compose.ui.graphics.ColorKt.Color(4294900186L);
    private static final long Attention100Dark = androidx.compose.ui.graphics.ColorKt.Color(4281345300L);
    private static final long Attention300 = androidx.compose.ui.graphics.ColorKt.Color(4294412047L);
    private static final long FeedbackCritical600 = androidx.compose.ui.graphics.ColorKt.Color(4290777660L);
    private static final long Brand25 = androidx.compose.ui.graphics.ColorKt.Color(4294440445L);
    private static final long Brand25Dark = androidx.compose.ui.graphics.ColorKt.Color(4279900974L);
    private static final long Brand400 = androidx.compose.ui.graphics.ColorKt.Color(4287463418L);
    private static final long Brand500 = androidx.compose.ui.graphics.ColorKt.Color(4284964351L);
    private static final long Brand600 = androidx.compose.ui.graphics.ColorKt.Color(4283644669L);
    private static final long LinkGreen50 = androidx.compose.ui.graphics.ColorKt.Color(4293328877L);
    private static final long LinkGreen50Dark = androidx.compose.ui.graphics.ColorKt.Color(4279640351L);
    private static final long LinkGreen200 = androidx.compose.ui.graphics.ColorKt.Color(4278244975L);
    private static final long LinkGreen500 = androidx.compose.ui.graphics.ColorKt.Color(4278224197L);
    private static final long LinkGreen900 = androidx.compose.ui.graphics.ColorKt.Color(4278263311L);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColorPreview_RPmYEkk$lambda$2(String str, long j, int i, Composer composer, int i2) {
        m7597ColorPreviewRPmYEkk(str, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColorsPreview$lambda$0(int i, Composer composer, int i2) {
        ColorsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final long getNeutral0() {
        return Neutral0;
    }

    public static final long getNeutral0Dark() {
        return Neutral0Dark;
    }

    public static final long getNeutral25() {
        return Neutral25;
    }

    public static final long getNeutral25Dark() {
        return Neutral25Dark;
    }

    public static final long getNeutral50() {
        return Neutral50;
    }

    public static final long getNeutral50Dark() {
        return Neutral50Dark;
    }

    public static final long getNeutral100() {
        return Neutral100;
    }

    public static final long getNeutral100Dark() {
        return Neutral100Dark;
    }

    public static final long getNeutral200() {
        return Neutral200;
    }

    public static final long getNeutral600() {
        return Neutral600;
    }

    public static final long getNeutral700() {
        return Neutral700;
    }

    public static final long getNeutral800() {
        return Neutral800;
    }

    public static final long getNeutral800Dark() {
        return Neutral800Dark;
    }

    public static final long getNeutral900() {
        return Neutral900;
    }

    public static final long getAttention50() {
        return Attention50;
    }

    public static final long getAttention100Dark() {
        return Attention100Dark;
    }

    public static final long getAttention300() {
        return Attention300;
    }

    public static final long getFeedbackCritical600() {
        return FeedbackCritical600;
    }

    public static final long getBrand25() {
        return Brand25;
    }

    public static final long getBrand25Dark() {
        return Brand25Dark;
    }

    public static final long getBrand400() {
        return Brand400;
    }

    public static final long getBrand500() {
        return Brand500;
    }

    public static final long getBrand600() {
        return Brand600;
    }

    public static final long getLinkGreen50() {
        return LinkGreen50;
    }

    public static final long getLinkGreen50Dark() {
        return LinkGreen50Dark;
    }

    public static final long getLinkGreen200() {
        return LinkGreen200;
    }

    public static final long getLinkGreen500() {
        return LinkGreen500;
    }

    public static final long getLinkGreen900() {
        return LinkGreen900;
    }

    public static final void ColorsPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(510456757);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(510456757, i, -1, "com.stripe.android.financialconnections.ui.theme.ColorsPreview (Color.kt:83)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$ColorKt.INSTANCE.m7599getLambda1$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.theme.ColorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ColorKt.ColorsPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ColorPreview-RPmYEkk, reason: not valid java name */
    public static final void m7597ColorPreviewRPmYEkk(final String str, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2073487340);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2073487340, i3, -1, "com.stripe.android.financialconnections.ui.theme.ColorPreview (Color.kt:113)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m575backgroundbw27NRU$default(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(40)), j, null, 2, null), composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(str, PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(10)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium(), composer2, (i3 & 14) | 48, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.theme.ColorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ColorKt.ColorPreview_RPmYEkk$lambda$2(str, j, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
