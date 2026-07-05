package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
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
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a¦\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a¼\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0097\u0001\u0010(\u001a\u00020\b2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0001H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a¦\u0001\u0010.\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a®\u0001\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00104\u001a\u008f\u0001\u00105\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00107\u001a®\u0001\u00108\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00104\u001aÅ\u0001\u00109\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010:\u001aÑ\u0001\u0010;\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002012\b\u0010\u0017\u001a\u0004\u0018\u0001022\b\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u008f\u0001\u0010>\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00107\u001a&\u0010?\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u00102\b\b\u0002\u0010A\u001a\u00020\u00102\b\b\u0002\u0010B\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"AssistChipPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "FilterChipPadding", "HorizontalElementsPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SuggestionChipPadding", "AssistChip", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "label", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "leadingIcon", "trailingIcon", "shape", "Landroidx/compose/ui/graphics/Shape;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/ChipColors;", "elevation", "Landroidx/compose/material3/ChipElevation;", "border", "Landroidx/compose/material3/ChipBorder;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Chip", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "labelColor", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/foundation/BorderStroke;", ViewProps.MIN_HEIGHT, "paddingValues", "Chip-nkUnTEs", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ChipContent", "avatar", "leadingIconColor", "trailingIconColor", "ChipContent-fe0OD_I", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "ElevatedAssistChip", "ElevatedFilterChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "Landroidx/compose/material3/SelectableChipBorder;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedSuggestionChip", PaymentSheetAppearanceKeys.ICON, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "InputChip", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SelectableChip", "SelectableChip-u0RnIRE", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SuggestionChip", "inputChipPadding", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final PaddingValues AssistChipPadding;
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;
    private static final PaddingValues SuggestionChipPadding;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0376 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistChip(final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i7;
        Shape shape2;
        ChipColors chipColors2;
        int i8;
        int i9;
        int i10;
        Modifier.Companion companion;
        int i11;
        Composer composer2;
        int i12;
        ChipColors chipColorsM2130assistChipColorsoq7We08;
        ChipElevation chipElevationM2131assistChipElevationaqJV_2Y;
        ChipBorder chipBorderM2129assistChipBorderd_3_b6Q;
        Shape shape3;
        ChipBorder chipBorder2;
        ChipColors chipColors3;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer3;
        final Modifier modifier3;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Shape shape4;
        final ChipColors chipColors4;
        final ChipElevation chipElevation2;
        final MutableInteractionSource mutableInteractionSource3;
        final ChipBorder chipBorder3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1932300596);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)111@5649L5,112@5700L18,113@5771L21,114@5839L18,115@5909L39,121@6085L10,122@6163L19,128@6342L21,116@5954L543:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & 57344) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changed(function23) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i4 |= composerStartRestartGroup.changed(function22) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape2)) ? 1048576 : 524288;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColors2 = chipColors;
                            int i14 = composerStartRestartGroup.changed(chipColors2) ? 8388608 : 4194304;
                            i4 |= i14;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i4 |= i14;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 234881024) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i & 1879048192) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(chipBorder)) ? 536870912 : 268435456;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i9 = i8;
                        i10 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i9 = i8;
                        i10 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    if ((i4 & 1533916891) != 306783378 && (i10 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        function27 = function22;
                        chipBorder3 = chipBorder;
                        chipColors4 = chipColors2;
                        modifier3 = modifier2;
                        composer3 = composerStartRestartGroup;
                        function26 = function23;
                        chipElevation2 = chipElevation;
                        mutableInteractionSource3 = mutableInteractionSource;
                        shape4 = shape2;
                        z4 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            companion = i13 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i5 == 0 ? true : z2;
                            Function2<? super Composer, ? super Integer, Unit> function28 = i6 == 0 ? null : function23;
                            Function2<? super Composer, ? super Integer, Unit> function29 = i7 == 0 ? null : function22;
                            if ((i3 & 64) != 0) {
                                shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i4 &= -3670017;
                            }
                            int i15 = i4;
                            if ((i3 & 128) == 0) {
                                composer2 = composerStartRestartGroup;
                                i12 = i9;
                                i11 = i10;
                                i15 &= -29360129;
                                chipColorsM2130assistChipColorsoq7We08 = AssistChipDefaults.INSTANCE.m2130assistChipColorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 100663296, 255);
                            } else {
                                i11 = i10;
                                composer2 = composerStartRestartGroup;
                                i12 = i9;
                                chipColorsM2130assistChipColorsoq7We08 = chipColors2;
                            }
                            if ((i3 & 256) == 0) {
                                i15 &= -234881025;
                                chipElevationM2131assistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m2131assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                            } else {
                                chipElevationM2131assistChipElevationaqJV_2Y = chipElevation;
                            }
                            if ((i3 & 512) == 0) {
                                composerStartRestartGroup = composer2;
                                chipBorderM2129assistChipBorderd_3_b6Q = AssistChipDefaults.INSTANCE.m2129assistChipBorderd_3_b6Q(0L, 0L, 0.0f, composerStartRestartGroup, 3072, 7);
                                i15 &= -1879048193;
                            } else {
                                composerStartRestartGroup = composer2;
                                chipBorderM2129assistChipBorderd_3_b6Q = chipBorder;
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
                                shape3 = shape2;
                                chipBorder2 = chipBorderM2129assistChipBorderd_3_b6Q;
                                chipColors3 = chipColorsM2130assistChipColorsoq7We08;
                                z3 = z5;
                                function24 = function28;
                                function25 = function29;
                                i4 = i15;
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                shape3 = shape2;
                                chipBorder2 = chipBorderM2129assistChipBorderd_3_b6Q;
                                chipColors3 = chipColorsM2130assistChipColorsoq7We08;
                                z3 = z5;
                                function24 = function28;
                                function25 = function29;
                                i4 = i15;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            function25 = function22;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i11 = i10;
                            chipColors3 = chipColors2;
                            companion = modifier2;
                            z3 = z2;
                            function24 = function23;
                            chipElevationM2131assistChipElevationaqJV_2Y = chipElevation;
                            shape3 = shape2;
                            chipBorder2 = chipBorder;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1932300596, i4, i11, "androidx.compose.material3.AssistChip (Chip.kt:104)");
                        }
                        TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                        int i16 = (i4 >> 9) & 14;
                        long jM3667unboximpl = chipColors3.labelColor$material3_release(z3, composerStartRestartGroup, ((i4 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i16).getValue().m3667unboximpl();
                        State<BorderStroke> stateBorderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z3, composerStartRestartGroup, i16 | ((i4 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                        composer3 = composerStartRestartGroup;
                        ChipElevation chipElevation3 = chipElevationM2131assistChipElevationaqJV_2Y;
                        Modifier modifier4 = companion;
                        int i17 = i4 << 6;
                        ChipBorder chipBorder4 = chipBorder2;
                        m2161ChipnkUnTEs(modifier4, onClick, z3, label, textStyleFromToken, jM3667unboximpl, function24, function25, shape3, chipColors3, chipElevation3, stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null, AssistChipDefaults.INSTANCE.m2134getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composer3, (i17 & 1879048192) | ((i4 >> 6) & 14) | ((i4 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 >> 3) & 896) | (i17 & 7168) | (i17 & 3670016) | (i17 & 29360128) | (i17 & 234881024), ((i4 >> 24) & 14) | 3456 | ((i11 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z3;
                        function26 = function24;
                        function27 = function25;
                        shape4 = shape3;
                        chipColors4 = chipColors3;
                        chipElevation2 = chipElevation3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        chipBorder3 = chipBorder4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.AssistChip.2
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

                        public final void invoke(Composer composer4, int i18) {
                            ChipKt.AssistChip(onClick, label, modifier3, z4, function26, function27, shape4, chipColors4, chipElevation2, chipBorder3, mutableInteractionSource3, composer4, i | 1, i2, i3);
                        }
                    });
                    return;
                }
                i4 |= 24576;
                function23 = function2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i & 1879048192) == 0) {
                }
                i8 = i3 & 1024;
                if (i8 == 0) {
                }
                if ((i4 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        int i152 = i4;
                        if ((i3 & 128) == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                        int i162 = (i4 >> 9) & 14;
                        long jM3667unboximpl2 = chipColors3.labelColor$material3_release(z3, composerStartRestartGroup, ((i4 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i162).getValue().m3667unboximpl();
                        if (chipBorder2 != null) {
                        }
                        composer3 = composerStartRestartGroup;
                        ChipElevation chipElevation32 = chipElevationM2131assistChipElevationaqJV_2Y;
                        Modifier modifier42 = companion;
                        int i172 = i4 << 6;
                        ChipBorder chipBorder42 = chipBorder2;
                        m2161ChipnkUnTEs(modifier42, onClick, z3, label, textStyleFromToken2, jM3667unboximpl2, function24, function25, shape3, chipColors3, chipElevation32, stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null, AssistChipDefaults.INSTANCE.m2134getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composer3, (i172 & 1879048192) | ((i4 >> 6) & 14) | ((i4 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 >> 3) & 896) | (i172 & 7168) | (i172 & 3670016) | (i172 & 29360128) | (i172 & 234881024), ((i4 >> 24) & 14) | 3456 | ((i11 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        z4 = z3;
                        function26 = function24;
                        function27 = function25;
                        shape4 = shape3;
                        chipColors4 = chipColors3;
                        chipElevation2 = chipElevation32;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        chipBorder3 = chipBorder42;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            function23 = function2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        function23 = function2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x037a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedAssistChip(final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i7;
        Shape shape2;
        ChipColors chipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier.Companion companion;
        int i13;
        Composer composer2;
        int i14;
        int i15;
        ChipColors chipColorsM2132elevatedAssistChipColorsoq7We08;
        ChipElevation chipElevationM2133elevatedAssistChipElevationaqJV_2Y;
        Shape shape3;
        ChipElevation chipElevation2;
        ChipBorder chipBorder2;
        ChipColors chipColors3;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer3;
        final Modifier modifier3;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Shape shape4;
        final ChipColors chipColors4;
        final ChipElevation chipElevation3;
        final MutableInteractionSource mutableInteractionSource3;
        final ChipBorder chipBorder3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(1295844802);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)183@9378L5,184@9429L26,185@9508L29,187@9621L39,193@9796L10,194@9874L19,188@9665L543:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 57344) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changed(function23) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i4 |= composerStartRestartGroup.changed(function22) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape2)) ? 1048576 : 524288;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColors2 = chipColors;
                            int i17 = composerStartRestartGroup.changed(chipColors2) ? 8388608 : 4194304;
                            i4 |= i17;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i4 |= i17;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 234881024) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                        if ((i & 1879048192) == 0) {
                            i9 = i8;
                            i4 |= composerStartRestartGroup.changed(chipBorder) ? 536870912 : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 14) == 0) {
                            i11 = i10;
                            i12 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if ((i4 & 1533916891) == 306783378 && (i12 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function27 = function22;
                            chipBorder3 = chipBorder;
                            chipColors4 = chipColors2;
                            modifier3 = modifier2;
                            composer3 = composerStartRestartGroup;
                            function26 = function23;
                            chipElevation3 = chipElevation;
                            shape4 = shape2;
                            z4 = z2;
                            mutableInteractionSource3 = mutableInteractionSource;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i16 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i5 == 0 ? true : z2;
                                Function2<? super Composer, ? super Integer, Unit> function28 = i6 == 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function29 = i7 == 0 ? null : function22;
                                if ((i3 & 64) != 0) {
                                    shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                    i4 &= -3670017;
                                }
                                int i18 = i4;
                                if ((i3 & 128) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    i14 = i9;
                                    i15 = i11;
                                    i13 = i12;
                                    i18 &= -29360129;
                                    chipColorsM2132elevatedAssistChipColorsoq7We08 = AssistChipDefaults.INSTANCE.m2132elevatedAssistChipColorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 100663296, 255);
                                } else {
                                    i13 = i12;
                                    composer2 = composerStartRestartGroup;
                                    i14 = i9;
                                    i15 = i11;
                                    chipColorsM2132elevatedAssistChipColorsoq7We08 = chipColors2;
                                }
                                if ((i3 & 256) == 0) {
                                    composerStartRestartGroup = composer2;
                                    chipElevationM2133elevatedAssistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m2133elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    i18 &= -234881025;
                                } else {
                                    composerStartRestartGroup = composer2;
                                    chipElevationM2133elevatedAssistChipElevationaqJV_2Y = chipElevation;
                                }
                                ChipBorder chipBorder4 = i14 == 0 ? null : chipBorder;
                                if (i15 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    shape3 = shape2;
                                    chipElevation2 = chipElevationM2133elevatedAssistChipElevationaqJV_2Y;
                                    chipBorder2 = chipBorder4;
                                    chipColors3 = chipColorsM2132elevatedAssistChipColorsoq7We08;
                                    z3 = z5;
                                    function25 = function29;
                                    i4 = i18;
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    function24 = function28;
                                } else {
                                    shape3 = shape2;
                                    chipElevation2 = chipElevationM2133elevatedAssistChipElevationaqJV_2Y;
                                    chipBorder2 = chipBorder4;
                                    chipColors3 = chipColorsM2132elevatedAssistChipColorsoq7We08;
                                    z3 = z5;
                                    function24 = function28;
                                    function25 = function29;
                                    i4 = i18;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                function25 = function22;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i13 = i12;
                                chipColors3 = chipColors2;
                                companion = modifier2;
                                z3 = z2;
                                function24 = function23;
                                chipElevation2 = chipElevation;
                                shape3 = shape2;
                                chipBorder2 = chipBorder;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1295844802, i4, i13, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:176)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                            int i19 = (i4 >> 9) & 14;
                            long jM3667unboximpl = chipColors3.labelColor$material3_release(z3, composerStartRestartGroup, ((i4 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i19).getValue().m3667unboximpl();
                            float fM2134getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m2134getHeightD9Ej5fM();
                            PaddingValues paddingValues = AssistChipPadding;
                            Modifier modifier4 = companion;
                            composerStartRestartGroup.startReplaceableGroup(-227039467);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "202@10135L21");
                            State<BorderStroke> stateBorderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z3, composerStartRestartGroup, i19 | ((i4 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                            composerStartRestartGroup.endReplaceableGroup();
                            BorderStroke value = stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null;
                            int i20 = i4 << 6;
                            ChipBorder chipBorder5 = chipBorder2;
                            Composer composer4 = composerStartRestartGroup;
                            m2161ChipnkUnTEs(modifier4, onClick, z3, label, textStyleFromToken, jM3667unboximpl, function24, function25, shape3, chipColors3, chipElevation2, value, fM2134getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composer4, (i20 & 1879048192) | ((i4 >> 6) & 14) | ((i4 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 >> 3) & 896) | (i20 & 7168) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024), ((i4 >> 24) & 14) | 3456 | ((i13 << 12) & 57344));
                            composer3 = composer4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z3;
                            function26 = function24;
                            function27 = function25;
                            shape4 = shape3;
                            chipColors4 = chipColors3;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            chipBorder3 = chipBorder5;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedAssistChip.2
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

                            public final void invoke(Composer composer5, int i21) {
                                ChipKt.ElevatedAssistChip(onClick, label, modifier3, z4, function26, function27, shape4, chipColors4, chipElevation3, chipBorder3, mutableInteractionSource3, composer5, i | 1, i2, i3);
                            }
                        });
                        return;
                    }
                    i4 |= 805306368;
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i3 & 64) != 0) {
                            }
                            int i182 = i4;
                            if ((i3 & 128) == 0) {
                            }
                            if ((i3 & 256) == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                            int i192 = (i4 >> 9) & 14;
                            long jM3667unboximpl2 = chipColors3.labelColor$material3_release(z3, composerStartRestartGroup, ((i4 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i192).getValue().m3667unboximpl();
                            float fM2134getHeightD9Ej5fM2 = AssistChipDefaults.INSTANCE.m2134getHeightD9Ej5fM();
                            PaddingValues paddingValues2 = AssistChipPadding;
                            Modifier modifier42 = companion;
                            composerStartRestartGroup.startReplaceableGroup(-227039467);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "202@10135L21");
                            if (chipBorder2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateBorderStroke$material3_release != null) {
                            }
                            int i202 = i4 << 6;
                            ChipBorder chipBorder52 = chipBorder2;
                            Composer composer42 = composerStartRestartGroup;
                            m2161ChipnkUnTEs(modifier42, onClick, z3, label, textStyleFromToken2, jM3667unboximpl2, function24, function25, shape3, chipColors3, chipElevation2, value, fM2134getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource2, composer42, (i202 & 1879048192) | ((i4 >> 6) & 14) | ((i4 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 >> 3) & 896) | (i202 & 7168) | (i202 & 3670016) | (i202 & 29360128) | (i202 & 234881024), ((i4 >> 24) & 14) | 3456 | ((i13 << 12) & 57344));
                            composer3 = composer42;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            z4 = z3;
                            function26 = function24;
                            function27 = function25;
                            shape4 = shape3;
                            chipColors4 = chipColors3;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            chipBorder3 = chipBorder52;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function23 = function2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function23 = function2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function23 = function2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, SelectableChipBorder selectableChipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        SelectableChipElevation selectableChipElevationM2304filterChipElevationaqJV_2Y;
        int i8;
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        int i11;
        Modifier.Companion companion;
        Shape shape3;
        Composer composer2;
        int i12;
        SelectableChipColors selectableChipColorsM2303filterChipColorsXqyqHi0;
        SelectableChipBorder selectableChipBorderM2302filterChipBordergHcDVlo;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipElevation selectableChipElevation2;
        SelectableChipBorder selectableChipBorder2;
        SelectableChipColors selectableChipColors3;
        int i13;
        boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape4;
        int i14;
        Composer composer3;
        final Modifier modifier3;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Shape shape5;
        final SelectableChipColors selectableChipColors4;
        final SelectableChipElevation selectableChipElevation3;
        final MutableInteractionSource mutableInteractionSource4;
        final SelectableChipBorder selectableChipBorder3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1878072905);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilterChip)P(9,8,5,7,3,6,11,10,1,2)265@13531L5,266@13592L18,267@13673L21,268@13751L18,269@13821L39,276@14031L10,270@13865L556:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(label) ? 256 : 128;
        }
        int i15 = i3 & 8;
        if (i15 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z2;
                    i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= composerStartRestartGroup.changed(function2) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function23 = function22;
                } else {
                    function23 = function22;
                    if ((i & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changed(function23) ? 1048576 : 524288;
                    }
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        int i16 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                        i4 |= i16;
                    } else {
                        shape2 = shape;
                    }
                    i4 |= i16;
                } else {
                    shape2 = shape;
                }
                if ((i & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        int i17 = composerStartRestartGroup.changed(selectableChipColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i4 |= i17;
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i4 |= i17;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 1879048192) == 0) {
                    if ((i3 & 512) == 0) {
                        selectableChipElevationM2304filterChipElevationaqJV_2Y = selectableChipElevation;
                        int i18 = composerStartRestartGroup.changed(selectableChipElevationM2304filterChipElevationaqJV_2Y) ? 536870912 : 268435456;
                        i4 |= i18;
                    } else {
                        selectableChipElevationM2304filterChipElevationaqJV_2Y = selectableChipElevation;
                    }
                    i4 |= i18;
                } else {
                    selectableChipElevationM2304filterChipElevationaqJV_2Y = selectableChipElevation;
                }
                if ((i2 & 14) == 0) {
                    i8 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(selectableChipBorder)) ? 4 : 2);
                } else {
                    i8 = i2;
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i10 = i9;
                    i11 = i8 | 48;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                        i10 = i9;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i8 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 32 : 16;
                    } else {
                        i10 = i9;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i11 = i8;
                }
                if ((i4 & 1533916891) == 306783378 && (i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function24 = function2;
                    selectableChipColors4 = selectableChipColors2;
                    modifier3 = modifier2;
                    composer3 = composerStartRestartGroup;
                    selectableChipBorder3 = selectableChipBorder;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    function25 = function23;
                    shape5 = shape2;
                    selectableChipElevation3 = selectableChipElevationM2304filterChipElevationaqJV_2Y;
                    z5 = z3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        companion = i15 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z6 = i5 == 0 ? true : z3;
                        Function2<? super Composer, ? super Integer, Unit> function26 = i6 == 0 ? null : function2;
                        Function2<? super Composer, ? super Integer, Unit> function27 = i7 == 0 ? null : function23;
                        if ((i3 & 128) == 0) {
                            i4 &= -29360129;
                            shape3 = FilterChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            shape3 = shape2;
                        }
                        int i19 = i4;
                        if ((i3 & 256) == 0) {
                            i12 = i10;
                            composer2 = composerStartRestartGroup;
                            i19 &= -234881025;
                            selectableChipColorsM2303filterChipColorsXqyqHi0 = FilterChipDefaults.INSTANCE.m2303filterChipColorsXqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 4095);
                        } else {
                            composer2 = composerStartRestartGroup;
                            i12 = i10;
                            selectableChipColorsM2303filterChipColorsXqyqHi0 = selectableChipColors2;
                        }
                        if ((i3 & 512) != 0) {
                            selectableChipElevationM2304filterChipElevationaqJV_2Y = FilterChipDefaults.INSTANCE.m2304filterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                            i19 &= -1879048193;
                        }
                        if ((i3 & 1024) == 0) {
                            Composer composer4 = composer2;
                            selectableChipBorderM2302filterChipBordergHcDVlo = FilterChipDefaults.INSTANCE.m2302filterChipBordergHcDVlo(0L, 0L, 0L, 0L, 0.0f, 0.0f, composer4, 1572864, 63);
                            composerStartRestartGroup = composer4;
                            i11 &= -15;
                        } else {
                            composerStartRestartGroup = composer2;
                            selectableChipBorderM2302filterChipBordergHcDVlo = selectableChipBorder;
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
                            selectableChipElevation2 = selectableChipElevationM2304filterChipElevationaqJV_2Y;
                            selectableChipBorder2 = selectableChipBorderM2302filterChipBordergHcDVlo;
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            selectableChipElevation2 = selectableChipElevationM2304filterChipElevationaqJV_2Y;
                            selectableChipBorder2 = selectableChipBorderM2302filterChipBordergHcDVlo;
                        }
                        selectableChipColors3 = selectableChipColorsM2303filterChipColorsXqyqHi0;
                        i13 = i11;
                        z4 = z6;
                        function24 = function26;
                        function23 = function27;
                        shape4 = shape3;
                        i14 = i19;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 &= -15;
                        }
                        shape4 = shape2;
                        selectableChipColors3 = selectableChipColors2;
                        companion = modifier2;
                        z4 = z3;
                        i13 = i11;
                        selectableChipElevation2 = selectableChipElevationM2304filterChipElevationaqJV_2Y;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        selectableChipBorder2 = selectableChipBorder;
                        i14 = i4;
                        function24 = function2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1878072905, i14, i13, "androidx.compose.material3.FilterChip (Chip.kt:257)");
                    }
                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
                    float fM2305getHeightD9Ej5fM = FilterChipDefaults.INSTANCE.m2305getHeightD9Ej5fM();
                    PaddingValues paddingValues = FilterChipPadding;
                    Modifier modifier4 = companion;
                    composerStartRestartGroup.startReplaceableGroup(276171483);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "285@14338L31");
                    State<BorderStroke> stateBorderStroke$material3_release = selectableChipBorder2 != null ? null : selectableChipBorder2.borderStroke$material3_release(z4, z, composerStartRestartGroup, ((i14 >> 12) & 14) | ((i14 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i13 << 6) & 896));
                    composerStartRestartGroup.endReplaceableGroup();
                    int i20 = i14 << 3;
                    BorderStroke value = stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null;
                    int i21 = i14 << 6;
                    int i22 = ((i14 >> 3) & 7168) | (i14 & 14) | 12582912 | ((i14 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i20 & 896) | (i21 & 57344) | (i20 & 3670016) | (i21 & 234881024) | (i21 & 1879048192);
                    int i23 = i14 >> 24;
                    composer3 = composerStartRestartGroup;
                    SelectableChipBorder selectableChipBorder4 = selectableChipBorder2;
                    m2163SelectableChipu0RnIRE(z, modifier4, onClick, z4, label, textStyleFromToken, function24, null, function23, shape4, selectableChipColors3, selectableChipElevation2, value, fM2305getHeightD9Ej5fM, paddingValues, mutableInteractionSource3, composer3, i22, (i23 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i23 & 14) | 27648 | ((i13 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z5 = z4;
                    function25 = function23;
                    shape5 = shape4;
                    selectableChipColors4 = selectableChipColors3;
                    selectableChipElevation3 = selectableChipElevation2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    selectableChipBorder3 = selectableChipBorder4;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.FilterChip.2
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

                    public final void invoke(Composer composer5, int i24) {
                        ChipKt.FilterChip(z, onClick, label, modifier3, z5, function24, function25, shape5, selectableChipColors4, selectableChipElevation3, selectableChipBorder3, mutableInteractionSource4, composer5, i | 1, i2, i3);
                    }
                });
                return;
            }
            i4 |= 24576;
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            if ((i2 & 14) == 0) {
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    int i192 = i4;
                    if ((i3 & 256) == 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if (i12 == 0) {
                    }
                    selectableChipColors3 = selectableChipColorsM2303filterChipColorsXqyqHi0;
                    i13 = i11;
                    z4 = z6;
                    function24 = function26;
                    function23 = function27;
                    shape4 = shape3;
                    i14 = i192;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
                    float fM2305getHeightD9Ej5fM2 = FilterChipDefaults.INSTANCE.m2305getHeightD9Ej5fM();
                    PaddingValues paddingValues2 = FilterChipPadding;
                    Modifier modifier42 = companion;
                    composerStartRestartGroup.startReplaceableGroup(276171483);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "285@14338L31");
                    if (selectableChipBorder2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i202 = i14 << 3;
                    BorderStroke value2 = stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null;
                    int i212 = i14 << 6;
                    int i222 = ((i14 >> 3) & 7168) | (i14 & 14) | 12582912 | ((i14 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i202 & 896) | (i212 & 57344) | (i202 & 3670016) | (i212 & 234881024) | (i212 & 1879048192);
                    int i232 = i14 >> 24;
                    composer3 = composerStartRestartGroup;
                    SelectableChipBorder selectableChipBorder42 = selectableChipBorder2;
                    m2163SelectableChipu0RnIRE(z, modifier42, onClick, z4, label, textStyleFromToken2, function24, null, function23, shape4, selectableChipColors3, selectableChipElevation2, value2, fM2305getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource3, composer3, i222, (i232 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i232 & 14) | 27648 | ((i13 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    z5 = z4;
                    function25 = function23;
                    shape5 = shape4;
                    selectableChipColors4 = selectableChipColors3;
                    selectableChipElevation3 = selectableChipElevation2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    selectableChipBorder3 = selectableChipBorder42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i2 & 14) == 0) {
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedFilterChip(final boolean z, final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, SelectableChipBorder selectableChipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        SelectableChipElevation selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier.Companion companion;
        Shape shape3;
        int i13;
        Composer composer2;
        int i14;
        int i15;
        SelectableChipColors selectableChipColorsM2300elevatedFilterChipColorsXqyqHi0;
        int i16;
        MutableInteractionSource mutableInteractionSource2;
        SelectableChipElevation selectableChipElevation2;
        SelectableChipBorder selectableChipBorder2;
        SelectableChipColors selectableChipColors3;
        boolean z4;
        Shape shape4;
        int i17;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        Composer composer3;
        final Modifier modifier3;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Shape shape5;
        final SelectableChipColors selectableChipColors4;
        final SelectableChipElevation selectableChipElevation3;
        final MutableInteractionSource mutableInteractionSource3;
        final SelectableChipBorder selectableChipBorder3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(1904578605);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedFilterChip)P(9,8,5,7,3,6,11,10,1,2)345@17629L5,346@17690L26,347@17779L29,349@17902L39,356@18112L10,350@17946L556:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(label) ? 256 : 128;
        }
        int i18 = i3 & 8;
        if (i18 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z2;
                    i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i4 |= composerStartRestartGroup.changed(function2) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function23 = function22;
                } else {
                    function23 = function22;
                    if ((i & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changed(function23) ? 1048576 : 524288;
                    }
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        int i19 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                        i4 |= i19;
                    } else {
                        shape2 = shape;
                    }
                    i4 |= i19;
                } else {
                    shape2 = shape;
                }
                if ((i & 234881024) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        int i20 = composerStartRestartGroup.changed(selectableChipColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i4 |= i20;
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i4 |= i20;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 1879048192) == 0) {
                    if ((i3 & 512) == 0) {
                        selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y = selectableChipElevation;
                        int i21 = composerStartRestartGroup.changed(selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y) ? 536870912 : 268435456;
                        i4 |= i21;
                    } else {
                        selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y = selectableChipElevation;
                    }
                    i4 |= i21;
                } else {
                    selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y = selectableChipElevation;
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i10 = i2 | 6;
                    i9 = i8;
                } else if ((i2 & 14) == 0) {
                    i9 = i8;
                    i10 = i2 | (composerStartRestartGroup.changed(selectableChipBorder) ? 4 : 2);
                } else {
                    i9 = i8;
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                    i12 = i11;
                } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                    i12 = i11;
                    i10 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                } else {
                    i12 = i11;
                }
                int i22 = i10;
                if ((i4 & 1533916891) == 306783378 && (i22 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function24 = function2;
                    function25 = function23;
                    shape5 = shape2;
                    selectableChipColors4 = selectableChipColors2;
                    modifier3 = modifier2;
                    composer3 = composerStartRestartGroup;
                    selectableChipBorder3 = selectableChipBorder;
                    mutableInteractionSource3 = mutableInteractionSource;
                    selectableChipElevation3 = selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y;
                    z5 = z3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        companion = i18 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z6 = i5 == 0 ? true : z3;
                        Function2<? super Composer, ? super Integer, Unit> function26 = i6 == 0 ? null : function2;
                        Function2<? super Composer, ? super Integer, Unit> function27 = i7 == 0 ? null : function23;
                        if ((i3 & 128) == 0) {
                            i4 &= -29360129;
                            shape3 = FilterChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            shape3 = shape2;
                        }
                        int i23 = i4;
                        if ((i3 & 256) == 0) {
                            i15 = i12;
                            i14 = i9;
                            i13 = i22;
                            composer2 = composerStartRestartGroup;
                            i23 &= -234881025;
                            selectableChipColorsM2300elevatedFilterChipColorsXqyqHi0 = FilterChipDefaults.INSTANCE.m2300elevatedFilterChipColorsXqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 4095);
                        } else {
                            i13 = i22;
                            composer2 = composerStartRestartGroup;
                            i14 = i9;
                            i15 = i12;
                            selectableChipColorsM2300elevatedFilterChipColorsXqyqHi0 = selectableChipColors2;
                        }
                        if ((i3 & 512) == 0) {
                            composerStartRestartGroup = composer2;
                            selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y = FilterChipDefaults.INSTANCE.m2301elevatedFilterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i16 = i23 & (-1879048193);
                        } else {
                            composerStartRestartGroup = composer2;
                            i16 = i23;
                        }
                        SelectableChipBorder selectableChipBorder4 = i14 == 0 ? null : selectableChipBorder;
                        if (i15 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            selectableChipElevation2 = selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y;
                            selectableChipBorder2 = selectableChipBorder4;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            selectableChipElevation2 = selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y;
                            selectableChipBorder2 = selectableChipBorder4;
                        }
                        selectableChipColors3 = selectableChipColorsM2300elevatedFilterChipColorsXqyqHi0;
                        z4 = z6;
                        function23 = function27;
                        shape4 = shape3;
                        i17 = i16;
                        function24 = function26;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        i13 = i22;
                        shape4 = shape2;
                        selectableChipColors3 = selectableChipColors2;
                        companion = modifier2;
                        z4 = z3;
                        mutableInteractionSource2 = mutableInteractionSource;
                        selectableChipElevation2 = selectableChipElevationM2301elevatedFilterChipElevationaqJV_2Y;
                        i17 = i4;
                        function24 = function2;
                        selectableChipBorder2 = selectableChipBorder;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1904578605, i17, i13, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:337)");
                    }
                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
                    float fM2305getHeightD9Ej5fM = FilterChipDefaults.INSTANCE.m2305getHeightD9Ej5fM();
                    PaddingValues paddingValues = FilterChipPadding;
                    Modifier modifier4 = companion;
                    composerStartRestartGroup.startReplaceableGroup(-790769726);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "365@18419L31");
                    State<BorderStroke> stateBorderStroke$material3_release = selectableChipBorder2 != null ? null : selectableChipBorder2.borderStroke$material3_release(z4, z, composerStartRestartGroup, ((i17 >> 12) & 14) | ((i17 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i13 << 6) & 896));
                    composerStartRestartGroup.endReplaceableGroup();
                    int i24 = i17 << 3;
                    BorderStroke value = stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null;
                    int i25 = i17 << 6;
                    int i26 = ((i17 >> 3) & 7168) | (i17 & 14) | 12582912 | ((i17 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i24 & 896) | (i25 & 57344) | (i24 & 3670016) | (i25 & 234881024) | (i25 & 1879048192);
                    int i27 = i17 >> 24;
                    composer3 = composerStartRestartGroup;
                    SelectableChipBorder selectableChipBorder5 = selectableChipBorder2;
                    m2163SelectableChipu0RnIRE(z, modifier4, onClick, z4, label, textStyleFromToken, function24, null, function23, shape4, selectableChipColors3, selectableChipElevation2, value, fM2305getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composer3, i26, (i27 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i27 & 14) | 27648 | ((i13 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z5 = z4;
                    function25 = function23;
                    shape5 = shape4;
                    selectableChipColors4 = selectableChipColors3;
                    selectableChipElevation3 = selectableChipElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    selectableChipBorder3 = selectableChipBorder5;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedFilterChip.2
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

                    public final void invoke(Composer composer4, int i28) {
                        ChipKt.ElevatedFilterChip(z, onClick, label, modifier3, z5, function24, function25, shape5, selectableChipColors4, selectableChipElevation3, selectableChipBorder3, mutableInteractionSource3, composer4, i | 1, i2, i3);
                    }
                });
                return;
            }
            i4 |= 24576;
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
            }
            int i222 = i10;
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    int i232 = i4;
                    if ((i3 & 256) == 0) {
                    }
                    if ((i3 & 512) == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    selectableChipColors3 = selectableChipColorsM2300elevatedFilterChipColorsXqyqHi0;
                    z4 = z6;
                    function23 = function27;
                    shape4 = shape3;
                    i17 = i16;
                    function24 = function26;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont());
                    float fM2305getHeightD9Ej5fM2 = FilterChipDefaults.INSTANCE.m2305getHeightD9Ej5fM();
                    PaddingValues paddingValues2 = FilterChipPadding;
                    Modifier modifier42 = companion;
                    composerStartRestartGroup.startReplaceableGroup(-790769726);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "365@18419L31");
                    if (selectableChipBorder2 != null) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i242 = i17 << 3;
                    BorderStroke value2 = stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null;
                    int i252 = i17 << 6;
                    int i262 = ((i17 >> 3) & 7168) | (i17 & 14) | 12582912 | ((i17 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i242 & 896) | (i252 & 57344) | (i242 & 3670016) | (i252 & 234881024) | (i252 & 1879048192);
                    int i272 = i17 >> 24;
                    composer3 = composerStartRestartGroup;
                    SelectableChipBorder selectableChipBorder52 = selectableChipBorder2;
                    m2163SelectableChipu0RnIRE(z, modifier42, onClick, z4, label, textStyleFromToken2, function24, null, function23, shape4, selectableChipColors3, selectableChipElevation2, value2, fM2305getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource2, composer3, i262, (i272 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i272 & 14) | 27648 | ((i13 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    z5 = z4;
                    function25 = function23;
                    shape5 = shape4;
                    selectableChipColors4 = selectableChipColors3;
                    selectableChipElevation3 = selectableChipElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    selectableChipBorder3 = selectableChipBorder52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i11 = i3 & 2048;
        if (i11 != 0) {
        }
        int i2222 = i10;
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0450 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputChip(final boolean z, final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, SelectableChipBorder selectableChipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape2;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier.Companion companion;
        Composer composer2;
        int i13;
        int i14;
        SelectableChipColors selectableChipColorsM2336inputChipColorskwJvTHA;
        SelectableChipElevation selectableChipElevationM2337inputChipElevationaqJV_2Y;
        SelectableChipBorder selectableChipBorderM2335inputChipBordergHcDVlo;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        final Shape shape3;
        SelectableChipBorder selectableChipBorder2;
        int i16;
        final SelectableChipColors selectableChipColors2;
        final SelectableChipElevation selectableChipElevation2;
        boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final int i17;
        int i18;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        State<BorderStroke> stateBorderStroke$material3_release;
        Composer composer3;
        final Modifier modifier2;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource3;
        final SelectableChipBorder selectableChipBorder3;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1599030387);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(InputChip)P(10,9,6,8,4,7!1,12,11,2,3)430@21857L5,431@21917L17,432@21996L20,433@22072L17,434@22141L39,461@23112L10,468@23372L31,455@22922L787:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(onClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(label) ? 256 : 128;
        }
        int i19 = i3 & 8;
        if (i19 == 0) {
            if ((i & 7168) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & 57344) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function24 = function2;
            } else {
                function24 = function2;
                if ((i & 458752) == 0) {
                    i4 |= composerStartRestartGroup.changed(function24) ? 131072 : 65536;
                }
            }
            i7 = i3 & 64;
            if (i7 == 0) {
                i4 |= 1572864;
                function25 = function22;
            } else {
                function25 = function22;
                if ((i & 3670016) == 0) {
                    i4 |= composerStartRestartGroup.changed(function25) ? 1048576 : 524288;
                }
            }
            i8 = i3 & 128;
            if (i8 == 0) {
                i4 |= 12582912;
                function26 = function23;
            } else {
                function26 = function23;
                if ((i & 29360128) == 0) {
                    i4 |= composerStartRestartGroup.changed(function26) ? 8388608 : 4194304;
                }
            }
            if ((i & 234881024) != 0) {
                if ((i3 & 256) == 0) {
                    shape2 = shape;
                    int i20 = composerStartRestartGroup.changed(shape2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i4 |= i20;
                } else {
                    shape2 = shape;
                }
                i4 |= i20;
            } else {
                shape2 = shape;
            }
            if ((i & 1879048192) == 0) {
                i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(selectableChipColors)) ? 536870912 : 268435456;
            }
            if ((i2 & 14) != 0) {
                i9 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(selectableChipElevation)) ? 4 : 2);
            } else {
                i9 = i2;
            }
            if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                i9 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(selectableChipBorder)) ? 32 : 16;
            }
            int i21 = i9;
            i10 = i3 & 4096;
            if (i10 == 0) {
                i11 = i10;
                i12 = i21 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                int i22 = i21;
                if ((i2 & 896) == 0) {
                    i22 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                }
                i11 = i10;
                i12 = i22;
            }
            if ((i4 & 1533916891) == 306783378 || (i12 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                int i23 = i12;
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    companion = i19 == 0 ? Modifier.INSTANCE : modifier;
                    boolean z6 = i5 == 0 ? true : z3;
                    Function2<? super Composer, ? super Integer, Unit> function211 = i6 == 0 ? null : function24;
                    Function2<? super Composer, ? super Integer, Unit> function212 = i7 == 0 ? null : function25;
                    Function2<? super Composer, ? super Integer, Unit> function213 = i8 == 0 ? null : function26;
                    if ((i3 & 256) != 0) {
                        shape2 = InputChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i4 &= -234881025;
                    }
                    int i24 = i4;
                    if ((i3 & 512) == 0) {
                        i13 = i23;
                        i14 = i11;
                        composer2 = composerStartRestartGroup;
                        selectableChipColorsM2336inputChipColorskwJvTHA = InputChipDefaults.INSTANCE.m2336inputChipColorskwJvTHA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 3072, 8191);
                        i24 &= -1879048193;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i13 = i23;
                        i14 = i11;
                        selectableChipColorsM2336inputChipColorskwJvTHA = selectableChipColors;
                    }
                    if ((i3 & 1024) == 0) {
                        Composer composer4 = composer2;
                        composer2 = composer4;
                        selectableChipElevationM2337inputChipElevationaqJV_2Y = InputChipDefaults.INSTANCE.m2337inputChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer4, 1572864, 63);
                        i13 &= -15;
                    } else {
                        selectableChipElevationM2337inputChipElevationaqJV_2Y = selectableChipElevation;
                    }
                    if ((i3 & 2048) == 0) {
                        Composer composer5 = composer2;
                        selectableChipBorderM2335inputChipBordergHcDVlo = InputChipDefaults.INSTANCE.m2335inputChipBordergHcDVlo(0L, 0L, 0L, 0L, 0.0f, 0.0f, composer5, 1572864, 63);
                        composerStartRestartGroup = composer5;
                        i15 = i13 & (-113);
                    } else {
                        composerStartRestartGroup = composer2;
                        selectableChipBorderM2335inputChipBordergHcDVlo = selectableChipBorder;
                        i15 = i13;
                    }
                    if (i14 == 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        shape3 = shape2;
                        selectableChipBorder2 = selectableChipBorderM2335inputChipBordergHcDVlo;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        shape3 = shape2;
                        selectableChipBorder2 = selectableChipBorderM2335inputChipBordergHcDVlo;
                    }
                    i16 = i15;
                    selectableChipColors2 = selectableChipColorsM2336inputChipColorskwJvTHA;
                    selectableChipElevation2 = selectableChipElevationM2337inputChipElevationaqJV_2Y;
                    z4 = z6;
                    function27 = function211;
                    function28 = function212;
                    function29 = function213;
                    i17 = i24;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                    }
                    if ((i3 & 1024) != 0) {
                        i23 &= -15;
                    }
                    if ((i3 & 2048) != 0) {
                        i23 &= -113;
                    }
                    companion = modifier;
                    selectableChipColors2 = selectableChipColors;
                    i17 = i4;
                    z4 = z3;
                    function28 = function25;
                    function29 = function26;
                    i16 = i23;
                    selectableChipBorder2 = selectableChipBorder;
                    mutableInteractionSource2 = mutableInteractionSource;
                    shape3 = shape2;
                    function27 = function24;
                    selectableChipElevation2 = selectableChipElevation;
                }
                composerStartRestartGroup.endDefaults();
                Modifier modifier3 = companion;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1599030387, i17, i16, "androidx.compose.material3.InputChip (Chip.kt:421)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1372002035);
                ComposerKt.sourceInformation(composerStartRestartGroup, "441@22531L9");
                if (function28 == null) {
                    final float f = z4 ? 1.0f : 0.38f;
                    i18 = i16;
                    final Shape shape4 = ShapesKt.toShape(InputChipTokens.INSTANCE.getAvatarShape(), composerStartRestartGroup, 6);
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -352359235, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.InputChip.2
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

                        public final void invoke(Composer composer6, int i25) {
                            ComposerKt.sourceInformation(composer6, "C444@22645L148,443@22590L311:Chip.kt#uh7d8r");
                            if ((i25 & 11) != 2 || !composer6.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-352359235, i25, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:442)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Object objValueOf = Float.valueOf(f);
                                final Shape shape5 = shape4;
                                final float f2 = f;
                                composer6.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer6, "C(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged = composer6.changed(objValueOf) | composer6.changed(shape5);
                                Object objRememberedValue2 = composer6.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ChipKt$InputChip$2$1$1
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
                                        public final void invoke2(GraphicsLayerScope graphicsLayer) {
                                            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                            graphicsLayer.setAlpha(f2);
                                            graphicsLayer.setShape(shape5);
                                            graphicsLayer.setClip(true);
                                        }
                                    };
                                    composer6.updateRememberedValue(objRememberedValue2);
                                }
                                composer6.endReplaceableGroup();
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue2);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function214 = function28;
                                int i26 = i17;
                                composer6.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer6, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer6, 6);
                                composer6.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer6, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume = composer6.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                Density density = (Density) objConsume;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume2 = composer6.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object objConsume3 = composer6.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierGraphicsLayer);
                                if (!(composer6.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer6.startReusableNode();
                                if (composer6.getInserting()) {
                                    composer6.createNode(constructor);
                                } else {
                                    composer6.useNode();
                                }
                                composer6.disableReusing();
                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer6);
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer6.enableReusing();
                                function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composer6)), composer6, 0);
                                composer6.startReplaceableGroup(2058660585);
                                composer6.startReplaceableGroup(-2137368960);
                                ComposerKt.sourceInformation(composer6, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer6.startReplaceableGroup(1586835523);
                                ComposerKt.sourceInformation(composer6, "C451@22879L8:Chip.kt#uh7d8r");
                                function214.invoke(composer6, Integer.valueOf((i26 >> 18) & 14));
                                composer6.endReplaceableGroup();
                                composer6.endReplaceableGroup();
                                composer6.endReplaceableGroup();
                                composer6.endNode();
                                composer6.endReplaceableGroup();
                                composer6.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer6.skipToGroupEnd();
                        }
                    });
                } else {
                    i18 = i16;
                    composableLambda = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), InputChipTokens.INSTANCE.getLabelTextFont());
                if (selectableChipBorder2 != null) {
                    composableLambda2 = composableLambda;
                    stateBorderStroke$material3_release = null;
                } else {
                    composableLambda2 = composableLambda;
                    stateBorderStroke$material3_release = selectableChipBorder2.borderStroke$material3_release(z4, z, composerStartRestartGroup, ((i18 << 3) & 896) | ((i17 >> 12) & 14) | ((i17 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                }
                int i25 = i17 << 3;
                Function2<? super Composer, ? super Integer, Unit> function214 = function28;
                SelectableChipBorder selectableChipBorder4 = selectableChipBorder2;
                composer3 = composerStartRestartGroup;
                m2163SelectableChipu0RnIRE(z, modifier3, onClick, z4, label, textStyleFromToken, function27, composableLambda2, function29, shape3, selectableChipColors2, selectableChipElevation2, stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null, InputChipDefaults.INSTANCE.m2333getHeightD9Ej5fM(), inputChipPadding(composableLambda2 == null, function27 == null, function29 == null), mutableInteractionSource2, composer3, (i25 & 896) | (i17 & 14) | ((i17 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i17 >> 3) & 7168) | ((i17 << 6) & 57344) | (3670016 & i25) | (234881024 & i25) | (1879048192 & i25), ((i17 >> 27) & 14) | 3072 | ((i18 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i18 << 9) & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z5 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                selectableChipBorder3 = selectableChipBorder4;
                function210 = function214;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                selectableChipColors2 = selectableChipColors;
                mutableInteractionSource3 = mutableInteractionSource;
                z5 = z3;
                function210 = function25;
                composer3 = composerStartRestartGroup;
                function29 = function26;
                selectableChipBorder3 = selectableChipBorder;
                shape3 = shape2;
                function27 = function24;
                selectableChipElevation2 = selectableChipElevation;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.InputChip.3
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

                public final void invoke(Composer composer6, int i26) {
                    ChipKt.InputChip(z, onClick, label, modifier2, z5, function27, function210, function29, shape3, selectableChipColors2, selectableChipElevation2, selectableChipBorder3, mutableInteractionSource3, composer6, i | 1, i2, i3);
                }
            });
            return;
        }
        i4 |= 3072;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        if ((i & 234881024) != 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i2 & 14) != 0) {
        }
        if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
        }
        int i212 = i9;
        i10 = i3 & 4096;
        if (i10 == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            int i232 = i12;
            if ((i & 1) != 0) {
                if (i19 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 256) != 0) {
                }
                int i242 = i4;
                if ((i3 & 512) == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if (i14 == 0) {
                }
                i16 = i15;
                selectableChipColors2 = selectableChipColorsM2336inputChipColorskwJvTHA;
                selectableChipElevation2 = selectableChipElevationM2337inputChipElevationaqJV_2Y;
                z4 = z6;
                function27 = function211;
                function28 = function212;
                function29 = function213;
                i17 = i242;
                composerStartRestartGroup.endDefaults();
                Modifier modifier32 = companion;
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceableGroup(-1372002035);
                ComposerKt.sourceInformation(composerStartRestartGroup, "441@22531L9");
                if (function28 == null) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), InputChipTokens.INSTANCE.getLabelTextFont());
                if (selectableChipBorder2 != null) {
                }
                if (stateBorderStroke$material3_release == null) {
                }
                int i252 = i17 << 3;
                Function2<? super Composer, ? super Integer, Unit> function2142 = function28;
                SelectableChipBorder selectableChipBorder42 = selectableChipBorder2;
                composer3 = composerStartRestartGroup;
                m2163SelectableChipu0RnIRE(z, modifier32, onClick, z4, label, textStyleFromToken2, function27, composableLambda2, function29, shape3, selectableChipColors2, selectableChipElevation2, stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null, InputChipDefaults.INSTANCE.m2333getHeightD9Ej5fM(), inputChipPadding(composableLambda2 == null, function27 == null, function29 == null), mutableInteractionSource2, composer3, (i252 & 896) | (i17 & 14) | ((i17 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i17 >> 3) & 7168) | ((i17 << 6) & 57344) | (3670016 & i252) | (234881024 & i252) | (1879048192 & i252), ((i17 >> 27) & 14) | 3072 | ((i18 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i18 << 9) & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
                z5 = z4;
                mutableInteractionSource3 = mutableInteractionSource2;
                selectableChipBorder3 = selectableChipBorder42;
                function210 = function2142;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x032a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuggestionChip(final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Shape shape2;
        ChipColors chipColors2;
        ChipElevation chipElevation2;
        ChipBorder chipBorderM2454suggestionChipBorderd_3_b6Q;
        int i6;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        Shape shape3;
        Composer composer2;
        int i8;
        ChipColors chipColorsM2455suggestionChipColors5tl4gsc;
        ChipElevation chipElevationM2456suggestionChipElevationaqJV_2Y;
        ChipElevation chipElevation3;
        ChipColors chipColors3;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer3;
        final Modifier modifier3;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Shape shape5;
        final ChipColors chipColors4;
        final ChipElevation chipElevation4;
        final MutableInteractionSource mutableInteractionSource4;
        final ChipBorder chipBorder2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(170629701);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)526@26415L5,527@26470L22,528@26549L25,529@26625L22,530@26699L39,536@26875L10,537@26957L19,543@27121L21,531@26744L540:Chip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 57344) == 0) {
                        function22 = function2;
                        i3 |= composerStartRestartGroup.changed(function22) ? 16384 : 8192;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i10 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i10;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 3670016) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i11 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i11;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i11;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((29360128 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            chipElevation2 = chipElevation;
                            int i12 = composerStartRestartGroup.changed(chipElevation2) ? 8388608 : 4194304;
                            i3 |= i12;
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i3 |= i12;
                    } else {
                        chipElevation2 = chipElevation;
                    }
                    if ((i & 234881024) != 0) {
                        if ((i2 & 256) == 0) {
                            chipBorderM2454suggestionChipBorderd_3_b6Q = chipBorder;
                            int i13 = composerStartRestartGroup.changed(chipBorderM2454suggestionChipBorderd_3_b6Q) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i3 |= i13;
                        } else {
                            chipBorderM2454suggestionChipBorderd_3_b6Q = chipBorder;
                        }
                        i3 |= i13;
                    } else {
                        chipBorderM2454suggestionChipBorderd_3_b6Q = chipBorder;
                    }
                    i6 = i2 & 512;
                    if (i6 != 0) {
                        if ((i & 1879048192) == 0) {
                            i7 = i6;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1533916891) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            boolean z5 = z2;
                            chipBorder2 = chipBorderM2454suggestionChipBorderd_3_b6Q;
                            z4 = z5;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            modifier3 = modifier2;
                            function24 = function22;
                            shape5 = shape2;
                            chipColors4 = chipColors2;
                            chipElevation4 = chipElevation2;
                            composer3 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z6 = i4 == 0 ? true : z2;
                                Function2<? super Composer, ? super Integer, Unit> function25 = i5 == 0 ? null : function22;
                                if ((i2 & 32) == 0) {
                                    i3 &= -458753;
                                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape3 = shape2;
                                }
                                int i14 = i3;
                                if ((i2 & 64) == 0) {
                                    i8 = i7;
                                    composer2 = composerStartRestartGroup;
                                    i14 &= -3670017;
                                    chipColorsM2455suggestionChipColors5tl4gsc = SuggestionChipDefaults.INSTANCE.m2455suggestionChipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    i8 = i7;
                                    chipColorsM2455suggestionChipColors5tl4gsc = chipColors2;
                                }
                                if ((i2 & 128) == 0) {
                                    i14 &= -29360129;
                                    chipElevationM2456suggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2456suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                                } else {
                                    chipElevationM2456suggestionChipElevationaqJV_2Y = chipElevation;
                                }
                                if ((i2 & 256) == 0) {
                                    Composer composer4 = composer2;
                                    chipBorderM2454suggestionChipBorderd_3_b6Q = SuggestionChipDefaults.INSTANCE.m2454suggestionChipBorderd_3_b6Q(0L, 0L, 0.0f, composer4, 3072, 7);
                                    composer2 = composer4;
                                    i3 = i14 & (-234881025);
                                } else {
                                    i3 = i14;
                                }
                                if (i8 == 0) {
                                    composer2.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    chipElevation3 = chipElevationM2456suggestionChipElevationaqJV_2Y;
                                    chipColors3 = chipColorsM2455suggestionChipColors5tl4gsc;
                                    z3 = z6;
                                    function23 = function25;
                                    shape4 = shape3;
                                } else {
                                    chipElevation3 = chipElevationM2456suggestionChipElevationaqJV_2Y;
                                    chipColors3 = chipColorsM2455suggestionChipColors5tl4gsc;
                                    z3 = z6;
                                    function23 = function25;
                                    shape4 = shape3;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(170629701, i3, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:520)");
                                    }
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                                    int i15 = (i3 >> 9) & 14;
                                    int i16 = i3 >> 15;
                                    long jM3667unboximpl = chipColors3.labelColor$material3_release(z3, composer2, (i16 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i15).getValue().m3667unboximpl();
                                    State<BorderStroke> stateBorderStroke$material3_release = chipBorderM2454suggestionChipBorderd_3_b6Q != null ? null : chipBorderM2454suggestionChipBorderd_3_b6Q.borderStroke$material3_release(z3, composer2, i15 | ((i3 >> 21) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                                    int i17 = i3;
                                    Modifier modifier4 = companion;
                                    int i18 = i17 << 6;
                                    int i19 = i17 << 9;
                                    ChipBorder chipBorder3 = chipBorderM2454suggestionChipBorderd_3_b6Q;
                                    Composer composer5 = composer2;
                                    m2161ChipnkUnTEs(modifier4, onClick, z3, label, textStyleFromToken, jM3667unboximpl, function23, null, shape4, chipColors3, chipElevation3, stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null, SuggestionChipDefaults.INSTANCE.m2452getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, composer5, (i18 & 3670016) | ((i17 >> 6) & 14) | 12582912 | ((i17 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i17 >> 3) & 896) | (i18 & 7168) | (i19 & 234881024) | (i19 & 1879048192), ((i17 >> 21) & 14) | 3456 | (i16 & 57344));
                                    composer3 = composer5;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z4 = z3;
                                    function24 = function23;
                                    shape5 = shape4;
                                    chipColors4 = chipColors3;
                                    chipElevation4 = chipElevation3;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    chipBorder2 = chipBorder3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                companion = modifier2;
                                z3 = z2;
                                function23 = function22;
                                shape4 = shape2;
                                chipColors3 = chipColors2;
                                composer2 = composerStartRestartGroup;
                                chipElevation3 = chipElevation2;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                            int i152 = (i3 >> 9) & 14;
                            int i162 = i3 >> 15;
                            long jM3667unboximpl2 = chipColors3.labelColor$material3_release(z3, composer2, (i162 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i152).getValue().m3667unboximpl();
                            if (chipBorderM2454suggestionChipBorderd_3_b6Q != null) {
                            }
                            int i172 = i3;
                            Modifier modifier42 = companion;
                            int i182 = i172 << 6;
                            int i192 = i172 << 9;
                            ChipBorder chipBorder32 = chipBorderM2454suggestionChipBorderd_3_b6Q;
                            Composer composer52 = composer2;
                            m2161ChipnkUnTEs(modifier42, onClick, z3, label, textStyleFromToken2, jM3667unboximpl2, function23, null, shape4, chipColors3, chipElevation3, stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null, SuggestionChipDefaults.INSTANCE.m2452getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, composer52, (i182 & 3670016) | ((i172 >> 6) & 14) | 12582912 | ((i172 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i172 >> 3) & 896) | (i182 & 7168) | (i192 & 234881024) | (i192 & 1879048192), ((i172 >> 21) & 14) | 3456 | (i162 & 57344));
                            composer3 = composer52;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            z4 = z3;
                            function24 = function23;
                            shape5 = shape4;
                            chipColors4 = chipColors3;
                            chipElevation4 = chipElevation3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            chipBorder2 = chipBorder32;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.SuggestionChip.2
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

                            public final void invoke(Composer composer6, int i20) {
                                ChipKt.SuggestionChip(onClick, label, modifier3, z4, function24, shape5, chipColors4, chipElevation4, chipBorder2, mutableInteractionSource4, composer6, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= 805306368;
                    i7 = i6;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i3 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i9 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            int i142 = i3;
                            if ((i2 & 64) == 0) {
                            }
                            if ((i2 & 128) == 0) {
                            }
                            if ((i2 & 256) == 0) {
                            }
                            if (i8 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function22 = function2;
                if ((458752 & i) != 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((29360128 & i) != 0) {
                }
                if ((i & 234881024) != 0) {
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                }
                i7 = i6;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function22 = function2;
            if ((458752 & i) != 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((29360128 & i) != 0) {
            }
            if ((i & 234881024) != 0) {
            }
            i6 = i2 & 512;
            if (i6 != 0) {
            }
            i7 = i6;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function22 = function2;
        if ((458752 & i) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((29360128 & i) != 0) {
        }
        if ((i & 234881024) != 0) {
        }
        i6 = i2 & 512;
        if (i6 != 0) {
        }
        i7 = i6;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedSuggestionChip(final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> label, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Shape shape2;
        ChipColors chipColors2;
        ChipElevation chipElevation2;
        int i6;
        int i7;
        int i8;
        int i9;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        Shape shape3;
        Composer composer2;
        int i10;
        ChipColors chipColorsM2450elevatedSuggestionChipColors5tl4gsc;
        ChipElevation chipElevationM2451elevatedSuggestionChipElevationaqJV_2Y;
        int i11;
        ChipBorder chipBorder2;
        ChipElevation chipElevation3;
        ChipColors chipColors3;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer3;
        final Modifier modifier3;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Shape shape5;
        final ChipColors chipColors4;
        final ChipElevation chipElevation4;
        final MutableInteractionSource mutableInteractionSource4;
        final ChipBorder chipBorder3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(1668751803);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)595@29967L5,596@30022L30,597@30109L33,599@30226L39,605@30402L10,606@30484L19,600@30271L540:Chip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 57344) == 0) {
                        function22 = function2;
                        i3 |= composerStartRestartGroup.changed(function22) ? 16384 : 8192;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i13 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i13;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 3670016) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i14 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i14;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i14;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((29360128 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            chipElevation2 = chipElevation;
                            int i15 = composerStartRestartGroup.changed(chipElevation2) ? 8388608 : 4194304;
                            i3 |= i15;
                        } else {
                            chipElevation2 = chipElevation;
                        }
                        i3 |= i15;
                    } else {
                        chipElevation2 = chipElevation;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                        i7 = i12;
                    } else {
                        i7 = i12;
                        if ((i & 234881024) == 0) {
                            i3 |= composerStartRestartGroup.changed(chipBorder) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                    }
                    i8 = i2 & 512;
                    if (i8 != 0) {
                        if ((i & 1879048192) == 0) {
                            i9 = i8;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1533916891) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            mutableInteractionSource4 = mutableInteractionSource2;
                            modifier3 = modifier2;
                            z4 = z2;
                            function24 = function22;
                            composer3 = composerStartRestartGroup;
                            shape5 = shape2;
                            chipColors4 = chipColors2;
                            chipElevation4 = chipElevation2;
                            chipBorder3 = chipBorder;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i4 == 0 ? true : z2;
                                Function2<? super Composer, ? super Integer, Unit> function25 = i5 == 0 ? null : function22;
                                if ((i2 & 32) == 0) {
                                    i3 &= -458753;
                                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape3 = shape2;
                                }
                                int i16 = i3;
                                if ((i2 & 64) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    i10 = i9;
                                    i16 &= -3670017;
                                    chipColorsM2450elevatedSuggestionChipColors5tl4gsc = SuggestionChipDefaults.INSTANCE.m2450elevatedSuggestionChipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composer2, 1572864, 63);
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    i10 = i9;
                                    chipColorsM2450elevatedSuggestionChipColors5tl4gsc = chipColors2;
                                }
                                if ((i2 & 128) == 0) {
                                    composerStartRestartGroup = composer2;
                                    chipElevationM2451elevatedSuggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2451elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    i11 = i16 & (-29360129);
                                } else {
                                    composerStartRestartGroup = composer2;
                                    chipElevationM2451elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
                                    i11 = i16;
                                }
                                chipBorder2 = i6 == 0 ? null : chipBorder;
                                if (i10 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    chipElevation3 = chipElevationM2451elevatedSuggestionChipElevationaqJV_2Y;
                                    i3 = i11;
                                    chipColors3 = chipColorsM2450elevatedSuggestionChipColors5tl4gsc;
                                    z3 = z5;
                                    shape4 = shape3;
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                    function23 = function25;
                                } else {
                                    chipElevation3 = chipElevationM2451elevatedSuggestionChipElevationaqJV_2Y;
                                    i3 = i11;
                                    chipColors3 = chipColorsM2450elevatedSuggestionChipColors5tl4gsc;
                                    z3 = z5;
                                    function23 = function25;
                                    shape4 = shape3;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                chipBorder2 = chipBorder;
                                companion = modifier2;
                                z3 = z2;
                                function23 = function22;
                                shape4 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation3 = chipElevation2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1668751803, i3, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:589)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                            int i17 = (i3 >> 9) & 14;
                            int i18 = i3 >> 15;
                            long jM3667unboximpl = chipColors3.labelColor$material3_release(z3, composerStartRestartGroup, (i18 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i17).getValue().m3667unboximpl();
                            float fM2452getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2452getHeightD9Ej5fM();
                            int i19 = i3;
                            PaddingValues paddingValues = SuggestionChipPadding;
                            Modifier modifier4 = companion;
                            composerStartRestartGroup.startReplaceableGroup(-1455593643);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "614@30738L21");
                            State<BorderStroke> stateBorderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z3, composerStartRestartGroup, ((i19 >> 21) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i17);
                            composerStartRestartGroup.endReplaceableGroup();
                            BorderStroke value = stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null;
                            int i20 = i19 << 6;
                            int i21 = ((i19 >> 6) & 14) | 12582912 | ((i19 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i19 >> 3) & 896) | (i20 & 7168) | (i20 & 3670016);
                            int i22 = i19 << 9;
                            ChipBorder chipBorder4 = chipBorder2;
                            Composer composer4 = composerStartRestartGroup;
                            m2161ChipnkUnTEs(modifier4, onClick, z3, label, textStyleFromToken, jM3667unboximpl, function23, null, shape4, chipColors3, chipElevation3, value, fM2452getHeightD9Ej5fM, paddingValues, mutableInteractionSource3, composer4, i21 | (i22 & 234881024) | (i22 & 1879048192), ((i19 >> 21) & 14) | 3456 | (i18 & 57344));
                            composer3 = composer4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z4 = z3;
                            function24 = function23;
                            shape5 = shape4;
                            chipColors4 = chipColors3;
                            chipElevation4 = chipElevation3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            chipBorder3 = chipBorder4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedSuggestionChip.2
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

                            public final void invoke(Composer composer5, int i23) {
                                ChipKt.ElevatedSuggestionChip(onClick, label, modifier3, z4, function24, shape5, chipColors4, chipElevation4, chipBorder3, mutableInteractionSource4, composer5, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= 805306368;
                    i9 = i8;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i3 & 1533916891) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            int i162 = i3;
                            if ((i2 & 64) == 0) {
                            }
                            if ((i2 & 128) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                            int i172 = (i3 >> 9) & 14;
                            int i182 = i3 >> 15;
                            long jM3667unboximpl2 = chipColors3.labelColor$material3_release(z3, composerStartRestartGroup, (i182 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i172).getValue().m3667unboximpl();
                            float fM2452getHeightD9Ej5fM2 = SuggestionChipDefaults.INSTANCE.m2452getHeightD9Ej5fM();
                            int i192 = i3;
                            PaddingValues paddingValues2 = SuggestionChipPadding;
                            Modifier modifier42 = companion;
                            composerStartRestartGroup.startReplaceableGroup(-1455593643);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "614@30738L21");
                            if (chipBorder2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateBorderStroke$material3_release != null) {
                            }
                            int i202 = i192 << 6;
                            int i212 = ((i192 >> 6) & 14) | 12582912 | ((i192 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i192 >> 3) & 896) | (i202 & 7168) | (i202 & 3670016);
                            int i222 = i192 << 9;
                            ChipBorder chipBorder42 = chipBorder2;
                            Composer composer42 = composerStartRestartGroup;
                            m2161ChipnkUnTEs(modifier42, onClick, z3, label, textStyleFromToken2, jM3667unboximpl2, function23, null, shape4, chipColors3, chipElevation3, value, fM2452getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource3, composer42, i212 | (i222 & 234881024) | (i222 & 1879048192), ((i192 >> 21) & 14) | 3456 | (i182 & 57344));
                            composer3 = composer42;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            z4 = z3;
                            function24 = function23;
                            shape5 = shape4;
                            chipColors4 = chipColors3;
                            chipElevation4 = chipElevation3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            chipBorder3 = chipBorder42;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function22 = function2;
                if ((458752 & i) != 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((29360128 & i) != 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                i8 = i2 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function22 = function2;
            if ((458752 & i) != 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((29360128 & i) != 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            i8 = i2 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function22 = function2;
        if ((458752 & i) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((29360128 & i) != 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i8 = i2 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalMaterial3Api
    /* renamed from: Chip-nkUnTEs, reason: not valid java name */
    public static final void m2161ChipnkUnTEs(final Modifier modifier, final Function0<Unit> function0, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final long j, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Shape shape, final ChipColors chipColors, final ChipElevation chipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i4;
        int i5;
        State<Dp> state;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1400504719);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Chip)P(10,11,3,5,7,6:c#ui.graphics.Color,8,14,13,1,2!1,9:c#ui.unit.Dp,12)1330@66857L23,1332@67020L43,1325@66719L928:Chip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            function24 = function2;
            i3 |= composerStartRestartGroup.changed(function24) ? 2048 : 1024;
        } else {
            function24 = function2;
        }
        if ((i & 57344) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= composerStartRestartGroup.changed(function22) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= composerStartRestartGroup.changed(function23) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= composerStartRestartGroup.changed(chipColors) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(chipElevation) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
        }
        int i6 = i4;
        if ((i3 & 1533916891) != 306783378 || (46811 & i6) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i3, i6, "androidx.compose.material3.Chip (Chip.kt:1308)");
            }
            int i7 = (i3 >> 6) & 14;
            long jM3667unboximpl = chipColors.containerColor$material3_release(z, composerStartRestartGroup, ((i3 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i7).getValue().m3667unboximpl();
            composerStartRestartGroup.startReplaceableGroup(64019101);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1331@66924L42");
            if (chipElevation == null) {
                i5 = i6;
                state = null;
            } else {
                i5 = i6;
                state = chipElevation.tonalElevation$material3_release(z, mutableInteractionSource, composerStartRestartGroup, i7 | ((i6 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i5 << 6) & 896));
            }
            composerStartRestartGroup.endReplaceableGroup();
            float fM6131unboximpl = state != null ? state.getValue().m6131unboximpl() : Dp.m6117constructorimpl(0);
            State<Dp> stateShadowElevation$material3_release = chipElevation == null ? null : chipElevation.shadowElevation$material3_release(z, mutableInteractionSource, composerStartRestartGroup, i7 | ((i5 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i5 << 6) & 896));
            composer2 = composerStartRestartGroup;
            final int i8 = i3;
            final Function2<? super Composer, ? super Integer, Unit> function25 = function24;
            final int i9 = i5;
            SurfaceKt.m2460Surfaceo_FOJdg(function0, modifier, z, shape, jM3667unboximpl, 0L, fM6131unboximpl, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m6131unboximpl() : Dp.m6117constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composer2, -1985962652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$1
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
                    ComposerKt.sourceInformation(composer3, "C1343@67435L32,1344@67514L33,1336@67168L473:Chip.kt#uh7d8r");
                    if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1985962652, i10, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1335)");
                        }
                        Function2<Composer, Integer, Unit> function26 = function25;
                        TextStyle textStyle2 = textStyle;
                        long j2 = j;
                        Function2<Composer, Integer, Unit> function27 = function22;
                        Function2<Composer, Integer, Unit> function28 = function23;
                        ChipColors chipColors2 = chipColors;
                        boolean z2 = z;
                        int i11 = i8;
                        long jM3667unboximpl2 = chipColors2.leadingIconContentColor$material3_release(z2, composer3, ((i11 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i11 >> 6) & 14)).getValue().m3667unboximpl();
                        ChipColors chipColors3 = chipColors;
                        boolean z3 = z;
                        int i12 = i8;
                        long jM3667unboximpl3 = chipColors3.trailingIconContentColor$material3_release(z3, composer3, ((i12 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i12 >> 6) & 14)).getValue().m3667unboximpl();
                        float f2 = f;
                        PaddingValues paddingValues2 = paddingValues;
                        int i13 = i8;
                        int i14 = ((i13 >> 9) & 896) | ((i13 >> 9) & 14) | 24576 | ((i13 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i13 >> 9) & 7168) | ((i13 >> 6) & 458752);
                        int i15 = i9;
                        ChipKt.m2162ChipContentfe0OD_I(function26, textStyle2, j2, function27, null, function28, jM3667unboximpl2, jM3667unboximpl3, f2, paddingValues2, composer3, i14 | ((i15 << 18) & 234881024) | ((i15 << 18) & 1879048192));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ((i8 >> 3) & 14) | ((i8 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i8 & 896) | ((i8 >> 15) & 7168) | ((i5 << 21) & 234881024) | ((i5 << 15) & 1879048192), 6, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$2
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
                ChipKt.m2161ChipnkUnTEs(modifier, function0, z, function2, textStyle, j, function22, function23, shape, chipColors, chipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer3, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalMaterial3Api
    /* renamed from: SelectableChip-u0RnIRE, reason: not valid java name */
    public static final void m2163SelectableChipu0RnIRE(final boolean z, final Modifier modifier, final Function0<Unit> function0, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(402951308);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SelectableChip)P(13,10,11,4,6,7,8!1,15,14,2,3!1,9:c#ui.unit.Dp,12)1378@68514L33,1381@68699L43,1372@68312L1080:Chip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(function0) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            function25 = function2;
            i3 |= composerStartRestartGroup.changed(function25) ? 16384 : 8192;
        } else {
            function25 = function2;
        }
        if ((i & 458752) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= composerStartRestartGroup.changed(function22) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= composerStartRestartGroup.changed(function23) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= composerStartRestartGroup.changed(function24) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(selectableChipColors) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i2 & 458752) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        final int i5 = i4;
        if ((i3 & 1533916891) != 306783378 || (374491 & i5) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i3, i5, "androidx.compose.material3.SelectableChip (Chip.kt:1353)");
            }
            final int i6 = i3;
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.m5431setRolekuIjeqM(semantics, Role.INSTANCE.m5413getCheckboxo7Vup1c());
                }
            }, 1, null);
            int i7 = (i6 >> 9) & 14;
            long jM3667unboximpl = selectableChipColors.containerColor$material3_release(z2, z, composerStartRestartGroup, ((i6 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i7 | ((i5 << 6) & 896)).getValue().m3667unboximpl();
            composerStartRestartGroup.startReplaceableGroup(1036661290);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1379@68591L42");
            State<Dp> state = selectableChipElevation == null ? null : selectableChipElevation.tonalElevation$material3_release(z2, mutableInteractionSource, composerStartRestartGroup, ((i5 << 3) & 896) | ((i5 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i7);
            composerStartRestartGroup.endReplaceableGroup();
            float fM6131unboximpl = state != null ? state.getValue().m6131unboximpl() : Dp.m6117constructorimpl(0);
            State<Dp> stateShadowElevation$material3_release = selectableChipElevation == null ? null : selectableChipElevation.shadowElevation$material3_release(z2, mutableInteractionSource, composerStartRestartGroup, i7 | ((i5 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i5 << 3) & 896));
            composer2 = composerStartRestartGroup;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
            SurfaceKt.m2458Surfaced85dljk(z, function0, modifierSemantics$default, z2, shape, jM3667unboximpl, 0L, fM6131unboximpl, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m6131unboximpl() : Dp.m6117constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composer2, -577614814, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$2
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
                    ComposerKt.sourceInformation(composer3, "C1391@69044L29,1393@69160L42,1394@69249L43,1386@68859L527:Chip.kt#uh7d8r");
                    if ((i8 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-577614814, i8, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:1385)");
                        }
                        SelectableChipColors selectableChipColors2 = selectableChipColors;
                        boolean z3 = z2;
                        boolean z4 = z;
                        int i9 = i6;
                        long jM3667unboximpl2 = selectableChipColors2.labelColor$material3_release(z3, z4, composer3, ((i9 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i9 >> 9) & 14) | ((i5 << 6) & 896)).getValue().m3667unboximpl();
                        SelectableChipColors selectableChipColors3 = selectableChipColors;
                        boolean z5 = z2;
                        boolean z6 = z;
                        int i10 = i6;
                        long jM3667unboximpl3 = selectableChipColors3.leadingIconContentColor$material3_release(z5, z6, composer3, ((i10 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i10 >> 9) & 14) | ((i5 << 6) & 896)).getValue().m3667unboximpl();
                        SelectableChipColors selectableChipColors4 = selectableChipColors;
                        boolean z7 = z2;
                        boolean z8 = z;
                        int i11 = i6;
                        long jM3667unboximpl4 = selectableChipColors4.trailingIconContentColor$material3_release(z7, z8, composer3, ((i11 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i11 >> 9) & 14) | ((i5 << 6) & 896)).getValue().m3667unboximpl();
                        Function2<Composer, Integer, Unit> function27 = function26;
                        TextStyle textStyle2 = textStyle;
                        Function2<Composer, Integer, Unit> function28 = function22;
                        Function2<Composer, Integer, Unit> function29 = function23;
                        Function2<Composer, Integer, Unit> function210 = function24;
                        float f2 = f;
                        PaddingValues paddingValues2 = paddingValues;
                        int i12 = i6;
                        int i13 = ((i12 >> 12) & 14) | ((i12 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i12 >> 9) & 7168) | ((i12 >> 9) & 57344) | ((i12 >> 9) & 458752);
                        int i14 = i5;
                        ChipKt.m2162ChipContentfe0OD_I(function27, textStyle2, jM3667unboximpl2, function28, function29, function210, jM3667unboximpl3, jM3667unboximpl4, f2, paddingValues2, composer3, ((i14 << 15) & 1879048192) | i13 | ((i14 << 15) & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i6 & 14) | ((i6 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i6 & 7168) | ((i6 >> 15) & 57344) | ((i5 << 21) & 1879048192), ((i5 >> 15) & 14) | 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$3
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
                ChipKt.m2163SelectableChipu0RnIRE(z, modifier, function0, z2, function2, textStyle, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer3, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChipContent-fe0OD_I, reason: not valid java name */
    public static final void m2162ChipContentfe0OD_I(final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, long j, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final long j2, final long j3, final float f, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        long j4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        long j5;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-782878228);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ChipContent)P(1,3,2:c#ui.graphics.Color,4!1,8,5:c#ui.graphics.Color,9:c#ui.graphics.Color,6:c#ui.unit.Dp)1414@69769L1012:Chip.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            j4 = j;
            i2 |= composerStartRestartGroup.changed(j4) ? 256 : 128;
        } else {
            j4 = j;
        }
        if ((i & 7168) == 0) {
            function25 = function22;
            i2 |= composerStartRestartGroup.changed(function25) ? 2048 : 1024;
        } else {
            function25 = function22;
        }
        if ((57344 & i) == 0) {
            function26 = function23;
            i2 |= composerStartRestartGroup.changed(function26) ? 16384 : 8192;
        } else {
            function26 = function23;
        }
        if ((458752 & i) == 0) {
            function27 = function24;
            i2 |= composerStartRestartGroup.changed(function27) ? 131072 : 65536;
        } else {
            function27 = function24;
        }
        if ((3670016 & i) == 0) {
            j5 = j2;
            i2 |= composerStartRestartGroup.changed(j5) ? 1048576 : 524288;
        } else {
            j5 = j2;
        }
        if ((29360128 & i) == 0) {
            i3 = i2 | (composerStartRestartGroup.changed(j3) ? 8388608 : 4194304);
        } else {
            i3 = i2;
        }
        if ((234881024 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 1879048192) == 0) {
            i3 |= composerStartRestartGroup.changed(paddingValues) ? 536870912 : 268435456;
        }
        if ((i3 & 1533916891) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i3, -1, "androidx.compose.material3.ChipContent (Chip.kt:1402)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
            final long j6 = j5;
            final int i4 = i3;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j4)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1748799148, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$1
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

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C1418@69905L870:Chip.kt#uh7d8r");
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1748799148, i5, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:1417)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m1050defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, f, 1, null), paddingValues);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function211 = function29;
                        int i6 = i4;
                        Function2<Composer, Integer, Unit> function212 = function28;
                        long j7 = j6;
                        Function2<Composer, Integer, Unit> function213 = function2;
                        Function2<Composer, Integer, Unit> function214 = function210;
                        long j8 = j3;
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object objConsume = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) objConsume;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object objConsume3 = composer2.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
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
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(827638800);
                        ComposerKt.sourceInformation(composer2, "C1432@70431L49,1433@70493L7,1434@70513L49,1436@70619L132:Chip.kt#uh7d8r");
                        if (function211 != null) {
                            composer2.startReplaceableGroup(650988385);
                            ComposerKt.sourceInformation(composer2, "1426@70203L8");
                            function211.invoke(composer2, Integer.valueOf((i6 >> 12) & 14));
                            composer2.endReplaceableGroup();
                        } else if (function212 != null) {
                            composer2.startReplaceableGroup(650988456);
                            ComposerKt.sourceInformation(composer2, "1428@70274L130");
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j7))}, function212, composer2, ((i6 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(650988618);
                            composer2.endReplaceableGroup();
                        }
                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.HorizontalElementsPadding), composer2, 6);
                        function213.invoke(composer2, Integer.valueOf(i6 & 14));
                        SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, ChipKt.HorizontalElementsPadding), composer2, 6);
                        if (function214 != null) {
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j8))}, function214, composer2, ((i6 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8);
                        }
                        composer2.endReplaceableGroup();
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
            }), composerStartRestartGroup, 56);
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
        final long j7 = j4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$2
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

            public final void invoke(Composer composer2, int i5) {
                ChipKt.m2162ChipContentfe0OD_I(function2, textStyle, j7, function22, function23, function24, j2, j3, f, paddingValues, composer2, i | 1);
            }
        });
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return inputChipPadding(z, z2, z3);
    }

    private static final PaddingValues inputChipPadding(boolean z, boolean z2, boolean z3) {
        return PaddingKt.m1017PaddingValuesa9UjIt4$default(Dp.m6117constructorimpl((z || !z2) ? 4 : 8), 0.0f, Dp.m6117constructorimpl(z3 ? 8 : 4), 0.0f, 10, null);
    }

    static {
        float fM6117constructorimpl = Dp.m6117constructorimpl(8);
        HorizontalElementsPadding = fM6117constructorimpl;
        AssistChipPadding = PaddingKt.m1015PaddingValuesYgX7TsA$default(fM6117constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m1015PaddingValuesYgX7TsA$default(fM6117constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m1015PaddingValuesYgX7TsA$default(fM6117constructorimpl, 0.0f, 2, null);
    }
}
