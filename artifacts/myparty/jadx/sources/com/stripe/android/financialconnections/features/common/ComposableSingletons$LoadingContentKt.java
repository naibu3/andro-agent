package com.stripe.android.financialconnections.features.common;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.financialconnections.ui.components.ScaffoldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LoadingContentKt {
    public static final ComposableSingletons$LoadingContentKt INSTANCE = new ComposableSingletons$LoadingContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f69lambda1 = ComposableLambdaKt.composableLambdaInstance(-822699089, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-822699089, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-1.<anonymous> (LoadingContent.kt:205)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            LoadingContentKt.LoadingPill(null, composer, 0, 1);
            SpacerKt.Spacer(WindowInsetsSizeKt.windowInsetsBottomHeight(Modifier.INSTANCE, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6)), composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f75lambda2 = ComposableLambdaKt.composableLambdaInstance(645670521, false, ComposableSingletons$LoadingContentKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f76lambda3 = ComposableLambdaKt.composableLambdaInstance(1361912381, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1361912381, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-3.<anonymous> (LoadingContent.kt:258)");
            }
            LoadingContentKt.FullScreenGenericLoading(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f77lambda4 = ComposableLambdaKt.composableLambdaInstance(574843338, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(574843338, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-4.<anonymous> (LoadingContent.kt:250)");
                }
                ScaffoldKt.FinancialConnectionsScaffold(ComposableSingletons$LoadingContentKt.INSTANCE.m7333getLambda2$financial_connections_release(), ComposableSingletons$LoadingContentKt.INSTANCE.m7334getLambda3$financial_connections_release(), composer, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f78lambda5 = ComposableLambdaKt.composableLambdaInstance(205785441, false, ComposableSingletons$LoadingContentKt$lambda5$1.INSTANCE);

    /* renamed from: lambda-6, reason: not valid java name */
    private static Function3<Brush, Composer, Integer, Unit> f79lambda6 = ComposableLambdaKt.composableLambdaInstance(-983776976, false, new Function3<Brush, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Brush brush, Composer composer, Integer num) {
            invoke(brush, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Brush it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-983776976, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-6.<anonymous> (LoadingContent.kt:284)");
                }
                BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(72)), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(16))), it, null, 0.0f, 6, null), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    private static Function3<Brush, Composer, Integer, Unit> f80lambda7 = ComposableLambdaKt.composableLambdaInstance(1704498329, false, new Function3<Brush, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Brush brush, Composer composer, Integer num) {
            invoke(brush, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Brush it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1704498329, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-7.<anonymous> (LoadingContent.kt:293)");
                }
                BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(100)), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(16))), it, null, 0.0f, 6, null), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f81lambda8 = ComposableLambdaKt.composableLambdaInstance(922027301, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(922027301, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-8.<anonymous> (LoadingContent.kt:279)");
                }
                float f = 16;
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f));
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1020padding3ABfNKs);
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
                LoadingContentKt.LoadingShimmerEffect(ComposableSingletons$LoadingContentKt.INSTANCE.m7337getLambda6$financial_connections_release(), composer, 6);
                LoadingContentKt.LoadingShimmerEffect(ComposableSingletons$LoadingContentKt.INSTANCE.m7338getLambda7$financial_connections_release(), composer, 6);
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
    });

    /* renamed from: lambda-9, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f82lambda9 = ComposableLambdaKt.composableLambdaInstance(134958258, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(134958258, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-9.<anonymous> (LoadingContent.kt:271)");
                }
                ScaffoldKt.FinancialConnectionsScaffold(ComposableSingletons$LoadingContentKt.INSTANCE.m7336getLambda5$financial_connections_release(), ComposableSingletons$LoadingContentKt.INSTANCE.m7339getLambda8$financial_connections_release(), composer, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f70lambda10 = ComposableLambdaKt.composableLambdaInstance(-1205081696, false, ComposableSingletons$LoadingContentKt$lambda10$1.INSTANCE);

    /* renamed from: lambda-11, reason: not valid java name */
    private static Function3<Brush, Composer, Integer, Unit> f71lambda11 = ComposableLambdaKt.composableLambdaInstance(-1477221777, false, new Function3<Brush, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-11$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Brush brush, Composer composer, Integer num) {
            invoke(brush, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Brush it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1477221777, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-11.<anonymous> (LoadingContent.kt:326)");
                }
                BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(72)), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(16))), it, null, 0.0f, 6, null), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-12, reason: not valid java name */
    private static Function3<Brush, Composer, Integer, Unit> f72lambda12 = ComposableLambdaKt.composableLambdaInstance(347978968, false, new Function3<Brush, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-12$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Brush brush, Composer composer, Integer num) {
            invoke(brush, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Brush it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 6) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(347978968, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-12.<anonymous> (LoadingContent.kt:335)");
                }
                BoxKt.Box(BackgroundKt.background$default(ClipKt.clip(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(100)), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(16))), it, null, 0.0f, 6, null), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-13, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f73lambda13 = ComposableLambdaKt.composableLambdaInstance(-803806876, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-13$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-803806876, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-13.<anonymous> (LoadingContent.kt:321)");
                }
                float f = 16;
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f));
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1020padding3ABfNKs);
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
                LoadingContentKt.LoadingShimmerEffect(ComposableSingletons$LoadingContentKt.INSTANCE.m7329getLambda11$financial_connections_release(), composer, 6);
                LoadingContentKt.LoadingShimmerEffect(ComposableSingletons$LoadingContentKt.INSTANCE.m7330getLambda12$financial_connections_release(), composer, 6);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
                LoadingContentKt.LoadingPillContainer(true, null, composer, 6, 2);
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
    });

    /* renamed from: lambda-14, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f74lambda14 = ComposableLambdaKt.composableLambdaInstance(-811119631, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt$lambda-14$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-811119631, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$LoadingContentKt.lambda-14.<anonymous> (LoadingContent.kt:313)");
                }
                ScaffoldKt.FinancialConnectionsScaffold(ComposableSingletons$LoadingContentKt.INSTANCE.m7328getLambda10$financial_connections_release(), ComposableSingletons$LoadingContentKt.INSTANCE.m7331getLambda13$financial_connections_release(), composer, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7327getLambda1$financial_connections_release() {
        return f69lambda1;
    }

    /* renamed from: getLambda-10$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7328getLambda10$financial_connections_release() {
        return f70lambda10;
    }

    /* renamed from: getLambda-11$financial_connections_release, reason: not valid java name */
    public final Function3<Brush, Composer, Integer, Unit> m7329getLambda11$financial_connections_release() {
        return f71lambda11;
    }

    /* renamed from: getLambda-12$financial_connections_release, reason: not valid java name */
    public final Function3<Brush, Composer, Integer, Unit> m7330getLambda12$financial_connections_release() {
        return f72lambda12;
    }

    /* renamed from: getLambda-13$financial_connections_release, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m7331getLambda13$financial_connections_release() {
        return f73lambda13;
    }

    /* renamed from: getLambda-14$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7332getLambda14$financial_connections_release() {
        return f74lambda14;
    }

    /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7333getLambda2$financial_connections_release() {
        return f75lambda2;
    }

    /* renamed from: getLambda-3$financial_connections_release, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m7334getLambda3$financial_connections_release() {
        return f76lambda3;
    }

    /* renamed from: getLambda-4$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7335getLambda4$financial_connections_release() {
        return f77lambda4;
    }

    /* renamed from: getLambda-5$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7336getLambda5$financial_connections_release() {
        return f78lambda5;
    }

    /* renamed from: getLambda-6$financial_connections_release, reason: not valid java name */
    public final Function3<Brush, Composer, Integer, Unit> m7337getLambda6$financial_connections_release() {
        return f79lambda6;
    }

    /* renamed from: getLambda-7$financial_connections_release, reason: not valid java name */
    public final Function3<Brush, Composer, Integer, Unit> m7338getLambda7$financial_connections_release() {
        return f80lambda7;
    }

    /* renamed from: getLambda-8$financial_connections_release, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m7339getLambda8$financial_connections_release() {
        return f81lambda8;
    }

    /* renamed from: getLambda-9$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7340getLambda9$financial_connections_release() {
        return f82lambda9;
    }
}
