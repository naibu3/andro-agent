package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 Jl\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)JN\u0010*\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010 Jl\u0010,\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "()V", "ContentOpacity", "", "LeadingIconOpacity", "LeadingIconSize", "Landroidx/compose/ui/unit/Dp;", "getLeadingIconSize-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "OutlinedBorderOpacity", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "chipColors", "Landroidx/compose/material/ChipColors;", ViewProps.BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "filterChipColors", "Landroidx/compose/material/SelectableChipColors;", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "outlinedChipColors", "outlinedChipColors-5tl4gsc", "outlinedFilterChipColors", "outlinedFilterChipColors-J08w3-E", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = Dp.m6117constructorimpl(32);
    private static final float OutlinedBorderSize = Dp.m6117constructorimpl(1);
    private static final float LeadingIconSize = Dp.m6117constructorimpl(20);
    private static final float SelectedIconSize = Dp.m6117constructorimpl(18);

    private ChipDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1819getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1816chipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1838505436, "C(chipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)391@17141L6,392@17235L6,393@17296L6,396@17498L6,397@17558L8,398@17633L6,400@17740L8,403@17888L8:Chip.kt#jmzs0o");
        long jM3702compositeOverOWjLjI = (i2 & 1) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1837getSurface0d7_KjU()) : j;
        long jM3656copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM3656copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM3702compositeOverOWjLjI2 = (i2 & 8) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1837getSurface0d7_KjU()) : j4;
        long jM3656copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM3656copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:404)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(jM3702compositeOverOWjLjI, jM3656copywmQWz5c$default, jM3656copywmQWz5c$default2, jM3702compositeOverOWjLjI2, jM3656copywmQWz5c$default3, jM3656copywmQWz5c$default4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultChipColors;
    }

    /* renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1822outlinedChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long jM3656copywmQWz5c$default;
        ComposerKt.sourceInformationMarkerStart(composer, -1763922662, "C(outlinedChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)427@19084L6,428@19144L6,432@19427L8,435@19575L8,436@19627L342:Chip.kt#jmzs0o");
        long jM1837getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1837getSurface0d7_KjU() : j;
        long jM3656copywmQWz5c$default2 = (i2 & 2) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM3656copywmQWz5c$default3 = (i2 & 4) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j8 = (i2 & 8) != 0 ? jM1837getSurface0d7_KjU : j4;
        long jM3656copywmQWz5c$default4 = (i2 & 16) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if ((i2 & 32) != 0) {
            long j9 = jM3656copywmQWz5c$default3;
            jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j7 = j9;
        } else {
            j7 = jM3656copywmQWz5c$default3;
            jM3656copywmQWz5c$default = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:436)");
        }
        ChipColors chipColorsM1816chipColors5tl4gsc = m1816chipColors5tl4gsc(jM1837getSurface0d7_KjU, jM3656copywmQWz5c$default2, j7, j8, jM3656copywmQWz5c$default4, jM3656copywmQWz5c$default, composer, i & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return chipColorsM1816chipColors5tl4gsc;
    }

    /* renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1817filterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 830140629, "C(filterChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color)461@20966L6,462@21060L6,463@21121L6,466@21308L6,467@21368L8,468@21443L6,470@21550L8,473@21685L8,475@21781L6,478@21940L6,481@22101L6:Chip.kt#jmzs0o");
        long jM3702compositeOverOWjLjI = (i2 & 1) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1837getSurface0d7_KjU()) : j;
        long jM3656copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM3656copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM3702compositeOverOWjLjI2 = (i2 & 8) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1837getSurface0d7_KjU()) : j4;
        long jM3656copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM3656copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM3702compositeOverOWjLjI3 = (i2 & 64) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), jM3702compositeOverOWjLjI) : j7;
        long jM3702compositeOverOWjLjI4 = (i2 & 128) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM3656copywmQWz5c$default) : j8;
        long jM3702compositeOverOWjLjI5 = (i2 & 256) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM3656copywmQWz5c$default2) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830140629, i, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:484)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(jM3702compositeOverOWjLjI, jM3656copywmQWz5c$default, jM3656copywmQWz5c$default2, jM3702compositeOverOWjLjI2, jM3656copywmQWz5c$default3, jM3656copywmQWz5c$default4, jM3702compositeOverOWjLjI3, jM3702compositeOverOWjLjI4, jM3702compositeOverOWjLjI5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSelectableChipColors;
    }

    /* renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1823outlinedFilterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 346878099, "C(outlinedFilterChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color)512@23751L6,513@23811L6,517@24071L8,520@24206L8,522@24302L6,525@24462L6,528@24623L6:Chip.kt#jmzs0o");
        long jM1837getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1837getSurface0d7_KjU() : j;
        long jM3656copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM3656copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j10 = (i2 & 8) != 0 ? jM1837getSurface0d7_KjU : j4;
        long jM3656copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM3656copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM3702compositeOverOWjLjI = (i2 & 64) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM1837getSurface0d7_KjU) : j7;
        long jM3702compositeOverOWjLjI2 = (i2 & 128) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM3656copywmQWz5c$default) : j8;
        long jM3702compositeOverOWjLjI3 = (i2 & 256) != 0 ? ColorKt.m3702compositeOverOWjLjI(Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), jM3656copywmQWz5c$default2) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346878099, i, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:531)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(jM1837getSurface0d7_KjU, jM3656copywmQWz5c$default, jM3656copywmQWz5c$default2, j10, jM3656copywmQWz5c$default3, jM3656copywmQWz5c$default4, jM3702compositeOverOWjLjI, jM3702compositeOverOWjLjI2, jM3702compositeOverOWjLjI3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSelectableChipColors;
    }

    public final BorderStroke getOutlinedBorder(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1650225597, "C549@25470L6:Chip.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:548)");
        }
        BorderStroke borderStrokeM602BorderStrokecXLIe8U = BorderStrokeKt.m602BorderStrokecXLIe8U(OutlinedBorderSize, Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return borderStrokeM602BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1820getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1818getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1821getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }
}
