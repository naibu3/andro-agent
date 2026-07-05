package com.stripe.android.ui.core.elements;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.text.EmbeddableImage;
import com.stripe.android.uicore.text.HtmlKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AfterpayClearpayElementUI.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"AfterpayClearpayElementUI", "", ViewProps.ENABLED, "", "element", "Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AfterpayClearpayElementUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AfterpayClearpayElementUI$lambda$2(boolean z, AfterpayClearpayHeaderElement afterpayClearpayHeaderElement, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AfterpayClearpayElementUI(z, afterpayClearpayHeaderElement, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AfterpayClearpayElementUI(final boolean z, final AfterpayClearpayHeaderElement element, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Modifier modifier2;
        final Context context;
        int i4;
        int i5;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(element, "element");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1217517664);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(element) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1217517664, i3, -1, "com.stripe.android.ui.core.elements.AfterpayClearpayElementUI (AfterpayClearpayElementUI.kt:26)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                context = (Context) objConsume;
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String strReplace$default = StringsKt.replace$default(element.getLabel(resources), "<img/>", "<img src=\"afterpay\"/>", false, 4, (Object) null);
                if (!AfterpayClearpayHeaderElement.INSTANCE.isClearpay(element.getCurrency())) {
                    i4 = R.drawable.stripe_ic_clearpay_logo;
                } else {
                    i4 = R.drawable.stripe_ic_afterpay_logo;
                }
                if (!AfterpayClearpayHeaderElement.INSTANCE.isClearpay(element.getCurrency())) {
                    i5 = R.string.stripe_paymentsheet_payment_method_clearpay;
                } else {
                    i5 = R.string.stripe_paymentsheet_payment_method_afterpay;
                }
                Map mapMapOf = MapsKt.mapOf(TuplesKt.to("afterpay", new EmbeddableImage.Drawable(i4, i5, !StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1837getSurface0d7_KjU()) ? null : ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, Color.INSTANCE.m3694getWhite0d7_KjU(), 0, 2, null))));
                long jM8730getSubtitle0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8730getSubtitle0d7_KjU();
                TextStyle h6 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getH6();
                SpanStyle spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (DefaultConstructorMarker) null);
                int iM5525getBottomJ6kI3mc = PlaceholderVerticalAlign.INSTANCE.m5525getBottomJ6kI3mc();
                composerStartRestartGroup.startReplaceGroup(1671755009);
                zChangedInstance = composerStartRestartGroup.changedInstance(element) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.ui.core.elements.AfterpayClearpayElementUIKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AfterpayClearpayElementUIKt.AfterpayClearpayElementUI$lambda$1$lambda$0(element, context);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                HtmlKt.m8897Htmlm4MizFo(strReplace$default, modifier4, mapMapOf, jM8730getSubtitle0d7_KjU, h6, z2, spanStyle, iM5525getBottomJ6kI3mc, (Function0) objRememberedValue, composerStartRestartGroup, ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 1572864 | (EmbeddableImage.Drawable.$stable << 6) | ((i3 << 15) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.elements.AfterpayClearpayElementUIKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AfterpayClearpayElementUIKt.AfterpayClearpayElementUI$lambda$2(z, element, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            context = (Context) objConsume2;
            Resources resources2 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            String strReplace$default2 = StringsKt.replace$default(element.getLabel(resources2), "<img/>", "<img src=\"afterpay\"/>", false, 4, (Object) null);
            if (!AfterpayClearpayHeaderElement.INSTANCE.isClearpay(element.getCurrency())) {
            }
            if (!AfterpayClearpayHeaderElement.INSTANCE.isClearpay(element.getCurrency())) {
            }
            Map mapMapOf2 = MapsKt.mapOf(TuplesKt.to("afterpay", new EmbeddableImage.Drawable(i4, i5, !StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1837getSurface0d7_KjU()) ? null : ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, Color.INSTANCE.m3694getWhite0d7_KjU(), 0, 2, null))));
            long jM8730getSubtitle0d7_KjU2 = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8730getSubtitle0d7_KjU();
            TextStyle h62 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getH6();
            SpanStyle spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65535, (DefaultConstructorMarker) null);
            int iM5525getBottomJ6kI3mc2 = PlaceholderVerticalAlign.INSTANCE.m5525getBottomJ6kI3mc();
            composerStartRestartGroup.startReplaceGroup(1671755009);
            zChangedInstance = composerStartRestartGroup.changedInstance(element) | composerStartRestartGroup.changedInstance(context);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.ui.core.elements.AfterpayClearpayElementUIKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AfterpayClearpayElementUIKt.AfterpayClearpayElementUI$lambda$1$lambda$0(element, context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                HtmlKt.m8897Htmlm4MizFo(strReplace$default2, modifier4, mapMapOf2, jM8730getSubtitle0d7_KjU2, h62, z2, spanStyle2, iM5525getBottomJ6kI3mc2, (Function0) objRememberedValue, composerStartRestartGroup, ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 1572864 | (EmbeddableImage.Drawable.$stable << 6) | ((i3 << 15) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AfterpayClearpayElementUI$lambda$1$lambda$0(AfterpayClearpayHeaderElement afterpayClearpayHeaderElement, Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(afterpayClearpayHeaderElement.getInfoUrl())));
        return Unit.INSTANCE;
    }
}
