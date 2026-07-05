package com.stripe.android.financialconnections.features.common;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorDefaults;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.theme.ColorKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoadingContent.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u001a&\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0010\u001a-\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u001c\u001a\u0017\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010 \u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010!\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010#\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020\u001bX\u008a\u008e\u0002"}, d2 = {"SHIMMER_SIZE_MULTIPLIER", "", "SHIMMER_GRADIENT_ALPHA", "LOADING_SPINNER_ROTATION_MS", "", "ShowLoadingPillDelayMillis", "", "SlideDurationMillis", "LoadingShimmerEffect", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "FullScreenGenericLoading", "(Landroidx/compose/runtime/Composer;I)V", "LoadingSpinner", "modifier", "Landroidx/compose/ui/Modifier;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "gradient", "LoadingSpinner-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;II)V", "LoadingPillContainer", "canShowPill", "", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingPill", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingSpinnerPreview", "LoadingShimmerPreview", "LoadingShimmerWithPillPreview", "financial-connections_release", "angle", "showingPill"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoadingContentKt {
    private static final int LOADING_SPINNER_ROTATION_MS = 1000;
    private static final float SHIMMER_GRADIENT_ALPHA = 0.4f;
    private static final float SHIMMER_SIZE_MULTIPLIER = 0.2f;
    private static final long ShowLoadingPillDelayMillis = 5000;
    private static final int SlideDurationMillis = 600;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FullScreenGenericLoading$lambda$4(int i, Composer composer, int i2) {
        FullScreenGenericLoading(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingPill$lambda$24(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingPill(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LoadingPillContainer$lambda$19$lambda$18(int i, int i2) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LoadingPillContainer$lambda$21$lambda$20(int i, int i2) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingPillContainer$lambda$22(boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingPillContainer(z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingShimmerEffect$lambda$2(Function3 function3, int i, Composer composer, int i2) {
        LoadingShimmerEffect(function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingShimmerPreview$lambda$26(int i, Composer composer, int i2) {
        LoadingShimmerPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingShimmerWithPillPreview$lambda$27(int i, Composer composer, int i2) {
        LoadingShimmerWithPillPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingSpinnerPreview$lambda$25(int i, Composer composer, int i2) {
        LoadingSpinnerPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingSpinner_uFdPcIQ$lambda$10(Modifier modifier, float f, Brush brush, int i, int i2, Composer composer, int i3) {
        m7359LoadingSpinneruFdPcIQ(modifier, f, brush, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void LoadingShimmerEffect(final Function3<? super Brush, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(42208438);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(42208438, i2, -1, "com.stripe.android.financialconnections.features.common.LoadingShimmerEffect (LoadingContent.kt:74)");
            }
            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            float fM6117constructorimpl = Dp.m6117constructorimpl(((Configuration) objConsume).screenWidthDp);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            float fMo712toPx0680j_4 = ((Density) objConsume2).mo712toPx0680j_4(fM6117constructorimpl);
            float f = 0.2f * fMo712toPx0680j_4;
            List listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m3647boximpl(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU()), Color.m3647boximpl(Color.m3656copywmQWz5c$default(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3647boximpl(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU())});
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("shimmer_transition", composerStartRestartGroup, 6, 0), 0.0f, fMo712toPx0680j_4, AnimationSpecKt.m478infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), "shimmer_translate_animation", composerStartRestartGroup, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
            content.invoke(Brush.Companion.m3608linearGradientmHitzGk$default(Brush.INSTANCE, listListOf, OffsetKt.Offset(stateAnimateFloat.getValue().floatValue() - f, stateAnimateFloat.getValue().floatValue() - f), OffsetKt.Offset(stateAnimateFloat.getValue().floatValue(), stateAnimateFloat.getValue().floatValue()), 0, 8, (Object) null), composerStartRestartGroup, Integer.valueOf((i2 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingContentKt.LoadingShimmerEffect$lambda$2(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FullScreenGenericLoading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2130880376);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2130880376, i, -1, "com.stripe.android.financialconnections.features.common.FullScreenGenericLoading (LoadingContent.kt:111)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            m7359LoadingSpinneruFdPcIQ(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(52)), 0.0f, null, composerStartRestartGroup, 6, 6);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingContentKt.FullScreenGenericLoading$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: LoadingSpinner-uFdPcIQ, reason: not valid java name */
    public static final void m7359LoadingSpinneruFdPcIQ(Modifier modifier, float f, Brush brush, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        Brush brushM3612sweepGradientUv8p0NA$default;
        final Modifier.Companion companion;
        final float fM1956getStrokeWidthD9Ej5fM;
        final Brush brush2;
        final float f3;
        Composer composerStartRestartGroup = composer.startRestartGroup(148599840);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                int i5 = composerStartRestartGroup.changed(f2) ? 32 : 16;
                i3 |= i5;
            } else {
                f2 = f;
            }
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            if ((i2 & 4) == 0) {
                brushM3612sweepGradientUv8p0NA$default = brush;
                int i6 = composerStartRestartGroup.changed(brushM3612sweepGradientUv8p0NA$default) ? 256 : 128;
                i3 |= i6;
            } else {
                brushM3612sweepGradientUv8p0NA$default = brush;
            }
            i3 |= i6;
        } else {
            brushM3612sweepGradientUv8p0NA$default = brush;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    fM1956getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1956getStrokeWidthD9Ej5fM();
                    i3 &= -113;
                } else {
                    fM1956getStrokeWidthD9Ej5fM = f2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    brushM3612sweepGradientUv8p0NA$default = Brush.Companion.m3612sweepGradientUv8p0NA$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3647boximpl(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7630getBackground0d7_KjU()), Color.m3647boximpl(FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7633getBorder0d7_KjU())}), 0L, 2, (Object) null);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                companion = modifier2;
                fM1956getStrokeWidthD9Ej5fM = f2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(148599840, i3, -1, "com.stripe.android.financialconnections.features.common.LoadingSpinner (LoadingContent.kt:122)");
            }
            final Brush brush3 = brushM3612sweepGradientUv8p0NA$default;
            int i7 = i3;
            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("loading_transition", composerStartRestartGroup, 6, 0), 0.0f, 360.0f, AnimationSpecKt.m478infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "loading_animation", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            composerStartRestartGroup.startReplaceGroup(673263099);
            boolean zChanged = ((((i7 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32 && composerStartRestartGroup.changed(fM1956getStrokeWidthD9Ej5fM)) || (i7 & 48) == 32) | composerStartRestartGroup.changed(stateAnimateFloat) | ((((i7 & 896) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composerStartRestartGroup.changed(brush3)) || (i7 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoadingContentKt.LoadingSpinner_uFdPcIQ$lambda$9$lambda$8(fM1956getStrokeWidthD9Ej5fM, stateAnimateFloat, brush3, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(companion, (Function1) objRememberedValue, composerStartRestartGroup, i7 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            float f4 = fM1956getStrokeWidthD9Ej5fM;
            brush2 = brush3;
            f3 = f4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            companion = modifier2;
            f3 = f2;
            brush2 = brushM3612sweepGradientUv8p0NA$default;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingContentKt.LoadingSpinner_uFdPcIQ$lambda$10(companion, f3, brush2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingSpinner_uFdPcIQ$lambda$9$lambda$8(float f, State state, Brush brush, DrawScope Canvas) throws Throwable {
        long j;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fM3484getMinDimensionimpl = Size.m3484getMinDimensionimpl(Canvas.mo4213getSizeNHjbRc());
        float f2 = fM3484getMinDimensionimpl / 2.0f;
        float f3 = Canvas.mo712toPx0680j_4(f);
        float f4 = fM3484getMinDimensionimpl - f3;
        float f5 = f2 - (f4 / 2.0f);
        long jOffset = OffsetKt.Offset(f5, f5);
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo4134getSizeNHjbRc = drawContext.mo4134getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            float f6 = 2;
            transform.mo4140rotateUv8p0NA(LoadingSpinner_uFdPcIQ$lambda$5(state), OffsetKt.Offset(Size.m3485getWidthimpl(transform.mo4139getSizeNHjbRc()) / f6, Size.m3482getHeightimpl(transform.mo4139getSizeNHjbRc()) / f6));
            try {
                DrawScope.m4191drawArcillE91I$default(Canvas, brush, 90.0f, 260.0f, false, jOffset, androidx.compose.ui.geometry.SizeKt.Size(f4, f4), 0.0f, new Stroke(f3, 0.0f, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
                drawContext.getCanvas().restore();
                drawContext.mo4135setSizeuvyYCjk(jMo4134getSizeNHjbRc);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                j = jMo4134getSizeNHjbRc;
                drawContext.getCanvas().restore();
                drawContext.mo4135setSizeuvyYCjk(j);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = jMo4134getSizeNHjbRc;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadingPillContainer(final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Density density;
        final boolean zBooleanValue;
        boolean zChanged;
        Object objRememberedValue;
        final int iIntValue;
        boolean zChanged2;
        Object objRememberedValue2;
        MutableState mutableState;
        boolean zChanged3;
        LoadingContentKt$LoadingPillContainer$1$1 loadingContentKt$LoadingPillContainer$1$1RememberedValue;
        boolean zChanged4;
        Object objRememberedValue3;
        boolean zChanged5;
        Object objRememberedValue4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(41514711);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(41514711, i3, -1, "com.stripe.android.financialconnections.features.common.LoadingPillContainer (LoadingContent.kt:168)");
                }
                ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localConfiguration);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                density = (Density) objConsume2;
                ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composerStartRestartGroup.consume(localInspectionMode);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                zBooleanValue = ((Boolean) objConsume3).booleanValue();
                composerStartRestartGroup.startReplaceGroup(-1049166897);
                zChanged = composerStartRestartGroup.changed((Configuration) objConsume) | composerStartRestartGroup.changed(density);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = Integer.valueOf(density.mo706roundToPx0680j_4(Dp.m6117constructorimpl(r3.screenHeightDp)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                iIntValue = ((Number) objRememberedValue).intValue();
                composerStartRestartGroup.endReplaceGroup();
                int i5 = i3;
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(-1049161462);
                int i6 = i5 & 14;
                zChanged2 = composerStartRestartGroup.changed(zBooleanValue) | (i6 != 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoadingContentKt.LoadingPillContainer$lambda$14$lambda$13(zBooleanValue, z);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                Boolean boolValueOf = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceGroup(-1049158359);
                zChanged3 = (i6 != 4) | composerStartRestartGroup.changed(mutableState);
                loadingContentKt$LoadingPillContainer$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || loadingContentKt$LoadingPillContainer$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    loadingContentKt$LoadingPillContainer$1$1RememberedValue = new LoadingContentKt$LoadingPillContainer$1$1(z, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(loadingContentKt$LoadingPillContainer$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) loadingContentKt$LoadingPillContainer$1$1RememberedValue, composerStartRestartGroup, i6);
                boolean zLoadingPillContainer$lambda$15 = LoadingPillContainer$lambda$15(mutableState);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                composerStartRestartGroup.startReplaceGroup(-1049145825);
                zChanged4 = composerStartRestartGroup.changed(iIntValue);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(LoadingContentKt.LoadingPillContainer$lambda$19$lambda$18(iIntValue, ((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EnterTransition enterTransitionSlideInVertically = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue3);
                TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                composerStartRestartGroup.startReplaceGroup(-1049141025);
                zChanged5 = composerStartRestartGroup.changed(iIntValue);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(LoadingContentKt.LoadingPillContainer$lambda$21$lambda$20(iIntValue, ((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedVisibilityKt.AnimatedVisibility(zLoadingPillContainer$lambda$15, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), enterTransitionSlideInVertically, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue4), (String) null, ComposableSingletons$LoadingContentKt.INSTANCE.m7327getLambda1$financial_connections_release(), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LoadingContentKt.LoadingPillContainer$lambda$22(z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume4 = composerStartRestartGroup.consume(localConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume22 = composerStartRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            density = (Density) objConsume22;
            ProvidableCompositionLocal<Boolean> localInspectionMode2 = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume32 = composerStartRestartGroup.consume(localInspectionMode2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            zBooleanValue = ((Boolean) objConsume32).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1049166897);
            zChanged = composerStartRestartGroup.changed((Configuration) objConsume4) | composerStartRestartGroup.changed(density);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = Integer.valueOf(density.mo706roundToPx0680j_4(Dp.m6117constructorimpl(r3.screenHeightDp)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                iIntValue = ((Number) objRememberedValue).intValue();
                composerStartRestartGroup.endReplaceGroup();
                int i52 = i3;
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(-1049161462);
                int i62 = i52 & 14;
                zChanged2 = composerStartRestartGroup.changed(zBooleanValue) | (i62 != 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoadingContentKt.LoadingPillContainer$lambda$14$lambda$13(zBooleanValue, z);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceGroup(-1049158359);
                    zChanged3 = (i62 != 4) | composerStartRestartGroup.changed(mutableState);
                    loadingContentKt$LoadingPillContainer$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged3) {
                        loadingContentKt$LoadingPillContainer$1$1RememberedValue = new LoadingContentKt$LoadingPillContainer$1$1(z, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(loadingContentKt$LoadingPillContainer$1$1RememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) loadingContentKt$LoadingPillContainer$1$1RememberedValue, composerStartRestartGroup, i62);
                        boolean zLoadingPillContainer$lambda$152 = LoadingPillContainer$lambda$15(mutableState);
                        TweenSpec tweenSpecTween$default3 = AnimationSpecKt.tween$default(600, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                        composerStartRestartGroup.startReplaceGroup(-1049145825);
                        zChanged4 = composerStartRestartGroup.changed(iIntValue);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged4) {
                            objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(LoadingContentKt.LoadingPillContainer$lambda$19$lambda$18(iIntValue, ((Integer) obj).intValue()));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            EnterTransition enterTransitionSlideInVertically2 = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default3, (Function1) objRememberedValue3);
                            TweenSpec tweenSpecTween$default22 = AnimationSpecKt.tween$default(600, 0, null, 6, null);
                            composerStartRestartGroup.startReplaceGroup(-1049141025);
                            zChanged5 = composerStartRestartGroup.changed(iIntValue);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged5) {
                                objRememberedValue4 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(LoadingContentKt.LoadingPillContainer$lambda$21$lambda$20(iIntValue, ((Integer) obj).intValue()));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                AnimatedVisibilityKt.AnimatedVisibility(zLoadingPillContainer$lambda$152, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), enterTransitionSlideInVertically2, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default22, (Function1) objRememberedValue4), (String) null, ComposableSingletons$LoadingContentKt.INSTANCE.m7327getLambda1$financial_connections_release(), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                                composerStartRestartGroup = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean LoadingPillContainer$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingPillContainer$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState LoadingPillContainer$lambda$14$lambda$13(boolean z, boolean z2) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z && z2), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingPill(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2033185978);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2033185978, i3, -1, "com.stripe.android.financialconnections.features.common.LoadingPill (LoadingContent.kt:215)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(8));
            float f = 16;
            Modifier modifierM1021paddingVpY3zN4 = PaddingKt.m1021paddingVpY3zN4(BackgroundKt.m574backgroundbw27NRU(companion, ColorKt.getNeutral900(), RoundedCornerShapeKt.RoundedCornerShape(100)), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
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
            composer2 = composerStartRestartGroup;
            Modifier modifier3 = companion;
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_loading_pill_label, composerStartRestartGroup, 0), (Modifier) null, Color.INSTANCE.m3694getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodySmall(), composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0, 65530);
            m7359LoadingSpinneruFdPcIQ(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), Dp.m6117constructorimpl(2), Brush.Companion.m3612sweepGradientUv8p0NA$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3647boximpl(Color.INSTANCE.m3692getTransparent0d7_KjU()), Color.m3647boximpl(Color.INSTANCE.m3694getWhite0d7_KjU())}), 0L, 2, (Object) null), composer2, 438, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingContentKt.LoadingPill$lambda$24(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LoadingSpinnerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1954745767);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1954745767, i, -1, "com.stripe.android.financialconnections.features.common.LoadingSpinnerPreview (LoadingContent.kt:248)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$LoadingContentKt.INSTANCE.m7335getLambda4$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingContentKt.LoadingSpinnerPreview$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LoadingShimmerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1900336449);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1900336449, i, -1, "com.stripe.android.financialconnections.features.common.LoadingShimmerPreview (LoadingContent.kt:269)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$LoadingContentKt.INSTANCE.m7340getLambda9$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingContentKt.LoadingShimmerPreview$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LoadingShimmerWithPillPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(487773568);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(487773568, i, -1, "com.stripe.android.financialconnections.features.common.LoadingShimmerWithPillPreview (LoadingContent.kt:311)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$LoadingContentKt.INSTANCE.m7332getLambda14$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.LoadingContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingContentKt.LoadingShimmerWithPillPreview$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float LoadingSpinner_uFdPcIQ$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }
}
