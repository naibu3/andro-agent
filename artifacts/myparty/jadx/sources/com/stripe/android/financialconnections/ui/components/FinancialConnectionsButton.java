package com.stripe.android.financialconnections.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.ui.theme.ColorKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton;", "", "<init>", "()V", "Type", "Size", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsButton {
    public static final int $stable = 0;
    public static final FinancialConnectionsButton INSTANCE = new FinancialConnectionsButton();

    private FinancialConnectionsButton() {
    }

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H'¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "", "<init>", "()V", "buttonColors", "Landroidx/compose/material/ButtonColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonColors;", "rippleColor", "Landroidx/compose/ui/graphics/Color;", "rippleColor-0d7_KjU", "()J", "elevation", "Landroidx/compose/material/ButtonElevation;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonElevation;", "Primary", "Secondary", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Type {
        public static final int $stable = 0;

        public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract ButtonColors buttonColors(Composer composer, int i);

        public abstract ButtonElevation elevation(Composer composer, int i);

        /* renamed from: rippleColor-0d7_KjU, reason: not valid java name */
        public abstract long mo7578rippleColor0d7_KjU();

        private Type() {
        }

        /* compiled from: Button.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "<init>", "()V", "buttonColors", "Landroidx/compose/material/ButtonColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonColors;", "rippleColor", "Landroidx/compose/ui/graphics/Color;", "rippleColor-0d7_KjU", "()J", "elevation", "Landroidx/compose/material/ButtonElevation;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonElevation;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Primary extends Type {
            public static final int $stable = 0;
            public static final Primary INSTANCE = new Primary();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Primary)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1748817615;
            }

            public String toString() {
                return "Primary";
            }

            private Primary() {
                super(null);
            }

            @Override // com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type
            public ButtonColors buttonColors(Composer composer, int i) {
                composer.startReplaceGroup(-585272451);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-585272451, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Primary.buttonColors (Button.kt:169)");
                }
                ButtonColors buttonColorsM1799buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1799buttonColorsro_MJ88(FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7639getPrimary0d7_KjU(), FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7640getPrimaryAccent0d7_KjU(), FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7639getPrimary0d7_KjU(), Color.m3656copywmQWz5c$default(FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7640getPrimaryAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer, ButtonDefaults.$stable << 12, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return buttonColorsM1799buttonColorsro_MJ88;
            }

            @Override // com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type
            /* renamed from: rippleColor-0d7_KjU */
            public long mo7578rippleColor0d7_KjU() {
                return ColorKt.getBrand400();
            }

            @Override // com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type
            public ButtonElevation elevation(Composer composer, int i) {
                composer.startReplaceGroup(1046173141);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1046173141, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Primary.elevation (Button.kt:179)");
                }
                ButtonElevation buttonElevationM1800elevationR_JCAzs = ButtonDefaults.INSTANCE.m1800elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, ButtonDefaults.$stable << 15, 31);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return buttonElevationM1800elevationR_JCAzs;
            }
        }

        /* compiled from: Button.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "<init>", "()V", "buttonColors", "Landroidx/compose/material/ButtonColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonColors;", "rippleColor", "Landroidx/compose/ui/graphics/Color;", "rippleColor-0d7_KjU", "()J", "elevation", "Landroidx/compose/material/ButtonElevation;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ButtonElevation;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Secondary extends Type {
            public static final int $stable = 0;
            public static final Secondary INSTANCE = new Secondary();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Secondary)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -256869149;
            }

            public String toString() {
                return "Secondary";
            }

            private Secondary() {
                super(null);
            }

            @Override // com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type
            public ButtonColors buttonColors(Composer composer, int i) {
                composer.startReplaceGroup(-1339122933);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1339122933, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Secondary.buttonColors (Button.kt:184)");
                }
                ButtonColors buttonColorsM1799buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1799buttonColorsro_MJ88(FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7632getBackgroundSecondary0d7_KjU(), FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU(), FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7632getBackgroundSecondary0d7_KjU(), Color.m3656copywmQWz5c$default(FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composer, ButtonDefaults.$stable << 12, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return buttonColorsM1799buttonColorsro_MJ88;
            }

            @Override // com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type
            /* renamed from: rippleColor-0d7_KjU */
            public long mo7578rippleColor0d7_KjU() {
                return ColorKt.getNeutral50();
            }

            @Override // com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type
            public ButtonElevation elevation(Composer composer, int i) {
                composer.startReplaceGroup(-1182972061);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1182972061, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Type.Secondary.elevation (Button.kt:194)");
                }
                float f = 0;
                ButtonElevation buttonElevationM1800elevationR_JCAzs = ButtonDefaults.INSTANCE.m1800elevationR_JCAzs(Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), composer, (ButtonDefaults.$stable << 15) | 28086, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return buttonElevationM1800elevationR_JCAzs;
            }
        }
    }

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H'¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;", "", "<init>", "()V", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;", "radius", "Landroidx/compose/ui/unit/Dp;", "getRadius-D9Ej5fM", "()F", "Regular", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Regular;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Size {
        public static final int $stable = 0;

        public /* synthetic */ Size(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getRadius-D9Ej5fM, reason: not valid java name */
        public abstract float mo7577getRadiusD9Ej5fM();

        public abstract PaddingValues paddingValues(Composer composer, int i);

        private Size() {
        }

        /* compiled from: Button.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\t\u001a\u00020\nH\u0017¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Regular;", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;", "<init>", "()V", "radius", "Landroidx/compose/ui/unit/Dp;", "getRadius-D9Ej5fM", "()F", "F", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Regular extends Size {
            public static final int $stable = 0;
            public static final Regular INSTANCE = new Regular();
            private static final float radius = Dp.m6117constructorimpl(12);

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Regular)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 539612306;
            }

            public String toString() {
                return "Regular";
            }

            private Regular() {
                super(null);
            }

            @Override // com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Size
            /* renamed from: getRadius-D9Ej5fM */
            public float mo7577getRadiusD9Ej5fM() {
                return radius;
            }

            @Override // com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Size
            public PaddingValues paddingValues(Composer composer, int i) {
                composer.startReplaceGroup(-982635024);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-982635024, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.Size.Regular.paddingValues (Button.kt:214)");
                }
                float f = 16;
                PaddingValues paddingValuesM1016PaddingValuesa9UjIt4 = PaddingKt.m1016PaddingValuesa9UjIt4(Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return paddingValuesM1016PaddingValuesa9UjIt4;
            }
        }
    }
}
