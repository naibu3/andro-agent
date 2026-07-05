package com.stripe.android.financialconnections.ui.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.hermes.intl.Constants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.financialconnections.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u0004j\u0002\b\u0005¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/ui/theme/Theme;", "", "<init>", "(Ljava/lang/String;I)V", "DefaultLight", "LinkLight", PaymentSheetAppearanceKeys.COLORS, "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;", PaymentSheetAppearanceKeys.ICON, "", "getIcon", "()I", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Theme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Theme[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Theme DefaultLight;
    public static final Theme LinkLight;

    /* renamed from: default, reason: not valid java name */
    private static final Theme f152default;

    /* compiled from: Theme.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[Theme.DefaultLight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Theme.LinkLight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ Theme[] $values() {
        return new Theme[]{DefaultLight, LinkLight};
    }

    public static EnumEntries<Theme> getEntries() {
        return $ENTRIES;
    }

    private Theme(String str, int i) {
    }

    static {
        Theme theme = new Theme("DefaultLight", 0);
        DefaultLight = theme;
        LinkLight = new Theme("LinkLight", 1);
        Theme[] themeArr$values = $values();
        $VALUES = themeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(themeArr$values);
        INSTANCE = new Companion(null);
        f152default = theme;
    }

    public final FinancialConnectionsColors getColors(Composer composer, int i) {
        FinancialConnectionsColors financialConnectionsColors;
        composer.startReplaceGroup(728720633);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(728720633, i, -1, "com.stripe.android.financialconnections.ui.theme.Theme.<get-colors> (Theme.kt:39)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(1519974374);
            financialConnectionsColors = DarkThemeKt.isSystemInDarkTheme(composer, 0) ? ThemeKt.DarkThemeColors : ThemeKt.Colors;
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(1519973187);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1519976959);
            financialConnectionsColors = DarkThemeKt.isSystemInDarkTheme(composer, 0) ? ThemeKt.InstantDebitsDarkModeColors : ThemeKt.InstantDebitsColors;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return financialConnectionsColors;
    }

    public final int getIcon() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return R.drawable.stripe_logo;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return R.drawable.stripe_link_logo;
    }

    /* compiled from: Theme.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/ui/theme/Theme$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/financialconnections/ui/theme/Theme;", "getDefault", "()Lcom/stripe/android/financialconnections/ui/theme/Theme;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Theme getDefault() {
            return Theme.f152default;
        }
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }
}
