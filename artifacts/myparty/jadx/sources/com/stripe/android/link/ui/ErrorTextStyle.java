package com.stripe.android.link.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ErrorText.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/link/ui/ErrorTextStyle;", "", "<init>", "()V", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "iconModifier", "Landroidx/compose/ui/Modifier;", "getIconModifier", "()Landroidx/compose/ui/Modifier;", "textModifier", "getTextModifier", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "Small", "Medium", "Lcom/stripe/android/link/ui/ErrorTextStyle$Medium;", "Lcom/stripe/android/link/ui/ErrorTextStyle$Small;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ErrorTextStyle {
    public static final int $stable = 0;

    public /* synthetic */ ErrorTextStyle(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Modifier getIconModifier();

    public abstract Shape getShape();

    public abstract Modifier getTextModifier();

    public abstract TextStyle getTextStyle();

    private ErrorTextStyle() {
    }

    /* compiled from: ErrorText.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/ui/ErrorTextStyle$Small;", "Lcom/stripe/android/link/ui/ErrorTextStyle;", "<init>", "()V", "shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "iconModifier", "Landroidx/compose/ui/Modifier;", "getIconModifier", "()Landroidx/compose/ui/Modifier;", "textModifier", "getTextModifier", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Small extends ErrorTextStyle {
        public static final int $stable = 0;
        private static final Modifier iconModifier;
        private static final RoundedCornerShape shape;
        private static final Modifier textModifier;
        public static final Small INSTANCE = new Small();
        private static final TextStyle textStyle = new TextStyle(0, TextUnitKt.getSp(12), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, FontFamily.INSTANCE.getDefault(), (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);

        private Small() {
            super(null);
        }

        @Override // com.stripe.android.link.ui.ErrorTextStyle
        public RoundedCornerShape getShape() {
            return shape;
        }

        @Override // com.stripe.android.link.ui.ErrorTextStyle
        public Modifier getIconModifier() {
            return iconModifier;
        }

        @Override // com.stripe.android.link.ui.ErrorTextStyle
        public Modifier getTextModifier() {
            return textModifier;
        }

        @Override // com.stripe.android.link.ui.ErrorTextStyle
        public TextStyle getTextStyle() {
            return textStyle;
        }

        static {
            float f = 4;
            shape = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(f));
            iconModifier = SizeKt.m1065size3ABfNKs(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), 1, null), Dp.m6117constructorimpl(12));
            textModifier = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), 1, null);
        }
    }

    /* compiled from: ErrorText.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/ui/ErrorTextStyle$Medium;", "Lcom/stripe/android/link/ui/ErrorTextStyle;", "<init>", "()V", "shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "iconModifier", "Landroidx/compose/ui/Modifier;", "getIconModifier", "()Landroidx/compose/ui/Modifier;", "textModifier", "getTextModifier", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Medium extends ErrorTextStyle {
        public static final int $stable = 0;
        private static final Modifier iconModifier;
        private static final Modifier textModifier;
        public static final Medium INSTANCE = new Medium();
        private static final RoundedCornerShape shape = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(8));
        private static final TextStyle textStyle = new TextStyle(0, TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily.INSTANCE.getDefault(), (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);

        private Medium() {
            super(null);
        }

        @Override // com.stripe.android.link.ui.ErrorTextStyle
        public RoundedCornerShape getShape() {
            return shape;
        }

        @Override // com.stripe.android.link.ui.ErrorTextStyle
        public Modifier getIconModifier() {
            return iconModifier;
        }

        @Override // com.stripe.android.link.ui.ErrorTextStyle
        public Modifier getTextModifier() {
            return textModifier;
        }

        @Override // com.stripe.android.link.ui.ErrorTextStyle
        public TextStyle getTextStyle() {
            return textStyle;
        }

        static {
            float f = 12;
            iconModifier = SizeKt.m1065size3ABfNKs(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(6), Dp.m6117constructorimpl(f), 1, null), Dp.m6117constructorimpl(20));
            textModifier = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), 1, null);
        }
    }
}
