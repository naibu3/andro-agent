package com.stripe.android.paymentsheet.ui;

import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.ColorKt;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.uicore.IconStyle;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: IconHelper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/IconHelper;", "", "<init>", "()V", PaymentSheetAppearanceKeys.ICON, "", "iconRes", "iconResNight", "outlinedIconResource", "(ILjava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)I", "iconUrl", "", "lightThemeIconUrl", "darkThemeIconUrl", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "isDark", "", "(Landroidx/compose/runtime/Composer;I)Z", "iconForTheme", "(ILjava/lang/Integer;Landroidx/compose/runtime/Composer;I)I", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IconHelper {
    public static final int $stable = 0;
    public static final IconHelper INSTANCE = new IconHelper();

    /* compiled from: IconHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconStyle.values().length];
            try {
                iArr[IconStyle.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconStyle.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private IconHelper() {
    }

    public final int icon(int i, Integer num, Integer num2, Composer composer, int i2) {
        composer.startReplaceGroup(-900915335);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-900915335, i2, -1, "com.stripe.android.paymentsheet.ui.IconHelper.icon (IconHelper.kt:15)");
        }
        int iIconForTheme = iconForTheme(i, num, composer, ((i2 >> 3) & 896) | (i2 & WebSocketProtocol.PAYLOAD_SHORT));
        ProvidableCompositionLocal<IconStyle> localIconStyle = StripeThemeKt.getLocalIconStyle();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localIconStyle);
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i3 = WhenMappings.$EnumSwitchMapping$0[((IconStyle) objConsume).ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (num2 != null) {
                iIconForTheme = num2.intValue();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iIconForTheme;
    }

    public final String iconUrl(String str, String str2, Composer composer, int i) {
        composer.startReplaceGroup(-201455451);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-201455451, i, -1, "com.stripe.android.paymentsheet.ui.IconHelper.iconUrl (IconHelper.kt:24)");
        }
        if (isDark(composer, (i >> 6) & 14) && str2 != null) {
            str = str2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    public final boolean isDark(Composer composer, int i) {
        composer.startReplaceGroup(-1529074886);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1529074886, i, -1, "com.stripe.android.paymentsheet.ui.IconHelper.isDark (IconHelper.kt:29)");
        }
        boolean z = ((double) ColorKt.m3709luminance8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8725getComponent0d7_KjU())) < 0.5d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return z;
    }

    private final int iconForTheme(int i, Integer num, Composer composer, int i2) {
        composer.startReplaceGroup(-1136549412);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1136549412, i2, -1, "com.stripe.android.paymentsheet.ui.IconHelper.iconForTheme (IconHelper.kt:36)");
        }
        if (isDark(composer, (i2 >> 6) & 14) && num != null) {
            i = num.intValue();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return i;
    }
}
