package androidx.compose.material;

import androidx.compose.material.internal.Icons;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.facebook.react.uimanager.ViewProps;
import com.reactcommunity.rndatetimepicker.Common;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\tJî\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$Jî\u0001\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "()V", "TrailingIcon", "", "expanded", "", "onIconClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material/TextFieldColors;", Common.TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", ViewProps.BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-DlUQjxs", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    public final void TrailingIcon(final boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final AnonymousClass1 anonymousClass1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1752693020);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TrailingIcon)297@11600L314,297@11520L394:ExposedDropdownMenu.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            anonymousClass1 = i4 != 0 ? new Function0<Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            } : function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1752693020, i3, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:292)");
            }
            IconButtonKt.IconButton(anonymousClass1, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }), false, null, ComposableLambdaKt.rememberComposableLambda(-689144648, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.3
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
                    ComposerKt.sourceInformation(composer2, "C298@11614L290:ExposedDropdownMenu.android.kt#jmzs0o");
                    if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-689144648, i5, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.<anonymous> (ExposedDropdownMenu.android.kt:298)");
                        }
                        IconKt.m1926Iconww6aTOc(Icons.Filled.INSTANCE.getArrowDropDown$material_release(), "Trailing icon for exposed dropdown menu", RotateKt.rotate(Modifier.INSTANCE, z ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            anonymousClass1 = function0;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.4
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
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z, anonymousClass1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1904textFieldColorsDlUQjxs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        long jM3656copywmQWz5c$default;
        long j23;
        long jM3656copywmQWz5c$default2;
        long j24;
        long jM3656copywmQWz5c$default3;
        long j25;
        long jM3656copywmQWz5c$default4;
        long j26;
        long jM3656copywmQWz5c$default5;
        ComposerKt.sourceInformationMarkerStart(composer, 969536191, "C(textFieldColors)P(18:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,19:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)356@14593L7,356@14624L7,357@14697L8,359@14767L6,360@14878L6,361@14942L6,363@15021L6,363@15062L4,365@15136L6,368@15336L8,369@15398L6,371@15472L6,372@15619L8,375@15748L6,377@15878L6,377@15919L4,378@16013L8,379@16078L6,381@16153L6,381@16194L4,382@16252L6,382@16287L6,383@16370L8,384@16428L6,385@16490L6,385@16525L6,386@16611L8:ExposedDropdownMenu.android.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long jM3667unboximpl = ((Color) objConsume).m3667unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(jM3667unboximpl, ((Number) objConsume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3656copywmQWz5c$default = j;
        }
        long jM3656copywmQWz5c$default6 = (i4 & 2) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM3656copywmQWz5c$default7 = (i4 & 4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM1833getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU() : j4;
        long jM1827getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j5;
        long jM3656copywmQWz5c$default8 = (i4 & 32) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM3656copywmQWz5c$default9 = (i4 & 64) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j27 = jM3656copywmQWz5c$default9;
            j23 = j27;
            jM3656copywmQWz5c$default2 = Color.m3656copywmQWz5c$default(j27, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = jM3656copywmQWz5c$default9;
            jM3656copywmQWz5c$default2 = j8;
        }
        long jM1827getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j9;
        long jM3656copywmQWz5c$default10 = (i4 & 512) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j28 = jM3656copywmQWz5c$default10;
            jM3656copywmQWz5c$default3 = Color.m3656copywmQWz5c$default(j28, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j28;
        } else {
            j24 = jM3656copywmQWz5c$default10;
            jM3656copywmQWz5c$default3 = j11;
        }
        long j29 = (i4 & 2048) != 0 ? j24 : j12;
        long jM3656copywmQWz5c$default11 = (i4 & 4096) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM3656copywmQWz5c$default12 = (i4 & 8192) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if ((i4 & 16384) != 0) {
            long j30 = jM3656copywmQWz5c$default11;
            jM3656copywmQWz5c$default4 = Color.m3656copywmQWz5c$default(j30, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j30;
        } else {
            j25 = jM3656copywmQWz5c$default11;
            jM3656copywmQWz5c$default4 = j15;
        }
        long jM1827getError0d7_KjU3 = (32768 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j16;
        long jM3656copywmQWz5c$default13 = (65536 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM3656copywmQWz5c$default14 = (131072 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if ((262144 & i4) != 0) {
            long j31 = jM3656copywmQWz5c$default14;
            jM3656copywmQWz5c$default5 = Color.m3656copywmQWz5c$default(j31, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j31;
        } else {
            j26 = jM3656copywmQWz5c$default14;
            jM3656copywmQWz5c$default5 = j19;
        }
        long jM1827getError0d7_KjU4 = (524288 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j20;
        long jM3656copywmQWz5c$default15 = (1048576 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long jM3656copywmQWz5c$default16 = (i4 & 2097152) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(969536191, i, i2, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:388)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(jM3656copywmQWz5c$default, jM3656copywmQWz5c$default6, jM1833getPrimary0d7_KjU, jM1827getError0d7_KjU, jM3656copywmQWz5c$default8, j23, jM1827getError0d7_KjU2, jM3656copywmQWz5c$default2, j24, jM3656copywmQWz5c$default3, j29, j25, jM3656copywmQWz5c$default12, jM3656copywmQWz5c$default4, jM1827getError0d7_KjU3, jM3656copywmQWz5c$default7, jM3656copywmQWz5c$default13, j26, jM3656copywmQWz5c$default5, jM1827getError0d7_KjU4, jM3656copywmQWz5c$default15, jM3656copywmQWz5c$default16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    /* renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1903outlinedTextFieldColorsDlUQjxs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        long jM3656copywmQWz5c$default;
        long j23;
        long jM3656copywmQWz5c$default2;
        long j24;
        long jM3656copywmQWz5c$default3;
        long j25;
        long jM3656copywmQWz5c$default4;
        long j26;
        long jM3656copywmQWz5c$default5;
        ComposerKt.sourceInformationMarkerStart(composer, 1841636861, "C(outlinedTextFieldColors)P(18:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,19:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)459@20578L7,459@20609L7,460@20682L8,462@20788L6,463@20852L6,465@20928L6,465@20969L4,467@21040L6,467@21083L8,468@21178L8,469@21237L6,471@21311L6,472@21458L8,475@21587L6,477@21717L6,477@21758L4,478@21852L8,479@21917L6,481@21992L6,481@22033L4,482@22091L6,482@22126L6,483@22209L8,484@22267L6,485@22329L6,485@22364L6,486@22450L8:ExposedDropdownMenu.android.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long jM3667unboximpl = ((Color) objConsume).m3667unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(jM3667unboximpl, ((Number) objConsume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3656copywmQWz5c$default = j;
        }
        long jM3656copywmQWz5c$default6 = (i4 & 2) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM3692getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m3692getTransparent0d7_KjU() : j3;
        long jM1833getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU() : j4;
        long jM1827getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j5;
        long jM3656copywmQWz5c$default7 = (i4 & 32) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM3656copywmQWz5c$default8 = (i4 & 64) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j27 = jM3656copywmQWz5c$default8;
            j23 = j27;
            jM3656copywmQWz5c$default2 = Color.m3656copywmQWz5c$default(j27, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = jM3656copywmQWz5c$default8;
            jM3656copywmQWz5c$default2 = j8;
        }
        long jM1827getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j9;
        long jM3656copywmQWz5c$default9 = (i4 & 512) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j28 = jM3656copywmQWz5c$default9;
            jM3656copywmQWz5c$default3 = Color.m3656copywmQWz5c$default(j28, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j28;
        } else {
            j24 = jM3656copywmQWz5c$default9;
            jM3656copywmQWz5c$default3 = j11;
        }
        long j29 = (i4 & 2048) != 0 ? j24 : j12;
        long jM3656copywmQWz5c$default10 = (i4 & 4096) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long jM3656copywmQWz5c$default11 = (i4 & 8192) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if ((i4 & 16384) != 0) {
            long j30 = jM3656copywmQWz5c$default10;
            jM3656copywmQWz5c$default4 = Color.m3656copywmQWz5c$default(j30, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j30;
        } else {
            j25 = jM3656copywmQWz5c$default10;
            jM3656copywmQWz5c$default4 = j15;
        }
        long jM1827getError0d7_KjU3 = (32768 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j16;
        long jM3656copywmQWz5c$default12 = (65536 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM3656copywmQWz5c$default13 = (131072 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if ((262144 & i4) != 0) {
            long j31 = jM3656copywmQWz5c$default13;
            jM3656copywmQWz5c$default5 = Color.m3656copywmQWz5c$default(j31, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j31;
        } else {
            j26 = jM3656copywmQWz5c$default13;
            jM3656copywmQWz5c$default5 = j19;
        }
        long jM1827getError0d7_KjU4 = (524288 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j20;
        long jM3656copywmQWz5c$default14 = (1048576 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long jM3656copywmQWz5c$default15 = (i4 & 2097152) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1841636861, i, i2, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:488)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(jM3656copywmQWz5c$default, jM3656copywmQWz5c$default6, jM1833getPrimary0d7_KjU, jM1827getError0d7_KjU, jM3656copywmQWz5c$default7, j23, jM1827getError0d7_KjU2, jM3656copywmQWz5c$default2, j24, jM3656copywmQWz5c$default3, j29, j25, jM3656copywmQWz5c$default11, jM3656copywmQWz5c$default4, jM1827getError0d7_KjU3, jM3692getTransparent0d7_KjU, jM3656copywmQWz5c$default12, j26, jM3656copywmQWz5c$default5, jM1827getError0d7_KjU4, jM3656copywmQWz5c$default14, jM3656copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
