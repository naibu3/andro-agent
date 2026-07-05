package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0080\u0002\u0010\u001b\u001a\u00020\u00062\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010 ¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010 ¢\u0006\u0002\b\u00172\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010&\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020\u000f2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u009b\u0001\u0010+\u001a\u00020\u00062\u0013\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010 ¢\u0006\u0002\b\u00172\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0002\b\u00172\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0002\b\u00172\u0013\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010 ¢\u0006\u0002\b\u00172\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0002\b\u00172\u0006\u0010\u0011\u001a\u00020\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 2\u0006\u0010$\u001a\u00020%2\u0006\u00100\u001a\u00020\bH\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u001c\u00103\u001a\u0002042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u0003052\u0006\u00106\u001a\u000207H\u0002\u001a!\u00108\u001a\u00020\u001e2\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\"H\u0007¢\u0006\u0002\u0010;\u001a;\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020>2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020/0@2\u0014\b\u0002\u0010A\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\n0\u0015H\u0007¢\u0006\u0002\u0010B\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"BottomSheetScaffoldPositionalThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "BottomSheetScaffoldVelocityThreshold", "FabSpacing", "BottomSheet", "", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/compose/material/BottomSheetState;", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetPeekHeight", "modifier", "Landroidx/compose/ui/Modifier;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomSheet-dAqlCkY", "(Landroidx/compose/material/BottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheetScaffold", "sheetContent", "scaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "topBar", "Lkotlin/Function0;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", ViewProps.BACKGROUND_COLOR, "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-HnlDQGw", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffoldLayout", "body", "bottomSheet", "sheetOffset", "", "sheetState", "BottomSheetScaffoldLayout-HJHHjMs", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;ILandroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "rememberBottomSheetScaffoldState", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetState", "initialValue", "Landroidx/compose/material/BottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m6117constructorimpl(16);
    private static final float BottomSheetScaffoldPositionalThreshold = Dp.m6117constructorimpl(56);
    private static final float BottomSheetScaffoldVelocityThreshold = Dp.m6117constructorimpl(125);

    public static final BottomSheetState rememberBottomSheetState(final BottomSheetValue bottomSheetValue, final AnimationSpec<Float> animationSpec, final Function1<? super BottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1808153344, "C(rememberBottomSheetState)P(2)237@8802L7,245@9044L210,238@8821L433:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = BottomSheetScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.rememberBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(BottomSheetValue bottomSheetValue2) {
                    return true;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:236)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) objConsume;
        Object[] objArr = {animationSpec};
        Saver<BottomSheetState, ?> Saver = BottomSheetState.INSTANCE.Saver(animationSpec, function1, density);
        ComposerKt.sourceInformationMarkerStart(composer, -1916212030, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        boolean zChanged = ((((i & 14) ^ 6) > 4 && composer.changed(bottomSheetValue)) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(animationSpec) | ((((i & 896) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(function1)) || (i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function0) new Function0<BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final BottomSheetState invoke() {
                    return new BottomSheetState(bottomSheetValue, density, animationSpec, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return bottomSheetState;
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        Composer composer2;
        ComposerKt.sourceInformationMarkerStart(composer, -1022285988, "C(rememberBottomSheetScaffoldState)275@9938L35,276@10018L32,278@10092L196:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            composer2 = composer;
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer2, 6, 6);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 200089082, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022285988, i, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:277)");
        }
        ComposerKt.sourceInformationMarkerStart(composer2, 200091614, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer2.changed(bottomSheetState)) || (i & 6) == 4) | ((((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i & 48) == 32);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        return bottomSheetScaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* renamed from: BottomSheetScaffold-HnlDQGw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1794BottomSheetScaffoldHnlDQGw(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function22, int i, boolean z, Shape shape, float f, long j, long j2, float f2, long j3, long j4, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
        int i6;
        int i7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M1860getLambda1$material_release;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i9;
        int i10;
        int i11;
        boolean z2;
        CornerBasedShape large;
        int i12;
        int i13;
        long jM1826getBackground0d7_KjU;
        int iM1913getEnd5ygKITE;
        float fM1791getSheetElevationD9Ej5fM;
        boolean z3;
        long jM1837getSurface0d7_KjU;
        long jM1851contentColorForek8zF_U;
        float fM1792getSheetPeekHeightD9Ej5fM;
        int i14;
        float f3;
        long j5;
        long j6;
        long j7;
        int i15;
        final float f4;
        Composer composer2;
        final Shape shape2;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        final int i16;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final BottomSheetScaffoldState bottomSheetScaffoldState2;
        final boolean z4;
        final long j8;
        final long j9;
        final float f5;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final float f6;
        final Modifier modifier3;
        final long j10;
        final long j11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-423121424);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomSheetScaffold)P(8,5,6,15,14,3,4:c#material.FabPosition,11,13,10:c#ui.unit.Dp,7:c#ui.graphics.Color,9:c#ui.graphics.Color,12:c#ui.unit.Dp,0:c#ui.graphics.Color,2:c#ui.graphics.Color)334@13334L34,340@13703L6,342@13834L6,343@13881L37,345@14034L6,346@14079L32,354@14299L1864,349@14170L1993:BottomSheetScaffold.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i17 = i4 & 2;
        if (i17 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                if ((i4 & 4) == 0) {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    int i18 = composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState) ? 256 : 128;
                    i5 |= i18;
                } else {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                }
                i5 |= i18;
            } else {
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 == 0) {
                    if ((i2 & 24576) == 0) {
                        function3M1860getLambda1$material_release = function32;
                        i5 |= composerStartRestartGroup.changedInstance(function3M1860getLambda1$material_release) ? 16384 : 8192;
                    }
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function23 = function22;
                    } else {
                        function23 = function22;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        i10 = i;
                    } else {
                        i10 = i;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerStartRestartGroup.changed(i10) ? 1048576 : 524288;
                        }
                    }
                    i11 = i4 & 128;
                    if (i11 == 0) {
                        i5 |= 12582912;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 100663296) != 0) {
                        if ((i4 & 256) == 0) {
                            large = shape;
                            int i19 = composerStartRestartGroup.changed(large) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i5 |= i19;
                        } else {
                            large = shape;
                        }
                        i5 |= i19;
                    } else {
                        large = shape;
                    }
                    if ((i2 & 805306368) == 0) {
                        i5 |= ((i4 & 512) == 0 && composerStartRestartGroup.changed(f)) ? 536870912 : 268435456;
                    }
                    if ((i3 & 6) != 0) {
                        i12 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(j)) ? 4 : 2);
                    } else {
                        i12 = i3;
                    }
                    if ((i3 & 48) != 0) {
                        i12 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(j2)) ? 32 : 16;
                    }
                    int i20 = i12;
                    if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                        i13 = i20 | (((i4 & 4096) == 0 && composerStartRestartGroup.changed(f2)) ? 256 : 128);
                    } else {
                        i13 = i20;
                    }
                    if ((i3 & 3072) != 0) {
                        jM1826getBackground0d7_KjU = j3;
                        i13 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(jM1826getBackground0d7_KjU)) ? 2048 : 1024;
                    } else {
                        jM1826getBackground0d7_KjU = j3;
                    }
                    if ((i3 & 24576) == 0) {
                        i13 |= ((i4 & 16384) == 0 && composerStartRestartGroup.changed(j4)) ? 16384 : 8192;
                    }
                    if ((i4 & 32768) == 0) {
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i13 |= composerStartRestartGroup.changedInstance(function33) ? 131072 : 65536;
                    }
                    if ((306783379 & i5) == 306783378 || (i13 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            }
                            Function2<? super Composer, ? super Integer, Unit> function26 = i6 == 0 ? null : function2;
                            if (i7 != 0) {
                                function3M1860getLambda1$material_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1860getLambda1$material_release();
                            }
                            if (i8 != 0) {
                                function23 = null;
                            }
                            iM1913getEnd5ygKITE = i9 == 0 ? FabPosition.INSTANCE.m1913getEnd5ygKITE() : i10;
                            if (i11 != 0) {
                                z2 = true;
                            }
                            if ((i4 & 256) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i5 &= -234881025;
                            }
                            if ((i4 & 512) == 0) {
                                fM1791getSheetElevationD9Ej5fM = BottomSheetScaffoldDefaults.INSTANCE.m1791getSheetElevationD9Ej5fM();
                                i5 &= -1879048193;
                            } else {
                                fM1791getSheetElevationD9Ej5fM = f;
                            }
                            if ((i4 & 1024) == 0) {
                                i13 &= -15;
                                z3 = z2;
                                jM1837getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1837getSurface0d7_KjU();
                            } else {
                                z3 = z2;
                                jM1837getSurface0d7_KjU = j;
                            }
                            if ((i4 & 2048) == 0) {
                                jM1851contentColorForek8zF_U = ColorsKt.m1851contentColorForek8zF_U(jM1837getSurface0d7_KjU, composerStartRestartGroup, i13 & 14);
                                i13 &= -113;
                            } else {
                                jM1851contentColorForek8zF_U = j2;
                            }
                            int i21 = i13;
                            function2 = function26;
                            if ((i4 & 4096) == 0) {
                                fM1792getSheetPeekHeightD9Ej5fM = BottomSheetScaffoldDefaults.INSTANCE.m1792getSheetPeekHeightD9Ej5fM();
                                i21 &= -897;
                            } else {
                                fM1792getSheetPeekHeightD9Ej5fM = f2;
                            }
                            float f7 = fM1792getSheetPeekHeightD9Ej5fM;
                            if ((i4 & 8192) == 0) {
                                jM1826getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1826getBackground0d7_KjU();
                                i14 = i21 & (-7169);
                            } else {
                                i14 = i21;
                            }
                            if ((i4 & 16384) == 0) {
                                long jM1851contentColorForek8zF_U2 = ColorsKt.m1851contentColorForek8zF_U(jM1826getBackground0d7_KjU, composerStartRestartGroup, (i14 >> 9) & 14);
                                i14 &= -57345;
                                f3 = f7;
                                j5 = jM1851contentColorForek8zF_U2;
                            } else {
                                f3 = f7;
                                j5 = j4;
                            }
                            j6 = jM1826getBackground0d7_KjU;
                            j7 = jM1837getSurface0d7_KjU;
                            z2 = z3;
                            i15 = i5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            if ((i4 & 512) != 0) {
                                i5 &= -1879048193;
                            }
                            if ((i4 & 1024) != 0) {
                                i13 &= -15;
                            }
                            if ((i4 & 2048) != 0) {
                                i13 &= -113;
                            }
                            i14 = i13;
                            if ((i4 & 4096) != 0) {
                                i14 &= -897;
                            }
                            if ((i4 & 8192) != 0) {
                                i14 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i14 &= -57345;
                            }
                            jM1851contentColorForek8zF_U = j2;
                            f3 = f2;
                            j5 = j4;
                            j6 = jM1826getBackground0d7_KjU;
                            i15 = i5;
                            iM1913getEnd5ygKITE = i10;
                            fM1791getSheetElevationD9Ej5fM = f;
                            j7 = j;
                        }
                        int i22 = i14;
                        final Function2<? super Composer, ? super Integer, Unit> function27 = function2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            f4 = f3;
                        } else {
                            f4 = f3;
                            ComposerKt.traceEventStart(-423121424, i15, i22, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:348)");
                        }
                        final Shape shape3 = large;
                        final long j12 = j7;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35 = function3M1860getLambda1$material_release;
                        final int i23 = iM1913getEnd5ygKITE;
                        final Function2<? super Composer, ? super Integer, Unit> function28 = function23;
                        final float f8 = fM1791getSheetElevationD9Ej5fM;
                        final BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        final boolean z5 = z2;
                        final long j13 = jM1851contentColorForek8zF_U;
                        float f9 = f4;
                        int i24 = i22 >> 3;
                        long j14 = j6;
                        long j15 = j5;
                        SurfaceKt.m2015SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j14, j15, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-131096268, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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
                                ComposerKt.sourceInformation(composer3, "C357@14384L52,358@14464L1265,385@15815L77,390@16024L50,355@14309L1848:BottomSheetScaffold.kt#jmzs0o");
                                if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-131096268, i25, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:355)");
                                    }
                                    BottomSheetState bottomSheetState = bottomSheetScaffoldState3.getBottomSheetState();
                                    Function2<Composer, Integer, Unit> function29 = function27;
                                    final Function3<PaddingValues, Composer, Integer, Unit> function36 = function33;
                                    final float f10 = f4;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1143451324, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.1
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
                                            ComposerKt.sourceInformation(composer4, "C357@14386L48:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i26 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1143451324, i26, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:357)");
                                            }
                                            function36.invoke(PaddingKt.m1017PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f10, 7, null), composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    final boolean z6 = z5;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState3;
                                    final float f11 = f4;
                                    final Shape shape4 = shape3;
                                    final float f12 = f8;
                                    final long j16 = j12;
                                    final long j17 = j13;
                                    final Function3<ColumnScope, Composer, Integer, Unit> function37 = function3;
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1856649243, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.2
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
                                            Modifier.Companion companionNestedScroll$default;
                                            ComposerKt.sourceInformation(composer4, "C370@15090L625:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i26 & 3) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1856649243, i26, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:359)");
                                                }
                                                if (z6) {
                                                    composer4.startReplaceGroup(981693420);
                                                    ComposerKt.sourceInformation(composer4, "362@14625L390");
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release = bottomSheetScaffoldState4.getBottomSheetState().getAnchoredDraggableState$material_release();
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 447312520, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                                                    boolean zChanged = composer4.changed(anchoredDraggableState$material_release);
                                                    BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState4;
                                                    Object objRememberedValue = composer4.rememberedValue();
                                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState5.getBottomSheetState().getAnchoredDraggableState$material_release(), Orientation.Vertical);
                                                        composer4.updateRememberedValue(objRememberedValue);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    companionNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objRememberedValue, null, 2, null);
                                                    composer4.endReplaceGroup();
                                                } else {
                                                    composer4.startReplaceGroup(447326218);
                                                    composer4.endReplaceGroup();
                                                    companionNestedScroll$default = Modifier.INSTANCE;
                                                }
                                                BottomSheetScaffoldKt.m1793BottomSheetdAqlCkY(bottomSheetScaffoldState4.getBottomSheetState(), z6, shape4, f12, j16, j17, f11, SizeKt.m1056requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companionNestedScroll$default, 0.0f, 1, null), f11, 0.0f, 2, null), function37, composer4, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54);
                                    Function2<Composer, Integer, Unit> function210 = function28;
                                    final Function3<SnackbarHostState, Composer, Integer, Unit> function38 = function35;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState3;
                                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1011922215, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.3
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
                                            ComposerKt.sourceInformation(composer4, "C386@15833L45:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i26 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1011922215, i26, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:386)");
                                            }
                                            function38.invoke(bottomSheetScaffoldState5.getSnackbarHostState(), composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    float f13 = f4;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 854055573, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                                    boolean zChanged = composer3.changed(bottomSheetScaffoldState3);
                                    final BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState3;
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$4$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Float invoke() {
                                                return Float.valueOf(bottomSheetScaffoldState6.getBottomSheetState().requireOffset());
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    BottomSheetScaffoldKt.m1795BottomSheetScaffoldLayoutHJHHjMs(function29, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, function210, composableLambdaRememberComposableLambda3, f13, (Function0) objRememberedValue, i23, bottomSheetState, composer3, 25008);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i24 & 7168) | (i24 & 896) | 1572864, 50);
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        int i25 = iM1913getEnd5ygKITE;
                        shape2 = shape3;
                        function34 = function3M1860getLambda1$material_release;
                        i16 = i25;
                        function24 = function27;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        z4 = z2;
                        j8 = j15;
                        j9 = j13;
                        f5 = f9;
                        function25 = function23;
                        f6 = fM1791getSheetElevationD9Ej5fM;
                        modifier3 = modifier2;
                        j10 = j12;
                        j11 = j14;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j8 = j4;
                        shape2 = large;
                        composer2 = composerStartRestartGroup;
                        j11 = jM1826getBackground0d7_KjU;
                        function34 = function3M1860getLambda1$material_release;
                        function25 = function23;
                        i16 = i10;
                        modifier3 = modifier2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        z4 = z2;
                        function24 = function2;
                        f6 = f;
                        j10 = j;
                        j9 = j2;
                        f5 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
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

                            public final void invoke(Composer composer3, int i26) {
                                BottomSheetScaffoldKt.m1794BottomSheetScaffoldHnlDQGw(function3, modifier3, bottomSheetScaffoldState2, function24, function34, function25, i16, z4, shape2, f6, j10, j9, f5, j11, j8, function33, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                function3M1860getLambda1$material_release = function32;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i11 = i4 & 128;
                if (i11 == 0) {
                }
                if ((i2 & 100663296) != 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                if ((i3 & 6) != 0) {
                }
                if ((i3 & 48) != 0) {
                }
                int i202 = i12;
                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                }
                if ((i3 & 3072) != 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i4 & 32768) == 0) {
                }
                if ((306783379 & i5) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i17 != 0) {
                        }
                        if ((i4 & 4) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if ((i4 & 256) != 0) {
                        }
                        if ((i4 & 512) == 0) {
                        }
                        if ((i4 & 1024) == 0) {
                        }
                        if ((i4 & 2048) == 0) {
                        }
                        int i212 = i13;
                        function2 = function26;
                        if ((i4 & 4096) == 0) {
                        }
                        float f72 = fM1792getSheetPeekHeightD9Ej5fM;
                        if ((i4 & 8192) == 0) {
                        }
                        if ((i4 & 16384) == 0) {
                        }
                        j6 = jM1826getBackground0d7_KjU;
                        j7 = jM1837getSurface0d7_KjU;
                        z2 = z3;
                        i15 = i5;
                        int i222 = i14;
                        final Function2<? super Composer, ? super Integer, Unit> function272 = function2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Shape shape32 = large;
                        final long j122 = j7;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function352 = function3M1860getLambda1$material_release;
                        final int i232 = iM1913getEnd5ygKITE;
                        final Function2<? super Composer, ? super Integer, Unit> function282 = function23;
                        final float f82 = fM1791getSheetElevationD9Ej5fM;
                        final BottomSheetScaffoldState bottomSheetScaffoldState32 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        final boolean z52 = z2;
                        final long j132 = jM1851contentColorForek8zF_U;
                        float f92 = f4;
                        int i242 = i222 >> 3;
                        long j142 = j6;
                        long j152 = j5;
                        SurfaceKt.m2015SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j142, j152, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-131096268, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

                            public final void invoke(Composer composer3, int i252) {
                                ComposerKt.sourceInformation(composer3, "C357@14384L52,358@14464L1265,385@15815L77,390@16024L50,355@14309L1848:BottomSheetScaffold.kt#jmzs0o");
                                if ((i252 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-131096268, i252, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:355)");
                                    }
                                    BottomSheetState bottomSheetState = bottomSheetScaffoldState32.getBottomSheetState();
                                    Function2<Composer, Integer, Unit> function29 = function272;
                                    final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function36 = function33;
                                    final float f10 = f4;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1143451324, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.1
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
                                            ComposerKt.sourceInformation(composer4, "C357@14386L48:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i26 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1143451324, i26, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:357)");
                                            }
                                            function36.invoke(PaddingKt.m1017PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f10, 7, null), composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    final boolean z6 = z52;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState32;
                                    final float f11 = f4;
                                    final Shape shape4 = shape32;
                                    final float f12 = f82;
                                    final long j16 = j122;
                                    final long j17 = j132;
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37 = function3;
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1856649243, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.2
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
                                            Modifier.Companion companionNestedScroll$default;
                                            ComposerKt.sourceInformation(composer4, "C370@15090L625:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i26 & 3) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1856649243, i26, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:359)");
                                                }
                                                if (z6) {
                                                    composer4.startReplaceGroup(981693420);
                                                    ComposerKt.sourceInformation(composer4, "362@14625L390");
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release = bottomSheetScaffoldState4.getBottomSheetState().getAnchoredDraggableState$material_release();
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 447312520, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                                                    boolean zChanged = composer4.changed(anchoredDraggableState$material_release);
                                                    BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState4;
                                                    Object objRememberedValue = composer4.rememberedValue();
                                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState5.getBottomSheetState().getAnchoredDraggableState$material_release(), Orientation.Vertical);
                                                        composer4.updateRememberedValue(objRememberedValue);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    companionNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objRememberedValue, null, 2, null);
                                                    composer4.endReplaceGroup();
                                                } else {
                                                    composer4.startReplaceGroup(447326218);
                                                    composer4.endReplaceGroup();
                                                    companionNestedScroll$default = Modifier.INSTANCE;
                                                }
                                                BottomSheetScaffoldKt.m1793BottomSheetdAqlCkY(bottomSheetScaffoldState4.getBottomSheetState(), z6, shape4, f12, j16, j17, f11, SizeKt.m1056requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companionNestedScroll$default, 0.0f, 1, null), f11, 0.0f, 2, null), function37, composer4, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54);
                                    Function2<Composer, Integer, Unit> function210 = function282;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function38 = function352;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState32;
                                    ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1011922215, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.3
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
                                            ComposerKt.sourceInformation(composer4, "C386@15833L45:BottomSheetScaffold.kt#jmzs0o");
                                            if ((i26 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1011922215, i26, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:386)");
                                            }
                                            function38.invoke(bottomSheetScaffoldState5.getSnackbarHostState(), composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    float f13 = f4;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 854055573, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                                    boolean zChanged = composer3.changed(bottomSheetScaffoldState32);
                                    final BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState32;
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$4$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Float invoke() {
                                                return Float.valueOf(bottomSheetScaffoldState6.getBottomSheetState().requireOffset());
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    BottomSheetScaffoldKt.m1795BottomSheetScaffoldLayoutHJHHjMs(function29, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, function210, composableLambdaRememberComposableLambda3, f13, (Function0) objRememberedValue, i232, bottomSheetState, composer3, 25008);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i242 & 7168) | (i242 & 896) | 1572864, 50);
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i252 = iM1913getEnd5ygKITE;
                        shape2 = shape32;
                        function34 = function3M1860getLambda1$material_release;
                        i16 = i252;
                        function24 = function272;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        z4 = z2;
                        j8 = j152;
                        j9 = j132;
                        f5 = f92;
                        function25 = function23;
                        f6 = fM1791getSheetElevationD9Ej5fM;
                        modifier3 = modifier2;
                        j10 = j122;
                        j11 = j142;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            if (i7 == 0) {
            }
            function3M1860getLambda1$material_release = function32;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i11 = i4 & 128;
            if (i11 == 0) {
            }
            if ((i2 & 100663296) != 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            if ((i3 & 6) != 0) {
            }
            if ((i3 & 48) != 0) {
            }
            int i2022 = i12;
            if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
            }
            if ((i3 & 3072) != 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i4 & 32768) == 0) {
            }
            if ((306783379 & i5) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 == 0) {
        }
        function3M1860getLambda1$material_release = function32;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i11 = i4 & 128;
        if (i11 == 0) {
        }
        if ((i2 & 100663296) != 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        if ((i3 & 48) != 0) {
        }
        int i20222 = i12;
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i4 & 32768) == 0) {
        }
        if ((306783379 & i5) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /* renamed from: BottomSheet-dAqlCkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1793BottomSheetdAqlCkY(final BottomSheetState bottomSheetState, final boolean z, final Shape shape, final float f, final long j, final long j2, final float f2, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        final Modifier modifier2;
        Object objRememberedValue;
        final CoroutineScope coroutineScope;
        final float fMo712toPx0680j_4;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-412323066);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomSheet)P(8,5,7,4:c#ui.unit.Dp,2:c#ui.graphics.Color,3:c#ui.graphics.Color,6:c#ui.unit.Dp,1)409@16545L24,*410@16611L7,416@16805L792,437@17821L893,462@18878L29,411@16651L2262:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(bottomSheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i3 |= composerStartRestartGroup.changed(shape) ? 256 : 128;
                }
                if ((i2 & 8) == 0) {
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= composerStartRestartGroup.changed(j2) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
                    }
                    i4 = i2 & 128;
                    if (i4 == 0) {
                        i3 |= 12582912;
                        i5 = 1572864;
                        modifier2 = modifier;
                    } else {
                        i5 = 1572864;
                        modifier2 = modifier;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((38347923 & i3) != 38347922 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                    } else {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-412323066, i3, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:408)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composerStartRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        fMo712toPx0680j_4 = ((Density) objConsume).mo712toPx0680j_4(f2);
                        AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release = bottomSheetState.getAnchoredDraggableState$material_release();
                        Orientation orientation = Orientation.Vertical;
                        int i6 = i3;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416603002, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                        int i7 = i6 & 14;
                        zChanged = composerStartRestartGroup.changed(fMo712toPx0680j_4) | (i7 != 4);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BottomSheetValue>, ? extends BottomSheetValue>>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1

                                /* compiled from: BottomSheetScaffold.kt */
                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[BottomSheetValue.values().length];
                                        try {
                                            iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<BottomSheetValue>, ? extends BottomSheetValue> invoke(IntSize intSize, Constraints constraints) {
                                    return m1798invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                                }

                                /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                                public final Pair<DraggableAnchors<BottomSheetValue>, BottomSheetValue> m1798invokeGpV2Q24(long j3, long j4) {
                                    BottomSheetValue bottomSheetValue;
                                    final int iM6069getMaxHeightimpl = Constraints.m6069getMaxHeightimpl(j4);
                                    final float fM6286getHeightimpl = IntSize.m6286getHeightimpl(j3);
                                    final float f3 = fMo712toPx0680j_4;
                                    DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<BottomSheetValue>, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1$newAnchors$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
                                            invoke2(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
                                            draggableAnchorsConfig.at(BottomSheetValue.Collapsed, iM6069getMaxHeightimpl - f3);
                                            float f4 = fM6286getHeightimpl;
                                            if (f4 <= 0.0f || f4 == f3) {
                                                return;
                                            }
                                            draggableAnchorsConfig.at(BottomSheetValue.Expanded, iM6069getMaxHeightimpl - fM6286getHeightimpl);
                                        }
                                    });
                                    int i8 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getAnchoredDraggableState$material_release().getTargetValue().ordinal()];
                                    if (i8 == 1) {
                                        bottomSheetValue = BottomSheetValue.Collapsed;
                                    } else {
                                        if (i8 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bottomSheetValue = DraggableAnchors.hasAnchorFor(BottomSheetValue.Expanded) ? BottomSheetValue.Expanded : BottomSheetValue.Collapsed;
                                    }
                                    return TuplesKt.to(DraggableAnchors, bottomSheetValue);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifier2, anchoredDraggableState$material_release, orientation, (Function2) objRememberedValue2), bottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, false, 56, null);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416570389, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                        zChangedInstance = (i7 != 4) | composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    if (bottomSheetState.getAnchoredDraggableState$material_release().getAnchors().getSize() > 1) {
                                        if (bottomSheetState.isCollapsed()) {
                                            final BottomSheetState bottomSheetState2 = bottomSheetState;
                                            final CoroutineScope coroutineScope2 = coroutineScope;
                                            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: BottomSheetScaffold.kt */
                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {445}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C00741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BottomSheetState $state;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C00741(BottomSheetState bottomSheetState, Continuation<? super C00741> continuation) {
                                                        super(2, continuation);
                                                        this.$state = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new C00741(this.$state, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((C00741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$state.expand(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (bottomSheetState2.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00741(bottomSheetState2, null), 3, null);
                                                    }
                                                    return true;
                                                }
                                            }, 1, null);
                                        } else {
                                            final BottomSheetState bottomSheetState3 = bottomSheetState;
                                            final CoroutineScope coroutineScope3 = coroutineScope;
                                            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: BottomSheetScaffold.kt */
                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {452}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$2$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BottomSheetState $state;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(BottomSheetState bottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$state = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$state, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$state.collapse(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (bottomSheetState3.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(bottomSheetState3, null), 3, null);
                                                    }
                                                    return true;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierAnchoredDraggable$default, false, (Function1) objRememberedValue3, 1, null);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(2055704138, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3
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

                            public final void invoke(Composer composer3, int i8) {
                                ComposerKt.sourceInformation(composer3, "C462@18880L25:BottomSheetScaffold.kt#jmzs0o");
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2055704138, i8, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:462)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                function32.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        int i8 = i6 >> 6;
                        int i9 = ((i6 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i5 | (i8 & 896) | (i8 & 7168) | (458752 & (i6 << 6));
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m2015SurfaceFjzlyU(modifierSemantics$default, shape, j, j2, null, f, composableLambdaRememberComposableLambda, composer2, i9, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$4
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

                            public final void invoke(Composer composer3, int i10) {
                                BottomSheetScaffoldKt.m1793BottomSheetdAqlCkY(bottomSheetState, z, shape, f, j, j2, f2, modifier2, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                i4 = i2 & 128;
                if (i4 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((38347923 & i3) != 38347922) {
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composerStartRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    fMo712toPx0680j_4 = ((Density) objConsume2).mo712toPx0680j_4(f2);
                    AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release2 = bottomSheetState.getAnchoredDraggableState$material_release();
                    Orientation orientation2 = Orientation.Vertical;
                    int i62 = i3;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416603002, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                    int i72 = i62 & 14;
                    zChanged = composerStartRestartGroup.changed(fMo712toPx0680j_4) | (i72 != 4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BottomSheetValue>, ? extends BottomSheetValue>>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1

                            /* compiled from: BottomSheetScaffold.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[BottomSheetValue.values().length];
                                    try {
                                        iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<BottomSheetValue>, ? extends BottomSheetValue> invoke(IntSize intSize, Constraints constraints) {
                                return m1798invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                            }

                            /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                            public final Pair<DraggableAnchors<BottomSheetValue>, BottomSheetValue> m1798invokeGpV2Q24(long j3, long j4) {
                                BottomSheetValue bottomSheetValue;
                                final int iM6069getMaxHeightimpl = Constraints.m6069getMaxHeightimpl(j4);
                                final float fM6286getHeightimpl = IntSize.m6286getHeightimpl(j3);
                                final float f3 = fMo712toPx0680j_4;
                                DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<BottomSheetValue>, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1$newAnchors$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
                                        invoke2(draggableAnchorsConfig);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
                                        draggableAnchorsConfig.at(BottomSheetValue.Collapsed, iM6069getMaxHeightimpl - f3);
                                        float f4 = fM6286getHeightimpl;
                                        if (f4 <= 0.0f || f4 == f3) {
                                            return;
                                        }
                                        draggableAnchorsConfig.at(BottomSheetValue.Expanded, iM6069getMaxHeightimpl - fM6286getHeightimpl);
                                    }
                                });
                                int i82 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getAnchoredDraggableState$material_release().getTargetValue().ordinal()];
                                if (i82 == 1) {
                                    bottomSheetValue = BottomSheetValue.Collapsed;
                                } else {
                                    if (i82 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bottomSheetValue = DraggableAnchors.hasAnchorFor(BottomSheetValue.Expanded) ? BottomSheetValue.Expanded : BottomSheetValue.Collapsed;
                                }
                                return TuplesKt.to(DraggableAnchors, bottomSheetValue);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierAnchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifier2, anchoredDraggableState$material_release2, orientation2, (Function2) objRememberedValue2), bottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, false, 56, null);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1416570389, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                        zChangedInstance = (i72 != 4) | composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    if (bottomSheetState.getAnchoredDraggableState$material_release().getAnchors().getSize() > 1) {
                                        if (bottomSheetState.isCollapsed()) {
                                            final BottomSheetState bottomSheetState2 = bottomSheetState;
                                            final CoroutineScope coroutineScope2 = coroutineScope;
                                            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: BottomSheetScaffold.kt */
                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {445}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C00741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BottomSheetState $state;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C00741(BottomSheetState bottomSheetState, Continuation<? super C00741> continuation) {
                                                        super(2, continuation);
                                                        this.$state = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new C00741(this.$state, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((C00741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$state.expand(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (bottomSheetState2.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00741(bottomSheetState2, null), 3, null);
                                                    }
                                                    return true;
                                                }
                                            }, 1, null);
                                        } else {
                                            final BottomSheetState bottomSheetState3 = bottomSheetState;
                                            final CoroutineScope coroutineScope3 = coroutineScope;
                                            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: BottomSheetScaffold.kt */
                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {452}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$2$1, reason: invalid class name */
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ BottomSheetState $state;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(BottomSheetState bottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$state = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$state, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$state.collapse(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    if (bottomSheetState3.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(bottomSheetState3, null), 3, null);
                                                    }
                                                    return true;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierAnchoredDraggable$default2, false, (Function1) objRememberedValue3, 1, null);
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(2055704138, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3
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

                                public final void invoke(Composer composer3, int i82) {
                                    ComposerKt.sourceInformation(composer3, "C462@18880L25:BottomSheetScaffold.kt#jmzs0o");
                                    if ((i82 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2055704138, i82, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:462)");
                                    }
                                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    function32.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54);
                            int i82 = i62 >> 6;
                            int i92 = ((i62 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i5 | (i82 & 896) | (i82 & 7168) | (458752 & (i62 << 6));
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m2015SurfaceFjzlyU(modifierSemantics$default2, shape, j, j2, null, f, composableLambdaRememberComposableLambda2, composer2, i92, 16);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i4 = i2 & 128;
            if (i4 == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if ((38347923 & i3) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-HJHHjMs, reason: not valid java name */
    public static final void m1795BottomSheetScaffoldLayoutHJHHjMs(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final float f, final Function0<Float> function0, final int i, final BottomSheetState bottomSheetState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1411837005);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomSheetScaffoldLayout)P(8!3,7,5:c#ui.unit.Dp,4,3:c#material.FabPosition)510@20104L2668,502@19893L2879:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(bottomSheetState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1411837005, i3, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:501)");
            }
            Function2[] function2Arr = new Function2[5];
            function2Arr[0] = function2 == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1861getLambda2$material_release() : function2;
            function2Arr[1] = function22;
            function2Arr[2] = function23;
            function2Arr[3] = function24 == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1862getLambda3$material_release() : function24;
            function2Arr[4] = function25;
            List listListOf = CollectionsKt.listOf((Object[]) function2Arr);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 539801754, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            boolean z = ((i3 & 234881024) == 67108864) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((458752 & i3) == 131072);
            MultiContentMeasurePolicy multiContentMeasurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || multiContentMeasurePolicyRememberedValue == Composer.INSTANCE.getEmpty()) {
                multiContentMeasurePolicyRememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo968measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        Object obj5;
                        List<? extends Measurable> list2 = list.get(0);
                        List<? extends Measurable> list3 = list.get(1);
                        List<? extends Measurable> list4 = list.get(2);
                        List<? extends Measurable> list5 = list.get(3);
                        List<? extends Measurable> list6 = list.get(4);
                        final int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j);
                        final int iM6069getMaxHeightimpl = Constraints.m6069getMaxHeightimpl(j);
                        long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.add(list4.get(i4).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                        }
                        final ArrayList arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            arrayList3.add(list2.get(i5).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                        }
                        final ArrayList arrayList4 = arrayList3;
                        if (arrayList4.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList4.get(0);
                            int height = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex) {
                                int i6 = 1;
                                while (true) {
                                    Object obj6 = arrayList4.get(i6);
                                    int height2 = ((Placeable) obj6).getHeight();
                                    if (height < height2) {
                                        height = height2;
                                        obj = obj6;
                                    }
                                    if (i6 == lastIndex) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        final int height3 = placeable != null ? placeable.getHeight() : 0;
                        long jM6061copyZbe2FdA$default2 = Constraints.m6061copyZbe2FdA$default(jM6061copyZbe2FdA$default, 0, 0, 0, iM6069getMaxHeightimpl - height3, 7, null);
                        ArrayList arrayList5 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i7 = 0; i7 < size3; i7++) {
                            arrayList5.add(list3.get(i7).mo4993measureBRTryo0(jM6061copyZbe2FdA$default2));
                        }
                        final ArrayList arrayList6 = arrayList5;
                        ArrayList arrayList7 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i8 = 0; i8 < size4; i8++) {
                            arrayList7.add(list5.get(i8).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                        }
                        final ArrayList arrayList8 = arrayList7;
                        if (arrayList8.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList8.get(0);
                            int width = ((Placeable) obj2).getWidth();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList8);
                            if (1 <= lastIndex2) {
                                int i9 = 1;
                                while (true) {
                                    Object obj7 = arrayList8.get(i9);
                                    int width2 = ((Placeable) obj7).getWidth();
                                    if (width < width2) {
                                        obj2 = obj7;
                                        width = width2;
                                    }
                                    if (i9 == lastIndex2) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        final int width3 = placeable2 != null ? placeable2.getWidth() : 0;
                        if (arrayList8.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList8.get(0);
                            int height4 = ((Placeable) obj3).getHeight();
                            int lastIndex3 = CollectionsKt.getLastIndex(arrayList8);
                            if (1 <= lastIndex3) {
                                int i10 = 1;
                                while (true) {
                                    Object obj8 = arrayList8.get(i10);
                                    int height5 = ((Placeable) obj8).getHeight();
                                    if (height4 < height5) {
                                        obj3 = obj8;
                                        height4 = height5;
                                    }
                                    if (i10 == lastIndex3) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        final int height6 = placeable3 != null ? placeable3.getHeight() : 0;
                        ArrayList arrayList9 = new ArrayList(list6.size());
                        int size5 = list6.size();
                        for (int i11 = 0; i11 < size5; i11++) {
                            arrayList9.add(list6.get(i11).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                        }
                        final ArrayList arrayList10 = arrayList9;
                        if (arrayList10.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList10.get(0);
                            int width4 = ((Placeable) obj4).getWidth();
                            int lastIndex4 = CollectionsKt.getLastIndex(arrayList10);
                            if (1 <= lastIndex4) {
                                int i12 = 1;
                                while (true) {
                                    Object obj9 = arrayList10.get(i12);
                                    int width5 = ((Placeable) obj9).getWidth();
                                    if (width4 < width5) {
                                        obj4 = obj9;
                                        width4 = width5;
                                    }
                                    if (i12 == lastIndex4) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        int width6 = placeable4 != null ? placeable4.getWidth() : 0;
                        if (arrayList10.isEmpty()) {
                            obj5 = null;
                        } else {
                            Object obj10 = arrayList10.get(0);
                            int height7 = ((Placeable) obj10).getHeight();
                            int lastIndex5 = CollectionsKt.getLastIndex(arrayList10);
                            int i13 = 1;
                            if (1 <= lastIndex5) {
                                while (true) {
                                    Object obj11 = arrayList10.get(i13);
                                    int height8 = ((Placeable) obj11).getHeight();
                                    if (height7 < height8) {
                                        obj10 = obj11;
                                        height7 = height8;
                                    }
                                    if (i13 == lastIndex5) {
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            obj5 = obj10;
                        }
                        Placeable placeable5 = (Placeable) obj5;
                        final int height9 = placeable5 != null ? placeable5.getHeight() : 0;
                        final Function0<Float> function02 = function0;
                        final int i14 = i;
                        final float f2 = f;
                        final BottomSheetState bottomSheetState2 = bottomSheetState;
                        final int i15 = width6;
                        return MeasureScope.layout$default(measureScope, iM6070getMaxWidthimpl, iM6069getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1

                            /* compiled from: BottomSheetScaffold.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[BottomSheetValue.values().length];
                                    try {
                                        iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                int i16;
                                int i17;
                                int i18;
                                int iRoundToInt = MathKt.roundToInt(function02.invoke().floatValue());
                                int i19 = i14;
                                if (FabPosition.m1908equalsimpl0(i19, FabPosition.INSTANCE.m1914getStart5ygKITE())) {
                                    i16 = measureScope.mo706roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
                                } else {
                                    i16 = FabPosition.m1908equalsimpl0(i19, FabPosition.INSTANCE.m1912getCenter5ygKITE()) ? (iM6070getMaxWidthimpl - width3) / 2 : (iM6070getMaxWidthimpl - width3) - measureScope.mo706roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
                                }
                                int i20 = i16;
                                float f3 = measureScope.mo712toPx0680j_4(f2);
                                int i21 = height6;
                                if (f3 < i21 / 2) {
                                    i17 = (iRoundToInt - i21) - measureScope.mo706roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
                                } else {
                                    i17 = iRoundToInt - (i21 / 2);
                                }
                                int i22 = i17;
                                int i23 = (iM6070getMaxWidthimpl - i15) / 2;
                                int i24 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState2.getCurrentValue().ordinal()];
                                if (i24 == 1) {
                                    i18 = i22 - height9;
                                } else {
                                    if (i24 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i18 = iM6069getMaxHeightimpl - height9;
                                }
                                int i25 = i18;
                                List<Placeable> list7 = arrayList6;
                                int i26 = height3;
                                int size6 = list7.size();
                                for (int i27 = 0; i27 < size6; i27++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list7.get(i27), 0, i26, 0.0f, 4, null);
                                }
                                List<Placeable> list8 = arrayList4;
                                int size7 = list8.size();
                                for (int i28 = 0; i28 < size7; i28++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list8.get(i28), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list9 = arrayList2;
                                int size8 = list9.size();
                                for (int i29 = 0; i29 < size8; i29++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list9.get(i29), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list10 = arrayList8;
                                int size9 = list10.size();
                                for (int i30 = 0; i30 < size9; i30++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list10.get(i30), i20, i22, 0.0f, 4, null);
                                }
                                List<Placeable> list11 = arrayList10;
                                int size10 = list11.size();
                                for (int i31 = 0; i31 < size10; i31++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list11.get(i31), i23, i25, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(multiContentMeasurePolicyRememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) multiContentMeasurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -290761165, "CC(remember):Layout.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(multiContentMeasurePolicy);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            function2CombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    BottomSheetScaffoldKt.m1795BottomSheetScaffoldLayoutHJHHjMs(function2, function22, function23, function24, function25, f, function0, i, bottomSheetState, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
    public static final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ AnchoredDraggableState<?> $state;

        AnonymousClass1(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
            this.$state = anchoredDraggableState;
            this.$orientation = orientation;
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public long mo1096onPreScrollOzD1aCk(long available, int source) {
            float fOffsetToFloat = offsetToFloat(available);
            if (fOffsetToFloat < 0.0f && NestedScrollSource.m4747equalsimpl0(source, NestedScrollSource.INSTANCE.m4759getUserInputWNlRxjI())) {
                return toOffset(this.$state.dispatchRawDelta(fOffsetToFloat));
            }
            return Offset.INSTANCE.m3432getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo822onPostScrollDzOQY0M(long consumed, long available, int source) {
            if (NestedScrollSource.m4747equalsimpl0(source, NestedScrollSource.INSTANCE.m4759getUserInputWNlRxjI())) {
                return toOffset(this.$state.dispatchRawDelta(offsetToFloat(available)));
            }
            return Offset.INSTANCE.m3432getZeroF1C5BW0();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo1095onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
            BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1;
            if (continuation instanceof BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) {
                bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = (BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) continuation;
                if ((bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                    bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label -= Integer.MIN_VALUE;
                } else {
                    bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(this, continuation);
                }
            }
            Object obj = bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float fVelocityToFloat = velocityToFloat(j);
                float fRequireOffset = this.$state.requireOffset();
                if (fVelocityToFloat < 0.0f && fRequireOffset > this.$state.getAnchors().minAnchor()) {
                    AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                    bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.J$0 = j;
                    bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label = 1;
                    if (anchoredDraggableState.settle(fVelocityToFloat, bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    j = Velocity.INSTANCE.m6365getZero9UxMQ8M();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.J$0;
                ResultKt.throwOnFailure(obj);
            }
            return Velocity.m6345boximpl(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo821onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
            BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1;
            if (continuation instanceof BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) {
                bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = (BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) continuation;
                if ((bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                    bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label -= Integer.MIN_VALUE;
                } else {
                    bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(this, continuation);
                }
            }
            Object obj = bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                float fVelocityToFloat = velocityToFloat(j2);
                bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label = 1;
                if (anchoredDraggableState.settle(fVelocityToFloat, bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0;
                ResultKt.throwOnFailure(obj);
            }
            return Velocity.m6345boximpl(j2);
        }

        private final long toOffset(float f) {
            float f2 = this.$orientation == Orientation.Horizontal ? f : 0.0f;
            if (this.$orientation != Orientation.Vertical) {
                f = 0.0f;
            }
            return OffsetKt.Offset(f2, f);
        }

        private final float velocityToFloat(long j) {
            return this.$orientation == Orientation.Horizontal ? Velocity.m6354getXimpl(j) : Velocity.m6355getYimpl(j);
        }

        private final float offsetToFloat(long j) {
            return this.$orientation == Orientation.Horizontal ? Offset.m3416getXimpl(j) : Offset.m3417getYimpl(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new AnonymousClass1(anchoredDraggableState, orientation);
    }
}
