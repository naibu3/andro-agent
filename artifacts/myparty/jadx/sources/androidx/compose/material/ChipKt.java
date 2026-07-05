package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0090\u0001\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010 \u001aÆ\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020#2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010&\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020)X\u008a\u0084\u0002"}, d2 = {"HorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingIconEndSpacing", "LeadingIconStartSpacing", "SelectedIconContainerSize", "SelectedOverlayOpacity", "", "SurfaceOverlayOpacity", "TrailingIconSpacing", "Chip", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "border", "Landroidx/compose/foundation/BorderStroke;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/ChipColors;", "leadingIcon", "Landroidx/compose/runtime/Composable;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "material_release", "contentColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconContentColor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m6117constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m6117constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m6117constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(final Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i6;
        BorderStroke borderStroke2;
        ChipColors chipColorsM1816chipColors5tl4gsc;
        int i7;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function22;
        CornerBasedShape cornerBasedShapeCopy;
        Composer composer2;
        Shape shape3;
        ChipColors chipColors2;
        BorderStroke borderStroke3;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        final ChipColors chipColors3;
        final Modifier modifier3;
        Composer composer3;
        final boolean z4;
        final Shape shape4;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource4;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-368396408);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Chip)P(7,6,3,4,8!2,5)92@4243L6,94@4360L12,98@4505L21,104@4702L24,108@4860L1458,99@4531L1787:Chip.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            int i10 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                            i3 |= i10;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i10;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else {
                        if ((196608 & i) == 0) {
                            borderStroke2 = borderStroke;
                            i3 |= composerStartRestartGroup.changed(borderStroke2) ? 131072 : 65536;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                chipColorsM1816chipColors5tl4gsc = chipColors;
                                int i11 = composerStartRestartGroup.changed(chipColorsM1816chipColors5tl4gsc) ? 1048576 : 524288;
                                i3 |= i11;
                            } else {
                                chipColorsM1816chipColors5tl4gsc = chipColors;
                            }
                            i3 |= i11;
                        } else {
                            chipColorsM1816chipColors5tl4gsc = chipColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                            i8 = i6;
                            function22 = function2;
                        } else {
                            i8 = i6;
                            function22 = function2;
                            if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                            }
                        }
                        if ((i2 & 256) == 0) {
                            if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i9 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if (i5 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if ((i2 & 16) == 0) {
                                        cornerBasedShapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                        i3 &= -57345;
                                    } else {
                                        cornerBasedShapeCopy = shape2;
                                    }
                                    BorderStroke borderStroke5 = i8 == 0 ? null : borderStroke2;
                                    if ((i2 & 64) == 0) {
                                        composer2 = composerStartRestartGroup;
                                        i3 &= -3670017;
                                        chipColorsM1816chipColors5tl4gsc = ChipDefaults.INSTANCE.m1816chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                    }
                                    ChipColors chipColors4 = chipColorsM1816chipColors5tl4gsc;
                                    shape3 = cornerBasedShapeCopy;
                                    chipColors2 = chipColors4;
                                    if (i7 == 0) {
                                        borderStroke3 = borderStroke5;
                                        z3 = z2;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        function22 = null;
                                    } else {
                                        function22 = function2;
                                        borderStroke3 = borderStroke5;
                                        z3 = z2;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    composer2 = composerStartRestartGroup;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    borderStroke3 = borderStroke2;
                                    chipColors2 = chipColorsM1816chipColors5tl4gsc;
                                    z3 = z2;
                                    shape3 = shape2;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-368396408, i3, -1, "androidx.compose.material.Chip (Chip.kt:97)");
                                }
                                int i12 = ((i3 >> 6) & 14) | ((i3 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                final State<Color> stateContentColor = chipColors2.contentColor(z3, composer2, i12);
                                final ChipColors chipColors5 = chipColors2;
                                final Function2<? super Composer, ? super Integer, Unit> function24 = function22;
                                final boolean z5 = z3;
                                SurfaceKt.m2016SurfaceLPr_se0(function0, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.m5431setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5412getButtono7Vup1c());
                                    }
                                }, 1, null), z3, shape3, chipColors2.backgroundColor(z3, composer2, i12).getValue().m3667unboximpl(), Color.m3656copywmQWz5c$default(Chip$lambda$0(stateContentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2
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

                                    public final void invoke(Composer composer4, int i13) {
                                        ComposerKt.sourceInformation(composer4, "C109@4942L1370,109@4870L1442:Chip.kt#jmzs0o");
                                        if ((i13 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(139076687, i13, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:109)");
                                            }
                                            ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3659getAlphaimpl(ChipKt.Chip$lambda$0(stateContentColor))));
                                            final Function2<Composer, Integer, Unit> function25 = function24;
                                            final ChipColors chipColors6 = chipColors5;
                                            final boolean z6 = z5;
                                            final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i14) {
                                                    ComposerKt.sourceInformation(composer5, "C111@5012L10,112@5043L1259,110@4956L1346:Chip.kt#jmzs0o");
                                                    if ((i14 & 3) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(667535631, i14, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:110)");
                                                        }
                                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer5, 6).getBody2();
                                                        final Function2<Composer, Integer, Unit> function26 = function25;
                                                        final ChipColors chipColors7 = chipColors6;
                                                        final boolean z7 = z6;
                                                        final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.rememberComposableLambda(-1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                invoke(composer6, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer6, int i15) {
                                                                float fM6117constructorimpl;
                                                                ComposerKt.sourceInformation(composer6, "C113@5061L1227:Chip.kt#jmzs0o");
                                                                if ((i15 & 3) != 2 || !composer6.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-1131213696, i15, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:113)");
                                                                    }
                                                                    Modifier modifierM1050defaultMinSizeVpY3zN4$default = SizeKt.m1050defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m1819getMinHeightD9Ej5fM(), 1, null);
                                                                    if (function26 == null) {
                                                                        fM6117constructorimpl = ChipKt.HorizontalPadding;
                                                                    } else {
                                                                        fM6117constructorimpl = Dp.m6117constructorimpl(0);
                                                                    }
                                                                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(modifierM1050defaultMinSizeVpY3zN4$default, fM6117constructorimpl, 0.0f, ChipKt.HorizontalPadding, 0.0f, 10, null);
                                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function2<Composer, Integer, Unit> function27 = function26;
                                                                    ChipColors chipColors8 = chipColors7;
                                                                    boolean z8 = z7;
                                                                    Function3<RowScope, Composer, Integer, Unit> function34 = function33;
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer6, 54);
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer6, modifierM1024paddingqDBjuR0$default);
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                    if (!(composer6.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer6.startReusableNode();
                                                                    if (composer6.getInserting()) {
                                                                        composer6.createNode(constructor);
                                                                    } else {
                                                                        composer6.useNode();
                                                                    }
                                                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer6);
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, 2027579830, "C137@6261L9:Chip.kt#jmzs0o");
                                                                    if (function27 != null) {
                                                                        composer6.startReplaceGroup(2027602924);
                                                                        ComposerKt.sourceInformation(composer6, "128@5714L47,129@5824L32,130@5881L267,135@6173L45");
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconStartSpacing), composer6, 6);
                                                                        State<Color> stateLeadingIconContentColor = chipColors8.leadingIconContentColor(z8, composer6, 0);
                                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(invoke$lambda$1$lambda$0(stateLeadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3659getAlphaimpl(invoke$lambda$1$lambda$0(stateLeadingIconContentColor))))}, function27, composer6, ProvidedValue.$stable);
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconEndSpacing), composer6, 6);
                                                                        composer6.endReplaceGroup();
                                                                    } else {
                                                                        composer6.startReplaceGroup(2028133396);
                                                                        composer6.endReplaceGroup();
                                                                    }
                                                                    function34.invoke(rowScopeInstance, composer6, 6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    composer6.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer6.skipToGroupEnd();
                                                            }

                                                            private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                                                                return state.getValue().m3667unboximpl();
                                                            }
                                                        }, composer5, 54), composer5, 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }, composer2, 54), composer2, (i3 & 14) | 805306368 | (i3 & 896) | ((i3 >> 3) & 7168) | (3670016 & (i3 << 3)) | (234881024 & (i3 << 15)), 128);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                chipColors3 = chipColors5;
                                modifier3 = modifier2;
                                composer3 = composer2;
                                z4 = z3;
                                shape4 = shape3;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                function23 = function24;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer3 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                z4 = z2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape4 = shape2;
                                function23 = function22;
                                borderStroke4 = borderStroke2;
                                chipColors3 = chipColorsM1816chipColors5tl4gsc;
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.3
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

                                    public final void invoke(Composer composer4, int i13) {
                                        ChipKt.Chip(function0, modifier3, z4, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function23, function3, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        if ((i3 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i9 != 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if ((i2 & 16) == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if ((i2 & 64) == 0) {
                                }
                                ChipColors chipColors42 = chipColorsM1816chipColors5tl4gsc;
                                shape3 = cornerBasedShapeCopy;
                                chipColors2 = chipColors42;
                                if (i7 == 0) {
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i122 = ((i3 >> 6) & 14) | ((i3 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                final State<Color> stateContentColor2 = chipColors2.contentColor(z3, composer2, i122);
                                final ChipColors chipColors52 = chipColors2;
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function22;
                                final boolean z52 = z3;
                                SurfaceKt.m2016SurfaceLPr_se0(function0, SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.m5431setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5412getButtono7Vup1c());
                                    }
                                }, 1, null), z3, shape3, chipColors2.backgroundColor(z3, composer2, i122).getValue().m3667unboximpl(), Color.m3656copywmQWz5c$default(Chip$lambda$0(stateContentColor2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2
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

                                    public final void invoke(Composer composer4, int i13) {
                                        ComposerKt.sourceInformation(composer4, "C109@4942L1370,109@4870L1442:Chip.kt#jmzs0o");
                                        if ((i13 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(139076687, i13, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:109)");
                                            }
                                            ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3659getAlphaimpl(ChipKt.Chip$lambda$0(stateContentColor2))));
                                            final Function2<? super Composer, ? super Integer, Unit> function25 = function242;
                                            final ChipColors chipColors6 = chipColors52;
                                            final boolean z6 = z52;
                                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i14) {
                                                    ComposerKt.sourceInformation(composer5, "C111@5012L10,112@5043L1259,110@4956L1346:Chip.kt#jmzs0o");
                                                    if ((i14 & 3) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(667535631, i14, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:110)");
                                                        }
                                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer5, 6).getBody2();
                                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                                        final ChipColors chipColors7 = chipColors6;
                                                        final boolean z7 = z6;
                                                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.rememberComposableLambda(-1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                invoke(composer6, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer6, int i15) {
                                                                float fM6117constructorimpl;
                                                                ComposerKt.sourceInformation(composer6, "C113@5061L1227:Chip.kt#jmzs0o");
                                                                if ((i15 & 3) != 2 || !composer6.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-1131213696, i15, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:113)");
                                                                    }
                                                                    Modifier modifierM1050defaultMinSizeVpY3zN4$default = SizeKt.m1050defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m1819getMinHeightD9Ej5fM(), 1, null);
                                                                    if (function26 == null) {
                                                                        fM6117constructorimpl = ChipKt.HorizontalPadding;
                                                                    } else {
                                                                        fM6117constructorimpl = Dp.m6117constructorimpl(0);
                                                                    }
                                                                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(modifierM1050defaultMinSizeVpY3zN4$default, fM6117constructorimpl, 0.0f, ChipKt.HorizontalPadding, 0.0f, 10, null);
                                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function2<Composer, Integer, Unit> function27 = function26;
                                                                    ChipColors chipColors8 = chipColors7;
                                                                    boolean z8 = z7;
                                                                    Function3<RowScope, Composer, Integer, Unit> function34 = function33;
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer6, 54);
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer6, modifierM1024paddingqDBjuR0$default);
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                    if (!(composer6.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer6.startReusableNode();
                                                                    if (composer6.getInserting()) {
                                                                        composer6.createNode(constructor);
                                                                    } else {
                                                                        composer6.useNode();
                                                                    }
                                                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer6);
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composer6, 2027579830, "C137@6261L9:Chip.kt#jmzs0o");
                                                                    if (function27 != null) {
                                                                        composer6.startReplaceGroup(2027602924);
                                                                        ComposerKt.sourceInformation(composer6, "128@5714L47,129@5824L32,130@5881L267,135@6173L45");
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconStartSpacing), composer6, 6);
                                                                        State<Color> stateLeadingIconContentColor = chipColors8.leadingIconContentColor(z8, composer6, 0);
                                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(invoke$lambda$1$lambda$0(stateLeadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3659getAlphaimpl(invoke$lambda$1$lambda$0(stateLeadingIconContentColor))))}, function27, composer6, ProvidedValue.$stable);
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconEndSpacing), composer6, 6);
                                                                        composer6.endReplaceGroup();
                                                                    } else {
                                                                        composer6.startReplaceGroup(2028133396);
                                                                        composer6.endReplaceGroup();
                                                                    }
                                                                    function34.invoke(rowScopeInstance, composer6, 6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    composer6.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer6.skipToGroupEnd();
                                                            }

                                                            private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                                                                return state.getValue().m3667unboximpl();
                                                            }
                                                        }, composer5, 54), composer5, 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }, composer2, 54), composer2, (i3 & 14) | 805306368 | (i3 & 896) | ((i3 >> 3) & 7168) | (3670016 & (i3 << 3)) | (234881024 & (i3 << 15)), 128);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                chipColors3 = chipColors52;
                                modifier3 = modifier2;
                                composer3 = composer2;
                                z4 = z3;
                                shape4 = shape3;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                function23 = function242;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        CornerBasedShape cornerBasedShapeCopy;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier.Companion companion;
        int i15;
        int i16;
        int i17;
        int i18;
        SelectableChipColors selectableChipColorsM1817filterChipColorsJ08w3E;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        MutableInteractionSource mutableInteractionSource2;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Shape shape2;
        Composer composer2;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        final SelectableChipColors selectableChipColors2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1259208246);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilterChip)P(8,7,6,3,4,10!2,5,9,11)189@8769L6,191@8896L18,198@9227L31,205@9465L34,209@9639L3966,199@9263L4342:Chip.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z3 = z2;
                        i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                        }
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            cornerBasedShapeCopy = shape;
                            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(cornerBasedShapeCopy)) ? 131072 : 65536;
                        } else {
                            cornerBasedShapeCopy = shape;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                            borderStroke2 = borderStroke;
                        } else {
                            borderStroke2 = borderStroke;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                            }
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & 128) != 0) {
                                i20 = 4194304;
                                i4 |= i20;
                            } else {
                                if ((16777216 & i) == 0 ? composerStartRestartGroup.changed(selectableChipColors) : composerStartRestartGroup.changedInstance(selectableChipColors)) {
                                    i20 = 8388608;
                                }
                                i4 |= i20;
                            }
                        }
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                            function24 = function2;
                        } else {
                            function24 = function2;
                            if ((i & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function24) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                        }
                        i10 = i3 & 512;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((i & 805306368) == 0) {
                                i11 = i10;
                                i4 |= composerStartRestartGroup.changedInstance(function22) ? 536870912 : 268435456;
                            }
                            i12 = i3 & 1024;
                            if (i12 == 0) {
                                i14 = i2 | 6;
                                i13 = i12;
                            } else if ((i2 & 6) == 0) {
                                i13 = i12;
                                i14 = i2 | (composerStartRestartGroup.changedInstance(function23) ? 4 : 2);
                            } else {
                                i13 = i12;
                                i14 = i2;
                            }
                            if ((i3 & 2048) != 0) {
                                if ((i2 & 48) == 0) {
                                    i14 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
                                }
                                int i21 = i14;
                                if ((i4 & 306783379) != 306783378 || (i21 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z5 = i6 == 0 ? true : z3;
                                        MutableInteractionSource mutableInteractionSource4 = i7 == 0 ? null : mutableInteractionSource;
                                        if ((i3 & 32) != 0) {
                                            cornerBasedShapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                            i4 &= -458753;
                                        }
                                        int i22 = i4;
                                        Shape shape4 = cornerBasedShapeCopy;
                                        BorderStroke borderStroke4 = i8 == 0 ? null : borderStroke2;
                                        if ((i3 & 128) == 0) {
                                            i16 = i9;
                                            i17 = i11;
                                            i18 = i13;
                                            i15 = i21;
                                            selectableChipColorsM1817filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m1817filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, FrameMetricsAggregator.EVERY_DURATION);
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            i22 &= -29360129;
                                        } else {
                                            i15 = i21;
                                            i16 = i9;
                                            i17 = i11;
                                            i18 = i13;
                                            selectableChipColorsM1817filterChipColorsJ08w3E = selectableChipColors;
                                        }
                                        if (i16 != 0) {
                                            function24 = null;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function211 = i17 == 0 ? null : function22;
                                        if (i18 == 0) {
                                            function26 = function211;
                                            z3 = z5;
                                            mutableInteractionSource2 = mutableInteractionSource4;
                                            i19 = i22;
                                            borderStroke2 = borderStroke4;
                                            function25 = null;
                                        } else {
                                            function25 = function23;
                                            function26 = function211;
                                            z3 = z5;
                                            mutableInteractionSource2 = mutableInteractionSource4;
                                            i19 = i22;
                                            borderStroke2 = borderStroke4;
                                        }
                                        function27 = function24;
                                        shape2 = shape4;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                        }
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        function25 = function23;
                                        i19 = i4;
                                        i15 = i21;
                                        companion = modifier2;
                                        selectableChipColorsM1817filterChipColorsJ08w3E = selectableChipColors;
                                        function27 = function24;
                                        shape2 = cornerBasedShapeCopy;
                                        function26 = function22;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1259208246, i19, i15, "androidx.compose.material.FilterChip (Chip.kt:196)");
                                    }
                                    int i23 = i19 << 3;
                                    int i24 = ((i19 >> 9) & 14) | (i23 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i19 >> 15) & 896);
                                    final State<Color> stateContentColor = selectableChipColorsM1817filterChipColorsJ08w3E.contentColor(z3, z, composerStartRestartGroup, i24);
                                    Shape shape5 = shape2;
                                    final Function2<? super Composer, ? super Integer, Unit> function212 = function27;
                                    final Function2<? super Composer, ? super Integer, Unit> function213 = function26;
                                    final SelectableChipColors selectableChipColors3 = selectableChipColorsM1817filterChipColorsJ08w3E;
                                    final Function2<? super Composer, ? super Integer, Unit> function214 = function25;
                                    final boolean z6 = z3;
                                    Modifier modifier4 = companion;
                                    SurfaceKt.m2017SurfaceNy5ogXk(z, function0, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.m5431setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5413getCheckboxo7Vup1c());
                                        }
                                    }, 1, null), z6, shape5, selectableChipColorsM1817filterChipColorsJ08w3E.backgroundColor(z3, z, composerStartRestartGroup, i24).getValue().m3667unboximpl(), Color.m3656copywmQWz5c$default(stateContentColor.getValue().m3667unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i25) {
                                            ComposerKt.sourceInformation(composer3, "C210@9727L3872,210@9649L3950:Chip.kt#jmzs0o");
                                            if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(722126431, i25, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:210)");
                                                }
                                                ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3659getAlphaimpl(stateContentColor.getValue().m3667unboximpl())));
                                                final Function2<Composer, Integer, Unit> function215 = function212;
                                                final boolean z7 = z;
                                                final Function2<Composer, Integer, Unit> function216 = function213;
                                                final Function2<Composer, Integer, Unit> function217 = function214;
                                                final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                                final boolean z8 = z6;
                                                final State<Color> state = stateContentColor;
                                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2.1
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

                                                    public final void invoke(Composer composer4, int i26) {
                                                        ComposerKt.sourceInformation(composer4, "C212@9797L10,213@9828L3761,211@9741L3848:Chip.kt#jmzs0o");
                                                        if ((i26 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1582291359, i26, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:211)");
                                                            }
                                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                            final Function2<Composer, Integer, Unit> function218 = function215;
                                                            final boolean z9 = z7;
                                                            final Function2<Composer, Integer, Unit> function219 = function216;
                                                            final Function2<Composer, Integer, Unit> function220 = function217;
                                                            final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                            final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                                            final boolean z10 = z8;
                                                            final State<Color> state2 = state;
                                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.rememberComposableLambda(-1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2.1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                    invoke(composer5, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer5, int i27) {
                                                                    Function2<Composer, Integer, Unit> function221;
                                                                    Function3<RowScope, Composer, Integer, Unit> function34;
                                                                    ComposerKt.sourceInformation(composer5, "C214@9846L3729:Chip.kt#jmzs0o");
                                                                    if ((i27 & 3) == 2 && composer5.getSkipping()) {
                                                                        composer5.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-1543702066, i27, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:214)");
                                                                    }
                                                                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SizeKt.m1050defaultMinSizeVpY3zN4$default(IntrinsicKt.width(Modifier.INSTANCE, IntrinsicSize.Max), 0.0f, ChipDefaults.INSTANCE.m1819getMinHeightD9Ej5fM(), 1, null), (function218 != null || (z9 && function219 != null)) ? Dp.m6117constructorimpl(0) : ChipKt.HorizontalPadding, 0.0f, function220 == null ? ChipKt.HorizontalPadding : Dp.m6117constructorimpl(0), 0.0f, 10, null);
                                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function2<Composer, Integer, Unit> function222 = function218;
                                                                    boolean z11 = z9;
                                                                    Function2<Composer, Integer, Unit> function223 = function219;
                                                                    Function3<RowScope, Composer, Integer, Unit> function35 = function33;
                                                                    Function2<Composer, Integer, Unit> function224 = function220;
                                                                    SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                                                    boolean z12 = z10;
                                                                    State<Color> state3 = state2;
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierM1024paddingqDBjuR0$default);
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 692228395, "C277@13048L264:Chip.kt#jmzs0o");
                                                                    if (function222 != null || (z11 && function223 != null)) {
                                                                        composer5.startReplaceGroup(692272507);
                                                                        ComposerKt.sourceInformation(composer5, "238@10908L47,239@10980L1955,275@12960L45");
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconStartSpacing), composer5, 6);
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                        function221 = function224;
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                        CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, companion2);
                                                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                        function34 = function35;
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                                            ComposablesKt.invalidApplier();
                                                                        }
                                                                        composer5.startReusableNode();
                                                                        if (composer5.getInserting()) {
                                                                            composer5.createNode(constructor2);
                                                                        } else {
                                                                            composer5.useNode();
                                                                        }
                                                                        Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer5);
                                                                        Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                        Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                        if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                            composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                            composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                        }
                                                                        Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, 1866397079, "C:Chip.kt#jmzs0o");
                                                                        if (function222 != null) {
                                                                            composer5.startReplaceGroup(1866380648);
                                                                            ComposerKt.sourceInformation(composer5, "241@11103L141,245@11277L297");
                                                                            State<Color> stateLeadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, 0);
                                                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(stateLeadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3659getAlphaimpl(stateLeadingIconColor.getValue().m3667unboximpl())))}, function222, composer5, ProvidedValue.$stable);
                                                                            composer5.endReplaceGroup();
                                                                        } else {
                                                                            composer5.startReplaceGroup(1866923613);
                                                                            composer5.endReplaceGroup();
                                                                        }
                                                                        if (!z11 || function223 == null) {
                                                                            composer5.startReplaceGroup(1868218173);
                                                                            composer5.endReplaceGroup();
                                                                        } else {
                                                                            composer5.startReplaceGroup(1867028455);
                                                                            ComposerKt.sourceInformation(composer5, "264@12428L451");
                                                                            Modifier.Companion companionClip = Modifier.INSTANCE;
                                                                            long jM3667unboximpl = state3.getValue().m3667unboximpl();
                                                                            if (function222 != null) {
                                                                                composer5.startReplaceGroup(1867203760);
                                                                                ComposerKt.sourceInformation(composer5, "262@12321L34");
                                                                                companionClip = ClipKt.clip(BackgroundKt.m574backgroundbw27NRU(SizeKt.m1057requiredSize3ABfNKs(Modifier.INSTANCE, ChipKt.SelectedIconContainerSize), state3.getValue().m3667unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                                jM3667unboximpl = selectableChipColors6.backgroundColor(z12, z11, composer5, 0).getValue().m3667unboximpl();
                                                                                composer5.endReplaceGroup();
                                                                            } else {
                                                                                composer5.startReplaceGroup(1867708285);
                                                                                composer5.endReplaceGroup();
                                                                            }
                                                                            Alignment center = Alignment.INSTANCE.getCenter();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, companionClip);
                                                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                                ComposablesKt.invalidApplier();
                                                                            }
                                                                            composer5.startReusableNode();
                                                                            if (composer5.getInserting()) {
                                                                                composer5.createNode(constructor3);
                                                                            } else {
                                                                                composer5.useNode();
                                                                            }
                                                                            Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composer5);
                                                                            Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                            Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                            if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                                composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                                composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                            }
                                                                            Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1335339309, "C268@12641L204:Chip.kt#jmzs0o");
                                                                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(jM3667unboximpl)), function223, composer5, ProvidedValue.$stable);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            composer5.endNode();
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            composer5.endReplaceGroup();
                                                                        }
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        composer5.endNode();
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconEndSpacing), composer5, 6);
                                                                        composer5.endReplaceGroup();
                                                                    } else {
                                                                        composer5.startReplaceGroup(694333852);
                                                                        composer5.endReplaceGroup();
                                                                        function34 = function35;
                                                                        function221 = function224;
                                                                    }
                                                                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                                                    Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, composer5, 54);
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierWeight$default);
                                                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor4);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    Composer composerM3150constructorimpl4 = Updater.m3150constructorimpl(composer5);
                                                                    Updater.m3157setimpl(composerM3150constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (composerM3150constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                        composerM3150constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                        composerM3150constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                                    }
                                                                    Updater.m3157setimpl(composerM3150constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                                                    function34.invoke(RowScopeInstance.INSTANCE, composer5, 6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    composer5.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    if (function221 != null) {
                                                                        composer5.startReplaceGroup(694669334);
                                                                        ComposerKt.sourceInformation(composer5, "284@13385L43,285@13453L14,286@13492L43");
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.TrailingIconSpacing), composer5, 6);
                                                                        function221.invoke(composer5, 0);
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.TrailingIconSpacing), composer5, 6);
                                                                        composer5.endReplaceGroup();
                                                                    } else {
                                                                        composer5.startReplaceGroup(694859612);
                                                                        composer5.endReplaceGroup();
                                                                    }
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    composer5.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }, composer4, 54), composer4, 48);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i19 & 7294) | (57344 & (i19 >> 3)) | (29360128 & i23) | ((i19 << 15) & 1879048192), 6, 256);
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    shape3 = shape5;
                                    borderStroke3 = borderStroke2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    selectableChipColors2 = selectableChipColors3;
                                    function28 = function212;
                                    function29 = function213;
                                    function210 = function214;
                                    z4 = z6;
                                    modifier3 = modifier4;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    selectableChipColors2 = selectableChipColors;
                                    function29 = function22;
                                    function210 = function23;
                                    shape3 = cornerBasedShapeCopy;
                                    borderStroke3 = borderStroke2;
                                    modifier3 = modifier2;
                                    composer2 = composerStartRestartGroup;
                                    function28 = function24;
                                    z4 = z3;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i25) {
                                            ChipKt.FilterChip(z, function0, modifier3, z4, mutableInteractionSource3, shape3, borderStroke3, selectableChipColors2, function28, function29, function210, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 |= 48;
                            int i212 = i14;
                            if ((i4 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i5 == 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if ((i3 & 32) != 0) {
                                    }
                                    int i222 = i4;
                                    Shape shape42 = cornerBasedShapeCopy;
                                    if (i8 == 0) {
                                    }
                                    if ((i3 & 128) == 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    function27 = function24;
                                    shape2 = shape42;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i232 = i19 << 3;
                                    int i242 = ((i19 >> 9) & 14) | (i232 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i19 >> 15) & 896);
                                    final State<Color> stateContentColor2 = selectableChipColorsM1817filterChipColorsJ08w3E.contentColor(z3, z, composerStartRestartGroup, i242);
                                    Shape shape52 = shape2;
                                    final Function2<? super Composer, ? super Integer, Unit> function2122 = function27;
                                    final Function2<? super Composer, ? super Integer, Unit> function2132 = function26;
                                    final SelectableChipColors selectableChipColors32 = selectableChipColorsM1817filterChipColorsJ08w3E;
                                    final Function2<? super Composer, ? super Integer, Unit> function2142 = function25;
                                    final boolean z62 = z3;
                                    Modifier modifier42 = companion;
                                    SurfaceKt.m2017SurfaceNy5ogXk(z, function0, SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.m5431setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5413getCheckboxo7Vup1c());
                                        }
                                    }, 1, null), z62, shape52, selectableChipColorsM1817filterChipColorsJ08w3E.backgroundColor(z3, z, composerStartRestartGroup, i242).getValue().m3667unboximpl(), Color.m3656copywmQWz5c$default(stateContentColor2.getValue().m3667unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i25) {
                                            ComposerKt.sourceInformation(composer3, "C210@9727L3872,210@9649L3950:Chip.kt#jmzs0o");
                                            if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(722126431, i25, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:210)");
                                                }
                                                ProvidedValue<Float> providedValueProvides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3659getAlphaimpl(stateContentColor2.getValue().m3667unboximpl())));
                                                final Function2<? super Composer, ? super Integer, Unit> function215 = function2122;
                                                final boolean z7 = z;
                                                final Function2<? super Composer, ? super Integer, Unit> function216 = function2132;
                                                final Function2<? super Composer, ? super Integer, Unit> function217 = function2142;
                                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                                final SelectableChipColors selectableChipColors4 = selectableChipColors32;
                                                final boolean z8 = z62;
                                                final State<Color> state = stateContentColor2;
                                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2.1
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

                                                    public final void invoke(Composer composer4, int i26) {
                                                        ComposerKt.sourceInformation(composer4, "C212@9797L10,213@9828L3761,211@9741L3848:Chip.kt#jmzs0o");
                                                        if ((i26 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1582291359, i26, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:211)");
                                                            }
                                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                            final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                                                            final boolean z9 = z7;
                                                            final Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                                                            final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                                                            final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                                            final boolean z10 = z8;
                                                            final State<Color> state2 = state;
                                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.rememberComposableLambda(-1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2.1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                    invoke(composer5, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer5, int i27) {
                                                                    Function2<Composer, Integer, Unit> function221;
                                                                    Function3<RowScope, Composer, Integer, Unit> function34;
                                                                    ComposerKt.sourceInformation(composer5, "C214@9846L3729:Chip.kt#jmzs0o");
                                                                    if ((i27 & 3) == 2 && composer5.getSkipping()) {
                                                                        composer5.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-1543702066, i27, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:214)");
                                                                    }
                                                                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SizeKt.m1050defaultMinSizeVpY3zN4$default(IntrinsicKt.width(Modifier.INSTANCE, IntrinsicSize.Max), 0.0f, ChipDefaults.INSTANCE.m1819getMinHeightD9Ej5fM(), 1, null), (function218 != null || (z9 && function219 != null)) ? Dp.m6117constructorimpl(0) : ChipKt.HorizontalPadding, 0.0f, function220 == null ? ChipKt.HorizontalPadding : Dp.m6117constructorimpl(0), 0.0f, 10, null);
                                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function2<Composer, Integer, Unit> function222 = function218;
                                                                    boolean z11 = z9;
                                                                    Function2<Composer, Integer, Unit> function223 = function219;
                                                                    Function3<RowScope, Composer, Integer, Unit> function35 = function33;
                                                                    Function2<Composer, Integer, Unit> function224 = function220;
                                                                    SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                                                    boolean z12 = z10;
                                                                    State<Color> state3 = state2;
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierM1024paddingqDBjuR0$default);
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 692228395, "C277@13048L264:Chip.kt#jmzs0o");
                                                                    if (function222 != null || (z11 && function223 != null)) {
                                                                        composer5.startReplaceGroup(692272507);
                                                                        ComposerKt.sourceInformation(composer5, "238@10908L47,239@10980L1955,275@12960L45");
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconStartSpacing), composer5, 6);
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                        function221 = function224;
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                        CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, companion2);
                                                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                        function34 = function35;
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                        if (!(composer5.getApplier() instanceof Applier)) {
                                                                            ComposablesKt.invalidApplier();
                                                                        }
                                                                        composer5.startReusableNode();
                                                                        if (composer5.getInserting()) {
                                                                            composer5.createNode(constructor2);
                                                                        } else {
                                                                            composer5.useNode();
                                                                        }
                                                                        Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer5);
                                                                        Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                        Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                        if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                            composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                            composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                        }
                                                                        Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                        ComposerKt.sourceInformationMarkerStart(composer5, 1866397079, "C:Chip.kt#jmzs0o");
                                                                        if (function222 != null) {
                                                                            composer5.startReplaceGroup(1866380648);
                                                                            ComposerKt.sourceInformation(composer5, "241@11103L141,245@11277L297");
                                                                            State<Color> stateLeadingIconColor = selectableChipColors6.leadingIconColor(z12, z11, composer5, 0);
                                                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(stateLeadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3659getAlphaimpl(stateLeadingIconColor.getValue().m3667unboximpl())))}, function222, composer5, ProvidedValue.$stable);
                                                                            composer5.endReplaceGroup();
                                                                        } else {
                                                                            composer5.startReplaceGroup(1866923613);
                                                                            composer5.endReplaceGroup();
                                                                        }
                                                                        if (!z11 || function223 == null) {
                                                                            composer5.startReplaceGroup(1868218173);
                                                                            composer5.endReplaceGroup();
                                                                        } else {
                                                                            composer5.startReplaceGroup(1867028455);
                                                                            ComposerKt.sourceInformation(composer5, "264@12428L451");
                                                                            Modifier.Companion companionClip = Modifier.INSTANCE;
                                                                            long jM3667unboximpl = state3.getValue().m3667unboximpl();
                                                                            if (function222 != null) {
                                                                                composer5.startReplaceGroup(1867203760);
                                                                                ComposerKt.sourceInformation(composer5, "262@12321L34");
                                                                                companionClip = ClipKt.clip(BackgroundKt.m574backgroundbw27NRU(SizeKt.m1057requiredSize3ABfNKs(Modifier.INSTANCE, ChipKt.SelectedIconContainerSize), state3.getValue().m3667unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                                jM3667unboximpl = selectableChipColors6.backgroundColor(z12, z11, composer5, 0).getValue().m3667unboximpl();
                                                                                composer5.endReplaceGroup();
                                                                            } else {
                                                                                composer5.startReplaceGroup(1867708285);
                                                                                composer5.endReplaceGroup();
                                                                            }
                                                                            Alignment center = Alignment.INSTANCE.getCenter();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                            CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, companionClip);
                                                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                                ComposablesKt.invalidApplier();
                                                                            }
                                                                            composer5.startReusableNode();
                                                                            if (composer5.getInserting()) {
                                                                                composer5.createNode(constructor3);
                                                                            } else {
                                                                                composer5.useNode();
                                                                            }
                                                                            Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composer5);
                                                                            Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                            Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                            if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                                composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                                composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                            }
                                                                            Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1335339309, "C268@12641L204:Chip.kt#jmzs0o");
                                                                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(jM3667unboximpl)), function223, composer5, ProvidedValue.$stable);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            composer5.endNode();
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                            composer5.endReplaceGroup();
                                                                        }
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        composer5.endNode();
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.LeadingIconEndSpacing), composer5, 6);
                                                                        composer5.endReplaceGroup();
                                                                    } else {
                                                                        composer5.startReplaceGroup(694333852);
                                                                        composer5.endReplaceGroup();
                                                                        function34 = function35;
                                                                        function221 = function224;
                                                                    }
                                                                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                                                    Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, composer5, 54);
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierWeight$default);
                                                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor4);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    Composer composerM3150constructorimpl4 = Updater.m3150constructorimpl(composer5);
                                                                    Updater.m3157setimpl(composerM3150constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (composerM3150constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                        composerM3150constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                        composerM3150constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                                    }
                                                                    Updater.m3157setimpl(composerM3150constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                                                    function34.invoke(RowScopeInstance.INSTANCE, composer5, 6);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    composer5.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    if (function221 != null) {
                                                                        composer5.startReplaceGroup(694669334);
                                                                        ComposerKt.sourceInformation(composer5, "284@13385L43,285@13453L14,286@13492L43");
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.TrailingIconSpacing), composer5, 6);
                                                                        function221.invoke(composer5, 0);
                                                                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.TrailingIconSpacing), composer5, 6);
                                                                        composer5.endReplaceGroup();
                                                                    } else {
                                                                        composer5.startReplaceGroup(694859612);
                                                                        composer5.endReplaceGroup();
                                                                    }
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    composer5.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }, composer4, 54), composer4, 48);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i19 & 7294) | (57344 & (i19 >> 3)) | (29360128 & i232) | ((i19 << 15) & 1879048192), 6, 256);
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    shape3 = shape52;
                                    borderStroke3 = borderStroke2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    selectableChipColors2 = selectableChipColors32;
                                    function28 = function2122;
                                    function29 = function2132;
                                    function210 = function2142;
                                    z4 = z62;
                                    modifier3 = modifier42;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i11 = i10;
                        i12 = i3 & 1024;
                        if (i12 == 0) {
                        }
                        if ((i3 & 2048) != 0) {
                        }
                        int i2122 = i14;
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    int i21222 = i14;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z3 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                int i212222 = i14;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z3 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i2122222 = i14;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z3 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i21222222 = i14;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Chip$lambda$0(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }

    static {
        float f = 8;
        LeadingIconEndSpacing = Dp.m6117constructorimpl(f);
        TrailingIconSpacing = Dp.m6117constructorimpl(f);
    }
}
