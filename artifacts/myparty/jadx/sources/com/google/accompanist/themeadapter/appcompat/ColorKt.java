package com.google.accompanist.themeadapter.appcompat;

import androidx.compose.ui.graphics.Color;
import androidx.core.graphics.ColorUtils;
import kotlin.Metadata;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\u0007\u001a\u00020\u0003*\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"MINIMUM_CONTRAST", "", "calculateContrastForForeground", "Landroidx/compose/ui/graphics/Color;", "foreground", "calculateContrastForForeground--OWjLjI", "(JJ)D", "calculateOnColor", "calculateOnColor-8_81llA", "(J)J", "calculateOnColorWithTextColorPrimary", "textColorPrimary", "calculateOnColorWithTextColorPrimary--OWjLjI", "(JJ)J", "themeadapter-appcompat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ColorKt {
    private static final double MINIMUM_CONTRAST = 4.5d;

    /* renamed from: calculateContrastForForeground--OWjLjI, reason: not valid java name */
    public static final double m6999calculateContrastForForegroundOWjLjI(long j, long j2) {
        return ColorUtils.calculateContrast(androidx.compose.ui.graphics.ColorKt.m3711toArgb8_81llA(j2), androidx.compose.ui.graphics.ColorKt.m3711toArgb8_81llA(j));
    }

    /* renamed from: calculateOnColorWithTextColorPrimary--OWjLjI, reason: not valid java name */
    public static final long m7001calculateOnColorWithTextColorPrimaryOWjLjI(long j, long j2) {
        return (Color.m3658equalsimpl0(j2, Color.INSTANCE.m3693getUnspecified0d7_KjU()) || m6999calculateContrastForForegroundOWjLjI(j, j2) < 4.5d) ? m7000calculateOnColor8_81llA(j) : j2;
    }

    /* renamed from: calculateOnColor-8_81llA, reason: not valid java name */
    public static final long m7000calculateOnColor8_81llA(long j) {
        return m6999calculateContrastForForegroundOWjLjI(j, Color.INSTANCE.m3683getBlack0d7_KjU()) > m6999calculateContrastForForegroundOWjLjI(j, Color.INSTANCE.m3694getWhite0d7_KjU()) ? Color.INSTANCE.m3683getBlack0d7_KjU() : Color.INSTANCE.m3694getWhite0d7_KjU();
    }
}
