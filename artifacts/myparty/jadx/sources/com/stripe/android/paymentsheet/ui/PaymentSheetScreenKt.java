package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.common.ui.BottomSheetScaffoldKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.ui.LinkButtonKt;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentSheetCardBrandFilter;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.databinding.StripeFragmentPrimaryButtonContainerBinding;
import com.stripe.android.paymentsheet.model.MandateText;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.state.WalletsProcessingState;
import com.stripe.android.paymentsheet.state.WalletsState;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.utils.ComposeUtilsKt;
import com.stripe.android.paymentsheet.utils.EventReporterProviderUtilKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.CircularProgressIndicatorKt;
import com.stripe.android.ui.core.elements.H4TextKt;
import com.stripe.android.ui.core.elements.MandateTextUIKt;
import com.stripe.android.uicore.PrimaryButtonStyle;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PaymentSheetScreen.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a/\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001a#\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010!\u001aO\u0010\"\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0003¢\u0006\u0002\u0010*\u001aW\u0010\"\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010+\u001aW\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020&2\b\u0010.\u001a\u0004\u0018\u00010\u001e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0004\b5\u00106\u001a\u0015\u00107\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0003¢\u0006\u0002\u00108\u001a\f\u00109\u001a\u00020:*\u00020;H\u0000\"\u000e\u0010<\u001a\u00020=X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020=X\u0086T¢\u0006\u0002\n\u0000\"\u0010\u0010?\u001a\u00020=8\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020AX\u0082T¢\u0006\u0002\n\u0000¨\u0006B²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u0084\u0002²\u0006\n\u0010D\u001a\u000202X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u0004\u0018\u00010FX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u0084\u0002²\u0006\f\u0010'\u001a\u0004\u0018\u00010$X\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u0004\u0018\u00010)X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010G\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010$X\u008a\u0084\u0002²\u0006\n\u0010H\u001a\u00020=X\u008a\u008e\u0002²\u0006\f\u0010I\u001a\u0004\u0018\u00010JX\u008a\u0084\u0002²\u0006\f\u0010K\u001a\u0004\u0018\u00010LX\u008a\u008e\u0002"}, d2 = {"PaymentSheetScreen", "", "viewModel", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "type", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetFlowType;", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/paymentsheet/ui/PaymentSheetFlowType;Landroidx/compose/runtime/Composer;I)V", "scrollState", "Landroidx/compose/foundation/ScrollState;", "contentVisible", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Landroidx/compose/foundation/ScrollState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PaymentSheetScreenContent", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/paymentsheet/ui/PaymentSheetFlowType;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "ResetScroll", "currentScreen", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "(Landroidx/compose/foundation/ScrollState;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Landroidx/compose/runtime/Composer;I)V", "ProgressOverlay", "Landroidx/compose/foundation/layout/BoxScope;", "walletsProcessingState", "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;", "(Landroidx/compose/foundation/layout/BoxScope;ZLcom/stripe/android/paymentsheet/state/WalletsProcessingState;Landroidx/compose/runtime/Composer;I)V", "ProgressOverlayProcessing", "(Landroidx/compose/runtime/Composer;I)V", "PaymentSheetContent", "headerText", "Lcom/stripe/android/core/strings/ResolvableString;", "walletsState", "Lcom/stripe/android/paymentsheet/state/WalletsState;", "error", "mandateText", "Lcom/stripe/android/paymentsheet/model/MandateText;", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/state/WalletsState;Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Lcom/stripe/android/paymentsheet/model/MandateText;Landroidx/compose/runtime/Composer;I)V", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/state/WalletsState;Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Lcom/stripe/android/paymentsheet/model/MandateText;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Wallet", ServerProtocol.DIALOG_PARAM_STATE, "processingState", "onGooglePayPressed", "onLinkPressed", "dividerSpacing", "Landroidx/compose/ui/unit/Dp;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "Wallet-iHT-50w", "(Lcom/stripe/android/paymentsheet/state/WalletsState;Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;FLandroidx/compose/ui/Modifier;Lcom/stripe/android/CardBrandFilter;Landroidx/compose/runtime/Composer;II)V", "PrimaryButton", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Landroidx/compose/runtime/Composer;I)V", "convert", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "PAYMENT_SHEET_PRIMARY_BUTTON_TEST_TAG", "", "PAYMENT_SHEET_ERROR_TEXT_TEST_TAG", PaymentSheetScreenKt.PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG, "POST_SUCCESS_ANIMATION_DELAY", "", "paymentsheet_release", BaseSheetViewModel.SAVE_PROCESSING, "contentHeight", "topBarState", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", "showsWalletsHeader", "lastScreenClassName", "uiState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "button", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetScreenKt {
    public static final String PAYMENT_SHEET_ERROR_TEXT_TEST_TAG = "PAYMENT_SHEET_ERROR";
    public static final String PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG = "PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG";
    public static final String PAYMENT_SHEET_PRIMARY_BUTTON_TEST_TAG = "PRIMARY_BUTTON";
    private static final long POST_SUCCESS_ANIMATION_DELAY = 1500;

    /* compiled from: PaymentSheetScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheetScreen.AnimationStyle.values().length];
            try {
                iArr[PaymentSheetScreen.AnimationStyle.PrimaryButtonAnchored.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheetScreen.AnimationStyle.FullPage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetContent$lambda$34(BaseSheetViewModel baseSheetViewModel, ResolvableString resolvableString, WalletsState walletsState, WalletsProcessingState walletsProcessingState, ResolvableString resolvableString2, PaymentSheetScreen paymentSheetScreen, MandateText mandateText, int i, Composer composer, int i2) {
        PaymentSheetContent(baseSheetViewModel, resolvableString, walletsState, walletsProcessingState, resolvableString2, paymentSheetScreen, mandateText, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetContent$lambda$41(BaseSheetViewModel baseSheetViewModel, ResolvableString resolvableString, WalletsState walletsState, WalletsProcessingState walletsProcessingState, ResolvableString resolvableString2, PaymentSheetScreen paymentSheetScreen, MandateText mandateText, Modifier modifier, int i, Composer composer, int i2) {
        PaymentSheetContent(baseSheetViewModel, resolvableString, walletsState, walletsProcessingState, resolvableString2, paymentSheetScreen, mandateText, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetScreen$lambda$1(PaymentSheetViewModel paymentSheetViewModel, int i, Composer composer, int i2) {
        PaymentSheetScreen(paymentSheetViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetScreen$lambda$12(BaseSheetViewModel baseSheetViewModel, ScrollState scrollState, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        PaymentSheetScreen(baseSheetViewModel, scrollState, z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetScreen$lambda$2(PaymentOptionsViewModel paymentOptionsViewModel, int i, Composer composer, int i2) {
        PaymentSheetScreen(paymentOptionsViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetScreen$lambda$3(BaseSheetViewModel baseSheetViewModel, PaymentSheetFlowType paymentSheetFlowType, int i, Composer composer, int i2) {
        PaymentSheetScreen(baseSheetViewModel, paymentSheetFlowType, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetScreenContent$lambda$24(BaseSheetViewModel baseSheetViewModel, PaymentSheetFlowType paymentSheetFlowType, Modifier modifier, ScrollState scrollState, int i, int i2, Composer composer, int i3) {
        PaymentSheetScreenContent(baseSheetViewModel, paymentSheetFlowType, modifier, scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButton$lambda$58(BaseSheetViewModel baseSheetViewModel, int i, Composer composer, int i2) {
        PrimaryButton(baseSheetViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProgressOverlay$lambda$31(BoxScope boxScope, boolean z, WalletsProcessingState walletsProcessingState, int i, Composer composer, int i2) {
        ProgressOverlay(boxScope, z, walletsProcessingState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProgressOverlayProcessing$lambda$32(int i, Composer composer, int i2) {
        ProgressOverlayProcessing(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResetScroll$lambda$30(ScrollState scrollState, PaymentSheetScreen paymentSheetScreen, int i, Composer composer, int i2) {
        ResetScroll(scrollState, paymentSheetScreen, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Wallet_iHT_50w$lambda$46(WalletsState walletsState, WalletsProcessingState walletsProcessingState, Function0 function0, Function0 function02, float f, Modifier modifier, CardBrandFilter cardBrandFilter, int i, int i2, Composer composer, int i3) {
        m8488WalletiHT50w(walletsState, walletsProcessingState, function0, function02, f, modifier, cardBrandFilter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PaymentSheetScreen(final PaymentSheetViewModel viewModel, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-359505535);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-359505535, i2, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:86)");
            }
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getContentVisible$paymentsheet_release(), null, composerStartRestartGroup, 0, 1);
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            PaymentSheetScreen(viewModel, scrollStateRememberScrollState, PaymentSheetScreen$lambda$0(stateCollectAsState), ComposableLambdaKt.rememberComposableLambda(280630614, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(280630614, i3, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:94)");
                    }
                    PaymentSheetScreenKt.PaymentSheetScreenContent(viewModel, PaymentSheetFlowType.Complete, null, scrollStateRememberScrollState, composer2, 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetScreenKt.PaymentSheetScreen$lambda$1(viewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PaymentSheetScreen(final PaymentOptionsViewModel viewModel, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1055407360);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055407360, i2, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:101)");
            }
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            PaymentSheetScreen(viewModel, scrollStateRememberScrollState, false, ComposableLambdaKt.rememberComposableLambda(2045923221, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2045923221, i3, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:104)");
                    }
                    PaymentSheetScreenKt.PaymentSheetScreenContent(viewModel, PaymentSheetFlowType.Custom, null, scrollStateRememberScrollState, composer2, 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetScreenKt.PaymentSheetScreen$lambda$2(viewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PaymentSheetScreen(final BaseSheetViewModel viewModel, final PaymentSheetFlowType type, Composer composer, final int i) {
        int i2;
        final BaseSheetViewModel baseSheetViewModel;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(type, "type");
        Composer composerStartRestartGroup = composer.startRestartGroup(1306920885);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(type) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306920885, i2, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:112)");
            }
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            baseSheetViewModel = viewModel;
            PaymentSheetScreen(baseSheetViewModel, scrollStateRememberScrollState, false, ComposableLambdaKt.rememberComposableLambda(426397770, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(426397770, i3, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:115)");
                    }
                    PaymentSheetScreenKt.PaymentSheetScreenContent(viewModel, type, null, scrollStateRememberScrollState, composer2, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            baseSheetViewModel = viewModel;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetScreenKt.PaymentSheetScreen$lambda$3(baseSheetViewModel, type, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PaymentSheetScreen(final BaseSheetViewModel baseSheetViewModel, final ScrollState scrollState, boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        ScrollState scrollState2;
        boolean z2;
        final Density density;
        Object objRememberedValue;
        final MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(691576729);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(baseSheetViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            scrollState2 = scrollState;
        } else {
            scrollState2 = scrollState;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(scrollState2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final boolean z4 = i4 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(691576729, i3, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:125)");
                }
                final State stateCollectAsState = StateFlowsComposeKt.collectAsState(baseSheetViewModel.getProcessing(), null, composerStartRestartGroup, 0, 1);
                final State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(baseSheetViewModel.getWalletsProcessingState(), null, composerStartRestartGroup, 0, 1);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                density = (Density) objConsume;
                composerStartRestartGroup.startReplaceGroup(-895264418);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6115boximpl(Dp.m6117constructorimpl(0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                float fM6117constructorimpl = Dp.m6117constructorimpl(PaymentSheetTopBarKt.getPaymentSheetTopBarHeight() + WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6), composerStartRestartGroup, 0).getBottom());
                ComposeUtilsKt.DismissKeyboardOnProcessing(PaymentSheetScreen$lambda$4(stateCollectAsState), composerStartRestartGroup, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-895254764);
                zChanged = composerStartRestartGroup.changed(density);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PaymentSheetScreenKt.PaymentSheetScreen$lambda$11$lambda$10(density, mutableState, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BottomSheetScaffoldKt.BottomSheetScaffold(ComposableLambdaKt.rememberComposableLambda(-407364710, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-407364710, i5, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:145)");
                            }
                            State stateCollectAsState3 = StateFlowsComposeKt.collectAsState(baseSheetViewModel.getNavigationHandler().getCurrentScreen(), null, composer2, 0, 1);
                            PaymentSheetScreen paymentSheetScreenInvoke$lambda$0 = invoke$lambda$0(stateCollectAsState3);
                            composer2.startReplaceGroup(-1096668689);
                            boolean zChanged2 = composer2.changed(paymentSheetScreenInvoke$lambda$0);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = invoke$lambda$0(stateCollectAsState3).topBarState();
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            PaymentSheetTopBarState paymentSheetTopBarStateInvoke$lambda$2 = invoke$lambda$2(StateFlowsComposeKt.collectAsState((StateFlow) objRememberedValue3, null, composer2, 0, 1));
                            boolean canGoBack = baseSheetViewModel.getNavigationHandler().getCanGoBack();
                            boolean z5 = !PaymentSheetScreenKt.PaymentSheetScreen$lambda$4(stateCollectAsState);
                            BaseSheetViewModel baseSheetViewModel2 = baseSheetViewModel;
                            composer2.startReplaceGroup(-1096658472);
                            boolean zChangedInstance = composer2.changedInstance(baseSheetViewModel2);
                            PaymentSheetScreenKt$PaymentSheetScreen$8$1$1 paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue = new PaymentSheetScreenKt$PaymentSheetScreen$8$1$1(baseSheetViewModel2);
                                composer2.updateRememberedValue(paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue);
                            }
                            composer2.endReplaceGroup();
                            PaymentSheetTopBarKt.m8492PaymentSheetTopBarFJfuzF0(paymentSheetTopBarStateInvoke$lambda$2, canGoBack, z5, (Function0) ((KFunction) paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue), 0.0f, composer2, 0, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    private static final PaymentSheetScreen invoke$lambda$0(State<? extends PaymentSheetScreen> state) {
                        return state.getValue();
                    }

                    private static final PaymentSheetTopBarState invoke$lambda$2(State<PaymentSheetTopBarState> state) {
                        return state.getValue();
                    }
                }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-815388325, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-815388325, i5, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:158)");
                            }
                            boolean z5 = z4;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function2<Composer, Integer, Unit> function22 = function2;
                            AnimatedVisibilityKt.AnimatedVisibility(z5, modifierFillMaxWidth$default, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(409471539, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.9.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                    invoke(animatedVisibilityScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i6) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(409471539, i6, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous>.<anonymous> (PaymentSheetScreen.kt:161)");
                                    }
                                    function22.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 196656, 28);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), SizeKt.m1053heightInVpY3zN4$default(OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) objRememberedValue2), fM6117constructorimpl, 0.0f, 2, null), scrollState2, composerStartRestartGroup, ((i3 << 6) & 7168) | 54, 0);
                AnimatedVisibilityKt.AnimatedVisibility(z4 || !(PaymentSheetScreen$lambda$5(stateCollectAsState2) == null || (PaymentSheetScreen$lambda$5(stateCollectAsState2) instanceof WalletsProcessingState.Idle)), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(2038663105, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.10
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2038663105, i5, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:173)");
                        }
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Modifier modifierM575backgroundbw27NRU$default = BackgroundKt.m575backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m1054requiredHeight3ABfNKs(Modifier.INSTANCE, PaymentSheetScreenKt.PaymentSheetScreen$lambda$7(mutableState)), 0.0f, 1, null), Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1837getSurface0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        boolean z5 = z4;
                        State<WalletsProcessingState> state = stateCollectAsState2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM575backgroundbw27NRU$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        PaymentSheetScreenKt.ProgressOverlay(BoxScopeInstance.INSTANCE, z5, PaymentSheetScreenKt.PaymentSheetScreen$lambda$5(state), composer2, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentSheetScreenKt.PaymentSheetScreen$lambda$12(baseSheetViewModel, scrollState, z3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        z2 = z;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final State<Boolean> stateCollectAsState3 = StateFlowsComposeKt.collectAsState(baseSheetViewModel.getProcessing(), null, composerStartRestartGroup, 0, 1);
            final State<? extends WalletsProcessingState> stateCollectAsState22 = StateFlowsComposeKt.collectAsState(baseSheetViewModel.getWalletsProcessingState(), null, composerStartRestartGroup, 0, 1);
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            density = (Density) objConsume2;
            composerStartRestartGroup.startReplaceGroup(-895264418);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            float fM6117constructorimpl2 = Dp.m6117constructorimpl(PaymentSheetTopBarKt.getPaymentSheetTopBarHeight() + WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6), composerStartRestartGroup, 0).getBottom());
            ComposeUtilsKt.DismissKeyboardOnProcessing(PaymentSheetScreen$lambda$4(stateCollectAsState3), composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-895254764);
            zChanged = composerStartRestartGroup.changed(density);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaymentSheetScreenKt.PaymentSheetScreen$lambda$11$lambda$10(density, mutableState, (LayoutCoordinates) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                BottomSheetScaffoldKt.BottomSheetScaffold(ComposableLambdaKt.rememberComposableLambda(-407364710, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-407364710, i5, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:145)");
                            }
                            State stateCollectAsState32 = StateFlowsComposeKt.collectAsState(baseSheetViewModel.getNavigationHandler().getCurrentScreen(), null, composer2, 0, 1);
                            PaymentSheetScreen paymentSheetScreenInvoke$lambda$0 = invoke$lambda$0(stateCollectAsState32);
                            composer2.startReplaceGroup(-1096668689);
                            boolean zChanged2 = composer2.changed(paymentSheetScreenInvoke$lambda$0);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = invoke$lambda$0(stateCollectAsState32).topBarState();
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            PaymentSheetTopBarState paymentSheetTopBarStateInvoke$lambda$2 = invoke$lambda$2(StateFlowsComposeKt.collectAsState((StateFlow) objRememberedValue3, null, composer2, 0, 1));
                            boolean canGoBack = baseSheetViewModel.getNavigationHandler().getCanGoBack();
                            boolean z5 = !PaymentSheetScreenKt.PaymentSheetScreen$lambda$4(stateCollectAsState3);
                            BaseSheetViewModel baseSheetViewModel2 = baseSheetViewModel;
                            composer2.startReplaceGroup(-1096658472);
                            boolean zChangedInstance = composer2.changedInstance(baseSheetViewModel2);
                            PaymentSheetScreenKt$PaymentSheetScreen$8$1$1 paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue = new PaymentSheetScreenKt$PaymentSheetScreen$8$1$1(baseSheetViewModel2);
                                composer2.updateRememberedValue(paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue);
                            }
                            composer2.endReplaceGroup();
                            PaymentSheetTopBarKt.m8492PaymentSheetTopBarFJfuzF0(paymentSheetTopBarStateInvoke$lambda$2, canGoBack, z5, (Function0) ((KFunction) paymentSheetScreenKt$PaymentSheetScreen$8$1$1RememberedValue), 0.0f, composer2, 0, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    private static final PaymentSheetScreen invoke$lambda$0(State<? extends PaymentSheetScreen> state) {
                        return state.getValue();
                    }

                    private static final PaymentSheetTopBarState invoke$lambda$2(State<PaymentSheetTopBarState> state) {
                        return state.getValue();
                    }
                }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-815388325, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-815388325, i5, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:158)");
                            }
                            boolean z5 = z4;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
                            AnimatedVisibilityKt.AnimatedVisibility(z5, modifierFillMaxWidth$default, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(409471539, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.9.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                    invoke(animatedVisibilityScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i6) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(409471539, i6, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous>.<anonymous> (PaymentSheetScreen.kt:161)");
                                    }
                                    function22.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 196656, 28);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), SizeKt.m1053heightInVpY3zN4$default(OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (Function1) objRememberedValue2), fM6117constructorimpl2, 0.0f, 2, null), scrollState2, composerStartRestartGroup, ((i3 << 6) & 7168) | 54, 0);
                if (z4) {
                    AnimatedVisibilityKt.AnimatedVisibility(z4 || !(PaymentSheetScreen$lambda$5(stateCollectAsState22) == null || (PaymentSheetScreen$lambda$5(stateCollectAsState22) instanceof WalletsProcessingState.Idle)), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(2038663105, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.PaymentSheetScreen.10
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2038663105, i5, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:173)");
                            }
                            Alignment center = Alignment.INSTANCE.getCenter();
                            Modifier modifierM575backgroundbw27NRU$default = BackgroundKt.m575backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m1054requiredHeight3ABfNKs(Modifier.INSTANCE, PaymentSheetScreenKt.PaymentSheetScreen$lambda$7(mutableState)), 0.0f, 1, null), Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1837getSurface0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            boolean z5 = z4;
                            State<WalletsProcessingState> state = stateCollectAsState22;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM575backgroundbw27NRU$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            PaymentSheetScreenKt.ProgressOverlay(BoxScopeInstance.INSTANCE, z5, PaymentSheetScreenKt.PaymentSheetScreen$lambda$5(state), composer2, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float PaymentSheetScreen$lambda$7(MutableState<Dp> mutableState) {
        return mutableState.getValue().m6131unboximpl();
    }

    private static final void PaymentSheetScreen$lambda$8(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m6115boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentSheetScreen$lambda$11$lambda$10(Density density, MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PaymentSheetScreen$lambda$8(mutableState, density.mo709toDpu2uoSUM(IntSize.m6286getHeightimpl(it.mo5001getSizeYbymL2g())));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentSheetScreenContent(final BaseSheetViewModel viewModel, final PaymentSheetFlowType type, Modifier modifier, final ScrollState scrollState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        State stateCollectAsState;
        boolean z;
        Object objRememberedValue;
        State stateCollectAsState2;
        WalletsState walletsStatePaymentSheetScreenContent$lambda$13;
        boolean zChanged;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Composer composerStartRestartGroup = composer.startRestartGroup(795731985);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(type) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(scrollState) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(795731985, i3, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreenContent (PaymentSheetScreen.kt:194)");
                }
                State stateCollectAsState3 = StateFlowsComposeKt.collectAsState(viewModel.getWalletsState(), null, composerStartRestartGroup, 0, 1);
                State stateCollectAsState4 = StateFlowsComposeKt.collectAsState(viewModel.getWalletsProcessingState(), null, composerStartRestartGroup, 0, 1);
                State stateCollectAsState5 = StateFlowsComposeKt.collectAsState(viewModel.getError(), null, composerStartRestartGroup, 0, 1);
                State stateCollectAsState6 = StateFlowsComposeKt.collectAsState(viewModel.getMandateHandler().getMandateText(), null, composerStartRestartGroup, 0, 1);
                stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getNavigationHandler().getCurrentScreen(), null, composerStartRestartGroup, 0, 1);
                ResetScroll(scrollState, PaymentSheetScreenContent$lambda$17(stateCollectAsState), composerStartRestartGroup, (i3 >> 9) & 14);
                PaymentSheetScreen paymentSheetScreenPaymentSheetScreenContent$lambda$17 = PaymentSheetScreenContent$lambda$17(stateCollectAsState);
                composerStartRestartGroup.startReplaceGroup(156868589);
                boolean zChanged2 = composerStartRestartGroup.changed(paymentSheetScreenPaymentSheetScreenContent$lambda$17);
                int i5 = i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                z = zChanged2 | (i5 != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = PaymentSheetScreenContent$lambda$17(stateCollectAsState).showsWalletsHeader(type != PaymentSheetFlowType.Complete);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsState2 = StateFlowsComposeKt.collectAsState((StateFlow) objRememberedValue, null, composerStartRestartGroup, 0, 1);
                walletsStatePaymentSheetScreenContent$lambda$13 = PaymentSheetScreenContent$lambda$13(stateCollectAsState3);
                if (!PaymentSheetScreenContent$lambda$19(stateCollectAsState2)) {
                    walletsStatePaymentSheetScreenContent$lambda$13 = null;
                }
                PaymentSheetScreen paymentSheetScreenPaymentSheetScreenContent$lambda$172 = PaymentSheetScreenContent$lambda$17(stateCollectAsState);
                boolean z2 = walletsStatePaymentSheetScreenContent$lambda$13 == null;
                composerStartRestartGroup.startReplaceGroup(156875914);
                zChanged = composerStartRestartGroup.changed(paymentSheetScreenPaymentSheetScreenContent$lambda$172) | (i5 != 32) | composerStartRestartGroup.changed(z2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = PaymentSheetScreenContent$lambda$17(stateCollectAsState).title(type != PaymentSheetFlowType.Complete, walletsStatePaymentSheetScreenContent$lambda$13 == null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                State stateCollectAsState7 = StateFlowsComposeKt.collectAsState((StateFlow) objRememberedValue2, null, composerStartRestartGroup, 0, 1);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i6 = i3;
                WalletsState walletsState = walletsStatePaymentSheetScreenContent$lambda$13;
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
                PaymentSheetContent(viewModel, PaymentSheetScreenContent$lambda$22(stateCollectAsState7), walletsState, PaymentSheetScreenContent$lambda$14(stateCollectAsState4), PaymentSheetScreenContent$lambda$15(stateCollectAsState5), PaymentSheetScreenContent$lambda$17(stateCollectAsState), PaymentSheetScreenContent$lambda$16(stateCollectAsState6), composerStartRestartGroup, (i6 & 14) | (GooglePayJsonFactory.BillingAddressParameters.$stable << 6));
                ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentSheetScreenKt.PaymentSheetScreenContent$lambda$24(viewModel, type, modifier3, scrollState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            State stateCollectAsState32 = StateFlowsComposeKt.collectAsState(viewModel.getWalletsState(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState42 = StateFlowsComposeKt.collectAsState(viewModel.getWalletsProcessingState(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState52 = StateFlowsComposeKt.collectAsState(viewModel.getError(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState62 = StateFlowsComposeKt.collectAsState(viewModel.getMandateHandler().getMandateText(), null, composerStartRestartGroup, 0, 1);
            stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getNavigationHandler().getCurrentScreen(), null, composerStartRestartGroup, 0, 1);
            ResetScroll(scrollState, PaymentSheetScreenContent$lambda$17(stateCollectAsState), composerStartRestartGroup, (i3 >> 9) & 14);
            PaymentSheetScreen paymentSheetScreenPaymentSheetScreenContent$lambda$173 = PaymentSheetScreenContent$lambda$17(stateCollectAsState);
            composerStartRestartGroup.startReplaceGroup(156868589);
            boolean zChanged22 = composerStartRestartGroup.changed(paymentSheetScreenPaymentSheetScreenContent$lambda$173);
            int i52 = i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
            z = zChanged22 | (i52 != 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = PaymentSheetScreenContent$lambda$17(stateCollectAsState).showsWalletsHeader(type != PaymentSheetFlowType.Complete);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsState2 = StateFlowsComposeKt.collectAsState((StateFlow) objRememberedValue, null, composerStartRestartGroup, 0, 1);
                walletsStatePaymentSheetScreenContent$lambda$13 = PaymentSheetScreenContent$lambda$13(stateCollectAsState32);
                if (!PaymentSheetScreenContent$lambda$19(stateCollectAsState2)) {
                }
                PaymentSheetScreen paymentSheetScreenPaymentSheetScreenContent$lambda$1722 = PaymentSheetScreenContent$lambda$17(stateCollectAsState);
                if (walletsStatePaymentSheetScreenContent$lambda$13 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(156875914);
                zChanged = composerStartRestartGroup.changed(paymentSheetScreenPaymentSheetScreenContent$lambda$1722) | (i52 != 32) | composerStartRestartGroup.changed(z2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = PaymentSheetScreenContent$lambda$17(stateCollectAsState).title(type != PaymentSheetFlowType.Complete, walletsStatePaymentSheetScreenContent$lambda$13 == null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    State stateCollectAsState72 = StateFlowsComposeKt.collectAsState((StateFlow) objRememberedValue2, null, composerStartRestartGroup, 0, 1);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i62 = i3;
                    WalletsState walletsState2 = walletsStatePaymentSheetScreenContent$lambda$13;
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
                        PaymentSheetContent(viewModel, PaymentSheetScreenContent$lambda$22(stateCollectAsState72), walletsState2, PaymentSheetScreenContent$lambda$14(stateCollectAsState42), PaymentSheetScreenContent$lambda$15(stateCollectAsState52), PaymentSheetScreenContent$lambda$17(stateCollectAsState), PaymentSheetScreenContent$lambda$16(stateCollectAsState62), composerStartRestartGroup, (i62 & 14) | (GooglePayJsonFactory.BillingAddressParameters.$stable << 6));
                        ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(0.0f, composerStartRestartGroup, 0, 1);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ResetScroll(final ScrollState scrollState, final PaymentSheetScreen paymentSheetScreen, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1456827536);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(paymentSheetScreen) : composerStartRestartGroup.changedInstance(paymentSheetScreen) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1456827536, i2, -1, "com.stripe.android.paymentsheet.ui.ResetScroll (PaymentSheetScreen.kt:229)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(406195526);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentSheetScreenKt.ResetScroll$lambda$26$lambda$25();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            String name = paymentSheetScreen.getClass().getName();
            if (!Intrinsics.areEqual(name, ResetScroll$lambda$27(mutableState))) {
                mutableState.setValue(name);
                composerStartRestartGroup.startReplaceGroup(406203379);
                boolean z = (i2 & 14) == 4;
                PaymentSheetScreenKt$ResetScroll$1$1 paymentSheetScreenKt$ResetScroll$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || paymentSheetScreenKt$ResetScroll$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    paymentSheetScreenKt$ResetScroll$1$1RememberedValue = new PaymentSheetScreenKt$ResetScroll$1$1(scrollState, null);
                    composerStartRestartGroup.updateRememberedValue(paymentSheetScreenKt$ResetScroll$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(paymentSheetScreen, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) paymentSheetScreenKt$ResetScroll$1$1RememberedValue, composerStartRestartGroup, (i2 >> 3) & 14);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetScreenKt.ResetScroll$lambda$30(scrollState, paymentSheetScreen, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String ResetScroll$lambda$27(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState ResetScroll$lambda$26$lambda$25() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProgressOverlay(final BoxScope boxScope, final boolean z, WalletsProcessingState walletsProcessingState, Composer composer, final int i) {
        int i2;
        final WalletsProcessingState walletsProcessingState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2128213715);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(walletsProcessingState) : composerStartRestartGroup.changedInstance(walletsProcessingState) ? 256 : 128;
        }
        if ((i2 & 145) != 144 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2128213715, i2, -1, "com.stripe.android.paymentsheet.ui.ProgressOverlay (PaymentSheetScreen.kt:247)");
            }
            walletsProcessingState2 = walletsProcessingState;
            AnimatedContentKt.AnimatedContent(walletsProcessingState2, null, null, null, "AnimatedProcessingState", null, ComposableLambdaKt.rememberComposableLambda(-1139061802, true, new Function4<AnimatedContentScope, WalletsProcessingState, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt.ProgressOverlay.1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, WalletsProcessingState walletsProcessingState3, Composer composer2, Integer num) {
                    invoke(animatedContentScope, walletsProcessingState3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, WalletsProcessingState walletsProcessingState3, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1139061802, i3, -1, "com.stripe.android.paymentsheet.ui.ProgressOverlay.<anonymous> (PaymentSheetScreen.kt:252)");
                    }
                    composer2.startReplaceGroup(-426985739);
                    if (!z) {
                        PaymentSheetScreenKt.ProgressOverlayProcessing(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return;
                    }
                    composer2.endReplaceGroup();
                    if (walletsProcessingState3 instanceof WalletsProcessingState.Processing) {
                        composer2.startReplaceGroup(-351466051);
                        PaymentSheetScreenKt.ProgressOverlayProcessing(composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (walletsProcessingState3 instanceof WalletsProcessingState.Completed) {
                        composer2.startReplaceGroup(-351341896);
                        composer2.startReplaceGroup(-426974394);
                        boolean z2 = (((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32 && composer2.changedInstance(walletsProcessingState3)) || (i3 & 48) == 32;
                        PaymentSheetScreenKt$ProgressOverlay$1$1$1 paymentSheetScreenKt$ProgressOverlay$1$1$1RememberedValue = composer2.rememberedValue();
                        if (z2 || paymentSheetScreenKt$ProgressOverlay$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            paymentSheetScreenKt$ProgressOverlay$1$1$1RememberedValue = new PaymentSheetScreenKt$ProgressOverlay$1$1$1(walletsProcessingState3, null);
                            composer2.updateRememberedValue(paymentSheetScreenKt$ProgressOverlay$1$1$1RememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(walletsProcessingState3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) paymentSheetScreenKt$ProgressOverlay$1$1$1RememberedValue, composer2, 0);
                        IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_paymentsheet_googlepay_primary_button_checkmark, composer2, 0), (String) null, SizeKt.m1057requiredSize3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(48)), MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1832getOnSurface0d7_KjU(), composer2, 432, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (walletsProcessingState3 != null && !(walletsProcessingState3 instanceof WalletsProcessingState.Idle)) {
                            composer2.startReplaceGroup(-426981355);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-426957650);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 1597440, 46);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            walletsProcessingState2 = walletsProcessingState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetScreenKt.ProgressOverlay$lambda$31(boxScope, z, walletsProcessingState2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProgressOverlayProcessing(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-16147465);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-16147465, i, -1, "com.stripe.android.paymentsheet.ui.ProgressOverlayProcessing (PaymentSheetScreen.kt:280)");
            }
            CircularProgressIndicatorKt.m8618CircularProgressIndicatorLxG7B9w(SizeKt.m1057requiredSize3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(48)), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1832getOnSurface0d7_KjU(), PrimitiveResources_androidKt.dimensionResource(R.dimen.stripe_paymentsheet_loading_indicator_stroke_width, composerStartRestartGroup, 0), 0L, 0, composerStartRestartGroup, 6, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetScreenKt.ProgressOverlayProcessing$lambda$32(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PaymentSheetContent(final BaseSheetViewModel baseSheetViewModel, final ResolvableString resolvableString, final WalletsState walletsState, final WalletsProcessingState walletsProcessingState, final ResolvableString resolvableString2, final PaymentSheetScreen paymentSheetScreen, final MandateText mandateText, Composer composer, final int i) {
        BaseSheetViewModel baseSheetViewModel2;
        int i2;
        ResolvableString resolvableString3;
        MandateText mandateText2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-131118148);
        if ((i & 6) == 0) {
            baseSheetViewModel2 = baseSheetViewModel;
            i2 = (composerStartRestartGroup.changedInstance(baseSheetViewModel2) ? 4 : 2) | i;
        } else {
            baseSheetViewModel2 = baseSheetViewModel;
            i2 = i;
        }
        if ((i & 48) == 0) {
            resolvableString3 = resolvableString;
            i2 |= composerStartRestartGroup.changedInstance(resolvableString3) ? 32 : 16;
        } else {
            resolvableString3 = resolvableString;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(walletsState) : composerStartRestartGroup.changedInstance(walletsState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(walletsProcessingState) : composerStartRestartGroup.changedInstance(walletsProcessingState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(resolvableString2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(paymentSheetScreen) : composerStartRestartGroup.changedInstance(paymentSheetScreen) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            mandateText2 = mandateText;
            i2 |= composerStartRestartGroup.changedInstance(mandateText2) ? 1048576 : 524288;
        } else {
            mandateText2 = mandateText;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-131118148, i2, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent (PaymentSheetScreen.kt:297)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[paymentSheetScreen.getAnimationStyle().ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(-829387535);
                PaymentSheetContent$Content(baseSheetViewModel, resolvableString, walletsState, walletsProcessingState, resolvableString2, paymentSheetScreen, mandateText, AnimationModifierKt.animateContentSize$default(Modifier.INSTANCE, null, null, 3, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    composerStartRestartGroup.startReplaceGroup(1774357820);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-829258699);
                Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(Modifier.INSTANCE, null, null, 3, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
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
                PaymentSheetContent$Content(baseSheetViewModel2, resolvableString3, walletsState, walletsProcessingState, resolvableString2, paymentSheetScreen, mandateText2, Modifier.INSTANCE, composerStartRestartGroup, 6);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetScreenKt.PaymentSheetContent$lambda$34(baseSheetViewModel, resolvableString, walletsState, walletsProcessingState, resolvableString2, paymentSheetScreen, mandateText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PaymentSheetContent$Content(BaseSheetViewModel baseSheetViewModel, ResolvableString resolvableString, WalletsState walletsState, WalletsProcessingState walletsProcessingState, ResolvableString resolvableString2, PaymentSheetScreen paymentSheetScreen, MandateText mandateText, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-480887246);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-480887246, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent.Content (PaymentSheetScreen.kt:299)");
        }
        PaymentSheetContent(baseSheetViewModel, resolvableString, walletsState, walletsProcessingState, resolvableString2, paymentSheetScreen, mandateText, modifier, composer, (GooglePayJsonFactory.BillingAddressParameters.$stable << 6) | ((i << 21) & 29360128));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    private static final void PaymentSheetContent(final BaseSheetViewModel baseSheetViewModel, final ResolvableString resolvableString, final WalletsState walletsState, final WalletsProcessingState walletsProcessingState, final ResolvableString resolvableString2, final PaymentSheetScreen paymentSheetScreen, final MandateText mandateText, Modifier modifier, Composer composer, final int i) {
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        Composer composer2;
        int i3;
        final Modifier modifier2 = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1193301967);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(baseSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(resolvableString) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(walletsState) : composerStartRestartGroup.changedInstance(walletsState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(walletsProcessingState) : composerStartRestartGroup.changedInstance(walletsProcessingState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(resolvableString2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(paymentSheetScreen) : composerStartRestartGroup.changedInstance(paymentSheetScreen) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(mandateText) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1193301967, i2, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent (PaymentSheetScreen.kt:334)");
            }
            PaddingValues outerFormInsets = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
            int i4 = i2;
            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, paymentSheetScreen.getBottomContentPadding(), 7, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1024paddingqDBjuR0$default);
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
            composerStartRestartGroup.startReplaceGroup(994803625);
            if (resolvableString != null) {
                H4TextKt.H4Text(ResolvableStringComposeUtilsKt.resolve(resolvableString, composerStartRestartGroup, 0), PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(16), 7, null), outerFormInsets), composerStartRestartGroup, 0, 0);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(994812003);
            if (walletsState == null) {
                str = "C88@4444L9:Column.kt#2w3rfo";
                str4 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str3 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                composer2 = composerStartRestartGroup;
                i3 = -483455358;
            } else {
                str = "C88@4444L9:Column.kt#2w3rfo";
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str3 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str4 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                composer2 = composerStartRestartGroup;
                i3 = -483455358;
                m8488WalletiHT50w(walletsState, walletsProcessingState, walletsState.getOnGooglePayPressed(), walletsState.getOnLinkPressed(), paymentSheetScreen.getWalletsDividerSpacing(), PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(paymentSheetScreen.getWalletsDividerSpacing() - paymentSheetScreen.getTopContentPadding()), 7, null), new PaymentSheetCardBrandFilter(baseSheetViewModel.getConfig().getCardBrandAcceptance$paymentsheet_release()), composer2, GooglePayJsonFactory.BillingAddressParameters.$stable | ((i4 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 0);
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer2, i3, str4);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            String str5 = str3;
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str5);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            String str6 = str2;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str6);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer2);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, str);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            EventReporterProviderUtilKt.EventReporterProvider(baseSheetViewModel.getEventReporter(), ComposableLambdaKt.rememberComposableLambda(-134733669, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$PaymentSheetContent$3$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-134733669, i5, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetContent.<anonymous>.<anonymous>.<anonymous> (PaymentSheetScreen.kt:361)");
                        }
                        paymentSheetScreen.Content(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(8), 7, null), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer2, 54), composer2, 48);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.startReplaceGroup(994839766);
            if ((mandateText != null && mandateText.getShowAbovePrimaryButton()) && paymentSheetScreen.getShowsPaymentConfirmationMandates()) {
                ResolvableString text = mandateText.getText();
                composer2.startReplaceGroup(994844816);
                String strResolve = text == null ? null : ResolvableStringComposeUtilsKt.resolve(text, composer2, 0);
                composer2.endReplaceGroup();
                MandateTextUIKt.m8662MandateJ7GKdg(strResolve, TestTagKt.testTag(PaddingKt.m1024paddingqDBjuR0$default(PaddingKt.padding(Modifier.INSTANCE, outerFormInsets), 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(8), 7, null), PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG), 0, 0, null, composer2, 0, 28);
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(994852977);
            if (resolvableString2 != null) {
                ErrorMessageKt.ErrorMessage(ResolvableStringComposeUtilsKt.resolve(resolvableString2, composer2, 0), TestTagKt.testTag(PaddingKt.m1024paddingqDBjuR0$default(PaddingKt.padding(Modifier.INSTANCE, outerFormInsets), 0.0f, Dp.m6117constructorimpl(2), 0.0f, Dp.m6117constructorimpl(8), 5, null), PAYMENT_SHEET_ERROR_TEXT_TEST_TAG), composer2, 0, 0);
                Unit unit5 = Unit.INSTANCE;
                Unit unit6 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            PrimaryButton(baseSheetViewModel, composer2, i4 & 14);
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str5);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            modifier2 = modifier;
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str6);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composer2);
            Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceGroup(994865076);
            if (((mandateText == null || mandateText.getShowAbovePrimaryButton()) ? false : true) && paymentSheetScreen.getShowsPaymentConfirmationMandates()) {
                ResolvableString text2 = mandateText.getText();
                composer2.startReplaceGroup(994870160);
                String strResolve2 = text2 == null ? null : ResolvableStringComposeUtilsKt.resolve(text2, composer2, 0);
                composer2.endReplaceGroup();
                MandateTextUIKt.m8662MandateJ7GKdg(strResolve2, TestTagKt.testTag(PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), outerFormInsets), PAYMENT_SHEET_MANDATE_TEXT_TEST_TAG), 0, 0, null, composer2, 0, 28);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetScreenKt.PaymentSheetContent$lambda$41(baseSheetViewModel, resolvableString, walletsState, walletsProcessingState, resolvableString2, paymentSheetScreen, mandateText, modifier2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016b  */
    /* renamed from: Wallet-iHT-50w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8488WalletiHT50w(final WalletsState state, final WalletsProcessingState walletsProcessingState, final Function0<Unit> onGooglePayPressed, final Function0<Unit> onLinkPressed, final float f, Modifier modifier, final CardBrandFilter cardBrandFilter, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        WalletsState.GooglePay googlePay;
        int i4;
        int i5;
        Modifier modifier3;
        Composer composer2;
        WalletsState.Link link;
        int i6;
        ResolvableString error;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onGooglePayPressed, "onGooglePayPressed");
        Intrinsics.checkNotNullParameter(onLinkPressed, "onLinkPressed");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1305835463);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(walletsProcessingState) : composerStartRestartGroup.changedInstance(walletsProcessingState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGooglePayPressed) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLinkPressed) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(cardBrandFilter) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1305835463, i3, -1, "com.stripe.android.paymentsheet.ui.Wallet (PaymentSheetScreen.kt:412)");
                }
                Modifier modifierPadding = PaddingKt.padding(companion, StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
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
                googlePay = state.getGooglePay();
                composerStartRestartGroup.startReplaceGroup(1315079647);
                if (googlePay != null) {
                    i5 = 6;
                    i4 = i3;
                    modifier3 = companion;
                } else {
                    int i8 = i3;
                    i4 = i8;
                    i5 = 6;
                    modifier3 = companion;
                    GooglePayButtonKt.GooglePayButton(PrimaryButton.State.Ready.INSTANCE, googlePay.getAllowCreditCards(), googlePay.getButtonType(), googlePay.getBillingAddressParameters(), state.getButtonsEnabled(), onGooglePayPressed, null, cardBrandFilter, composerStartRestartGroup, (GooglePayJsonFactory.BillingAddressParameters.$stable << 9) | 6 | ((i8 << 9) & 458752) | ((i8 << 3) & 29360128), 64);
                }
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                link = state.getLink();
                composer2.startReplaceGroup(1315095003);
                if (link != null) {
                    composer2.startReplaceGroup(1315095389);
                    if (state.getGooglePay() != null) {
                        SpacerKt.Spacer(SizeKt.m1054requiredHeight3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(8)), composer2, i5);
                    }
                    composer2.endReplaceGroup();
                    LinkButtonKt.LinkButton(link.getState(), state.getButtonsEnabled(), onLinkPressed, null, composer2, (i4 >> 3) & 896, 8);
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1315104927);
                if ((walletsProcessingState instanceof WalletsProcessingState.Idle) || (error = ((WalletsProcessingState.Idle) walletsProcessingState).getError()) == null) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    ErrorMessageKt.ErrorMessage(ResolvableStringComposeUtilsKt.resolve(error, composer2, 0), PaddingKt.m1021paddingVpY3zN4(Modifier.INSTANCE, Dp.m6117constructorimpl(1), Dp.m6117constructorimpl(3)), composer2, 0, 0);
                }
                composer2.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m1054requiredHeight3ABfNKs(Modifier.INSTANCE, f), composer2, i6);
                WalletsDividerKt.WalletsDivider(StringResources_androidKt.stringResource(state.getDividerTextResource(), composer2, i6), composer2, i6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentSheetScreenKt.Wallet_iHT_50w$lambda$46(state, walletsProcessingState, onGooglePayPressed, onLinkPressed, f, modifier2, cardBrandFilter, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        modifier2 = modifier;
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) == 599186) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierPadding2 = PaddingKt.padding(companion, StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding2);
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
                googlePay = state.getGooglePay();
                composerStartRestartGroup.startReplaceGroup(1315079647);
                if (googlePay != null) {
                }
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                link = state.getLink();
                composer2.startReplaceGroup(1315095003);
                if (link != null) {
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1315104927);
                if (walletsProcessingState instanceof WalletsProcessingState.Idle) {
                    i6 = 0;
                    composer2.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m1054requiredHeight3ABfNKs(Modifier.INSTANCE, f), composer2, i6);
                    WalletsDividerKt.WalletsDivider(StringResources_androidKt.stringResource(state.getDividerTextResource(), composer2, i6), composer2, i6);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void PrimaryButton(final BaseSheetViewModel baseSheetViewModel, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1533976193);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(baseSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1533976193, i2, -1, "com.stripe.android.paymentsheet.ui.PrimaryButton (PaymentSheetScreen.kt:458)");
            }
            final State stateCollectAsState = StateFlowsComposeKt.collectAsState(baseSheetViewModel.getPrimaryButtonUiState(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierTestTag = TestTagKt.testTag(PaddingKt.padding(Modifier.INSTANCE, StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE)), PAYMENT_SHEET_PRIMARY_BUTTON_TEST_TAG);
            composerStartRestartGroup.startReplaceGroup(-1702305316);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaymentSheetScreenKt.PrimaryButton$lambda$49$lambda$48(stateCollectAsState, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1702300647);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(-1702295424);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseSheetViewModel) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function3() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return PaymentSheetScreenKt.PrimaryButton$lambda$54$lambda$53(baseSheetViewModel, context, mutableState, (LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function3 function3 = (Function3) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1702274798);
            boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaymentSheetScreenKt.PrimaryButton$lambda$56$lambda$55(mutableState, stateCollectAsState, (StripeFragmentPrimaryButtonContainerBinding) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidViewBindingKt.AndroidViewBinding(function3, modifierSemantics$default, (Function1) objRememberedValue4, composerStartRestartGroup, 0, 0);
            PrimaryButton primaryButtonPrimaryButton$lambda$51 = PrimaryButton$lambda$51(mutableState);
            composerStartRestartGroup.startReplaceGroup(-1702270543);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseSheetViewModel);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = (Function2) new PaymentSheetScreenKt$PrimaryButton$3$1(baseSheetViewModel, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(baseSheetViewModel, primaryButtonPrimaryButton$lambda$51, (Function2) objRememberedValue5, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentSheetScreenKt.PrimaryButton$lambda$58(baseSheetViewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButton$lambda$49$lambda$48(State state, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m5431setRolekuIjeqM(semantics, Role.INSTANCE.m5412getButtono7Vup1c());
        PrimaryButton.UIState uIStatePrimaryButton$lambda$47 = PrimaryButton$lambda$47(state);
        if (uIStatePrimaryButton$lambda$47 == null || !uIStatePrimaryButton$lambda$47.getEnabled()) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrimaryButton PrimaryButton$lambda$51(MutableState<PrimaryButton> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeFragmentPrimaryButtonContainerBinding PrimaryButton$lambda$54$lambda$53(BaseSheetViewModel baseSheetViewModel, Context context, MutableState mutableState, LayoutInflater inflater, ViewGroup parent, boolean z) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        StripeFragmentPrimaryButtonContainerBinding stripeFragmentPrimaryButtonContainerBindingInflate = StripeFragmentPrimaryButtonContainerBinding.inflate(inflater, parent, z);
        Intrinsics.checkNotNullExpressionValue(stripeFragmentPrimaryButtonContainerBindingInflate, "inflate(...)");
        PrimaryButton primaryButton = stripeFragmentPrimaryButtonContainerBindingInflate.primaryButton;
        Intrinsics.checkNotNullExpressionValue(primaryButton, "primaryButton");
        mutableState.setValue(primaryButton);
        PrimaryButtonStyle primaryButtonStyle = StripeTheme.INSTANCE.getPrimaryButtonStyle();
        ColorStateList primaryButtonColor = baseSheetViewModel.getConfig().getPrimaryButtonColor();
        if (primaryButtonColor == null) {
            primaryButtonColor = ColorStateList.valueOf(StripeThemeKt.getBackgroundColor(StripeTheme.INSTANCE.getPrimaryButtonStyle(), context));
            Intrinsics.checkNotNullExpressionValue(primaryButtonColor, "valueOf(...)");
        }
        primaryButton.setAppearanceConfiguration(primaryButtonStyle, primaryButtonColor);
        return stripeFragmentPrimaryButtonContainerBindingInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButton$lambda$56$lambda$55(MutableState mutableState, State state, StripeFragmentPrimaryButtonContainerBinding AndroidViewBinding) {
        Intrinsics.checkNotNullParameter(AndroidViewBinding, "$this$AndroidViewBinding");
        PrimaryButton primaryButtonPrimaryButton$lambda$51 = PrimaryButton$lambda$51(mutableState);
        if (primaryButtonPrimaryButton$lambda$51 != null) {
            primaryButtonPrimaryButton$lambda$51.updateUiState(PrimaryButton$lambda$47(state));
        }
        return Unit.INSTANCE;
    }

    public static final PrimaryButton.State convert(PaymentSheetViewState paymentSheetViewState) {
        Intrinsics.checkNotNullParameter(paymentSheetViewState, "<this>");
        if (paymentSheetViewState instanceof PaymentSheetViewState.Reset) {
            return PrimaryButton.State.Ready.INSTANCE;
        }
        if (paymentSheetViewState instanceof PaymentSheetViewState.StartProcessing) {
            return PrimaryButton.State.StartProcessing.INSTANCE;
        }
        if (!(paymentSheetViewState instanceof PaymentSheetViewState.FinishProcessing)) {
            throw new NoWhenBranchMatchedException();
        }
        return new PrimaryButton.State.FinishProcessing(((PaymentSheetViewState.FinishProcessing) paymentSheetViewState).getOnComplete());
    }

    private static final boolean PaymentSheetScreen$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PaymentSheetScreen$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletsProcessingState PaymentSheetScreen$lambda$5(State<? extends WalletsProcessingState> state) {
        return state.getValue();
    }

    private static final WalletsState PaymentSheetScreenContent$lambda$13(State<WalletsState> state) {
        return state.getValue();
    }

    private static final WalletsProcessingState PaymentSheetScreenContent$lambda$14(State<? extends WalletsProcessingState> state) {
        return state.getValue();
    }

    private static final ResolvableString PaymentSheetScreenContent$lambda$15(State<? extends ResolvableString> state) {
        return state.getValue();
    }

    private static final MandateText PaymentSheetScreenContent$lambda$16(State<MandateText> state) {
        return state.getValue();
    }

    private static final PaymentSheetScreen PaymentSheetScreenContent$lambda$17(State<? extends PaymentSheetScreen> state) {
        return state.getValue();
    }

    private static final boolean PaymentSheetScreenContent$lambda$19(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final ResolvableString PaymentSheetScreenContent$lambda$22(State<? extends ResolvableString> state) {
        return state.getValue();
    }

    private static final PrimaryButton.UIState PrimaryButton$lambda$47(State<PrimaryButton.UIState> state) {
        return state.getValue();
    }
}
