package com.stripe.android.uicore.elements;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.uicore.FocusManagerKtKt;
import com.stripe.android.uicore.StripeThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: OTPElementUI.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001ay\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a]\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010$\u001aQ\u0010%\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010'¢\u0006\u0002\b(\u0012\u0004\u0012\u00020\u00010&¢\u0006\u0002\b(2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010)¨\u0006*²\u0006\n\u0010+\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"OTPElementUIPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "OTPElementUIDisabledPreview", "OTPElementUI", ViewProps.ENABLED, "", "element", "Lcom/stripe/android/uicore/elements/OTPElement;", "modifier", "Landroidx/compose/ui/Modifier;", "boxShape", "Landroidx/compose/ui/graphics/Shape;", "boxTextStyle", "Landroidx/compose/ui/text/TextStyle;", "boxSpacing", "Landroidx/compose/ui/unit/Dp;", "middleSpacing", "otpInputPlaceholder", "", PaymentSheetAppearanceKeys.COLORS, "Lcom/stripe/android/uicore/elements/OTPElementColors;", "selectedStrokeWidth", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "OTPElementUI-RE_urrM", "(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;III)V", "OTPInputBox", "value", "isSelected", "textStyle", "index", "", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "OTPInputDecorationBox", "Lkotlin/Function1;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;ZLjava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;", "stripe-ui-core_release", "focusedElementIndex"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OTPElementUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OTPElementUIDisabledPreview$lambda$1(int i, Composer composer, int i2) {
        OTPElementUIDisabledPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OTPElementUIPreview$lambda$0(int i, Composer composer, int i2) {
        OTPElementUIPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OTPElementUI_RE_urrM$lambda$8(boolean z, OTPElement oTPElement, Modifier modifier, Shape shape, TextStyle textStyle, float f, float f2, String str, OTPElementColors oTPElementColors, float f3, FocusRequester focusRequester, int i, int i2, int i3, Composer composer, int i4) {
        m8812OTPElementUIRE_urrM(z, oTPElement, modifier, shape, textStyle, f, f2, str, oTPElementColors, f3, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OTPInputBox$lambda$16(String str, boolean z, TextStyle textStyle, OTPElement oTPElement, int i, FocusManager focusManager, Modifier modifier, boolean z2, OTPElementColors oTPElementColors, String str2, int i2, Composer composer, int i3) {
        OTPInputBox(str, z, textStyle, oTPElement, i, focusManager, modifier, z2, oTPElementColors, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void OTPElementUIPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2099780475);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2099780475, i, -1, "com.stripe.android.uicore.elements.OTPElementUIPreview (OTPElementUI.kt:66)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableSingletons$OTPElementUIKt.INSTANCE.m8781getLambda1$stripe_ui_core_release(), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OTPElementUIKt.OTPElementUIPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OTPElementUIDisabledPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(22458207);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(22458207, i, -1, "com.stripe.android.uicore.elements.OTPElementUIDisabledPreview (OTPElementUI.kt:80)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableSingletons$OTPElementUIKt.INSTANCE.m8782getLambda2$stripe_ui_core_release(), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OTPElementUIKt.OTPElementUIDisabledPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* renamed from: OTPElementUI-RE_urrM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8812OTPElementUIRE_urrM(final boolean z, final OTPElement element, Modifier modifier, Shape shape, TextStyle textStyle, float f, float f2, String str, OTPElementColors oTPElementColors, float f3, FocusRequester focusRequester, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Shape shape2;
        TextStyle textStyle2;
        int i5;
        float f4;
        int i6;
        float fM6117constructorimpl;
        int i7;
        OTPElementColors oTPElementColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        CornerBasedShape medium;
        TextStyle textStyleDefaultTextStyle;
        String str2;
        OTPElementColors oTPElementColors3;
        float fM6117constructorimpl2;
        Modifier modifier3;
        float f5;
        Shape shape3;
        TextStyle textStyle3;
        OTPElementColors oTPElementColors4;
        FocusRequester focusRequester2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Iterator<Integer> it;
        Composer composer2;
        final OTPElementColors oTPElementColors5;
        final String str3;
        final Shape shape4;
        final FocusRequester focusRequester3;
        final TextStyle textStyle4;
        final Modifier modifier4;
        final float f6;
        final float f7;
        Iterator<Integer> it2;
        boolean z2;
        float disabled;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(element, "element");
        Composer composerStartRestartGroup = composer.startRestartGroup(-280585760);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(element) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    shape2 = shape;
                    int i14 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                    i4 |= i14;
                } else {
                    shape2 = shape;
                }
                i4 |= i14;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    textStyle2 = textStyle;
                    int i15 = composerStartRestartGroup.changed(textStyle2) ? 16384 : 8192;
                    i4 |= i15;
                } else {
                    textStyle2 = textStyle;
                }
                i4 |= i15;
            } else {
                textStyle2 = textStyle;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    f4 = f;
                    i4 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    fM6117constructorimpl = f2;
                } else {
                    fM6117constructorimpl = f2;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(fM6117constructorimpl) ? 1048576 : 524288;
                    }
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        oTPElementColors2 = oTPElementColors;
                        int i16 = composerStartRestartGroup.changed(oTPElementColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i4 |= i16;
                    } else {
                        oTPElementColors2 = oTPElementColors;
                    }
                    i4 |= i16;
                } else {
                    oTPElementColors2 = oTPElementColors;
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                    if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= composerStartRestartGroup.changed(f3) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i10;
                        i12 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (composerStartRestartGroup.changed(focusRequester) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i4 & 306783379) != 306783378 && (i12 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        f6 = f3;
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        shape4 = shape2;
                        str3 = str;
                        f7 = fM6117constructorimpl;
                        textStyle4 = textStyle2;
                        oTPElementColors5 = oTPElementColors2;
                        focusRequester3 = focusRequester;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i13 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 8) == 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium();
                                i4 &= -7169;
                            } else {
                                medium = shape2;
                            }
                            if ((i3 & 16) == 0) {
                                textStyleDefaultTextStyle = OTPElementUI.INSTANCE.defaultTextStyle(composerStartRestartGroup, 6);
                                i4 &= -57345;
                            } else {
                                textStyleDefaultTextStyle = textStyle2;
                            }
                            float fM6117constructorimpl3 = i5 == 0 ? Dp.m6117constructorimpl(8) : f4;
                            if (i6 != 0) {
                                fM6117constructorimpl = Dp.m6117constructorimpl(20);
                            }
                            str2 = i7 == 0 ? "●" : str;
                            if ((i3 & 256) == 0) {
                                oTPElementColors3 = new OTPElementColors(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8729getPlaceholderText0d7_KjU(), Color.INSTANCE.m3692getTransparent0d7_KjU(), Color.INSTANCE.m3692getTransparent0d7_KjU(), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8726getComponentBorder0d7_KjU(), null);
                                i4 = (-234881025) & i4;
                            } else {
                                oTPElementColors3 = oTPElementColors2;
                            }
                            fM6117constructorimpl2 = i9 == 0 ? Dp.m6117constructorimpl(2) : f3;
                            if (i11 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1737572977);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new FocusRequester();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                modifier3 = companion;
                                f5 = fM6117constructorimpl;
                                shape3 = medium;
                                textStyle3 = textStyleDefaultTextStyle;
                                f4 = fM6117constructorimpl3;
                                focusRequester2 = (FocusRequester) objRememberedValue2;
                                oTPElementColors4 = oTPElementColors3;
                            } else {
                                modifier3 = companion;
                                f5 = fM6117constructorimpl;
                                shape3 = medium;
                                textStyle3 = textStyleDefaultTextStyle;
                                f4 = fM6117constructorimpl3;
                                oTPElementColors4 = oTPElementColors3;
                                focusRequester2 = focusRequester;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            fM6117constructorimpl2 = f3;
                            f5 = fM6117constructorimpl;
                            shape3 = shape2;
                            textStyle3 = textStyle2;
                            oTPElementColors4 = oTPElementColors2;
                            str2 = str;
                            focusRequester2 = focusRequester;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-280585760, i4, i12, "com.stripe.android.uicore.elements.OTPElementUI (OTPElementUI.kt:113)");
                        }
                        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composerStartRestartGroup.consume(localFocusManager);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier5 = modifier3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        FocusManager focusManager = (FocusManager) objConsume;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        float f8 = fM6117constructorimpl2;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-538960683);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(-1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-538954822);
                        IntRange intRangeUntil = RangesKt.until(0, element.getController().getOtpLength());
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                        it = intRangeUntil.iterator();
                        while (it.hasNext()) {
                            int iNextInt = ((IntIterator) it).nextInt();
                            boolean z3 = OTPElementUI_RE_urrM$lambda$7$lambda$4(mutableIntState) == iNextInt;
                            if (iNextInt == 0) {
                                composerStartRestartGroup.startReplaceGroup(-1247415338);
                                composerStartRestartGroup.endReplaceGroup();
                                it2 = it;
                            } else if (iNextInt == element.getController().getOtpLength() / 2) {
                                composerStartRestartGroup.startReplaceGroup(-1247413470);
                                it2 = it;
                                SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, f5), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                it2 = it;
                                composerStartRestartGroup.startReplaceGroup(-1247411137);
                                SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, f4), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-538945187);
                            if (z) {
                                disabled = 1.0f;
                                z2 = z3;
                            } else {
                                z2 = z3;
                                disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, AlphaKt.alpha(companion2, disabled), 1.0f, false, 2, null);
                            long jM8725getComponent0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU();
                            float fM8742getBorderStrokeWidth6a0pyJM = StripeThemeKt.m8742getBorderStrokeWidth6a0pyJM(MaterialTheme.INSTANCE, z2, f8, composerStartRestartGroup, ((i4 >> 21) & 896) | MaterialTheme.$stable, 0);
                            boolean z4 = z2;
                            float f9 = f8;
                            int i17 = i4;
                            FocusManager focusManager2 = focusManager;
                            Composer composer3 = composerStartRestartGroup;
                            Shape shape5 = shape3;
                            SectionUIKt.m8829SectionCardfWhpE4E(modifierWeight$default, shape5, false, jM8725getComponent0d7_KjU, BorderStrokeKt.m602BorderStrokecXLIe8U(fM8742getBorderStrokeWidth6a0pyJM, z4 ? oTPElementColors4.m8807getSelectedBorder0d7_KjU() : oTPElementColors4.m8808getUnselectedBorder0d7_KjU()), ComposableLambdaKt.rememberComposableLambda(-1091924397, true, new OTPElementUIKt$OTPElementUI$2$1$1(element, iNextInt, z4, focusManager2, focusRequester2, textStyle3, z, oTPElementColors4, str2, mutableIntState), composer3, 54), composer3, ((i17 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4);
                            arrayList.add(Unit.INSTANCE);
                            shape3 = shape5;
                            focusManager = focusManager2;
                            composerStartRestartGroup = composer3;
                            it = it2;
                            f8 = f9;
                            i4 = i17;
                            f5 = f5;
                        }
                        float f10 = f8;
                        float f11 = f5;
                        composer2 = composerStartRestartGroup;
                        Shape shape6 = shape3;
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        String str4 = str2;
                        oTPElementColors5 = oTPElementColors4;
                        str3 = str4;
                        shape4 = shape6;
                        focusRequester3 = focusRequester2;
                        textStyle4 = textStyle3;
                        modifier4 = modifier5;
                        f6 = f10;
                        f7 = f11;
                    }
                    final float f12 = f4;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return OTPElementUIKt.OTPElementUI_RE_urrM$lambda$8(z, element, modifier4, shape4, textStyle4, f12, f7, str3, oTPElementColors5, f6, focusRequester3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 805306368;
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 == 0) {
                        }
                        if ((i3 & 8) == 0) {
                        }
                        if ((i3 & 16) == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composerStartRestartGroup.consume(localFocusManager2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier modifier52 = modifier3;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        FocusManager focusManager3 = (FocusManager) objConsume2;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        float f82 = fM6117constructorimpl2;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3150constructorimpl.getInserting()) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-538960683);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-538954822);
                            IntRange intRangeUntil2 = RangesKt.until(0, element.getController().getOtpLength());
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil2, 10));
                            it = intRangeUntil2.iterator();
                            while (it.hasNext()) {
                            }
                            float f102 = f82;
                            float f112 = f5;
                            composer2 = composerStartRestartGroup;
                            Shape shape62 = shape3;
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            String str42 = str2;
                            oTPElementColors5 = oTPElementColors4;
                            str3 = str42;
                            shape4 = shape62;
                            focusRequester3 = focusRequester2;
                            textStyle4 = textStyle3;
                            modifier4 = modifier52;
                            f6 = f102;
                            f7 = f112;
                        }
                    }
                }
                final float f122 = f4;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f4 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            final float f1222 = f4;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f4 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        final float f12222 = f4;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final int OTPElementUI_RE_urrM$lambda$7$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OTPInputBox(String str, final boolean z, final TextStyle textStyle, final OTPElement oTPElement, final int i, final FocusManager focusManager, final Modifier modifier, final boolean z2, final OTPElementColors oTPElementColors, final String str2, Composer composer, final int i2) {
        int i3;
        long jM5607getZerod9O1mEE;
        Composer composer2;
        final String str3 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1791721297);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(oTPElement) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(focusManager) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(oTPElementColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1791721297, i3, -1, "com.stripe.android.uicore.elements.OTPInputBox (OTPElementUI.kt:212)");
            }
            if (z) {
                jM5607getZerod9O1mEE = TextRangeKt.TextRange(str3.length());
            } else {
                jM5607getZerod9O1mEE = TextRange.INSTANCE.m5607getZerod9O1mEE();
            }
            int i4 = i3;
            TextFieldValue textFieldValue = new TextFieldValue(str3, jM5607getZerod9O1mEE, (TextRange) null, 4, (DefaultConstructorMarker) null);
            SolidColor solidColor = new SolidColor(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8731getTextCursor0d7_KjU(), null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, oTPElement.getController().getKeyboardType(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
            composerStartRestartGroup.startReplaceGroup(1117275294);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OTPElementUIKt.OTPInputBox$lambda$10$lambda$9(focusManager, (KeyboardActionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1117272882);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(focusManager);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OTPElementUIKt.OTPInputBox$lambda$12$lambda$11(focusManager, (KeyboardActionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            KeyboardActions keyboardActions = new KeyboardActions(function1, null, (Function1) objRememberedValue2, null, null, null, 58, null);
            int i5 = i4 & 14;
            int i6 = i4 >> 12;
            int i7 = i6 & 7168;
            composer2 = composerStartRestartGroup;
            Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function3OTPInputDecorationBox = OTPInputDecorationBox(str, z, str2, z2, oTPElementColors, composer2, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | ((i4 >> 21) & 896) | i7 | (i6 & 57344));
            str3 = str;
            composer2.startReplaceGroup(1117244683);
            boolean zChangedInstance3 = ((i4 & 57344) == 16384) | (i5 == 4) | composer2.changedInstance(oTPElement) | composer2.changedInstance(focusManager);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OTPElementUIKt.OTPInputBox$lambda$15$lambda$14(str3, oTPElement, i, focusManager, (TextFieldValue) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue3, modifier, z2, false, textStyle, keyboardOptions, keyboardActions, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3OTPInputDecorationBox, composer2, (i6 & 896) | 100663296 | i7 | ((i4 << 9) & 458752), 0, 15888);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OTPElementUIKt.OTPInputBox$lambda$16(str3, z, textStyle, oTPElement, i, focusManager, modifier, z2, oTPElementColors, str2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OTPInputBox$lambda$15$lambda$14(String str, OTPElement oTPElement, int i, FocusManager focusManager, TextFieldValue it) {
        String text;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!StringsKt.isBlank(str) && !StringsKt.isBlank(it.getText())) {
            text = it.getText().substring(1);
            Intrinsics.checkNotNullExpressionValue(text, "substring(...)");
        } else {
            text = it.getText();
        }
        Iterator<Integer> it2 = RangesKt.until(0, oTPElement.getController().onValueChanged(i, text)).iterator();
        while (it2.hasNext()) {
            ((IntIterator) it2).nextInt();
            FocusManagerKtKt.m8697moveFocusSafelyMxy_nc0(focusManager, FocusDirection.INSTANCE.m3338getNextdhqQ8s());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OTPInputBox$lambda$12$lambda$11(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        FocusManagerKtKt.m8697moveFocusSafelyMxy_nc0(focusManager, FocusDirection.INSTANCE.m3338getNextdhqQ8s());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OTPInputBox$lambda$10$lambda$9(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.INSTANCE;
    }

    private static final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> OTPInputDecorationBox(final String str, final boolean z, final String str2, final boolean z2, final OTPElementColors oTPElementColors, Composer composer, int i) {
        composer.startReplaceGroup(912615263);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(912615263, i, -1, "com.stripe.android.uicore.elements.OTPInputDecorationBox (OTPElementUI.kt:260)");
        }
        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1562088977, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt.OTPInputDecorationBox.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer2.changedInstance(innerTextField) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i3 & 19) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1562088977, i3, -1, "com.stripe.android.uicore.elements.OTPInputDecorationBox.<anonymous> (OTPElementUI.kt:261)");
                    }
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                    composer2.startReplaceGroup(-1549839245);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composer2.endReplaceGroup();
                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                    long jM8728getOnComponent0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8728getOnComponent0d7_KjU();
                    final boolean z3 = z;
                    final String str3 = str2;
                    textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z2, true, none, mutableInteractionSource, false, null, ComposableLambdaKt.rememberComposableLambda(-1472332780, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.OTPElementUIKt.OTPInputDecorationBox.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1472332780, i4, -1, "com.stripe.android.uicore.elements.OTPInputDecorationBox.<anonymous>.<anonymous> (OTPElementUI.kt:266)");
                                }
                                TextKt.m2076Text4IGK_g(!z3 ? str3 : "", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(TextAlign.INSTANCE.m6006getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 48, 0, 130556);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), null, null, null, textFieldDefaults2.m2061textFieldColorsdx8h9Zs(jM8728getOnComponent0d7_KjU, 0L, z ? oTPElementColors.m8806getSelectedBackground0d7_KjU() : oTPElementColors.m8804getBackground0d7_KjU(), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8731getTextCursor0d7_KjU(), 0L, oTPElementColors.m8804getBackground0d7_KjU(), oTPElementColors.m8804getBackground0d7_KjU(), oTPElementColors.m8804getBackground0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, oTPElementColors.m8805getPlaceholder0d7_KjU(), oTPElementColors.m8805getPlaceholder0d7_KjU(), composer2, 0, 0, 48, 524050), PaddingKt.m1015PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null), composer2, ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 100887552, 27648, 3776);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return composableLambdaRememberComposableLambda;
    }
}
