package com.stripe.android.paymentsheet.verticalmode;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
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
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodVerticalLayoutUI.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u0087\u0001\u0010\u0005\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u001e\u001a;\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0001¢\u0006\u0002\u0010!\u001a\u001b\u0010\"\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0003¢\u0006\u0002\u0010$\u001a%\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0003¢\u0006\u0002\u0010'\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, d2 = {PaymentMethodVerticalLayoutUIKt.TEST_TAG_PAYMENT_METHOD_VERTICAL_LAYOUT, "", PaymentMethodVerticalLayoutUIKt.TEST_TAG_VIEW_MORE, "TEST_TAG_EDIT_SAVED_CARD", PaymentMethodVerticalLayoutUIKt.TEST_TAG_SAVED_TEXT, "PaymentMethodVerticalLayoutUI", "", "interactor", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "paymentMethods", "", "Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;", "displayedSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "savedPaymentMethodAction", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;", "isEnabled", "", "onViewMorePaymentMethods", "Lkotlin/Function0;", "onManageOneSavedPaymentMethod", "Lkotlin/Function1;", "onSelectSavedPaymentMethod", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/image/StripeImageLoader;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SavedPaymentMethodTrailingContent", "viewMoreShowChevron", "(ZLcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "EditButton", ViewProps.ON_CLICK, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ViewMoreButton", "showChevron", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "paymentsheet_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$State;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentMethodVerticalLayoutUIKt {
    public static final String TEST_TAG_EDIT_SAVED_CARD = "TEST_TAG_VERTICAL_MODE_SAVED_PM_EDIT";
    public static final String TEST_TAG_PAYMENT_METHOD_VERTICAL_LAYOUT = "TEST_TAG_PAYMENT_METHOD_VERTICAL_LAYOUT";
    public static final String TEST_TAG_SAVED_TEXT = "TEST_TAG_SAVED_TEXT";
    public static final String TEST_TAG_VIEW_MORE = "TEST_TAG_VIEW_MORE";

    /* compiled from: PaymentMethodVerticalLayoutUI.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction.values().length];
            try {
                iArr[PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction.MANAGE_ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction.MANAGE_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditButton$lambda$17(Function0 function0, int i, Composer composer, int i2) {
        EditButton(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodVerticalLayoutUI$lambda$15(List list, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, PaymentMethodVerticalLayoutInteractor.Selection selection, boolean z, Function0 function0, Function1 function1, Function1 function12, StripeImageLoader stripeImageLoader, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PaymentMethodVerticalLayoutUI(list, displayableSavedPaymentMethod, savedPaymentMethodAction, selection, z, function0, function1, function12, stripeImageLoader, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodVerticalLayoutUI$lambda$8(PaymentMethodVerticalLayoutInteractor paymentMethodVerticalLayoutInteractor, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PaymentMethodVerticalLayoutUI(paymentMethodVerticalLayoutInteractor, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTrailingContent$lambda$16(boolean z, PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        SavedPaymentMethodTrailingContent(z, savedPaymentMethodAction, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViewMoreButton$lambda$19(boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        ViewMoreButton(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodVerticalLayoutUI(final PaymentMethodVerticalLayoutInteractor interactor, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        boolean z;
        Object objRememberedValue2;
        boolean z2;
        Object objRememberedValue3;
        boolean z3;
        Object objRememberedValue4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Composer composerStartRestartGroup = composer.startRestartGroup(-406651974);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(interactor) : composerStartRestartGroup.changedInstance(interactor) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(-406651974, i3, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUI (PaymentMethodVerticalLayoutUI.kt:49)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Context context = (Context) objConsume;
                composerStartRestartGroup.startReplaceGroup(1127375150);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    StripeImageLoader stripeImageLoader = new StripeImageLoader(applicationContext, null, null, null, null, 30, null);
                    composerStartRestartGroup.updateRememberedValue(stripeImageLoader);
                    objRememberedValue = stripeImageLoader;
                }
                StripeImageLoader stripeImageLoader2 = (StripeImageLoader) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                State stateCollectAsState = StateFlowsComposeKt.collectAsState(interactor.getState(), null, composerStartRestartGroup, 0, 1);
                List<DisplayablePaymentMethod> displayablePaymentMethods = PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState).getDisplayablePaymentMethods();
                DisplayableSavedPaymentMethod displayedSavedPaymentMethod = PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState).getDisplayedSavedPaymentMethod();
                PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction availableSavedPaymentMethodAction = PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState).getAvailableSavedPaymentMethodAction();
                PaymentMethodVerticalLayoutInteractor.Selection selection = PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState).getSelection();
                boolean z4 = !PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState).isProcessing();
                Modifier modifierTestTag = TestTagKt.testTag(companion, TEST_TAG_PAYMENT_METHOD_VERTICAL_LAYOUT);
                composerStartRestartGroup.startReplaceGroup(1127390577);
                int i5 = i3 & 14;
                z = i5 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentMethodVerticalLayoutUIKt.PaymentMethodVerticalLayoutUI$lambda$3$lambda$2(interactor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1127404205);
                z2 = i5 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor));
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PaymentMethodVerticalLayoutUIKt.PaymentMethodVerticalLayoutUI$lambda$5$lambda$4(interactor, (DisplayableSavedPaymentMethod) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function1 function1 = (Function1) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1127397240);
                z3 = i5 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor));
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PaymentMethodVerticalLayoutUIKt.PaymentMethodVerticalLayoutUI$lambda$7$lambda$6(interactor, (DisplayableSavedPaymentMethod) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = companion;
                PaymentMethodVerticalLayoutUI(displayablePaymentMethods, displayedSavedPaymentMethod, availableSavedPaymentMethodAction, selection, z4, function0, function1, (Function1) objRememberedValue4, stripeImageLoader2, modifierTestTag, composerStartRestartGroup, StripeImageLoader.$stable << 24, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentMethodVerticalLayoutUIKt.PaymentMethodVerticalLayoutUI$lambda$8(interactor, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Object objConsume2 = composerStartRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context2 = (Context) objConsume2;
            composerStartRestartGroup.startReplaceGroup(1127375150);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            StripeImageLoader stripeImageLoader22 = (StripeImageLoader) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(interactor.getState(), null, composerStartRestartGroup, 0, 1);
            List<DisplayablePaymentMethod> displayablePaymentMethods2 = PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState2).getDisplayablePaymentMethods();
            DisplayableSavedPaymentMethod displayedSavedPaymentMethod2 = PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState2).getDisplayedSavedPaymentMethod();
            PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction availableSavedPaymentMethodAction2 = PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState2).getAvailableSavedPaymentMethodAction();
            PaymentMethodVerticalLayoutInteractor.Selection selection2 = PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState2).getSelection();
            boolean z42 = !PaymentMethodVerticalLayoutUI$lambda$1(stateCollectAsState2).isProcessing();
            Modifier modifierTestTag2 = TestTagKt.testTag(companion, TEST_TAG_PAYMENT_METHOD_VERTICAL_LAYOUT);
            composerStartRestartGroup.startReplaceGroup(1127390577);
            int i52 = i3 & 14;
            if (i52 != 4) {
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentMethodVerticalLayoutUIKt.PaymentMethodVerticalLayoutUI$lambda$3$lambda$2(interactor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    Function0 function02 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1127404205);
                    if (i52 != 4) {
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z2) {
                            objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PaymentMethodVerticalLayoutUIKt.PaymentMethodVerticalLayoutUI$lambda$5$lambda$4(interactor, (DisplayableSavedPaymentMethod) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            Function1 function12 = (Function1) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1127397240);
                            if (i52 != 4) {
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!z3) {
                                    objRememberedValue4 = new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return PaymentMethodVerticalLayoutUIKt.PaymentMethodVerticalLayoutUI$lambda$7$lambda$6(interactor, (DisplayableSavedPaymentMethod) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    composerStartRestartGroup.endReplaceGroup();
                                    modifier3 = companion;
                                    PaymentMethodVerticalLayoutUI(displayablePaymentMethods2, displayedSavedPaymentMethod2, availableSavedPaymentMethodAction2, selection2, z42, function02, function12, (Function1) objRememberedValue4, stripeImageLoader22, modifierTestTag2, composerStartRestartGroup, StripeImageLoader.$stable << 24, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                            }
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
    public static final Unit PaymentMethodVerticalLayoutUI$lambda$3$lambda$2(PaymentMethodVerticalLayoutInteractor paymentMethodVerticalLayoutInteractor) {
        paymentMethodVerticalLayoutInteractor.handleViewAction(PaymentMethodVerticalLayoutInteractor.ViewAction.TransitionToManageSavedPaymentMethods.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodVerticalLayoutUI$lambda$7$lambda$6(PaymentMethodVerticalLayoutInteractor paymentMethodVerticalLayoutInteractor, DisplayableSavedPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        paymentMethodVerticalLayoutInteractor.handleViewAction(new PaymentMethodVerticalLayoutInteractor.ViewAction.SavedPaymentMethodSelected(it.getPaymentMethod()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodVerticalLayoutUI$lambda$5$lambda$4(PaymentMethodVerticalLayoutInteractor paymentMethodVerticalLayoutInteractor, DisplayableSavedPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        paymentMethodVerticalLayoutInteractor.handleViewAction(new PaymentMethodVerticalLayoutInteractor.ViewAction.OnManageOneSavedPaymentMethod(it));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodVerticalLayoutUI(final List<DisplayablePaymentMethod> paymentMethods, final DisplayableSavedPaymentMethod displayableSavedPaymentMethod, final PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, final PaymentMethodVerticalLayoutInteractor.Selection selection, final boolean z, final Function0<Unit> onViewMorePaymentMethods, final Function1<? super DisplayableSavedPaymentMethod, Unit> onManageOneSavedPaymentMethod, final Function1<? super DisplayableSavedPaymentMethod, Unit> onSelectSavedPaymentMethod, final StripeImageLoader imageLoader, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z3;
        int i5;
        boolean z4;
        char c;
        int i6;
        boolean zChanged;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(savedPaymentMethodAction, "savedPaymentMethodAction");
        Intrinsics.checkNotNullParameter(onViewMorePaymentMethods, "onViewMorePaymentMethods");
        Intrinsics.checkNotNullParameter(onManageOneSavedPaymentMethod, "onManageOneSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(onSelectSavedPaymentMethod, "onSelectSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Composer composerStartRestartGroup = composer.startRestartGroup(-798081681);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(paymentMethods) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(displayableSavedPaymentMethod) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(savedPaymentMethodAction) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(selection) : composerStartRestartGroup.changedInstance(selection) ? 2048 : 1024;
        }
        if ((i2 & 16) == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onViewMorePaymentMethods) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onManageOneSavedPaymentMethod) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSelectSavedPaymentMethod) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= (134217728 & i) == 0 ? composerStartRestartGroup.changed(imageLoader) : composerStartRestartGroup.changedInstance(imageLoader) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i4 = i2 & 512;
            if (i4 == 0) {
                i3 |= 805306368;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & 805306368) == 0) {
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                }
            }
            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-798081681, i3, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUI (PaymentMethodVerticalLayoutUI.kt:97)");
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                Modifier modifier4 = companion;
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = i3;
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
                TextStyle subtitle1 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getSubtitle1();
                long jM8728getOnComponent0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8728getOnComponent0d7_KjU();
                PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton floatingButtonBuild = new PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton.Builder().spacingDp(PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton.INSTANCE.getDefault().getSpacingDp()).additionalInsetsDp(StripeTheme.INSTANCE.getVerticalModeRowPadding()).build();
                composerStartRestartGroup.startReplaceGroup(962088825);
                if (displayableSavedPaymentMethod == null) {
                    TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_saved, composerStartRestartGroup, 0), TestTagKt.testTag(Modifier.INSTANCE, TEST_TAG_SAVED_TEXT), jM8728getOnComponent0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, subtitle1, composerStartRestartGroup, 48, 0, 65528);
                    float f = 16;
                    SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composerStartRestartGroup, 6);
                    boolean z5 = selection != null && selection.isSaved();
                    PaymentSheet.Appearance.Embedded embedded = new PaymentSheet.Appearance.Embedded(floatingButtonBuild);
                    composerStartRestartGroup.startReplaceGroup(962105858);
                    boolean zChangedInstance = ((i7 & 29360128) == 8388608) | composerStartRestartGroup.changedInstance(displayableSavedPaymentMethod);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PaymentMethodVerticalLayoutUIKt.PaymentMethodVerticalLayoutUI$lambda$14$lambda$11$lambda$10(onSelectSavedPaymentMethod, displayableSavedPaymentMethod);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    z3 = true;
                    i5 = i7;
                    c = 65535;
                    SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton(displayableSavedPaymentMethod, z2, z5, null, embedded, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-1223590933, true, new PaymentMethodVerticalLayoutUIKt$PaymentMethodVerticalLayoutUI$5$2(savedPaymentMethodAction, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, displayableSavedPaymentMethod), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 3) & 14) | 1572864 | ((i7 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 8);
                    composerStartRestartGroup = composerStartRestartGroup;
                    SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), composerStartRestartGroup, 6);
                    z4 = false;
                    TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_new_pm, composerStartRestartGroup, 0), (Modifier) null, jM8728getOnComponent0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, subtitle1, composerStartRestartGroup, 0, 0, 65530);
                    SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composerStartRestartGroup, 6);
                } else {
                    z3 = true;
                    i5 = i7;
                    z4 = false;
                    c = 65535;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(962131315);
                i6 = i5;
                if ((i6 & 7168) != 2048 && ((i6 & 4096) == 0 || !composerStartRestartGroup.changed(selection))) {
                    z3 = z4;
                }
                zChanged = z3 | composerStartRestartGroup.changed(paymentMethods);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    if (!(selection instanceof PaymentMethodVerticalLayoutInteractor.Selection.New)) {
                        String code = ((PaymentMethodVerticalLayoutInteractor.Selection.New) selection).getCode();
                        Iterator<DisplayablePaymentMethod> it = paymentMethods.iterator();
                        ?? r9 = z4;
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(it.next().getSyntheticCode(), code)) {
                                break;
                            } else {
                                r9 = (r9 == true ? 1 : 0) + 1;
                            }
                        }
                        r9 = c;
                        objRememberedValue2 = Integer.valueOf((int) r9);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        r9 = c;
                        objRememberedValue2 = Integer.valueOf((int) r9);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                }
                int iIntValue = ((Number) objRememberedValue2).intValue();
                composerStartRestartGroup.endReplaceGroup();
                NewPaymentMethodVerticalLayoutUIKt.NewPaymentMethodVerticalLayoutUI(paymentMethods, iIntValue, z, imageLoader, null, floatingButtonBuild, composerStartRestartGroup, (i6 & 14) | ((i6 >> 6) & 896) | (StripeImageLoader.$stable << 9) | ((i6 >> 15) & 7168), 16);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentMethodVerticalLayoutUIKt.PaymentMethodVerticalLayoutUI$lambda$15(paymentMethods, displayableSavedPaymentMethod, savedPaymentMethodAction, selection, z, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, onSelectSavedPaymentMethod, imageLoader, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        z2 = z;
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i4 = i2 & 512;
        if (i4 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Modifier modifier42 = companion;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i72 = i3;
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
                TextStyle subtitle12 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getSubtitle1();
                long jM8728getOnComponent0d7_KjU2 = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8728getOnComponent0d7_KjU();
                PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton floatingButtonBuild2 = new PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton.Builder().spacingDp(PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton.INSTANCE.getDefault().getSpacingDp()).additionalInsetsDp(StripeTheme.INSTANCE.getVerticalModeRowPadding()).build();
                composerStartRestartGroup.startReplaceGroup(962088825);
                if (displayableSavedPaymentMethod == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(962131315);
                i6 = i5;
                if ((i6 & 7168) != 2048) {
                    z3 = z4;
                }
                zChanged = z3 | composerStartRestartGroup.changed(paymentMethods);
                Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    if (!(selection instanceof PaymentMethodVerticalLayoutInteractor.Selection.New)) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodVerticalLayoutUI$lambda$14$lambda$11$lambda$10(Function1 function1, DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        function1.invoke(displayableSavedPaymentMethod);
        return Unit.INSTANCE;
    }

    public static final void SavedPaymentMethodTrailingContent(boolean z, final PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, final Function0<Unit> onViewMorePaymentMethods, final Function0<Unit> onManageOneSavedPaymentMethod, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(savedPaymentMethodAction, "savedPaymentMethodAction");
        Intrinsics.checkNotNullParameter(onViewMorePaymentMethods, "onViewMorePaymentMethods");
        Intrinsics.checkNotNullParameter(onManageOneSavedPaymentMethod, "onManageOneSavedPaymentMethod");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1630379097);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(savedPaymentMethodAction) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onViewMorePaymentMethods) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onManageOneSavedPaymentMethod) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1630379097, i3, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodTrailingContent (PaymentMethodVerticalLayoutUI.kt:161)");
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[savedPaymentMethodAction.ordinal()];
            if (i5 == 1) {
                composerStartRestartGroup.startReplaceGroup(-99978354);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i5 == 2) {
                composerStartRestartGroup.startReplaceGroup(1195729805);
                EditButton(onManageOneSavedPaymentMethod, composerStartRestartGroup, (i3 >> 9) & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 3) {
                    composerStartRestartGroup.startReplaceGroup(-99981432);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1195892524);
                ViewMoreButton(z, onViewMorePaymentMethods, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final boolean z2 = z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodVerticalLayoutUIKt.SavedPaymentMethodTrailingContent$lambda$16(z2, savedPaymentMethodAction, onViewMorePaymentMethods, onManageOneSavedPaymentMethod, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void EditButton(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-716177738);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-716177738, i2, -1, "com.stripe.android.paymentsheet.verticalmode.EditButton (PaymentMethodVerticalLayoutUI.kt:177)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_edit, composerStartRestartGroup, 0), SizeKt.wrapContentHeight$default(PaddingKt.m1022paddingVpY3zN4$default(ClickableKt.m608clickableXHw0xAI$default(TestTagKt.testTag(Modifier.INSTANCE, TEST_TAG_EDIT_SAVED_CARD), false, null, null, function0, 7, null), 0.0f, Dp.m6117constructorimpl(4), 1, null), null, false, 3, null), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getSubtitle1(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodVerticalLayoutUIKt.EditButton$lambda$17(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ViewMoreButton(boolean z, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1725741218);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            boolean z3 = i4 != 0 ? true : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1725741218, i3, -1, "com.stripe.android.paymentsheet.verticalmode.ViewMoreButton (PaymentMethodVerticalLayoutUI.kt:195)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            float f = 4;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(PaddingKt.m1022paddingVpY3zN4$default(ClickableKt.m608clickableXHw0xAI$default(TestTagKt.testTag(Modifier.INSTANCE, TEST_TAG_VIEW_MORE), false, null, null, function0, 7, null), 0.0f, Dp.m6117constructorimpl(f), 1, null), null, false, 3, null);
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
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_view_more, composerStartRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getSubtitle1(), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            composerStartRestartGroup.startReplaceGroup(-766672849);
            if (z3) {
                IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_chevron_right, composerStartRestartGroup, 0), (String) null, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(2), 0.0f, 0.0f, 12, null), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), composerStartRestartGroup, 432, 0);
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
            z2 = z3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentMethodVerticalLayoutUIKt.ViewMoreButton$lambda$19(z2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final PaymentMethodVerticalLayoutInteractor.State PaymentMethodVerticalLayoutUI$lambda$1(State<PaymentMethodVerticalLayoutInteractor.State> state) {
        return state.getValue();
    }
}
