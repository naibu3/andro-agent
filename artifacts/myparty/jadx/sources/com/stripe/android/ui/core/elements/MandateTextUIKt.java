package com.stripe.android.ui.core.elements;

import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.text.EmbeddableImage;
import com.stripe.android.uicore.text.HtmlKt;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MandateTextUI.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aM\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010\u0019\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"MANDATE_TEST_TAG", "", "MandateTextUI", "", "element", "Lcom/stripe/android/ui/core/elements/MandateTextElement;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/ui/core/elements/MandateTextElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Mandate", "mandateText", ViewProps.TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "imageAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "imageLoader", "", "Lcom/stripe/android/uicore/text/EmbeddableImage;", "Mandate-J7GKd-g", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "calculateLineHeight", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/ui/text/TextStyle;", PaymentSheetAppearanceKeys.SPACING, "", "(Landroidx/compose/ui/text/TextStyle;I)J", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MandateTextUIKt {
    public static final String MANDATE_TEST_TAG = "mandate_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MandateTextUI$lambda$0(MandateTextElement mandateTextElement, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MandateTextUI(mandateTextElement, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Mandate_J7GKd_g$lambda$4(String str, Modifier modifier, int i, int i2, Map map, int i3, int i4, Composer composer, int i5) {
        m8662MandateJ7GKdg(str, modifier, i, i2, map, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    public static final void MandateTextUI(final MandateTextElement element, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(element, "element");
        Composer composerStartRestartGroup = composer.startRestartGroup(1816070877);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(element) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1816070877, i3, -1, "com.stripe.android.ui.core.elements.MandateTextUI (MandateTextUI.kt:28)");
            }
            int stringResId = element.getStringResId();
            String[] strArr = (String[]) element.getArgs().toArray(new String[0]);
            m8662MandateJ7GKdg(StringResources_androidKt.stringResource(stringResId, Arrays.copyOf(strArr, strArr.length), composerStartRestartGroup, 0), modifier2, 0, 0, null, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.elements.MandateTextUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MandateTextUIKt.MandateTextUI$lambda$0(element, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /* renamed from: Mandate-J7GKd-g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8662MandateJ7GKdg(final String str, Modifier modifier, int i, int i2, Map<String, ? extends EmbeddableImage> map, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        Map<String, ? extends EmbeddableImage> map2;
        int iM6009getLefte0LSkKk;
        int iM5524getAboveBaselineJ6kI3mc;
        Modifier modifier3;
        int i9;
        int i10;
        Map<String, ? extends EmbeddableImage> mapEmptyMap;
        int i11;
        final Map<String, ? extends EmbeddableImage> map3;
        final int i12;
        final Modifier modifier4;
        final int i13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(524862596);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                if ((i4 & 4) == 0) {
                    i6 = i;
                    int i15 = composerStartRestartGroup.changed(i6) ? 256 : 128;
                    i5 |= i15;
                } else {
                    i6 = i;
                }
                i5 |= i15;
            } else {
                i6 = i;
            }
            if ((i3 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    i7 = i2;
                    int i16 = composerStartRestartGroup.changed(i7) ? 2048 : 1024;
                    i5 |= i16;
                } else {
                    i7 = i2;
                }
                i5 |= i16;
            } else {
                i7 = i2;
            }
            i8 = i4 & 16;
            if (i8 != 0) {
                if ((i3 & 24576) == 0) {
                    map2 = map;
                    i5 |= composerStartRestartGroup.changedInstance(map2) ? 16384 : 8192;
                }
                if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i14 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i4 & 4) == 0) {
                            iM6009getLefte0LSkKk = TextAlign.INSTANCE.m6009getLefte0LSkKk();
                            i5 &= -897;
                        } else {
                            iM6009getLefte0LSkKk = i6;
                        }
                        if ((i4 & 8) == 0) {
                            iM5524getAboveBaselineJ6kI3mc = PlaceholderVerticalAlign.INSTANCE.m5524getAboveBaselineJ6kI3mc();
                            i5 &= -7169;
                        } else {
                            iM5524getAboveBaselineJ6kI3mc = i7;
                        }
                        if (i8 == 0) {
                            modifier3 = companion;
                            i9 = iM6009getLefte0LSkKk;
                            i11 = iM5524getAboveBaselineJ6kI3mc;
                            i10 = i5;
                            mapEmptyMap = MapsKt.emptyMap();
                        } else {
                            modifier3 = companion;
                            i9 = iM6009getLefte0LSkKk;
                            i10 = i5;
                            mapEmptyMap = map2;
                            i11 = iM5524getAboveBaselineJ6kI3mc;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        i10 = i5;
                        modifier3 = modifier2;
                        i9 = i6;
                        mapEmptyMap = map2;
                        i11 = i7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(524862596, i10, -1, "com.stripe.android.ui.core.elements.Mandate (MandateTextUI.kt:40)");
                    }
                    if (str != null) {
                        TextStyle caption = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getCaption();
                        long jCalculateLineHeight = calculateLineHeight(caption, 3);
                        long jM8730getSubtitle0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8730getSubtitle0d7_KjU();
                        long sp = TextUnitKt.getSp(11);
                        float fontSizeMultiplier = StripeTheme.INSTANCE.getTypographyMutable().getFontSizeMultiplier();
                        TextUnitKt.m6323checkArithmeticR2X_6o(sp);
                        TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(caption, 0L, TextUnitKt.pack(TextUnit.m6308getRawTypeimpl(sp), TextUnit.m6310getValueimpl(sp) * fontSizeMultiplier), FontWeight.INSTANCE.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, i9, 0, jCalculateLineHeight, null, null, null, 0, 0, null, 16613369, null);
                        composerStartRestartGroup.startReplaceGroup(1499365562);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.stripe.android.ui.core.elements.MandateTextUIKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return MandateTextUIKt.Mandate_J7GKd_g$lambda$3$lambda$2$lambda$1((SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        HtmlKt.m8897Htmlm4MizFo(str, TestTagKt.testTag(SemanticsModifierKt.semantics(modifier3, true, (Function1) objRememberedValue), MANDATE_TEST_TAG), mapEmptyMap, jM8730getSubtitle0d7_KjU, textStyleM5615copyp1EtxEg$default, false, new SpanStyle(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), i11, null, composerStartRestartGroup, (i10 & 14) | ((i10 >> 6) & 896) | ((i10 << 12) & 29360128), 288);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    map3 = mapEmptyMap;
                    i12 = i11;
                    modifier4 = modifier3;
                    i13 = i9;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    i13 = i6;
                    i12 = i7;
                    map3 = map2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.elements.MandateTextUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MandateTextUIKt.Mandate_J7GKd_g$lambda$4(str, modifier4, i13, i12, map3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            map2 = map;
            if ((i5 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i14 == 0) {
                    }
                    if ((i4 & 4) == 0) {
                    }
                    if ((i4 & 8) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (str != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    map3 = mapEmptyMap;
                    i12 = i11;
                    modifier4 = modifier3;
                    i13 = i9;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        map2 = map;
        if ((i5 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Mandate_J7GKd_g$lambda$3$lambda$2$lambda$1(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    private static final long calculateLineHeight(TextStyle textStyle, int i) {
        if (TextUnit.m6313isSpimpl(textStyle.m5633getFontSizeXSAIIZE())) {
            return TextUnitKt.getSp(TextUnit.m6310getValueimpl(textStyle.m5633getFontSizeXSAIIZE()) + i);
        }
        return textStyle.m5633getFontSizeXSAIIZE();
    }
}
