package com.stripe.android.paymentsheet.verticalmode;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.RadioButtonDefaults;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.ui.DefaultPaymentMethodLabelKt;
import com.stripe.android.paymentsheet.ui.PromoBadgeKt;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: PaymentMethodRowButton.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u001a¹\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0002\u0010\u0018\u001a\u008b\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112&\u0010\u001c\u001a\"\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0003¢\u0006\u0002\u0010 \u001aK\u0010!\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u0010$\u001aa\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u0010(\u001ak\u0010)\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010&\u001a\u00020*2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u0010+\u001ac\u0010,\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010&\u001a\u00020-2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u0010.\u001ay\u0010/\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u00100\u001ak\u00101\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u00102\u001a9\u00103\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u00104\u001a\r\u00105\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00106\u001a\u0011\u00107\u001a\u000208*\u000209H\u0003¢\u0006\u0002\u0010:\u001a\u0011\u0010;\u001a\u000208*\u000209H\u0003¢\u0006\u0002\u0010:\u001a\f\u0010<\u001a\u00020\u0003*\u000209H\u0002\u001a\u001b\u0010=\u001a\u00020\u001b*\u00020\u00162\u0006\u0010>\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010B\u001a\u00020?*\u000209H\u0002¢\u0006\u0002\u0010C\u001a\u0011\u0010D\u001a\u00020?*\u000209H\u0002¢\u0006\u0002\u0010C\"\u000e\u0010E\u001a\u00020FX\u0082T¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"PaymentMethodRowButton", "", "isEnabled", "", "isSelected", "isClickable", "shouldShowDefaultBadge", "iconContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "title", "", "subtitle", "promoText", ViewProps.ON_CLICK, "Lkotlin/Function0;", "contentDescription", "modifier", "Landroidx/compose/ui/Modifier;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "trailingContent", "(ZZZZLkotlin/jvm/functions/Function3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "RowButtonOuterContent", "contentPaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "rowContent", "Lkotlin/ParameterName;", "name", "displayTrailingContent", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;ZZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "RowButtonFloatingOuterContent", UriUtil.LOCAL_CONTENT_SCHEME, "Landroidx/compose/foundation/layout/ColumnScope;", "(ZZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "RowButtonRadioOuterContent", "style", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;", "(ZZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "RowButtonCheckmarkOuterContent", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark;", "(ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "RowButtonDisclosureOuterContent", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure;", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "RowButtonWithEndIconOuterContent", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "RowButtonInnerContent", "(ZZLkotlin/jvm/functions/Function3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TitleContent", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/runtime/Composer;I)V", "ButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "getTitleTextColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;Landroidx/compose/runtime/Composer;I)J", "getSubtitleTextColor", "shouldAddModifierWeight", "getPaddingValues", "defaultPadding", "Landroidx/compose/ui/unit/Dp;", "getPaddingValues-3ABfNKs", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;F)Landroidx/compose/foundation/layout/PaddingValues;", "getVerticalInsets", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;)F", "getHorizontalInsets", "ROW_CONTENT_HORIZONTAL_SPACING", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentMethodRowButtonKt {
    private static final int ROW_CONTENT_HORIZONTAL_SPACING = 12;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonPreview$lambda$18(int i, Composer composer, int i2) {
        ButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodRowButton$lambda$0(boolean z, boolean z2, boolean z3, boolean z4, Function3 function3, String str, String str2, String str3, Function0 function0, String str4, Modifier modifier, PaymentSheet.Appearance.Embedded embedded, Function3 function32, int i, int i2, int i3, Composer composer, int i4) {
        PaymentMethodRowButton(z, z2, z3, z4, function3, str, str2, str3, function0, str4, modifier, embedded, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowButtonCheckmarkOuterContent$lambda$6(boolean z, PaddingValues paddingValues, Function3 function3, Modifier modifier, PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark flatWithCheckmark, Function3 function32, int i, Composer composer, int i2) {
        RowButtonCheckmarkOuterContent(z, paddingValues, function3, modifier, flatWithCheckmark, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowButtonDisclosureOuterContent$lambda$7(PaddingValues paddingValues, Function3 function3, Modifier modifier, PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure flatWithDisclosure, Function3 function32, int i, Composer composer, int i2) {
        RowButtonDisclosureOuterContent(paddingValues, function3, modifier, flatWithDisclosure, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowButtonFloatingOuterContent$lambda$2(boolean z, boolean z2, PaddingValues paddingValues, Modifier modifier, Function3 function3, int i, Composer composer, int i2) {
        RowButtonFloatingOuterContent(z, z2, paddingValues, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowButtonInnerContent$lambda$13(boolean z, boolean z2, Function3 function3, String str, String str2, String str3, PaymentSheet.Appearance.Embedded embedded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RowButtonInnerContent(z, z2, function3, str, str2, str3, embedded, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowButtonOuterContent$lambda$1(PaymentSheet.Appearance.Embedded embedded, boolean z, boolean z2, PaddingValues paddingValues, Modifier modifier, Function3 function3, Function0 function0, Function3 function32, int i, Composer composer, int i2) {
        RowButtonOuterContent(embedded, z, z2, paddingValues, modifier, function3, function0, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowButtonRadioOuterContent$lambda$5(boolean z, boolean z2, PaddingValues paddingValues, Function0 function0, Modifier modifier, PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio flatWithRadio, Function3 function3, int i, Composer composer, int i2) {
        RowButtonRadioOuterContent(z, z2, paddingValues, function0, modifier, flatWithRadio, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RowButtonWithEndIconOuterContent$lambda$11(PaddingValues paddingValues, Function3 function3, Modifier modifier, Function3 function32, Function3 function33, int i, Composer composer, int i2) {
        RowButtonWithEndIconOuterContent(paddingValues, function3, modifier, function32, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleContent$lambda$17(String str, String str2, boolean z, String str3, PaymentSheet.Appearance.Embedded embedded, int i, Composer composer, int i2) {
        TitleContent(str, str2, z, str3, embedded, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodRowButton(final boolean z, final boolean z2, boolean z3, final boolean z4, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> iconContent, final String title, final String str, final String str2, final Function0<Unit> onClick, String str3, Modifier modifier, PaymentSheet.Appearance.Embedded embedded, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        boolean z5;
        int i4;
        boolean z6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str4;
        PaymentSheet.Appearance.Embedded embedded2;
        String str5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        boolean z7;
        int i12;
        int i13;
        Modifier modifier2;
        float fM6117constructorimpl;
        Composer composer2;
        final boolean z8;
        final PaymentSheet.Appearance.Embedded embedded3;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final String str6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        Intrinsics.checkNotNullParameter(iconContent, "iconContent");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-138701596);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            z5 = z;
        } else if ((i & 6) == 0) {
            z5 = z;
            i4 = (composerStartRestartGroup.changed(z5) ? 4 : 2) | i;
        } else {
            z5 = z;
            i4 = i;
        }
        int i15 = 16;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                if ((i3 & 4) == 0) {
                    z6 = z3;
                    if (composerStartRestartGroup.changed(z6)) {
                        i14 = 256;
                    }
                    i4 |= i14;
                } else {
                    z6 = z3;
                }
                i14 = 128;
                i4 |= i14;
            } else {
                z6 = z3;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(iconContent) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= composerStartRestartGroup.changed(title) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(str) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(str2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(onClick) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i5 = i3 & 512;
                    if (i5 == 0) {
                        i4 |= 805306368;
                    } else {
                        if ((i & 805306368) == 0) {
                            i6 = i5;
                            i4 |= composerStartRestartGroup.changed(str3) ? 536870912 : 268435456;
                        }
                        i7 = i3 & 1024;
                        if (i7 != 0) {
                            i9 = i2 | 6;
                            i8 = i7;
                        } else if ((i2 & 6) == 0) {
                            i8 = i7;
                            i9 = i2 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
                        } else {
                            i8 = i7;
                            i9 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            if ((i3 & 2048) == 0) {
                                if ((i2 & 64) == 0 ? composerStartRestartGroup.changed(embedded) : composerStartRestartGroup.changedInstance(embedded)) {
                                    i15 = 32;
                                }
                            }
                            i9 |= i15;
                        }
                        int i16 = i9;
                        i10 = i3 & 4096;
                        if (i10 == 0) {
                            i11 = i10;
                            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i16 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
                            }
                            if ((i4 & 306783379) == 306783378 || (i16 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                        z6 = z5;
                                    }
                                    String str7 = i6 == 0 ? null : str3;
                                    Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier;
                                    if ((i3 & 2048) == 0) {
                                        str4 = str7;
                                        embedded2 = new PaymentSheet.Appearance.Embedded(PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton.INSTANCE.getDefault());
                                        i16 &= -113;
                                    } else {
                                        str4 = str7;
                                        embedded2 = embedded;
                                    }
                                    str5 = str4;
                                    if (i11 == 0) {
                                        z7 = z6;
                                        i12 = i4;
                                        function32 = null;
                                    } else {
                                        function32 = function3;
                                        z7 = z6;
                                        i12 = i4;
                                    }
                                    i13 = i16;
                                    modifier2 = companion;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i16 &= -113;
                                    }
                                    str5 = str3;
                                    embedded2 = embedded;
                                    function32 = function3;
                                    z7 = z6;
                                    i12 = i4;
                                    i13 = i16;
                                    modifier2 = modifier;
                                }
                                composerStartRestartGroup.endDefaults();
                                final String str8 = str5;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-138701596, i12, i13, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButton (PaymentMethodRowButton.kt:70)");
                                }
                                if (str == null) {
                                    fM6117constructorimpl = Dp.m6117constructorimpl(8);
                                } else {
                                    fM6117constructorimpl = Dp.m6117constructorimpl(12);
                                }
                                PaddingValues paddingValuesM8586getPaddingValues3ABfNKs = m8586getPaddingValues3ABfNKs(embedded2, fM6117constructorimpl);
                                final PaymentSheet.Appearance.Embedded embedded4 = embedded2;
                                Modifier modifier4 = modifier2;
                                Modifier modifierM1053heightInVpY3zN4$default = SizeKt.m1053heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m6117constructorimpl(52), 0.0f, 2, null);
                                int i17 = i12;
                                boolean z9 = z7;
                                int i18 = i13;
                                Modifier modifierM1274selectableXHw0xAI$default = SelectableKt.m1274selectableXHw0xAI$default(modifierM1053heightInVpY3zN4$default, z2, z9, null, onClick, 4, null);
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34 = function32;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(611267214, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt.PaymentMethodRowButton.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer3, Integer num) {
                                        invoke(bool.booleanValue(), composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z10, Composer composer3, int i19) {
                                        int i20;
                                        Modifier.Companion companionWeight;
                                        if ((i19 & 6) == 0) {
                                            i20 = i19 | (composer3.changed(z10) ? 4 : 2);
                                        } else {
                                            i20 = i19;
                                        }
                                        if ((i20 & 19) != 18 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(611267214, i20, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButton.<anonymous> (PaymentMethodRowButton.kt:95)");
                                            }
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(12));
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            boolean z11 = z;
                                            boolean z12 = z4;
                                            Function3<RowScope, Composer, Integer, Unit> function35 = iconContent;
                                            String str9 = title;
                                            String str10 = str;
                                            String str11 = str8;
                                            PaymentSheet.Appearance.Embedded embedded5 = embedded4;
                                            String str12 = str2;
                                            Function3<RowScope, Composer, Integer, Unit> function36 = function34;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composer3, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            if (PaymentMethodRowButtonKt.shouldAddModifierWeight(embedded5.getStyle())) {
                                                companionWeight = rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true);
                                            } else {
                                                companionWeight = Modifier.INSTANCE;
                                            }
                                            PaymentMethodRowButtonKt.RowButtonInnerContent(z11, z12, function35, str9, str10, str11, embedded5, companionWeight, composer3, 0, 0);
                                            composer3.startReplaceGroup(-2131512702);
                                            if (str12 != null) {
                                                PromoBadgeKt.PromoBadge(str12, null, false, false, composer3, 0, 14);
                                            }
                                            composer3.endReplaceGroup();
                                            composer3.startReplaceGroup(-2131509794);
                                            if (function36 != null && z10) {
                                                function36.invoke(rowScopeInstance, composer3, 6);
                                            }
                                            composer3.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54);
                                int i19 = i17 << 3;
                                composer2 = composerStartRestartGroup;
                                RowButtonOuterContent(embedded4, z, z2, paddingValuesM8586getPaddingValues3ABfNKs, modifierM1274selectableXHw0xAI$default, function34, onClick, composableLambdaRememberComposableLambda, composer2, ((i18 >> 3) & 14) | 12582912 | (i19 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i19 & 896) | ((i18 << 9) & 458752) | (3670016 & (i17 >> 6)));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z8 = z9;
                                embedded3 = embedded4;
                                function33 = function34;
                                str6 = str8;
                                modifier3 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                str6 = str3;
                                modifier3 = modifier;
                                embedded3 = embedded;
                                function33 = function3;
                                composer2 = composerStartRestartGroup;
                                z8 = z6;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return PaymentMethodRowButtonKt.PaymentMethodRowButton$lambda$0(z, z2, z8, z4, iconContent, title, str, str2, onClick, str6, modifier3, embedded3, function33, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i16 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                        i11 = i10;
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if ((i3 & 4) != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if ((i3 & 2048) == 0) {
                                }
                                str5 = str4;
                                if (i11 == 0) {
                                }
                                i13 = i16;
                                modifier2 = companion;
                                composerStartRestartGroup.endDefaults();
                                final String str82 = str5;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (str == null) {
                                }
                                PaddingValues paddingValuesM8586getPaddingValues3ABfNKs2 = m8586getPaddingValues3ABfNKs(embedded2, fM6117constructorimpl);
                                final PaymentSheet.Appearance.Embedded embedded42 = embedded2;
                                Modifier modifier42 = modifier2;
                                Modifier modifierM1053heightInVpY3zN4$default2 = SizeKt.m1053heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m6117constructorimpl(52), 0.0f, 2, null);
                                int i172 = i12;
                                boolean z92 = z7;
                                int i182 = i13;
                                Modifier modifierM1274selectableXHw0xAI$default2 = SelectableKt.m1274selectableXHw0xAI$default(modifierM1053heightInVpY3zN4$default2, z2, z92, null, onClick, 4, null);
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function342 = function32;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(611267214, true, new Function3<Boolean, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt.PaymentMethodRowButton.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer3, Integer num) {
                                        invoke(bool.booleanValue(), composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(boolean z10, Composer composer3, int i192) {
                                        int i20;
                                        Modifier.Companion companionWeight;
                                        if ((i192 & 6) == 0) {
                                            i20 = i192 | (composer3.changed(z10) ? 4 : 2);
                                        } else {
                                            i20 = i192;
                                        }
                                        if ((i20 & 19) != 18 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(611267214, i20, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButton.<anonymous> (PaymentMethodRowButton.kt:95)");
                                            }
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(12));
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            boolean z11 = z;
                                            boolean z12 = z4;
                                            Function3<RowScope, Composer, Integer, Unit> function35 = iconContent;
                                            String str9 = title;
                                            String str10 = str;
                                            String str11 = str82;
                                            PaymentSheet.Appearance.Embedded embedded5 = embedded42;
                                            String str12 = str2;
                                            Function3<RowScope, Composer, Integer, Unit> function36 = function342;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composer3, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            if (PaymentMethodRowButtonKt.shouldAddModifierWeight(embedded5.getStyle())) {
                                                companionWeight = rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true);
                                            } else {
                                                companionWeight = Modifier.INSTANCE;
                                            }
                                            PaymentMethodRowButtonKt.RowButtonInnerContent(z11, z12, function35, str9, str10, str11, embedded5, companionWeight, composer3, 0, 0);
                                            composer3.startReplaceGroup(-2131512702);
                                            if (str12 != null) {
                                                PromoBadgeKt.PromoBadge(str12, null, false, false, composer3, 0, 14);
                                            }
                                            composer3.endReplaceGroup();
                                            composer3.startReplaceGroup(-2131509794);
                                            if (function36 != null && z10) {
                                                function36.invoke(rowScopeInstance, composer3, 6);
                                            }
                                            composer3.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54);
                                int i192 = i172 << 3;
                                composer2 = composerStartRestartGroup;
                                RowButtonOuterContent(embedded42, z, z2, paddingValuesM8586getPaddingValues3ABfNKs2, modifierM1274selectableXHw0xAI$default2, function342, onClick, composableLambdaRememberComposableLambda2, composer2, ((i182 >> 3) & 14) | 12582912 | (i192 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i192 & 896) | ((i182 << 9) & 458752) | (3670016 & (i172 >> 6)));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z8 = z92;
                                embedded3 = embedded42;
                                function33 = function342;
                                str6 = str82;
                                modifier3 = modifier42;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i6 = i5;
                    i7 = i3 & 1024;
                    if (i7 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    int i162 = i9;
                    i10 = i3 & 4096;
                    if (i10 == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i3 & 256) == 0) {
                }
                i5 = i3 & 512;
                if (i5 == 0) {
                }
                i6 = i5;
                i7 = i3 & 1024;
                if (i7 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i1622 = i9;
                i10 = i3 & 4096;
                if (i10 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            i5 = i3 & 512;
            if (i5 == 0) {
            }
            i6 = i5;
            i7 = i3 & 1024;
            if (i7 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i16222 = i9;
            i10 = i3 & 4096;
            if (i10 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        i6 = i5;
        i7 = i3 & 1024;
        if (i7 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i162222 = i9;
        i10 = i3 & 4096;
        if (i10 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void RowButtonOuterContent(final PaymentSheet.Appearance.Embedded embedded, final boolean z, final boolean z2, final PaddingValues paddingValues, final Modifier modifier, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final Function0<Unit> function0, final Function3<? super Boolean, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1978351128);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(embedded) : composerStartRestartGroup.changedInstance(embedded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1978351128, i2, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonOuterContent (PaymentMethodRowButton.kt:135)");
            }
            PaymentSheet.Appearance.Embedded.RowStyle style = embedded.getStyle();
            if (style instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) {
                composerStartRestartGroup.startReplaceGroup(-1996237308);
                int i3 = i2 >> 3;
                RowButtonFloatingOuterContent(z, z2, paddingValues, modifier, ComposableLambdaKt.rememberComposableLambda(-1952338673, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt.RowButtonOuterContent.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope RowButtonFloatingOuterContent, Composer composer2, int i4) {
                        Intrinsics.checkNotNullParameter(RowButtonFloatingOuterContent, "$this$RowButtonFloatingOuterContent");
                        if ((i4 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1952338673, i4, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonOuterContent.<anonymous> (PaymentMethodRowButton.kt:144)");
                        }
                        function32.invoke(true, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i3 & 896) | (i3 & 7168));
                composerStartRestartGroup.endReplaceGroup();
            } else if (style instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) {
                composerStartRestartGroup.startReplaceGroup(-1995901299);
                int i4 = i2 >> 6;
                RowButtonCheckmarkOuterContent(z2, paddingValues, function3, modifier, (PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) embedded.getStyle(), ComposableLambdaKt.rememberComposableLambda(1488307374, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt.RowButtonOuterContent.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope RowButtonCheckmarkOuterContent, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(RowButtonCheckmarkOuterContent, "$this$RowButtonCheckmarkOuterContent");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1488307374, i5, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonOuterContent.<anonymous> (PaymentMethodRowButton.kt:155)");
                        }
                        function32.invoke(false, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i4 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i2 >> 9) & 896) | ((i2 >> 3) & 7168));
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (style instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) {
                composerStartRestartGroup.startReplaceGroup(-1995512683);
                RowButtonDisclosureOuterContent(paddingValues, function3, modifier, (PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) embedded.getStyle(), ComposableLambdaKt.rememberComposableLambda(634399936, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt.RowButtonOuterContent.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope RowButtonDisclosureOuterContent, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(RowButtonDisclosureOuterContent, "$this$RowButtonDisclosureOuterContent");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(634399936, i5, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonOuterContent.<anonymous> (PaymentMethodRowButton.kt:165)");
                        }
                        function32.invoke(false, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 9) & 14) | 24576 | ((i2 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i2 >> 6) & 896));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(style instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio)) {
                    composerStartRestartGroup.startReplaceGroup(2013814403);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1995165669);
                int i5 = i2 >> 3;
                RowButtonRadioOuterContent(z, z2, paddingValues, function0, modifier, (PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) embedded.getStyle(), ComposableLambdaKt.rememberComposableLambda(-1121427287, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt.RowButtonOuterContent.4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope RowButtonRadioOuterContent, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(RowButtonRadioOuterContent, "$this$RowButtonRadioOuterContent");
                        if ((i6 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1121427287, i6, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonOuterContent.<anonymous> (PaymentMethodRowButton.kt:177)");
                        }
                        function32.invoke(true, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i5 & 896) | 1572864 | (i5 & 14) | (i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i2 >> 9) & 7168) | (i2 & 57344));
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodRowButtonKt.RowButtonOuterContent$lambda$1(embedded, z, z2, paddingValues, modifier, function3, function0, function32, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RowButtonFloatingOuterContent(final boolean z, final boolean z2, final PaddingValues paddingValues, final Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        float fM6117constructorimpl;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1870888012);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1870888012, i2, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonFloatingOuterContent (PaymentMethodRowButton.kt:190)");
            }
            Modifier modifierThen = ClipKt.clip(Modifier.INSTANCE, MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium()).then(AlphaKt.alpha(modifier, z ? 1.0f : 0.6f));
            CornerBasedShape medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium();
            long jM8725getComponent0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU();
            BorderStroke borderStroke = StripeThemeKt.getBorderStroke(MaterialTheme.INSTANCE, z2, composerStartRestartGroup, (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | MaterialTheme.$stable);
            if (z2) {
                fM6117constructorimpl = Dp.m6117constructorimpl((float) 1.5d);
            } else {
                fM6117constructorimpl = Dp.m6117constructorimpl(0);
            }
            composer2 = composerStartRestartGroup;
            CardKt.m1809CardFjzlyU(modifierThen, medium, jM8725getComponent0d7_KjU, 0L, borderStroke, fM6117constructorimpl, ComposableLambdaKt.rememberComposableLambda(-2015561193, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt.RowButtonFloatingOuterContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2015561193, i3, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonFloatingOuterContent.<anonymous> (PaymentMethodRowButton.kt:202)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        function32.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, 1572864, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodRowButtonKt.RowButtonFloatingOuterContent$lambda$2(z, z2, paddingValues, modifier, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RowButtonRadioOuterContent(final boolean z, final boolean z2, final PaddingValues paddingValues, final Function0<Unit> function0, final Modifier modifier, final PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio flatWithRadio, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        boolean z3;
        Composer composerStartRestartGroup = composer.startRestartGroup(490649193);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z2;
            i2 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        } else {
            z3 = z2;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(flatWithRadio) : composerStartRestartGroup.changedInstance(flatWithRadio) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(490649193, i2, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonRadioOuterContent (PaymentMethodRowButton.kt:220)");
            }
            PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio.Colors colors$paymentsheet_release = flatWithRadio.getColors$paymentsheet_release(DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0));
            Modifier modifierPadding = PaddingKt.padding(modifier, paddingValues);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = i2;
            composerStartRestartGroup = composerStartRestartGroup;
            RadioButtonKt.RadioButton(z3, function0, SizeKt.m1065size3ABfNKs(rowScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), Dp.m6117constructorimpl(20)), z, null, RadioButtonDefaults.INSTANCE.m1977colorsRGew2ao(ColorKt.Color(colors$paymentsheet_release.getSelectedColor()), ColorKt.Color(colors$paymentsheet_release.getUnselectedColor()), 0L, composerStartRestartGroup, RadioButtonDefaults.$stable << 9, 4), composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 << 9) & 7168), 16);
            SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(12)), composerStartRestartGroup, 6);
            Modifier modifierAlign = rowScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically());
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            function3.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodRowButtonKt.RowButtonRadioOuterContent$lambda$5(z, z2, paddingValues, function0, modifier, flatWithRadio, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RowButtonCheckmarkOuterContent(final boolean z, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, final PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark flatWithCheckmark, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        final PaddingValues paddingValues2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        Composer composerStartRestartGroup = composer.startRestartGroup(-110174271);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(flatWithCheckmark) : composerStartRestartGroup.changedInstance(flatWithCheckmark) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-110174271, i2, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonCheckmarkOuterContent (PaymentMethodRowButton.kt:256)");
            }
            int i3 = i2 >> 3;
            modifier2 = modifier;
            RowButtonWithEndIconOuterContent(paddingValues, function3, modifier2, ComposableLambdaKt.rememberComposableLambda(-1987188695, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt.RowButtonCheckmarkOuterContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope RowButtonWithEndIconOuterContent, Composer composer2, int i4) {
                    Intrinsics.checkNotNullParameter(RowButtonWithEndIconOuterContent, "$this$RowButtonWithEndIconOuterContent");
                    if ((i4 & 6) == 0) {
                        i4 |= composer2.changed(RowButtonWithEndIconOuterContent) ? 4 : 2;
                    }
                    if ((i4 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1987188695, i4, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonCheckmarkOuterContent.<anonymous> (PaymentMethodRowButton.kt:262)");
                        }
                        if (z) {
                            IconKt.m1926Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), (String) null, OffsetKt.m981offsetVpY3zN4$default(PaddingKt.m1024paddingqDBjuR0$default(RowButtonWithEndIconOuterContent.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), 0.0f, 0.0f, Dp.m6117constructorimpl(flatWithCheckmark.getCheckmarkInsetDp()), 0.0f, 11, null), Dp.m6117constructorimpl(3), 0.0f, 2, null), ColorKt.Color(flatWithCheckmark.getColors$paymentsheet_release(DarkThemeKt.isSystemInDarkTheme(composer2, 0)).getCheckmarkColor()), composer2, 48, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), function32, composerStartRestartGroup, (i3 & 14) | 3072 | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i3 & 896) | (i3 & 57344));
            paddingValues2 = paddingValues;
            function33 = function3;
            function34 = function32;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function34 = function32;
            function33 = function3;
            paddingValues2 = paddingValues;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodRowButtonKt.RowButtonCheckmarkOuterContent$lambda$6(z, paddingValues2, function33, modifier3, flatWithCheckmark, function34, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RowButtonDisclosureOuterContent(PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, final PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure flatWithDisclosure, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        final PaddingValues paddingValues2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1532456855);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(flatWithDisclosure) : composerStartRestartGroup.changedInstance(flatWithDisclosure) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1532456855, i2, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonDisclosureOuterContent (PaymentMethodRowButton.kt:285)");
            }
            modifier2 = modifier;
            RowButtonWithEndIconOuterContent(paddingValues, function3, modifier2, ComposableLambdaKt.rememberComposableLambda(1496319697, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt.RowButtonDisclosureOuterContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope RowButtonWithEndIconOuterContent, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(RowButtonWithEndIconOuterContent, "$this$RowButtonWithEndIconOuterContent");
                    if ((i3 & 6) == 0) {
                        i3 |= composer2.changed(RowButtonWithEndIconOuterContent) ? 4 : 2;
                    }
                    if ((i3 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1496319697, i3, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonDisclosureOuterContent.<anonymous> (PaymentMethodRowButton.kt:291)");
                        }
                        IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(flatWithDisclosure.getDisclosureIconRes(), composer2, 0), (String) null, RowButtonWithEndIconOuterContent.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), ColorKt.Color(flatWithDisclosure.getColors$paymentsheet_release(DarkThemeKt.isSystemInDarkTheme(composer2, 0)).getDisclosureColor()), composer2, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), function32, composerStartRestartGroup, (i2 & 14) | 3072 | (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i2 & 896) | (i2 & 57344));
            paddingValues2 = paddingValues;
            function33 = function3;
            function34 = function32;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function34 = function32;
            function33 = function3;
            paddingValues2 = paddingValues;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodRowButtonKt.RowButtonDisclosureOuterContent$lambda$7(paddingValues2, function33, modifier3, flatWithDisclosure, function34, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RowButtonWithEndIconOuterContent(final PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final Modifier modifier, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(373162312);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function33) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(373162312, i2, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonWithEndIconOuterContent (PaymentMethodRowButton.kt:310)");
            }
            Modifier modifierPadding = PaddingKt.padding(modifier, paddingValues);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            function33.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(6 | ((i2 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1963370912);
            if (function3 != null) {
                SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(UIConstants.INSTANCE.m8590getIconWidthD9Ej5fM() + Dp.m6117constructorimpl(12))), composerStartRestartGroup, 6);
                function3.invoke(rowScopeInstance2, composerStartRestartGroup, Integer.valueOf((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            function32.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(6 | ((i2 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodRowButtonKt.RowButtonWithEndIconOuterContent$lambda$11(paddingValues, function3, modifier, function32, function33, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RowButtonInnerContent(final boolean z, final boolean z2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final String str, final String str2, String str3, final PaymentSheet.Appearance.Embedded embedded, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        String str4;
        String str5;
        int i4;
        String str6;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        PaymentSheet.Insets paymentMethodIconMargins;
        int i6;
        float fM6117constructorimpl;
        PaymentSheet.Insets paymentMethodIconMargins2;
        float fM6117constructorimpl2;
        final String str7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1525517957);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                str4 = str;
                i3 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    str5 = str2;
                    i3 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
                }
                i4 = i2 & 32;
                if (i4 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((196608 & i) == 0) {
                        str6 = str3;
                        i3 |= composerStartRestartGroup.changed(str6) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(embedded) : composerStartRestartGroup.changedInstance(embedded) ? 1048576 : 524288;
                    }
                    i5 = i2 & 128;
                    if (i5 != 0) {
                        if ((12582912 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                str6 = null;
                            }
                            if (i5 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1525517957, i3, -1, "com.stripe.android.paymentsheet.verticalmode.RowButtonInnerContent (PaymentMethodRowButton.kt:344)");
                            }
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
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
                            Modifier.Companion companion = Modifier.INSTANCE;
                            paymentMethodIconMargins = embedded.getPaymentMethodIconMargins();
                            if (paymentMethodIconMargins == null) {
                                fM6117constructorimpl = Dp.m6117constructorimpl(paymentMethodIconMargins.getStartDp());
                                i6 = 0;
                            } else {
                                i6 = 0;
                                fM6117constructorimpl = Dp.m6117constructorimpl(0);
                            }
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(companion, fM6117constructorimpl), composerStartRestartGroup, i6);
                            function3.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            paymentMethodIconMargins2 = embedded.getPaymentMethodIconMargins();
                            if (paymentMethodIconMargins2 == null) {
                                fM6117constructorimpl2 = Dp.m6117constructorimpl(paymentMethodIconMargins2.getEndDp());
                            } else {
                                fM6117constructorimpl2 = Dp.m6117constructorimpl(12);
                            }
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(companion2, fM6117constructorimpl2), composerStartRestartGroup, 0);
                            int i7 = i3 >> 6;
                            String str8 = str6;
                            TitleContent(str4, str5, z3, str8, embedded, composerStartRestartGroup, ((i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 << 6) & 896) | (i7 & 7168) | (i7 & 57344));
                            composerStartRestartGroup.startReplaceGroup(357961578);
                            if (z2) {
                                float f = 4;
                                DefaultPaymentMethodLabelKt.DefaultPaymentMethodLabel(PaddingKt.m1023paddingqDBjuR0(Modifier.INSTANCE, Dp.m6117constructorimpl(12), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(6), Dp.m6117constructorimpl(f)), composerStartRestartGroup, 6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str7 = str8;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            str7 = str6;
                        }
                        final Modifier modifier3 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PaymentMethodRowButtonKt.RowButtonInnerContent$lambda$13(z, z2, function3, str, str2, str7, embedded, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    modifier2 = modifier;
                    if ((i3 & 4793491) != 4793490) {
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
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
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            paymentMethodIconMargins = embedded.getPaymentMethodIconMargins();
                            if (paymentMethodIconMargins == null) {
                            }
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(companion3, fM6117constructorimpl), composerStartRestartGroup, i6);
                            function3.invoke(rowScopeInstance2, composerStartRestartGroup, Integer.valueOf(((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            paymentMethodIconMargins2 = embedded.getPaymentMethodIconMargins();
                            if (paymentMethodIconMargins2 == null) {
                            }
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(companion22, fM6117constructorimpl2), composerStartRestartGroup, 0);
                            int i72 = i3 >> 6;
                            String str82 = str6;
                            TitleContent(str4, str5, z3, str82, embedded, composerStartRestartGroup, ((i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 << 6) & 896) | (i72 & 7168) | (i72 & 57344));
                            composerStartRestartGroup.startReplaceGroup(357961578);
                            if (z2) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            str7 = str82;
                        }
                    }
                    final Modifier modifier32 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str6 = str3;
                if ((i2 & 64) == 0) {
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                }
                modifier2 = modifier;
                if ((i3 & 4793491) != 4793490) {
                }
                final Modifier modifier322 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str5 = str2;
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            str6 = str3;
            if ((i2 & 64) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 4793491) != 4793490) {
            }
            final Modifier modifier3222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str4 = str;
        if ((i2 & 16) == 0) {
        }
        str5 = str2;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        str6 = str3;
        if ((i2 & 64) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 4793491) != 4793490) {
        }
        final Modifier modifier32222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void TitleContent(final String str, final String str2, final boolean z, final String str3, final PaymentSheet.Appearance.Embedded embedded, Composer composer, final int i) {
        String str4;
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1350871786);
        if ((i & 6) == 0) {
            str4 = str;
            i2 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(embedded) : composerStartRestartGroup.changedInstance(embedded) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1350871786, i2, -1, "com.stripe.android.paymentsheet.verticalmode.TitleContent (PaymentMethodRowButton.kt:378)");
            }
            long titleTextColor = getTitleTextColor(embedded.getStyle(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            PaymentSheet.Typography.Font titleFont = embedded.getTitleFont();
            TextStyle textStyle = titleFont != null ? PaymentSheetConfigurationKtxKt.toTextStyle(titleFont) : null;
            composerStartRestartGroup.startReplaceGroup(1679242829);
            if (textStyle == null) {
                textStyle = TextStyle.m5615copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBody1(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
            }
            TextStyle textStyle2 = textStyle;
            composerStartRestartGroup.endReplaceGroup();
            if (!z) {
                titleTextColor = Color.m3656copywmQWz5c$default(titleTextColor, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            int iM6056getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1679253095);
            boolean z2 = (i2 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaymentMethodRowButtonKt.TitleContent$lambda$16$lambda$15$lambda$14(str3, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2;
            TextKt.m2076Text4IGK_g(str4, SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue, 1, null), titleTextColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, iM6056getEllipsisgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle2, composerStartRestartGroup, i2 & 14, 3120, 55288);
            composerStartRestartGroup.startReplaceGroup(1679258754);
            if (str2 != null) {
                long subtitleTextColor = getSubtitleTextColor(embedded.getStyle(), composerStartRestartGroup, 0);
                PaymentSheet.Typography.Font subtitleFont = embedded.getSubtitleFont();
                TextStyle textStyle3 = subtitleFont != null ? PaymentSheetConfigurationKtxKt.toTextStyle(subtitleFont) : null;
                composerStartRestartGroup.startReplaceGroup(1679264054);
                if (textStyle3 == null) {
                    textStyle3 = TextStyle.m5615copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getCaption(), 0L, 0L, FontWeight.INSTANCE.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                }
                TextStyle textStyle4 = textStyle3;
                composerStartRestartGroup.endReplaceGroup();
                if (!z) {
                    subtitleTextColor = Color.m3656copywmQWz5c$default(subtitleTextColor, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composer2 = composerStartRestartGroup;
                TextKt.m2076Text4IGK_g(str2, (Modifier) null, subtitleTextColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle4, composer2, (i3 >> 3) & 14, 0, 65530);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodRowButtonKt.TitleContent$lambda$17(str, str2, z, str3, embedded, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleContent$lambda$16$lambda$15$lambda$14(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semantics, str);
        }
        return Unit.INSTANCE;
    }

    private static final void ButtonPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1185765330);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1185765330, i, -1, "com.stripe.android.paymentsheet.verticalmode.ButtonPreview (PaymentMethodRowButton.kt:410)");
            }
            StripeThemeKt.DefaultStripeTheme(ComposableSingletons$PaymentMethodRowButtonKt.INSTANCE.m8564getLambda5$paymentsheet_release(), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodRowButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodRowButtonKt.ButtonPreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long getTitleTextColor(PaymentSheet.Appearance.Embedded.RowStyle rowStyle, Composer composer, int i) {
        long jM1832getOnSurface0d7_KjU;
        composer.startReplaceGroup(1560972604);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1560972604, i, -1, "com.stripe.android.paymentsheet.verticalmode.getTitleTextColor (PaymentMethodRowButton.kt:470)");
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) {
            composer.startReplaceGroup(-1444319060);
            jM1832getOnSurface0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8728getOnComponent0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1444317622);
            jM1832getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1832getOnSurface0d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM1832getOnSurface0d7_KjU;
    }

    private static final long getSubtitleTextColor(PaymentSheet.Appearance.Embedded.RowStyle rowStyle, Composer composer, int i) {
        long jM8730getSubtitle0d7_KjU;
        composer.startReplaceGroup(-1092687050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092687050, i, -1, "com.stripe.android.paymentsheet.verticalmode.getSubtitleTextColor (PaymentMethodRowButton.kt:476)");
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) {
            composer.startReplaceGroup(-878417686);
            jM8730getSubtitle0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8729getPlaceholderText0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-878415933);
            jM8730getSubtitle0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8730getSubtitle0d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM8730getSubtitle0d7_KjU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAddModifierWeight(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        return ((rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) || (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure)) ? false : true;
    }

    /* renamed from: getPaddingValues-3ABfNKs, reason: not valid java name */
    private static final PaddingValues m8586getPaddingValues3ABfNKs(PaymentSheet.Appearance.Embedded embedded, float f) {
        float fM6117constructorimpl;
        float fM6117constructorimpl2;
        float horizontalInsets = getHorizontalInsets(embedded.getStyle());
        float fM6117constructorimpl3 = Dp.m6117constructorimpl(getVerticalInsets(embedded.getStyle()) + f);
        PaymentSheet.Insets paymentMethodIconMargins = embedded.getPaymentMethodIconMargins();
        if (paymentMethodIconMargins != null) {
            fM6117constructorimpl = Dp.m6117constructorimpl(paymentMethodIconMargins.getTopDp());
        } else {
            fM6117constructorimpl = Dp.m6117constructorimpl(0);
        }
        float fM6117constructorimpl4 = Dp.m6117constructorimpl(fM6117constructorimpl3 + fM6117constructorimpl);
        float horizontalInsets2 = getHorizontalInsets(embedded.getStyle());
        float fM6117constructorimpl5 = Dp.m6117constructorimpl(getVerticalInsets(embedded.getStyle()) + f);
        PaymentSheet.Insets paymentMethodIconMargins2 = embedded.getPaymentMethodIconMargins();
        if (paymentMethodIconMargins2 != null) {
            fM6117constructorimpl2 = Dp.m6117constructorimpl(paymentMethodIconMargins2.getBottomDp());
        } else {
            fM6117constructorimpl2 = Dp.m6117constructorimpl(0);
        }
        return PaddingKt.m1016PaddingValuesa9UjIt4(horizontalInsets, fM6117constructorimpl4, horizontalInsets2, Dp.m6117constructorimpl(fM6117constructorimpl5 + fM6117constructorimpl2));
    }

    private static final float getVerticalInsets(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton)) {
            if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark)) {
                if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure)) {
                    if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) rowStyle).getAdditionalVerticalInsetsDp());
                }
                return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) rowStyle).getAdditionalVerticalInsetsDp());
            }
            return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) rowStyle).getAdditionalVerticalInsetsDp());
        }
        return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) rowStyle).getAdditionalInsetsDp());
    }

    private static final float getHorizontalInsets(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton)) {
            if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark)) {
                if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure)) {
                    if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) rowStyle).getHorizontalInsetsDp());
                }
                return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) rowStyle).getHorizontalInsetsDp());
            }
            return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) rowStyle).getHorizontalInsetsDp());
        }
        return Dp.m6117constructorimpl(12);
    }
}
