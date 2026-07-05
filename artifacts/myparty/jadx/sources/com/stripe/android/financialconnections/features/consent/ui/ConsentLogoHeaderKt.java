package com.stripe.android.financialconnections.features.consent.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConsentLogoHeader.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\u001a-\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0003¢\u0006\u0002\u0010\u0013\u001a%\u0010\u0014\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0003¢\u0006\u0004\b$\u0010%\u001a\u0015\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000eH\u0002¢\u0006\u0002\u0010-\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006.²\u0006\u0010\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u008a\u008e\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002"}, d2 = {"LogoSize", "Landroidx/compose/ui/unit/Dp;", "F", "DotsContainerHeight", "DotsContainerWidth", "NoDotsSpacingWidth", "ConsentLogoHeader", "", "modifier", "Landroidx/compose/ui/Modifier;", "logos", "", "", "showDots", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V", "BackgroundRow", "images", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "ForegroundRow", PaymentSheetAppearanceKeys.SPACING, "ForegroundRow-ziNgDLE", "(Ljava/util/List;FLandroidx/compose/runtime/Composer;I)V", "debugPreviewBitmaps", "size", "bitmapLoadSize", "", "rememberPlaceholderBitmap", "placeholderColor", "Landroidx/compose/ui/graphics/Color;", "rememberPlaceholderBitmap-RPmYEkk", "(IJLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/ImageBitmap;", "AnimatedDotsWithFixedGradient", "startColor", "endColor", "AnimatedDotsWithFixedGradient-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Logo", "imageBitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/runtime/Composer;I)V", "getPrevalentColorCloseToDots", "bitmap", "Landroid/graphics/Bitmap;", "startSide", "(Landroid/graphics/Bitmap;Z)J", "financial-connections_release", "bitmaps", "animatedOffset", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsentLogoHeaderKt {
    private static final float LogoSize = Dp.m6117constructorimpl(72);
    private static final float DotsContainerHeight = Dp.m6117constructorimpl(6);
    private static final float DotsContainerWidth = Dp.m6117constructorimpl(32);
    private static final float NoDotsSpacingWidth = Dp.m6117constructorimpl(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedDotsWithFixedGradient_RIQooxk$lambda$22(Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        m7381AnimatedDotsWithFixedGradientRIQooxk(modifier, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackgroundRow$lambda$10(List list, int i, Composer composer, int i2) {
        BackgroundRow(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConsentLogoHeader$lambda$8(Modifier modifier, List list, boolean z, int i, int i2, Composer composer, int i3) {
        ConsentLogoHeader(modifier, list, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ForegroundRow_ziNgDLE$lambda$12(List list, float f, int i, Composer composer, int i2) {
        m7382ForegroundRowziNgDLE(list, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Logo$lambda$24(ImageBitmap imageBitmap, int i, Composer composer, int i2) {
        Logo(imageBitmap, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ConsentLogoHeader(Modifier modifier, final List<String> logos, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        MutableState mutableState;
        ArrayList arrayListDebugPreviewBitmaps;
        Intrinsics.checkNotNullParameter(logos, "logos");
        Composer composerStartRestartGroup = composer.startRestartGroup(-723600925);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(logos) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-723600925, i5, -1, "com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeader (ConsentLogoHeader.kt:63)");
            }
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean zBooleanValue = ((Boolean) objConsume).booleanValue();
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume2;
            composerStartRestartGroup.startReplaceGroup(1173526374);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Integer.valueOf((int) density.mo712toPx0680j_4(Dp.m6117constructorimpl(36)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue = ((Number) objRememberedValue).intValue();
            composerStartRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localImageLoader);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            StripeImageLoader stripeImageLoader = (StripeImageLoader) objConsume3;
            ImageBitmap imageBitmapM7383rememberPlaceholderBitmapRPmYEkk = m7383rememberPlaceholderBitmapRPmYEkk(iIntValue, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1173534834);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (zBooleanValue) {
                    arrayListDebugPreviewBitmaps = debugPreviewBitmaps(logos, iIntValue);
                } else {
                    int size = logos.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i6 = 0; i6 < size; i6++) {
                        arrayList.add(imageBitmapM7383rememberPlaceholderBitmapRPmYEkk);
                    }
                    arrayListDebugPreviewBitmaps = arrayList;
                }
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(arrayListDebugPreviewBitmaps, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1173543077);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(logos) | composerStartRestartGroup.changedInstance(stripeImageLoader) | composerStartRestartGroup.changedInstance(imageBitmapM7383rememberPlaceholderBitmapRPmYEkk);
            ConsentLogoHeaderKt$ConsentLogoHeader$1$1 consentLogoHeaderKt$ConsentLogoHeader$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || consentLogoHeaderKt$ConsentLogoHeader$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState2;
                consentLogoHeaderKt$ConsentLogoHeader$1$1RememberedValue = new ConsentLogoHeaderKt$ConsentLogoHeader$1$1(logos, stripeImageLoader, iIntValue, imageBitmapM7383rememberPlaceholderBitmapRPmYEkk, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(consentLogoHeaderKt$ConsentLogoHeader$1$1RememberedValue);
            } else {
                mutableState = mutableState2;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(logos, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) consentLogoHeaderKt$ConsentLogoHeader$1$1RememberedValue, composerStartRestartGroup, (i5 >> 3) & 14);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1051height3ABfNKs(modifier, LogoSize), 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            composerStartRestartGroup.startReplaceGroup(-216294542);
            if (z) {
                BackgroundRow(ConsentLogoHeader$lambda$4(mutableState), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            m7382ForegroundRowziNgDLE(ConsentLogoHeader$lambda$4(mutableState), z ? DotsContainerWidth : NoDotsSpacingWidth, composerStartRestartGroup, 0);
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
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConsentLogoHeaderKt.ConsentLogoHeader$lambda$8(modifier2, logos, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<ImageBitmap> ConsentLogoHeader$lambda$4(MutableState<List<ImageBitmap>> mutableState) {
        return mutableState.getValue();
    }

    private static final void BackgroundRow(final List<? extends ImageBitmap> list, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1433738522);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1433738522, i2, -1, "com.stripe.android.financialconnections.features.consent.ui.BackgroundRow (ConsentLogoHeader.kt:108)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            composerStartRestartGroup.startReplaceGroup(485672122);
            int i3 = 0;
            for (ImageBitmap imageBitmap : list) {
                int i4 = i3 + 1;
                SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, LogoSize), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(485675646);
                if (i3 != CollectionsKt.getLastIndex(list)) {
                    m7381AnimatedDotsWithFixedGradientRIQooxk(null, getPrevalentColorCloseToDots(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), false), getPrevalentColorCloseToDots(AndroidImageBitmap_androidKt.asAndroidBitmap(list.get(i4)), true), composerStartRestartGroup, 0, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = i4;
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
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConsentLogoHeaderKt.BackgroundRow$lambda$10(list, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: ForegroundRow-ziNgDLE, reason: not valid java name */
    private static final void m7382ForegroundRowziNgDLE(final List<? extends ImageBitmap> list, final float f, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1739757965);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1739757965, i2, -1, "com.stripe.android.financialconnections.features.consent.ui.ForegroundRow (ConsentLogoHeader.kt:134)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            composerStartRestartGroup.startReplaceGroup(-219864394);
            Iterator<T> it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int i4 = i3 + 1;
                Logo((ImageBitmap) it.next(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-219861893);
                if (i3 != CollectionsKt.getLastIndex(list)) {
                    SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, f), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                i3 = i4;
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
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConsentLogoHeaderKt.ForegroundRow_ziNgDLE$lambda$12(list, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<ImageBitmap> debugPreviewBitmaps(List<String> list, int i) {
        List listTake = CollectionsKt.take(CollectionsKt.listOf((Object[]) new Color[]{Color.m3647boximpl(Color.INSTANCE.m3691getRed0d7_KjU()), Color.m3647boximpl(Color.INSTANCE.m3684getBlue0d7_KjU()), Color.m3647boximpl(Color.INSTANCE.m3688getGreen0d7_KjU())}), list.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            long jM3667unboximpl = ((Color) it.next()).m3667unboximpl();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            new Canvas(bitmapCreateBitmap).drawColor(ColorKt.m3711toArgb8_81llA(jM3667unboximpl));
            arrayList.add(AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap));
        }
        return arrayList;
    }

    /* renamed from: rememberPlaceholderBitmap-RPmYEkk, reason: not valid java name */
    private static final ImageBitmap m7383rememberPlaceholderBitmapRPmYEkk(int i, long j, Composer composer, int i2) {
        composer.startReplaceGroup(-16798713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-16798713, i2, -1, "com.stripe.android.financialconnections.features.consent.ui.rememberPlaceholderBitmap (ConsentLogoHeader.kt:158)");
        }
        composer.startReplaceGroup(49486170);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.eraseColor(ColorKt.m3711toArgb8_81llA(j));
            objRememberedValue = AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap);
            composer.updateRememberedValue(objRememberedValue);
        }
        ImageBitmap imageBitmap = (ImageBitmap) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return imageBitmap;
    }

    /* renamed from: AnimatedDotsWithFixedGradient-RIQooxk, reason: not valid java name */
    private static final void m7381AnimatedDotsWithFixedGradientRIQooxk(Modifier modifier, final long j, final long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(1141289636);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1141289636, i3, -1, "com.stripe.android.financialconnections.features.consent.ui.AnimatedDotsWithFixedGradient (ConsentLogoHeader.kt:173)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("animated-dots-transition", composerStartRestartGroup, 6, 0);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, ((Density) objConsume).mo712toPx0680j_4(Dp.m6117constructorimpl(10)), AnimationSpecKt.m478infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "animated-dots", composerStartRestartGroup, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
            final Brush brushM3606horizontalGradient8A3gB4$default = Brush.Companion.m3606horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3647boximpl(j), Color.m3647boximpl(j2)}), 0.0f, 0.0f, 0, 14, (Object) null);
            Modifier modifierM575backgroundbw27NRU$default = BackgroundKt.m575backgroundbw27NRU$default(SizeKt.m1051height3ABfNKs(SizeKt.m1070width3ABfNKs(companion, DotsContainerWidth), DotsContainerHeight), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7630getBackground0d7_KjU(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM575backgroundbw27NRU$default);
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
            Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE);
            composerStartRestartGroup.startReplaceGroup(-1578367618);
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changed(brushM3606horizontalGradient8A3gB4$default);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ConsentLogoHeaderKt.AnimatedDotsWithFixedGradient_RIQooxk$lambda$21$lambda$20$lambda$19(stateAnimateFloat, brushM3606horizontalGradient8A3gB4$default, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifierMatchParentSize, (Function1) objRememberedValue, composerStartRestartGroup, 0);
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
            companion = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConsentLogoHeaderKt.AnimatedDotsWithFixedGradient_RIQooxk$lambda$22(companion, j, j2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Logo(final ImageBitmap imageBitmap, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1297041747);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(imageBitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1297041747, i2, -1, "com.stripe.android.financialconnections.features.consent.ui.Logo (ConsentLogoHeader.kt:225)");
            }
            RoundedCornerShape roundedCornerShapeM1303RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(18));
            Modifier modifierM574backgroundbw27NRU = BackgroundKt.m574backgroundbw27NRU(ClipKt.clip(ShadowKt.m3321shadows4CzXII$default(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, LogoSize), Dp.m6117constructorimpl(8), roundedCornerShapeM1303RoundedCornerShape0680j_4, false, 0L, 0L, 28, null), roundedCornerShapeM1303RoundedCornerShape0680j_4), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU(), roundedCornerShapeM1303RoundedCornerShape0680j_4);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM574backgroundbw27NRU);
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
            CrossfadeKt.Crossfade(imageBitmap, (Modifier) null, AnimationSpecKt.tween$default(300, 0, null, 6, null), (String) null, ComposableSingletons$ConsentLogoHeaderKt.INSTANCE.m7378getLambda1$financial_connections_release(), composerStartRestartGroup, (i2 & 14) | 24960, 10);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConsentLogoHeaderKt.Logo$lambda$24(imageBitmap, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long getPrevalentColorCloseToDots(Bitmap bitmap, boolean z) {
        Object obj;
        HashMap map = new HashMap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (z) {
            width /= 4;
        }
        int i = (height * 2) / 5;
        int i2 = (height * 3) / 5;
        for (int i3 = z ? 0 : (width * 3) / 4; i3 < width; i3++) {
            for (int i4 = i; i4 < i2; i4++) {
                int pixel = bitmap.getPixel(i3, i4);
                HashMap map2 = map;
                Integer numValueOf = Integer.valueOf(pixel);
                Integer num = (Integer) map.get(Integer.valueOf(pixel));
                map2.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return ColorKt.Color(((Number) entry.getKey()).intValue());
        }
        return Color.INSTANCE.m3683getBlack0d7_KjU();
    }

    private static final float AnimatedDotsWithFixedGradient_RIQooxk$lambda$16(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedDotsWithFixedGradient_RIQooxk$lambda$21$lambda$20$lambda$19(State state, Brush brush, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f = Canvas.mo712toPx0680j_4(Dp.m6117constructorimpl(3));
        float f2 = Canvas.mo712toPx0680j_4(Dp.m6117constructorimpl(10));
        float fM3417getYimpl = Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0());
        int iM3485getWidthimpl = ((int) (Size.m3485getWidthimpl(Canvas.mo4213getSizeNHjbRc()) / f2)) + 2;
        Path Path = AndroidPath_androidKt.Path();
        for (int i = -1; i < iM3485getWidthimpl; i++) {
            float f3 = 2 * f;
            Path.addOval$default(Path, RectKt.m3456Recttz77jQw(OffsetKt.Offset(((i * f2) + AnimatedDotsWithFixedGradient_RIQooxk$lambda$16(state)) - f2, fM3417getYimpl - f), androidx.compose.ui.geometry.SizeKt.Size(f3, f3)), null, 2, null);
        }
        int iM3646getIntersectrtfAjoo = ClipOp.INSTANCE.m3646getIntersectrtfAjoo();
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo4134getSizeNHjbRc = drawContext.mo4134getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4136clipPathmtrdDE(Path, iM3646getIntersectrtfAjoo);
            DrawScope.m4206drawRectAsUm42w$default(Canvas, brush, OffsetKt.Offset(0.0f, fM3417getYimpl - f), androidx.compose.ui.geometry.SizeKt.Size(Size.m3485getWidthimpl(Canvas.mo4213getSizeNHjbRc()), 2 * f), 0.0f, null, null, 0, 120, null);
            drawContext.getCanvas().restore();
            drawContext.mo4135setSizeuvyYCjk(jMo4134getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo4135setSizeuvyYCjk(jMo4134getSizeNHjbRc);
            throw th;
        }
    }
}
