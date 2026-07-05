package androidx.compose.material3;

import android.content.res.Resources;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u007f\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010%\u001ae\u0010&\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020$2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00101\u001a±\u0001\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b52\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020-2\u0019\b\u0002\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b5H\u0007¢\u0006\u0002\u00108\u001a}\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020-H\u0007¢\u0006\u0002\u00109\u001a\u0096\u0001\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020-2\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b5H\u0007¢\u0006\u0002\u0010:\u001a\u0099\u0001\u0010;\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00106\u001a\u00020-2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b52\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b5H\u0003¢\u0006\u0002\u0010<\u001aU\u0010=\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\bH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a1\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010H\u001a \u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bH\u0002\u001a0\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002\u001a<\u0010M\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002\u001a(\u0010T\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010)\u001a\u00020*2\u0006\u0010U\u001a\u00020\b2\u0006\u0010V\u001a\u00020\bH\u0002\u001a\u0010\u0010W\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a?\u0010X\u001a\u00020\u0016*\u00020Y2\u0006\u0010Z\u001a\u00020\u00032\u001c\u0010[\u001a\u0018\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b5¢\u0006\u0002\b\\H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a;\u0010_\u001a\u0010\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\b\u0018\u00010`*\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bg\u0010h\u001a\u0098\u0001\u0010i\u001a\u00020\u0001*\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\b0k2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\b0k2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020\u001d2\u0006\u0010V\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0018\u0010n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00160\u001a0k2\u001e\u0010o\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160p0kH\u0002\u001a\\\u0010q\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002\u001ad\u0010r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u00106\u001a\u00020-2\u0006\u0010V\u001a\u00020 2\u0006\u0010m\u001a\u00020\u001d2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\b0k2\u0012\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\"0k2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\b0u2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0013\u0010\f\u001a\u00020\rX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011\"\u0013\u0010\u0012\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\"\u0019\u0010\u0013\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0014\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006v"}, d2 = {"DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "SliderHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SliderMinWidth", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "", "ThumbDefaultElevation", "ThumbHeight", "ThumbPressedElevation", "ThumbSize", "Landroidx/compose/ui/unit/DpSize;", "J", "ThumbWidth", "getThumbWidth", "()F", "TickSize", "TrackHeight", "getTrackHeight", "RangeSlider", "", "value", "Lkotlin/ranges/ClosedFloatingPointRange;", "onValueChange", "Lkotlin/Function1;", "modifier", ViewProps.ENABLED, "", "valueRange", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/SliderColors;", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "positionFractionStart", "positionFractionEnd", "tickFractions", "", "width", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "(ZFF[FLandroidx/compose/material3/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Slider", "track", "Landroidx/compose/material3/SliderPositions;", "Landroidx/compose/runtime/Composable;", "interactionSource", "thumb", "(FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "TempRangeSliderTrack", "thumbWidth", "trackStrokeWidth", "TempRangeSliderTrack-au3_HiA", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZFF[FFFLandroidx/compose/runtime/Composer;I)V", "animateToTarget", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "current", TypedValues.AttributesType.S_TARGET, "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calcFraction", "a", "b", "pos", PaymentSheetAppearanceKeys.SCALE, "a1", "b1", "x1", "a2", "b2", "x", "snapValueToTick", "minPx", "maxPx", "stepsToTickFractions", "TempRangeSliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", TypedValues.CycleType.S_WAVE_OFFSET, UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/ExtensionFunctionType;", "TempRangeSliderThumb-rAjV9yQ", "(Landroidx/compose/foundation/layout/BoxScope;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderPressDragModifier", "rawOffsetStart", "Landroidx/compose/runtime/State;", "rawOffsetEnd", "isRtl", "gestureEndAction", "onDrag", "Lkotlin/Function2;", "sliderSemantics", "sliderTapModifier", "rawOffset", "pressOffset", "Landroidx/compose/runtime/MutableState;", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbDefaultElevation;
    private static final float ThumbHeight;
    private static final float ThumbPressedElevation;
    private static final long ThumbSize;
    private static final float ThumbWidth;
    private static final float TickSize;
    private static final float TrackHeight;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1<? super Float, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i6;
        int i7;
        int i8;
        int i9;
        Function0<Unit> function02;
        int i10;
        SliderColors sliderColorsM2417colorsq0g_0yA;
        int i11;
        final Function0<Unit> function03;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        final MutableInteractionSource mutableInteractionSource2;
        final int i12;
        final boolean z3;
        final SliderColors sliderColors2;
        boolean zChanged;
        ComposableLambda composableLambdaRememberedValue;
        boolean zChanged2;
        ComposableLambda composableLambdaRememberedValue2;
        final Modifier modifier3;
        final int i13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-202044027);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Slider)P(7,4,3,1,8,6,5)163@7815L8,164@7875L39,176@8248L230,183@8496L226,166@7923L805:Slider.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 57344) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                        int i15 = composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                        i4 |= i15;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    }
                    i4 |= i15;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                    if ((i2 & 458752) == 0) {
                        i7 = i;
                        i4 |= composerStartRestartGroup.changed(i7) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        i9 = 57344;
                        function02 = function0;
                    } else {
                        i9 = 57344;
                        function02 = function0;
                        if ((i2 & 3670016) == 0) {
                            i4 |= composerStartRestartGroup.changed(function02) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 29360128) != 0) {
                        i10 = 458752;
                        if ((i3 & 128) == 0) {
                            sliderColorsM2417colorsq0g_0yA = sliderColors;
                            int i16 = composerStartRestartGroup.changed(sliderColorsM2417colorsq0g_0yA) ? 8388608 : 4194304;
                            i4 |= i16;
                        } else {
                            sliderColorsM2417colorsq0g_0yA = sliderColors;
                        }
                        i4 |= i16;
                    } else {
                        i10 = 458752;
                        sliderColorsM2417colorsq0g_0yA = sliderColors;
                    }
                    i11 = i3 & 256;
                    if (i11 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i4 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            }
                            if (i6 != 0) {
                                i7 = 0;
                            }
                            if (i8 != 0) {
                                function02 = null;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                                sliderColorsM2417colorsq0g_0yA = SliderDefaults.INSTANCE.m2417colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            }
                            if (i11 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                function03 = function02;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                i12 = i4;
                                z3 = z2;
                                sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-202044027, i12, -1, "androidx.compose.material3.Slider (Slider.kt:154)");
                            }
                            Boolean boolValueOf = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(mutableInteractionSource2) | composerStartRestartGroup.changed(sliderColors2);
                            composableLambdaRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || composableLambdaRememberedValue == Composer.INSTANCE.getEmpty()) {
                                composableLambdaRememberedValue = ComposableLambdaKt.composableLambdaInstance(-1923353268, true, new Function3<SliderPositions, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer2, Integer num) {
                                        invoke(sliderPositions, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(SliderPositions it, Composer composer2, int i17) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ComposerKt.sourceInformation(composer2, "C177@8324L142:Slider.kt#uh7d8r");
                                        if ((i17 & 81) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1923353268, i17, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                            }
                                            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                            MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                            SliderColors sliderColors3 = sliderColors2;
                                            boolean z4 = z3;
                                            int i18 = i12;
                                            sliderDefaults.m2416Thumb9LiSoMs(mutableInteractionSource3, null, sliderColors3, z4, 0L, composer2, ((i18 >> 24) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i18 >> 15) & 896) | (i18 & 7168), 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(composableLambdaRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function3 function3 = (Function3) composableLambdaRememberedValue;
                            Boolean boolValueOf2 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(sliderColors2);
                            composableLambdaRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || composableLambdaRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                composableLambdaRememberedValue2 = ComposableLambdaKt.composableLambdaInstance(1022381539, true, new Function3<SliderPositions, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer2, Integer num) {
                                        invoke(sliderPositions, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(SliderPositions sliderPositions, Composer composer2, int i17) {
                                        Intrinsics.checkNotNullParameter(sliderPositions, "sliderPositions");
                                        ComposerKt.sourceInformation(composer2, "C184@8572L138:Slider.kt#uh7d8r");
                                        if ((i17 & 14) == 0) {
                                            i17 |= composer2.changed(sliderPositions) ? 4 : 2;
                                        }
                                        if ((i17 & 91) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1022381539, i17, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                            }
                                            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                            SliderColors sliderColors3 = sliderColors2;
                                            boolean z4 = z3;
                                            int i18 = i12;
                                            sliderDefaults.Track(sliderPositions, null, sliderColors3, z4, composer2, (i17 & 14) | 24576 | ((i18 >> 15) & 896) | (i18 & 7168), 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(composableLambdaRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i17 = i12 & WebSocketProtocol.PAYLOAD_SHORT;
                            int i18 = i12 << 3;
                            modifier3 = modifier2;
                            i13 = i7;
                            Slider(f, onValueChange, (Function3) composableLambdaRememberedValue2, modifier3, z3, closedFloatingPointRange2, i13, function03, sliderColors2, mutableInteractionSource2, function3, composerStartRestartGroup, i17 | (i18 & 7168) | (i18 & i9) | (i18 & i10) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                        }
                        i12 = i4;
                        z3 = z2;
                        function03 = function02;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                        mutableInteractionSource2 = mutableInteractionSource;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Boolean boolValueOf3 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(mutableInteractionSource2) | composerStartRestartGroup.changed(sliderColors2);
                        composableLambdaRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            composableLambdaRememberedValue = ComposableLambdaKt.composableLambdaInstance(-1923353268, true, new Function3<SliderPositions, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer2, Integer num) {
                                    invoke(sliderPositions, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(SliderPositions it, Composer composer2, int i172) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ComposerKt.sourceInformation(composer2, "C177@8324L142:Slider.kt#uh7d8r");
                                    if ((i172 & 81) != 16 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1923353268, i172, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:176)");
                                        }
                                        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                        SliderColors sliderColors3 = sliderColors2;
                                        boolean z4 = z3;
                                        int i182 = i12;
                                        sliderDefaults.m2416Thumb9LiSoMs(mutableInteractionSource3, null, sliderColors3, z4, 0L, composer2, ((i182 >> 24) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i182 >> 15) & 896) | (i182 & 7168), 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composableLambdaRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            Function3 function32 = (Function3) composableLambdaRememberedValue;
                            Boolean boolValueOf22 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf22) | composerStartRestartGroup.changed(sliderColors2);
                            composableLambdaRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                composableLambdaRememberedValue2 = ComposableLambdaKt.composableLambdaInstance(1022381539, true, new Function3<SliderPositions, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer2, Integer num) {
                                        invoke(sliderPositions, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(SliderPositions sliderPositions, Composer composer2, int i172) {
                                        Intrinsics.checkNotNullParameter(sliderPositions, "sliderPositions");
                                        ComposerKt.sourceInformation(composer2, "C184@8572L138:Slider.kt#uh7d8r");
                                        if ((i172 & 14) == 0) {
                                            i172 |= composer2.changed(sliderPositions) ? 4 : 2;
                                        }
                                        if ((i172 & 91) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1022381539, i172, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:183)");
                                            }
                                            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                            SliderColors sliderColors3 = sliderColors2;
                                            boolean z4 = z3;
                                            int i182 = i12;
                                            sliderDefaults.Track(sliderPositions, null, sliderColors3, z4, composer2, (i172 & 14) | 24576 | ((i182 >> 15) & 896) | (i182 & 7168), 2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(composableLambdaRememberedValue2);
                                composerStartRestartGroup.endReplaceableGroup();
                                int i172 = i12 & WebSocketProtocol.PAYLOAD_SHORT;
                                int i182 = i12 << 3;
                                modifier3 = modifier2;
                                i13 = i7;
                                Slider(f, onValueChange, (Function3) composableLambdaRememberedValue2, modifier3, z3, closedFloatingPointRange2, i13, function03, sliderColors2, mutableInteractionSource2, function32, composerStartRestartGroup, i172 | (i182 & 7168) | (i182 & i9) | (i182 & i10) | (i182 & 3670016) | (i182 & 29360128) | (i182 & 234881024) | (i182 & 1879048192), 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        function03 = function02;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                        i13 = i7;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.4
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

                        public final void invoke(Composer composer2, int i19) {
                            SliderKt.Slider(f, onValueChange, modifier3, z3, closedFloatingPointRange2, i13, function03, sliderColors2, mutableInteractionSource2, composer2, i2 | 1, i3);
                        }
                    });
                    return;
                }
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 29360128) != 0) {
                }
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                if ((i4 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if ((i3 & 128) != 0) {
                        }
                        if (i11 == 0) {
                            i12 = i4;
                            z3 = z2;
                            function03 = function02;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Boolean boolValueOf32 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf32) | composerStartRestartGroup.changed(mutableInteractionSource2) | composerStartRestartGroup.changed(sliderColors2);
                        composableLambdaRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i2 & 57344) == 0) {
            }
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 29360128) != 0) {
            }
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            if ((i4 & 191739611) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 57344) == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 29360128) != 0) {
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        if ((i4 & 191739611) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013c  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1<? super Float, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, final Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> thumb, Composer composer, final int i2, final int i3) {
        float f2;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Function0<Unit> function02;
        int i11;
        int i12;
        SliderColors sliderColorsM2417colorsq0g_0yA;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        final Function0<Unit> function03;
        final int i13;
        final boolean z3;
        final SliderColors sliderColors2;
        MutableInteractionSource mutableInteractionSource2;
        boolean zChanged;
        ComposableLambda composableLambdaRememberedValue;
        final Modifier modifier3;
        final int i14;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i15;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Composer composerStartRestartGroup = composer.startRestartGroup(1785516312);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Slider)P(8,4,3,1,9,6,5)244@11547L8,245@11607L39,259@12053L226,248@11705L580:Slider.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            f2 = f;
        } else if ((i2 & 14) == 0) {
            f2 = f;
            i4 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i2;
        } else {
            f2 = f;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 57344) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                        int i17 = composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                        i4 |= i17;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    }
                    i4 |= i17;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i7 = 57344;
                    i8 = i;
                } else {
                    i7 = 57344;
                    i8 = i;
                    if ((i2 & 458752) == 0) {
                        i4 |= composerStartRestartGroup.changed(i8) ? 131072 : 65536;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    i10 = 458752;
                    function02 = function0;
                } else {
                    i10 = 458752;
                    function02 = function0;
                    if ((i2 & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changed(function02) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 29360128) == 0) {
                    i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(sliderColors)) ? 8388608 : 4194304;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                    i12 = i11;
                } else {
                    i12 = i11;
                    if ((i2 & 234881024) == 0) {
                        i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                }
                if ((i3 & 512) == 0) {
                    i15 = (i2 & 1879048192) == 0 ? composerStartRestartGroup.changed(thumb) ? 536870912 : 268435456 : 805306368;
                    if ((1533916891 & i4) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            }
                            if (i6 != 0) {
                                i8 = 0;
                            }
                            if (i9 != 0) {
                                function02 = null;
                            }
                            if ((i3 & 128) == 0) {
                                sliderColorsM2417colorsq0g_0yA = SliderDefaults.INSTANCE.m2417colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                                i4 &= -29360129;
                            } else {
                                sliderColorsM2417colorsq0g_0yA = sliderColors;
                            }
                            if (i12 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                boolean z4 = z2;
                                sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i13 = i4;
                                z3 = z4;
                                function03 = function02;
                            } else {
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                function03 = function02;
                                i13 = i4;
                                z3 = z2;
                                sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            mutableInteractionSource2 = mutableInteractionSource;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            function03 = function02;
                            i13 = i4;
                            z3 = z2;
                            sliderColors2 = sliderColors;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1785516312, i13, -1, "androidx.compose.material3.Slider (Slider.kt:235)");
                        }
                        Boolean boolValueOf = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(sliderColors2);
                        composableLambdaRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || composableLambdaRememberedValue == Composer.INSTANCE.getEmpty()) {
                            composableLambdaRememberedValue = ComposableLambdaKt.composableLambdaInstance(1252336501, true, new Function3<SliderPositions, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer2, Integer num) {
                                    invoke(sliderPositions, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(SliderPositions sliderPositions, Composer composer2, int i18) {
                                    Intrinsics.checkNotNullParameter(sliderPositions, "sliderPositions");
                                    ComposerKt.sourceInformation(composer2, "C260@12129L138:Slider.kt#uh7d8r");
                                    if ((i18 & 14) == 0) {
                                        i18 |= composer2.changed(sliderPositions) ? 4 : 2;
                                    }
                                    if ((i18 & 91) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1252336501, i18, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                        }
                                        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                        SliderColors sliderColors3 = sliderColors2;
                                        boolean z5 = z3;
                                        int i19 = i13;
                                        sliderDefaults.Track(sliderPositions, null, sliderColors3, z5, composer2, (i18 & 14) | 24576 | ((i19 >> 15) & 896) | (i19 & 7168), 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composableLambdaRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i18 = i13 << 3;
                        float f3 = f2;
                        modifier3 = modifier2;
                        i14 = i8;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        Slider(f3, onValueChange, (Function3) composableLambdaRememberedValue, modifier3, z3, closedFloatingPointRange2, i14, function03, sliderColors2, mutableInteractionSource3, thumb, composerStartRestartGroup, (i18 & 7168) | (i13 & WebSocketProtocol.PAYLOAD_SHORT) | (i18 & i7) | (i18 & i10) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192), (i13 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        i14 = i8;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        function03 = function02;
                        sliderColors2 = sliderColors;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.7
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

                        public final void invoke(Composer composer2, int i19) {
                            SliderKt.Slider(f, onValueChange, modifier3, z3, closedFloatingPointRange2, i14, function03, sliderColors2, mutableInteractionSource3, thumb, composer2, i2 | 1, i3);
                        }
                    });
                    return;
                }
                i4 |= i15;
                if ((1533916891 & i4) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Boolean boolValueOf2 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(sliderColors2);
                        composableLambdaRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            composableLambdaRememberedValue = ComposableLambdaKt.composableLambdaInstance(1252336501, true, new Function3<SliderPositions, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer2, Integer num) {
                                    invoke(sliderPositions, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(SliderPositions sliderPositions, Composer composer2, int i182) {
                                    Intrinsics.checkNotNullParameter(sliderPositions, "sliderPositions");
                                    ComposerKt.sourceInformation(composer2, "C260@12129L138:Slider.kt#uh7d8r");
                                    if ((i182 & 14) == 0) {
                                        i182 |= composer2.changed(sliderPositions) ? 4 : 2;
                                    }
                                    if ((i182 & 91) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1252336501, i182, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:259)");
                                        }
                                        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                        SliderColors sliderColors3 = sliderColors2;
                                        boolean z5 = z3;
                                        int i19 = i13;
                                        sliderDefaults.Track(sliderPositions, null, sliderColors3, z5, composer2, (i182 & 14) | 24576 | ((i19 >> 15) & 896) | (i19 & 7168), 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(composableLambdaRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            int i182 = i13 << 3;
                            float f32 = f2;
                            modifier3 = modifier2;
                            i14 = i8;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            Slider(f32, onValueChange, (Function3) composableLambdaRememberedValue, modifier3, z3, closedFloatingPointRange2, i14, function03, sliderColors2, mutableInteractionSource3, thumb, composerStartRestartGroup, (i182 & 7168) | (i13 & WebSocketProtocol.PAYLOAD_SHORT) | (i182 & i7) | (i182 & i10) | (i182 & 3670016) | (i182 & 29360128) | (i182 & 234881024) | (i182 & 1879048192), (i13 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i2 & 57344) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i4 |= i15;
            if ((1533916891 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 57344) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i4 |= i15;
        if ((1533916891 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1<? super Float, Unit> onValueChange, final Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> track, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        final int i5;
        Modifier modifier2;
        int i6;
        final boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i7;
        int i8;
        int i9;
        final SliderColors sliderColorsM2417colorsq0g_0yA;
        int i10;
        int i11;
        int i12;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        final MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        boolean z3;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function32;
        SliderColors sliderColors2;
        int i13;
        Function0<Unit> function02;
        int i14;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        final Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function33;
        Composer composer2;
        final SliderColors sliderColors3;
        final MutableInteractionSource mutableInteractionSource4;
        final Function0<Unit> function03;
        final int i15;
        final Modifier modifier4;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(track, "track");
        Composer composerStartRestartGroup = composer.startRestartGroup(387052651);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Slider)P(9,4,8,3,1,10,6,5)322@15315L8,323@15375L39,325@15475L230,335@15766L338:Slider.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i5 |= composerStartRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(track) ? 256 : 128;
        }
        int i16 = i4 & 8;
        if (i16 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 7168) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i2 & 57344) == 0) {
                    z2 = z;
                    i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 458752) == 0) {
                    if ((i4 & 32) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        int i17 = composerStartRestartGroup.changed(closedFloatingPointRange2) ? 131072 : 65536;
                        i5 |= i17;
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i5 |= i17;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i7 = i4 & 64;
                if (i7 != 0) {
                    i5 |= 1572864;
                    i8 = i;
                } else {
                    i8 = i;
                    if ((i2 & 3670016) == 0) {
                        i5 |= composerStartRestartGroup.changed(i8) ? 1048576 : 524288;
                    }
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= composerStartRestartGroup.changed(function0) ? 8388608 : 4194304;
                }
                if ((i2 & 234881024) == 0) {
                    if ((i4 & 256) == 0) {
                        sliderColorsM2417colorsq0g_0yA = sliderColors;
                        int i18 = composerStartRestartGroup.changed(sliderColorsM2417colorsq0g_0yA) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i5 |= i18;
                    } else {
                        sliderColorsM2417colorsq0g_0yA = sliderColors;
                    }
                    i5 |= i18;
                } else {
                    sliderColorsM2417colorsq0g_0yA = sliderColors;
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                    i5 |= 805306368;
                    i11 = i10;
                } else {
                    i11 = i10;
                    if ((i2 & 1879048192) == 0) {
                        i5 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                    }
                }
                if ((i3 & 14) == 0) {
                    i12 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(function3)) ? 4 : 2);
                } else {
                    i12 = i3;
                }
                if ((i5 & 1533916891) != 306783378 || (i12 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if ((i4 & 32) == 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i5 &= -458753;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i7 != 0) {
                            i8 = 0;
                        }
                        Function0<Unit> function04 = i9 == 0 ? null : function0;
                        if ((i4 & 256) != 0) {
                            sliderColorsM2417colorsq0g_0yA = SliderDefaults.INSTANCE.m2417colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i5 = (-234881025) & i5;
                        }
                        if (i11 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i4 & 1024) == 0) {
                            Boolean boolValueOf = Boolean.valueOf(z2);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(mutableInteractionSource2) | composerStartRestartGroup.changed(sliderColorsM2417colorsq0g_0yA);
                            ComposableLambda composableLambdaRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || composableLambdaRememberedValue == Composer.INSTANCE.getEmpty()) {
                                composableLambdaRememberedValue = ComposableLambdaKt.composableLambdaInstance(1647281944, true, new Function3<SliderPositions, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$9$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer3, Integer num) {
                                        invoke(sliderPositions, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(SliderPositions it, Composer composer3, int i19) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ComposerKt.sourceInformation(composer3, "C326@15551L142:Slider.kt#uh7d8r");
                                        if ((i19 & 81) != 16 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1647281944, i19, -1, "androidx.compose.material3.Slider.<anonymous>.<anonymous> (Slider.kt:325)");
                                            }
                                            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                                            SliderColors sliderColors4 = sliderColorsM2417colorsq0g_0yA;
                                            boolean z5 = z2;
                                            int i20 = i5;
                                            sliderDefaults.m2416Thumb9LiSoMs(mutableInteractionSource5, null, sliderColors4, z5, 0L, composer3, ((i20 >> 27) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i20 >> 18) & 896) | ((i20 >> 3) & 7168), 18);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(composableLambdaRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            i12 &= -15;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier3 = modifier2;
                            z3 = z2;
                            function32 = (Function3) composableLambdaRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier3 = modifier2;
                            z3 = z2;
                            function32 = function3;
                        }
                        sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                        i13 = i8;
                        function02 = function04;
                        i14 = i12;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i4 & 256) != 0) {
                            i5 &= -234881025;
                        }
                        if ((i4 & 1024) != 0) {
                            i12 &= -15;
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z3 = z2;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        i14 = i12;
                        function32 = function3;
                        sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                        i13 = i8;
                        function02 = function0;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(387052651, i5, i14, "androidx.compose.material3.Slider (Slider.kt:312)");
                    }
                    if (i13 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    int i19 = i5 >> 9;
                    Modifier modifier5 = modifier3;
                    int i20 = i5 << 6;
                    SliderImpl(modifier5, z3, mutableInteractionSource3, onValueChange, function02, i13, f, closedFloatingPointRangeRangeTo, function32, track, composerStartRestartGroup, ((i5 >> 21) & 896) | (i19 & WebSocketProtocol.PAYLOAD_SHORT) | (i20 & 7168) | (i19 & 57344) | ((i5 >> 3) & 458752) | ((i5 << 18) & 3670016) | (i20 & 29360128) | ((i14 << 24) & 234881024) | ((i5 << 21) & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    function33 = function32;
                    composer2 = composerStartRestartGroup;
                    sliderColors3 = sliderColors2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    function03 = function02;
                    i15 = i13;
                    modifier4 = modifier5;
                    z4 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function33 = function3;
                    i15 = i8;
                    sliderColors3 = sliderColorsM2417colorsq0g_0yA;
                    modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    z4 = z2;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    function03 = function0;
                    mutableInteractionSource4 = mutableInteractionSource;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.Slider.11
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

                    public final void invoke(Composer composer3, int i21) {
                        SliderKt.Slider(f, onValueChange, track, modifier4, z4, closedFloatingPointRange3, i15, function03, sliderColors3, mutableInteractionSource4, function33, composer3, i2 | 1, i3, i4);
                    }
                });
                return;
            }
            i5 |= 24576;
            z2 = z;
            if ((i2 & 458752) == 0) {
            }
            i7 = i4 & 64;
            if (i7 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            if ((i2 & 234881024) == 0) {
            }
            i10 = i4 & 512;
            if (i10 != 0) {
            }
            if ((i3 & 14) == 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i4 & 32) == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i4 & 256) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if ((i4 & 1024) == 0) {
                    }
                    sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                    i13 = i8;
                    function02 = function04;
                    i14 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (i13 >= 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 16;
        if (i6 != 0) {
        }
        z2 = z;
        if ((i2 & 458752) == 0) {
        }
        i7 = i4 & 64;
        if (i7 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        if ((i2 & 234881024) == 0) {
        }
        i10 = i4 & 512;
        if (i10 != 0) {
        }
        if ((i3 & 14) == 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ClosedFloatingPointRange<Float> value, final Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function02;
        Composer composer2;
        Composer composer3;
        Function0<Unit> function03;
        Modifier modifier3;
        boolean z3;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i9;
        SliderColors sliderColorsM2417colorsq0g_0yA;
        Object objRememberedValue;
        Object objRememberedValue2;
        final Function0<Unit> function04;
        final boolean z4;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        final int i10;
        final SliderColors sliderColors2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-743091416);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RangeSlider)P(6,3,2,1,7,5,4)393@18465L8,395@18537L39,396@18634L39,399@18819L74,399@18755L138,404@18918L59,408@18983L3983:Slider.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                        int i12 = composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                        i4 |= i12;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    }
                    i4 |= i12;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                    if ((458752 & i2) == 0) {
                        i7 = i;
                        i4 |= composerStartRestartGroup.changed(i7) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i2 & 3670016) == 0) {
                            i4 |= composerStartRestartGroup.changed(function02) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 29360128) == 0) {
                        i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(sliderColors)) ? 8388608 : 4194304;
                    }
                    composer2 = composerStartRestartGroup;
                    if ((i4 & 23967451) == 4793490 || !composer2.getSkipping()) {
                        composer2.startDefaults();
                        if ((i2 & 1) != 0 || composer2.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            }
                            if (i6 != 0) {
                                i7 = 0;
                            }
                            Function0<Unit> function05 = i8 == 0 ? null : function02;
                            if ((i3 & 128) == 0) {
                                composer3 = composer2;
                                i4 &= -29360129;
                                function03 = function05;
                                modifier3 = modifier2;
                                z3 = z2;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i9 = i7;
                                sliderColorsM2417colorsq0g_0yA = SliderDefaults.INSTANCE.m2417colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 6, 1023);
                                composer3.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-743091416, i4, -1, "androidx.compose.material3.RangeSlider (Slider.kt:384)");
                                }
                                composer3.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                objRememberedValue = composer3.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                                composer3.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                objRememberedValue2 = composer3.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                                if (i9 >= 0) {
                                    throw new IllegalArgumentException("steps should be >= 0".toString());
                                }
                                composer3.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged = composer3.changed(value) | composer3.changed(onValueChange);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<ClosedFloatingPointRange<Float>, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$onValueChangeState$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ClosedFloatingPointRange<Float> closedFloatingPointRange4) {
                                            invoke2(closedFloatingPointRange4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(ClosedFloatingPointRange<Float> it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if (Intrinsics.areEqual(it, value)) {
                                                return;
                                            }
                                            onValueChange.invoke(it);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(objRememberedValue3, composer3, 0);
                                Integer numValueOf = Integer.valueOf(i9);
                                composer3.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                                boolean zChanged2 = composer3.changed(numValueOf);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = stepsToTickFractions(i9);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                composer3.endReplaceableGroup();
                                float f = 2;
                                Composer composer4 = composer3;
                                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m1061requiredSizeInqDBjuR0$default(TouchTargetKt.minimumTouchTargetSize(modifier3), Dp.m6117constructorimpl(ThumbWidth * f), Dp.m6117constructorimpl(ThumbHeight * f), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer3, -990606702, true, new AnonymousClass2(function03, i4, mutableInteractionSource, mutableInteractionSource2, z3, closedFloatingPointRange2, value, i9, stateRememberUpdatedState, (float[]) objRememberedValue4, sliderColorsM2417colorsq0g_0yA)), composer4, 3072, 6);
                                composer2 = composer4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function04 = function03;
                                z4 = z3;
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                                i10 = i9;
                                sliderColors2 = sliderColorsM2417colorsq0g_0yA;
                                modifier4 = modifier3;
                            } else {
                                composer3 = composer2;
                                function03 = function05;
                                modifier3 = modifier2;
                                z3 = z2;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i9 = i7;
                            }
                        } else {
                            composer2.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            function03 = function02;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            i9 = i7;
                            composer3 = composer2;
                        }
                        sliderColorsM2417colorsq0g_0yA = sliderColors;
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer3.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                        objRememberedValue = composer3.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        composer3.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        composer3.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                        objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        composer3.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) objRememberedValue2;
                        if (i9 >= 0) {
                        }
                    } else {
                        composer2.skipToGroupEnd();
                        function04 = function02;
                        modifier4 = modifier2;
                        z4 = z2;
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        i10 = i7;
                        sliderColors2 = sliderColors;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSlider.3
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

                        public final void invoke(Composer composer5, int i13) {
                            SliderKt.RangeSlider(value, onValueChange, modifier4, z4, closedFloatingPointRange3, i10, function04, sliderColors2, composer5, i2 | 1, i3);
                        }
                    });
                    return;
                }
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                composer2 = composerStartRestartGroup;
                if ((i4 & 23967451) == 4793490) {
                    composer2.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            composer2 = composerStartRestartGroup;
            if ((i4 & 23967451) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        composer2 = composerStartRestartGroup;
        if ((i4 & 23967451) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: androidx.compose.material3.SliderKt$RangeSlider$2, reason: invalid class name */
    static final class AnonymousClass2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ SliderColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        final /* synthetic */ int $steps;
        final /* synthetic */ float[] $tickFractions;
        final /* synthetic */ ClosedFloatingPointRange<Float> $value;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function0<Unit> function0, int i, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, float[] fArr, SliderColors sliderColors) {
            super(3);
            this.$onValueChangeFinished = function0;
            this.$$dirty = i;
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$enabled = z;
            this.$valueRange = closedFloatingPointRange;
            this.$value = closedFloatingPointRange2;
            this.$steps = i2;
            this.$onValueChangeState = state;
            this.$tickFractions = fArr;
            this.$colors = sliderColors;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) throws Resources.NotFoundException {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            ComposerKt.sourceInformation(composer, "C413@19202L7,*418@19363L7,429@19797L55,430@19880L62,432@20015L55,432@19975L95,436@20093L1026,479@22137L63,487@22427L65,493@22620L340:Slider.kt#uh7d8r");
            if ((i & 14) == 0) {
                i2 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-990606702, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:412)");
                }
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(composer);
                boolean z = objConsume == LayoutDirection.Rtl;
                float fM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(BoxWithConstraints.mo927getConstraintsmsEJaDk());
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composer.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density = (Density) objConsume2;
                float f = 2;
                floatRef.element = fM6070getMaxWidthimpl - (density.mo712toPx0680j_4(SliderKt.getThumbWidth()) / f);
                floatRef2.element = density.mo712toPx0680j_4(SliderKt.getThumbWidth()) / f;
                Unit unit = Unit.INSTANCE;
                ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$value;
                ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange2, floatRef2, floatRef, closedFloatingPointRange.getStart().floatValue())), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue;
                ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$value;
                ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.$valueRange;
                composer.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange4, floatRef2, floatRef, closedFloatingPointRange3.getEndInclusive().floatValue())), null, 2, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) objRememberedValue2;
                final Function0<Unit> function0 = this.$onValueChangeFinished;
                composer.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
                boolean zChanged = composer.changed(function0);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$gestureEndAction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z2) {
                            Function0<Unit> function02 = function0;
                            if (function02 != null) {
                                function02.invoke();
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(objRememberedValue3, composer, 0);
                final ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.$value;
                final float[] fArr = this.$tickFractions;
                final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
                final ClosedFloatingPointRange<Float> closedFloatingPointRange6 = this.$valueRange;
                Modifier modifierRangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(Modifier.INSTANCE, this.$startInteractionSource, this.$endInteractionSource, mutableState, mutableState2, this.$enabled, z, fM6070getMaxWidthimpl, this.$valueRange, stateRememberUpdatedState, SnapshotStateKt.rememberUpdatedState(new Function2<Boolean, Float, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$onDrag$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f2) {
                        invoke(bool.booleanValue(), f2.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z2, float f2) {
                        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
                        if (z2) {
                            MutableState<Float> mutableState3 = mutableState;
                            mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + f2));
                            mutableState2.setValue(Float.valueOf(SliderKt.AnonymousClass2.invoke$scaleToOffset(closedFloatingPointRange6, floatRef2, floatRef, closedFloatingPointRange5.getEndInclusive().floatValue())));
                            float fFloatValue = mutableState2.getValue().floatValue();
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(SliderKt.snapValueToTick(RangesKt.coerceIn(mutableState.getValue().floatValue(), floatRef2.element, fFloatValue), fArr, floatRef2.element, floatRef.element), fFloatValue);
                        } else {
                            MutableState<Float> mutableState4 = mutableState2;
                            mutableState4.setValue(Float.valueOf(mutableState4.getValue().floatValue() + f2));
                            mutableState.setValue(Float.valueOf(SliderKt.AnonymousClass2.invoke$scaleToOffset(closedFloatingPointRange6, floatRef2, floatRef, closedFloatingPointRange5.getStart().floatValue())));
                            float fFloatValue2 = mutableState.getValue().floatValue();
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(fFloatValue2, SliderKt.snapValueToTick(RangesKt.coerceIn(mutableState2.getValue().floatValue(), fFloatValue2, floatRef.element), fArr, floatRef2.element, floatRef.element));
                        }
                        state.getValue().invoke(SliderKt.AnonymousClass2.invoke$scaleToUserValue(floatRef2, floatRef, closedFloatingPointRange6, closedFloatingPointRangeRangeTo));
                    }
                }, composer, 0));
                final float fCoerceIn = RangesKt.coerceIn(this.$value.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$value.getEndInclusive().floatValue());
                final float fCoerceIn2 = RangesKt.coerceIn(this.$value.getEndInclusive().floatValue(), this.$value.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
                float fCalcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fCoerceIn);
                float fCalcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), fCoerceIn2);
                int iFloor = (int) Math.floor(this.$steps * fCalcFraction2);
                int iFloor2 = (int) Math.floor(this.$steps * (1.0f - fCalcFraction));
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean z2 = this.$enabled;
                Object obj = this.$onValueChangeState;
                Object objValueOf = Float.valueOf(fCoerceIn2);
                final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state2 = this.$onValueChangeState;
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
                boolean zChanged2 = composer.changed(obj) | composer.changed(objValueOf);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                            invoke(f2.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f2) {
                            state2.getValue().invoke(RangesKt.rangeTo(f2, fCoerceIn2));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                Modifier modifierSliderSemantics = SliderKt.sliderSemantics(companion, fCoerceIn, z2, (Function1) objRememberedValue4, this.$onValueChangeFinished, RangesKt.rangeTo(this.$valueRange.getStart().floatValue(), fCoerceIn2), iFloor);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean z3 = this.$enabled;
                Object obj2 = this.$onValueChangeState;
                Object objValueOf2 = Float.valueOf(fCoerceIn);
                final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state3 = this.$onValueChangeState;
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "C(remember)P(1,2):Composables.kt#9igjgp");
                boolean zChanged3 = composer.changed(obj2) | composer.changed(objValueOf2);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                            invoke(f2.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f2) {
                            state3.getValue().invoke(RangesKt.rangeTo(fCoerceIn, f2));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceableGroup();
                Modifier modifierSliderSemantics2 = SliderKt.sliderSemantics(companion2, fCoerceIn2, z3, (Function1) objRememberedValue5, this.$onValueChangeFinished, RangesKt.rangeTo(fCoerceIn, this.$valueRange.getEndInclusive().floatValue()), iFloor2);
                boolean z4 = this.$enabled;
                float[] fArr2 = this.$tickFractions;
                SliderColors sliderColors = this.$colors;
                float f2 = floatRef.element - floatRef2.element;
                MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
                MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
                int i3 = this.$$dirty;
                SliderKt.RangeSliderImpl(z4, fCalcFraction, fCalcFraction2, fArr2, sliderColors, f2, mutableInteractionSource, mutableInteractionSource2, modifierRangeSliderPressDragModifier, modifierSliderSemantics, modifierSliderSemantics2, composer, ((i3 >> 9) & 14) | 14159872 | ((i3 >> 9) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
            return SliderKt.scale(floatRef.element, floatRef2.element, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
            return SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f, floatRef.element, floatRef2.element);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl(final boolean z, final float f, final float f2, final float[] fArr, final SliderColors sliderColors, final float f3, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        Composer composerStartRestartGroup = composer.startRestartGroup(-597471305);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RangeSliderImpl)P(1,6,5,9!1,10,7!1,4,8)524@23449L35,525@23517L33,526@23555L1927:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-597471305, i, i2, "androidx.compose.material3.RangeSliderImpl (Slider.kt:511)");
        }
        final String strM2449getStringNWtq28 = Strings_androidKt.m2449getStringNWtq28(Strings.INSTANCE.m2448getSliderRangeStartadMyvUU(), composerStartRestartGroup, 6);
        final String strM2449getStringNWtq282 = Strings_androidKt.m2449getStringNWtq28(Strings.INSTANCE.m2447getSliderRangeEndadMyvUU(), composerStartRestartGroup, 6);
        Modifier modifierThen = modifier.then(DefaultSliderConstraints);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Density density = (Density) objConsume;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object objConsume3 = composerStartRestartGroup.consume(localViewConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-2137368960);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1755032509);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C*529@23688L7,537@23916L319,550@24245L616,566@24870L606:Slider.kt#uh7d8r");
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object objConsume4 = composerStartRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Density density2 = (Density) objConsume4;
        float fMo712toPx0680j_4 = density2.mo712toPx0680j_4(TrackHeight);
        float fMo708toDpu2uoSUM = density2.mo708toDpu2uoSUM(f3);
        float fM6117constructorimpl = Dp.m6117constructorimpl(fMo708toDpu2uoSUM * f);
        float fM6117constructorimpl2 = Dp.m6117constructorimpl(fMo708toDpu2uoSUM * f2);
        int i3 = i << 6;
        m2419TempRangeSliderTrackau3_HiA(SizeKt.fillMaxSize$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), 0.0f, 1, null), sliderColors, z, f, f2, fArr, ThumbWidth, fMo712toPx0680j_4, composerStartRestartGroup, ((i >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 1835008 | (i3 & 896) | (i3 & 7168) | (i3 & 57344));
        m2418TempRangeSliderThumbrAjV9yQ(boxScopeInstance, fM6117constructorimpl, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1592025586, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxScope TempRangeSliderThumb, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(TempRangeSliderThumb, "$this$TempRangeSliderThumb");
                ComposerKt.sourceInformation(composer2, "C555@24463L100,553@24356L481:Slider.kt#uh7d8r");
                if ((i4 & 81) != 16 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1592025586, i4, -1, "androidx.compose.material3.RangeSliderImpl.<anonymous>.<anonymous> (Slider.kt:552)");
                    }
                    SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    final String str = strM2449getStringNWtq28;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged = composer2.changed(str);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2$1$1
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
                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                SemanticsPropertiesKt.setContentDescription(semantics, str);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierThen2 = FocusableKt.focusable(SemanticsModifierKt.semantics(companion, true, (Function1) objRememberedValue), true, mutableInteractionSource).then(modifier2);
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    SliderColors sliderColors2 = sliderColors;
                    boolean z2 = z;
                    int i5 = i;
                    sliderDefaults.m2416Thumb9LiSoMs(mutableInteractionSource3, modifierThen2, sliderColors2, z2, 0L, composer2, ((i5 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i5 >> 6) & 896) | ((i5 << 9) & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 390);
        m2418TempRangeSliderThumbrAjV9yQ(boxScopeInstance, fM6117constructorimpl2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1141545019, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxScope TempRangeSliderThumb, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(TempRangeSliderThumb, "$this$TempRangeSliderThumb");
                ComposerKt.sourceInformation(composer2, "C571@25086L98,569@24979L473:Slider.kt#uh7d8r");
                if ((i4 & 81) != 16 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1141545019, i4, -1, "androidx.compose.material3.RangeSliderImpl.<anonymous>.<anonymous> (Slider.kt:568)");
                    }
                    SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    final String str = strM2449getStringNWtq282;
                    composer2.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                    boolean zChanged = composer2.changed(str);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$3$1$1
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
                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                SemanticsPropertiesKt.setContentDescription(semantics, str);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierThen2 = FocusableKt.focusable(SemanticsModifierKt.semantics(companion, true, (Function1) objRememberedValue), true, mutableInteractionSource2).then(modifier3);
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                    SliderColors sliderColors2 = sliderColors;
                    boolean z2 = z;
                    int i5 = i;
                    sliderDefaults.m2416Thumb9LiSoMs(mutableInteractionSource3, modifierThen2, sliderColors2, z2, 0L, composer2, ((i5 >> 21) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i5 >> 6) & 896) | ((i5 << 9) & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 390);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.RangeSliderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) throws Resources.NotFoundException {
                SliderKt.RangeSliderImpl(z, f, f2, fArr, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SliderImpl(final Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, final Function1<? super Float, Unit> function1, final Function0<Unit> function0, final int i, final float f, final ClosedFloatingPointRange<Float> closedFloatingPointRange, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i2) {
        int i3;
        int i4;
        MutableState mutableState;
        float f2;
        final MutableState mutableState2;
        final MutableState mutableState3;
        final MutableState mutableState4;
        MutableState mutableState5;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function33;
        final boolean z2 = z;
        final Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function34 = function32;
        Composer composerStartRestartGroup = composer.startRestartGroup(851260148);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SliderImpl)P(2!5,8,9)810@35465L74,810@35427L112,816@35565L59,820@35647L45,821@35714L30,829@36086L7,830@36137L57,831@36217L31,835@36444L61,839@36638L492,850@37159L217,873@37816L40,878@37958L2112:Slider.kt#uh7d8r");
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(function1) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 = i;
            i3 |= composerStartRestartGroup.changed(i4) ? 131072 : 65536;
        } else {
            i4 = i;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(closedFloatingPointRange) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(function34) ? 536870912 : 268435456;
        }
        if ((1533916891 & i3) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851260148, i3, -1, "androidx.compose.material3.SliderImpl (Slider.kt:798)");
            }
            Object objValueOf = Float.valueOf(f);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(objValueOf) | composerStartRestartGroup.changed(function1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$onValueChangeState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                        invoke(f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f3) {
                        if (f3 == f) {
                            return;
                        }
                        function1.invoke(Float.valueOf(f3));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(objRememberedValue, composerStartRestartGroup, 0);
            Object objValueOf2 = Integer.valueOf(i4);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(objValueOf2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = stepsToTickFractions(i4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final float[] fArr = (float[]) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(getThumbWidth()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState6 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState6;
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                mutableState = mutableState6;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState7 = (MutableState) objRememberedValue4;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean z3 = objConsume == LayoutDirection.Rtl;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            boolean z4 = z3;
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                f2 = 0.0f;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(SliderImpl$scaleToOffset(closedFloatingPointRange, 0.0f, 0.0f, f)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue5 = objMutableStateOf$default;
            } else {
                f2 = 0.0f;
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState8 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f2), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState9 = (MutableState) objRememberedValue6;
            final float fCalcFraction = calcFraction(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()));
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new SliderPositions(fCalcFraction, fArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SliderPositions sliderPositions = (SliderPositions) objRememberedValue7;
            sliderPositions.setPositionFraction$material3_release(fCalcFraction);
            sliderPositions.setTickFractions$material3_release(fArr);
            int i5 = i3 >> 21;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged3 = composerStartRestartGroup.changed(closedFloatingPointRange);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState7;
                mutableState3 = mutableState8;
                final MutableState mutableState10 = mutableState;
                mutableState4 = mutableState10;
                mutableState5 = mutableState9;
                objRememberedValue8 = new SliderDraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$draggableState$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                        invoke(f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f3) {
                        float f4 = 2;
                        float fMax = Math.max(mutableState2.getValue().floatValue() - (mutableState10.getValue().floatValue() / f4), 0.0f);
                        float fMin = Math.min(mutableState10.getValue().floatValue() / f4, fMax);
                        MutableState<Float> mutableState11 = mutableState3;
                        mutableState11.setValue(Float.valueOf(mutableState11.getValue().floatValue() + f3 + mutableState9.getValue().floatValue()));
                        mutableState9.setValue(Float.valueOf(0.0f));
                        stateRememberUpdatedState.getValue().invoke(Float.valueOf(SliderKt.SliderImpl$scaleToUserValue(closedFloatingPointRange, fMin, fMax, SliderKt.snapValueToTick(mutableState3.getValue().floatValue(), fArr, fMin, fMax))));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                mutableState5 = mutableState9;
                mutableState3 = mutableState8;
                mutableState4 = mutableState;
                mutableState2 = mutableState7;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final SliderDraggableState sliderDraggableState = (SliderDraggableState) objRememberedValue8;
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new Function0<Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$gestureEndAction$1
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
                    Function0<Unit> function02;
                    if (sliderDraggableState.isDragging() || (function02 = function0) == null) {
                        return;
                    }
                    function02.invoke();
                }
            }, composerStartRestartGroup, 0);
            SliderDraggableState sliderDraggableState2 = sliderDraggableState;
            MutableState mutableState11 = mutableState3;
            int i6 = i3;
            Modifier modifierSliderTapModifier = sliderTapModifier(Modifier.INSTANCE, sliderDraggableState2, mutableInteractionSource, ((Number) mutableState2.getValue()).intValue(), z4, mutableState11, stateRememberUpdatedState2, mutableState5, z);
            Modifier.Companion companion = Modifier.INSTANCE;
            Orientation orientation = Orientation.Horizontal;
            boolean zIsDragging = sliderDraggableState.isDragging();
            Modifier.Companion companion2 = companion;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean zChanged4 = composerStartRestartGroup.changed(stateRememberUpdatedState2);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = (Function3) new SliderKt$SliderImpl$drag$1$1(stateRememberUpdatedState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifierDraggable$default = DraggableKt.draggable$default(companion2, sliderDraggableState2, orientation, z, mutableInteractionSource, zIsDragging, null, (Function3) objRememberedValue9, z4, 32, null);
            mutableInteractionSource2 = mutableInteractionSource;
            z2 = z;
            Modifier modifierThen = FocusableKt.focusable(sliderSemantics(SizeKt.m1061requiredSizeInqDBjuR0$default(TouchTargetKt.minimumTouchTargetSize(modifier), SliderTokens.INSTANCE.m3011getHandleWidthD9Ej5fM(), SliderTokens.INSTANCE.m3010getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), f, z2, function1, function0, closedFloatingPointRange, i), z2, mutableInteractionSource2).then(modifierSliderTapModifier).then(modifierDraggable$default);
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt.SliderImpl.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo377measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> measurables, long j) {
                    MeasureScope Layout = measureScope;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                            long j2 = j;
                            final Placeable placeableMo4993measureBRTryo0 = measurable.mo4993measureBRTryo0(j2);
                            int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j2) - placeableMo4993measureBRTryo0.getWidth();
                            for (Measurable measurable2 : list) {
                                if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                    final Placeable placeableMo4993measureBRTryo02 = measurable2.mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j2, 0, iM6070getMaxWidthimpl, 0, 0, 8, null));
                                    int width = placeableMo4993measureBRTryo02.getWidth() + placeableMo4993measureBRTryo0.getWidth();
                                    int iMax = Math.max(placeableMo4993measureBRTryo02.getHeight(), placeableMo4993measureBRTryo0.getHeight());
                                    mutableState4.setValue(Float.valueOf(placeableMo4993measureBRTryo0.getWidth()));
                                    mutableState2.setValue(Integer.valueOf(width));
                                    final int width2 = placeableMo4993measureBRTryo0.getWidth() / 2;
                                    final int iRoundToInt = MathKt.roundToInt(placeableMo4993measureBRTryo02.getWidth() * fCalcFraction);
                                    final int height = (iMax - placeableMo4993measureBRTryo02.getHeight()) / 2;
                                    final int height2 = (iMax - placeableMo4993measureBRTryo0.getHeight()) / 2;
                                    return MeasureScope.layout$default(Layout, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$measure$1
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
                                        public final void invoke2(Placeable.PlacementScope layout) {
                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo02, width2, height, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo0, iRoundToInt, height2, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                                Layout = measureScope;
                                j2 = j;
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        Layout = measureScope;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2907L7,75@2962L7,76@3021L7,77@3033L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer2.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density = (Density) objConsume2;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composer2.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume3;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume4 = composer2.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composer2.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(1870435165);
            ComposerKt.sourceInformation(composer2, "C880@37988L84,881@38085L84:Slider.kt#uh7d8r");
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, SliderComponents.THUMB);
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume5 = composer2.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density2 = (Density) objConsume5;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume6 = composer2.consume(localLayoutDirection3);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection2 = (LayoutDirection) objConsume6;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume7 = composer2.consume(localViewConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume7;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierLayoutId);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer2);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composer2.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-1220826601);
            ComposerKt.sourceInformation(composer2, "C880@38048L22:Slider.kt#uh7d8r");
            function33 = function3;
            function33.invoke(sliderPositions, composer2, Integer.valueOf((i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, SliderComponents.TRACK);
            composer2.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume8 = composer2.consume(localDensity3);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Density density3 = (Density) objConsume8;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume9 = composer2.consume(localLayoutDirection4);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LayoutDirection layoutDirection3 = (LayoutDirection) objConsume9;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume10 = composer2.consume(localViewConfiguration3);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) objConsume10;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierLayoutId2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composer2);
            Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composer2.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(971611456);
            ComposerKt.sourceInformation(composer2, "C881@38145L22:Slider.kt#uh7d8r");
            function34 = function32;
            function34.invoke(sliderPositions, composer2, Integer.valueOf(((i6 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            mutableInteractionSource2 = mutableInteractionSource;
            function33 = function3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function35 = function33;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt.SliderImpl.3
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

            public final void invoke(Composer composer3, int i7) {
                SliderKt.SliderImpl(modifier, z2, mutableInteractionSource3, function1, function0, i, f, closedFloatingPointRange, function35, function34, composer3, i2 | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SliderImpl$scaleToUserValue(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
        return scale(f, f2, f3, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SliderImpl$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
        return scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f3, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TempRangeSliderThumb-rAjV9yQ, reason: not valid java name */
    public static final void m2418TempRangeSliderThumbrAjV9yQ(final BoxScope boxScope, float f, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        final float f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2104116536);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TempRangeSliderThumb)P(1:c#ui.unit.Dp)950@40233L133:Slider.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(function3) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2104116536, i2, -1, "androidx.compose.material3.TempRangeSliderThumb (Slider.kt:946)");
            }
            f2 = f;
            Modifier modifierAlign = boxScope.align(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, f2, 0.0f, 0.0f, 0.0f, 14, null), Alignment.INSTANCE.getCenterStart());
            int i3 = (i2 << 3) & 7168;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierAlign);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            function3.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i3 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f2 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$TempRangeSliderThumb$1
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
                SliderKt.m2418TempRangeSliderThumbrAjV9yQ(boxScope, f2, function3, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TempRangeSliderTrack-au3_HiA, reason: not valid java name */
    public static final void m2419TempRangeSliderTrackau3_HiA(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f, final float f2, final float[] fArr, final float f3, final float f4, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1015664062);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TempRangeSliderTrack)P(2!2,4!1,6,5:c#ui.unit.Dp)*972@40747L7,976@40881L35,977@40951L34,978@41021L34,979@41089L33,980@41127L1518:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1015664062, i, -1, "androidx.compose.material3.TempRangeSliderTrack (Slider.kt:960)");
        }
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Density density = (Density) objConsume;
        floatRef.element = density.mo712toPx0680j_4(f3) / 2;
        floatRef2.element = density.mo712toPx0680j_4(TickSize);
        int i2 = ((i >> 6) & 14) | 48 | ((i << 3) & 896);
        final State<Color> stateTrackColor$material3_release = sliderColors.trackColor$material3_release(z, false, composerStartRestartGroup, i2);
        final State<Color> stateTrackColor$material3_release2 = sliderColors.trackColor$material3_release(z, true, composerStartRestartGroup, i2);
        final State<Color> stateTickColor$material3_release = sliderColors.tickColor$material3_release(z, false, composerStartRestartGroup, i2);
        final State<Color> stateTickColor$material3_release2 = sliderColors.tickColor$material3_release(z, true, composerStartRestartGroup, i2);
        CanvasKt.Canvas(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderKt$TempRangeSliderTrack$2
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
            public final void invoke2(DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                boolean z2 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                long jOffset = OffsetKt.Offset(floatRef.element, Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0()));
                long jOffset2 = OffsetKt.Offset(Size.m3485getWidthimpl(Canvas.mo4213getSizeNHjbRc()) - floatRef.element, Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0()));
                long j = jOffset2;
                if (!z2) {
                    jOffset2 = jOffset;
                }
                if (z2) {
                    j = jOffset;
                }
                DrawScope.m4199drawLineNGM6Ib0$default(Canvas, stateTrackColor$material3_release.getValue().m3667unboximpl(), jOffset2, j, f4, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                long j2 = j;
                long j3 = jOffset2;
                DrawScope.m4199drawLineNGM6Ib0$default(Canvas, stateTrackColor$material3_release2.getValue().m3667unboximpl(), OffsetKt.Offset(Offset.m3416getXimpl(jOffset2) + ((Offset.m3416getXimpl(j) - Offset.m3416getXimpl(jOffset2)) * f), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3416getXimpl(jOffset2) + ((Offset.m3416getXimpl(j) - Offset.m3416getXimpl(jOffset2)) * f2), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0())), f4, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                float[] fArr2 = fArr;
                float f5 = f2;
                float f6 = f;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = fArr2.length;
                for (int i3 = 0; i3 < length; i3++) {
                    float f7 = fArr2[i3];
                    Boolean boolValueOf = Boolean.valueOf(f7 > f5 || f7 < f6);
                    Object obj = linkedHashMap.get(boolValueOf);
                    if (obj == null) {
                        obj = (List) new ArrayList();
                        linkedHashMap.put(boolValueOf, obj);
                    }
                    ((List) obj).add(Float.valueOf(f7));
                }
                State<Color> state = stateTickColor$material3_release;
                State<Color> state2 = stateTickColor$material3_release2;
                Ref.FloatRef floatRef3 = floatRef2;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Offset.m3405boximpl(OffsetKt.Offset(Offset.m3416getXimpl(OffsetKt.m3439lerpWko1d7g(j3, j2, ((Number) it.next()).floatValue())), Offset.m3417getYimpl(Canvas.mo4212getCenterF1C5BW0()))));
                    }
                    long j4 = j3;
                    j2 = j2;
                    DrawScope.m4204drawPointsF8ZwMP8$default(Canvas, arrayList, PointMode.INSTANCE.m3963getPointsr_lszbg(), (zBooleanValue ? state : state2).getValue().m3667unboximpl(), floatRef3.element, StrokeCap.INSTANCE.m4011getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    floatRef3 = floatRef3;
                    j3 = j4;
                }
            }
        }, composerStartRestartGroup, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$TempRangeSliderTrack$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                SliderKt.m2419TempRangeSliderTrackau3_HiA(modifier, sliderColors, z, f, f2, fArr, f3, f4, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2423awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        Ref.FloatRef floatRef;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            if ((sliderKt$awaitSlop$1.label & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label -= Integer.MIN_VALUE;
            } else {
                sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
            }
        }
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
        Object obj = sliderKt$awaitSlop$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sliderKt$awaitSlop$12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Float f) {
                    invoke(pointerInputChange, f.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PointerInputChange pointerInput, float f) {
                    Intrinsics.checkNotNullParameter(pointerInput, "pointerInput");
                    pointerInput.consume();
                    floatRef2.element = f;
                }
            };
            sliderKt$awaitSlop$12.L$0 = floatRef2;
            sliderKt$awaitSlop$12.label = 1;
            Object objM2267awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m2267awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$12);
            if (objM2267awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM2267awaitHorizontalPointerSlopOrCancellationgDDlDlE;
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) sliderKt$awaitSlop$12.L$0;
            ResultKt.throwOnFailure(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i2 = i + 2;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = i3 / (i + 1);
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> scale(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f3, float f4) {
        return RangesKt.rangeTo(scale(f, f2, closedFloatingPointRange.getStart().floatValue(), f3, f4), scale(f, f2, closedFloatingPointRange.getEndInclusive().floatValue(), f3, f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f, boolean z, Function1 function1, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        Function0 function02 = function0;
        if ((i2 & 16) != 0) {
            closedFloatingPointRange = RangesKt.rangeTo(0.0f, 1.0f);
        }
        ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        return sliderSemantics(modifier, f, z, function1, function02, closedFloatingPointRange2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f, final boolean z, final Function1<? super Float, Unit> function1, final Function0<Unit> function0, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final int i) {
        final float fCoerceIn = RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (!z) {
                    SemanticsPropertiesKt.disabled(semantics);
                }
                final ClosedFloatingPointRange<Float> closedFloatingPointRange2 = closedFloatingPointRange;
                final int i2 = i;
                final float f2 = fCoerceIn;
                final Function1<Float, Unit> function12 = function1;
                final Function0<Unit> function02 = function0;
                SemanticsPropertiesKt.setProgress$default(semantics, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt.sliderSemantics.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f3) {
                        return invoke(f3.floatValue());
                    }

                    public final Boolean invoke(float f3) {
                        int i3;
                        float fCoerceIn2 = RangesKt.coerceIn(f3, closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                        int i4 = i2;
                        boolean z2 = false;
                        if (i4 > 0 && (i3 = i4 + 1) >= 0) {
                            float fAbs = fCoerceIn2;
                            float f4 = fAbs;
                            int i5 = 0;
                            while (true) {
                                float fLerp = MathHelpersKt.lerp(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), i5 / (i2 + 1));
                                float f5 = fLerp - fCoerceIn2;
                                if (Math.abs(f5) <= fAbs) {
                                    fAbs = Math.abs(f5);
                                    f4 = fLerp;
                                }
                                if (i5 == i3) {
                                    break;
                                }
                                i5++;
                            }
                            fCoerceIn2 = f4;
                        }
                        if (fCoerceIn2 != f2) {
                            function12.invoke(Float.valueOf(fCoerceIn2));
                            Function0<Unit> function03 = function02;
                            if (function03 != null) {
                                function03.invoke();
                            }
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null), f, closedFloatingPointRange, i);
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {1174}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.SliderKt$animateToTarget$2, reason: invalid class name and case insensitive filesystem */
    static final class C05632 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05632(float f, float f2, float f3, Continuation<? super C05632> continuation) {
            super(2, continuation);
            this.$current = f;
            this.$target = f2;
            this.$velocity = f3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C05632 c05632 = new C05632(this.$current, this.$target, this.$velocity, continuation);
            c05632.L$0 = obj;
            return c05632;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
            return ((C05632) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                floatRef.element = this.$current;
                this.label = 1;
                if (AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null).animateTo(Boxing.boxFloat(this.$target), SliderKt.SliderToTickAnimation, Boxing.boxFloat(this.$velocity), new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.SliderKt.animateToTarget.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                        invoke2(animatable);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Animatable<Float, AnimationVector1D> animateTo) {
                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                        dragScope.dragBy(animateTo.getValue().floatValue() - floatRef.element);
                        floatRef.element = animateTo.getValue().floatValue();
                    }
                }, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, Continuation<? super Unit> continuation) {
        Object objDrag$default = DraggableState.drag$default(draggableState, null, new C05632(f, f2, f3, null), continuation, 1, null);
        return objDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDrag$default : Unit.INSTANCE;
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {1202}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableInteractionSource $endInteractionSource;
        final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        final /* synthetic */ MutableInteractionSource $startInteractionSource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends Function2<? super Boolean, ? super Float, Unit>> state3, boolean z, float f, State<? extends Function1<? super Boolean, Unit>> state4, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$startInteractionSource = mutableInteractionSource;
            this.$endInteractionSource = mutableInteractionSource2;
            this.$rawOffsetStart = state;
            this.$rawOffsetEnd = state2;
            this.$onDrag = state3;
            this.$isRtl = z;
            this.$maxPx = f;
            this.$gestureEndAction = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                RangeSliderLogic rangeSliderLogic = new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(new C01081(pointerInputScope, this.$isRtl, this.$maxPx, rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
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

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {1203}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01081(PointerInputScope pointerInputScope, boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C01081> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$isRtl = z;
                this.$maxPx = f;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01081 c01081 = new C01081(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                c01081.L$0 = obj;
                return c01081;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {}, l = {1204}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01091 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                final /* synthetic */ State<Float> $rawOffsetEnd;
                final /* synthetic */ State<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C01091(boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C01091> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$rawOffsetStart = state;
                    this.$$this$coroutineScope = coroutineScope;
                    this.$gestureEndAction = state2;
                    this.$rawOffsetEnd = state3;
                    this.$onDrag = state4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C01091 c01091 = new C01091(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                    c01091.L$0 = obj;
                    return c01091;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((C01091) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1", f = "Slider.kt", i = {0, 1, 1, 1, 1, 1, 2, 2}, l = {1205, 1215, 1234}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "event", "interaction", "posX", "draggingStart", "interaction", "draggingStart"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
                /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C01101 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CoroutineScope $$this$coroutineScope;
                    final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ State<Function2<Boolean, Float, Unit>> $onDrag;
                    final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    final /* synthetic */ State<Float> $rawOffsetEnd;
                    final /* synthetic */ State<Float> $rawOffsetStart;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C01101(boolean z, float f, RangeSliderLogic rangeSliderLogic, State<Float> state, CoroutineScope coroutineScope, State<? extends Function1<? super Boolean, Unit>> state2, State<Float> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4, Continuation<? super C01101> continuation) {
                        super(2, continuation);
                        this.$isRtl = z;
                        this.$maxPx = f;
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$rawOffsetStart = state;
                        this.$$this$coroutineScope = coroutineScope;
                        this.$gestureEndAction = state2;
                        this.$rawOffsetEnd = state3;
                        this.$onDrag = state4;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C01101 c01101 = new C01101(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, continuation);
                        c01101.L$0 = obj;
                        return c01101;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                        return ((C01101) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x018a A[Catch: CancellationException -> 0x019c, TryCatch #0 {CancellationException -> 0x019c, blocks: (B:8:0x001d, B:54:0x0182, B:56:0x018a, B:57:0x0192), top: B:64:0x001d }] */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0192 A[Catch: CancellationException -> 0x019c, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x019c, blocks: (B:8:0x001d, B:54:0x0182, B:56:0x018a, B:57:0x0192), top: B:64:0x001d }] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        AwaitPointerEventScope awaitPointerEventScope;
                        Object objAwaitFirstDown;
                        Object objM2423awaitSlop8vUncbI;
                        AwaitPointerEventScope awaitPointerEventScope2;
                        PointerInputChange pointerInputChange;
                        Ref.FloatRef floatRef;
                        DragInteraction.Start start;
                        final Ref.BooleanRef booleanRef;
                        Pair pair;
                        Ref.BooleanRef booleanRef2;
                        DragInteraction.Start start2;
                        Object objM762horizontalDragjO51t88;
                        DragInteraction.Cancel cancel;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            this.L$0 = awaitPointerEventScope;
                            this.label = 1;
                            objAwaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, this);
                            if (objAwaitFirstDown != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    booleanRef2 = (Ref.BooleanRef) this.L$1;
                                    start2 = (DragInteraction.Start) this.L$0;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        objM762horizontalDragjO51t88 = obj;
                                        if (!((Boolean) objM762horizontalDragjO51t88).booleanValue()) {
                                            cancel = new DragInteraction.Stop(start2);
                                        } else {
                                            cancel = new DragInteraction.Cancel(start2);
                                        }
                                    } catch (CancellationException unused) {
                                        cancel = new DragInteraction.Cancel(start2);
                                        this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                        return Unit.INSTANCE;
                                    }
                                    this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            booleanRef = (Ref.BooleanRef) this.L$4;
                            Ref.FloatRef floatRef2 = (Ref.FloatRef) this.L$3;
                            start = (DragInteraction.Start) this.L$2;
                            PointerInputChange pointerInputChange2 = (PointerInputChange) this.L$1;
                            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            pointerInputChange = pointerInputChange2;
                            floatRef = floatRef2;
                            objM2423awaitSlop8vUncbI = obj;
                            pair = (Pair) objM2423awaitSlop8vUncbI;
                            if (pair != null) {
                                State<Float> state = this.$rawOffsetEnd;
                                State<Float> state2 = this.$rawOffsetStart;
                                boolean z = this.$isRtl;
                                float fM2270pointerSlopE8SPZFQ = DragGestureDetectorCopyKt.m2270pointerSlopE8SPZFQ(awaitPointerEventScope2.getViewConfiguration(), pointerInputChange.getType());
                                if (Math.abs(state.getValue().floatValue() - floatRef.element) < fM2270pointerSlopE8SPZFQ && Math.abs(state2.getValue().floatValue() - floatRef.element) < fM2270pointerSlopE8SPZFQ) {
                                    float fFloatValue = ((Number) pair.getSecond()).floatValue();
                                    booleanRef.element = !z ? fFloatValue >= 0.0f : fFloatValue < 0.0f;
                                    floatRef.element += Offset.m3416getXimpl(PointerEventKt.positionChange((PointerInputChange) pair.getFirst()));
                                }
                            }
                            this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                            try {
                                long id = pointerInputChange.getId();
                                final State<Function2<Boolean, Float, Unit>> state3 = this.$onDrag;
                                final boolean z2 = this.$isRtl;
                                this.L$0 = start;
                                this.L$1 = booleanRef;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                objM762horizontalDragjO51t88 = DragGestureDetectorKt.m762horizontalDragjO51t88(awaitPointerEventScope2, id, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange3) {
                                        invoke2(pointerInputChange3);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(PointerInputChange it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        float fM3416getXimpl = Offset.m3416getXimpl(PointerEventKt.positionChange(it));
                                        Function2<Boolean, Float, Unit> value = state3.getValue();
                                        Boolean boolValueOf = Boolean.valueOf(booleanRef.element);
                                        if (z2) {
                                            fM3416getXimpl = -fM3416getXimpl;
                                        }
                                        value.invoke(boolValueOf, Float.valueOf(fM3416getXimpl));
                                    }
                                }, this);
                            } catch (CancellationException unused2) {
                                booleanRef2 = booleanRef;
                                start2 = start;
                                cancel = new DragInteraction.Cancel(start2);
                                this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            }
                            if (objM762horizontalDragjO51t88 != coroutine_suspended) {
                                booleanRef2 = booleanRef;
                                start2 = start;
                                if (!((Boolean) objM762horizontalDragjO51t88).booleanValue()) {
                                }
                                this.$gestureEndAction.getValue().invoke(Boxing.boxBoolean(booleanRef2.element));
                                BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$rangeSliderLogic, booleanRef2, cancel, null), 3, null);
                                return Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objAwaitFirstDown = obj;
                        AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope;
                        PointerInputChange pointerInputChange3 = (PointerInputChange) objAwaitFirstDown;
                        DragInteraction.Start start3 = new DragInteraction.Start();
                        Ref.FloatRef floatRef3 = new Ref.FloatRef();
                        floatRef3.element = this.$isRtl ? this.$maxPx - Offset.m3416getXimpl(pointerInputChange3.getPosition()) : Offset.m3416getXimpl(pointerInputChange3.getPosition());
                        int iCompareOffsets = this.$rangeSliderLogic.compareOffsets(floatRef3.element);
                        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                        booleanRef3.element = iCompareOffsets == 0 ? this.$rawOffsetStart.getValue().floatValue() > floatRef3.element : iCompareOffsets < 0;
                        this.L$0 = awaitPointerEventScope4;
                        this.L$1 = pointerInputChange3;
                        this.L$2 = start3;
                        this.L$3 = floatRef3;
                        this.L$4 = booleanRef3;
                        this.label = 2;
                        objM2423awaitSlop8vUncbI = SliderKt.m2423awaitSlop8vUncbI(awaitPointerEventScope4, pointerInputChange3.getId(), pointerInputChange3.getType(), this);
                        if (objM2423awaitSlop8vUncbI != coroutine_suspended) {
                            awaitPointerEventScope2 = awaitPointerEventScope4;
                            pointerInputChange = pointerInputChange3;
                            floatRef = floatRef3;
                            start = start3;
                            booleanRef = booleanRef3;
                            pair = (Pair) objM2423awaitSlop8vUncbI;
                            if (pair != null) {
                            }
                            this.$rangeSliderLogic.captureThumb(booleanRef.element, floatRef.element, start, this.$$this$coroutineScope);
                            long id2 = pointerInputChange.getId();
                            final State<? extends Function2<? super Boolean, ? super Float, Unit>> state32 = this.$onDrag;
                            final boolean z22 = this.$isRtl;
                            this.L$0 = start;
                            this.L$1 = booleanRef;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 3;
                            objM762horizontalDragjO51t88 = DragGestureDetectorKt.m762horizontalDragjO51t88(awaitPointerEventScope2, id2, new Function1<PointerInputChange, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange32) {
                                    invoke2(pointerInputChange32);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PointerInputChange it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    float fM3416getXimpl = Offset.m3416getXimpl(PointerEventKt.positionChange(it));
                                    Function2<Boolean, Float, Unit> value = state32.getValue();
                                    Boolean boolValueOf = Boolean.valueOf(booleanRef.element);
                                    if (z22) {
                                        fM3416getXimpl = -fM3416getXimpl;
                                    }
                                    value.invoke(boolValueOf, Float.valueOf(fM3416getXimpl));
                                }
                            }, this);
                            if (objM762horizontalDragjO51t88 != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }

                    /* compiled from: Slider.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2", f = "Slider.kt", i = {}, l = {1251}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Ref.BooleanRef $draggingStart;
                        final /* synthetic */ DragInteraction $finishInteraction;
                        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, DragInteraction dragInteraction, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$rangeSliderLogic = rangeSliderLogic;
                            this.$draggingStart = booleanRef;
                            this.$finishInteraction = dragInteraction;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element).emit(this.$finishInteraction, this) == coroutine_suspended) {
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
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (((PointerInputScope) this.L$0).awaitPointerEventScope(new C01101(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
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

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    this.label = 1;
                    if (ForEachGestureKt.forEachGesture(this.$$this$pointerInput, new C01091(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null), this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z, boolean z2, float f, ClosedFloatingPointRange<Float> closedFloatingPointRange, State<? extends Function1<? super Boolean, Unit>> state3, State<? extends Function2<? super Boolean, ? super Float, Unit>> state4) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, f, state3, null)) : modifier;
    }

    static {
        float fM3011getHandleWidthD9Ej5fM = SliderTokens.INSTANCE.m3011getHandleWidthD9Ej5fM();
        ThumbWidth = fM3011getHandleWidthD9Ej5fM;
        float fM3010getHandleHeightD9Ej5fM = SliderTokens.INSTANCE.m3010getHandleHeightD9Ej5fM();
        ThumbHeight = fM3010getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m6139DpSizeYgX7TsA(fM3011getHandleWidthD9Ej5fM, fM3010getHandleHeightD9Ej5fM);
        ThumbDefaultElevation = Dp.m6117constructorimpl(1);
        ThumbPressedElevation = Dp.m6117constructorimpl(6);
        TickSize = SliderTokens.INSTANCE.m3017getTickMarksContainerSizeD9Ej5fM();
        TrackHeight = SliderTokens.INSTANCE.m3012getInactiveTrackHeightD9Ej5fM();
        float fM6117constructorimpl = Dp.m6117constructorimpl(48);
        SliderHeight = fM6117constructorimpl;
        float fM6117constructorimpl2 = Dp.m6117constructorimpl(144);
        SliderMinWidth = fM6117constructorimpl2;
        DefaultSliderConstraints = SizeKt.m1053heightInVpY3zN4$default(SizeKt.m1072widthInVpY3zN4$default(Modifier.INSTANCE, fM6117constructorimpl2, 0.0f, 2, null), 0.0f, fM6117constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    public static final float snapValueToTick(float f, float[] fArr, float f2, float f3) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f4 = fArr[0];
            int lastIndex = ArraysKt.getLastIndex(fArr);
            if (lastIndex != 0) {
                float fAbs = Math.abs(MathHelpersKt.lerp(f2, f3, f4) - f);
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    float f5 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f5) - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f4 = f5;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f4);
            } else {
                fValueOf = Float.valueOf(f4);
            }
        }
        return fValueOf != null ? MathHelpersKt.lerp(f2, f3, fValueOf.floatValue()) : f;
    }

    private static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final int i, final boolean z, final State<Float> state, final State<? extends Function0<Unit>> state2, final MutableState<Float> mutableState, final boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("sliderTapModifier");
                inspectorInfo.getProperties().set("draggableState", draggableState);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Integer.valueOf(i));
                inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set(ViewProps.ENABLED, Boolean.valueOf(z2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(2040469710);
                ComposerKt.sourceInformation(composer, "C1126@46364L24:Slider.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2040469710, i2, -1, "androidx.compose.material3.sliderTapModifier.<anonymous> (Slider.kt:1124)");
                }
                if (z2) {
                    composer.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(composer, "C(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
                    composer.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composer.endReplaceableGroup();
                    composed = SuspendingPointerInputFilterKt.pointerInput(composed, new Object[]{draggableState, mutableInteractionSource, Integer.valueOf(i), Boolean.valueOf(z)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(z, i, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return composed;
            }

            /* compiled from: Slider.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", i = {}, l = {1129}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ int $maxPx;
                final /* synthetic */ MutableState<Float> $pressOffset;
                final /* synthetic */ State<Float> $rawOffset;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(boolean z, int i, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function0<Unit>> state2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = i;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = coroutineScope;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", i = {}, l = {1134}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C01121 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ int $maxPx;
                    final /* synthetic */ MutableState<Float> $pressOffset;
                    final /* synthetic */ State<Float> $rawOffset;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01121(boolean z, int i, MutableState<Float> mutableState, State<Float> state, Continuation<? super C01121> continuation) {
                        super(3, continuation);
                        this.$isRtl = z;
                        this.$maxPx = i;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                        return m2424invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
                    }

                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m2424invoked4ec7I(PressGestureScope pressGestureScope, long j, Continuation<? super Unit> continuation) {
                        C01121 c01121 = new C01121(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, continuation);
                        c01121.L$0 = pressGestureScope;
                        c01121.J$0 = j;
                        return c01121.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        try {
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j = this.J$0;
                                this.$pressOffset.setValue(Boxing.boxFloat((this.$isRtl ? this.$maxPx - Offset.m3416getXimpl(j) : Offset.m3416getXimpl(j)) - this.$rawOffset.getValue().floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.$pressOffset.setValue(Boxing.boxFloat(0.0f));
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C01121 c01121 = new C01121(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final CoroutineScope coroutineScope = this.$scope;
                        final DraggableState draggableState = this.$draggableState;
                        final State<Function0<Unit>> state = this.$gestureEndAction;
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c01121, new Function1<Offset, Unit>() { // from class: androidx.compose.material3.SliderKt.sliderTapModifier.2.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                m2425invokek4lQ0M(offset.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m2425invokek4lQ0M(long j) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C01141(draggableState, state, null), 3, null);
                            }

                            /* compiled from: Slider.kt */
                            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", i = {}, l = {1141}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            static final class C01141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ DraggableState $draggableState;
                                final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                C01141(DraggableState draggableState, State<? extends Function0<Unit>> state, Continuation<? super C01141> continuation) {
                                    super(2, continuation);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C01141(this.$draggableState, this.$gestureEndAction, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C01141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* compiled from: Slider.kt */
                                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C01151 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    C01151(Continuation<? super C01151> continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        C01151 c01151 = new C01151(continuation);
                                        c01151.L$0 = obj;
                                        return c01151;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
                                        return ((C01151) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                        ((DragScope) this.L$0).dragBy(0.0f);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$draggableState.drag(MutatePriority.UserInput, new C01151(null), this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    this.$gestureEndAction.getValue().invoke();
                                    return Unit.INSTANCE;
                                }
                            }
                        }, this, 3, null) == coroutine_suspended) {
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
        });
    }
}
