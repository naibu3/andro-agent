package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.content.res.ResourcesCompat;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeTypography;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorMessage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ErrorMessage", "", "error", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ErrorMessageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorMessage$lambda$6(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ErrorMessage(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorMessage(final String error, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Density density;
        StripeTypography stripeTypography;
        boolean zChanged;
        Object objRememberedValue;
        Integer fontFamily;
        boolean zChanged2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(error, "error");
        Composer composerStartRestartGroup = composer.startRestartGroup(228805126);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(error) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(228805126, i3, -1, "com.stripe.android.paymentsheet.ui.ErrorMessage (ErrorMessage.kt:23)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Context context = (Context) objConsume;
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                density = (Density) objConsume2;
                stripeTypography = StripeThemeKt.getStripeTypography(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable);
                composerStartRestartGroup.startReplaceGroup(72788359);
                zChanged = composerStartRestartGroup.changed(stripeTypography);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    fontFamily = stripeTypography.getFontFamily();
                    if (fontFamily != null || (font = ResourcesCompat.getFont(context, fontFamily.intValue())) == null) {
                        Typeface font = Typeface.DEFAULT;
                    }
                    objRememberedValue = font;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Typeface typeface = (Typeface) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(72793700);
                zChanged2 = composerStartRestartGroup.changed(stripeTypography);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = TextUnit.m6300boximpl(density.mo714toSp0xMU5do(Dp.m6117constructorimpl(Dp.m6117constructorimpl(TextUnit.m6310getValueimpl(StripeThemeDefaults.INSTANCE.getTypography().m8756getSmallFontSizeXSAIIZE())) * stripeTypography.getFontSizeMultiplier())));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                long packedValue = ((TextUnit) objRememberedValue2).getPackedValue();
                composerStartRestartGroup.endReplaceGroup();
                long jM1827getError0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1827getError0d7_KjU();
                Intrinsics.checkNotNull(typeface);
                FontFamily FontFamily = AndroidTypeface_androidKt.FontFamily(typeface);
                composerStartRestartGroup.startReplaceGroup(72806137);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.ErrorMessageKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ErrorMessageKt.ErrorMessage$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i5 = i3 & 14;
                Modifier modifier3 = companion;
                composer2 = composerStartRestartGroup;
                TextKt.m2076Text4IGK_g(error, SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue3, 1, null), jM1827getError0d7_KjU, packedValue, (FontStyle) null, (FontWeight) null, FontFamily, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i5, 0, 130992);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.ErrorMessageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ErrorMessageKt.ErrorMessage$lambda$6(error, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context2 = (Context) objConsume3;
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume22 = composerStartRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            density = (Density) objConsume22;
            stripeTypography = StripeThemeKt.getStripeTypography(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable);
            composerStartRestartGroup.startReplaceGroup(72788359);
            zChanged = composerStartRestartGroup.changed(stripeTypography);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                fontFamily = stripeTypography.getFontFamily();
                if (fontFamily != null) {
                    Typeface font2 = Typeface.DEFAULT;
                    objRememberedValue = font2;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Typeface typeface2 = (Typeface) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(72793700);
                    zChanged2 = composerStartRestartGroup.changed(stripeTypography);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue2 = TextUnit.m6300boximpl(density.mo714toSp0xMU5do(Dp.m6117constructorimpl(Dp.m6117constructorimpl(TextUnit.m6310getValueimpl(StripeThemeDefaults.INSTANCE.getTypography().m8756getSmallFontSizeXSAIIZE())) * stripeTypography.getFontSizeMultiplier())));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        long packedValue2 = ((TextUnit) objRememberedValue2).getPackedValue();
                        composerStartRestartGroup.endReplaceGroup();
                        long jM1827getError0d7_KjU2 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1827getError0d7_KjU();
                        Intrinsics.checkNotNull(typeface2);
                        FontFamily FontFamily2 = AndroidTypeface_androidKt.FontFamily(typeface2);
                        composerStartRestartGroup.startReplaceGroup(72806137);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i52 = i3 & 14;
                        Modifier modifier32 = companion;
                        composer2 = composerStartRestartGroup;
                        TextKt.m2076Text4IGK_g(error, SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue3, 1, null), jM1827getError0d7_KjU2, packedValue2, (FontStyle) null, (FontWeight) null, FontFamily2, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i52, 0, 130992);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier32;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorMessage$lambda$5$lambda$4(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m5430setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m5403getAssertive0phEisY());
        return Unit.INSTANCE;
    }
}
