package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0086\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001ao\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u007f\u0010(\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u007f\u00100\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u007f\u00101\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u0085\u0001\u00102\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0003¢\u0006\u0002\u00107\u001a\u007f\u00108\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a\u007f\u00109\u001a\u00020\u00112\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u0007¢\u0006\u0002\u0010/\u001a¦\u0001\u0010:\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u0002042\u0006\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u0002062\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u0015H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a¸\u0001\u0010J\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u0002042\u0006\u0010E\u001a\u00020\u00012\u0011\u0010K\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010L\u001a\u0002042\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\u0006\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\u0010-\u001a\u0004\u0018\u00010.H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a+\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020<2\b\b\u0002\u0010T\u001a\u00020<2\b\b\u0002\u0010U\u001a\u00020<H\u0007¢\u0006\u0002\u0010V\u001aD\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020R2\u0006\u0010Z\u001a\u00020<2\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\\2\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010^H\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010_\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0003\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u000b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"BottomAppBarHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "LargeTitleBottomPadding", "MediumTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "BottomAppBar", "", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "floatingActionButton", "Lkotlin/Function0;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", UriUtil.LOCAL_CONTENT_SCHEME, "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "CenterAlignedTopAppBar", "title", "navigationIcon", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/TopAppBarColors;", "scrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "LargeTopAppBar", "MediumTopAppBar", "SingleRowTopAppBar", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "centeredTitle", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "SmallTopAppBar", "TopAppBar", "TopAppBarLayout", "heightPx", "", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleBottomPadding", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TwoRowsTopAppBar", "smallTitle", "smallTitleTextStyle", ViewProps.MAX_HEIGHT, "pinnedHeight", "TwoRowsTopAppBar-tjU4iQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;FFLandroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "rememberTopAppBarState", "Landroidx/compose/material3/TopAppBarState;", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "settleAppBar", "Landroidx/compose/ui/unit/Velocity;", ServerProtocol.DIALOG_PARAM_STATE, "velocity", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    /* compiled from: AppBar.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", i = {0, 0, 0, 1}, l = {1577, 1593}, m = "settleAppBar", n = {ServerProtocol.DIALOG_PARAM_STATE, "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBar$1, reason: invalid class name and case insensitive filesystem */
    static final class C05201 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C05201(Continuation<? super C05201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.settleAppBar(null, 0.0f, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopAppBar(final Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M2236getLambda1$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M2240getLambda2$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(1906353009);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TopAppBar)P(5,2,3!1,6)124@6214L12,125@6276L22,131@6471L10,128@6360L374:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    function2M2236getLambda1$material3_release = function2;
                    i3 |= composerStartRestartGroup.changed(function2M2236getLambda1$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        function3M2240getLambda2$material3_release = function3;
                        i3 |= composerStartRestartGroup.changed(function3M2240getLambda2$material3_release) ? 2048 : 1024;
                    }
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i8 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i8;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i8;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsM2605smallTopAppBarColorszjMxDiM = topAppBarColors;
                            int i9 = composerStartRestartGroup.changed(topAppBarColorsM2605smallTopAppBarColorszjMxDiM) ? 131072 : 65536;
                            i3 |= i9;
                        } else {
                            topAppBarColorsM2605smallTopAppBarColorszjMxDiM = topAppBarColors;
                        }
                        i3 |= i9;
                    } else {
                        topAppBarColorsM2605smallTopAppBarColorszjMxDiM = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((i & 3670016) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M2236getLambda1$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2236getLambda1$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M2240getLambda2$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2240getLambda2$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColorsM2605smallTopAppBarColorszjMxDiM = TopAppBarDefaults.INSTANCE.m2605smallTopAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if (i6 == 0) {
                                    function32 = function3M2240getLambda2$material3_release;
                                    topAppBarColors2 = topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
                                    topAppBarScrollBehavior3 = null;
                                    function22 = function2M2236getLambda1$material3_release;
                                    windowInsets3 = windowInsets2;
                                } else {
                                    function22 = function2M2236getLambda1$material3_release;
                                    function32 = function3M2240getLambda2$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                companion = modifier2;
                                function22 = function2M2236getLambda1$material3_release;
                                function32 = function3M2240getLambda2$material3_release;
                                windowInsets3 = windowInsets2;
                                topAppBarColors2 = topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1906353009, i3, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:119)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont());
                            int i10 = i3 << 6;
                            int i11 = (i10 & 234881024) | (i10 & 57344) | ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i10 & 458752) | (i10 & 3670016) | (29360128 & i10);
                            Modifier modifier4 = companion;
                            SingleRowTopAppBar(modifier4, title, textStyleFromToken, false, function22, function32, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composerStartRestartGroup, i11, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            function23 = function22;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function23 = function2M2236getLambda1$material3_release;
                            function33 = function3M2240getLambda2$material3_release;
                            windowInsets4 = windowInsets2;
                            topAppBarColors3 = topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.TopAppBar.1
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

                            public final void invoke(Composer composer2, int i12) {
                                AppBarKt.TopAppBar(title, modifier3, function23, function33, windowInsets4, topAppBarColors3, topAppBarScrollBehavior4, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((2995931 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont());
                            int i102 = i3 << 6;
                            int i112 = (i102 & 234881024) | (i102 & 57344) | ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i102 & 458752) | (i102 & 3670016) | (29360128 & i102);
                            Modifier modifier42 = companion;
                            SingleRowTopAppBar(modifier42, title, textStyleFromToken2, false, function22, function32, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composerStartRestartGroup, i112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            function23 = function22;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function3M2240getLambda2$material3_release = function3;
                if ((i & 57344) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((2995931 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function2M2236getLambda1$material3_release = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2240getLambda2$material3_release = function3;
            if ((i & 57344) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((2995931 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2236getLambda1$material3_release = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2240getLambda2$material3_release = function3;
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((2995931 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use TopAppBar instead.", replaceWith = @ReplaceWith(expression = "TopAppBar(title, modifier, navigationIcon, actions, windowInsets, colors, scrollBehavior)", imports = {}))
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SmallTopAppBar(final Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M2241getLambda3$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M2242getLambda4$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier.Companion companion;
        WindowInsets windowInsets3;
        Composer composer2;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function22;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        final TopAppBarColors topAppBarColors3;
        final WindowInsets windowInsets4;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1967617284);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SmallTopAppBar)P(5,2,3!1,6)187@9203L12,188@9265L22,190@9345L89:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    function2M2241getLambda3$material3_release = function2;
                    i3 |= composerStartRestartGroup.changed(function2M2241getLambda3$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        function3M2242getLambda4$material3_release = function3;
                        i3 |= composerStartRestartGroup.changed(function3M2242getLambda4$material3_release) ? 2048 : 1024;
                    }
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsM2605smallTopAppBarColorszjMxDiM = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColorsM2605smallTopAppBarColorszjMxDiM) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColorsM2605smallTopAppBarColorszjMxDiM = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColorsM2605smallTopAppBarColorszjMxDiM = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((3670016 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function23 = function2M2241getLambda3$material3_release;
                            composer2 = composerStartRestartGroup;
                            function32 = function3M2242getLambda4$material3_release;
                            windowInsets4 = windowInsets2;
                            topAppBarColors3 = topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M2241getLambda3$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2241getLambda3$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M2242getLambda4$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2242getLambda4$material3_release();
                                }
                                if ((i2 & 16) == 0) {
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    windowInsets3 = windowInsets2;
                                }
                                if ((i2 & 32) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    i3 &= -458753;
                                    topAppBarColorsM2605smallTopAppBarColorszjMxDiM = TopAppBarDefaults.INSTANCE.m2605smallTopAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                }
                                if (i6 == 0) {
                                    i7 = i3;
                                    function22 = function2M2241getLambda3$material3_release;
                                    topAppBarScrollBehavior3 = null;
                                    topAppBarColors2 = topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
                                } else {
                                    i7 = i3;
                                    function22 = function2M2241getLambda3$material3_release;
                                    topAppBarColors2 = topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                companion = modifier2;
                                composer2 = composerStartRestartGroup;
                                windowInsets3 = windowInsets2;
                                topAppBarColors2 = topAppBarColorsM2605smallTopAppBarColorszjMxDiM;
                                i7 = i3;
                                function22 = function2M2241getLambda3$material3_release;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1967617284, i7, -1, "androidx.compose.material3.SmallTopAppBar (AppBar.kt:182)");
                            }
                            Modifier modifier4 = companion;
                            Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = function3M2242getLambda4$material3_release;
                            TopAppBar(title, modifier4, function22, function33, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, i7 & 4194302, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors3 = topAppBarColors2;
                            windowInsets4 = windowInsets3;
                            function32 = function33;
                            function23 = function22;
                            modifier3 = modifier4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.SmallTopAppBar.1
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

                            public final void invoke(Composer composer3, int i11) {
                                AppBarKt.SmallTopAppBar(title, modifier3, function23, function32, windowInsets4, topAppBarColors3, topAppBarScrollBehavior4, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((2995931 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 16) == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifier42 = companion;
                            Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332 = function3M2242getLambda4$material3_release;
                            TopAppBar(title, modifier42, function22, function332, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, i7 & 4194302, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors3 = topAppBarColors2;
                            windowInsets4 = windowInsets3;
                            function32 = function332;
                            function23 = function22;
                            modifier3 = modifier42;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function3M2242getLambda4$material3_release = function3;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((2995931 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function2M2241getLambda3$material3_release = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2242getLambda4$material3_release = function3;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((2995931 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2241getLambda3$material3_release = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2242getLambda4$material3_release = function3;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((2995931 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CenterAlignedTopAppBar(final Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M2243getLambda5$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M2244getLambda6$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2139286460);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CenterAlignedTopAppBar)P(5,2,3!1,6)228@11627L12,229@11689L30,236@11900L10,232@11781L381:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    function2M2243getLambda5$material3_release = function2;
                    i3 |= composerStartRestartGroup.changed(function2M2243getLambda5$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        function3M2244getLambda6$material3_release = function3;
                        i3 |= composerStartRestartGroup.changed(function3M2244getLambda6$material3_release) ? 2048 : 1024;
                    }
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i8 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i8;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i8;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM = topAppBarColors;
                            int i9 = composerStartRestartGroup.changed(topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM) ? 131072 : 65536;
                            i3 |= i9;
                        } else {
                            topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM = topAppBarColors;
                        }
                        i3 |= i9;
                    } else {
                        topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((i & 3670016) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M2243getLambda5$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2243getLambda5$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M2244getLambda6$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2244getLambda6$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM = TopAppBarDefaults.INSTANCE.m2602centerAlignedTopAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                }
                                if (i6 == 0) {
                                    function32 = function3M2244getLambda6$material3_release;
                                    topAppBarColors2 = topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM;
                                    topAppBarScrollBehavior3 = null;
                                    function22 = function2M2243getLambda5$material3_release;
                                    windowInsets3 = windowInsets2;
                                } else {
                                    function22 = function2M2243getLambda5$material3_release;
                                    function32 = function3M2244getLambda6$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                companion = modifier2;
                                function22 = function2M2243getLambda5$material3_release;
                                function32 = function3M2244getLambda6$material3_release;
                                windowInsets3 = windowInsets2;
                                topAppBarColors2 = topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2139286460, i3, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:223)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont());
                            int i10 = i3 << 6;
                            int i11 = (i10 & 234881024) | (i10 & 57344) | ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i10 & 458752) | (i10 & 3670016) | (29360128 & i10);
                            Modifier modifier4 = companion;
                            SingleRowTopAppBar(modifier4, title, textStyleFromToken, true, function22, function32, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composerStartRestartGroup, i11, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            function23 = function22;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function23 = function2M2243getLambda5$material3_release;
                            function33 = function3M2244getLambda6$material3_release;
                            windowInsets4 = windowInsets2;
                            topAppBarColors3 = topAppBarColorsM2602centerAlignedTopAppBarColorszjMxDiM;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar.1
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

                            public final void invoke(Composer composer2, int i12) {
                                AppBarKt.CenterAlignedTopAppBar(title, modifier3, function23, function33, windowInsets4, topAppBarColors3, topAppBarScrollBehavior4, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((2995931 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont());
                            int i102 = i3 << 6;
                            int i112 = (i102 & 234881024) | (i102 & 57344) | ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i102 & 458752) | (i102 & 3670016) | (29360128 & i102);
                            Modifier modifier42 = companion;
                            SingleRowTopAppBar(modifier42, title, textStyleFromToken2, true, function22, function32, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composerStartRestartGroup, i112, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            function23 = function22;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function3M2244getLambda6$material3_release = function3;
                if ((i & 57344) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((2995931 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function2M2243getLambda5$material3_release = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2244getLambda6$material3_release = function3;
            if ((i & 57344) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((2995931 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2243getLambda5$material3_release = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2244getLambda6$material3_release = function3;
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((2995931 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MediumTopAppBar(final Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsM2604mediumTopAppBarColorszjMxDiM;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        WindowInsets windowInsets3;
        Composer composer2;
        TopAppBarColors topAppBarColors2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        WindowInsets windowInsets4;
        Composer composer3;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        final WindowInsets windowInsets5;
        final TopAppBarColors topAppBarColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(1805417862);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MediumTopAppBar)P(5,2,3!1,6)283@14480L12,284@14542L23,290@14736L10,291@14838L10,287@14627L646:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changed(function22) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        function32 = function3;
                        i3 |= composerStartRestartGroup.changed(function32) ? 2048 : 1024;
                    }
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i8 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i8;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i8;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsM2604mediumTopAppBarColorszjMxDiM = topAppBarColors;
                            int i9 = composerStartRestartGroup.changed(topAppBarColorsM2604mediumTopAppBarColorszjMxDiM) ? 131072 : 65536;
                            i3 |= i9;
                        } else {
                            topAppBarColorsM2604mediumTopAppBarColorszjMxDiM = topAppBarColors;
                        }
                        i3 |= i9;
                    } else {
                        topAppBarColorsM2604mediumTopAppBarColorszjMxDiM = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((i & 3670016) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                Function2<? super Composer, ? super Integer, Unit> function2M2245getLambda7$material3_release = i4 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m2245getLambda7$material3_release() : function22;
                                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M2246getLambda8$material3_release = i5 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m2246getLambda8$material3_release() : function32;
                                if ((i2 & 16) == 0) {
                                    i3 &= -57345;
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                } else {
                                    windowInsets3 = windowInsets2;
                                }
                                int i10 = i3;
                                if ((i2 & 32) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    topAppBarColorsM2604mediumTopAppBarColorszjMxDiM = TopAppBarDefaults.INSTANCE.m2604mediumTopAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i3 = i10 & (-458753);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    i3 = i10;
                                }
                                topAppBarScrollBehavior2 = i6 == 0 ? null : topAppBarScrollBehavior;
                                topAppBarColors2 = topAppBarColorsM2604mediumTopAppBarColorszjMxDiM;
                                function23 = function2M2245getLambda7$material3_release;
                                function33 = function3M2246getLambda8$material3_release;
                                windowInsets4 = windowInsets3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier3 = modifier2;
                                function23 = function22;
                                function33 = function32;
                                windowInsets4 = windowInsets2;
                                topAppBarColors2 = topAppBarColorsM2604mediumTopAppBarColorszjMxDiM;
                                composer2 = composerStartRestartGroup;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1805417862, i3, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:278)");
                            }
                            int i11 = i3;
                            int i12 = i11 << 12;
                            Composer composer4 = composer2;
                            Modifier modifier5 = modifier3;
                            m2125TwoRowsTopAppBartjU4iQQ(modifier5, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TopAppBarMediumTokens.INSTANCE.getHeadlineFont()), MediumTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), function23, function33, windowInsets4, topAppBarColors2, TopAppBarMediumTokens.INSTANCE.m3054getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m3064getContainerHeightD9Ej5fM(), topAppBarScrollBehavior2, composer4, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i12 & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), ((i11 >> 12) & 896) | 54, 0);
                            composer3 = composer4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            function24 = function23;
                            function34 = function33;
                            windowInsets5 = windowInsets4;
                            topAppBarColors3 = topAppBarColors2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            function24 = function22;
                            function34 = function32;
                            windowInsets5 = windowInsets2;
                            topAppBarColors3 = topAppBarColorsM2604mediumTopAppBarColorszjMxDiM;
                            composer3 = composerStartRestartGroup;
                        }
                        final TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.MediumTopAppBar.1
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
                                AppBarKt.MediumTopAppBar(title, modifier4, function24, function34, windowInsets5, topAppBarColors3, topAppBarScrollBehavior3, composer5, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((2995931 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i2 & 16) == 0) {
                            }
                            int i102 = i3;
                            if ((i2 & 32) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            topAppBarColors2 = topAppBarColorsM2604mediumTopAppBarColorszjMxDiM;
                            function23 = function2M2245getLambda7$material3_release;
                            function33 = function3M2246getLambda8$material3_release;
                            windowInsets4 = windowInsets3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = i3;
                            int i122 = i112 << 12;
                            Composer composer42 = composer2;
                            Modifier modifier52 = modifier3;
                            m2125TwoRowsTopAppBartjU4iQQ(modifier52, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TopAppBarMediumTokens.INSTANCE.getHeadlineFont()), MediumTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), function23, function33, windowInsets4, topAppBarColors2, TopAppBarMediumTokens.INSTANCE.m3054getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m3064getContainerHeightD9Ej5fM(), topAppBarScrollBehavior2, composer42, ((i112 >> 3) & 14) | 3072 | ((i112 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i122 & 57344) | (i122 & 3670016) | (i122 & 29360128) | (i122 & 234881024) | (i122 & 1879048192), ((i112 >> 12) & 896) | 54, 0);
                            composer3 = composer42;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier52;
                            function24 = function23;
                            function34 = function33;
                            windowInsets5 = windowInsets4;
                            topAppBarColors3 = topAppBarColors2;
                        }
                    }
                    final TopAppBarScrollBehavior topAppBarScrollBehavior32 = topAppBarScrollBehavior2;
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function32 = function3;
                if ((i & 57344) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((2995931 & i3) != 599186) {
                }
                final TopAppBarScrollBehavior topAppBarScrollBehavior322 = topAppBarScrollBehavior2;
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function22 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 57344) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((2995931 & i3) != 599186) {
            }
            final TopAppBarScrollBehavior topAppBarScrollBehavior3222 = topAppBarScrollBehavior2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 57344) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((2995931 & i3) != 599186) {
        }
        final TopAppBarScrollBehavior topAppBarScrollBehavior32222 = topAppBarScrollBehavior2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LargeTopAppBar(final Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsM2603largeTopAppBarColorszjMxDiM;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        WindowInsets windowInsets3;
        Composer composer2;
        TopAppBarColors topAppBarColors2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        WindowInsets windowInsets4;
        Composer composer3;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        final WindowInsets windowInsets5;
        final TopAppBarColors topAppBarColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-474540752);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LargeTopAppBar)P(5,2,3!1,6)341@17583L12,342@17645L22,347@17809L10,348@17910L10,345@17729L643:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changed(function22) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        function32 = function3;
                        i3 |= composerStartRestartGroup.changed(function32) ? 2048 : 1024;
                    }
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i8 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i8;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i8;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsM2603largeTopAppBarColorszjMxDiM = topAppBarColors;
                            int i9 = composerStartRestartGroup.changed(topAppBarColorsM2603largeTopAppBarColorszjMxDiM) ? 131072 : 65536;
                            i3 |= i9;
                        } else {
                            topAppBarColorsM2603largeTopAppBarColorszjMxDiM = topAppBarColors;
                        }
                        i3 |= i9;
                    } else {
                        topAppBarColorsM2603largeTopAppBarColorszjMxDiM = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((i & 3670016) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((2995931 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                Function2<? super Composer, ? super Integer, Unit> function2M2247getLambda9$material3_release = i4 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m2247getLambda9$material3_release() : function22;
                                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M2237getLambda10$material3_release = i5 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m2237getLambda10$material3_release() : function32;
                                if ((i2 & 16) == 0) {
                                    i3 &= -57345;
                                    windowInsets3 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                } else {
                                    windowInsets3 = windowInsets2;
                                }
                                int i10 = i3;
                                if ((i2 & 32) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    topAppBarColorsM2603largeTopAppBarColorszjMxDiM = TopAppBarDefaults.INSTANCE.m2603largeTopAppBarColorszjMxDiM(0L, 0L, 0L, 0L, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                    i3 = i10 & (-458753);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    i3 = i10;
                                }
                                topAppBarScrollBehavior2 = i6 == 0 ? null : topAppBarScrollBehavior;
                                topAppBarColors2 = topAppBarColorsM2603largeTopAppBarColorszjMxDiM;
                                function23 = function2M2247getLambda9$material3_release;
                                function33 = function3M2237getLambda10$material3_release;
                                windowInsets4 = windowInsets3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                modifier3 = modifier2;
                                function23 = function22;
                                function33 = function32;
                                windowInsets4 = windowInsets2;
                                topAppBarColors2 = topAppBarColorsM2603largeTopAppBarColorszjMxDiM;
                                composer2 = composerStartRestartGroup;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-474540752, i3, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:336)");
                            }
                            int i11 = i3;
                            int i12 = i11 << 12;
                            Composer composer4 = composer2;
                            Modifier modifier5 = modifier3;
                            m2125TwoRowsTopAppBartjU4iQQ(modifier5, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TopAppBarLargeTokens.INSTANCE.getHeadlineFont()), LargeTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), function23, function33, windowInsets4, topAppBarColors2, TopAppBarLargeTokens.INSTANCE.m3050getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m3064getContainerHeightD9Ej5fM(), topAppBarScrollBehavior2, composer4, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i12 & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), ((i11 >> 12) & 896) | 54, 0);
                            composer3 = composer4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            function24 = function23;
                            function34 = function33;
                            windowInsets5 = windowInsets4;
                            topAppBarColors3 = topAppBarColors2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            function24 = function22;
                            function34 = function32;
                            windowInsets5 = windowInsets2;
                            topAppBarColors3 = topAppBarColorsM2603largeTopAppBarColorszjMxDiM;
                            composer3 = composerStartRestartGroup;
                        }
                        final TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.LargeTopAppBar.1
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
                                AppBarKt.LargeTopAppBar(title, modifier4, function24, function34, windowInsets5, topAppBarColors3, topAppBarScrollBehavior3, composer5, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((2995931 & i3) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i2 & 16) == 0) {
                            }
                            int i102 = i3;
                            if ((i2 & 32) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            topAppBarColors2 = topAppBarColorsM2603largeTopAppBarColorszjMxDiM;
                            function23 = function2M2247getLambda9$material3_release;
                            function33 = function3M2237getLambda10$material3_release;
                            windowInsets4 = windowInsets3;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = i3;
                            int i122 = i112 << 12;
                            Composer composer42 = composer2;
                            Modifier modifier52 = modifier3;
                            m2125TwoRowsTopAppBartjU4iQQ(modifier52, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TopAppBarLargeTokens.INSTANCE.getHeadlineFont()), LargeTitleBottomPadding, title, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), TopAppBarSmallTokens.INSTANCE.getHeadlineFont()), function23, function33, windowInsets4, topAppBarColors2, TopAppBarLargeTokens.INSTANCE.m3050getContainerHeightD9Ej5fM(), TopAppBarSmallTokens.INSTANCE.m3064getContainerHeightD9Ej5fM(), topAppBarScrollBehavior2, composer42, ((i112 >> 3) & 14) | 3072 | ((i112 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i122 & 57344) | (i122 & 3670016) | (i122 & 29360128) | (i122 & 234881024) | (i122 & 1879048192), ((i112 >> 12) & 896) | 54, 0);
                            composer3 = composer42;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier52;
                            function24 = function23;
                            function34 = function33;
                            windowInsets5 = windowInsets4;
                            topAppBarColors3 = topAppBarColors2;
                        }
                    }
                    final TopAppBarScrollBehavior topAppBarScrollBehavior32 = topAppBarScrollBehavior2;
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function32 = function3;
                if ((i & 57344) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((2995931 & i3) != 599186) {
                }
                final TopAppBarScrollBehavior topAppBarScrollBehavior322 = topAppBarScrollBehavior2;
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function22 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 57344) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((2995931 & i3) != 599186) {
            }
            final TopAppBarScrollBehavior topAppBarScrollBehavior3222 = topAppBarScrollBehavior2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 57344) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((2995931 & i3) != 599186) {
        }
        final TopAppBarScrollBehavior topAppBarScrollBehavior32222 = topAppBarScrollBehavior2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2122BottomAppBarSnr_uVM(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> actions, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        long containerColor;
        long jM2230contentColorForek8zF_U;
        int i5;
        int i6;
        float fM2137getContainerElevationD9Ej5fM;
        int i7;
        Modifier modifier3;
        int i8;
        long j3;
        WindowInsets windowInsets2;
        PaddingValues paddingValues2;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier4;
        final long j4;
        final long j5;
        final float f2;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(actions, "actions");
        Composer composerStartRestartGroup = composer.startRestartGroup(2141738945);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp)397@20335L14,398@20377L31,401@20603L12,402@20621L634:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(actions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changed(function22) ? 256 : 128;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        containerColor = j;
                        int i10 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        containerColor = j;
                    }
                    i3 |= i10;
                } else {
                    containerColor = j;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        jM2230contentColorForek8zF_U = j2;
                        int i11 = composerStartRestartGroup.changed(jM2230contentColorForek8zF_U) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        jM2230contentColorForek8zF_U = j2;
                    }
                    i3 |= i11;
                } else {
                    jM2230contentColorForek8zF_U = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i6 = 57344;
                    fM2137getContainerElevationD9Ej5fM = f;
                } else {
                    i6 = 57344;
                    fM2137getContainerElevationD9Ej5fM = f;
                    if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(fM2137getContainerElevationD9Ej5fM) ? 131072 : 65536;
                    }
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i3 |= composerStartRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                }
                if ((i & 29360128) == 0) {
                    i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 8388608 : 4194304;
                }
                if ((i3 & 23967451) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    function23 = function22;
                    j4 = containerColor;
                    f2 = fM2137getContainerElevationD9Ej5fM;
                    j5 = jM2230contentColorForek8zF_U;
                    paddingValues3 = paddingValues;
                    windowInsets3 = windowInsets;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function22 = null;
                        }
                        if ((i2 & 8) != 0) {
                            containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jM2230contentColorForek8zF_U = ColorSchemeKt.m2230contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                            i3 &= -57345;
                        }
                        if (i5 != 0) {
                            fM2137getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m2137getContainerElevationD9Ej5fM();
                        }
                        PaddingValues contentPadding = i7 == 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                        if ((i2 & 128) == 0) {
                            i3 &= -29360129;
                            long j6 = jM2230contentColorForek8zF_U;
                            modifier3 = modifier2;
                            i8 = 458752;
                            j3 = j6;
                            paddingValues2 = contentPadding;
                            windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            long j7 = jM2230contentColorForek8zF_U;
                            modifier3 = modifier2;
                            i8 = 458752;
                            j3 = j7;
                            windowInsets2 = windowInsets;
                            paddingValues2 = contentPadding;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        long j8 = jM2230contentColorForek8zF_U;
                        modifier3 = modifier2;
                        i8 = 458752;
                        j3 = j8;
                        paddingValues2 = paddingValues;
                        windowInsets2 = windowInsets;
                    }
                    long j9 = containerColor;
                    float f3 = fM2137getContainerElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2141738945, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:393)");
                    }
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1974005449, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope BottomAppBar, Composer composer3, int i12) {
                            Intrinsics.checkNotNullParameter(BottomAppBar, "$this$BottomAppBar");
                            ComposerKt.sourceInformation(composer3, "C410@20844L9,412@20902L33,413@20944L303:AppBar.kt#uh7d8r");
                            if ((i12 & 14) == 0) {
                                i12 |= composer3.changed(BottomAppBar) ? 4 : 2;
                            }
                            if ((i12 & 91) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1974005449, i12, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:409)");
                                }
                                actions.invoke(BottomAppBar, composer3, Integer.valueOf((i12 & 14) | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)));
                                if (function22 != null) {
                                    SpacerKt.Spacer(BottomAppBar.weight(Modifier.INSTANCE, 1.0f, true), composer3, 0);
                                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, AppBarKt.FABVerticalPadding, AppBarKt.FABHorizontalPadding, 0.0f, 9, null);
                                    Alignment topStart = Alignment.INSTANCE.getTopStart();
                                    Function2<Composer, Integer, Unit> function24 = function22;
                                    int i13 = i3;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) objConsume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume3 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM1024paddingqDBjuR0$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(1812284970);
                                    ComposerKt.sourceInformation(composer3, "C422@21215L22:AppBar.kt#uh7d8r");
                                    function24.invoke(composer3, Integer.valueOf((i13 >> 6) & 14));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    int i12 = 1572864 | ((i3 >> 3) & 14);
                    int i13 = i3 >> 6;
                    composer2 = composerStartRestartGroup;
                    m2121BottomAppBar1oL4kX8(modifier3, j9, j3, f3, paddingValues2, windowInsets2, composableLambda, composer2, i12 | (i13 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i13 & 896) | (i13 & 7168) | (i13 & i6) | (i13 & i8), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function23 = function22;
                    modifier4 = modifier3;
                    j4 = j9;
                    j5 = j3;
                    f2 = f3;
                    paddingValues3 = paddingValues2;
                    windowInsets3 = windowInsets2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
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

                    public final void invoke(Composer composer3, int i14) {
                        AppBarKt.m2122BottomAppBarSnr_uVM(actions, modifier4, function23, j4, j5, f2, paddingValues3, windowInsets3, composer3, i | 1, i2);
                    }
                });
                return;
            }
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            function22 = function2;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i3 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    long j92 = containerColor;
                    float f32 = fM2137getContainerElevationD9Ej5fM;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1974005449, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope BottomAppBar, Composer composer3, int i122) {
                            Intrinsics.checkNotNullParameter(BottomAppBar, "$this$BottomAppBar");
                            ComposerKt.sourceInformation(composer3, "C410@20844L9,412@20902L33,413@20944L303:AppBar.kt#uh7d8r");
                            if ((i122 & 14) == 0) {
                                i122 |= composer3.changed(BottomAppBar) ? 4 : 2;
                            }
                            if ((i122 & 91) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1974005449, i122, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:409)");
                                }
                                actions.invoke(BottomAppBar, composer3, Integer.valueOf((i122 & 14) | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)));
                                if (function22 != null) {
                                    SpacerKt.Spacer(BottomAppBar.weight(Modifier.INSTANCE, 1.0f, true), composer3, 0);
                                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, AppBarKt.FABVerticalPadding, AppBarKt.FABHorizontalPadding, 0.0f, 9, null);
                                    Alignment topStart = Alignment.INSTANCE.getTopStart();
                                    Function2<Composer, Integer, Unit> function24 = function22;
                                    int i132 = i3;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) objConsume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume3 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM1024paddingqDBjuR0$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(1812284970);
                                    ComposerKt.sourceInformation(composer3, "C422@21215L22:AppBar.kt#uh7d8r");
                                    function24.invoke(composer3, Integer.valueOf((i132 >> 6) & 14));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    int i122 = 1572864 | ((i3 >> 3) & 14);
                    int i132 = i3 >> 6;
                    composer2 = composerStartRestartGroup;
                    m2121BottomAppBar1oL4kX8(modifier3, j92, j3, f32, paddingValues2, windowInsets2, composableLambda2, composer2, i122 | (i132 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i132 & 896) | (i132 & 7168) | (i132 & i6) | (i132 & i8), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function23 = function22;
                    modifier4 = modifier3;
                    j4 = j92;
                    j5 = j3;
                    f2 = f32;
                    paddingValues3 = paddingValues2;
                    windowInsets3 = windowInsets2;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function22 = function2;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134  */
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2121BottomAppBar1oL4kX8(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        final int i3;
        long containerColor;
        long jM2230contentColorForek8zF_U;
        float fM2137getContainerElevationD9Ej5fM;
        int i4;
        PaddingValues contentPadding;
        int i5;
        WindowInsets windowInsets2;
        Modifier modifier3;
        final WindowInsets windowInsets3;
        long j3;
        float f2;
        final PaddingValues paddingValues2;
        int i6;
        long j4;
        Composer composer2;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets4;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1391700845);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,3,6)455@22876L14,456@22918L31,459@23144L12,467@23478L9,462@23211L693:AppBar.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            if ((i2 & 2) == 0) {
                containerColor = j;
                int i9 = composerStartRestartGroup.changed(containerColor) ? 32 : 16;
                i3 |= i9;
            } else {
                containerColor = j;
            }
            i3 |= i9;
        } else {
            containerColor = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                jM2230contentColorForek8zF_U = j2;
                int i10 = composerStartRestartGroup.changed(jM2230contentColorForek8zF_U) ? 256 : 128;
                i3 |= i10;
            } else {
                jM2230contentColorForek8zF_U = j2;
            }
            i3 |= i10;
        } else {
            jM2230contentColorForek8zF_U = j2;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                fM2137getContainerElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM2137getContainerElevationD9Ej5fM) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 57344) == 0) {
                    contentPadding = paddingValues;
                    i3 |= composerStartRestartGroup.changed(contentPadding) ? 16384 : 8192;
                }
                if ((i & 458752) == 0) {
                    i5 = 57344;
                    windowInsets2 = windowInsets;
                    i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 131072 : 65536;
                } else {
                    i5 = 57344;
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) == 0) {
                    i7 = (i & 3670016) == 0 ? composerStartRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                jM2230contentColorForek8zF_U = ColorSchemeKt.m2230contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i11 != 0) {
                                fM2137getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m2137getContainerElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                contentPadding = BottomAppBarDefaults.INSTANCE.getContentPadding();
                            }
                            if ((i2 & 32) == 0) {
                                windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                i3 &= -458753;
                                modifier3 = companion;
                                j3 = containerColor;
                                f2 = fM2137getContainerElevationD9Ej5fM;
                                paddingValues2 = contentPadding;
                                i6 = -1391700845;
                                j4 = jM2230contentColorForek8zF_U;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:453)");
                                }
                                Shape shape = ShapesKt.toShape(BottomAppBarTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -396569832, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$3
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

                                    public final void invoke(Composer composer3, int i12) {
                                        ComposerKt.sourceInformation(composer3, "C470@23533L365:AppBar.kt#uh7d8r");
                                        if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-396569832, i12, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:469)");
                                            }
                                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m1051height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets3), BottomAppBarTokens.INSTANCE.m2626getContainerHeightD9Ej5fM()), paddingValues2);
                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                            int i13 = ((i3 >> 9) & 7168) | 432;
                                            composer3.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                            composer3.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume = composer3.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Density density = (Density) objConsume;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume2 = composer3.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume3 = composer3.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composer3.disableReusing();
                                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer3.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            composer3.startReplaceableGroup(-678309503);
                                            ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                            function3.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i13 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                });
                                int i12 = (i3 & 14) | 12582912;
                                int i13 = i3 << 3;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m2457SurfaceT9BRK9s(modifier3, shape, j3, j4, f2, 0.0f, null, composableLambda, composer2, i12 | (i13 & 896) | (i13 & 7168) | (i13 & i5), 96);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                paddingValues3 = paddingValues2;
                                windowInsets4 = windowInsets3;
                                modifier4 = modifier3;
                                j5 = j3;
                                j6 = j4;
                                f3 = f2;
                            } else {
                                modifier3 = companion;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier3 = modifier2;
                        }
                        f2 = fM2137getContainerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        paddingValues2 = contentPadding;
                        j3 = containerColor;
                        j4 = jM2230contentColorForek8zF_U;
                        i6 = -1391700845;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Shape shape2 = ShapesKt.toShape(BottomAppBarTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -396569832, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$3
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

                            public final void invoke(Composer composer3, int i122) {
                                ComposerKt.sourceInformation(composer3, "C470@23533L365:AppBar.kt#uh7d8r");
                                if ((i122 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-396569832, i122, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:469)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m1051height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets3), BottomAppBarTokens.INSTANCE.m2626getContainerHeightD9Ej5fM()), paddingValues2);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                    int i132 = ((i3 >> 9) & 7168) | 432;
                                    composer3.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) objConsume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume3 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                    function3.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i132 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        int i122 = (i3 & 14) | 12582912;
                        int i132 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m2457SurfaceT9BRK9s(modifier3, shape2, j3, j4, f2, 0.0f, null, composableLambda2, composer2, i122 | (i132 & 896) | (i132 & 7168) | (i132 & i5), 96);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        paddingValues3 = paddingValues2;
                        windowInsets4 = windowInsets3;
                        modifier4 = modifier3;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        j5 = containerColor;
                        j6 = jM2230contentColorForek8zF_U;
                        f3 = fM2137getContainerElevationD9Ej5fM;
                        windowInsets4 = windowInsets2;
                        paddingValues3 = contentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$4
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

                        public final void invoke(Composer composer3, int i14) {
                            AppBarKt.m2121BottomAppBar1oL4kX8(modifier4, j5, j6, f3, paddingValues3, windowInsets4, content, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i7;
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if ((i2 & 2) != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            contentPadding = paddingValues;
            if ((i & 458752) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995931) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM2137getContainerElevationD9Ej5fM = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        contentPadding = paddingValues;
        if ((i & 458752) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995931) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ExperimentalMaterial3Api
    public static final TopAppBarState rememberTopAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1801969826);
        ComposerKt.sourceInformation(composer, "C(rememberTopAppBarState)P(2,1)759@36770L145,759@36723L192:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:754)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.INSTANCE.getSaver();
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        Float fValueOf3 = Float.valueOf(f3);
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean zChanged = composer.changed(fValueOf) | composer.changed(fValueOf2) | composer.changed(fValueOf3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function0) new Function0<TopAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TopAppBarState invoke() {
                    return new TopAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarState;
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SingleRowTopAppBar(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        final int i3;
        int i4;
        final float f;
        boolean zChanged;
        Object objRememberedValue;
        Modifier.Companion companionDraggable$default;
        TopAppBarState state;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1841601619);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SingleRowTopAppBar)P(3,6,7,1,4!1,8)*995@45392L7,996@45465L167,996@45454L178,1009@46228L24,1008@46178L151,1046@47635L1166:AppBar.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                i3 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    i3 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else {
                        if ((57344 & i) == 0) {
                            i3 |= composerStartRestartGroup.changed(function22) ? 16384 : 8192;
                        }
                        if ((i2 & 32) != 0) {
                            i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else {
                            if ((458752 & i) == 0) {
                                i4 = composerStartRestartGroup.changed(function3) ? 131072 : 65536;
                            }
                            if ((i2 & 64) == 0) {
                                i3 |= 1572864;
                            } else {
                                if ((3670016 & i) == 0) {
                                    i3 |= composerStartRestartGroup.changed(windowInsets) ? 1048576 : 524288;
                                }
                                if ((i2 & 128) == 0) {
                                    i6 = (29360128 & i) == 0 ? composerStartRestartGroup.changed(topAppBarColors) ? 8388608 : 4194304 : 12582912;
                                    if ((i2 & 256) != 0) {
                                        i5 = (234881024 & i) == 0 ? composerStartRestartGroup.changed(topAppBarScrollBehavior) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                                        if ((191739611 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                            if (i7 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1841601619, i3, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:981)");
                                            }
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume = composerStartRestartGroup.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            f = -((Density) objConsume).mo712toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m3064getContainerHeightD9Ej5fM());
                                            Float fValueOf = Float.valueOf(f);
                                            composerStartRestartGroup.startReplaceableGroup(511388516);
                                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                                            zChanged = composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(topAppBarScrollBehavior);
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$1$1
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
                                                        TopAppBarState state2;
                                                        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                        if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.getHeightOffsetLimit()), f)) {
                                                            return;
                                                        }
                                                        TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                                        TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                                        if (state3 == null) {
                                                            return;
                                                        }
                                                        state3.setHeightOffsetLimit(f);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                                            State stateM452animateColorAsStateKTwxG1Y = SingleValueAnimationKt.m452animateColorAsStateKTwxG1Y(topAppBarColors.m2598containerColorXeAY9LY$material3_release(((topAppBarScrollBehavior != null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getOverlappedFraction()) <= 0.01f ? 1.0f : 0.0f, composerStartRestartGroup, (i3 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, composerStartRestartGroup, 48, 4);
                                            final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1520880938, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
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

                                                public final void invoke(Composer composer2, int i8) {
                                                    ComposerKt.sourceInformation(composer2, "C1015@46414L157:AppBar.kt#uh7d8r");
                                                    if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1520880938, i8, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1014)");
                                                        }
                                                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                        int i9 = ((i3 >> 6) & 7168) | 432;
                                                        composer2.startReplaceableGroup(693286680);
                                                        ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer2, 54);
                                                        composer2.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object objConsume2 = composer2.consume(localDensity2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        Density density = (Density) objConsume2;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object objConsume3 = composer2.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        LayoutDirection layoutDirection = (LayoutDirection) objConsume3;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object objConsume4 = composer2.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume4;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer2.enableReusing();
                                                        function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, 0);
                                                        composer2.startReplaceableGroup(2058660585);
                                                        composer2.startReplaceableGroup(-678309503);
                                                        ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                                        function32.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i9 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                                        composer2.endReplaceableGroup();
                                                        composer2.endReplaceableGroup();
                                                        composer2.endNode();
                                                        composer2.endReplaceableGroup();
                                                        composer2.endReplaceableGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            });
                                            composerStartRestartGroup.startReplaceableGroup(-1008378188);
                                            ComposerKt.sourceInformation(composerStartRestartGroup, "1026@46877L118,1026@46854L141,1029@47025L255");
                                            if (topAppBarScrollBehavior == null && !topAppBarScrollBehavior.getIsPinned()) {
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                Orientation orientation = Orientation.Vertical;
                                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean zChanged2 = composerStartRestartGroup.changed(topAppBarScrollBehavior);
                                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                                                            invoke(f2.floatValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(float f2) {
                                                            topAppBarScrollBehavior.getState().setHeightOffset(topAppBarScrollBehavior.getState().getHeightOffset() + f2);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                                                Modifier.Companion companion2 = companion;
                                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean zChanged3 = composerStartRestartGroup.changed(topAppBarScrollBehavior);
                                                AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                                                if (zChanged3 || appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                                    composerStartRestartGroup.updateRememberedValue(appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue);
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                companionDraggable$default = DraggableKt.draggable$default(companion2, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue, false, 188, null);
                                            } else {
                                                companionDraggable$default = Modifier.INSTANCE;
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            final int i8 = i3;
                                            SurfaceKt.m2457SurfaceT9BRK9s(modifier2.then(companionDraggable$default), null, m2123SingleRowTopAppBar$lambda3(stateM452animateColorAsStateKTwxG1Y), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 376925230, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.SingleRowTopAppBar.2
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

                                                public final void invoke(Composer composer2, int i9) {
                                                    TopAppBarState state2;
                                                    ComposerKt.sourceInformation(composer2, "C*1047@47755L7,1051@47905L890:AppBar.kt#uh7d8r");
                                                    if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(376925230, i9, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1046)");
                                                        }
                                                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object objConsume2 = composer2.consume(localDensity2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                        float fMo712toPx0680j_4 = ((Density) objConsume2).mo712toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m3064getContainerHeightD9Ej5fM()) + ((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state2.getHeightOffset());
                                                        Modifier modifierClipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, windowInsets));
                                                        long jM2600getNavigationIconContentColor0d7_KjU$material3_release = topAppBarColors.getNavigationIconContentColor();
                                                        long jM2601getTitleContentColor0d7_KjU$material3_release = topAppBarColors.getTitleContentColor();
                                                        long jM2599getActionIconContentColor0d7_KjU$material3_release = topAppBarColors.getActionIconContentColor();
                                                        Function2<Composer, Integer, Unit> function23 = function2;
                                                        TextStyle textStyle2 = textStyle;
                                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                        Arrangement.Horizontal center2 = z ? Arrangement.INSTANCE.getCenter() : Arrangement.INSTANCE.getStart();
                                                        Function2<Composer, Integer, Unit> function24 = function22;
                                                        Function2<Composer, Integer, Unit> function25 = composableLambda;
                                                        int i10 = i8;
                                                        AppBarKt.m2124TopAppBarLayoutkXwM9vE(modifierClipToBounds, fMo712toPx0680j_4, jM2600getNavigationIconContentColor0d7_KjU$material3_release, jM2601getTitleContentColor0d7_KjU$material3_release, jM2599getActionIconContentColor0d7_KjU$material3_release, function23, textStyle2, 1.0f, center, center2, 0, false, function24, function25, composer2, ((i10 << 12) & 458752) | 113246208 | ((i10 << 12) & 3670016), ((i10 >> 6) & 896) | 3126);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }), composerStartRestartGroup, 12582912, 122);
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                        }
                                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup == null) {
                                            return;
                                        }
                                        final Modifier modifier3 = modifier2;
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.SingleRowTopAppBar.3
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

                                            public final void invoke(Composer composer2, int i9) {
                                                AppBarKt.SingleRowTopAppBar(modifier3, function2, textStyle, z, function22, function3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer2, i | 1, i2);
                                            }
                                        });
                                        return;
                                    }
                                    i3 |= i5;
                                    if ((191739611 & i3) != 38347922) {
                                        if (i7 != 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object objConsume2 = composerStartRestartGroup.consume(localDensity2);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        f = -((Density) objConsume2).mo712toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m3064getContainerHeightD9Ej5fM());
                                        Float fValueOf2 = Float.valueOf(f);
                                        composerStartRestartGroup.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                                        zChanged = composerStartRestartGroup.changed(fValueOf2) | composerStartRestartGroup.changed(topAppBarScrollBehavior);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged) {
                                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$1$1
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
                                                    TopAppBarState state2;
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                    if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.getHeightOffsetLimit()), f)) {
                                                        return;
                                                    }
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                                    TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                                    if (state3 == null) {
                                                        return;
                                                    }
                                                    state3.setHeightOffsetLimit(f);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                                            if (topAppBarScrollBehavior != null) {
                                                State stateM452animateColorAsStateKTwxG1Y2 = SingleValueAnimationKt.m452animateColorAsStateKTwxG1Y(topAppBarColors.m2598containerColorXeAY9LY$material3_release(((topAppBarScrollBehavior != null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getOverlappedFraction()) <= 0.01f ? 1.0f : 0.0f, composerStartRestartGroup, (i3 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, composerStartRestartGroup, 48, 4);
                                                final Function2<? super Composer, ? super Integer, Unit> composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1520880938, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
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

                                                    public final void invoke(Composer composer2, int i82) {
                                                        ComposerKt.sourceInformation(composer2, "C1015@46414L157:AppBar.kt#uh7d8r");
                                                        if ((i82 & 11) != 2 || !composer2.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1520880938, i82, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1014)");
                                                            }
                                                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                            int i9 = ((i3 >> 6) & 7168) | 432;
                                                            composer2.startReplaceableGroup(693286680);
                                                            ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer2, 54);
                                                            composer2.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object objConsume22 = composer2.consume(localDensity22);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            Density density = (Density) objConsume22;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object objConsume3 = composer2.consume(localLayoutDirection);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            LayoutDirection layoutDirection = (LayoutDirection) objConsume3;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object objConsume4 = composer2.consume(localViewConfiguration);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume4;
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion3);
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
                                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer2.enableReusing();
                                                            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer2)), composer2, 0);
                                                            composer2.startReplaceableGroup(2058660585);
                                                            composer2.startReplaceableGroup(-678309503);
                                                            ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                                            function32.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i9 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                                            composer2.endReplaceableGroup();
                                                            composer2.endReplaceableGroup();
                                                            composer2.endNode();
                                                            composer2.endReplaceableGroup();
                                                            composer2.endReplaceableGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer2.skipToGroupEnd();
                                                    }
                                                });
                                                composerStartRestartGroup.startReplaceableGroup(-1008378188);
                                                ComposerKt.sourceInformation(composerStartRestartGroup, "1026@46877L118,1026@46854L141,1029@47025L255");
                                                if (topAppBarScrollBehavior == null) {
                                                    companionDraggable$default = Modifier.INSTANCE;
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    final int i82 = i3;
                                                    SurfaceKt.m2457SurfaceT9BRK9s(modifier2.then(companionDraggable$default), null, m2123SingleRowTopAppBar$lambda3(stateM452animateColorAsStateKTwxG1Y2), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 376925230, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.SingleRowTopAppBar.2
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

                                                        public final void invoke(Composer composer2, int i9) {
                                                            TopAppBarState state2;
                                                            ComposerKt.sourceInformation(composer2, "C*1047@47755L7,1051@47905L890:AppBar.kt#uh7d8r");
                                                            if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(376925230, i9, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1046)");
                                                                }
                                                                ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object objConsume22 = composer2.consume(localDensity22);
                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                                float fMo712toPx0680j_4 = ((Density) objConsume22).mo712toPx0680j_4(TopAppBarSmallTokens.INSTANCE.m3064getContainerHeightD9Ej5fM()) + ((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state2.getHeightOffset());
                                                                Modifier modifierClipToBounds = ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, windowInsets));
                                                                long jM2600getNavigationIconContentColor0d7_KjU$material3_release = topAppBarColors.getNavigationIconContentColor();
                                                                long jM2601getTitleContentColor0d7_KjU$material3_release = topAppBarColors.getTitleContentColor();
                                                                long jM2599getActionIconContentColor0d7_KjU$material3_release = topAppBarColors.getActionIconContentColor();
                                                                Function2<Composer, Integer, Unit> function23 = function2;
                                                                TextStyle textStyle2 = textStyle;
                                                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                                Arrangement.Horizontal center2 = z ? Arrangement.INSTANCE.getCenter() : Arrangement.INSTANCE.getStart();
                                                                Function2<Composer, Integer, Unit> function24 = function22;
                                                                Function2<Composer, Integer, Unit> function25 = composableLambda2;
                                                                int i10 = i82;
                                                                AppBarKt.m2124TopAppBarLayoutkXwM9vE(modifierClipToBounds, fMo712toPx0680j_4, jM2600getNavigationIconContentColor0d7_KjU$material3_release, jM2601getTitleContentColor0d7_KjU$material3_release, jM2599getActionIconContentColor0d7_KjU$material3_release, function23, textStyle2, 1.0f, center, center2, 0, false, function24, function25, composer2, ((i10 << 12) & 458752) | 113246208 | ((i10 << 12) & 3670016), ((i10 >> 6) & 896) | 3126);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer2.skipToGroupEnd();
                                                        }
                                                    }), composerStartRestartGroup, 12582912, 122);
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                    }
                                }
                                i3 |= i6;
                                if ((i2 & 256) != 0) {
                                }
                                i3 |= i5;
                                if ((191739611 & i3) != 38347922) {
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            if ((i2 & 128) == 0) {
                            }
                            i3 |= i6;
                            if ((i2 & 256) != 0) {
                            }
                            i3 |= i5;
                            if ((191739611 & i3) != 38347922) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i3 |= i4;
                        if ((i2 & 64) == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        i3 |= i6;
                        if ((i2 & 256) != 0) {
                        }
                        i3 |= i5;
                        if ((191739611 & i3) != 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i2 & 32) != 0) {
                    }
                    i3 |= i4;
                    if ((i2 & 64) == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    i3 |= i6;
                    if ((i2 & 256) != 0) {
                    }
                    i3 |= i5;
                    if ((191739611 & i3) != 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                i3 |= i4;
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                i3 |= i6;
                if ((i2 & 256) != 0) {
                }
                i3 |= i5;
                if ((191739611 & i3) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            i3 |= i4;
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i6;
            if ((i2 & 256) != 0) {
            }
            i3 |= i5;
            if ((191739611 & i3) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i3 |= i4;
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i6;
        if ((i2 & 256) != 0) {
        }
        i3 |= i5;
        if ((191739611 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0385 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0133  */
    /* renamed from: TwoRowsTopAppBar-tjU4iQQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2125TwoRowsTopAppBartjU4iQQ(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function22, final TextStyle textStyle2, final Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final float f2, final float f3, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        final int i4;
        TextStyle textStyle3;
        int i5;
        int i6;
        float f4;
        Modifier.Companion companionDraggable$default;
        Composer composer2;
        final Modifier modifier3;
        boolean zChanged;
        AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue;
        TopAppBarState state;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(210227552);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TwoRowsTopAppBar)P(3,9,11,10:c#ui.unit.Dp,7,8,4!1,12!1,2:c#ui.unit.Dp,5:c#ui.unit.Dp)*1106@49848L7,1114@50161L189,1114@50150L200,1126@50881L39,1126@50853L68,1163@52345L2017:AppBar.kt#uh7d8r");
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                textStyle3 = textStyle;
                i4 |= composerStartRestartGroup.changed(textStyle3) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else {
                if ((57344 & i) == 0) {
                    i4 |= composerStartRestartGroup.changed(function22) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= composerStartRestartGroup.changed(function23) ? 1048576 : 524288;
                }
                if ((i3 & 128) == 0) {
                    i8 = (i & 29360128) == 0 ? composerStartRestartGroup.changed(function3) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 234881024) == 0) {
                            i4 |= composerStartRestartGroup.changed(windowInsets) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i3 & 512) == 0) {
                            i7 = (i & 1879048192) == 0 ? composerStartRestartGroup.changed(topAppBarColors) ? 536870912 : 268435456 : 805306368;
                            if ((i3 & 1024) == 0) {
                                i5 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i5 = i2 | (composerStartRestartGroup.changed(f2) ? 4 : 2);
                            } else {
                                i5 = i2;
                            }
                            int i10 = i5;
                            if ((i3 & 2048) == 0) {
                                i6 = i10 | 48;
                            } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                                i6 = i10 | (composerStartRestartGroup.changed(f3) ? 32 : 16);
                            } else {
                                i6 = i10;
                            }
                            if ((i3 & 4096) == 0) {
                                i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                            } else if ((i2 & 896) == 0) {
                                i6 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 256 : 128;
                            }
                            if ((1533916891 & i4) == 306783378 || (i6 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(210227552, i4, i6, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1083)");
                                }
                                if (Dp.m6116compareTo0680j_4(f2, f3) > 0) {
                                    throw new IllegalArgumentException("A TwoRowsTopAppBar max height should be greater than its pinned height");
                                }
                                final Ref.FloatRef floatRef = new Ref.FloatRef();
                                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume = composerStartRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                Density density = (Density) objConsume;
                                floatRef.element = density.mo712toPx0680j_4(f3);
                                floatRef2.element = density.mo712toPx0680j_4(f2);
                                intRef.element = density.mo706roundToPx0680j_4(f);
                                Unit unit = Unit.INSTANCE;
                                Float fValueOf = Float.valueOf(floatRef.element);
                                Float fValueOf2 = Float.valueOf(floatRef2.element);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                boolean zChanged2 = composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(topAppBarScrollBehavior) | composerStartRestartGroup.changed(fValueOf2);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$2$1
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
                                            TopAppBarState state2;
                                            TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                            if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.getHeightOffsetLimit()), floatRef.element - floatRef2.element)) {
                                                return;
                                            }
                                            TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                            TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                            if (state3 == null) {
                                                return;
                                            }
                                            state3.setHeightOffsetLimit(floatRef.element - floatRef2.element);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                                float collapsedFraction = (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getCollapsedFraction();
                                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3647boximpl(topAppBarColors.m2598containerColorXeAY9LY$material3_release(collapsedFraction, composerStartRestartGroup, (i4 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)), composerStartRestartGroup, 0);
                                final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1048401111, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1
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

                                    public final void invoke(Composer composer3, int i11) {
                                        ComposerKt.sourceInformation(composer3, "C1130@51006L157:AppBar.kt#uh7d8r");
                                        if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1048401111, i11, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1129)");
                                            }
                                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                            int i12 = ((i4 >> 12) & 7168) | 432;
                                            composer3.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer3, 54);
                                            composer3.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume2 = composer3.consume(localDensity2);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Density density2 = (Density) objConsume2;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume3 = composer3.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            LayoutDirection layoutDirection = (LayoutDirection) objConsume3;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume4 = composer3.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume4;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composer3.disableReusing();
                                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer3.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            composer3.startReplaceableGroup(-678309503);
                                            ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                            function32.invoke(RowScopeInstance.INSTANCE, composer3, Integer.valueOf(((i12 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                });
                                float fTransform = TopTitleAlphaEasing.transform(collapsedFraction);
                                final float f5 = 1.0f - collapsedFraction;
                                final boolean z = collapsedFraction < 0.5f;
                                final boolean z2 = !z;
                                composerStartRestartGroup.startReplaceableGroup(-1609667684);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "1147@51890L118,1147@51867L141,1150@52038L255");
                                if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.getIsPinned()) {
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Orientation orientation = Orientation.Vertical;
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged3 = composerStartRestartGroup.changed(topAppBarScrollBehavior);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged3) {
                                        f4 = fTransform;
                                    } else {
                                        f4 = fTransform;
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                                        Modifier.Companion companion3 = companion2;
                                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                        zChanged = composerStartRestartGroup.changed(topAppBarScrollBehavior);
                                        appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged || appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                            appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                            composerStartRestartGroup.updateRememberedValue(appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        companionDraggable$default = DraggableKt.draggable$default(companion3, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue, false, 188, null);
                                    }
                                    objRememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f6) {
                                            invoke(f6.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(float f6) {
                                            topAppBarScrollBehavior.getState().setHeightOffset(topAppBarScrollBehavior.getState().getHeightOffset() + f6);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    DraggableState draggableStateRememberDraggableState2 = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                                    Modifier.Companion companion32 = companion2;
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                    zChanged = composerStartRestartGroup.changed(topAppBarScrollBehavior);
                                    appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged) {
                                        appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                        composerStartRestartGroup.updateRememberedValue(appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        companionDraggable$default = DraggableKt.draggable$default(companion32, draggableStateRememberDraggableState2, orientation, false, null, false, null, (Function3) appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue, false, 188, null);
                                    }
                                } else {
                                    f4 = fTransform;
                                    companionDraggable$default = Modifier.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierThen = companion.then(companionDraggable$default);
                                long jM2126TwoRowsTopAppBar_tjU4iQQ$lambda8 = m2126TwoRowsTopAppBar_tjU4iQQ$lambda8(stateRememberUpdatedState);
                                final TextStyle textStyle4 = textStyle3;
                                final int i11 = i4;
                                final float f6 = f4;
                                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1985938853, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$3
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

                                    public final void invoke(Composer composer3, int i12) {
                                        TopAppBarState state2;
                                        ComposerKt.sourceInformation(composer3, "C1164@52439L1917:AppBar.kt#uh7d8r");
                                        if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1985938853, i12, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:1163)");
                                            }
                                            WindowInsets windowInsets2 = windowInsets;
                                            Ref.FloatRef floatRef3 = floatRef;
                                            TopAppBarColors topAppBarColors2 = topAppBarColors;
                                            Function2<Composer, Integer, Unit> function24 = function22;
                                            TextStyle textStyle5 = textStyle2;
                                            float f7 = f6;
                                            boolean z3 = z;
                                            Function2<Composer, Integer, Unit> function25 = function23;
                                            Function2<Composer, Integer, Unit> function26 = composableLambda;
                                            int i13 = i11;
                                            Ref.FloatRef floatRef4 = floatRef2;
                                            TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                            Function2<Composer, Integer, Unit> function27 = function2;
                                            TextStyle textStyle6 = textStyle4;
                                            float f8 = f5;
                                            Ref.IntRef intRef2 = intRef;
                                            boolean z4 = z2;
                                            composer3.startReplaceableGroup(-483455358);
                                            ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume2 = composer3.consume(localDensity2);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Density density2 = (Density) objConsume2;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume3 = composer3.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            LayoutDirection layoutDirection = (LayoutDirection) objConsume3;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object objConsume4 = composer3.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume4;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion4);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composer3.disableReusing();
                                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer3.enableReusing();
                                            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            composer3.startReplaceableGroup(-1163856341);
                                            ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            composer3.startReplaceableGroup(80455579);
                                            ComposerKt.sourceInformation(composer3, "C1165@52460L982,1186@53455L891:AppBar.kt#uh7d8r");
                                            int i14 = i13 << 3;
                                            AppBarKt.m2124TopAppBarLayoutkXwM9vE(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, windowInsets2)), floatRef3.element, topAppBarColors2.getNavigationIconContentColor(), topAppBarColors2.getTitleContentColor(), topAppBarColors2.getActionIconContentColor(), function24, textStyle5, f7, Arrangement.INSTANCE.getCenter(), Arrangement.INSTANCE.getStart(), 0, z3, function25, function26, composer3, (i14 & 458752) | 905969664 | (i14 & 3670016), ((i13 >> 12) & 896) | 3078);
                                            int i15 = i13 << 12;
                                            AppBarKt.m2124TopAppBarLayoutkXwM9vE(ClipKt.clipToBounds(Modifier.INSTANCE), ((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state2.getHeightOffset()) + (floatRef4.element - floatRef3.element), topAppBarColors2.getNavigationIconContentColor(), topAppBarColors2.getTitleContentColor(), topAppBarColors2.getActionIconContentColor(), function27, textStyle6, f8, Arrangement.INSTANCE.getBottom(), Arrangement.INSTANCE.getStart(), intRef2.element, z4, ComposableSingletons$AppBarKt.INSTANCE.m2238getLambda11$material3_release(), ComposableSingletons$AppBarKt.INSTANCE.m2239getLambda12$material3_release(), composer3, (i15 & 458752) | 905969670 | (i15 & 3670016), 3456);
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                });
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m2457SurfaceT9BRK9s(modifierThen, null, jM2126TwoRowsTopAppBar_tjU4iQQ$lambda8, 0L, 0.0f, 0.0f, null, composableLambda2, composer2, 12582912, 122);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$4
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

                                public final void invoke(Composer composer3, int i12) {
                                    AppBarKt.m2125TwoRowsTopAppBartjU4iQQ(modifier3, function2, textStyle, f, function22, textStyle2, function23, function3, windowInsets, topAppBarColors, f2, f3, topAppBarScrollBehavior, composer3, i | 1, i2, i3);
                                }
                            });
                            return;
                        }
                        i4 |= i7;
                        if ((i3 & 1024) == 0) {
                        }
                        int i102 = i5;
                        if ((i3 & 2048) == 0) {
                        }
                        if ((i3 & 4096) == 0) {
                        }
                        if ((1533916891 & i4) == 306783378) {
                            if (i9 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (Dp.m6116compareTo0680j_4(f2, f3) > 0) {
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i7;
                    if ((i3 & 1024) == 0) {
                    }
                    int i1022 = i5;
                    if ((i3 & 2048) == 0) {
                    }
                    if ((i3 & 4096) == 0) {
                    }
                    if ((1533916891 & i4) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 |= i8;
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                i4 |= i7;
                if ((i3 & 1024) == 0) {
                }
                int i10222 = i5;
                if ((i3 & 2048) == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                if ((1533916891 & i4) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) == 0) {
            }
            i4 |= i8;
            if ((i3 & 256) == 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i4 |= i7;
            if ((i3 & 1024) == 0) {
            }
            int i102222 = i5;
            if ((i3 & 2048) == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            if ((1533916891 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        textStyle3 = textStyle;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) == 0) {
        }
        i4 |= i8;
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i4 |= i7;
        if ((i3 & 1024) == 0) {
        }
        int i1022222 = i5;
        if ((i3 & 2048) == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        if ((1533916891 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopAppBarLayout-kXwM9vE, reason: not valid java name */
    public static final void m2124TopAppBarLayoutkXwM9vE(final Modifier modifier, final float f, final long j, final long j2, final long j3, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f2, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-6794037);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TopAppBarLayout)P(4,2,6:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,7,12,8,13,11,9,3,5)1252@56406L4278:AppBar.kt#uh7d8r");
        if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i4 |= composerStartRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((i2 & 458752) == 0) {
            i4 |= composerStartRestartGroup.changed(function2) ? 131072 : 65536;
        }
        if ((i2 & 3670016) == 0) {
            i4 |= composerStartRestartGroup.changed(textStyle) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i2 & 234881024) == 0) {
            i4 |= composerStartRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 1879048192) == 0) {
            i4 |= composerStartRestartGroup.changed(horizontal) ? 536870912 : 268435456;
        }
        if ((i3 & 14) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(function22) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i5 |= composerStartRestartGroup.changed(function23) ? 2048 : 1024;
        }
        int i6 = i5;
        if ((i4 & 1533916891) != 306783378 || (i6 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6794037, i4, i6, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:1236)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo377measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> measurables, final long j4) {
                    int iCoerceAtLeast;
                    final MeasureScope Layout = measureScope;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                            final Placeable placeableMo4993measureBRTryo0 = measurable.mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                    final Placeable placeableMo4993measureBRTryo02 = measurable2.mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                    if (Constraints.m6070getMaxWidthimpl(j4) == Integer.MAX_VALUE) {
                                        iCoerceAtLeast = Constraints.m6070getMaxWidthimpl(j4);
                                    } else {
                                        iCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.m6070getMaxWidthimpl(j4) - placeableMo4993measureBRTryo0.getWidth()) - placeableMo4993measureBRTryo02.getWidth(), 0);
                                    }
                                    int i7 = iCoerceAtLeast;
                                    for (Measurable measurable3 : list) {
                                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "title")) {
                                            final Placeable placeableMo4993measureBRTryo03 = measurable3.mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j4, 0, i7, 0, 0, 12, null));
                                            final int i8 = placeableMo4993measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? placeableMo4993measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                            final int iRoundToInt = MathKt.roundToInt(f);
                                            int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j4);
                                            final Arrangement.Horizontal horizontal2 = horizontal;
                                            final Arrangement.Vertical vertical2 = vertical;
                                            final int i9 = i;
                                            return MeasureScope.layout$default(measureScope, iM6070getMaxWidthimpl, iRoundToInt, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$measure$1
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
                                                    int iMax;
                                                    int i10;
                                                    int height;
                                                    int iMax2;
                                                    int height2;
                                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                    Placeable placeable = placeableMo4993measureBRTryo0;
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, (iRoundToInt - placeable.getHeight()) / 2, 0.0f, 4, null);
                                                    Placeable placeable2 = placeableMo4993measureBRTryo03;
                                                    Arrangement.Horizontal horizontal3 = horizontal2;
                                                    if (Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getCenter())) {
                                                        iMax = (Constraints.m6070getMaxWidthimpl(j4) - placeableMo4993measureBRTryo03.getWidth()) / 2;
                                                    } else if (!Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getEnd())) {
                                                        iMax = Math.max(Layout.mo706roundToPx0680j_4(AppBarKt.TopAppBarTitleInset), placeableMo4993measureBRTryo0.getWidth());
                                                    } else {
                                                        iMax = (Constraints.m6070getMaxWidthimpl(j4) - placeableMo4993measureBRTryo03.getWidth()) - placeableMo4993measureBRTryo02.getWidth();
                                                    }
                                                    int i11 = iMax;
                                                    Arrangement.Vertical vertical3 = vertical2;
                                                    if (Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getCenter())) {
                                                        height2 = (iRoundToInt - placeableMo4993measureBRTryo03.getHeight()) / 2;
                                                    } else if (!Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getBottom())) {
                                                        i10 = 0;
                                                        Placeable.PlacementScope.placeRelative$default(layout, placeable2, i11, i10, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo02, Constraints.m6070getMaxWidthimpl(j4) - placeableMo4993measureBRTryo02.getWidth(), (iRoundToInt - placeableMo4993measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                    } else {
                                                        if (i9 == 0) {
                                                            height = iRoundToInt;
                                                            iMax2 = placeableMo4993measureBRTryo03.getHeight();
                                                        } else {
                                                            height = iRoundToInt - placeableMo4993measureBRTryo03.getHeight();
                                                            iMax2 = Math.max(0, (i9 - placeableMo4993measureBRTryo03.getHeight()) + i8);
                                                        }
                                                        height2 = height - iMax2;
                                                    }
                                                    i10 = height2;
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeable2, i11, i10, 0.0f, 4, null);
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo02, Constraints.m6070getMaxWidthimpl(j4) - placeableMo4993measureBRTryo02.getWidth(), (iRoundToInt - placeableMo4993measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                }
                                            }, 4, null);
                                        }
                                        Layout = measureScope;
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                Layout = measureScope;
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        Layout = measureScope;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2907L7,75@2962L7,76@3021L7,77@3033L460:Layout.kt#80mrfh");
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            final int i7 = i4;
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(1688650562);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C1254@56436L352,1264@56801L547,1277@57361L336:AppBar.kt#uh7d8r");
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "navigationIcon");
            float f3 = TopAppBarHorizontalPadding;
            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(modifierLayoutId, f3, 0.0f, 0.0f, 0.0f, 14, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume4 = composerStartRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density2 = (Density) objConsume4;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume5 = composerStartRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) objConsume5;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume6 = composerStartRestartGroup.consume(localViewConfiguration2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume6;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM1024paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1034743112);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C1259@56611L163:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j))}, function22, composerStartRestartGroup, ((i6 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "title"), f3, 0.0f, 2, null);
            Modifier.Companion companionClearAndSetSemantics = Modifier.INSTANCE;
            if (z) {
                companionClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companionClearAndSetSemantics, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver clearAndSetSemantics) {
                        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
            }
            Modifier modifierThen = modifierM1022paddingVpY3zN4$default.then(companionClearAndSetSemantics);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume7 = composerStartRestartGroup.consume(localDensity3);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density3 = (Density) objConsume7;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume8 = composerStartRestartGroup.consume(localLayoutDirection3);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) objConsume8;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume9 = composerStartRestartGroup.consume(localViewConfiguration3);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) objConsume9;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierThen);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-280006401);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C1270@57071L263:AppBar.kt#uh7d8r");
            TextKt.ProvideTextStyle(textStyle, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 824316656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$3$1
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

                public final void invoke(Composer composer2, int i8) {
                    ComposerKt.sourceInformation(composer2, "C1271@57134L182:AppBar.kt#uh7d8r");
                    if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(824316656, i8, -1, "androidx.compose.material3.TopAppBarLayout.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:1270)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(Color.m3656copywmQWz5c$default(j2, f2, 0.0f, 0.0f, 0.0f, 14, null)))}, function2, composer2, ((i7 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i7 >> 18) & 14) | 48);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1024paddingqDBjuR0$default2 = PaddingKt.m1024paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume10 = composerStartRestartGroup.consume(localDensity4);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density4 = (Density) objConsume10;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume11 = composerStartRestartGroup.consume(localLayoutDirection4);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection4 = (LayoutDirection) objConsume11;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration4 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume12 = composerStartRestartGroup.consume(localViewConfiguration4);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) objConsume12;
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM1024paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM3150constructorimpl4 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl4, density4, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl4, layoutDirection4, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl4, viewConfiguration4, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf4.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1192272192);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C1282@57531L152:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j3))}, function23, composerStartRestartGroup, ((i6 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
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

            public final void invoke(Composer composer2, int i8) {
                AppBarKt.m2124TopAppBarLayoutkXwM9vE(modifier, f, j, j2, j3, function2, textStyle, f2, vertical, horizontal, i, z, function22, function23, composer2, i2 | 1, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBar(TopAppBarState topAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) {
        C05201 c05201;
        final Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        Ref.FloatRef floatRef2;
        final TopAppBarState topAppBarState2 = topAppBarState;
        if (continuation instanceof C05201) {
            c05201 = (C05201) continuation;
            if ((c05201.label & Integer.MIN_VALUE) != 0) {
                c05201.label -= Integer.MIN_VALUE;
            } else {
                c05201 = new C05201(continuation);
            }
        }
        C05201 c052012 = c05201;
        Object obj = c052012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c052012.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (topAppBarState2.getCollapsedFraction() < 0.01f || topAppBarState2.getCollapsedFraction() == 1.0f) {
                return Velocity.m6345boximpl(Velocity.INSTANCE.m6365getZero9UxMQ8M());
            }
            floatRef = new Ref.FloatRef();
            floatRef.element = f;
            if (decayAnimationSpec != null && Math.abs(f) > 1.0f) {
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBar.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animateDecay) {
                        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
                        float fFloatValue = animateDecay.getValue().floatValue() - floatRef3.element;
                        float heightOffset = topAppBarState2.getHeightOffset();
                        topAppBarState2.setHeightOffset(heightOffset + fFloatValue);
                        float fAbs = Math.abs(heightOffset - topAppBarState2.getHeightOffset());
                        floatRef3.element = animateDecay.getValue().floatValue();
                        floatRef.element = animateDecay.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                            animateDecay.cancelAnimation();
                        }
                    }
                };
                c052012.L$0 = topAppBarState2;
                animationSpec2 = animationSpec;
                c052012.L$1 = animationSpec2;
                c052012.L$2 = floatRef;
                c052012.label = 1;
                if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, function1, c052012, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            animationSpec2 = animationSpec;
        } else {
            if (i != 1) {
                if (i == 2) {
                    floatRef2 = (Ref.FloatRef) c052012.L$0;
                    ResultKt.throwOnFailure(obj);
                    floatRef = floatRef2;
                    return Velocity.m6345boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.FloatRef floatRef4 = (Ref.FloatRef) c052012.L$2;
            AnimationSpec<Float> animationSpec3 = (AnimationSpec) c052012.L$1;
            TopAppBarState topAppBarState3 = (TopAppBarState) c052012.L$0;
            ResultKt.throwOnFailure(obj);
            floatRef = floatRef4;
            animationSpec2 = animationSpec3;
            topAppBarState2 = topAppBarState3;
        }
        AnimationSpec<Float> animationSpec4 = animationSpec2;
        if (animationSpec4 != null && topAppBarState2.getHeightOffset() < 0.0f && topAppBarState2.getHeightOffset() > topAppBarState2.getHeightOffsetLimit()) {
            AnimationState animationStateAnimationState$default2 = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            Float fBoxFloat = Boxing.boxFloat(topAppBarState2.getCollapsedFraction() < 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit());
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBar.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Float, AnimationVector1D> animateTo) {
                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                    topAppBarState2.setHeightOffset(animateTo.getValue().floatValue());
                }
            };
            c052012.L$0 = floatRef;
            c052012.L$1 = null;
            c052012.L$2 = null;
            c052012.label = 2;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default2, fBoxFloat, animationSpec4, false, function12, c052012, 4, null) != coroutine_suspended) {
                floatRef2 = floatRef;
                floatRef = floatRef2;
            }
            return coroutine_suspended;
        }
        return Velocity.m6345boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    /* renamed from: SingleRowTopAppBar$lambda-3, reason: not valid java name */
    private static final long m2123SingleRowTopAppBar$lambda3(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }

    /* renamed from: TwoRowsTopAppBar_tjU4iQQ$lambda-8, reason: not valid java name */
    private static final long m2126TwoRowsTopAppBar_tjU4iQQ$lambda8(State<Color> state) {
        return state.getValue().m3667unboximpl();
    }

    static {
        float f = 16;
        float f2 = 12;
        float fM6117constructorimpl = Dp.m6117constructorimpl(Dp.m6117constructorimpl(f) - Dp.m6117constructorimpl(f2));
        BottomAppBarHorizontalPadding = fM6117constructorimpl;
        float fM6117constructorimpl2 = Dp.m6117constructorimpl(Dp.m6117constructorimpl(f) - Dp.m6117constructorimpl(f2));
        BottomAppBarVerticalPadding = fM6117constructorimpl2;
        FABHorizontalPadding = Dp.m6117constructorimpl(Dp.m6117constructorimpl(f) - fM6117constructorimpl);
        FABVerticalPadding = Dp.m6117constructorimpl(Dp.m6117constructorimpl(f2) - fM6117constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m6117constructorimpl(24);
        LargeTitleBottomPadding = Dp.m6117constructorimpl(28);
        float fM6117constructorimpl3 = Dp.m6117constructorimpl(4);
        TopAppBarHorizontalPadding = fM6117constructorimpl3;
        TopAppBarTitleInset = Dp.m6117constructorimpl(Dp.m6117constructorimpl(f) - fM6117constructorimpl3);
    }
}
