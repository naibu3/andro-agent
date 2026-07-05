package com.stripe.android.paymentsheet.verticalmode;

import android.content.Context;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.elements.MandateTextUIKt;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodEmbeddedLayoutUI.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\u001a3\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u008f\u0001\u0010\u0003\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010 \u001a\u0015\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010$\u001a\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'H\u0003¢\u0006\u0002\u0010(\u001a\f\u0010)\u001a\u00020\t*\u00020#H\u0002\u001a\f\u0010*\u001a\u00020\t*\u00020#H\u0002\u001a\u0011\u0010+\u001a\u00020,*\u00020#H\u0002¢\u0006\u0002\u0010-\u001a\u0014\u0010.\u001a\u00020/*\u00020#2\u0006\u00100\u001a\u00020\tH\u0002\u001a\u0011\u00101\u001a\u00020,*\u00020#H\u0002¢\u0006\u0002\u0010-\u001a\u0011\u00102\u001a\u00020,*\u00020#H\u0002¢\u0006\u0002\u0010-\u001a}\u00103\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u00104\u001a=\u00105\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u00106\u001a\u0015\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\tH\u0001¢\u0006\u0002\u0010=\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u00107\u001a\u00020\t*\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0010\u0010:\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006>²\u0006\n\u0010?\u001a\u00020@X\u008a\u0084\u0002"}, d2 = {PaymentMethodEmbeddedLayoutUIKt.TEST_TAG_PAYMENT_METHOD_EMBEDDED_LAYOUT, "", "EMBEDDED_MANDATE_TEXT_TEST_TAG", "PaymentMethodEmbeddedLayoutUI", "", "Landroidx/compose/foundation/layout/ColumnScope;", "interactor", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;", "embeddedViewDisplaysMandateText", "", "modifier", "Landroidx/compose/ui/Modifier;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;ZLandroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/runtime/Composer;II)V", "paymentMethods", "", "Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;", "displayedSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "savedPaymentMethodAction", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;", "isEnabled", "onViewMorePaymentMethods", "Lkotlin/Function0;", "onManageOneSavedPaymentMethod", "Lkotlin/Function1;", "onSelectSavedPaymentMethod", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/image/StripeImageLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "OptionalEmbeddedDivider", "rowStyle", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;Landroidx/compose/runtime/Composer;I)V", "EmbeddedMandate", "mandate", "Lcom/stripe/android/core/strings/ResolvableString;", "(ZLcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)V", PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, PaymentSheetAppearanceKeys.SEPARATOR_THICKNESS, "Landroidx/compose/ui/unit/Dp;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;)F", PaymentSheetAppearanceKeys.SEPARATOR_COLOR, "", "isDarkMode", "startSeparatorInset", "endSeparatorInset", "EmbeddedSavedPaymentMethodRowButton", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/runtime/Composer;I)V", "EmbeddedNewPaymentMethodRowButtonsLayoutUi", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;ZLcom/stripe/android/uicore/image/StripeImageLoader;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/runtime/Composer;I)V", "viewMoreShowsChevron", "getViewMoreShowsChevron", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;)Z", PaymentMethodEmbeddedLayoutUIKt.TEST_TAG_CHANGE, "EmbeddedNewPaymentMethodTrailingContent", "showChevron", "(ZLandroidx/compose/runtime/Composer;I)V", "paymentsheet_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$State;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentMethodEmbeddedLayoutUIKt {
    public static final String EMBEDDED_MANDATE_TEXT_TEST_TAG = "EMBEDDED_MANDATE";
    public static final String TEST_TAG_CHANGE = "TEST_TAG_CHANGE";
    public static final String TEST_TAG_PAYMENT_METHOD_EMBEDDED_LAYOUT = "TEST_TAG_PAYMENT_METHOD_EMBEDDED_LAYOUT";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmbeddedMandate$lambda$12(boolean z, ResolvableString resolvableString, int i, Composer composer, int i2) {
        EmbeddedMandate(z, resolvableString, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmbeddedNewPaymentMethodRowButtonsLayoutUi$lambda$19(List list, PaymentMethodVerticalLayoutInteractor.Selection selection, boolean z, StripeImageLoader stripeImageLoader, PaymentSheet.Appearance.Embedded embedded, int i, Composer composer, int i2) {
        EmbeddedNewPaymentMethodRowButtonsLayoutUi(list, selection, z, stripeImageLoader, embedded, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmbeddedNewPaymentMethodTrailingContent$lambda$21(boolean z, int i, Composer composer, int i2) {
        EmbeddedNewPaymentMethodTrailingContent(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmbeddedSavedPaymentMethodRowButton$lambda$15(List list, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, PaymentMethodVerticalLayoutInteractor.Selection selection, boolean z, Function0 function0, Function1 function1, Function1 function12, PaymentSheet.Appearance.Embedded embedded, int i, Composer composer, int i2) {
        EmbeddedSavedPaymentMethodRowButton(list, displayableSavedPaymentMethod, savedPaymentMethodAction, selection, z, function0, function1, function12, embedded, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionalEmbeddedDivider$lambda$11(PaymentSheet.Appearance.Embedded.RowStyle rowStyle, int i, Composer composer, int i2) {
        OptionalEmbeddedDivider(rowStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodEmbeddedLayoutUI$lambda$10(List list, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, PaymentMethodVerticalLayoutInteractor.Selection selection, boolean z, Function0 function0, Function1 function1, Function1 function12, StripeImageLoader stripeImageLoader, PaymentSheet.Appearance.Embedded embedded, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        PaymentMethodEmbeddedLayoutUI(list, displayableSavedPaymentMethod, savedPaymentMethodAction, selection, z, function0, function1, function12, stripeImageLoader, embedded, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodEmbeddedLayoutUI$lambda$8(ColumnScope columnScope, PaymentMethodVerticalLayoutInteractor paymentMethodVerticalLayoutInteractor, boolean z, Modifier modifier, PaymentSheet.Appearance.Embedded embedded, int i, int i2, Composer composer, int i3) {
        PaymentMethodEmbeddedLayoutUI(columnScope, paymentMethodVerticalLayoutInteractor, z, modifier, embedded, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodEmbeddedLayoutUI(final ColumnScope columnScope, final PaymentMethodVerticalLayoutInteractor interactor, final boolean z, Modifier modifier, final PaymentSheet.Appearance.Embedded appearance, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        int i4;
        boolean z2;
        Object objRememberedValue2;
        boolean z3;
        State state;
        boolean z4;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Composer composerStartRestartGroup = composer.startRestartGroup(1849594752);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? composerStartRestartGroup.changed(interactor) : composerStartRestartGroup.changedInstance(interactor) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 8) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(appearance) : composerStartRestartGroup.changedInstance(appearance) ? 16384 : 8192;
            }
            if ((i3 & 9361) == 9360 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1849594752, i3, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUI (PaymentMethodEmbeddedLayoutUI.kt:50)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Context context = (Context) objConsume;
                composerStartRestartGroup.startReplaceGroup(1520919650);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    objRememberedValue = new StripeImageLoader(applicationContext, null, null, null, null, 30, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                StripeImageLoader stripeImageLoader = (StripeImageLoader) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                State stateCollectAsState = StateFlowsComposeKt.collectAsState(interactor.getState(), null, composerStartRestartGroup, 0, 1);
                List<DisplayablePaymentMethod> displayablePaymentMethods = PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState).getDisplayablePaymentMethods();
                DisplayableSavedPaymentMethod displayedSavedPaymentMethod = PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState).getDisplayedSavedPaymentMethod();
                PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction availableSavedPaymentMethodAction = PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState).getAvailableSavedPaymentMethodAction();
                PaymentMethodVerticalLayoutInteractor.Selection selection = PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState).getSelection();
                boolean z5 = !PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState).isProcessing();
                Modifier modifierTestTag = TestTagKt.testTag(companion, TEST_TAG_PAYMENT_METHOD_EMBEDDED_LAYOUT);
                composerStartRestartGroup.startReplaceGroup(1520935077);
                i4 = i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                z2 = i4 != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(interactor));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentMethodEmbeddedLayoutUIKt.PaymentMethodEmbeddedLayoutUI$lambda$3$lambda$2(interactor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1520948705);
                z3 = i4 != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(interactor));
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    state = stateCollectAsState;
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1520941740);
                    z4 = i4 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(interactor));
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PaymentMethodEmbeddedLayoutUIKt.PaymentMethodEmbeddedLayoutUI$lambda$7$lambda$6(interactor, (DisplayableSavedPaymentMethod) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier4 = companion;
                    PaymentMethodEmbeddedLayoutUI(displayablePaymentMethods, displayedSavedPaymentMethod, availableSavedPaymentMethodAction, selection, z5, function0, function1, (Function1) objRememberedValue3, stripeImageLoader, appearance, modifierTestTag, composerStartRestartGroup, (StripeImageLoader.$stable << 24) | ((i3 << 15) & 1879048192), 0, 0);
                    EmbeddedMandate(z, PaymentMethodEmbeddedLayoutUI$lambda$1(state).getMandate(), composerStartRestartGroup, (i3 >> 6) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    state = stateCollectAsState;
                }
                objRememberedValue4 = new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaymentMethodEmbeddedLayoutUIKt.PaymentMethodEmbeddedLayoutUI$lambda$5$lambda$4(interactor, (DisplayableSavedPaymentMethod) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                Function1 function12 = (Function1) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1520941740);
                if (i4 == 32) {
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z4) {
                        objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PaymentMethodEmbeddedLayoutUIKt.PaymentMethodEmbeddedLayoutUI$lambda$7$lambda$6(interactor, (DisplayableSavedPaymentMethod) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier42 = companion;
                        PaymentMethodEmbeddedLayoutUI(displayablePaymentMethods, displayedSavedPaymentMethod, availableSavedPaymentMethodAction, selection, z5, function0, function12, (Function1) objRememberedValue3, stripeImageLoader, appearance, modifierTestTag, composerStartRestartGroup, (StripeImageLoader.$stable << 24) | ((i3 << 15) & 1879048192), 0, 0);
                        EmbeddedMandate(z, PaymentMethodEmbeddedLayoutUI$lambda$1(state).getMandate(), composerStartRestartGroup, (i3 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentMethodEmbeddedLayoutUIKt.PaymentMethodEmbeddedLayoutUI$lambda$8(columnScope, interactor, z, modifier3, appearance, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 9361) == 9360) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context2 = (Context) objConsume2;
            composerStartRestartGroup.startReplaceGroup(1520919650);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            StripeImageLoader stripeImageLoader2 = (StripeImageLoader) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(interactor.getState(), null, composerStartRestartGroup, 0, 1);
            List<DisplayablePaymentMethod> displayablePaymentMethods2 = PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState2).getDisplayablePaymentMethods();
            DisplayableSavedPaymentMethod displayedSavedPaymentMethod2 = PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState2).getDisplayedSavedPaymentMethod();
            PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction availableSavedPaymentMethodAction2 = PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState2).getAvailableSavedPaymentMethodAction();
            PaymentMethodVerticalLayoutInteractor.Selection selection2 = PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState2).getSelection();
            boolean z52 = !PaymentMethodEmbeddedLayoutUI$lambda$1(stateCollectAsState2).isProcessing();
            Modifier modifierTestTag2 = TestTagKt.testTag(companion, TEST_TAG_PAYMENT_METHOD_EMBEDDED_LAYOUT);
            composerStartRestartGroup.startReplaceGroup(1520935077);
            i4 = i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
            if (i4 != 32) {
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentMethodEmbeddedLayoutUIKt.PaymentMethodEmbeddedLayoutUI$lambda$3$lambda$2(interactor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    Function0 function02 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1520948705);
                    if (i4 != 32) {
                        Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                        }
                        objRememberedValue42 = new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PaymentMethodEmbeddedLayoutUIKt.PaymentMethodEmbeddedLayoutUI$lambda$5$lambda$4(interactor, (DisplayableSavedPaymentMethod) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue42);
                        Function1 function122 = (Function1) objRememberedValue42;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1520941740);
                        if (i4 == 32) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodEmbeddedLayoutUI$lambda$3$lambda$2(PaymentMethodVerticalLayoutInteractor paymentMethodVerticalLayoutInteractor) {
        paymentMethodVerticalLayoutInteractor.handleViewAction(PaymentMethodVerticalLayoutInteractor.ViewAction.TransitionToManageSavedPaymentMethods.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodEmbeddedLayoutUI$lambda$7$lambda$6(PaymentMethodVerticalLayoutInteractor paymentMethodVerticalLayoutInteractor, DisplayableSavedPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        paymentMethodVerticalLayoutInteractor.handleViewAction(new PaymentMethodVerticalLayoutInteractor.ViewAction.SavedPaymentMethodSelected(it.getPaymentMethod()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodEmbeddedLayoutUI$lambda$5$lambda$4(PaymentMethodVerticalLayoutInteractor paymentMethodVerticalLayoutInteractor, DisplayableSavedPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        paymentMethodVerticalLayoutInteractor.handleViewAction(new PaymentMethodVerticalLayoutInteractor.ViewAction.OnManageOneSavedPaymentMethod(it));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodEmbeddedLayoutUI(final List<DisplayablePaymentMethod> paymentMethods, final DisplayableSavedPaymentMethod displayableSavedPaymentMethod, final PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, final PaymentMethodVerticalLayoutInteractor.Selection selection, final boolean z, final Function0<Unit> onViewMorePaymentMethods, final Function1<? super DisplayableSavedPaymentMethod, Unit> onManageOneSavedPaymentMethod, final Function1<? super DisplayableSavedPaymentMethod, Unit> onSelectSavedPaymentMethod, final StripeImageLoader imageLoader, final PaymentSheet.Appearance.Embedded appearance, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        DisplayableSavedPaymentMethod displayableSavedPaymentMethod2;
        boolean z2;
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        Arrangement.HorizontalOrVertical top;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i8;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(savedPaymentMethodAction, "savedPaymentMethodAction");
        Intrinsics.checkNotNullParameter(onViewMorePaymentMethods, "onViewMorePaymentMethods");
        Intrinsics.checkNotNullParameter(onManageOneSavedPaymentMethod, "onManageOneSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Composer composerStartRestartGroup = composer.startRestartGroup(1459381369);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(paymentMethods) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                displayableSavedPaymentMethod2 = displayableSavedPaymentMethod;
                i4 |= composerStartRestartGroup.changedInstance(displayableSavedPaymentMethod2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i4 |= composerStartRestartGroup.changed(savedPaymentMethodAction) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(selection) : composerStartRestartGroup.changedInstance(selection) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onViewMorePaymentMethods) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onManageOneSavedPaymentMethod) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onSelectSavedPaymentMethod) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= (134217728 & i) == 0 ? composerStartRestartGroup.changed(imageLoader) : composerStartRestartGroup.changedInstance(imageLoader) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= (1073741824 & i) == 0 ? composerStartRestartGroup.changed(appearance) : composerStartRestartGroup.changedInstance(appearance) ? 536870912 : 268435456;
                }
                i5 = i4;
                i6 = i3 & 1024;
                if (i6 != 0) {
                    modifier2 = modifier;
                    i7 = i2 | 6;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 6) == 0) {
                        i7 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
                    } else {
                        i7 = i2;
                    }
                }
                if ((i5 & 306783379) != 306783378 || (i7 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1459381369, i5, i7, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUI (PaymentMethodEmbeddedLayoutUI.kt:105)");
                    }
                    if (!(appearance.getStyle() instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton)) {
                        top = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) appearance.getStyle()).getSpacingDp()));
                    } else {
                        top = Arrangement.INSTANCE.getTop();
                    }
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(687524688);
                    if (topSeparatorEnabled(appearance.getStyle())) {
                        i8 = 0;
                    } else {
                        i8 = 0;
                        OptionalEmbeddedDivider(appearance.getStyle(), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    DisplayableSavedPaymentMethod displayableSavedPaymentMethod3 = displayableSavedPaymentMethod2;
                    int i9 = i8;
                    EmbeddedSavedPaymentMethodRowButton(paymentMethods, displayableSavedPaymentMethod3, savedPaymentMethodAction, selection, z2, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onSelectSavedPaymentMethod, appearance, composerStartRestartGroup, (i5 & 33554430) | (234881024 & (i5 >> 3)));
                    composer2 = composerStartRestartGroup;
                    int i10 = i5 >> 6;
                    int i11 = i5 >> 15;
                    EmbeddedNewPaymentMethodRowButtonsLayoutUi(paymentMethods, selection, z, imageLoader, appearance, composer2, (i10 & 896) | (i5 & 14) | (i10 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (StripeImageLoader.$stable << 9) | (i11 & 7168) | (i11 & 57344));
                    composer2.startReplaceGroup(687553523);
                    if (bottomSeparatorEnabled(appearance.getStyle())) {
                        OptionalEmbeddedDivider(appearance.getStyle(), composer2, i9);
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
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PaymentMethodEmbeddedLayoutUIKt.PaymentMethodEmbeddedLayoutUI$lambda$10(paymentMethods, displayableSavedPaymentMethod, savedPaymentMethodAction, selection, z, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onSelectSavedPaymentMethod, imageLoader, appearance, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            z2 = z;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i5 = i4;
            i6 = i3 & 1024;
            if (i6 != 0) {
            }
            if ((i5 & 306783379) != 306783378) {
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!(appearance.getStyle() instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton)) {
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting()) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(687524688);
                    if (topSeparatorEnabled(appearance.getStyle())) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    DisplayableSavedPaymentMethod displayableSavedPaymentMethod32 = displayableSavedPaymentMethod2;
                    int i92 = i8;
                    EmbeddedSavedPaymentMethodRowButton(paymentMethods, displayableSavedPaymentMethod32, savedPaymentMethodAction, selection, z2, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onSelectSavedPaymentMethod, appearance, composerStartRestartGroup, (i5 & 33554430) | (234881024 & (i5 >> 3)));
                    composer2 = composerStartRestartGroup;
                    int i102 = i5 >> 6;
                    int i112 = i5 >> 15;
                    EmbeddedNewPaymentMethodRowButtonsLayoutUi(paymentMethods, selection, z, imageLoader, appearance, composer2, (i102 & 896) | (i5 & 14) | (i102 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (StripeImageLoader.$stable << 9) | (i112 & 7168) | (i112 & 57344));
                    composer2.startReplaceGroup(687553523);
                    if (bottomSeparatorEnabled(appearance.getStyle())) {
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        displayableSavedPaymentMethod2 = displayableSavedPaymentMethod;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        z2 = z;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i5 = i4;
        i6 = i3 & 1024;
        if (i6 != 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void OptionalEmbeddedDivider(final PaymentSheet.Appearance.Embedded.RowStyle rowStyle, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1827597478);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(rowStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1827597478, i2, -1, "com.stripe.android.paymentsheet.verticalmode.OptionalEmbeddedDivider (PaymentMethodEmbeddedLayoutUI.kt:139)");
            }
            if (rowStyle.hasSeparators$paymentsheet_release()) {
                DividerKt.m1877DivideroMI9zvI(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, startSeparatorInset(rowStyle), 0.0f, endSeparatorInset(rowStyle), 0.0f, 10, null), ColorKt.Color(separatorColor(rowStyle, DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0))), separatorThickness(rowStyle), Dp.m6117constructorimpl(rowStyle.startSeparatorHasDefaultInset$paymentsheet_release() ? 32 : 0), composerStartRestartGroup, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodEmbeddedLayoutUIKt.OptionalEmbeddedDivider$lambda$11(rowStyle, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EmbeddedMandate(final boolean z, final ResolvableString resolvableString, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-776728152);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(resolvableString) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-776728152, i2, -1, "com.stripe.android.paymentsheet.verticalmode.EmbeddedMandate (PaymentMethodEmbeddedLayoutUI.kt:159)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(2013312436);
                String strResolve = resolvableString == null ? null : ResolvableStringComposeUtilsKt.resolve(resolvableString, composerStartRestartGroup, (i2 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
                MandateTextUIKt.m8662MandateJ7GKdg(strResolve, TestTagKt.testTag(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), EMBEDDED_MANDATE_TEXT_TEST_TAG), 0, 0, null, composerStartRestartGroup, 48, 28);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodEmbeddedLayoutUIKt.EmbeddedMandate$lambda$12(z, resolvableString, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean bottomSeparatorEnabled(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) {
            return false;
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) {
            return ((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) rowStyle).getBottomSeparatorEnabled();
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) {
            return ((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) rowStyle).getBottomSeparatorEnabled();
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) {
            return ((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) rowStyle).getBottomSeparatorEnabled();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean topSeparatorEnabled(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) {
            return false;
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) {
            return ((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) rowStyle).getTopSeparatorEnabled();
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) {
            return ((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) rowStyle).getTopSeparatorEnabled();
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) {
            return ((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) rowStyle).getTopSeparatorEnabled();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final float separatorThickness(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton)) {
            if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio)) {
                if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark)) {
                    if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) rowStyle).getSeparatorThicknessDp());
                }
                return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) rowStyle).getSeparatorThicknessDp());
            }
            return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) rowStyle).getSeparatorThicknessDp());
        }
        return Dp.m6117constructorimpl(0);
    }

    private static final int separatorColor(PaymentSheet.Appearance.Embedded.RowStyle rowStyle, boolean z) {
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) {
            return 0;
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) {
            return ((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) rowStyle).getColors$paymentsheet_release(z).getSeparatorColor();
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) {
            return ((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) rowStyle).getColors$paymentsheet_release(z).getSeparatorColor();
        }
        if (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) {
            return ((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) rowStyle).getColors$paymentsheet_release(z).getSeparatorColor();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final float startSeparatorInset(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton)) {
            if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio)) {
                if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark)) {
                    if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) rowStyle).getStartSeparatorInsetDp());
                }
                return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) rowStyle).getStartSeparatorInsetDp());
            }
            return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) rowStyle).getStartSeparatorInsetDp());
        }
        return Dp.m6117constructorimpl(0);
    }

    private static final float endSeparatorInset(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton)) {
            if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio)) {
                if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark)) {
                    if (!(rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure) rowStyle).getEndSeparatorInsetDp());
                }
                return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) rowStyle).getEndSeparatorInsetDp());
            }
            return Dp.m6117constructorimpl(((PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio) rowStyle).getEndSeparatorInsetDp());
        }
        return Dp.m6117constructorimpl(0);
    }

    public static final void EmbeddedSavedPaymentMethodRowButton(final List<DisplayablePaymentMethod> paymentMethods, final DisplayableSavedPaymentMethod displayableSavedPaymentMethod, final PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, final PaymentMethodVerticalLayoutInteractor.Selection selection, final boolean z, final Function0<Unit> onViewMorePaymentMethods, final Function1<? super DisplayableSavedPaymentMethod, Unit> onManageOneSavedPaymentMethod, final Function1<? super DisplayableSavedPaymentMethod, Unit> onSelectSavedPaymentMethod, final PaymentSheet.Appearance.Embedded appearance, Composer composer, final int i) {
        int i2;
        boolean z2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(savedPaymentMethodAction, "savedPaymentMethodAction");
        Intrinsics.checkNotNullParameter(onViewMorePaymentMethods, "onViewMorePaymentMethods");
        Intrinsics.checkNotNullParameter(onManageOneSavedPaymentMethod, "onManageOneSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Composer composerStartRestartGroup = composer.startRestartGroup(1704246684);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(paymentMethods) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(displayableSavedPaymentMethod) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(savedPaymentMethodAction) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(selection) : composerStartRestartGroup.changedInstance(selection) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onViewMorePaymentMethods) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onManageOneSavedPaymentMethod) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectSavedPaymentMethod) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? composerStartRestartGroup.changed(appearance) : composerStartRestartGroup.changedInstance(appearance) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i3 = i2;
        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1704246684, i3, -1, "com.stripe.android.paymentsheet.verticalmode.EmbeddedSavedPaymentMethodRowButton (PaymentMethodEmbeddedLayoutUI.kt:235)");
            }
            if (displayableSavedPaymentMethod != null) {
                boolean z3 = selection != null && selection.isSaved();
                composerStartRestartGroup.startReplaceGroup(1513114922);
                boolean zChangedInstance = ((29360128 & i3) == 8388608) | composerStartRestartGroup.changedInstance(displayableSavedPaymentMethod);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentMethodEmbeddedLayoutUIKt.EmbeddedSavedPaymentMethodRowButton$lambda$14$lambda$13(onSelectSavedPaymentMethod, displayableSavedPaymentMethod);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton(displayableSavedPaymentMethod, z2, z3, null, appearance, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(1296417614, true, new AnonymousClass2(appearance, savedPaymentMethodAction, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, displayableSavedPaymentMethod), composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 1572864 | ((i3 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 12) & 57344), 8);
                if (!paymentMethods.isEmpty()) {
                    OptionalEmbeddedDivider(appearance.getStyle(), composer2, 0);
                }
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodEmbeddedLayoutUIKt.EmbeddedSavedPaymentMethodRowButton$lambda$15(paymentMethods, displayableSavedPaymentMethod, savedPaymentMethodAction, selection, z, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onSelectSavedPaymentMethod, appearance, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PaymentMethodEmbeddedLayoutUI.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$EmbeddedSavedPaymentMethodRowButton$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function3<RowScope, Composer, Integer, Unit> {
        final /* synthetic */ PaymentSheet.Appearance.Embedded $appearance;
        final /* synthetic */ DisplayableSavedPaymentMethod $displayedSavedPaymentMethod;
        final /* synthetic */ Function1<DisplayableSavedPaymentMethod, Unit> $onManageOneSavedPaymentMethod;
        final /* synthetic */ Function0<Unit> $onViewMorePaymentMethods;
        final /* synthetic */ PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction $savedPaymentMethodAction;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(PaymentSheet.Appearance.Embedded embedded, PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, Function0<Unit> function0, Function1<? super DisplayableSavedPaymentMethod, Unit> function1, DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            this.$appearance = embedded;
            this.$savedPaymentMethodAction = savedPaymentMethodAction;
            this.$onViewMorePaymentMethods = function0;
            this.$onManageOneSavedPaymentMethod = function1;
            this.$displayedSavedPaymentMethod = displayableSavedPaymentMethod;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1296417614, i, -1, "com.stripe.android.paymentsheet.verticalmode.EmbeddedSavedPaymentMethodRowButton.<anonymous> (PaymentMethodEmbeddedLayoutUI.kt:242)");
                }
                boolean viewMoreShowsChevron = PaymentMethodEmbeddedLayoutUIKt.getViewMoreShowsChevron(this.$appearance.getStyle());
                PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction = this.$savedPaymentMethodAction;
                Function0<Unit> function0 = this.$onViewMorePaymentMethods;
                composer.startReplaceGroup(-1406754356);
                boolean zChanged = composer.changed(this.$onManageOneSavedPaymentMethod) | composer.changedInstance(this.$displayedSavedPaymentMethod);
                final Function1<DisplayableSavedPaymentMethod, Unit> function1 = this.$onManageOneSavedPaymentMethod;
                final DisplayableSavedPaymentMethod displayableSavedPaymentMethod = this.$displayedSavedPaymentMethod;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$EmbeddedSavedPaymentMethodRowButton$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentMethodEmbeddedLayoutUIKt.AnonymousClass2.invoke$lambda$1$lambda$0(function1, displayableSavedPaymentMethod);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                PaymentMethodVerticalLayoutUIKt.SavedPaymentMethodTrailingContent(viewMoreShowsChevron, savedPaymentMethodAction, function0, (Function0) objRememberedValue, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
            function1.invoke(displayableSavedPaymentMethod);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmbeddedSavedPaymentMethodRowButton$lambda$14$lambda$13(Function1 function1, DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        function1.invoke(displayableSavedPaymentMethod);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmbeddedNewPaymentMethodRowButtonsLayoutUi(final List<DisplayablePaymentMethod> paymentMethods, final PaymentMethodVerticalLayoutInteractor.Selection selection, final boolean z, final StripeImageLoader stripeImageLoader, final PaymentSheet.Appearance.Embedded embedded, Composer composer, final int i) {
        int i2;
        int i3;
        ResolvableString subtitle;
        StripeImageLoader imageLoader = stripeImageLoader;
        final PaymentSheet.Appearance.Embedded appearance = embedded;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1348902901);
        int i4 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(paymentMethods) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(selection) : composerStartRestartGroup.changedInstance(selection) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(imageLoader) : composerStartRestartGroup.changedInstance(imageLoader) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(appearance) : composerStartRestartGroup.changedInstance(appearance) ? 16384 : 8192;
        }
        int i5 = i4;
        if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            int i6 = -1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1348902901, i5, -1, "com.stripe.android.paymentsheet.verticalmode.EmbeddedNewPaymentMethodRowButtonsLayoutUi (PaymentMethodEmbeddedLayoutUI.kt:264)");
            }
            composerStartRestartGroup.startReplaceGroup(533282352);
            boolean z2 = true;
            boolean zChanged = ((i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32 || ((i5 & 64) != 0 && composerStartRestartGroup.changed(selection))) | composerStartRestartGroup.changed(paymentMethods);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (selection instanceof PaymentMethodVerticalLayoutInteractor.Selection.New) {
                    String code = ((PaymentMethodVerticalLayoutInteractor.Selection.New) selection).getCode();
                    Iterator<DisplayablePaymentMethod> it = paymentMethods.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (Intrinsics.areEqual(it.next().getCode(), code)) {
                            i6 = i7;
                            break;
                        }
                        i7++;
                    }
                }
                objRememberedValue = Integer.valueOf(i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue = ((Number) objRememberedValue).intValue();
            composerStartRestartGroup.endReplaceGroup();
            int i8 = 0;
            for (Object obj : paymentMethods) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DisplayablePaymentMethod displayablePaymentMethod = (DisplayablePaymentMethod) obj;
                int i10 = i8;
                boolean z3 = i8 == iIntValue ? z2 : false;
                if (z3 && (selection instanceof PaymentMethodVerticalLayoutInteractor.Selection.New)) {
                    PaymentMethodVerticalLayoutInteractor.Selection.New r11 = (PaymentMethodVerticalLayoutInteractor.Selection.New) selection;
                    if (r11.getCanBeChanged()) {
                        composerStartRestartGroup.startReplaceGroup(1571947949);
                        String changeDetails = r11.getChangeDetails();
                        if (changeDetails == null || (subtitle = ResolvableStringUtilsKt.getResolvableString(changeDetails)) == null) {
                            subtitle = displayablePaymentMethod.getSubtitle();
                        }
                        i2 = i10;
                        i3 = iIntValue;
                        NewPaymentMethodRowButtonKt.NewPaymentMethodRowButton(z, true, DisplayablePaymentMethod.copy$default(displayablePaymentMethod, null, null, null, 0, null, null, null, false, subtitle, null, null, null, 3839, null), imageLoader, null, ComposableLambdaKt.rememberComposableLambda(-1739056617, z2, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$EmbeddedNewPaymentMethodRowButtonsLayoutUi$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                invoke(rowScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope NewPaymentMethodRowButton, Composer composer2, int i11) {
                                Intrinsics.checkNotNullParameter(NewPaymentMethodRowButton, "$this$NewPaymentMethodRowButton");
                                if ((i11 & 17) != 16 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1739056617, i11, -1, "com.stripe.android.paymentsheet.verticalmode.EmbeddedNewPaymentMethodRowButtonsLayoutUi.<anonymous>.<anonymous> (PaymentMethodEmbeddedLayoutUI.kt:288)");
                                    }
                                    PaymentMethodEmbeddedLayoutUIKt.EmbeddedNewPaymentMethodTrailingContent(((appearance.getStyle() instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) || (appearance.getStyle() instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure)) ? false : true, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54), appearance, composerStartRestartGroup, ((i5 >> 6) & 14) | 196656 | (StripeImageLoader.$stable << 9) | (i5 & 7168) | ((i5 << 6) & 3670016), 16);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                } else {
                    i2 = i10;
                    i3 = iIntValue;
                    composerStartRestartGroup.startReplaceGroup(1572682246);
                    NewPaymentMethodRowButtonKt.NewPaymentMethodRowButton(z, z3, displayablePaymentMethod, stripeImageLoader, null, null, embedded, composerStartRestartGroup, ((i5 >> 6) & 14) | (StripeImageLoader.$stable << 9) | (i5 & 7168) | ((i5 << 6) & 3670016), 48);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.startReplaceGroup(533330937);
                if (i2 != CollectionsKt.getLastIndex(paymentMethods)) {
                    OptionalEmbeddedDivider(embedded.getStyle(), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                imageLoader = stripeImageLoader;
                appearance = embedded;
                i8 = i9;
                iIntValue = i3;
                z2 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PaymentMethodEmbeddedLayoutUIKt.EmbeddedNewPaymentMethodRowButtonsLayoutUi$lambda$19(paymentMethods, selection, z, stripeImageLoader, embedded, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getViewMoreShowsChevron(PaymentSheet.Appearance.Embedded.RowStyle rowStyle) {
        if ((rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton) || (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithRadio)) {
            return true;
        }
        if ((rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithCheckmark) || (rowStyle instanceof PaymentSheet.Appearance.Embedded.RowStyle.FlatWithDisclosure)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void EmbeddedNewPaymentMethodTrailingContent(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-290528762);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-290528762, i2, -1, "com.stripe.android.paymentsheet.verticalmode.EmbeddedNewPaymentMethodTrailingContent (PaymentMethodEmbeddedLayoutUI.kt:322)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            float f = 4;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(PaddingKt.m1022paddingVpY3zN4$default(TestTagKt.testTag(Modifier.INSTANCE, TEST_TAG_CHANGE), 0.0f, Dp.m6117constructorimpl(f), 1, null), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
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
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_change, composerStartRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getSubtitle1(), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            composerStartRestartGroup.startReplaceGroup(-1090139831);
            if (z) {
                IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(com.stripe.android.paymentsheet.R.drawable.stripe_ic_chevron_right, composerStartRestartGroup, 0), (String) null, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(2), 0.0f, 0.0f, 12, null), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), composerStartRestartGroup, 432, 0);
            }
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodEmbeddedLayoutUIKt.EmbeddedNewPaymentMethodTrailingContent$lambda$21(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final PaymentMethodVerticalLayoutInteractor.State PaymentMethodEmbeddedLayoutUI$lambda$1(State<PaymentMethodVerticalLayoutInteractor.State> state) {
        return state.getValue();
    }
}
