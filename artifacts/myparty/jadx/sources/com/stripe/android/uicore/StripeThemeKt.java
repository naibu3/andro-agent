package com.stripe.android.uicore;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Colors;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.Shapes;
import androidx.compose.material.TextKt;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u000b*\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001ah\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010,\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020$2\b\b\u0002\u0010.\u001a\u00020\u001b2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020'00¢\u0006\u0002\b1H\u0007¢\u0006\u0002\u00102\u001a \u00103\u001a\u00020'2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020'00¢\u0006\u0002\b1H\u0007¢\u0006\u0002\u00104\u001a%\u0010C\u001a\u00020D*\u0002062\u0006\u0010E\u001a\u00020\u001e2\b\b\u0002\u0010F\u001a\u00020DH\u0007¢\u0006\u0004\bG\u0010H\u001a\u0019\u0010I\u001a\u00020\u0001*\u0002062\u0006\u0010E\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010J\u001a\u0019\u0010K\u001a\u00020L*\u0002062\u0006\u0010E\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010M\u001a\f\u0010N\u001a\u00020\u001e*\u00020OH\u0007\u001a\u001b\u0010P\u001a\u00020\u0018*\u00020O2\u0006\u0010Q\u001a\u00020DH\u0007¢\u0006\u0004\bR\u0010S\u001a=\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010W2\u0006\u0010X\u001a\u00020O2\u0006\u0010Y\u001a\u00020D2\u0006\u0010Z\u001a\u00020\u00012\n\b\u0001\u0010[\u001a\u0004\u0018\u00010\\H\u0007¢\u0006\u0004\b]\u0010^\u001a\u0013\u0010_\u001a\u00020\u001e*\u00020\u0001H\u0007¢\u0006\u0004\b`\u0010a\u001a\u0014\u0010b\u001a\u00020\\*\u00020c2\u0006\u0010X\u001a\u00020OH\u0007\u001a\u0014\u0010d\u001a\u00020\\*\u00020c2\u0006\u0010X\u001a\u00020OH\u0007\u001a\u0014\u0010e\u001a\u00020\\*\u00020c2\u0006\u0010X\u001a\u00020OH\u0007\u001a\u0014\u0010f\u001a\u00020\\*\u00020c2\u0006\u0010X\u001a\u00020OH\u0007\u001a\u0014\u0010I\u001a\u00020\\*\u00020c2\u0006\u0010X\u001a\u00020OH\u0007\u001a\u0011\u0010g\u001a\u00020h*\u00020cH\u0007¢\u0006\u0002\u0010i\u001a\u0014\u0010j\u001a\u00020\u0018*\u00020O2\u0006\u0010k\u001a\u00020\\H\u0007\u001a\u001b\u0010l\u001a\u00020\u0001*\u00020\u00012\u0006\u0010m\u001a\u00020\u0018H\u0007¢\u0006\u0004\bn\u0010o\u001a\u001b\u0010p\u001a\u00020\u0001*\u00020\u00012\u0006\u0010m\u001a\u00020\u0018H\u0007¢\u0006\u0004\bq\u0010o\u001a\f\u0010r\u001a\u00020s*\u00020tH\u0007\u001a\f\u0010u\u001a\u00020h*\u00020hH\u0002\u001a\u001d\u0010v\u001a\u00020w*\u0004\u0018\u00010w2\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010z\u001a'\u0010{\u001a\u00020\u0001*\u00020\u00012\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180}H\u0002¢\u0006\u0004\b~\u0010\u007f\"\u0018\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u001e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012\"\u001b\u00105\u001a\u00020\u0010*\u0002068G¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u001b\u0010;\u001a\u00020\b*\u0002068G¢\u0006\f\u0012\u0004\b<\u00108\u001a\u0004\b=\u0010>\"\u001b\u0010?\u001a\u00020\f*\u0002068G¢\u0006\f\u0012\u0004\b@\u00108\u001a\u0004\bA\u0010B¨\u0006\u0080\u0001"}, d2 = {"PRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR", "Landroidx/compose/ui/graphics/Color;", "getPRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR", "()J", "J", "EMBEDDED_SEPARATOR_COLOR_DARK", "toComposeShapes", "Lcom/stripe/android/uicore/StripeComposeShapes;", "Lcom/stripe/android/uicore/StripeShapes;", "(Lcom/stripe/android/uicore/StripeShapes;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeComposeShapes;", "toComposeTypography", "Landroidx/compose/material/Typography;", "Lcom/stripe/android/uicore/StripeTypography;", "(Lcom/stripe/android/uicore/StripeTypography;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;", "LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/stripe/android/uicore/StripeColors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalShapes", "getLocalShapes", "LocalTypography", "getLocalTypography", "LocalSectionSpacing", "", "getLocalSectionSpacing", "LocalIconStyle", "Lcom/stripe/android/uicore/IconStyle;", "getLocalIconStyle", "LocalInstrumentationTest", "", "getLocalInstrumentationTest", "LocalSectionStyle", "Lcom/stripe/android/uicore/SectionStyle;", "getLocalSectionStyle", "LocalTextFieldInsets", "Lcom/stripe/android/uicore/FormInsets;", "getLocalTextFieldInsets", "StripeTheme", "", PaymentSheetAppearanceKeys.COLORS, PaymentSheetAppearanceKeys.SHAPES, "typography", "sectionSpacing", "sectionStyle", "textFieldInsets", "iconStyle", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DefaultStripeTheme", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "stripeColors", "Landroidx/compose/material/MaterialTheme;", "getStripeColors$annotations", "(Landroidx/compose/material/MaterialTheme;)V", "getStripeColors", "(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;", "stripeShapes", "getStripeShapes$annotations", "getStripeShapes", "(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeShapes;", "stripeTypography", "getStripeTypography$annotations", "getStripeTypography", "(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeTypography;", "getBorderStrokeWidth", "Landroidx/compose/ui/unit/Dp;", "isSelected", "selectedStrokeWidth", "getBorderStrokeWidth-6a0pyJM", "(Landroidx/compose/material/MaterialTheme;ZFLandroidx/compose/runtime/Composer;II)F", "getBorderStrokeColor", "(Landroidx/compose/material/MaterialTheme;ZLandroidx/compose/runtime/Composer;I)J", "getBorderStroke", "Landroidx/compose/foundation/BorderStroke;", "(Landroidx/compose/material/MaterialTheme;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "isSystemDarkTheme", "Landroid/content/Context;", "convertDpToPx", JWKParameterNames.RSA_FIRST_FACTOR_CRT_EXPONENT, "convertDpToPx-3ABfNKs", "(Landroid/content/Context;F)F", "createTextSpanFromTextStyle", "Landroid/text/SpannableString;", "text", "", "context", "fontSizeDp", "color", ViewProps.FONT_FAMILY, "", "createTextSpanFromTextStyle-qhTmNto", "(Ljava/lang/String;Landroid/content/Context;FJLjava/lang/Integer;)Landroid/text/SpannableString;", "shouldUseDarkDynamicColor", "shouldUseDarkDynamicColor-8_81llA", "(J)Z", "getBackgroundColor", "Lcom/stripe/android/uicore/PrimaryButtonStyle;", "getSuccessBackgroundColor", "getOnBackgroundColor", "getOnSuccessBackgroundColor", "getComposeTextStyle", "Landroidx/compose/ui/text/TextStyle;", "(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "getRawValueFromDimenResource", "resource", "lighten", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "lighten-DxMtmZc", "(JF)J", "darken", "darken-DxMtmZc", "getOuterFormInsets", "Landroidx/compose/foundation/layout/PaddingValues;", "Lcom/stripe/android/uicore/StripeTheme;", "toCompat", "elseIfNullOrUnspecified", "Landroidx/compose/ui/unit/TextUnit;", "unit", "elseIfNullOrUnspecified-ihG4tgY", "(Landroidx/compose/ui/unit/TextUnit;J)J", "modifyBrightness", ViewProps.TRANSFORM, "Lkotlin/Function1;", "modifyBrightness-DxMtmZc", "(JLkotlin/jvm/functions/Function1;)J", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeThemeKt {
    private static final long PRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR = ColorKt.Color(4280595582L);
    private static final long EMBEDDED_SEPARATOR_COLOR_DARK = ColorKt.Color(1090519039);
    private static final ProvidableCompositionLocal<StripeColors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeThemeKt.LocalColors$lambda$1();
        }
    });
    private static final ProvidableCompositionLocal<StripeShapes> LocalShapes = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeThemeKt.LocalShapes$lambda$2();
        }
    });
    private static final ProvidableCompositionLocal<StripeTypography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeThemeKt.LocalTypography$lambda$3();
        }
    });
    private static final ProvidableCompositionLocal<Float> LocalSectionSpacing = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeThemeKt.LocalSectionSpacing$lambda$4();
        }
    });
    private static final ProvidableCompositionLocal<IconStyle> LocalIconStyle = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeThemeKt.LocalIconStyle$lambda$5();
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalInstrumentationTest = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(StripeThemeKt.LocalInstrumentationTest$lambda$6());
        }
    });
    private static final ProvidableCompositionLocal<SectionStyle> LocalSectionStyle = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeThemeKt.LocalSectionStyle$lambda$7();
        }
    });
    private static final ProvidableCompositionLocal<FormInsets> LocalTextFieldInsets = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeThemeKt.LocalTextFieldInsets$lambda$8();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultStripeTheme$lambda$13(Function2 function2, int i, Composer composer, int i2) {
        DefaultStripeTheme(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalInstrumentationTest$lambda$6() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StripeTheme$lambda$12(StripeColors stripeColors, StripeShapes stripeShapes, StripeTypography stripeTypography, Float f, SectionStyle sectionStyle, FormInsets formInsets, IconStyle iconStyle, Function2 function2, int i, int i2, Composer composer, int i3) {
        StripeTheme(stripeColors, stripeShapes, stripeTypography, f, sectionStyle, formInsets, iconStyle, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getStripeColors$annotations(MaterialTheme materialTheme) {
    }

    public static /* synthetic */ void getStripeShapes$annotations(MaterialTheme materialTheme) {
    }

    public static /* synthetic */ void getStripeTypography$annotations(MaterialTheme materialTheme) {
    }

    public static final long getPRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR() {
        return PRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR;
    }

    public static final StripeComposeShapes toComposeShapes(StripeShapes stripeShapes, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(stripeShapes, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-530823679, i, -1, "com.stripe.android.uicore.toComposeShapes (StripeTheme.kt:369)");
        }
        StripeComposeShapes stripeComposeShapes = new StripeComposeShapes(Dp.m6117constructorimpl(stripeShapes.getBorderStrokeWidth()), Shapes.copy$default(MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(stripeShapes.getCornerRadius())), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(stripeShapes.getCornerRadius())), null, 4, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stripeComposeShapes;
    }

    public static final Typography toComposeTypography(StripeTypography stripeTypography, Composer composer, int i) {
        FontFamily fontFamily;
        FontWeight fontWeight;
        FontFamily fontFamily2;
        FontFamily fontFamily3;
        FontFamily fontFamily4;
        FontFamily fontFamily5;
        FontFamily fontFamily6;
        Intrinsics.checkNotNullParameter(stripeTypography, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1580579333, i, -1, "com.stripe.android.uicore.toComposeTypography (StripeTheme.kt:382)");
        }
        Integer fontFamily7 = stripeTypography.getFontFamily();
        SystemFontFamily systemFontFamilyFontFamily = fontFamily7 != null ? FontFamilyKt.FontFamily(FontKt.m5695FontYpTlLL0$default(fontFamily7.intValue(), null, 0, 0, 14, null)) : null;
        TextStyle compat = toCompat(TextStyle.INSTANCE.getDefault());
        TextStyle h4 = stripeTypography.getH4();
        if (h4 != null && (fontFamily = h4.getFontFamily()) != null) {
            fontFamily = fontFamily;
        } else if (systemFontFamilyFontFamily == null) {
            SystemFontFamily fontFamily8 = FontFamily.INSTANCE.getDefault();
            fontFamily = fontFamily8;
        } else {
            fontFamily = systemFontFamilyFontFamily;
        }
        TextStyle h42 = stripeTypography.getH4();
        TextUnit textUnitM6300boximpl = h42 != null ? TextUnit.m6300boximpl(h42.m5633getFontSizeXSAIIZE()) : null;
        long jM8757getXLargeFontSizeXSAIIZE = stripeTypography.m8757getXLargeFontSizeXSAIIZE();
        float fontSizeMultiplier = stripeTypography.getFontSizeMultiplier();
        TextUnitKt.m6323checkArithmeticR2X_6o(jM8757getXLargeFontSizeXSAIIZE);
        long jM8741elseIfNullOrUnspecifiedihG4tgY = m8741elseIfNullOrUnspecifiedihG4tgY(textUnitM6300boximpl, TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM8757getXLargeFontSizeXSAIIZE), TextUnit.m6310getValueimpl(jM8757getXLargeFontSizeXSAIIZE) * fontSizeMultiplier));
        TextStyle h43 = stripeTypography.getH4();
        if (h43 == null || (fontWeight = h43.getFontWeight()) == null) {
            fontWeight = new FontWeight(stripeTypography.getFontWeightBold());
        }
        FontWeight fontWeight2 = fontWeight;
        TextStyle h44 = stripeTypography.getH4();
        TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(compat, 0L, jM8741elseIfNullOrUnspecifiedihG4tgY, fontWeight2, null, null, fontFamily, null, m8741elseIfNullOrUnspecifiedihG4tgY(h44 != null ? TextUnit.m6300boximpl(h44.m5638getLetterSpacingXSAIIZE()) : null, compat.m5638getLetterSpacingXSAIIZE()), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777049, null);
        if (systemFontFamilyFontFamily == null) {
            SystemFontFamily h5FontFamily = stripeTypography.getH5FontFamily();
            if (h5FontFamily == null) {
                h5FontFamily = FontFamily.INSTANCE.getDefault();
            }
            fontFamily2 = h5FontFamily;
        } else {
            fontFamily2 = systemFontFamilyFontFamily;
        }
        long jM8754getLargeFontSizeXSAIIZE = stripeTypography.m8754getLargeFontSizeXSAIIZE();
        float fontSizeMultiplier2 = stripeTypography.getFontSizeMultiplier();
        TextUnitKt.m6323checkArithmeticR2X_6o(jM8754getLargeFontSizeXSAIIZE);
        TextStyle textStyleM5615copyp1EtxEg$default2 = TextStyle.m5615copyp1EtxEg$default(compat, 0L, TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM8754getLargeFontSizeXSAIIZE), TextUnit.m6310getValueimpl(jM8754getLargeFontSizeXSAIIZE) * fontSizeMultiplier2), new FontWeight(stripeTypography.getFontWeightMedium()), null, null, fontFamily2, null, TextUnitKt.getSp(-0.32d), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777049, null);
        if (systemFontFamilyFontFamily == null) {
            SystemFontFamily h6FontFamily = stripeTypography.getH6FontFamily();
            if (h6FontFamily == null) {
                h6FontFamily = FontFamily.INSTANCE.getDefault();
            }
            fontFamily3 = h6FontFamily;
        } else {
            fontFamily3 = systemFontFamilyFontFamily;
        }
        long jM8756getSmallFontSizeXSAIIZE = stripeTypography.m8756getSmallFontSizeXSAIIZE();
        float fontSizeMultiplier3 = stripeTypography.getFontSizeMultiplier();
        TextUnitKt.m6323checkArithmeticR2X_6o(jM8756getSmallFontSizeXSAIIZE);
        TextStyle textStyleM5615copyp1EtxEg$default3 = TextStyle.m5615copyp1EtxEg$default(compat, 0L, TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM8756getSmallFontSizeXSAIIZE), TextUnit.m6310getValueimpl(jM8756getSmallFontSizeXSAIIZE) * fontSizeMultiplier3), new FontWeight(stripeTypography.getFontWeightMedium()), null, null, fontFamily3, null, TextUnitKt.getSp(-0.15d), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777049, null);
        if (systemFontFamilyFontFamily == null) {
            SystemFontFamily body1FontFamily = stripeTypography.getBody1FontFamily();
            if (body1FontFamily == null) {
                body1FontFamily = FontFamily.INSTANCE.getDefault();
            }
            fontFamily4 = body1FontFamily;
        } else {
            fontFamily4 = systemFontFamilyFontFamily;
        }
        long jM8755getMediumFontSizeXSAIIZE = stripeTypography.m8755getMediumFontSizeXSAIIZE();
        float fontSizeMultiplier4 = stripeTypography.getFontSizeMultiplier();
        TextUnitKt.m6323checkArithmeticR2X_6o(jM8755getMediumFontSizeXSAIIZE);
        TextStyle textStyleM5615copyp1EtxEg$default4 = TextStyle.m5615copyp1EtxEg$default(compat, 0L, TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM8755getMediumFontSizeXSAIIZE), TextUnit.m6310getValueimpl(jM8755getMediumFontSizeXSAIIZE) * fontSizeMultiplier4), new FontWeight(stripeTypography.getFontWeightNormal()), null, null, fontFamily4, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777177, null);
        if (systemFontFamilyFontFamily == null) {
            SystemFontFamily subtitle1FontFamily = stripeTypography.getSubtitle1FontFamily();
            if (subtitle1FontFamily == null) {
                subtitle1FontFamily = FontFamily.INSTANCE.getDefault();
            }
            fontFamily5 = subtitle1FontFamily;
        } else {
            fontFamily5 = systemFontFamilyFontFamily;
        }
        long jM8755getMediumFontSizeXSAIIZE2 = stripeTypography.m8755getMediumFontSizeXSAIIZE();
        float fontSizeMultiplier5 = stripeTypography.getFontSizeMultiplier();
        TextUnitKt.m6323checkArithmeticR2X_6o(jM8755getMediumFontSizeXSAIIZE2);
        TextStyle textStyleM5615copyp1EtxEg$default5 = TextStyle.m5615copyp1EtxEg$default(compat, 0L, TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM8755getMediumFontSizeXSAIIZE2), TextUnit.m6310getValueimpl(jM8755getMediumFontSizeXSAIIZE2) * fontSizeMultiplier5), new FontWeight(stripeTypography.getFontWeightNormal()), null, null, fontFamily5, null, TextUnitKt.getSp(-0.15d), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777049, null);
        if (systemFontFamilyFontFamily == null) {
            SystemFontFamily captionFontFamily = stripeTypography.getCaptionFontFamily();
            if (captionFontFamily == null) {
                captionFontFamily = FontFamily.INSTANCE.getDefault();
            }
            fontFamily6 = captionFontFamily;
        } else {
            fontFamily6 = systemFontFamilyFontFamily;
        }
        long jM8758getXSmallFontSizeXSAIIZE = stripeTypography.m8758getXSmallFontSizeXSAIIZE();
        float fontSizeMultiplier6 = stripeTypography.getFontSizeMultiplier();
        TextUnitKt.m6323checkArithmeticR2X_6o(jM8758getXSmallFontSizeXSAIIZE);
        TextStyle textStyleM5615copyp1EtxEg$default6 = TextStyle.m5615copyp1EtxEg$default(compat, 0L, TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM8758getXSmallFontSizeXSAIIZE), TextUnit.m6310getValueimpl(jM8758getXSmallFontSizeXSAIIZE) * fontSizeMultiplier6), new FontWeight(stripeTypography.getFontWeightMedium()), null, null, fontFamily6, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777177, null);
        if (systemFontFamilyFontFamily == null && (systemFontFamilyFontFamily = stripeTypography.getBody2FontFamily()) == null) {
            systemFontFamilyFontFamily = FontFamily.INSTANCE.getDefault();
        }
        FontFamily fontFamily9 = systemFontFamilyFontFamily;
        long jM8759getXxSmallFontSizeXSAIIZE = stripeTypography.m8759getXxSmallFontSizeXSAIIZE();
        float fontSizeMultiplier7 = stripeTypography.getFontSizeMultiplier();
        TextUnitKt.m6323checkArithmeticR2X_6o(jM8759getXxSmallFontSizeXSAIIZE);
        TextStyle textStyleM5615copyp1EtxEg$default7 = TextStyle.m5615copyp1EtxEg$default(compat, 0L, TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(jM8759getXxSmallFontSizeXSAIIZE), TextUnit.m6310getValueimpl(jM8759getXxSmallFontSizeXSAIIZE) * fontSizeMultiplier7), new FontWeight(stripeTypography.getFontWeightNormal()), null, null, fontFamily9, null, TextUnitKt.getSp(-0.15d), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777049, null);
        Typography typography = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable);
        Typography typographyCopy = typography.copy(toCompat(typography.getH1()), toCompat(typography.getH2()), toCompat(typography.getH3()), textStyleM5615copyp1EtxEg$default, textStyleM5615copyp1EtxEg$default2, textStyleM5615copyp1EtxEg$default3, textStyleM5615copyp1EtxEg$default5, toCompat(typography.getSubtitle2()), textStyleM5615copyp1EtxEg$default4, textStyleM5615copyp1EtxEg$default7, toCompat(typography.getButton()), textStyleM5615copyp1EtxEg$default6, toCompat(typography.getOverline()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typographyCopy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeColors LocalColors$lambda$1() {
        return StripeTheme.INSTANCE.getColors(false);
    }

    public static final ProvidableCompositionLocal<StripeColors> getLocalColors() {
        return LocalColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeShapes LocalShapes$lambda$2() {
        return StripeTheme.INSTANCE.getShapesMutable();
    }

    public static final ProvidableCompositionLocal<StripeShapes> getLocalShapes() {
        return LocalShapes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeTypography LocalTypography$lambda$3() {
        return StripeTheme.INSTANCE.getTypographyMutable();
    }

    public static final ProvidableCompositionLocal<StripeTypography> getLocalTypography() {
        return LocalTypography;
    }

    public static final ProvidableCompositionLocal<Float> getLocalSectionSpacing() {
        return LocalSectionSpacing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float LocalSectionSpacing$lambda$4() {
        return StripeTheme.INSTANCE.getCustomSectionSpacing();
    }

    public static final ProvidableCompositionLocal<IconStyle> getLocalIconStyle() {
        return LocalIconStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconStyle LocalIconStyle$lambda$5() {
        return StripeTheme.INSTANCE.getIconStyle();
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalInstrumentationTest() {
        return LocalInstrumentationTest;
    }

    public static final ProvidableCompositionLocal<SectionStyle> getLocalSectionStyle() {
        return LocalSectionStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SectionStyle LocalSectionStyle$lambda$7() {
        return StripeTheme.INSTANCE.getSectionStyle();
    }

    public static final ProvidableCompositionLocal<FormInsets> getLocalTextFieldInsets() {
        return LocalTextFieldInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormInsets LocalTextFieldInsets$lambda$8() {
        return StripeTheme.INSTANCE.getTextFieldInsets();
    }

    public static final void StripeTheme(StripeColors stripeColors, StripeShapes stripeShapes, StripeTypography stripeTypography, Float f, SectionStyle sectionStyle, FormInsets formInsets, IconStyle iconStyle, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final StripeColors colors;
        int i3;
        final StripeShapes shapesMutable;
        final StripeTypography typographyMutable;
        Float customSectionSpacing;
        SectionStyle sectionStyle2;
        FormInsets textFieldInsets;
        IconStyle iconStyle2;
        Object objM9118constructorimpl;
        Object objM9118constructorimpl2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1364556707);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                colors = stripeColors;
                int i4 = composerStartRestartGroup.changed(colors) ? 4 : 2;
                i3 = i4 | i;
            } else {
                colors = stripeColors;
            }
            i3 = i4 | i;
        } else {
            colors = stripeColors;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shapesMutable = stripeShapes;
                int i5 = composerStartRestartGroup.changed(shapesMutable) ? 32 : 16;
                i3 |= i5;
            } else {
                shapesMutable = stripeShapes;
            }
            i3 |= i5;
        } else {
            shapesMutable = stripeShapes;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            if ((i2 & 4) == 0) {
                typographyMutable = stripeTypography;
                int i6 = composerStartRestartGroup.changed(typographyMutable) ? 256 : 128;
                i3 |= i6;
            } else {
                typographyMutable = stripeTypography;
            }
            i3 |= i6;
        } else {
            typographyMutable = stripeTypography;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                customSectionSpacing = f;
                int i7 = composerStartRestartGroup.changed(customSectionSpacing) ? 2048 : 1024;
                i3 |= i7;
            } else {
                customSectionSpacing = f;
            }
            i3 |= i7;
        } else {
            customSectionSpacing = f;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                sectionStyle2 = sectionStyle;
                int i8 = composerStartRestartGroup.changed(sectionStyle2) ? 16384 : 8192;
                i3 |= i8;
            } else {
                sectionStyle2 = sectionStyle;
            }
            i3 |= i8;
        } else {
            sectionStyle2 = sectionStyle;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                textFieldInsets = formInsets;
                int i9 = composerStartRestartGroup.changed(textFieldInsets) ? 131072 : 65536;
                i3 |= i9;
            } else {
                textFieldInsets = formInsets;
            }
            i3 |= i9;
        } else {
            textFieldInsets = formInsets;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                iconStyle2 = iconStyle;
                int i10 = composerStartRestartGroup.changed(iconStyle2) ? 1048576 : 524288;
                i3 |= i10;
            } else {
                iconStyle2 = iconStyle;
            }
            i3 |= i10;
        } else {
            iconStyle2 = iconStyle;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    colors = StripeTheme.INSTANCE.getColors(DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0));
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    shapesMutable = StripeTheme.INSTANCE.getShapesMutable();
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    typographyMutable = StripeTheme.INSTANCE.getTypographyMutable();
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    customSectionSpacing = StripeTheme.INSTANCE.getCustomSectionSpacing();
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    sectionStyle2 = StripeTheme.INSTANCE.getSectionStyle();
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    textFieldInsets = StripeTheme.INSTANCE.getTextFieldInsets();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    iconStyle2 = StripeTheme.INSTANCE.getIconStyle();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1364556707, i3, -1, "com.stripe.android.uicore.StripeTheme (StripeTheme.kt:501)");
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(false);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = false;
            }
            boolean zBooleanValue = ((Boolean) objM9118constructorimpl).booleanValue();
            try {
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(false);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl2)) {
                objM9118constructorimpl2 = false;
            }
            boolean zBooleanValue2 = ((Boolean) objM9118constructorimpl2).booleanValue();
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalColors.provides(colors), LocalShapes.provides(shapesMutable), LocalTypography.provides(typographyMutable), LocalSectionSpacing.provides(customSectionSpacing), LocalSectionStyle.provides(sectionStyle2), LocalTextFieldInsets.provides(textFieldInsets), LocalIconStyle.provides(iconStyle2), InspectionModeKt.getLocalInspectionMode().provides(Boolean.valueOf(((Boolean) objConsume).booleanValue() || zBooleanValue)), LocalInstrumentationTest.provides(Boolean.valueOf(zBooleanValue2))}, ComposableLambdaKt.rememberComposableLambda(330928227, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.StripeThemeKt.StripeTheme.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(330928227, i11, -1, "com.stripe.android.uicore.StripeTheme.<anonymous> (StripeTheme.kt:529)");
                        }
                        Colors materialColors = colors.getMaterialColors();
                        Typography composeTypography = StripeThemeKt.toComposeTypography(typographyMutable, composer2, 0);
                        Shapes material = StripeThemeKt.toComposeShapes(shapesMutable, composer2, 0).getMaterial();
                        final Function2<Composer, Integer, Unit> function2 = content;
                        MaterialThemeKt.MaterialTheme(materialColors, composeTypography, material, ComposableLambdaKt.rememberComposableLambda(-1175408073, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.StripeThemeKt.StripeTheme.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1175408073, i12, -1, "com.stripe.android.uicore.StripeTheme.<anonymous>.<anonymous> (StripeTheme.kt:534)");
                                    }
                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                    ProvidableCompositionLocal<TextStyle> localTextStyle2 = TextKt.getLocalTextStyle();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composer3.consume(localTextStyle2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ProvidedValue<TextStyle> providedValueProvides = localTextStyle.provides(StripeThemeKt.toCompat((TextStyle) objConsume2));
                                    final Function2<Composer, Integer, Unit> function22 = function2;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-1470040713, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.StripeThemeKt.StripeTheme.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i13) {
                                            if ((i13 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1470040713, i13, -1, "com.stripe.android.uicore.StripeTheme.<anonymous>.<anonymous>.<anonymous> (StripeTheme.kt:537)");
                                            }
                                            function22.invoke(composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final StripeTypography stripeTypography2 = typographyMutable;
        final Float f2 = customSectionSpacing;
        final SectionStyle sectionStyle3 = sectionStyle2;
        final IconStyle iconStyle3 = iconStyle2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final StripeColors stripeColors2 = colors;
            final StripeShapes stripeShapes2 = shapesMutable;
            final FormInsets formInsets2 = textFieldInsets;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StripeThemeKt.StripeTheme$lambda$12(stripeColors2, stripeShapes2, stripeTypography2, f2, sectionStyle3, formInsets2, iconStyle3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DefaultStripeTheme(final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-103092460);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-103092460, i2, -1, "com.stripe.android.uicore.DefaultStripeTheme (StripeTheme.kt:551)");
            }
            final StripeColors stripeColorsColors = StripeThemeDefaults.INSTANCE.colors(DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0));
            final StripeShapes shapes = StripeThemeDefaults.INSTANCE.getShapes();
            final StripeTypography typography = StripeThemeDefaults.INSTANCE.getTypography();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalColors.provides(stripeColorsColors), LocalShapes.provides(shapes), LocalTypography.provides(typography)}, ComposableLambdaKt.rememberComposableLambda(741221332, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.StripeThemeKt.DefaultStripeTheme.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(741221332, i3, -1, "com.stripe.android.uicore.DefaultStripeTheme.<anonymous> (StripeTheme.kt:561)");
                        }
                        MaterialThemeKt.MaterialTheme(stripeColorsColors.getMaterialColors(), StripeThemeKt.toComposeTypography(typography, composer2, 6), StripeThemeKt.toComposeShapes(shapes, composer2, 6).getMaterial(), content, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StripeThemeKt.DefaultStripeTheme$lambda$13(content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final StripeColors getStripeColors(MaterialTheme materialTheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1304104896, i, -1, "com.stripe.android.uicore.<get-stripeColors> (StripeTheme.kt:574)");
        }
        ProvidableCompositionLocal<StripeColors> providableCompositionLocal = LocalColors;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        StripeColors stripeColors = (StripeColors) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stripeColors;
    }

    public static final StripeShapes getStripeShapes(MaterialTheme materialTheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1758187266, i, -1, "com.stripe.android.uicore.<get-stripeShapes> (StripeTheme.kt:580)");
        }
        ProvidableCompositionLocal<StripeShapes> providableCompositionLocal = LocalShapes;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        StripeShapes stripeShapes = (StripeShapes) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stripeShapes;
    }

    public static final StripeTypography getStripeTypography(MaterialTheme materialTheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-589352801, i, -1, "com.stripe.android.uicore.<get-stripeTypography> (StripeTheme.kt:587)");
        }
        ProvidableCompositionLocal<StripeTypography> providableCompositionLocal = LocalTypography;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        StripeTypography stripeTypography = (StripeTypography) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stripeTypography;
    }

    public static final long getBorderStrokeColor(MaterialTheme materialTheme, boolean z, Composer composer, int i) {
        long jM8726getComponentBorder0d7_KjU;
        Intrinsics.checkNotNullParameter(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782836080, i, -1, "com.stripe.android.uicore.getBorderStrokeColor (StripeTheme.kt:601)");
        }
        if (z) {
            composer.startReplaceGroup(358255896);
            jM8726getComponentBorder0d7_KjU = getStripeColors(materialTheme, composer, MaterialTheme.$stable | (i & 14)).getMaterialColors().m1833getPrimary0d7_KjU();
        } else {
            composer.startReplaceGroup(358256736);
            jM8726getComponentBorder0d7_KjU = getStripeColors(materialTheme, composer, MaterialTheme.$stable | (i & 14)).m8726getComponentBorder0d7_KjU();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM8726getComponentBorder0d7_KjU;
    }

    public static final BorderStroke getBorderStroke(MaterialTheme materialTheme, boolean z, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(983266912, i, -1, "com.stripe.android.uicore.getBorderStroke (StripeTheme.kt:607)");
        }
        int i2 = i & 14;
        int i3 = MaterialTheme.$stable | i2;
        int i4 = i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
        BorderStroke borderStrokeM602BorderStrokecXLIe8U = BorderStrokeKt.m602BorderStrokecXLIe8U(m8742getBorderStrokeWidth6a0pyJM(materialTheme, z, 0.0f, composer, i3 | i4, 2), getBorderStrokeColor(materialTheme, z, composer, MaterialTheme.$stable | i2 | i4));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM602BorderStrokecXLIe8U;
    }

    public static final boolean isSystemDarkTheme(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: convertDpToPx-3ABfNKs, reason: not valid java name */
    public static final float m8738convertDpToPx3ABfNKs(Context convertDpToPx, float f) {
        Intrinsics.checkNotNullParameter(convertDpToPx, "$this$convertDpToPx");
        return f * convertDpToPx.getResources().getDisplayMetrics().density;
    }

    /* renamed from: createTextSpanFromTextStyle-qhTmNto, reason: not valid java name */
    public static final SpannableString m8739createTextSpanFromTextStyleqhTmNto(String str, Context context, float f, long j, Integer num) throws Resources.NotFoundException {
        Typeface font;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan((int) m8738convertDpToPx3ABfNKs(context, f)), 0, spannableString.length(), 0);
        spannableString.setSpan(new ForegroundColorSpan(ColorKt.m3711toArgb8_81llA(j)), 0, spannableString.length(), 0);
        if (num != null) {
            font = ResourcesCompat.getFont(context, num.intValue());
        } else {
            font = Typeface.DEFAULT;
        }
        if (font != null) {
            spannableString.setSpan(new CustomTypefaceSpan(font), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    /* renamed from: shouldUseDarkDynamicColor-8_81llA, reason: not valid java name */
    public static final boolean m8745shouldUseDarkDynamicColor8_81llA(long j) {
        double dCalculateContrast = ColorUtils.calculateContrast(ColorKt.m3711toArgb8_81llA(j), ColorKt.m3711toArgb8_81llA(Color.INSTANCE.m3683getBlack0d7_KjU()));
        double dCalculateContrast2 = ColorUtils.calculateContrast(ColorKt.m3711toArgb8_81llA(j), ColorKt.m3711toArgb8_81llA(Color.INSTANCE.m3694getWhite0d7_KjU()));
        return dCalculateContrast2 <= 2.2d && dCalculateContrast > dCalculateContrast2;
    }

    public static final int getBackgroundColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ColorKt.m3711toArgb8_81llA((isSystemDarkTheme(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m8705getBackground0d7_KjU());
    }

    public static final int getSuccessBackgroundColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ColorKt.m3711toArgb8_81llA((isSystemDarkTheme(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m8709getSuccessBackground0d7_KjU());
    }

    public static final int getOnBackgroundColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ColorKt.m3711toArgb8_81llA((isSystemDarkTheme(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m8707getOnBackground0d7_KjU());
    }

    public static final int getOnSuccessBackgroundColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ColorKt.m3711toArgb8_81llA((isSystemDarkTheme(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m8708getOnSuccessBackground0d7_KjU());
    }

    public static final int getBorderStrokeColor(PrimaryButtonStyle primaryButtonStyle, Context context) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ColorKt.m3711toArgb8_81llA((isSystemDarkTheme(context) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m8706getBorder0d7_KjU());
    }

    public static final TextStyle getComposeTextStyle(PrimaryButtonStyle primaryButtonStyle, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057860207, i, -1, "com.stripe.android.uicore.getComposeTextStyle (StripeTheme.kt:748)");
        }
        TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH5(), (DarkThemeKt.isSystemInDarkTheme(composer, 0) ? primaryButtonStyle.getColorsDark() : primaryButtonStyle.getColorsLight()).m8707getOnBackground0d7_KjU(), primaryButtonStyle.getTypography().m8713getFontSizeXSAIIZE(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777212, null);
        if (primaryButtonStyle.getTypography().getFontFamily() != null) {
            textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(textStyleM5615copyp1EtxEg$default, 0L, 0L, null, null, null, FontFamilyKt.FontFamily(FontKt.m5695FontYpTlLL0$default(primaryButtonStyle.getTypography().getFontFamily().intValue(), null, 0, 0, 14, null)), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textStyleM5615copyp1EtxEg$default;
    }

    public static final float getRawValueFromDimenResource(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDimension(i) / context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: lighten-DxMtmZc, reason: not valid java name */
    public static final long m8743lightenDxMtmZc(long j, final float f) {
        return m8744modifyBrightnessDxMtmZc(j, new Function1() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(StripeThemeKt.lighten_DxMtmZc$lambda$15(f, ((Float) obj).floatValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lighten_DxMtmZc$lambda$15(float f, float f2) {
        return Float.max(f2 + f, 1.0f);
    }

    /* renamed from: darken-DxMtmZc, reason: not valid java name */
    public static final long m8740darkenDxMtmZc(long j, final float f) {
        return m8744modifyBrightnessDxMtmZc(j, new Function1() { // from class: com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(StripeThemeKt.darken_DxMtmZc$lambda$16(f, ((Float) obj).floatValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float darken_DxMtmZc$lambda$16(float f, float f2) {
        return Float.max(f2 - f, 0.0f);
    }

    public static final PaddingValues getOuterFormInsets(StripeTheme stripeTheme) {
        Intrinsics.checkNotNullParameter(stripeTheme, "<this>");
        return PaddingKt.m1017PaddingValuesa9UjIt4$default(Dp.m6117constructorimpl(stripeTheme.getFormInsets().getStart()), 0.0f, Dp.m6117constructorimpl(stripeTheme.getFormInsets().getEnd()), 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle toCompat(TextStyle textStyle) {
        return TextStyle.m5615copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextStyle.INSTANCE.getDefault().m5641getLineHeightXSAIIZE(), null, new PlatformTextStyle(true), TextStyle.INSTANCE.getDefault().getLineHeightStyle(), 0, 0, null, 15073279, null);
    }

    /* renamed from: elseIfNullOrUnspecified-ihG4tgY, reason: not valid java name */
    private static final long m8741elseIfNullOrUnspecifiedihG4tgY(TextUnit textUnit, long j) {
        if (textUnit != null) {
            long packedValue = textUnit.getPackedValue();
            if (!TextUnitKt.m6328isUnspecifiedR2X_6o(packedValue)) {
                return packedValue;
            }
        }
        return j;
    }

    /* renamed from: modifyBrightness-DxMtmZc, reason: not valid java name */
    private static final long m8744modifyBrightnessDxMtmZc(long j, Function1<? super Float, Float> function1) {
        float[] fArr = new float[3];
        ColorUtils.colorToHSL(ColorKt.m3711toArgb8_81llA(j), fArr);
        return Color.Companion.m3681hslJlNiLsg$default(Color.INSTANCE, fArr[0], fArr[1], function1.invoke(Float.valueOf(fArr[2])).floatValue(), 0.0f, null, 24, null);
    }

    /* renamed from: getBorderStrokeWidth-6a0pyJM, reason: not valid java name */
    public static final float m8742getBorderStrokeWidth6a0pyJM(MaterialTheme getBorderStrokeWidth, boolean z, float f, Composer composer, int i, int i2) {
        float fM6117constructorimpl;
        Intrinsics.checkNotNullParameter(getBorderStrokeWidth, "$this$getBorderStrokeWidth");
        if ((i2 & 2) != 0) {
            f = Dp.m6117constructorimpl(2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1120367414, i, -1, "com.stripe.android.uicore.getBorderStrokeWidth (StripeTheme.kt:595)");
        }
        if (!z) {
            composer.startReplaceGroup(749430518);
            fM6117constructorimpl = Dp.m6117constructorimpl(getStripeShapes(getBorderStrokeWidth, composer, MaterialTheme.$stable | (i & 14)).getBorderStrokeWidth());
        } else {
            composer.startReplaceGroup(749427441);
            fM6117constructorimpl = Dp.m6117constructorimpl(Math.max(Dp.m6117constructorimpl(getStripeShapes(getBorderStrokeWidth, composer, MaterialTheme.$stable | (i & 14)).getBorderStrokeWidth()), f));
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM6117constructorimpl;
    }
}
