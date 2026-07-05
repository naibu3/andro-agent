package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.State;
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
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a;\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u0010\r\u001aò\u0001\u0010\u000e\u001a\u00020\u00062\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010%\u001a\u00020\u001f2\b\b\u0002\u0010&\u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aH\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00162\b\b\u0002\u00101\u001a\u00020\u0017H\u0007\u001a[\u00102\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002050\u00162\u001d\u00106\u001a\u0019\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000607¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u00108\u001a\u001c\u00109\u001a\u00020:2\n\u0010;\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010=\u001a\u00020>H\u0000\u001a0\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u001f2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010B\u001a\u00020\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001aE\u0010E\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\b2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0014\b\u0002\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00162\b\b\u0002\u00101\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010G\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\n\u0010I\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u0010J\u001a\u00020/X\u008a\u0084\u0002"}, d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "PositionalThreshold", "VelocityThreshold", "BackLayerTransition", "", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", UriUtil.LOCAL_CONTENT_SCHEME, "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "BackdropScaffold-0hNv9B8", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;Lkotlin/jvm/functions/Function3;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLandroidx/compose/runtime/Composer;III)V", "BackdropScaffoldState", "initialValue", "density", "Landroidx/compose/ui/unit/Density;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "snackbarHostState", "BackdropStack", "backLayer", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "ConsumeSwipeNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "Scrim", "color", "onDismiss", ViewProps.VISIBLE, "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "confirmStateChange", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release", "alpha", "animationProgress"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m6117constructorimpl(20);
    private static final float VelocityThreshold = Dp.m6117constructorimpl(125);
    private static final float PositionalThreshold = Dp.m6117constructorimpl(56);

    public static /* synthetic */ BackdropScaffoldState BackdropScaffoldState$default(BackdropValue backdropValue, Density density, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState, int i, Object obj) {
        if ((i & 4) != 0) {
            animationSpec = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 8) != 0) {
            function1 = new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffoldState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(BackdropValue backdropValue2) {
                    return true;
                }
            };
        }
        if ((i & 16) != 0) {
            snackbarHostState = new SnackbarHostState();
        }
        return BackdropScaffoldState(backdropValue, density, animationSpec, function1, snackbarHostState);
    }

    public static final BackdropScaffoldState BackdropScaffoldState(BackdropValue backdropValue, Density density, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
        BackdropScaffoldState backdropScaffoldState = new BackdropScaffoldState(backdropValue, animationSpec, function1, snackbarHostState);
        backdropScaffoldState.setDensity$material_release(density);
        return backdropScaffoldState;
    }

    public static final BackdropScaffoldState rememberBackdropScaffoldState(final BackdropValue backdropValue, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        final SnackbarHostState snackbarHostState2;
        ComposerKt.sourceInformationMarkerStart(composer, -862178912, "C(rememberBackdropScaffoldState)P(2)280@10522L32,282@10614L7,293@10967L266,283@10633L600:BackdropScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        final Function1<? super BackdropValue, Boolean> function12 = (i2 & 4) != 0 ? new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt.rememberBackdropScaffoldState.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(BackdropValue backdropValue2) {
                return true;
            }
        } : function1;
        if ((i2 & 8) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -1082627630, "CC(remember):BackdropScaffold.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            snackbarHostState2 = (SnackbarHostState) objRememberedValue;
        } else {
            snackbarHostState2 = snackbarHostState;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862178912, i, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:281)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) objConsume;
        Object[] objArr = {animationSpec2, function12, snackbarHostState2};
        Saver<BackdropScaffoldState, ?> Saver = BackdropScaffoldState.INSTANCE.Saver(animationSpec2, function12, snackbarHostState2, density);
        ComposerKt.sourceInformationMarkerStart(composer, -1082613156, "CC(remember):BackdropScaffold.kt#9igjgp");
        boolean zChanged = ((((i & 14) ^ 6) > 4 && composer.changed(backdropValue)) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(animationSpec2) | ((((i & 896) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(function12)) || (i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(snackbarHostState2)) || (i & 3072) == 2048);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = (Function0) new Function0<BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final BackdropScaffoldState invoke() {
                    return BackdropScaffoldKt.BackdropScaffoldState(backdropValue, density, animationSpec2, function12, snackbarHostState2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return backdropScaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /* renamed from: BackdropScaffold-0hNv9B8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1770BackdropScaffold0hNv9B8(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Modifier modifier, BackdropScaffoldState backdropScaffoldState, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, Shape shape, float f3, long j3, long j4, long j5, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        boolean z4;
        float f4;
        float f5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j6;
        BackdropScaffoldState backdropScaffoldStateRememberBackdropScaffoldState;
        float fM1769getPeekHeightD9Ej5fM;
        float fM1768getHeaderHeightD9Ej5fM;
        final boolean z5;
        int i13;
        BackdropScaffoldState backdropScaffoldState2;
        long jM1833getPrimary0d7_KjU;
        long jM1851contentColorForek8zF_U;
        Modifier modifier3;
        Shape frontLayerShape;
        float fM1767getFrontLayerElevationD9Ej5fM;
        Shape shape2;
        long jM1837getSurface0d7_KjU;
        long jM1851contentColorForek8zF_U2;
        int i14;
        final BackdropScaffoldState backdropScaffoldState3;
        final float f6;
        final long frontLayerScrimColor;
        final long j7;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        final Modifier modifier4;
        long j8;
        final long j9;
        int i15;
        final Shape shape3;
        final boolean z6;
        final boolean z7;
        int i16;
        long j10;
        final Density density;
        boolean zChanged;
        Object objRememberedValue;
        final float fMo712toPx0680j_4;
        boolean zChanged2;
        Object objRememberedValue2;
        final Modifier modifier5;
        final long j11;
        final long j12;
        Composer composer2;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        final BackdropScaffoldState backdropScaffoldState4;
        final Shape shape4;
        final long j13;
        final long j14;
        final float f7;
        final float f8;
        final float f9;
        final long j15;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(113877443);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BackdropScaffold)P(!1,2,5,12,15,16,10,13:c#ui.unit.Dp,11:c#ui.unit.Dp,14,17,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,8:c#ui.graphics.Color)372@15957L40,379@16366L6,380@16417L41,381@16514L15,383@16660L6,384@16712L42,385@16815L20,388@16955L7,389@16978L47,389@16967L58,*393@17068L7,394@17142L7,396@17208L315,409@17594L100,419@17874L3899,416@17772L4001:BackdropScaffold.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        int i17 = i3 & 8;
        if (i17 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            int i18 = 8192;
            if ((i & 24576) == 0) {
                i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(backdropScaffoldState)) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function32 = function3;
            } else {
                function32 = function3;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                z4 = z;
            } else {
                z4 = z;
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                }
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    f4 = f;
                    int i19 = composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                    i4 |= i19;
                } else {
                    f4 = f;
                }
                i4 |= i19;
            } else {
                f4 = f;
            }
            if ((i & 100663296) != 0) {
                if ((i3 & 256) == 0) {
                    f5 = f2;
                    int i20 = composerStartRestartGroup.changed(f5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i4 |= i20;
                } else {
                    f5 = f2;
                }
                i4 |= i20;
            } else {
                f5 = f2;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                if ((i & 805306368) == 0) {
                    i8 = i7;
                    i4 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i11 = i2 | 6;
                    i10 = i9;
                } else if ((i2 & 6) == 0) {
                    i10 = i9;
                    i11 = i2 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                } else {
                    i10 = i9;
                    i11 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0) {
                        i12 = i17;
                        int i21 = composerStartRestartGroup.changed(j) ? 32 : 16;
                        i11 |= i21;
                    } else {
                        i12 = i17;
                    }
                    i11 |= i21;
                } else {
                    i12 = i17;
                }
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i11 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(j2)) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    i11 |= ((i3 & 8192) == 0 && composerStartRestartGroup.changed(shape)) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(f3)) {
                        i18 = 16384;
                    }
                    i11 |= i18;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i11 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(j3)) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i11 |= ((i3 & 65536) == 0 && composerStartRestartGroup.changed(j4)) ? 1048576 : 524288;
                }
                if ((i2 & 12582912) == 0) {
                    j6 = j5;
                    i11 |= ((i3 & 131072) == 0 && composerStartRestartGroup.changed(j6)) ? 8388608 : 4194304;
                } else {
                    j6 = j5;
                }
                if ((i4 & 306783379) != 306783378 || (i11 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i12 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 16) == 0) {
                            backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                            i4 &= -57345;
                        } else {
                            backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState;
                        }
                        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M1859getLambda1$material_release = i5 == 0 ? ComposableSingletons$BackdropScaffoldKt.INSTANCE.m1859getLambda1$material_release() : function32;
                        if (i6 != 0) {
                            z4 = true;
                        }
                        if ((i3 & 128) == 0) {
                            fM1769getPeekHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m1769getPeekHeightD9Ej5fM();
                            i4 &= -29360129;
                        } else {
                            fM1769getPeekHeightD9Ej5fM = f;
                        }
                        if ((i3 & 256) == 0) {
                            fM1768getHeaderHeightD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m1768getHeaderHeightD9Ej5fM();
                            i4 &= -234881025;
                        } else {
                            fM1768getHeaderHeightD9Ej5fM = f2;
                        }
                        z5 = i8 == 0 ? true : z2;
                        boolean z11 = i10 == 0 ? true : z3;
                        if ((i3 & 2048) == 0) {
                            i11 &= -113;
                            i13 = i4;
                            backdropScaffoldState2 = backdropScaffoldStateRememberBackdropScaffoldState;
                            jM1833getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1833getPrimary0d7_KjU();
                        } else {
                            i13 = i4;
                            backdropScaffoldState2 = backdropScaffoldStateRememberBackdropScaffoldState;
                            jM1833getPrimary0d7_KjU = j;
                        }
                        int i22 = i11;
                        if ((i3 & 4096) == 0) {
                            jM1851contentColorForek8zF_U = ColorsKt.m1851contentColorForek8zF_U(jM1833getPrimary0d7_KjU, composerStartRestartGroup, (i22 >> 3) & 14);
                            i22 &= -897;
                        } else {
                            jM1851contentColorForek8zF_U = j2;
                        }
                        if ((i3 & 8192) == 0) {
                            modifier3 = companion;
                            frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 0);
                            i22 &= -7169;
                        } else {
                            modifier3 = companion;
                            frontLayerShape = shape;
                        }
                        if ((i3 & 16384) == 0) {
                            fM1767getFrontLayerElevationD9Ej5fM = BackdropScaffoldDefaults.INSTANCE.m1767getFrontLayerElevationD9Ej5fM();
                            i22 &= -57345;
                        } else {
                            fM1767getFrontLayerElevationD9Ej5fM = f3;
                        }
                        float f10 = fM1767getFrontLayerElevationD9Ej5fM;
                        if ((i3 & 32768) == 0) {
                            shape2 = frontLayerShape;
                            i22 &= -458753;
                            jM1837getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1837getSurface0d7_KjU();
                        } else {
                            shape2 = frontLayerShape;
                            jM1837getSurface0d7_KjU = j3;
                        }
                        if ((i3 & 65536) == 0) {
                            jM1851contentColorForek8zF_U2 = ColorsKt.m1851contentColorForek8zF_U(jM1837getSurface0d7_KjU, composerStartRestartGroup, (i22 >> 15) & 14);
                            i14 = (-3670017) & i22;
                        } else {
                            jM1851contentColorForek8zF_U2 = j4;
                            i14 = i22;
                        }
                        if ((i3 & 131072) == 0) {
                            f6 = f10;
                            j7 = jM1837getSurface0d7_KjU;
                            function33 = function3M1859getLambda1$material_release;
                            modifier4 = modifier3;
                            j8 = jM1851contentColorForek8zF_U;
                            frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 0);
                            i15 = i14 & (-29360129);
                            z6 = z11;
                            z7 = z4;
                            j9 = jM1851contentColorForek8zF_U2;
                            backdropScaffoldState3 = backdropScaffoldState2;
                            i16 = i13;
                            shape3 = shape2;
                        } else {
                            int i23 = i14;
                            backdropScaffoldState3 = backdropScaffoldState2;
                            f6 = f10;
                            frontLayerScrimColor = j5;
                            j7 = jM1837getSurface0d7_KjU;
                            function33 = function3M1859getLambda1$material_release;
                            modifier4 = modifier3;
                            j8 = jM1851contentColorForek8zF_U;
                            j9 = jM1851contentColorForek8zF_U2;
                            i15 = i23;
                            shape3 = shape2;
                            z6 = z11;
                            z7 = z4;
                            i16 = i13;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 2048) != 0) {
                            i11 &= -113;
                        }
                        int i24 = i11;
                        if ((i3 & 4096) != 0) {
                            i24 &= -897;
                        }
                        if ((i3 & 8192) != 0) {
                            i24 &= -7169;
                        }
                        if ((i3 & 16384) != 0) {
                            i24 &= -57345;
                        }
                        if ((32768 & i3) != 0) {
                            i24 &= -458753;
                        }
                        if ((i3 & 65536) != 0) {
                            i24 &= -3670017;
                        }
                        if ((i3 & 131072) != 0) {
                            i24 &= -29360129;
                        }
                        z6 = z3;
                        j8 = j2;
                        shape3 = shape;
                        f6 = f3;
                        j7 = j3;
                        j9 = j4;
                        i16 = i4;
                        frontLayerScrimColor = j6;
                        fM1769getPeekHeightD9Ej5fM = f4;
                        fM1768getHeaderHeightD9Ej5fM = f5;
                        z7 = z4;
                        function33 = function32;
                        z5 = z2;
                        i15 = i24;
                        modifier4 = modifier2;
                        backdropScaffoldState3 = backdropScaffoldState;
                        jM1833getPrimary0d7_KjU = j;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        j10 = j8;
                    } else {
                        j10 = j8;
                        ComposerKt.traceEventStart(113877443, i16, i15, "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:386)");
                    }
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    density = (Density) objConsume;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1348846657, "CC(remember):BackdropScaffold.kt#9igjgp");
                    zChanged = ((((57344 & i16) ^ 24576) <= 16384 && composerStartRestartGroup.changed(backdropScaffoldState3)) || (i16 & 24576) == 16384) | composerStartRestartGroup.changed(density);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                backdropScaffoldState3.setDensity$material_release(density);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composerStartRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final float fMo712toPx0680j_42 = ((Density) objConsume2).mo712toPx0680j_4(fM1769getPeekHeightD9Ej5fM);
                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume3 = composerStartRestartGroup.consume(localDensity3);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    fMo712toPx0680j_4 = ((Density) objConsume3).mo712toPx0680j_4(fM1768getHeaderHeightD9Ej5fM);
                    final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState3;
                    final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(461235665, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                            ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                            if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(461235665, i25, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:397)");
                                }
                                if (z5) {
                                    composer3.startReplaceGroup(1665305383);
                                    ComposerKt.sourceInformation(composer3, "398@17254L82");
                                    Function2<Composer, Integer, Unit> function24 = function2;
                                    Function2<Composer, Integer, Unit> function25 = function22;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
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
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1336824, "C399@17279L8,400@17304L18:BackdropScaffold.kt#jmzs0o");
                                    function24.invoke(composer3, 0);
                                    function25.invoke(composer3, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(1665418316);
                                    ComposerKt.sourceInformation(composer3, "403@17366L141");
                                    BackdropScaffoldKt.BackLayerTransition(backdropScaffoldState3.getAnchoredDraggableState$material_release().getTargetValue(), function2, function22, composer3, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1348866422, "CC(remember):BackdropScaffold.kt#9igjgp");
                    zChanged2 = composerStartRestartGroup.changed(fMo712toPx0680j_4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                return Constraints.m6058boximpl(m1777invokeZezNO4M(constraints.getValue()));
                            }

                            /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                            public final long m1777invokeZezNO4M(long j16) {
                                return ConstraintsKt.m6090offsetNN6EwU$default(Constraints.m6061copyZbe2FdA$default(j16, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(fMo712toPx0680j_4), 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final Function1 function1 = (Function1) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final AnchoredDraggableState<BackdropValue> anchoredDraggableState$material_release = backdropScaffoldState5.getAnchoredDraggableState$material_release();
                    final float f11 = fM1769getPeekHeightD9Ej5fM;
                    final float f12 = fM1768getHeaderHeightD9Ej5fM;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1961515015, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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
                            ComposerKt.sourceInformation(composer3, "C420@17896L24,425@18055L3712,421@17929L3838:BackdropScaffold.kt#jmzs0o");
                            if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1961515015, i25, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:420)");
                                }
                                ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                ComposerKt.sourceInformationMarkerStart(composer3, -954367824, "CC(remember):Effects.kt#9igjgp");
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                    composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                                Function2<Composer, Integer, Unit> function24 = composableLambdaRememberComposableLambda;
                                Function1<Constraints, Constraints> function12 = function1;
                                final float f13 = fMo712toPx0680j_4;
                                final boolean z12 = z6;
                                final boolean z13 = z7;
                                final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                                final AnchoredDraggableState<BackdropValue> anchoredDraggableState = anchoredDraggableState$material_release;
                                final Shape shape5 = shape3;
                                final long j16 = j7;
                                final long j17 = j9;
                                final float f14 = f6;
                                final float f15 = f12;
                                final float f16 = fMo712toPx0680j_42;
                                final float f17 = f11;
                                final Function2<Composer, Integer, Unit> function25 = function23;
                                final long j18 = frontLayerScrimColor;
                                final Function3<SnackbarHostState, Composer, Integer, Unit> function35 = function33;
                                BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function24, function12, ComposableLambdaKt.rememberComposableLambda(516504859, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f18, Composer composer4, Integer num) {
                                        m1775invokejYbf7pk(constraints.getValue(), f18.floatValue(), composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                    public final void m1775invokejYbf7pk(long j19, float f18, Composer composer4, int i26) {
                                        int i27;
                                        Modifier.Companion companionNestedScroll$default;
                                        float fM6117constructorimpl;
                                        ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)463@19824L673,482@20708L575,438@18512L2771,498@21326L431:BackdropScaffold.kt#jmzs0o");
                                        if ((i26 & 6) == 0) {
                                            i27 = i26 | (composer4.changed(j19) ? 4 : 2);
                                        } else {
                                            i27 = i26;
                                        }
                                        if ((i26 & 48) == 0) {
                                            i27 |= composer4.changed(f18) ? 32 : 16;
                                        }
                                        if ((i27 & 147) != 146 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(516504859, i27, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:426)");
                                            }
                                            final Ref.FloatRef floatRef = new Ref.FloatRef();
                                            floatRef.element = Constraints.m6069getMaxHeightimpl(j19) - f13;
                                            if (z12) {
                                                floatRef.element = Math.min(floatRef.element, f18);
                                            }
                                            if (z13) {
                                                companionNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState6.getNestedScrollConnection(), null, 2, null);
                                            } else {
                                                companionNestedScroll$default = Modifier.INSTANCE;
                                            }
                                            AnchoredDraggableState<BackdropValue> anchoredDraggableState2 = anchoredDraggableState;
                                            Orientation orientation = Orientation.Vertical;
                                            final float f19 = f16;
                                            final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState6;
                                            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(companionNestedScroll$default, anchoredDraggableState2, orientation, new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BackdropValue>, ? extends BackdropValue>>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.2.1.1

                                                /* compiled from: BackdropScaffold.kt */
                                                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$WhenMappings */
                                                public /* synthetic */ class WhenMappings {
                                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                    static {
                                                        int[] iArr = new int[BackdropValue.values().length];
                                                        try {
                                                            iArr[BackdropValue.Concealed.ordinal()] = 1;
                                                        } catch (NoSuchFieldError unused) {
                                                        }
                                                        try {
                                                            iArr[BackdropValue.Revealed.ordinal()] = 2;
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
                                                public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<BackdropValue>, ? extends BackdropValue> invoke(IntSize intSize, Constraints constraints) {
                                                    return m1776invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                                                }

                                                /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                                                public final Pair<DraggableAnchors<BackdropValue>, BackdropValue> m1776invokeGpV2Q24(long j20, long j21) {
                                                    BackdropValue backdropValue;
                                                    final float fM6286getHeightimpl = IntSize.m6286getHeightimpl(j20);
                                                    final float fM6286getHeightimpl2 = IntSize.m6286getHeightimpl(j20) - f19;
                                                    final float f20 = f19;
                                                    final Ref.FloatRef floatRef2 = floatRef;
                                                    DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<BackdropValue>, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BackdropValue> draggableAnchorsConfig) {
                                                            invoke2(draggableAnchorsConfig);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(DraggableAnchorsConfig<BackdropValue> draggableAnchorsConfig) {
                                                            float f21 = fM6286getHeightimpl;
                                                            if (f21 == 0.0f || f21 == f20) {
                                                                draggableAnchorsConfig.at(BackdropValue.Concealed, fM6286getHeightimpl2);
                                                            } else {
                                                                draggableAnchorsConfig.at(BackdropValue.Concealed, f20);
                                                                draggableAnchorsConfig.at(BackdropValue.Revealed, floatRef2.element);
                                                            }
                                                        }
                                                    });
                                                    int i28 = WhenMappings.$EnumSwitchMapping$0[backdropScaffoldState7.getTargetValue().ordinal()];
                                                    if (i28 == 1) {
                                                        backdropValue = BackdropValue.Concealed;
                                                    } else {
                                                        if (i28 != 2) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        backdropValue = DraggableAnchors.hasAnchorFor(BackdropValue.Revealed) ? BackdropValue.Revealed : BackdropValue.Concealed;
                                                    }
                                                    return TuplesKt.to(DraggableAnchors, backdropValue);
                                                }
                                            }), anchoredDraggableState, Orientation.Vertical, z13, false, null, false, 56, null);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1662529039, "CC(remember):BackdropScaffold.kt#9igjgp");
                                            boolean zChanged3 = composer4.changed(backdropScaffoldState6) | composer4.changedInstance(coroutineScope);
                                            final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState6;
                                            final CoroutineScope coroutineScope2 = coroutineScope;
                                            Object objRememberedValue4 = composer4.rememberedValue();
                                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1
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
                                                        if (backdropScaffoldState8.isConcealed()) {
                                                            final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState8;
                                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                                            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {468}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                static final class C00731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    C00731(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00731> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new C00731(this.$scaffoldState, continuation);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                        return ((C00731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Object invokeSuspend(Object obj) {
                                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                        int i = this.label;
                                                                        if (i == 0) {
                                                                            ResultKt.throwOnFailure(obj);
                                                                            this.label = 1;
                                                                            if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                                    if (backdropScaffoldState9.getConfirmValueChange().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00731(backdropScaffoldState9, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }
                                                            }, 1, null);
                                                        } else {
                                                            final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState8;
                                                            final CoroutineScope coroutineScope4 = coroutineScope2;
                                                            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1.2
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {474}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
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
                                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                                    if (backdropScaffoldState10.getConfirmValueChange().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState10, null), 3, null);
                                                                    }
                                                                    return true;
                                                                }
                                                            }, 1, null);
                                                        }
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue4);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierAnchoredDraggable$default, false, (Function1) objRememberedValue4, 1, null);
                                            Shape shape6 = shape5;
                                            long j20 = j16;
                                            long j21 = j17;
                                            float f20 = f14;
                                            final float f21 = f17;
                                            final Function2<Composer, Integer, Unit> function26 = function25;
                                            final long j22 = j18;
                                            final boolean z14 = z13;
                                            final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState6;
                                            final CoroutineScope coroutineScope3 = coroutineScope;
                                            SurfaceKt.m2015SurfaceFjzlyU(modifierSemantics$default, shape6, j20, j21, null, f20, ComposableLambdaKt.rememberComposableLambda(1946125143, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.2.1.3
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

                                                public final void invoke(Composer composer5, int i28) {
                                                    ComposerKt.sourceInformation(composer5, "C483@20726L543:BackdropScaffold.kt#jmzs0o");
                                                    if ((i28 & 3) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1946125143, i28, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:483)");
                                                        }
                                                        Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f21, 7, null);
                                                        Function2<Composer, Integer, Unit> function27 = function26;
                                                        long j23 = j22;
                                                        final boolean z15 = z14;
                                                        final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState9;
                                                        final CoroutineScope coroutineScope4 = coroutineScope3;
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer5, 1909528521, "C484@20791L19,487@20928L228,485@20831L420:BackdropScaffold.kt#jmzs0o");
                                                        function27.invoke(composer5, 0);
                                                        ComposerKt.sourceInformationMarkerStart(composer5, -76945486, "CC(remember):BackdropScaffold.kt#9igjgp");
                                                        boolean zChanged4 = composer5.changed(z15) | composer5.changed(backdropScaffoldState10) | composer5.changedInstance(coroutineScope4);
                                                        Object objRememberedValue5 = composer5.rememberedValue();
                                                        if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function0
                                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                                    invoke2();
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* compiled from: BackdropScaffold.kt */
                                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
                                                                /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1, reason: invalid class name */
                                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                    final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                    int label;

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                        super(2, continuation);
                                                                        this.$scaffoldState = backdropScaffoldState;
                                                                    }

                                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                        return new AnonymousClass1(this.$scaffoldState, continuation);
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
                                                                            if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2() {
                                                                    if (z15 && backdropScaffoldState10.getConfirmValueChange().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState10, null), 3, null);
                                                                    }
                                                                }
                                                            };
                                                            composer5.updateRememberedValue(objRememberedValue5);
                                                        }
                                                        Function0 function0 = (Function0) objRememberedValue5;
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        BackdropScaffoldKt.m1771Scrim3JVO9M(j23, function0, backdropScaffoldState10.getTargetValue() == BackdropValue.Revealed, composer5, 0);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        composer5.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer4, 54), composer4, 1572864, 16);
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            if (backdropScaffoldState6.isRevealed() && floatRef.element == Constraints.m6069getMaxHeightimpl(j19) - f13) {
                                                fM6117constructorimpl = f15;
                                            } else {
                                                fM6117constructorimpl = Dp.m6117constructorimpl(0);
                                            }
                                            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, fM6117constructorimpl, 7, null);
                                            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                            Function3<SnackbarHostState, Composer, Integer, Unit> function36 = function35;
                                            BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState6;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM1024paddingqDBjuR0$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer4);
                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 1085666247, "C507@21698L45:BackdropScaffold.kt#jmzs0o");
                                            function36.invoke(backdropScaffoldState10.getSnackbarHostState(), composer4, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }, composer3, 54), composer3, 3120);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                    int i25 = i15 << 3;
                    SurfaceKt.m2015SurfaceFjzlyU(null, null, jM1833getPrimary0d7_KjU, j10, null, 0.0f, composableLambdaRememberComposableLambda2, composerStartRestartGroup, (i25 & 7168) | (i25 & 896) | 1572864, 51);
                    long j16 = j10;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j11 = j16;
                    j12 = jM1833getPrimary0d7_KjU;
                    composer2 = composerStartRestartGroup;
                    z8 = z5;
                    z9 = z6;
                    z10 = z7;
                    backdropScaffoldState4 = backdropScaffoldState5;
                    shape4 = shape3;
                    j13 = j7;
                    j14 = j9;
                    f7 = f6;
                    f8 = f12;
                    f9 = f11;
                    j15 = frontLayerScrimColor;
                    function34 = function33;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    backdropScaffoldState4 = backdropScaffoldState;
                    shape4 = shape;
                    f7 = f3;
                    j13 = j3;
                    j14 = j4;
                    modifier5 = modifier2;
                    j15 = j6;
                    f9 = f4;
                    composer2 = composerStartRestartGroup;
                    f8 = f5;
                    z10 = z4;
                    function34 = function32;
                    z8 = z2;
                    z9 = z3;
                    j12 = j;
                    j11 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$3
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
                            BackdropScaffoldKt.m1770BackdropScaffold0hNv9B8(function2, function22, function23, modifier5, backdropScaffoldState4, function34, z10, f9, f8, z8, z9, j12, j11, shape4, f7, j13, j14, j15, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 805306368;
            i8 = i7;
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 == 0) {
                    }
                    if ((i3 & 16) == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    int i222 = i11;
                    if ((i3 & 4096) == 0) {
                    }
                    if ((i3 & 8192) == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    float f102 = fM1767getFrontLayerElevationD9Ej5fM;
                    if ((i3 & 32768) == 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    if ((i3 & 131072) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume4 = composerStartRestartGroup.consume(localDensity4);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    density = (Density) objConsume4;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1348846657, "CC(remember):BackdropScaffold.kt#9igjgp");
                    if (((57344 & i16) ^ 24576) <= 16384) {
                        zChanged = ((((57344 & i16) ^ 24576) <= 16384 && composerStartRestartGroup.changed(backdropScaffoldState3)) || (i16 & 24576) == 16384) | composerStartRestartGroup.changed(density);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    backdropScaffoldState3.setDensity$material_release(density);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume22 = composerStartRestartGroup.consume(localDensity22);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            final float fMo712toPx0680j_422 = ((Density) objConsume22).mo712toPx0680j_4(fM1769getPeekHeightD9Ej5fM);
                            ProvidableCompositionLocal<Density> localDensity32 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume32 = composerStartRestartGroup.consume(localDensity32);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            fMo712toPx0680j_4 = ((Density) objConsume32).mo712toPx0680j_4(fM1768getHeaderHeightD9Ej5fM);
                            final BackdropScaffoldState backdropScaffoldState52 = backdropScaffoldState3;
                            final Function2<? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(461235665, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                                    ComposerKt.sourceInformation(composer3, "C:BackdropScaffold.kt#jmzs0o");
                                    if ((i252 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(461235665, i252, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:397)");
                                        }
                                        if (z5) {
                                            composer3.startReplaceGroup(1665305383);
                                            ComposerKt.sourceInformation(composer3, "398@17254L82");
                                            Function2<Composer, Integer, Unit> function24 = function2;
                                            Function2<Composer, Integer, Unit> function25 = function22;
                                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
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
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1336824, "C399@17279L8,400@17304L18:BackdropScaffold.kt#jmzs0o");
                                            function24.invoke(composer3, 0);
                                            function25.invoke(composer3, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(1665418316);
                                            ComposerKt.sourceInformation(composer3, "403@17366L141");
                                            BackdropScaffoldKt.BackLayerTransition(backdropScaffoldState3.getAnchoredDraggableState$material_release().getTargetValue(), function2, function22, composer3, 0);
                                            composer3.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1348866422, "CC(remember):BackdropScaffold.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(fMo712toPx0680j_4);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function1) new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                        return Constraints.m6058boximpl(m1777invokeZezNO4M(constraints.getValue()));
                                    }

                                    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                                    public final long m1777invokeZezNO4M(long j162) {
                                        return ConstraintsKt.m6090offsetNN6EwU$default(Constraints.m6061copyZbe2FdA$default(j162, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(fMo712toPx0680j_4), 1, null);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                final Function1<? super Constraints, Constraints> function12 = (Function1) objRememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                final AnchoredDraggableState<BackdropValue> anchoredDraggableState$material_release2 = backdropScaffoldState52.getAnchoredDraggableState$material_release();
                                final float f112 = fM1769getPeekHeightD9Ej5fM;
                                final float f122 = fM1768getHeaderHeightD9Ej5fM;
                                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambdaKt.rememberComposableLambda(1961515015, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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
                                        ComposerKt.sourceInformation(composer3, "C420@17896L24,425@18055L3712,421@17929L3838:BackdropScaffold.kt#jmzs0o");
                                        if ((i252 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1961515015, i252, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:420)");
                                            }
                                            ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(composer3, -954367824, "CC(remember):Effects.kt#9igjgp");
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                                            Function2<Composer, Integer, Unit> function24 = composableLambdaRememberComposableLambda3;
                                            Function1<Constraints, Constraints> function122 = function12;
                                            final float f13 = fMo712toPx0680j_4;
                                            final boolean z12 = z6;
                                            final boolean z13 = z7;
                                            final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState52;
                                            final AnchoredDraggableState<BackdropValue> anchoredDraggableState = anchoredDraggableState$material_release2;
                                            final Shape shape5 = shape3;
                                            final long j162 = j7;
                                            final long j17 = j9;
                                            final float f14 = f6;
                                            final float f15 = f122;
                                            final float f16 = fMo712toPx0680j_422;
                                            final float f17 = f112;
                                            final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                                            final long j18 = frontLayerScrimColor;
                                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35 = function33;
                                            BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function24, function122, ComposableLambdaKt.rememberComposableLambda(516504859, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(4);
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f18, Composer composer4, Integer num) {
                                                    m1775invokejYbf7pk(constraints.getValue(), f18.floatValue(), composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                                public final void m1775invokejYbf7pk(long j19, float f18, Composer composer4, int i26) {
                                                    int i27;
                                                    Modifier.Companion companionNestedScroll$default;
                                                    float fM6117constructorimpl;
                                                    ComposerKt.sourceInformation(composer4, "CP(1:c#ui.unit.Constraints)463@19824L673,482@20708L575,438@18512L2771,498@21326L431:BackdropScaffold.kt#jmzs0o");
                                                    if ((i26 & 6) == 0) {
                                                        i27 = i26 | (composer4.changed(j19) ? 4 : 2);
                                                    } else {
                                                        i27 = i26;
                                                    }
                                                    if ((i26 & 48) == 0) {
                                                        i27 |= composer4.changed(f18) ? 32 : 16;
                                                    }
                                                    if ((i27 & 147) != 146 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(516504859, i27, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:426)");
                                                        }
                                                        final Ref.FloatRef floatRef = new Ref.FloatRef();
                                                        floatRef.element = Constraints.m6069getMaxHeightimpl(j19) - f13;
                                                        if (z12) {
                                                            floatRef.element = Math.min(floatRef.element, f18);
                                                        }
                                                        if (z13) {
                                                            companionNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState6.getNestedScrollConnection(), null, 2, null);
                                                        } else {
                                                            companionNestedScroll$default = Modifier.INSTANCE;
                                                        }
                                                        AnchoredDraggableState<BackdropValue> anchoredDraggableState2 = anchoredDraggableState;
                                                        Orientation orientation = Orientation.Vertical;
                                                        final float f19 = f16;
                                                        final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState6;
                                                        Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(companionNestedScroll$default, anchoredDraggableState2, orientation, new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BackdropValue>, ? extends BackdropValue>>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.2.1.1

                                                            /* compiled from: BackdropScaffold.kt */
                                                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$WhenMappings */
                                                            public /* synthetic */ class WhenMappings {
                                                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                                static {
                                                                    int[] iArr = new int[BackdropValue.values().length];
                                                                    try {
                                                                        iArr[BackdropValue.Concealed.ordinal()] = 1;
                                                                    } catch (NoSuchFieldError unused) {
                                                                    }
                                                                    try {
                                                                        iArr[BackdropValue.Revealed.ordinal()] = 2;
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
                                                            public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<BackdropValue>, ? extends BackdropValue> invoke(IntSize intSize, Constraints constraints) {
                                                                return m1776invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                                                            }

                                                            /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                                                            public final Pair<DraggableAnchors<BackdropValue>, BackdropValue> m1776invokeGpV2Q24(long j20, long j21) {
                                                                BackdropValue backdropValue;
                                                                final float fM6286getHeightimpl = IntSize.m6286getHeightimpl(j20);
                                                                final float fM6286getHeightimpl2 = IntSize.m6286getHeightimpl(j20) - f19;
                                                                final float f20 = f19;
                                                                final Ref.FloatRef floatRef2 = floatRef;
                                                                DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<BackdropValue>, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BackdropValue> draggableAnchorsConfig) {
                                                                        invoke2(draggableAnchorsConfig);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(DraggableAnchorsConfig<BackdropValue> draggableAnchorsConfig) {
                                                                        float f21 = fM6286getHeightimpl;
                                                                        if (f21 == 0.0f || f21 == f20) {
                                                                            draggableAnchorsConfig.at(BackdropValue.Concealed, fM6286getHeightimpl2);
                                                                        } else {
                                                                            draggableAnchorsConfig.at(BackdropValue.Concealed, f20);
                                                                            draggableAnchorsConfig.at(BackdropValue.Revealed, floatRef2.element);
                                                                        }
                                                                    }
                                                                });
                                                                int i28 = WhenMappings.$EnumSwitchMapping$0[backdropScaffoldState7.getTargetValue().ordinal()];
                                                                if (i28 == 1) {
                                                                    backdropValue = BackdropValue.Concealed;
                                                                } else {
                                                                    if (i28 != 2) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    backdropValue = DraggableAnchors.hasAnchorFor(BackdropValue.Revealed) ? BackdropValue.Revealed : BackdropValue.Concealed;
                                                                }
                                                                return TuplesKt.to(DraggableAnchors, backdropValue);
                                                            }
                                                        }), anchoredDraggableState, Orientation.Vertical, z13, false, null, false, 56, null);
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -1662529039, "CC(remember):BackdropScaffold.kt#9igjgp");
                                                        boolean zChanged3 = composer4.changed(backdropScaffoldState6) | composer4.changedInstance(coroutineScope);
                                                        final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState6;
                                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                                        Object objRememberedValue4 = composer4.rememberedValue();
                                                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1
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
                                                                    if (backdropScaffoldState8.isConcealed()) {
                                                                        final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState8;
                                                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                                                        SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1.1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            /* compiled from: BackdropScaffold.kt */
                                                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {468}, m = "invokeSuspend", n = {}, s = {})
                                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                                                            static final class C00731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                                int label;

                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                C00731(BackdropScaffoldState backdropScaffoldState, Continuation<? super C00731> continuation) {
                                                                                    super(2, continuation);
                                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                                }

                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                    return new C00731(this.$scaffoldState, continuation);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                    return ((C00731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                }

                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                public final Object invokeSuspend(Object obj) {
                                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                    int i = this.label;
                                                                                    if (i == 0) {
                                                                                        ResultKt.throwOnFailure(obj);
                                                                                        this.label = 1;
                                                                                        if (this.$scaffoldState.reveal(this) == coroutine_suspended) {
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
                                                                                if (backdropScaffoldState9.getConfirmValueChange().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C00731(backdropScaffoldState9, null), 3, null);
                                                                                }
                                                                                return true;
                                                                            }
                                                                        }, 1, null);
                                                                    } else {
                                                                        final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState8;
                                                                        final CoroutineScope coroutineScope4 = coroutineScope2;
                                                                        SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1.2
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            /* compiled from: BackdropScaffold.kt */
                                                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {474}, m = "invokeSuspend", n = {}, s = {})
                                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1, reason: invalid class name */
                                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                                int label;

                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                                    super(2, continuation);
                                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                                }

                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
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
                                                                                        if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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
                                                                                if (backdropScaffoldState10.getConfirmValueChange().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState10, null), 3, null);
                                                                                }
                                                                                return true;
                                                                            }
                                                                        }, 1, null);
                                                                    }
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(objRememberedValue4);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierAnchoredDraggable$default, false, (Function1) objRememberedValue4, 1, null);
                                                        Shape shape6 = shape5;
                                                        long j20 = j162;
                                                        long j21 = j17;
                                                        float f20 = f14;
                                                        final float f21 = f17;
                                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                                        final long j22 = j18;
                                                        final boolean z14 = z13;
                                                        final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState6;
                                                        final CoroutineScope coroutineScope3 = coroutineScope;
                                                        SurfaceKt.m2015SurfaceFjzlyU(modifierSemantics$default, shape6, j20, j21, null, f20, ComposableLambdaKt.rememberComposableLambda(1946125143, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.2.1.3
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

                                                            public final void invoke(Composer composer5, int i28) {
                                                                ComposerKt.sourceInformation(composer5, "C483@20726L543:BackdropScaffold.kt#jmzs0o");
                                                                if ((i28 & 3) != 2 || !composer5.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1946125143, i28, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:483)");
                                                                    }
                                                                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f21, 7, null);
                                                                    Function2<Composer, Integer, Unit> function27 = function26;
                                                                    long j23 = j22;
                                                                    final boolean z15 = z14;
                                                                    final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState9;
                                                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 1909528521, "C484@20791L19,487@20928L228,485@20831L420:BackdropScaffold.kt#jmzs0o");
                                                                    function27.invoke(composer5, 0);
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -76945486, "CC(remember):BackdropScaffold.kt#9igjgp");
                                                                    boolean zChanged4 = composer5.changed(z15) | composer5.changed(backdropScaffoldState10) | composer5.changedInstance(coroutineScope4);
                                                                    Object objRememberedValue5 = composer5.rememberedValue();
                                                                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                                        objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                                                invoke2();
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            /* compiled from: BackdropScaffold.kt */
                                                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                            @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {490}, m = "invokeSuspend", n = {}, s = {})
                                                                            /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1, reason: invalid class name */
                                                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                                int label;

                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                                    super(2, continuation);
                                                                                    this.$scaffoldState = backdropScaffoldState;
                                                                                }

                                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                    return new AnonymousClass1(this.$scaffoldState, continuation);
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
                                                                                        if (this.$scaffoldState.conceal(this) == coroutine_suspended) {
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

                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2() {
                                                                                if (z15 && backdropScaffoldState10.getConfirmValueChange().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState10, null), 3, null);
                                                                                }
                                                                            }
                                                                        };
                                                                        composer5.updateRememberedValue(objRememberedValue5);
                                                                    }
                                                                    Function0 function0 = (Function0) objRememberedValue5;
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    BackdropScaffoldKt.m1771Scrim3JVO9M(j23, function0, backdropScaffoldState10.getTargetValue() == BackdropValue.Revealed, composer5, 0);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    composer5.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer5.skipToGroupEnd();
                                                            }
                                                        }, composer4, 54), composer4, 1572864, 16);
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        if (backdropScaffoldState6.isRevealed() && floatRef.element == Constraints.m6069getMaxHeightimpl(j19) - f13) {
                                                            fM6117constructorimpl = f15;
                                                        } else {
                                                            fM6117constructorimpl = Dp.m6117constructorimpl(0);
                                                        }
                                                        Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, fM6117constructorimpl, 7, null);
                                                        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                        Function3<SnackbarHostState, Composer, Integer, Unit> function36 = function35;
                                                        BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState6;
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM1024paddingqDBjuR0$default);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer4);
                                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 1085666247, "C507@21698L45:BackdropScaffold.kt#jmzs0o");
                                                        function36.invoke(backdropScaffoldState10.getSnackbarHostState(), composer4, 0);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        composer4.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }, composer3, 54), composer3, 3120);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54);
                                int i252 = i15 << 3;
                                SurfaceKt.m2015SurfaceFjzlyU(null, null, jM1833getPrimary0d7_KjU, j10, null, 0.0f, composableLambdaRememberComposableLambda22, composerStartRestartGroup, (i252 & 7168) | (i252 & 896) | 1572864, 51);
                                long j162 = j10;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier5 = modifier4;
                                j11 = j162;
                                j12 = jM1833getPrimary0d7_KjU;
                                composer2 = composerStartRestartGroup;
                                z8 = z5;
                                z9 = z6;
                                z10 = z7;
                                backdropScaffoldState4 = backdropScaffoldState52;
                                shape4 = shape3;
                                j13 = j7;
                                j14 = j9;
                                f7 = f6;
                                f8 = f122;
                                f9 = f112;
                                j15 = frontLayerScrimColor;
                                function34 = function33;
                            }
                        }
                    } else {
                        zChanged = ((((57344 & i16) ^ 24576) <= 16384 && composerStartRestartGroup.changed(backdropScaffoldState3)) || (i16 & 24576) == 16384) | composerStartRestartGroup.changed(density);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        int i182 = 8192;
        if ((i & 24576) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) != 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1771Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companionPointerInput;
        Composer composerStartRestartGroup = composer.startRestartGroup(-92141505);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color):BackdropScaffold.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92141505, i2, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:518)");
            }
            if (j != 16) {
                composerStartRestartGroup.startReplaceGroup(478604781);
                ComposerKt.sourceInformation(composerStartRestartGroup, "520@21928L121,533@22338L62,529@22229L171");
                int i3 = i2;
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(478778505);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "525@22135L37");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit = Unit.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1262371749, "CC(remember):BackdropScaffold.kt#9igjgp");
                    boolean z2 = (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32;
                    BackdropScaffoldKt$Scrim$dismissModifier$1$1 backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    companionPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(478870978);
                    composerStartRestartGroup.endReplaceGroup();
                    companionPointerInput = Modifier.INSTANCE;
                }
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companionPointerInput);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1262378270, "CC(remember):BackdropScaffold.kt#9igjgp");
                boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i3 & 14) == 4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
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
                            DrawScope.m4207drawRectnJ9OG0$default(drawScope, j, 0L, 0L, BackdropScaffoldKt.Scrim_3J_VO9M$lambda$7(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(479086242);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    BackdropScaffoldKt.m1771Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackLayerTransition(final BackdropValue backdropValue, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-950970976);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BackLayerTransition)P(2)552@23021L112,*555@23183L7,557@23229L1485:BackdropScaffold.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(backdropValue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, i3, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:549)");
            }
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final float fMo712toPx0680j_4 = ((Density) objConsume).mo712toPx0680j_4(AnimationSlideOffset);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1148252974, "C560@23293L351,567@23676L218,558@23243L694,578@24058L353,585@24443L221,575@23946L762:BackdropScaffold.kt#jmzs0o");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -452681929, "CC(remember):BackdropScaffold.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m1773invoke3p2s80s(measureScope, measurable, constraints.getValue());
                    }

                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m1773invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                        final float fBackLayerTransition$lambda$10 = BackdropScaffoldKt.BackLayerTransition$lambda$10(stateAnimateFloatAsState) - 1;
                        if (fBackLayerTransition$lambda$10 < 0.0f) {
                            fBackLayerTransition$lambda$10 = 0.0f;
                        }
                        if (fBackLayerTransition$lambda$10 > 1.0f) {
                            fBackLayerTransition$lambda$10 = 1.0f;
                        }
                        final Placeable placeableMo4993measureBRTryo0 = measurable.mo4993measureBRTryo0(j);
                        return MeasureScope.layout$default(measureScope, placeableMo4993measureBRTryo0.getWidth(), placeableMo4993measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                placementScope.place(placeableMo4993measureBRTryo0, 0, 0, fBackLayerTransition$lambda$10);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierLayout = LayoutModifierKt.layout(companion2, (Function3) objRememberedValue);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -452669806, "CC(remember):BackdropScaffold.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | composerStartRestartGroup.changed(fMo712toPx0680j_4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        float f = 1;
                        float fBackLayerTransition$lambda$10 = BackdropScaffoldKt.BackLayerTransition$lambda$10(stateAnimateFloatAsState) - f;
                        if (fBackLayerTransition$lambda$10 < 0.0f) {
                            fBackLayerTransition$lambda$10 = 0.0f;
                        }
                        if (fBackLayerTransition$lambda$10 > 1.0f) {
                            fBackLayerTransition$lambda$10 = 1.0f;
                        }
                        graphicsLayerScope.setAlpha(fBackLayerTransition$lambda$10);
                        graphicsLayerScope.setTranslationY((f - fBackLayerTransition$lambda$10) * fMo712toPx0680j_4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierLayout, (Function1) objRememberedValue2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 799582660, "C573@23919L8:BackdropScaffold.kt#jmzs0o");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -452657447, "CC(remember):BackdropScaffold.kt#9igjgp");
            boolean zChanged3 = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m1774invoke3p2s80s(measureScope, measurable, constraints.getValue());
                    }

                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m1774invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                        final float fBackLayerTransition$lambda$10 = 1 - BackdropScaffoldKt.BackLayerTransition$lambda$10(stateAnimateFloatAsState);
                        if (fBackLayerTransition$lambda$10 < 0.0f) {
                            fBackLayerTransition$lambda$10 = 0.0f;
                        }
                        if (fBackLayerTransition$lambda$10 > 1.0f) {
                            fBackLayerTransition$lambda$10 = 1.0f;
                        }
                        final Placeable placeableMo4993measureBRTryo0 = measurable.mo4993measureBRTryo0(j);
                        return MeasureScope.layout$default(measureScope, placeableMo4993measureBRTryo0.getWidth(), placeableMo4993measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                placementScope.place(placeableMo4993measureBRTryo0, 0, 0, fBackLayerTransition$lambda$10);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierLayout2 = LayoutModifierKt.layout(companion3, (Function3) objRememberedValue3);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -452645259, "CC(remember):BackdropScaffold.kt#9igjgp");
            boolean zChanged4 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | composerStartRestartGroup.changed(fMo712toPx0680j_4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        invoke2(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                        float f = 1;
                        float fBackLayerTransition$lambda$10 = f - BackdropScaffoldKt.BackLayerTransition$lambda$10(stateAnimateFloatAsState);
                        if (fBackLayerTransition$lambda$10 < 0.0f) {
                            fBackLayerTransition$lambda$10 = 0.0f;
                        }
                        if (fBackLayerTransition$lambda$10 > 1.0f) {
                            fBackLayerTransition$lambda$10 = 1.0f;
                        }
                        graphicsLayerScope.setAlpha(fBackLayerTransition$lambda$10);
                        graphicsLayerScope.setTranslationY((f - fBackLayerTransition$lambda$10) * fMo712toPx0680j_4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierLayout2, (Function1) objRememberedValue4);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 800346531, "C591@24689L9:BackdropScaffold.kt#jmzs0o");
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackLayerTransition.2
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
                    BackdropScaffoldKt.BackLayerTransition(backdropValue, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackdropStack(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super Constraints, Constraints> function1, final Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248995194);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BackdropStack)P(3)603@24977L890,603@24950L917:BackdropScaffold.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248995194, i2, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:602)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1431305146, "CC(remember):BackdropScaffold.kt#9igjgp");
            boolean z = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1778invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1778invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, final long j) {
                        final Placeable placeableMo4993measureBRTryo0 = ((Measurable) CollectionsKt.first((List) subcomposeMeasureScope.subcompose(BackdropLayers.Back, function2))).mo4993measureBRTryo0(function1.invoke(Constraints.m6058boximpl(j)).getValue());
                        final float height = placeableMo4993measureBRTryo0.getHeight();
                        BackdropLayers backdropLayers = BackdropLayers.Front;
                        final Function4<Constraints, Float, Composer, Integer, Unit> function42 = function4;
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(backdropLayers, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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

                            public final void invoke(Composer composer2, int i3) {
                                ComposerKt.sourceInformation(composer2, "C612@25315L40:BackdropScaffold.kt#jmzs0o");
                                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1222642649, i3, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:612)");
                                }
                                function42.invoke(Constraints.m6058boximpl(j), Float.valueOf(height), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.add(listSubcompose.get(i3).mo4993measureBRTryo0(j));
                        }
                        final ArrayList arrayList2 = arrayList;
                        int iMax = Math.max(Constraints.m6072getMinWidthimpl(j), placeableMo4993measureBRTryo0.getWidth());
                        int iMax2 = Math.max(Constraints.m6071getMinHeightimpl(j), placeableMo4993measureBRTryo0.getHeight());
                        int size2 = arrayList2.size();
                        int iMax3 = iMax2;
                        int iMax4 = iMax;
                        for (int i4 = 0; i4 < size2; i4++) {
                            Placeable placeable = (Placeable) arrayList2.get(i4);
                            iMax4 = Math.max(iMax4, placeable.getWidth());
                            iMax3 = Math.max(iMax3, placeable.getHeight());
                        }
                        return MeasureScope.layout$default(subcomposeMeasureScope, iMax4, iMax3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
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
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4993measureBRTryo0, 0, 0, 0.0f, 4, null);
                                List<Placeable> list = arrayList2;
                                int size3 = list.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i5), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, i2 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropStack.2
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

                public final void invoke(Composer composer2, int i3) {
                    BackdropScaffoldKt.BackdropStack(modifier, function2, function1, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, reason: invalid class name and case insensitive filesystem */
    public static final class C04721 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ AnchoredDraggableState<?> $state;

        C04721(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
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
            BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1;
            if (continuation instanceof BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1) {
                backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 = (BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1) continuation;
                if ((backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                    backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1.label -= Integer.MIN_VALUE;
                } else {
                    backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 = new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1(this, continuation);
                }
            }
            Object obj = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float fVelocityToFloat = velocityToFloat(j);
                float fRequireOffset = this.$state.requireOffset();
                if (fVelocityToFloat < 0.0f && fRequireOffset > this.$state.getAnchors().minAnchor()) {
                    AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                    backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1.J$0 = j;
                    backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1.label = 1;
                    if (anchoredDraggableState.settle(fVelocityToFloat, backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    j = Velocity.INSTANCE.m6365getZero9UxMQ8M();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1.J$0;
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
            BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1;
            if (continuation instanceof BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1) {
                backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 = (BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1) continuation;
                if ((backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                    backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1.label -= Integer.MIN_VALUE;
                } else {
                    backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 = new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1(this, continuation);
                }
            }
            Object obj = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                float fVelocityToFloat = velocityToFloat(j2);
                backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1.label = 1;
                if (anchoredDraggableState.settle(fVelocityToFloat, backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1.J$0;
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

    public static final NestedScrollConnection ConsumeSwipeNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new C04721(anchoredDraggableState, orientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BackLayerTransition$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }
}
