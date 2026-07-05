package com.stripe.android.paymentsheet.ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
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
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentOptionsItemKt;
import com.stripe.android.paymentsheet.PaymentOptionsStateFactoryKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt;
import com.stripe.android.paymentsheet.ui.SelectSavedPaymentMethodsInteractor;
import com.stripe.android.ui.core.elements.CvcController;
import com.stripe.android.ui.core.elements.CvcElement;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionUIKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SavedPaymentMethodTabLayoutUI.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"\u001ay\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b(\u0010)\u001a7\u0010*\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b+\u0010,\u001aG\u0010-\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b.\u0010/\u001aG\u00100\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b1\u0010/\u001ak\u0010#\u001a\u00020\u00012\u0006\u00102\u001a\u0002032\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00010\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b4\u00105\u001a7\u00106\u001a\u00020\u00012\f\u00107\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;H\u0001¢\u0006\u0002\u0010=\u001a\b\u0010>\u001a\u00020?H\u0002\"\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010@\u001a\u00020A8\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u0010B\u001a\u00020A8\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020;X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020;X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020;X\u0082T¢\u0006\u0002\n\u0000¨\u0006F²\u0006\n\u0010G\u001a\u00020HX\u008a\u0084\u0002²\u0006\n\u0010I\u001a\u000209X\u008a\u0084\u0002²\u0006\f\u0010J\u001a\u0004\u0018\u00010KX\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"SavedPaymentMethodTabLayoutUI", "", "interactor", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor;", "cvcRecollectionState", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods$CvcRecollectionState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods$CvcRecollectionState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "paymentOptionsItems", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "selectedPaymentOptionsItem", "isEditing", "", "isProcessing", "onAddCardPressed", "Lkotlin/Function0;", "onItemSelected", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "onModifyItem", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "scrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V", "PREVIEW_PAYMENT_OPTION_ITEMS", "SavedPaymentMethodsTabLayoutPreview", "(Landroidx/compose/runtime/Composer;I)V", "SavedPaymentMethodsTabLayoutWithDefaultPreview", "rememberItemWidth", "Landroidx/compose/ui/unit/Dp;", ViewProps.MAX_WIDTH, "rememberItemWidth-8Feqmps", "(FLandroidx/compose/runtime/Composer;I)F", "SavedPaymentMethodTab", "item", "width", "isEnabled", "isSelected", "SavedPaymentMethodTab-iWtaglI", "(Lcom/stripe/android/paymentsheet/PaymentOptionsItem;FZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddCardTab", "AddCardTab-AjpBEmI", "(FZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GooglePayTab", "GooglePayTab-PBTpf3Q", "(FZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LinkTab", "LinkTab-PBTpf3Q", "paymentMethod", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;", "SavedPaymentMethodTab-Uww-Ezs", "(Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;FZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CvcRecollectionField", "cvcControllerFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/ui/core/elements/CvcController;", "animationDuration", "", "animationDelay", "(Lkotlinx/coroutines/flow/StateFlow;ZIILandroidx/compose/runtime/Composer;II)V", "getSavedPaymentMethodTabLayoutPaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "SAVED_PAYMENT_OPTION_TAB_LAYOUT_TEST_TAG", "", "SAVED_PAYMENT_OPTION_TEST_TAG", "ANIMATION_DELAY", "ANIMATION_DURATION", "TAB_LAYOUT_EXTRA_PADDING", "paymentsheet_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;", "controller", "error", "Lcom/stripe/android/uicore/elements/FieldError;", ViewProps.VISIBLE}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavedPaymentMethodTabLayoutUIKt {
    private static final int ANIMATION_DELAY = 400;
    private static final int ANIMATION_DURATION = 500;
    private static final List<PaymentOptionsItem> PREVIEW_PAYMENT_OPTION_ITEMS = CollectionsKt.listOf((Object[]) new PaymentOptionsItem[]{PaymentOptionsItem.AddCard.INSTANCE, PaymentOptionsItem.Link.INSTANCE, PaymentOptionsItem.GooglePay.INSTANCE, new PaymentOptionsItem.SavedPaymentMethod(DisplayableSavedPaymentMethod.Companion.create$default(DisplayableSavedPaymentMethod.INSTANCE, ResolvableStringUtilsKt.getResolvableString("4242"), new PaymentMethod("001", null, false, PaymentMethod.Type.Card.code, PaymentMethod.Type.Card, null, null, new PaymentMethod.Card(CardBrand.Visa, null, null, null, null, null, null, "4242", null, null, null, null, 3966, null), null, null, null, null, null, null, null, null, null, null, null, false, null, 2096992, null), false, true, 4, null)), new PaymentOptionsItem.SavedPaymentMethod(DisplayableSavedPaymentMethod.Companion.create$default(DisplayableSavedPaymentMethod.INSTANCE, ResolvableStringUtilsKt.getResolvableString("4242"), new PaymentMethod("002", null, false, PaymentMethod.Type.SepaDebit.code, PaymentMethod.Type.SepaDebit, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 2097120, null), false, false, 12, null)), new PaymentOptionsItem.SavedPaymentMethod(DisplayableSavedPaymentMethod.Companion.create$default(DisplayableSavedPaymentMethod.INSTANCE, ResolvableStringUtilsKt.getResolvableString("5555"), new PaymentMethod("003", null, false, PaymentMethod.Type.Card.code, PaymentMethod.Type.Card, null, null, new PaymentMethod.Card(CardBrand.MasterCard, null, null, null, null, null, null, "4242", null, null, null, null, 3966, null), null, null, null, null, null, null, null, null, null, null, null, false, null, 2096992, null), false, false, 12, null))});
    public static final String SAVED_PAYMENT_OPTION_TAB_LAYOUT_TEST_TAG = "PaymentSheetSavedPaymentOptionTabLayout";
    public static final String SAVED_PAYMENT_OPTION_TEST_TAG = "PaymentSheetSavedPaymentOption";
    private static final int TAB_LAYOUT_EXTRA_PADDING = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddCardTab_AjpBEmI$lambda$15(float f, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m8545AddCardTabAjpBEmI(f, z, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CvcRecollectionField$lambda$40$lambda$39(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CvcRecollectionField$lambda$41(StateFlow stateFlow, boolean z, int i, int i2, int i3, int i4, Composer composer, int i5) {
        CvcRecollectionField(stateFlow, z, i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GooglePayTab_PBTpf3Q$lambda$18(float f, boolean z, boolean z2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m8546GooglePayTabPBTpf3Q(f, z, z2, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkTab_PBTpf3Q$lambda$21(float f, boolean z, boolean z2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m8547LinkTabPBTpf3Q(f, z, z2, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTabLayoutUI$lambda$10(List list, PaymentOptionsItem paymentOptionsItem, boolean z, boolean z2, Function0 function0, Function1 function1, Function1 function12, Modifier modifier, LazyListState lazyListState, int i, int i2, Composer composer, int i3) {
        SavedPaymentMethodTabLayoutUI(list, paymentOptionsItem, z, z2, function0, function1, function12, modifier, lazyListState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTabLayoutUI$lambda$7(SelectSavedPaymentMethodsInteractor selectSavedPaymentMethodsInteractor, PaymentSheetScreen.SelectSavedPaymentMethods.CvcRecollectionState cvcRecollectionState, Modifier modifier, int i, Composer composer, int i2) {
        SavedPaymentMethodTabLayoutUI(selectSavedPaymentMethodsInteractor, cvcRecollectionState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTab_Uww_Ezs$lambda$22(PaymentOptionsItem.SavedPaymentMethod savedPaymentMethod, float f, boolean z, boolean z2, boolean z3, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m8548SavedPaymentMethodTabUwwEzs(savedPaymentMethod, f, z, z2, z3, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTab_Uww_Ezs$lambda$30(PaymentOptionsItem.SavedPaymentMethod savedPaymentMethod, float f, boolean z, boolean z2, boolean z3, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m8548SavedPaymentMethodTabUwwEzs(savedPaymentMethod, f, z, z2, z3, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTab_iWtaglI$lambda$14(PaymentOptionsItem paymentOptionsItem, float f, boolean z, boolean z2, boolean z3, Function0 function0, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m8549SavedPaymentMethodTabiWtaglI(paymentOptionsItem, f, z, z2, z3, function0, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodsTabLayoutPreview$lambda$11(int i, Composer composer, int i2) {
        SavedPaymentMethodsTabLayoutPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodsTabLayoutWithDefaultPreview$lambda$12(int i, Composer composer, int i2) {
        SavedPaymentMethodsTabLayoutWithDefaultPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SavedPaymentMethodTabLayoutUI(final SelectSavedPaymentMethodsInteractor interactor, final PaymentSheetScreen.SelectSavedPaymentMethods.CvcRecollectionState cvcRecollectionState, Modifier modifier, Composer composer, final int i) {
        int i2;
        final Modifier modifier2;
        PaymentMethod paymentMethod;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(cvcRecollectionState, "cvcRecollectionState");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1088084493);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(interactor) : composerStartRestartGroup.changedInstance(interactor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(cvcRecollectionState) : composerStartRestartGroup.changedInstance(cvcRecollectionState) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1088084493, i2, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI (SavedPaymentMethodTabLayoutUI.kt:78)");
            }
            PaymentMethod.Type type = null;
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(interactor.getState(), null, composerStartRestartGroup, 0, 1);
            List<PaymentOptionsItem> paymentOptionsItems = SavedPaymentMethodTabLayoutUI$lambda$0(stateCollectAsState).getPaymentOptionsItems();
            PaymentOptionsItem selectedPaymentOptionsItem = SavedPaymentMethodTabLayoutUI$lambda$0(stateCollectAsState).getSelectedPaymentOptionsItem();
            boolean zIsEditing = SavedPaymentMethodTabLayoutUI$lambda$0(stateCollectAsState).isEditing();
            boolean zIsProcessing = SavedPaymentMethodTabLayoutUI$lambda$0(stateCollectAsState).isProcessing();
            composerStartRestartGroup.startReplaceGroup(-1057317685);
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTabLayoutUI$lambda$2$lambda$1(interactor);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1057312166);
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTabLayoutUI$lambda$4$lambda$3(interactor, (PaymentSelection) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1057305294);
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(interactor));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTabLayoutUI$lambda$6$lambda$5(interactor, (DisplayableSavedPaymentMethod) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            SavedPaymentMethodTabLayoutUI(paymentOptionsItems, selectedPaymentOptionsItem, zIsEditing, zIsProcessing, function0, function1, (Function1) objRememberedValue3, modifier, null, composerStartRestartGroup, 29360128 & (i2 << 15), 256);
            modifier2 = modifier;
            if (cvcRecollectionState instanceof PaymentSheetScreen.SelectSavedPaymentMethods.CvcRecollectionState.Required) {
                PaymentOptionsItem selectedPaymentOptionsItem2 = SavedPaymentMethodTabLayoutUI$lambda$0(stateCollectAsState).getSelectedPaymentOptionsItem();
                PaymentOptionsItem.SavedPaymentMethod savedPaymentMethod = selectedPaymentOptionsItem2 instanceof PaymentOptionsItem.SavedPaymentMethod ? (PaymentOptionsItem.SavedPaymentMethod) selectedPaymentOptionsItem2 : null;
                if (savedPaymentMethod != null && (paymentMethod = savedPaymentMethod.getPaymentMethod()) != null) {
                    type = paymentMethod.type;
                }
                if (type == PaymentMethod.Type.Card) {
                    CvcRecollectionField(((PaymentSheetScreen.SelectSavedPaymentMethods.CvcRecollectionState.Required) cvcRecollectionState).getCvcControllerFlow(), SavedPaymentMethodTabLayoutUI$lambda$0(stateCollectAsState).isProcessing(), 0, 0, composerStartRestartGroup, 0, 12);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTabLayoutUI$lambda$7(interactor, cvcRecollectionState, modifier2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTabLayoutUI$lambda$2$lambda$1(SelectSavedPaymentMethodsInteractor selectSavedPaymentMethodsInteractor) {
        selectSavedPaymentMethodsInteractor.handleViewAction(SelectSavedPaymentMethodsInteractor.ViewAction.AddCardPressed.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTabLayoutUI$lambda$4$lambda$3(SelectSavedPaymentMethodsInteractor selectSavedPaymentMethodsInteractor, PaymentSelection paymentSelection) {
        selectSavedPaymentMethodsInteractor.handleViewAction(new SelectSavedPaymentMethodsInteractor.ViewAction.SelectPaymentMethod(paymentSelection));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTabLayoutUI$lambda$6$lambda$5(SelectSavedPaymentMethodsInteractor selectSavedPaymentMethodsInteractor, DisplayableSavedPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selectSavedPaymentMethodsInteractor.handleViewAction(new SelectSavedPaymentMethodsInteractor.ViewAction.EditPaymentMethod(it));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavedPaymentMethodTabLayoutUI(final List<? extends PaymentOptionsItem> paymentOptionsItems, final PaymentOptionsItem paymentOptionsItem, final boolean z, final boolean z2, final Function0<Unit> onAddCardPressed, final Function1<? super PaymentSelection, Unit> onItemSelected, final Function1<? super DisplayableSavedPaymentMethod, Unit> onModifyItem, Modifier modifier, LazyListState lazyListState, Composer composer, final int i, final int i2) {
        int i3;
        PaymentOptionsItem paymentOptionsItem2;
        boolean z3;
        int i4;
        Modifier modifier2;
        LazyListState lazyListState2;
        LazyListState lazyListStateRememberLazyListState;
        int i5;
        Object objRememberedValue;
        FocusRequester focusRequester;
        boolean z4;
        SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1 savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(paymentOptionsItems, "paymentOptionsItems");
        Intrinsics.checkNotNullParameter(onAddCardPressed, "onAddCardPressed");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        Intrinsics.checkNotNullParameter(onModifyItem, "onModifyItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(-405095871);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(paymentOptionsItems) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                paymentOptionsItem2 = paymentOptionsItem;
                i3 |= composerStartRestartGroup.changed(paymentOptionsItem2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onAddCardPressed) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onItemSelected) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onModifyItem) ? 1048576 : 524288;
                }
                i4 = i2 & 128;
                if (i4 == 0) {
                    if ((12582912 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i) != 0) {
                        if ((i2 & 256) == 0) {
                            lazyListState2 = lazyListState;
                            int i6 = composerStartRestartGroup.changed(lazyListState2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i3 |= i6;
                        } else {
                            lazyListState2 = lazyListState;
                        }
                        i3 |= i6;
                    } else {
                        lazyListState2 = lazyListState;
                    }
                    if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                        } else {
                            if (i4 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 256) == 0) {
                                int i7 = i3 & (-234881025);
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i5 = i7;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-405095871, i5, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI (SavedPaymentMethodTabLayoutUI.kt:130)");
                            }
                            composerStartRestartGroup.startReplaceGroup(-1057270728);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new FocusRequester();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            focusRequester = (FocusRequester) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Boolean boolValueOf = Boolean.valueOf(z);
                            composerStartRestartGroup.startReplaceGroup(-1057268753);
                            z4 = (i5 & 896) == 256;
                            savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z4 || savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue = new SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1(z, focusRequester, null);
                                composerStartRestartGroup.updateRememberedValue(savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue, composerStartRestartGroup, (i5 >> 6) & 14);
                            lazyListState2 = lazyListStateRememberLazyListState;
                            composer2 = composerStartRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(FocusRequesterModifierKt.focusRequester(TestTagKt.testTag(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SAVED_PAYMENT_OPTION_TAB_LAYOUT_TEST_TAG), focusRequester), null, false, ComposableLambdaKt.rememberComposableLambda(1633620523, true, new AnonymousClass6(z3, lazyListStateRememberLazyListState, paymentOptionsItems, z, paymentOptionsItem2, onAddCardPressed, onItemSelected, onModifyItem), composerStartRestartGroup, 54), composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                        i5 = i3;
                        lazyListStateRememberLazyListState = lazyListState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1057270728);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        focusRequester = (FocusRequester) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean boolValueOf2 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceGroup(-1057268753);
                        if ((i5 & 896) == 256) {
                        }
                        savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue = new SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1(z, focusRequester, null);
                            composerStartRestartGroup.updateRememberedValue(savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue, composerStartRestartGroup, (i5 >> 6) & 14);
                            lazyListState2 = lazyListStateRememberLazyListState;
                            composer2 = composerStartRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(FocusRequesterModifierKt.focusRequester(TestTagKt.testTag(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SAVED_PAYMENT_OPTION_TAB_LAYOUT_TEST_TAG), focusRequester), null, false, ComposableLambdaKt.rememberComposableLambda(1633620523, true, new AnonymousClass6(z3, lazyListStateRememberLazyListState, paymentOptionsItems, z, paymentOptionsItem2, onAddCardPressed, onItemSelected, onModifyItem), composerStartRestartGroup, 54), composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                    }
                    final Modifier modifier3 = modifier2;
                    final LazyListState lazyListState3 = lazyListState2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTabLayoutUI$lambda$10(paymentOptionsItems, paymentOptionsItem, z, z2, onAddCardPressed, onItemSelected, onModifyItem, modifier3, lazyListState3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                modifier2 = modifier;
                if ((100663296 & i) != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i4 != 0) {
                        }
                        if ((i2 & 256) == 0) {
                            i5 = i3;
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-1057270728);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        focusRequester = (FocusRequester) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Boolean boolValueOf22 = Boolean.valueOf(z);
                        composerStartRestartGroup.startReplaceGroup(-1057268753);
                        if ((i5 & 896) == 256) {
                        }
                        savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                        }
                    }
                }
                final Modifier modifier32 = modifier2;
                final LazyListState lazyListState32 = lazyListState2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            i4 = i2 & 128;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((100663296 & i) != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            final Modifier modifier322 = modifier2;
            final LazyListState lazyListState322 = lazyListState2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paymentOptionsItem2 = paymentOptionsItem;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        z3 = z2;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((100663296 & i) != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        final Modifier modifier3222 = modifier2;
        final LazyListState lazyListState3222 = lazyListState2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: SavedPaymentMethodTabLayoutUI.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6, reason: invalid class name */
    static final class AnonymousClass6 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ boolean $isEditing;
        final /* synthetic */ boolean $isProcessing;
        final /* synthetic */ Function0<Unit> $onAddCardPressed;
        final /* synthetic */ Function1<PaymentSelection, Unit> $onItemSelected;
        final /* synthetic */ Function1<DisplayableSavedPaymentMethod, Unit> $onModifyItem;
        final /* synthetic */ List<PaymentOptionsItem> $paymentOptionsItems;
        final /* synthetic */ LazyListState $scrollState;
        final /* synthetic */ PaymentOptionsItem $selectedPaymentOptionsItem;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(boolean z, LazyListState lazyListState, List<? extends PaymentOptionsItem> list, boolean z2, PaymentOptionsItem paymentOptionsItem, Function0<Unit> function0, Function1<? super PaymentSelection, Unit> function1, Function1<? super DisplayableSavedPaymentMethod, Unit> function12) {
            this.$isProcessing = z;
            this.$scrollState = lazyListState;
            this.$paymentOptionsItems = list;
            this.$isEditing = z2;
            this.$selectedPaymentOptionsItem = paymentOptionsItem;
            this.$onAddCardPressed = function0;
            this.$onItemSelected = function1;
            this.$onModifyItem = function12;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1633620523, i2, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUI.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:144)");
                }
                final float fM8551rememberItemWidth8Feqmps = SavedPaymentMethodTabLayoutUIKt.m8551rememberItemWidth8Feqmps(BoxWithConstraints.mo929getMaxWidthD9Ej5fM(), composer, 0);
                boolean z = !this.$isProcessing;
                PaddingValues savedPaymentMethodTabLayoutPaddingValues = SavedPaymentMethodTabLayoutUIKt.getSavedPaymentMethodTabLayoutPaddingValues();
                LazyListState lazyListState = this.$scrollState;
                composer.startReplaceGroup(-261168899);
                boolean zChangedInstance = composer.changedInstance(this.$paymentOptionsItems) | composer.changed(this.$isProcessing) | composer.changed(this.$isEditing) | composer.changed(this.$selectedPaymentOptionsItem) | composer.changed(fM8551rememberItemWidth8Feqmps) | composer.changed(this.$onAddCardPressed) | composer.changed(this.$onItemSelected) | composer.changed(this.$onModifyItem);
                final List<PaymentOptionsItem> list = this.$paymentOptionsItems;
                final boolean z2 = this.$isProcessing;
                final boolean z3 = this.$isEditing;
                final PaymentOptionsItem paymentOptionsItem = this.$selectedPaymentOptionsItem;
                final Function0<Unit> function0 = this.$onAddCardPressed;
                final Function1<PaymentSelection, Unit> function1 = this.$onItemSelected;
                final Function1<DisplayableSavedPaymentMethod, Unit> function12 = this.$onModifyItem;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function13 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SavedPaymentMethodTabLayoutUIKt.AnonymousClass6.invoke$lambda$4$lambda$3(list, z2, z3, paymentOptionsItem, fM8551rememberItemWidth8Feqmps, function0, function1, function12, (LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(function13);
                    objRememberedValue = function13;
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyRow(null, lazyListState, savedPaymentMethodTabLayoutPaddingValues, false, null, null, null, z, (Function1) objRememberedValue, composer, 0, 121);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(final List list, final boolean z, final boolean z2, final PaymentOptionsItem paymentOptionsItem, final float f, final Function0 function0, final Function1 function1, final Function1 function12, LazyListScope LazyRow) {
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            final Function1 function13 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SavedPaymentMethodTabLayoutUIKt.AnonymousClass6.invoke$lambda$4$lambda$3$lambda$0((PaymentOptionsItem) obj);
                }
            };
            final SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$invoke$lambda$4$lambda$3$$inlined$items$default$1 savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$invoke$lambda$4$lambda$3$$inlined$items$default$1 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$invoke$lambda$4$lambda$3$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(PaymentOptionsItem paymentOptionsItem2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((PaymentOptionsItem) obj);
                }
            };
            LazyRow.items(list.size(), new Function1<Integer, Object>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$invoke$lambda$4$lambda$3$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function13.invoke(list.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$invoke$lambda$4$lambda$3$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$invoke$lambda$4$lambda$3$$inlined$items$default$1.invoke(list.get(i));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$invoke$lambda$4$lambda$3$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if ((i3 & 147) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    PaymentOptionsItem paymentOptionsItem2 = (PaymentOptionsItem) list.get(i);
                    composer.startReplaceGroup(756669293);
                    boolean z3 = !z && (!z2 || paymentOptionsItem2.getIsEnabledDuringEditing());
                    boolean z4 = Intrinsics.areEqual(paymentOptionsItem2, paymentOptionsItem) && !z2;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(-806855242);
                    SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$1$1$2$1$1 savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$1$1$2$1$1RememberedValue = composer.rememberedValue();
                    if (savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$1$1$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$1$1$2$1$1RememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
                            }
                        };
                        composer.updateRememberedValue(savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$1$1$2$1$1RememberedValue);
                    }
                    composer.endReplaceGroup();
                    SavedPaymentMethodTabLayoutUIKt.m8549SavedPaymentMethodTabiWtaglI(paymentOptionsItem2, f, z3, z2, z4, function0, function1, function12, LazyItemScope.animateItem$default(lazyItemScope, TestTagKt.testTag(SemanticsModifierKt.semantics$default(companion, false, (Function1) savedPaymentMethodTabLayoutUIKt$SavedPaymentMethodTabLayoutUI$6$1$1$2$1$1RememberedValue, 1, null), paymentOptionsItem2.getViewType().name()), null, null, null, 2, null), composer, 0, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$4$lambda$3$lambda$0(PaymentOptionsItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return PaymentOptionsItemKt.getKey(it);
        }
    }

    private static final void SavedPaymentMethodsTabLayoutPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1272809305);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1272809305, i, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodsTabLayoutPreview (SavedPaymentMethodTabLayoutUI.kt:231)");
            }
            StripeThemeKt.DefaultStripeTheme(ComposableSingletons$SavedPaymentMethodTabLayoutUIKt.INSTANCE.m8443getLambda1$paymentsheet_release(), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodsTabLayoutPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SavedPaymentMethodsTabLayoutWithDefaultPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-345911008);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-345911008, i, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodsTabLayoutWithDefaultPreview (SavedPaymentMethodTabLayoutUI.kt:247)");
            }
            StripeThemeKt.DefaultStripeTheme(ComposableSingletons$SavedPaymentMethodTabLayoutUIKt.INSTANCE.m8444getLambda2$paymentsheet_release(), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodsTabLayoutWithDefaultPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: rememberItemWidth-8Feqmps, reason: not valid java name */
    public static final float m8551rememberItemWidth8Feqmps(float f, Composer composer, int i) {
        composer.startReplaceGroup(-1122512013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1122512013, i, -1, "com.stripe.android.paymentsheet.ui.rememberItemWidth (SavedPaymentMethodTabLayoutUI.kt:262)");
        }
        composer.startReplaceGroup(697188219);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Dp.m6115boximpl(Dp.m6117constructorimpl(Dp.m6117constructorimpl(f - Dp.m6117constructorimpl(Dp.m6117constructorimpl(17) * 2)) / (((int) (Dp.m6117constructorimpl(r0 * r3) / Dp.m6117constructorimpl(Dp.m6117constructorimpl(100) + Dp.m6117constructorimpl(Dp.m6117constructorimpl(6) * r0)))) / 2.0f)));
            composer.updateRememberedValue(objRememberedValue);
        }
        float fM6131unboximpl = ((Dp) objRememberedValue).m6131unboximpl();
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM6131unboximpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /* renamed from: SavedPaymentMethodTab-iWtaglI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8549SavedPaymentMethodTabiWtaglI(final PaymentOptionsItem paymentOptionsItem, final float f, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, final Function1<? super PaymentSelection, Unit> function1, final Function1<? super DisplayableSavedPaymentMethod, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        boolean z4;
        boolean z5;
        Function0<Unit> function02;
        Function1<? super PaymentSelection, Unit> function13;
        Function1<? super DisplayableSavedPaymentMethod, Unit> function14;
        int i4;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1347618524);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(paymentOptionsItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                z4 = z;
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                z5 = z2;
            } else {
                z5 = z2;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                    function13 = function1;
                } else {
                    function13 = function1;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                    function14 = function12;
                } else {
                    function14 = function12;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                    }
                }
                i4 = i2 & 256;
                if (i4 == 0) {
                    if ((100663296 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1347618524, i3, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab (SavedPaymentMethodTabLayoutUI.kt:281)");
                        }
                        if (!(paymentOptionsItem instanceof PaymentOptionsItem.AddCard)) {
                            composerStartRestartGroup.startReplaceGroup(-1762712524);
                            Modifier modifier3 = modifier2;
                            m8545AddCardTabAjpBEmI(f2, z4, function02, modifier3, composerStartRestartGroup, ((i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 >> 9) & 896) | ((i3 >> 15) & 7168), 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            modifier2 = modifier3;
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (paymentOptionsItem instanceof PaymentOptionsItem.GooglePay) {
                            composerStartRestartGroup.startReplaceGroup(-1762460339);
                            m8546GooglePayTabPBTpf3Q(f, z, z3, function13, modifier2, composerStartRestartGroup, ((i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 >> 6) & 896) | ((i3 >> 9) & 7168) | ((i3 >> 12) & 57344), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (paymentOptionsItem instanceof PaymentOptionsItem.Link) {
                            composerStartRestartGroup.startReplaceGroup(-1762175790);
                            m8547LinkTabPBTpf3Q(f, z, z3, function1, modifier2, composerStartRestartGroup, ((i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 >> 6) & 896) | ((i3 >> 9) & 7168) | ((i3 >> 12) & 57344), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (!(paymentOptionsItem instanceof PaymentOptionsItem.SavedPaymentMethod)) {
                                composerStartRestartGroup.startReplaceGroup(358779609);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-1761877942);
                            int i5 = 65520 & i3;
                            int i6 = i3 >> 3;
                            m8548SavedPaymentMethodTabUwwEzs((PaymentOptionsItem.SavedPaymentMethod) paymentOptionsItem, f, z, z5, z3, function1, function14, modifier2, composerStartRestartGroup, i5 | (458752 & i6) | (3670016 & i6) | (i6 & 29360128), 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    final Modifier modifier4 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTab_iWtaglI$lambda$14(paymentOptionsItem, f, z, z2, z3, function0, function1, function12, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 100663296;
                modifier2 = modifier;
                if ((38347923 & i3) == 38347922) {
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!(paymentOptionsItem instanceof PaymentOptionsItem.AddCard)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                final Modifier modifier42 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i4 = i2 & 256;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((38347923 & i3) == 38347922) {
            }
            final Modifier modifier422 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z4 = z;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        function02 = function0;
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((38347923 & i3) == 38347922) {
        }
        final Modifier modifier4222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: AddCardTab-AjpBEmI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m8545AddCardTabAjpBEmI(final float f, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        boolean z2;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        int i5;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1031416232);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1031416232, i3, -1, "com.stripe.android.paymentsheet.ui.AddCardTab (SavedPaymentMethodTabLayoutUI.kt:330)");
                    }
                    if (!StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU())) {
                        i5 = R.drawable.stripe_ic_paymentsheet_add_dark;
                    } else {
                        i5 = R.drawable.stripe_ic_paymentsheet_add_light;
                    }
                    composer2 = composerStartRestartGroup;
                    SavedPaymentMethodTabKt.m8535SavedPaymentMethodTabRYabdnw(modifier2, f2, false, false, false, z2, false, i5, null, null, false, StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_add_payment_method_button_label, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R.string.stripe_add_new_payment_method, composerStartRestartGroup, 0), null, null, function02, composer2, ((i3 >> 9) & 14) | 28032 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 << 12) & 458752), (i3 << 9) & 458752, 26432);
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
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SavedPaymentMethodTabLayoutUIKt.AddCardTab_AjpBEmI$lambda$15(f, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) != 1170) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU())) {
                }
                composer2 = composerStartRestartGroup;
                SavedPaymentMethodTabKt.m8535SavedPaymentMethodTabRYabdnw(modifier2, f2, false, false, false, z2, false, i5, null, null, false, StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_add_payment_method_button_label, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(R.string.stripe_add_new_payment_method, composerStartRestartGroup, 0), null, null, function02, composer2, ((i3 >> 9) & 14) | 28032 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 << 12) & 458752), (i3 << 9) & 458752, 26432);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: GooglePayTab-PBTpf3Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m8546GooglePayTabPBTpf3Q(final float f, final boolean z, final boolean z2, final Function1<? super PaymentSelection, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        boolean z3;
        boolean z4;
        Modifier modifier2;
        boolean z5;
        Object objRememberedValue;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(253339709);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(253339709, i3, -1, "com.stripe.android.paymentsheet.ui.GooglePayTab (SavedPaymentMethodTabLayoutUI.kt:358)");
                }
                int i5 = R.drawable.stripe_google_pay_mark;
                String strStringResource = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_google_pay, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_google_pay, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(920688044);
                z5 = (i3 & 7168) == 2048;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SavedPaymentMethodTabLayoutUIKt.GooglePayTab_PBTpf3Q$lambda$17$lambda$16(function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                SavedPaymentMethodTabKt.m8535SavedPaymentMethodTabRYabdnw(modifier2, f2, z4, false, false, z3, false, i5, null, null, false, strStringResource, strStringResource2, null, null, (Function0) objRememberedValue, composer2, ((i3 >> 12) & 14) | 27648 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i3 & 896) | ((i3 << 12) & 458752), 0, 26432);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SavedPaymentMethodTabLayoutUIKt.GooglePayTab_PBTpf3Q$lambda$18(f, z, z2, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = R.drawable.stripe_google_pay_mark;
            String strStringResource3 = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_google_pay, composerStartRestartGroup, 0);
            String strStringResource22 = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_google_pay, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(920688044);
            if ((i3 & 7168) == 2048) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z5) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SavedPaymentMethodTabLayoutUIKt.GooglePayTab_PBTpf3Q$lambda$17$lambda$16(function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                SavedPaymentMethodTabKt.m8535SavedPaymentMethodTabRYabdnw(modifier2, f2, z4, false, false, z3, false, i52, null, null, false, strStringResource3, strStringResource22, null, null, (Function0) objRememberedValue, composer2, ((i3 >> 12) & 14) | 27648 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i3 & 896) | ((i3 << 12) & 458752), 0, 26432);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GooglePayTab_PBTpf3Q$lambda$17$lambda$16(Function1 function1) {
        function1.invoke(PaymentSelection.GooglePay.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinkTab-PBTpf3Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m8547LinkTabPBTpf3Q(final float f, final boolean z, final boolean z2, final Function1<? super PaymentSelection, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        boolean z3;
        boolean z4;
        Modifier modifier2;
        boolean z5;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-329329418);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-329329418, i3, -1, "com.stripe.android.paymentsheet.ui.LinkTab (SavedPaymentMethodTabLayoutUI.kt:380)");
                }
                int linkIcon$default = PaymentMethodsUiExtensionKt.getLinkIcon$default(Boolean.valueOf(!StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU())), false, 2, null);
                String strStringResource = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_link, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_link, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-192106930);
                z5 = (i3 & 7168) == 2048;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SavedPaymentMethodTabLayoutUIKt.LinkTab_PBTpf3Q$lambda$20$lambda$19(function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                SavedPaymentMethodTabKt.m8535SavedPaymentMethodTabRYabdnw(modifier4, f2, z4, false, false, z3, false, linkIcon$default, null, null, false, strStringResource, strStringResource2, null, null, (Function0) objRememberedValue, composer2, ((i3 >> 12) & 14) | 100690944 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i3 & 896) | ((i3 << 12) & 458752), 0, 26176);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SavedPaymentMethodTabLayoutUIKt.LinkTab_PBTpf3Q$lambda$21(f, z, z2, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int linkIcon$default2 = PaymentMethodsUiExtensionKt.getLinkIcon$default(Boolean.valueOf(!StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU())), false, 2, null);
            String strStringResource3 = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_link, composerStartRestartGroup, 0);
            String strStringResource22 = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_link, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-192106930);
            if ((i3 & 7168) == 2048) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z5) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SavedPaymentMethodTabLayoutUIKt.LinkTab_PBTpf3Q$lambda$20$lambda$19(function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier42 = modifier2;
                composer2 = composerStartRestartGroup;
                SavedPaymentMethodTabKt.m8535SavedPaymentMethodTabRYabdnw(modifier42, f2, z4, false, false, z3, false, linkIcon$default2, null, null, false, strStringResource3, strStringResource22, null, null, (Function0) objRememberedValue, composer2, ((i3 >> 12) & 14) | 100690944 | ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i3 & 896) | ((i3 << 12) & 458752), 0, 26176);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkTab_PBTpf3Q$lambda$20$lambda$19(Function1 function1) {
        function1.invoke(new PaymentSelection.Link(null, null, null, 7, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /* renamed from: SavedPaymentMethodTab-Uww-Ezs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m8548SavedPaymentMethodTabUwwEzs(final PaymentOptionsItem.SavedPaymentMethod savedPaymentMethod, final float f, final boolean z, final boolean z2, final boolean z3, final Function1<? super PaymentSelection, Unit> function1, final Function1<? super DisplayableSavedPaymentMethod, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        Modifier modifier2;
        final String strResolve;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1177975555);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(savedPaymentMethod) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
            }
            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1177975555, i3, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab (SavedPaymentMethodTabLayoutUI.kt:406)");
                }
                Integer labelIcon = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod(), composerStartRestartGroup, PaymentMethod.$stable);
                ResolvableString label = PaymentMethodsUiExtensionKt.getLabel(savedPaymentMethod.getPaymentMethod(), false);
                composerStartRestartGroup.startReplaceGroup(358908870);
                strResolve = label != null ? null : ResolvableStringComposeUtilsKt.resolve(label, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                if (strResolve != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final float f3 = f2;
                        final Modifier modifier4 = companion;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTab_Uww_Ezs$lambda$22(savedPaymentMethod, f3, z, z2, z3, function1, function12, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier5 = companion;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(358911252);
                boolean zChanged = ((57344 & i3) == 16384) | composerStartRestartGroup.changed(strResolve) | ((i3 & 896) == 256);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTab_Uww_Ezs$lambda$24$lambda$23(z3, strResolve, z, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue, 1, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
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
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                boolean z4 = z && z2;
                boolean z5 = !z2;
                boolean z6 = savedPaymentMethod.getDisplayableSavedPaymentMethod().getShouldShowDefaultBadge() && z2;
                int savedPaymentMethodIcon$default = PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon$default(savedPaymentMethod.getPaymentMethod(), false, Boolean.valueOf(!StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU())), 1, (Object) null);
                boolean shouldTintLabelIcon = PaymentMethodsUiExtensionKt.getShouldTintLabelIcon(savedPaymentMethod.getPaymentMethod());
                String numbersAsIndividualDigits = AccessibilityKt.readNumbersAsIndividualDigits(ResolvableStringComposeUtilsKt.resolve(savedPaymentMethod.getDisplayableSavedPaymentMethod().getDescription(), composerStartRestartGroup, 0));
                String numbersAsIndividualDigits2 = AccessibilityKt.readNumbersAsIndividualDigits(ResolvableStringComposeUtilsKt.resolve(savedPaymentMethod.getDisplayableSavedPaymentMethod().getModifyDescription(), composerStartRestartGroup, 0));
                composerStartRestartGroup.startReplaceGroup(1346353721);
                boolean zChangedInstance = ((3670016 & i3) == 1048576) | composerStartRestartGroup.changedInstance(savedPaymentMethod);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTab_Uww_Ezs$lambda$29$lambda$26$lambda$25(function12, savedPaymentMethod);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1346364142);
                boolean zChangedInstance2 = ((458752 & i3) == 131072) | composerStartRestartGroup.changedInstance(savedPaymentMethod);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTab_Uww_Ezs$lambda$29$lambda$28$lambda$27(function1, savedPaymentMethod);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                SavedPaymentMethodTabKt.m8535SavedPaymentMethodTabRYabdnw(modifier5, f, z3, z4, z6, z, z5, savedPaymentMethodIcon$default, null, labelIcon, shouldTintLabelIcon, strResolve, numbersAsIndividualDigits, function0, numbersAsIndividualDigits2, (Function0) objRememberedValue3, composer2, ((i3 >> 21) & 14) | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 6) & 896) | ((i3 << 9) & 458752), 0, 256);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTab_Uww_Ezs$lambda$30(savedPaymentMethod, f, z, z2, z3, function1, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        f2 = f;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Integer labelIcon2 = PaymentMethodsUiExtensionKt.getLabelIcon(savedPaymentMethod.getPaymentMethod(), composerStartRestartGroup, PaymentMethod.$stable);
            ResolvableString label2 = PaymentMethodsUiExtensionKt.getLabel(savedPaymentMethod.getPaymentMethod(), false);
            composerStartRestartGroup.startReplaceGroup(358908870);
            if (label2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (strResolve != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTab_Uww_Ezs$lambda$24$lambda$23(boolean z, String str, boolean z2, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, SAVED_PAYMENT_OPTION_TEST_TAG);
        SemanticsPropertiesKt.setSelected(semantics, z);
        SemanticsPropertiesKt.setText(semantics, new AnnotatedString(str, null, null, 6, null));
        if (!z2) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTab_Uww_Ezs$lambda$29$lambda$26$lambda$25(Function1 function1, PaymentOptionsItem.SavedPaymentMethod savedPaymentMethod) {
        function1.invoke(savedPaymentMethod.getDisplayableSavedPaymentMethod());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTab_Uww_Ezs$lambda$29$lambda$28$lambda$27(Function1 function1, PaymentOptionsItem.SavedPaymentMethod savedPaymentMethod) {
        function1.invoke(PaymentOptionsStateFactoryKt.toPaymentSelection(savedPaymentMethod));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CvcRecollectionField(final StateFlow<CvcController> cvcControllerFlow, final boolean z, int i, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object objRememberedValue;
        Object objRememberedValue2;
        MutableState mutableState;
        FocusManager focusManager;
        boolean zChangedInstance;
        SavedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1 savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue;
        boolean z2;
        SavedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1 savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue;
        Object objRememberedValue3;
        final int i10;
        final int i11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(cvcControllerFlow, "cvcControllerFlow");
        Composer composerStartRestartGroup = composer.startRestartGroup(685072799);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(cvcControllerFlow) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i12 = i4 & 4;
        if (i12 != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i6 = i;
                i5 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
            }
            i7 = i4 & 8;
            if (i7 != 0) {
                if ((i3 & 3072) == 0) {
                    i8 = i2;
                    i5 |= composerStartRestartGroup.changed(i8) ? 2048 : 1024;
                }
                if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    int i13 = i12 == 0 ? 500 : i6;
                    i9 = i7 == 0 ? 400 : i8;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(685072799, i5, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField (SavedPaymentMethodTabLayoutUI.kt:460)");
                    }
                    State stateCollectAsState = StateFlowsComposeKt.collectAsState(cvcControllerFlow, null, composerStartRestartGroup, i5 & 14, 1);
                    final State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(CvcRecollectionField$lambda$31(stateCollectAsState).getError(), null, composerStartRestartGroup, 0, 1);
                    final CvcElement cvcElement = new CvcElement(new IdentifierSpec(), CvcRecollectionField$lambda$31(stateCollectAsState));
                    composerStartRestartGroup.startReplaceGroup(-1879185106);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1879183533);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localFocusManager);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    focusManager = (FocusManager) objConsume;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    composerStartRestartGroup.startReplaceGroup(-1879179686);
                    zChangedInstance = ((i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32) | composerStartRestartGroup.changedInstance(focusManager);
                    savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue = new SavedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1(z, focusManager, null);
                        composerStartRestartGroup.updateRememberedValue(savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue, composerStartRestartGroup, (i5 >> 3) & 14);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1879174282);
                    z2 = (i5 & 7168) != 2048;
                    savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue = new SavedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1(i9, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue, composerStartRestartGroup, 6);
                    boolean zCvcRecollectionField$lambda$35 = CvcRecollectionField$lambda$35(mutableState);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(i13, i9, null, 4, null);
                    composerStartRestartGroup.startReplaceGroup(-1879168053);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Integer.valueOf(SavedPaymentMethodTabLayoutUIKt.CvcRecollectionField$lambda$40$lambda$39(((Integer) obj).intValue()));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EnterTransition enterTransitionExpandVertically$default = EnterExitTransitionKt.expandVertically$default(tweenSpecTween$default, null, false, (Function1) objRememberedValue3, 6, null);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1074270777, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt.CvcRecollectionField.4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i14) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1074270777, i14, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:487)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(20), 0.0f, 0.0f, 13, null), StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE));
                            final CvcElement cvcElement2 = cvcElement;
                            final boolean z3 = z;
                            final FocusRequester focusRequester2 = focusRequester;
                            State<FieldError> state = stateCollectAsState2;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPadding);
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
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_confirm_your_cvc, composer2, 0), (Modifier) null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8730getSubtitle0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBody1(), composer2, 0, 0, 65530);
                            float f = 0;
                            float f2 = 8;
                            SectionUIKt.m8829SectionCardfWhpE4E(IntrinsicKt.height(PaddingKt.m1023paddingqDBjuR0(Modifier.INSTANCE, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f2), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f2)), IntrinsicSize.Min), null, false, 0L, null, ComposableLambdaKt.rememberComposableLambda(408385964, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$CvcRecollectionField$4$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i15) {
                                    if ((i15 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(408385964, i15, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:500)");
                                        }
                                        cvcElement2.getController().ComposeUI(!z3, cvcElement2, FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester2), SetsKt.emptySet(), null, composer3, (CvcElement.$stable << 3) | 27648 | (IdentifierSpec.$stable << 9) | (CvcController.$stable << 15));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composer2, 54), composer2, 196614, 30);
                            FieldError fieldErrorCvcRecollectionField$lambda$32 = SavedPaymentMethodTabLayoutUIKt.CvcRecollectionField$lambda$32(state);
                            Integer numValueOf = fieldErrorCvcRecollectionField$lambda$32 != null ? Integer.valueOf(fieldErrorCvcRecollectionField$lambda$32.getErrorMessage()) : null;
                            composer2.startReplaceGroup(272138444);
                            if (numValueOf != null) {
                                int iIntValue = numValueOf.intValue();
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                SectionUIKt.SectionError(StringResources_androidKt.stringResource(iIntValue, composer2, 0), null, composer2, 0, 2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
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
                        }
                    }, composerStartRestartGroup, 54);
                    int i14 = i9;
                    AnimatedVisibilityKt.AnimatedVisibility(zCvcRecollectionField$lambda$35, (Modifier) null, enterTransitionExpandVertically$default, (ExitTransition) null, (String) null, composableLambdaRememberComposableLambda, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i10 = i14;
                    i11 = i13;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    i11 = i6;
                    i10 = i8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SavedPaymentMethodTabLayoutUIKt.CvcRecollectionField$lambda$41(cvcControllerFlow, z, i11, i10, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            i8 = i2;
            if ((i5 & 1171) != 1170) {
                if (i12 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                State stateCollectAsState3 = StateFlowsComposeKt.collectAsState(cvcControllerFlow, null, composerStartRestartGroup, i5 & 14, 1);
                final State<FieldError> stateCollectAsState22 = StateFlowsComposeKt.collectAsState(CvcRecollectionField$lambda$31(stateCollectAsState3).getError(), null, composerStartRestartGroup, 0, 1);
                final CvcElement cvcElement2 = new CvcElement(new IdentifierSpec(), CvcRecollectionField$lambda$31(stateCollectAsState3));
                composerStartRestartGroup.startReplaceGroup(-1879185106);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1879183533);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localFocusManager2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                focusManager = (FocusManager) objConsume2;
                Boolean boolValueOf2 = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceGroup(-1879179686);
                zChangedInstance = ((i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32) | composerStartRestartGroup.changedInstance(focusManager);
                savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue = new SavedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1(z, focusManager, null);
                    composerStartRestartGroup.updateRememberedValue(savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$1$1RememberedValue, composerStartRestartGroup, (i5 >> 3) & 14);
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1879174282);
                    if ((i5 & 7168) != 2048) {
                    }
                    savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue = new SavedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1(i9, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) savedPaymentMethodTabLayoutUIKt$CvcRecollectionField$2$1RememberedValue, composerStartRestartGroup, 6);
                        boolean zCvcRecollectionField$lambda$352 = CvcRecollectionField$lambda$35(mutableState);
                        TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(i13, i9, null, 4, null);
                        composerStartRestartGroup.startReplaceGroup(-1879168053);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EnterTransition enterTransitionExpandVertically$default2 = EnterExitTransitionKt.expandVertically$default(tweenSpecTween$default2, null, false, (Function1) objRememberedValue3, 6, null);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1074270777, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt.CvcRecollectionField.4
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i142) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1074270777, i142, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:487)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(20), 0.0f, 0.0f, 13, null), StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE));
                                final CvcElement cvcElement22 = cvcElement2;
                                final boolean z3 = z;
                                final FocusRequester focusRequester22 = focusRequester2;
                                State<FieldError> state = stateCollectAsState22;
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPadding);
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
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_confirm_your_cvc, composer2, 0), (Modifier) null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8730getSubtitle0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBody1(), composer2, 0, 0, 65530);
                                float f = 0;
                                float f2 = 8;
                                SectionUIKt.m8829SectionCardfWhpE4E(IntrinsicKt.height(PaddingKt.m1023paddingqDBjuR0(Modifier.INSTANCE, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f2), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f2)), IntrinsicSize.Min), null, false, 0L, null, ComposableLambdaKt.rememberComposableLambda(408385964, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt$CvcRecollectionField$4$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i15) {
                                        if ((i15 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(408385964, i15, -1, "com.stripe.android.paymentsheet.ui.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:500)");
                                            }
                                            cvcElement22.getController().ComposeUI(!z3, cvcElement22, FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester22), SetsKt.emptySet(), null, composer3, (CvcElement.$stable << 3) | 27648 | (IdentifierSpec.$stable << 9) | (CvcController.$stable << 15));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composer2, 54), composer2, 196614, 30);
                                FieldError fieldErrorCvcRecollectionField$lambda$32 = SavedPaymentMethodTabLayoutUIKt.CvcRecollectionField$lambda$32(state);
                                Integer numValueOf = fieldErrorCvcRecollectionField$lambda$32 != null ? Integer.valueOf(fieldErrorCvcRecollectionField$lambda$32.getErrorMessage()) : null;
                                composer2.startReplaceGroup(272138444);
                                if (numValueOf != null) {
                                    int iIntValue = numValueOf.intValue();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                                    Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    SectionUIKt.SectionError(StringResources_androidKt.stringResource(iIntValue, composer2, 0), null, composer2, 0, 2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
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
                            }
                        }, composerStartRestartGroup, 54);
                        int i142 = i9;
                        AnimatedVisibilityKt.AnimatedVisibility(zCvcRecollectionField$lambda$352, (Modifier) null, enterTransitionExpandVertically$default2, (ExitTransition) null, (String) null, composableLambdaRememberComposableLambda2, composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i10 = i142;
                        i11 = i13;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i2;
        if ((i5 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final boolean CvcRecollectionField$lambda$35(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CvcRecollectionField$lambda$36(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaddingValues getSavedPaymentMethodTabLayoutPaddingValues() {
        float f = 3;
        float f2 = 0;
        return PaddingKt.m1017PaddingValuesa9UjIt4$default(Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(StripeTheme.INSTANCE.getFormInsets().getStart() - f), Dp.m6117constructorimpl(f2))), 0.0f, Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(StripeTheme.INSTANCE.getFormInsets().getEnd() - f), Dp.m6117constructorimpl(f2))), 0.0f, 10, null);
    }

    private static final SelectSavedPaymentMethodsInteractor.State SavedPaymentMethodTabLayoutUI$lambda$0(State<SelectSavedPaymentMethodsInteractor.State> state) {
        return state.getValue();
    }

    private static final CvcController CvcRecollectionField$lambda$31(State<CvcController> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldError CvcRecollectionField$lambda$32(State<FieldError> state) {
        return state.getValue();
    }
}
