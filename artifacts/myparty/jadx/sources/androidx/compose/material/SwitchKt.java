package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
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
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aU\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u0010\"\u001a?\u0010#\u001a\u00020\u0016*\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010\u001e\u001a\u00020'H\u0003¢\u0006\u0002\u0010(\u001a.\u0010)\u001a\u00020\u0016*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0016\u0010\u000b\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\r\"\u0010\u0010\u000e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u000f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0010\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0016\u0010\u0011\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\r\"\u0016\u0010\u0013\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\n\u00102\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\u0018\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001aX\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u00020,X\u008a\u0084\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DefaultSwitchPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchHeight", "SwitchPositionalThreshold", "SwitchVelocityThreshold", "SwitchWidth", "ThumbDefaultElevation", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPathLength", "ThumbPressedElevation", "ThumbRippleRadius", "TrackStrokeWidth", "getTrackStrokeWidth", "TrackWidth", "getTrackWidth", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Lkotlin/Function0;", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "material_release", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchPositionalThreshold = 0.7f;
    private static final float SwitchVelocityThreshold;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        SwitchColors switchColors2;
        MutableInteractionSource mutableInteractionSource3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        SwitchColors switchColors3;
        int i6;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource4;
        final float fMo712toPx0680j_4;
        Object objRememberedValue;
        MutableState mutableState;
        final float fMo712toPx0680j_42;
        boolean zChanged;
        Object objRememberedValue2;
        AnchoredDraggableState anchoredDraggableState;
        State stateRememberUpdatedState;
        State stateRememberUpdatedState2;
        boolean zChanged2;
        AnchoredDraggableState anchoredDraggableState2;
        SwitchKt$Switch$1$1 switchKt$Switch$1$1;
        boolean zChanged3;
        SwitchKt$Switch$2$1 switchKt$Switch$2$1RememberedValue;
        Object obj;
        AnchoredDraggableState anchoredDraggableState3;
        Object obj2;
        boolean z4;
        MutableInteractionSource mutableInteractionSource5;
        int i7;
        boolean z5;
        Modifier.Companion companionM1276toggleableO2vRcR0;
        Modifier.Companion companionMinimumInteractiveComponentSize;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged4;
        Composer composer3;
        final Modifier modifier3;
        final SwitchColors switchColors4;
        final MutableInteractionSource mutableInteractionSource6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(25866825);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Switch)P(!1,5,4,2,3)98@4560L8,*103@4753L7,108@5135L34,109@5224L7,110@5301L447,122@5783L37,123@5847L29,124@5920L315,124@5881L354,133@6285L133,133@6240L178,138@6456L7,153@6897L1050:Switch.kt#jmzs0o");
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
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            int i9 = composerStartRestartGroup.changed(switchColors2) ? 131072 : 65536;
                            i3 |= i9;
                        } else {
                            switchColors2 = switchColors;
                        }
                        i3 |= i9;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i4 == 0 ? true : z3;
                            mutableInteractionSource3 = i5 == 0 ? null : mutableInteractionSource2;
                            if ((i2 & 32) == 0) {
                                int i10 = i3;
                                snapshotMutationPolicy = null;
                                SwitchColors switchColorsM2027colorsSQMK_m0 = SwitchDefaults.INSTANCE.m2027colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                                composer2 = composerStartRestartGroup;
                                i6 = i10 & (-458753);
                                z3 = z6;
                                switchColors3 = switchColorsM2027colorsSQMK_m0;
                                modifier2 = companion;
                            } else {
                                int i11 = i3;
                                snapshotMutationPolicy = null;
                                modifier2 = companion;
                                z3 = z6;
                                switchColors3 = switchColors2;
                                i6 = i11;
                                composer2 = composerStartRestartGroup;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            switchColors3 = switchColors2;
                            snapshotMutationPolicy = null;
                            composer2 = composerStartRestartGroup;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(25866825, i6, -1, "androidx.compose.material.Switch (Switch.kt:99)");
                        }
                        if (mutableInteractionSource3 != null) {
                            composer2.startReplaceGroup(-1604953567);
                            ComposerKt.sourceInformation(composer2, "101@4654L39");
                            ComposerKt.sourceInformationMarkerStart(composer2, 779511297, "CC(remember):Switch.kt#9igjgp");
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceGroup();
                            mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue3;
                        } else {
                            composer2.startReplaceGroup(779510646);
                            composer2.endReplaceGroup();
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        fMo712toPx0680j_4 = ((Density) objConsume).mo712toPx0680j_4(ThumbPathLength);
                        ComposerKt.sourceInformationMarkerStart(composer2, 779526684, "CC(remember):Switch.kt#9igjgp");
                        objRememberedValue = composer2.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        mutableState = (MutableState) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composer2.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        fMo712toPx0680j_42 = ((Density) objConsume2).mo712toPx0680j_4(SwitchVelocityThreshold);
                        ComposerKt.sourceInformationMarkerStart(composer2, 779532409, "CC(remember):Switch.kt#9igjgp");
                        zChanged = composer2.changed(fMo712toPx0680j_4) | composer2.changed(fMo712toPx0680j_42);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final float f = 0.0f;
                            objRememberedValue2 = new AnchoredDraggableState(Boolean.valueOf(z), AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<Boolean>, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<Boolean> draggableAnchorsConfig) {
                                    invoke2(draggableAnchorsConfig);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DraggableAnchorsConfig<Boolean> draggableAnchorsConfig) {
                                    draggableAnchorsConfig.at(false, f);
                                    draggableAnchorsConfig.at(true, fMo712toPx0680j_4);
                                }
                            }), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                public final Float invoke(float f2) {
                                    return Float.valueOf(f2 * 0.7f);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                                    return invoke(f2.floatValue());
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(fMo712toPx0680j_42);
                                }
                            }, AnimationSpec, null, 32, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        anchoredDraggableState = (AnchoredDraggableState) objRememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        int i12 = i6 >> 3;
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer2, i12 & 14);
                        int i13 = i6 & 14;
                        stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer2, i13);
                        ComposerKt.sourceInformationMarkerStart(composer2, 779552085, "CC(remember):Switch.kt#9igjgp");
                        zChanged2 = composer2.changed(anchoredDraggableState) | composer2.changed(stateRememberUpdatedState2) | composer2.changed(stateRememberUpdatedState);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (!zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            SwitchKt$Switch$1$1 switchKt$Switch$1$12 = new SwitchKt$Switch$1$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                            anchoredDraggableState2 = anchoredDraggableState;
                            switchKt$Switch$1$1 = switchKt$Switch$1$12;
                            composer2.updateRememberedValue(switchKt$Switch$1$1);
                        } else {
                            switchKt$Switch$1$1 = objRememberedValue4;
                            anchoredDraggableState2 = anchoredDraggableState;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        EffectsKt.LaunchedEffect(anchoredDraggableState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) switchKt$Switch$1$1, composer2, 0);
                        Boolean boolValueOf = Boolean.valueOf(z);
                        Boolean boolValueOf2 = Boolean.valueOf(Switch$lambda$3(mutableState));
                        ComposerKt.sourceInformationMarkerStart(composer2, 779563583, "CC(remember):Switch.kt#9igjgp");
                        zChanged3 = (i13 != 4) | composer2.changed(anchoredDraggableState2);
                        switchKt$Switch$2$1RememberedValue = composer2.rememberedValue();
                        if (!zChanged3 || switchKt$Switch$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            obj = null;
                            switchKt$Switch$2$1RememberedValue = new SwitchKt$Switch$2$1(z, anchoredDraggableState2, null);
                            composer2.updateRememberedValue(switchKt$Switch$2$1RememberedValue);
                        } else {
                            obj = null;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) switchKt$Switch$2$1RememberedValue, composer2, i13);
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume3 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        boolean z7 = objConsume3 != LayoutDirection.Rtl;
                        if (function1 == null) {
                            anchoredDraggableState3 = anchoredDraggableState2;
                            obj2 = obj;
                            z4 = z3;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            i7 = 2;
                            z5 = false;
                            companionM1276toggleableO2vRcR0 = ToggleableKt.m1276toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource5, null, z4, Role.m5405boximpl(Role.INSTANCE.m5417getSwitcho7Vup1c()), function1);
                        } else {
                            anchoredDraggableState3 = anchoredDraggableState2;
                            obj2 = obj;
                            z4 = z3;
                            mutableInteractionSource5 = mutableInteractionSource4;
                            i7 = 2;
                            z5 = false;
                            companionM1276toggleableO2vRcR0 = Modifier.INSTANCE;
                        }
                        if (function1 == null) {
                            companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        boolean z8 = z5;
                        final AnchoredDraggableState anchoredDraggableState4 = anchoredDraggableState3;
                        Modifier modifierM1059requiredSizeVpY3zN4 = SizeKt.m1059requiredSizeVpY3zN4(PaddingKt.m1020padding3ABfNKs(SizeKt.wrapContentSize$default(AnchoredDraggableKt.anchoredDraggable(modifier2.then(companionMinimumInteractiveComponentSize).then(companionM1276toggleableO2vRcR0), anchoredDraggableState3, Orientation.Horizontal, (z4 || function1 == null) ? z5 : true, z7, mutableInteractionSource5, false), Alignment.INSTANCE.getCenter(), z8, i7, obj2), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z8);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, z8 ? 1 : 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1059requiredSizeVpY3zN4);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -277232920, "C179@7838L42,175@7683L258:Switch.kt#jmzs0o");
                        boolean zBooleanValue = ((Boolean) anchoredDraggableState4.getTargetValue()).booleanValue();
                        ComposerKt.sourceInformationMarkerStart(composer2, 545251075, "CC(remember):Switch.kt#9igjgp");
                        zChanged4 = composer2.changed(anchoredDraggableState4);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged4) {
                            Object obj3 = objRememberedValue5;
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                Function0<Float> function0 = new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$3$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Float invoke() {
                                        return Float.valueOf(anchoredDraggableState4.requireOffset());
                                    }
                                };
                                composer2.updateRememberedValue(function0);
                                obj3 = function0;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            z3 = z4;
                            Modifier modifier4 = modifier2;
                            SwitchImpl(boxScopeInstance, zBooleanValue, z3, switchColors3, (Function0) obj3, mutableInteractionSource5, composer2, (i12 & 896) | 6 | ((i6 >> 6) & 7168));
                            composer3 = composer2;
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            switchColors4 = switchColors3;
                            mutableInteractionSource6 = mutableInteractionSource3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        mutableInteractionSource6 = mutableInteractionSource2;
                        switchColors4 = switchColors2;
                        composer3 = composerStartRestartGroup;
                    }
                    final boolean z9 = z3;
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.Switch.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i14) {
                                SwitchKt.Switch(z, function1, modifier3, z9, mutableInteractionSource6, switchColors4, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (mutableInteractionSource3 != null) {
                        }
                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume4 = composer2.consume(localDensity3);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        fMo712toPx0680j_4 = ((Density) objConsume4).mo712toPx0680j_4(ThumbPathLength);
                        ComposerKt.sourceInformationMarkerStart(composer2, 779526684, "CC(remember):Switch.kt#9igjgp");
                        objRememberedValue = composer2.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume22 = composer2.consume(localDensity22);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        fMo712toPx0680j_42 = ((Density) objConsume22).mo712toPx0680j_4(SwitchVelocityThreshold);
                        ComposerKt.sourceInformationMarkerStart(composer2, 779532409, "CC(remember):Switch.kt#9igjgp");
                        zChanged = composer2.changed(fMo712toPx0680j_4) | composer2.changed(fMo712toPx0680j_42);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChanged) {
                            final float f2 = 0.0f;
                            objRememberedValue2 = new AnchoredDraggableState(Boolean.valueOf(z), AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<Boolean>, Unit>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<Boolean> draggableAnchorsConfig) {
                                    invoke2(draggableAnchorsConfig);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DraggableAnchorsConfig<Boolean> draggableAnchorsConfig) {
                                    draggableAnchorsConfig.at(false, f2);
                                    draggableAnchorsConfig.at(true, fMo712toPx0680j_4);
                                }
                            }), new Function1<Float, Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$2
                                public final Float invoke(float f22) {
                                    return Float.valueOf(f22 * 0.7f);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Float invoke(Float f22) {
                                    return invoke(f22.floatValue());
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material.SwitchKt$Switch$anchoredDraggableState$1$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(fMo712toPx0680j_42);
                                }
                            }, AnimationSpec, null, 32, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                            anchoredDraggableState = (AnchoredDraggableState) objRememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            int i122 = i6 >> 3;
                            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer2, i122 & 14);
                            int i132 = i6 & 14;
                            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer2, i132);
                            ComposerKt.sourceInformationMarkerStart(composer2, 779552085, "CC(remember):Switch.kt#9igjgp");
                            zChanged2 = composer2.changed(anchoredDraggableState) | composer2.changed(stateRememberUpdatedState2) | composer2.changed(stateRememberUpdatedState);
                            Object objRememberedValue42 = composer2.rememberedValue();
                            if (zChanged2) {
                                SwitchKt$Switch$1$1 switchKt$Switch$1$122 = new SwitchKt$Switch$1$1(anchoredDraggableState, stateRememberUpdatedState2, stateRememberUpdatedState, mutableState, null);
                                anchoredDraggableState2 = anchoredDraggableState;
                                switchKt$Switch$1$1 = switchKt$Switch$1$122;
                                composer2.updateRememberedValue(switchKt$Switch$1$1);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                EffectsKt.LaunchedEffect(anchoredDraggableState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) switchKt$Switch$1$1, composer2, 0);
                                Boolean boolValueOf3 = Boolean.valueOf(z);
                                Boolean boolValueOf22 = Boolean.valueOf(Switch$lambda$3(mutableState));
                                ComposerKt.sourceInformationMarkerStart(composer2, 779563583, "CC(remember):Switch.kt#9igjgp");
                                zChanged3 = (i132 != 4) | composer2.changed(anchoredDraggableState2);
                                switchKt$Switch$2$1RememberedValue = composer2.rememberedValue();
                                if (zChanged3) {
                                    obj = null;
                                    switchKt$Switch$2$1RememberedValue = new SwitchKt$Switch$2$1(z, anchoredDraggableState2, null);
                                    composer2.updateRememberedValue(switchKt$Switch$2$1RememberedValue);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    EffectsKt.LaunchedEffect(boolValueOf3, boolValueOf22, (Function2) switchKt$Switch$2$1RememberedValue, composer2, i132);
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume32 = composer2.consume(localLayoutDirection2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (objConsume32 != LayoutDirection.Rtl) {
                                    }
                                    if (function1 == null) {
                                    }
                                    if (function1 == null) {
                                    }
                                    if (z4) {
                                        boolean z82 = z5;
                                        final AnchoredDraggableState<Boolean> anchoredDraggableState42 = anchoredDraggableState3;
                                        Modifier modifierM1059requiredSizeVpY3zN42 = SizeKt.m1059requiredSizeVpY3zN4(PaddingKt.m1020padding3ABfNKs(SizeKt.wrapContentSize$default(AnchoredDraggableKt.anchoredDraggable(modifier2.then(companionMinimumInteractiveComponentSize).then(companionM1276toggleableO2vRcR0), anchoredDraggableState3, Orientation.Horizontal, (z4 || function1 == null) ? z5 : true, z7, mutableInteractionSource5, false), Alignment.INSTANCE.getCenter(), z82, i7, obj2), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z82);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, z82 ? 1 : 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1059requiredSizeVpY3zN42);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                        }
                                        composer2.startReusableNode();
                                        if (!composer2.getInserting()) {
                                        }
                                        composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!composerM3150constructorimpl.getInserting()) {
                                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -277232920, "C179@7838L42,175@7683L258:Switch.kt#jmzs0o");
                                            boolean zBooleanValue2 = ((Boolean) anchoredDraggableState42.getTargetValue()).booleanValue();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 545251075, "CC(remember):Switch.kt#9igjgp");
                                            zChanged4 = composer2.changed(anchoredDraggableState42);
                                            Object objRememberedValue52 = composer2.rememberedValue();
                                            if (zChanged4) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final boolean z92 = z3;
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            final boolean z922 = z3;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        final boolean z9222 = z3;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Switch$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchImpl(final BoxScope boxScope, final boolean z, final boolean z2, final SwitchColors switchColors, final Function0<Float> function0, final InteractionSource interactionSource, Composer composer, final int i) {
        int i2;
        float f;
        String str;
        boolean z3;
        long jSwitchImpl$lambda$17;
        Composer composerStartRestartGroup = composer.startRestartGroup(70908914);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SwitchImpl)P(!1,2!1,4)221@9029L46,223@9115L614,223@9081L648,242@9932L28,246@10055L81,243@9965L171,249@10166L28,250@10244L7,*251@10303L7,253@10414L6,252@10353L228,262@10673L43,265@10826L133,259@10586L549:Switch.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i3, -1, "androidx.compose.material.SwitchImpl (Switch.kt:220)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 463286824, "CC(remember):Switch.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 463290144, "CC(remember):Switch.kt#9igjgp");
            boolean z4 = (458752 & i3) == 131072;
            SwitchKt$SwitchImpl$1$1 switchKt$SwitchImpl$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || switchKt$SwitchImpl$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                switchKt$SwitchImpl$1$1RememberedValue = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(switchKt$SwitchImpl$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) switchKt$SwitchImpl$1$1RememberedValue, composerStartRestartGroup, (i3 >> 15) & 14);
            if (!snapshotStateList.isEmpty()) {
                f = ThumbPressedElevation;
            } else {
                f = ThumbDefaultElevation;
            }
            float f2 = f;
            int i4 = ((i3 >> 6) & 14) | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 3) & 896);
            final State<Color> stateTrackColor = switchColors.trackColor(z2, z, composerStartRestartGroup, i4);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 463319691, "CC(remember):Switch.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(stateTrackColor);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SwitchKt.m2029drawTrackRPmYEkk(drawScope, SwitchKt.SwitchImpl$lambda$15(stateTrackColor), drawScope.mo712toPx0680j_4(SwitchKt.getTrackWidth()), drawScope.mo712toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            State<Color> stateThumbColor = switchColors.thumbColor(z2, z, composerStartRestartGroup, i4);
            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localElevationOverlay);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ElevationOverlay elevationOverlay = (ElevationOverlay) objConsume;
            ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localAbsoluteElevation);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            float fM6117constructorimpl = Dp.m6117constructorimpl(((Dp) objConsume2).m6131unboximpl() + f2);
            if (!Color.m3658equalsimpl0(SwitchImpl$lambda$17(stateThumbColor), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1837getSurface0d7_KjU()) || elevationOverlay == null) {
                str = "CC(remember):Switch.kt#9igjgp";
                z3 = true;
                composerStartRestartGroup.startReplaceGroup(1478489190);
                composerStartRestartGroup.endReplaceGroup();
                jSwitchImpl$lambda$17 = SwitchImpl$lambda$17(stateThumbColor);
            } else {
                composerStartRestartGroup.startReplaceGroup(1478408187);
                ComposerKt.sourceInformation(composerStartRestartGroup, "254@10489L36");
                str = "CC(remember):Switch.kt#9igjgp";
                z3 = true;
                jSwitchImpl$lambda$17 = elevationOverlay.mo1875apply7g2Lkgo(SwitchImpl$lambda$17(stateThumbColor), fM6117constructorimpl, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            State<Color> stateM453animateColorAsStateeuL9pac = SingleValueAnimationKt.m453animateColorAsStateeuL9pac(jSwitchImpl$lambda$17, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierAlign = boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 463339429, str);
            boolean z5 = (57344 & i3) == 16384 ? z3 : false;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                        return IntOffset.m6236boximpl(m2030invokeBjo55l4(density));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m2030invokeBjo55l4(Density density) {
                        return IntOffsetKt.IntOffset(MathKt.roundToInt(function0.invoke().floatValue()), 0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SpacerKt.Spacer(BackgroundKt.m574backgroundbw27NRU(ShadowKt.m3321shadows4CzXII$default(SizeKt.m1057requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue3), interactionSource, RippleKt.m1985rippleOrFallbackImplementation9IZ8Weo(false, ThumbRippleRadius, 0L, composerStartRestartGroup, 54, 4)), ThumbDiameter), f2, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), SwitchImpl$lambda$18(stateM453animateColorAsStateeuL9pac), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt.SwitchImpl.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    SwitchKt.SwitchImpl(boxScope, z, z2, switchColors, function0, interactionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m2029drawTrackRPmYEkk(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        DrawScope.m4199drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset(f3, Offset.m3417getYimpl(drawScope.mo4212getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f - f3, Offset.m3417getYimpl(drawScope.mo4212getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Boolean, Unit> Switch$lambda$7(State<? extends Function1<? super Boolean, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SwitchImpl$lambda$15(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }

    private static final long SwitchImpl$lambda$17(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }

    private static final long SwitchImpl$lambda$18(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }

    static {
        float fM6117constructorimpl = Dp.m6117constructorimpl(34);
        TrackWidth = fM6117constructorimpl;
        TrackStrokeWidth = Dp.m6117constructorimpl(14);
        float fM6117constructorimpl2 = Dp.m6117constructorimpl(20);
        ThumbDiameter = fM6117constructorimpl2;
        ThumbRippleRadius = Dp.m6117constructorimpl(24);
        DefaultSwitchPadding = Dp.m6117constructorimpl(2);
        SwitchWidth = fM6117constructorimpl;
        SwitchHeight = fM6117constructorimpl2;
        ThumbPathLength = Dp.m6117constructorimpl(fM6117constructorimpl - fM6117constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m6117constructorimpl(1);
        ThumbPressedElevation = Dp.m6117constructorimpl(6);
        SwitchVelocityThreshold = Dp.m6117constructorimpl(125);
    }
}
