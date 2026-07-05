package com.stripe.android.paymentsheet.verticalmode;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.R;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.ui.LinkButtonState;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.DefaultFormHelper;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEventKt;
import com.stripe.android.paymentsheet.forms.FormArgumentsFactory;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.state.WalletsState;
import com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PaymentMethodVerticalLayoutInteractor.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0085\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t0\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000f\u00126\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b\u0012!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u000f\u0012\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u0005\u0012\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0005\u0012\u001a\u0010!\u001a\u0016\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0004\u0012\u00020\"0\u000f\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0005\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001a\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0015\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\u0010+\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00190\u000f\u0012\u0016\u0010,\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00190\u000f\u0012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00190\u000f\u0012\u0014\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001b\u0012\u0006\u00101\u001a\u00020\u0006\u0012\b\b\u0002\u00102\u001a\u000203\u0012\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J0\u0010K\u001a\b\u0012\u0004\u0012\u00020B0\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010L\u001a\u0004\u0018\u00010MH\u0002J\u0012\u0010N\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J,\u0010O\u001a\u0004\u0018\u00010.2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J2\u0010P\u001a\u00020@2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010Q\u001a\u0004\u0018\u00010.2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002J\"\u0010R\u001a\u00020@2\u0006\u0010#\u001a\u00020\u00062\b\u0010Q\u001a\u0004\u0018\u00010.2\u0006\u0010(\u001a\u00020\u0006H\u0002J\u0010\u0010S\u001a\u00020\u00192\u0006\u0010T\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\bH\u0002J\u001e\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010X\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\f\u0010Y\u001a\u00020Z*\u00020\u000bH\u0002J\u000e\u0010[\u001a\u0004\u0018\u00010\b*\u00020\\H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010!\u001a\u0016\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0004\u0012\u00020\"0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00190\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u001e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010C\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010H¨\u0006^"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/DefaultPaymentMethodVerticalLayoutInteractor;", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", BaseSheetViewModel.SAVE_PROCESSING, "Lkotlinx/coroutines/flow/StateFlow;", "", "temporarySelection", "", "Lcom/stripe/android/model/PaymentMethodCode;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethodIncentiveInteractor", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;", "formTypeForCode", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "code", "Lcom/stripe/android/paymentsheet/FormHelper$FormType;", "onFormFieldValuesChanged", "Lkotlin/Function2;", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "formValues", "selectedPaymentMethodCode", "", "transitionToManageScreen", "Lkotlin/Function0;", "transitionToFormScreen", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "mostRecentlySelectedSavedPaymentMethod", "providePaymentMethodName", "Lcom/stripe/android/core/strings/ResolvableString;", "canRemove", "walletsState", "Lcom/stripe/android/paymentsheet/state/WalletsState;", "canShowWalletsInline", "canShowWalletButtons", "canUpdateFullPaymentMethodDetails", "updateSelection", "isCurrentScreen", "reportPaymentMethodTypeSelected", "reportFormShown", "onUpdatePaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "shouldUpdateVerticalModeSelection", "invokeRowSelectionCallback", "displaysMandatesInFormScreen", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "mainDispatcher", "<init>", "(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;ZZLkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "_verticalModeScreenSelection", "Lkotlinx/coroutines/flow/MutableStateFlow;", "verticalModeScreenSelection", "supportedPaymentMethods", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "displayedSavedPaymentMethod", "availableSavedPaymentMethodAction", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$SavedPaymentMethodAction;", "displayablePaymentMethods", "Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;", NamedConstantsKt.IS_LIVE_MODE, "()Z", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "showsWalletsHeader", "getShowsWalletsHeader", "getDisplayablePaymentMethods", "incentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "showsWalletsInline", "getDisplayedSavedPaymentMethod", "getAvailableSavedPaymentMethodAction", "savedPaymentMethod", "getSavedPaymentMethodActionForOnePaymentMethod", "handleViewAction", "viewAction", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$ViewAction;", "updateSelectedPaymentMethod", "getMandate", "temporarySelectionCode", "asVerticalSelection", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor$Selection;", "changeDetails", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPaymentMethodVerticalLayoutInteractor implements PaymentMethodVerticalLayoutInteractor {
    private final MutableStateFlow<PaymentSelection> _verticalModeScreenSelection;
    private final StateFlow<PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction> availableSavedPaymentMethodAction;
    private final StateFlow<Boolean> canRemove;
    private final boolean canShowWalletButtons;
    private final boolean canShowWalletsInline;
    private final StateFlow<Boolean> canUpdateFullPaymentMethodDetails;
    private final CoroutineScope coroutineScope;
    private final StateFlow<List<DisplayablePaymentMethod>> displayablePaymentMethods;
    private final StateFlow<DisplayableSavedPaymentMethod> displayedSavedPaymentMethod;
    private final boolean displaysMandatesInFormScreen;
    private final Function1<String, FormHelper.FormType> formTypeForCode;
    private final Function0<Unit> invokeRowSelectionCallback;
    private final StateFlow<Boolean> isCurrentScreen;
    private final boolean isLiveMode;
    private final StateFlow<PaymentMethod> mostRecentlySelectedSavedPaymentMethod;
    private final Function2<FormFieldValues, String, Unit> onFormFieldValuesChanged;
    private final Function1<DisplayableSavedPaymentMethod, Unit> onUpdatePaymentMethod;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final Function1<String, ResolvableString> providePaymentMethodName;
    private final Function1<String, Unit> reportFormShown;
    private final Function1<String, Unit> reportPaymentMethodTypeSelected;
    private final Function1<String, Boolean> shouldUpdateVerticalModeSelection;
    private final StateFlow<Boolean> showsWalletsHeader;
    private final StateFlow<PaymentMethodVerticalLayoutInteractor.State> state;
    private final List<SupportedPaymentMethod> supportedPaymentMethods;
    private final Function1<String, Unit> transitionToFormScreen;
    private final Function0<Unit> transitionToManageScreen;
    private final Function2<PaymentSelection, Boolean, Unit> updateSelection;
    private final MutableStateFlow<PaymentSelection> verticalModeScreenSelection;
    private final StateFlow<WalletsState> walletsState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultPaymentMethodVerticalLayoutInteractor(PaymentMethodMetadata paymentMethodMetadata, StateFlow<Boolean> processing, StateFlow<String> temporarySelection, StateFlow<? extends PaymentSelection> selection, PaymentMethodIncentiveInteractor paymentMethodIncentiveInteractor, Function1<? super String, ? extends FormHelper.FormType> formTypeForCode, Function2<? super FormFieldValues, ? super String, Unit> onFormFieldValuesChanged, Function0<Unit> transitionToManageScreen, Function1<? super String, Unit> transitionToFormScreen, StateFlow<? extends List<PaymentMethod>> paymentMethods, StateFlow<PaymentMethod> mostRecentlySelectedSavedPaymentMethod, Function1<? super String, ? extends ResolvableString> providePaymentMethodName, StateFlow<Boolean> canRemove, StateFlow<WalletsState> walletsState, boolean z, boolean z2, StateFlow<Boolean> canUpdateFullPaymentMethodDetails, Function2<? super PaymentSelection, ? super Boolean, Unit> updateSelection, StateFlow<Boolean> isCurrentScreen, Function1<? super String, Unit> reportPaymentMethodTypeSelected, Function1<? super String, Unit> reportFormShown, Function1<? super DisplayableSavedPaymentMethod, Unit> onUpdatePaymentMethod, Function1<? super String, Boolean> shouldUpdateVerticalModeSelection, Function0<Unit> function0, boolean z3, CoroutineContext dispatcher, CoroutineContext mainDispatcher) {
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(processing, "processing");
        Intrinsics.checkNotNullParameter(temporarySelection, "temporarySelection");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(paymentMethodIncentiveInteractor, "paymentMethodIncentiveInteractor");
        Intrinsics.checkNotNullParameter(formTypeForCode, "formTypeForCode");
        Intrinsics.checkNotNullParameter(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Intrinsics.checkNotNullParameter(transitionToManageScreen, "transitionToManageScreen");
        Intrinsics.checkNotNullParameter(transitionToFormScreen, "transitionToFormScreen");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(providePaymentMethodName, "providePaymentMethodName");
        Intrinsics.checkNotNullParameter(canRemove, "canRemove");
        Intrinsics.checkNotNullParameter(walletsState, "walletsState");
        Intrinsics.checkNotNullParameter(canUpdateFullPaymentMethodDetails, "canUpdateFullPaymentMethodDetails");
        Intrinsics.checkNotNullParameter(updateSelection, "updateSelection");
        Intrinsics.checkNotNullParameter(isCurrentScreen, "isCurrentScreen");
        Intrinsics.checkNotNullParameter(reportPaymentMethodTypeSelected, "reportPaymentMethodTypeSelected");
        Intrinsics.checkNotNullParameter(reportFormShown, "reportFormShown");
        Intrinsics.checkNotNullParameter(onUpdatePaymentMethod, "onUpdatePaymentMethod");
        Intrinsics.checkNotNullParameter(shouldUpdateVerticalModeSelection, "shouldUpdateVerticalModeSelection");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.formTypeForCode = formTypeForCode;
        this.onFormFieldValuesChanged = onFormFieldValuesChanged;
        this.transitionToManageScreen = transitionToManageScreen;
        this.transitionToFormScreen = transitionToFormScreen;
        this.mostRecentlySelectedSavedPaymentMethod = mostRecentlySelectedSavedPaymentMethod;
        this.providePaymentMethodName = providePaymentMethodName;
        this.canRemove = canRemove;
        this.walletsState = walletsState;
        this.canShowWalletsInline = z;
        this.canShowWalletButtons = z2;
        this.canUpdateFullPaymentMethodDetails = canUpdateFullPaymentMethodDetails;
        this.updateSelection = updateSelection;
        this.isCurrentScreen = isCurrentScreen;
        this.reportPaymentMethodTypeSelected = reportPaymentMethodTypeSelected;
        this.reportFormShown = reportFormShown;
        this.onUpdatePaymentMethod = onUpdatePaymentMethod;
        this.shouldUpdateVerticalModeSelection = shouldUpdateVerticalModeSelection;
        this.invokeRowSelectionCallback = function0;
        this.displaysMandatesInFormScreen = z3;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.coroutineScope = CoroutineScope;
        MutableStateFlow<PaymentSelection> MutableStateFlow = StateFlowKt.MutableStateFlow(selection.getValue());
        this._verticalModeScreenSelection = MutableStateFlow;
        this.verticalModeScreenSelection = MutableStateFlow;
        this.supportedPaymentMethods = paymentMethodMetadata.sortedSupportedPaymentMethods();
        StateFlow<DisplayableSavedPaymentMethod> stateFlowCombineAsStateFlow = StateFlowsKt.combineAsStateFlow(paymentMethods, mostRecentlySelectedSavedPaymentMethod, new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultPaymentMethodVerticalLayoutInteractor.displayedSavedPaymentMethod$lambda$0(this.f$0, (List) obj, (PaymentMethod) obj2);
            }
        });
        this.displayedSavedPaymentMethod = stateFlowCombineAsStateFlow;
        StateFlow<PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction> stateFlowCombineAsStateFlow2 = StateFlowsKt.combineAsStateFlow(paymentMethods, stateFlowCombineAsStateFlow, canRemove, canUpdateFullPaymentMethodDetails, new Function4() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DefaultPaymentMethodVerticalLayoutInteractor.availableSavedPaymentMethodAction$lambda$1(this.f$0, (List) obj, (DisplayableSavedPaymentMethod) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
            }
        });
        this.availableSavedPaymentMethodAction = stateFlowCombineAsStateFlow2;
        StateFlow<List<DisplayablePaymentMethod>> stateFlowCombineAsStateFlow3 = StateFlowsKt.combineAsStateFlow(paymentMethods, walletsState, paymentMethodIncentiveInteractor.getDisplayedIncentive(), new Function3() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DefaultPaymentMethodVerticalLayoutInteractor.displayablePaymentMethods$lambda$2(this.f$0, (List) obj, (WalletsState) obj2, (PaymentMethodIncentive) obj3);
            }
        });
        this.displayablePaymentMethods = stateFlowCombineAsStateFlow3;
        this.isLiveMode = paymentMethodMetadata.getStripeIntent().isLiveMode();
        this.state = StateFlowsKt.combineAsStateFlow(stateFlowCombineAsStateFlow3, processing, MutableStateFlow, stateFlowCombineAsStateFlow, stateFlowCombineAsStateFlow2, temporarySelection, new Function6() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return DefaultPaymentMethodVerticalLayoutInteractor.state$lambda$3(this.f$0, (List) obj, ((Boolean) obj2).booleanValue(), (PaymentSelection) obj3, (DisplayableSavedPaymentMethod) obj4, (PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction) obj5, (String) obj6);
            }
        });
        this.showsWalletsHeader = StateFlowsKt.mapAsStateFlow(walletsState, new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DefaultPaymentMethodVerticalLayoutInteractor.showsWalletsHeader$lambda$4(this.f$0, (WalletsState) obj));
            }
        });
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, mainDispatcher, null, new AnonymousClass1(selection, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, mainDispatcher, null, new AnonymousClass2(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, mainDispatcher, null, new AnonymousClass3(null), 2, null);
    }

    public /* synthetic */ DefaultPaymentMethodVerticalLayoutInteractor(PaymentMethodMetadata paymentMethodMetadata, StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, PaymentMethodIncentiveInteractor paymentMethodIncentiveInteractor, Function1 function1, Function2 function2, Function0 function0, Function1 function12, StateFlow stateFlow4, StateFlow stateFlow5, Function1 function13, StateFlow stateFlow6, StateFlow stateFlow7, boolean z, boolean z2, StateFlow stateFlow8, Function2 function22, StateFlow stateFlow9, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function0 function02, boolean z3, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethodMetadata, stateFlow, stateFlow2, stateFlow3, paymentMethodIncentiveInteractor, function1, function2, function0, function12, stateFlow4, stateFlow5, function13, stateFlow6, stateFlow7, z, z2, stateFlow8, function22, stateFlow9, function14, function15, function16, function17, (i & 8388608) != 0 ? null : function02, z3, (i & 33554432) != 0 ? Dispatchers.getDefault() : coroutineContext, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? Dispatchers.getMain().getImmediate() : coroutineContext2);
    }

    /* compiled from: PaymentMethodVerticalLayoutInteractor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/DefaultPaymentMethodVerticalLayoutInteractor$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "bankFormInteractor", "Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentMethodVerticalLayoutInteractor create(final BaseSheetViewModel viewModel, final PaymentMethodMetadata paymentMethodMetadata, final CustomerStateHolder customerStateHolder, final BankFormInteractor bankFormInteractor) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
            Intrinsics.checkNotNullParameter(bankFormInteractor, "bankFormInteractor");
            final FormHelper formHelperCreate$default = DefaultFormHelper.Companion.create$default(DefaultFormHelper.INSTANCE, viewModel, paymentMethodMetadata, null, 4, null);
            StateFlow stateFlowMapAsStateFlow = StateFlowsKt.mapAsStateFlow(viewModel.getNavigationHandler().getCurrentScreen(), new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(DefaultPaymentMethodVerticalLayoutInteractor.Companion.create$lambda$0((PaymentSheetScreen) obj));
                }
            });
            DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor = new DefaultPaymentMethodVerticalLayoutInteractor(paymentMethodMetadata, viewModel.getProcessing(), StateFlowsKt.stateFlowOf(null), viewModel.getSelection$paymentsheet_release(), bankFormInteractor.getPaymentMethodIncentiveInteractor(), new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultPaymentMethodVerticalLayoutInteractor.Companion.create$lambda$1(formHelperCreate$default, (String) obj);
                }
            }, new DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$1(formHelperCreate$default), new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultPaymentMethodVerticalLayoutInteractor.Companion.create$lambda$2(viewModel, paymentMethodMetadata, customerStateHolder);
                }
            }, new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultPaymentMethodVerticalLayoutInteractor.Companion.create$lambda$3(viewModel, paymentMethodMetadata, customerStateHolder, bankFormInteractor, (String) obj);
                }
            }, customerStateHolder.getPaymentMethods(), customerStateHolder.getMostRecentlySelectedSavedPaymentMethod(), viewModel.getSavedPaymentMethodMutator().getProvidePaymentMethodName(), viewModel.getCustomerStateHolder().getCanRemove(), viewModel.getWalletsState(), !viewModel.getIsCompleteFlow(), true, viewModel.getCustomerStateHolder().getCanUpdateFullPaymentMethodDetails(), new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultPaymentMethodVerticalLayoutInteractor.Companion.create$lambda$4(viewModel, (PaymentSelection) obj, ((Boolean) obj2).booleanValue());
                }
            }, stateFlowMapAsStateFlow, new DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$2(viewModel.getEventReporter()), new DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$3(viewModel.getEventReporter()), new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$Companion$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultPaymentMethodVerticalLayoutInteractor.Companion.create$lambda$5(viewModel, (DisplayableSavedPaymentMethod) obj);
                }
            }, new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$Companion$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(DefaultPaymentMethodVerticalLayoutInteractor.Companion.create$lambda$6(formHelperCreate$default, (String) obj));
                }
            }, null, false, null, null, 109051904, null);
            BaseSheetViewModel baseSheetViewModel = viewModel;
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(baseSheetViewModel), null, null, new DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$10$1(defaultPaymentMethodVerticalLayoutInteractor, viewModel, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(baseSheetViewModel), null, null, new DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$10$2(stateFlowMapAsStateFlow, viewModel, defaultPaymentMethodVerticalLayoutInteractor, null), 3, null);
            return defaultPaymentMethodVerticalLayoutInteractor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean create$lambda$0(PaymentSheetScreen it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it instanceof PaymentSheetScreen.VerticalMode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FormHelper.FormType create$lambda$1(FormHelper formHelper, String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return formHelper.formTypeForCode(code);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$2(BaseSheetViewModel baseSheetViewModel, PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder) {
            baseSheetViewModel.getNavigationHandler().transitionToWithDelay(new PaymentSheetScreen.ManageSavedPaymentMethods(DefaultManageScreenInteractor.INSTANCE.create(baseSheetViewModel, paymentMethodMetadata, customerStateHolder, baseSheetViewModel.getSavedPaymentMethodMutator())));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$3(BaseSheetViewModel baseSheetViewModel, PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder, BankFormInteractor bankFormInteractor, String selectedPaymentMethodCode) {
            Intrinsics.checkNotNullParameter(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            baseSheetViewModel.getNavigationHandler().transitionToWithDelay(new PaymentSheetScreen.VerticalModeForm(DefaultVerticalModeFormInteractor.INSTANCE.create(selectedPaymentMethodCode, baseSheetViewModel, paymentMethodMetadata, customerStateHolder, bankFormInteractor), false, 2, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$5(BaseSheetViewModel baseSheetViewModel, DisplayableSavedPaymentMethod it) {
            Intrinsics.checkNotNullParameter(it, "it");
            baseSheetViewModel.getSavedPaymentMethodMutator().updatePaymentMethod(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$4(BaseSheetViewModel baseSheetViewModel, PaymentSelection paymentSelection, boolean z) {
            if (z) {
                baseSheetViewModel.handlePaymentMethodSelected(paymentSelection);
            } else {
                baseSheetViewModel.updateSelection(paymentSelection);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean create$lambda$6(FormHelper formHelper, String str) {
            return !(str != null && Intrinsics.areEqual(formHelper.formTypeForCode(str), FormHelper.FormType.UserInteractionRequired.INSTANCE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayableSavedPaymentMethod displayedSavedPaymentMethod$lambda$0(DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor, List paymentMethods, PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        return defaultPaymentMethodVerticalLayoutInteractor.getDisplayedSavedPaymentMethod(paymentMethods, defaultPaymentMethodVerticalLayoutInteractor.paymentMethodMetadata, paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction availableSavedPaymentMethodAction$lambda$1(DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor, List paymentMethods, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        return defaultPaymentMethodVerticalLayoutInteractor.getAvailableSavedPaymentMethodAction(paymentMethods, displayableSavedPaymentMethod, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List displayablePaymentMethods$lambda$2(DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor, List paymentMethods, WalletsState walletsState, PaymentMethodIncentive paymentMethodIncentive) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        return defaultPaymentMethodVerticalLayoutInteractor.getDisplayablePaymentMethods(paymentMethods, walletsState, paymentMethodIncentive);
    }

    @Override // com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor
    /* renamed from: isLiveMode, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    @Override // com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor
    public StateFlow<PaymentMethodVerticalLayoutInteractor.State> getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PaymentMethodVerticalLayoutInteractor.State state$lambda$3(DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor, List displayablePaymentMethods, boolean z, PaymentSelection paymentSelection, DisplayableSavedPaymentMethod displayableSavedPaymentMethod, PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction action, String str) {
        PaymentMethodVerticalLayoutInteractor.Selection.New r2;
        String strChangeDetails;
        Intrinsics.checkNotNullParameter(displayablePaymentMethods, "displayablePaymentMethods");
        Intrinsics.checkNotNullParameter(action, "action");
        PaymentMethodVerticalLayoutInteractor.Selection.New newAsVerticalSelection = null;
        if (str != null) {
            if (Intrinsics.areEqual(str, paymentSelection != null ? PaymentSheetEventKt.code(paymentSelection) : null)) {
                PaymentSelection.New r1 = paymentSelection instanceof PaymentSelection.New ? (PaymentSelection.New) paymentSelection : null;
                if (r1 != null) {
                    strChangeDetails = defaultPaymentMethodVerticalLayoutInteractor.changeDetails(r1);
                }
                if (!(paymentSelection instanceof PaymentSelection.New)) {
                }
                r2 = new PaymentMethodVerticalLayoutInteractor.Selection.New(str, strChangeDetails, Intrinsics.areEqual(str, new == null ? PaymentSheetEventKt.code(new) : null));
            } else {
                strChangeDetails = null;
                PaymentSelection.New r3 = !(paymentSelection instanceof PaymentSelection.New) ? (PaymentSelection.New) paymentSelection : null;
                r2 = new PaymentMethodVerticalLayoutInteractor.Selection.New(str, strChangeDetails, Intrinsics.areEqual(str, r3 == null ? PaymentSheetEventKt.code(r3) : null));
            }
        } else {
            r2 = null;
        }
        if (r2 != null) {
            newAsVerticalSelection = r2;
        } else if (paymentSelection != null) {
            newAsVerticalSelection = defaultPaymentMethodVerticalLayoutInteractor.asVerticalSelection(paymentSelection);
        }
        return new PaymentMethodVerticalLayoutInteractor.State(displayablePaymentMethods, z, newAsVerticalSelection, displayableSavedPaymentMethod, action, defaultPaymentMethodVerticalLayoutInteractor.getMandate(str, paymentSelection));
    }

    @Override // com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor
    public StateFlow<Boolean> getShowsWalletsHeader() {
        return this.showsWalletsHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showsWalletsHeader$lambda$4(DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor, WalletsState walletsState) {
        return !defaultPaymentMethodVerticalLayoutInteractor.showsWalletsInline(walletsState);
    }

    /* compiled from: PaymentMethodVerticalLayoutInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$1", f = "PaymentMethodVerticalLayoutInteractor.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StateFlow<PaymentSelection> $selection;
        int label;
        final /* synthetic */ DefaultPaymentMethodVerticalLayoutInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(StateFlow<? extends PaymentSelection> stateFlow, DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$selection = stateFlow;
            this.this$0 = defaultPaymentMethodVerticalLayoutInteractor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$selection, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PaymentSelection> stateFlow = this.$selection;
                final DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor = this.this$0;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentSelection) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                        if (paymentSelection != null || ((Boolean) defaultPaymentMethodVerticalLayoutInteractor.isCurrentScreen.getValue()).booleanValue()) {
                            if (((Boolean) defaultPaymentMethodVerticalLayoutInteractor.shouldUpdateVerticalModeSelection.invoke(((paymentSelection instanceof PaymentSelection.New) || (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) || (paymentSelection instanceof PaymentSelection.CustomPaymentMethod)) ? PaymentSheetEventKt.code(paymentSelection) : null)).booleanValue()) {
                                defaultPaymentMethodVerticalLayoutInteractor._verticalModeScreenSelection.setValue(paymentSelection);
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: PaymentMethodVerticalLayoutInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$2", f = "PaymentMethodVerticalLayoutInteractor.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultPaymentMethodVerticalLayoutInteractor.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(DefaultPaymentMethodVerticalLayoutInteractor.this.mostRecentlySelectedSavedPaymentMethod, 1);
                final DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor = DefaultPaymentMethodVerticalLayoutInteractor.this;
                this.label = 1;
                if (flowDrop.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentMethod) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentMethod paymentMethod, Continuation<? super Unit> continuation) {
                        if (paymentMethod == null && (defaultPaymentMethodVerticalLayoutInteractor.verticalModeScreenSelection.getValue() instanceof PaymentSelection.Saved)) {
                            defaultPaymentMethodVerticalLayoutInteractor._verticalModeScreenSelection.setValue(null);
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PaymentMethodVerticalLayoutInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$3", f = "PaymentMethodVerticalLayoutInteractor.kt", i = {}, l = {TypedValues.AttributesType.TYPE_EASING}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultPaymentMethodVerticalLayoutInteractor.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = DefaultPaymentMethodVerticalLayoutInteractor.this.isCurrentScreen;
                final DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor = DefaultPaymentMethodVerticalLayoutInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (z) {
                            defaultPaymentMethodVerticalLayoutInteractor.updateSelection.invoke(defaultPaymentMethodVerticalLayoutInteractor.verticalModeScreenSelection.getValue(), Boxing.boxBoolean(false));
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    private final List<DisplayablePaymentMethod> getDisplayablePaymentMethods(List<PaymentMethod> paymentMethods, WalletsState walletsState, PaymentMethodIncentive incentive) {
        WalletsState.Link link;
        ResolvableString resolvableString;
        List<SupportedPaymentMethod> list = this.supportedPaymentMethods;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (final SupportedPaymentMethod supportedPaymentMethod : list) {
            arrayList.add(supportedPaymentMethod.asDisplayablePaymentMethod(paymentMethods, incentive != null ? incentive.takeIfMatches(supportedPaymentMethod.getCode()) : null, new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultPaymentMethodVerticalLayoutInteractor.getDisplayablePaymentMethods$lambda$6$lambda$5(this.f$0, supportedPaymentMethod);
                }
            }));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        if (showsWalletsInline(walletsState)) {
            if (walletsState != null && (link = walletsState.getLink()) != null) {
                LinkButtonState state = link.getState();
                if (state instanceof LinkButtonState.Email) {
                    resolvableString = ResolvableStringUtilsKt.getResolvableString(((LinkButtonState.Email) state).getEmail());
                } else {
                    if (!(state instanceof LinkButtonState.DefaultPayment) && !(state instanceof LinkButtonState.Default)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_link_simple_secure_payments);
                }
                arrayList3.add(new DisplayablePaymentMethod(PaymentMethod.Type.Link.code, null, ResolvableStringUtilsKt.getResolvableString(R.string.stripe_link), com.stripe.android.paymentsheet.R.drawable.stripe_ic_paymentsheet_link_arrow, null, null, null, false, resolvableString, null, new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DefaultPaymentMethodVerticalLayoutInteractor.getDisplayablePaymentMethods$lambda$8$lambda$7(this.f$0);
                    }
                }, null, 2562, null));
            }
            if (walletsState != null && walletsState.getGooglePay() != null) {
                arrayList3.add(new DisplayablePaymentMethod("google_pay", null, ResolvableStringUtilsKt.getResolvableString(R.string.stripe_google_pay), R.drawable.stripe_google_pay_mark, null, null, null, false, null, null, new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DefaultPaymentMethodVerticalLayoutInteractor.getDisplayablePaymentMethods$lambda$10$lambda$9(this.f$0);
                    }
                }, null, 2562, null));
            }
        }
        return CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDisplayablePaymentMethods$lambda$6$lambda$5(DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor, SupportedPaymentMethod supportedPaymentMethod) {
        defaultPaymentMethodVerticalLayoutInteractor.handleViewAction(new PaymentMethodVerticalLayoutInteractor.ViewAction.PaymentMethodSelected(supportedPaymentMethod.getCode()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDisplayablePaymentMethods$lambda$8$lambda$7(DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor) {
        defaultPaymentMethodVerticalLayoutInteractor.updateSelection.invoke(new PaymentSelection.Link(null, null, null, 7, null), false);
        Function0<Unit> function0 = defaultPaymentMethodVerticalLayoutInteractor.invokeRowSelectionCallback;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDisplayablePaymentMethods$lambda$10$lambda$9(DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor) {
        defaultPaymentMethodVerticalLayoutInteractor.updateSelection.invoke(PaymentSelection.GooglePay.INSTANCE, false);
        Function0<Unit> function0 = defaultPaymentMethodVerticalLayoutInteractor.invokeRowSelectionCallback;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final boolean showsWalletsInline(WalletsState walletsState) {
        if (!this.canShowWalletsInline || walletsState == null) {
            return false;
        }
        return (walletsState.getGooglePay() == null && this.canShowWalletButtons) ? false : true;
    }

    private final DisplayableSavedPaymentMethod getDisplayedSavedPaymentMethod(List<PaymentMethod> paymentMethods, PaymentMethodMetadata paymentMethodMetadata, PaymentMethod mostRecentlySelectedSavedPaymentMethod) {
        if (mostRecentlySelectedSavedPaymentMethod == null) {
            mostRecentlySelectedSavedPaymentMethod = paymentMethods != null ? (PaymentMethod) CollectionsKt.firstOrNull((List) paymentMethods) : null;
        }
        if (mostRecentlySelectedSavedPaymentMethod != null) {
            return SavedPaymentMethodsExtensionKt.toDisplayableSavedPaymentMethod(mostRecentlySelectedSavedPaymentMethod, this.providePaymentMethodName, paymentMethodMetadata, null);
        }
        return null;
    }

    private final PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction getAvailableSavedPaymentMethodAction(List<PaymentMethod> paymentMethods, DisplayableSavedPaymentMethod savedPaymentMethod, boolean canRemove, boolean canUpdateFullPaymentMethodDetails) {
        if (paymentMethods == null || savedPaymentMethod == null) {
            return PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction.NONE;
        }
        int size = paymentMethods.size();
        if (size == 0) {
            return PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction.NONE;
        }
        if (size == 1) {
            return getSavedPaymentMethodActionForOnePaymentMethod(canRemove, savedPaymentMethod, canUpdateFullPaymentMethodDetails);
        }
        return PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction.MANAGE_ALL;
    }

    private final PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction getSavedPaymentMethodActionForOnePaymentMethod(boolean canRemove, DisplayableSavedPaymentMethod savedPaymentMethod, boolean canUpdateFullPaymentMethodDetails) {
        if ((savedPaymentMethod != null && savedPaymentMethod.isModifiable(canUpdateFullPaymentMethodDetails)) || canRemove) {
            return PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction.MANAGE_ONE;
        }
        return PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction.NONE;
    }

    @Override // com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor
    public void handleViewAction(PaymentMethodVerticalLayoutInteractor.ViewAction viewAction) {
        Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        if (viewAction instanceof PaymentMethodVerticalLayoutInteractor.ViewAction.PaymentMethodSelected) {
            PaymentMethodVerticalLayoutInteractor.ViewAction.PaymentMethodSelected paymentMethodSelected = (PaymentMethodVerticalLayoutInteractor.ViewAction.PaymentMethodSelected) viewAction;
            this.reportPaymentMethodTypeSelected.invoke(paymentMethodSelected.getSelectedPaymentMethodCode());
            FormHelper.FormType formTypeInvoke = this.formTypeForCode.invoke(paymentMethodSelected.getSelectedPaymentMethodCode());
            boolean z = this.displaysMandatesInFormScreen && (formTypeInvoke instanceof FormHelper.FormType.MandateOnly);
            if (Intrinsics.areEqual(formTypeInvoke, FormHelper.FormType.UserInteractionRequired.INSTANCE) || z) {
                this.reportFormShown.invoke(paymentMethodSelected.getSelectedPaymentMethodCode());
                this.transitionToFormScreen.invoke(paymentMethodSelected.getSelectedPaymentMethodCode());
                return;
            } else {
                updateSelectedPaymentMethod(paymentMethodSelected.getSelectedPaymentMethodCode());
                return;
            }
        }
        if (viewAction instanceof PaymentMethodVerticalLayoutInteractor.ViewAction.SavedPaymentMethodSelected) {
            this.reportPaymentMethodTypeSelected.invoke("saved");
            this.updateSelection.invoke(new PaymentSelection.Saved(((PaymentMethodVerticalLayoutInteractor.ViewAction.SavedPaymentMethodSelected) viewAction).getSavedPaymentMethod(), null, null, 6, null), true);
            Function0<Unit> function0 = this.invokeRowSelectionCallback;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(viewAction, PaymentMethodVerticalLayoutInteractor.ViewAction.TransitionToManageSavedPaymentMethods.INSTANCE)) {
            this.transitionToManageScreen.invoke();
        } else {
            if (!(viewAction instanceof PaymentMethodVerticalLayoutInteractor.ViewAction.OnManageOneSavedPaymentMethod)) {
                throw new NoWhenBranchMatchedException();
            }
            this.onUpdatePaymentMethod.invoke(((PaymentMethodVerticalLayoutInteractor.ViewAction.OnManageOneSavedPaymentMethod) viewAction).getSavedPaymentMethod());
        }
    }

    private final void updateSelectedPaymentMethod(String selectedPaymentMethodCode) {
        this.onFormFieldValuesChanged.invoke(FormArgumentsFactory.INSTANCE.create(selectedPaymentMethodCode, this.paymentMethodMetadata).noUserInteractionFormFieldValues(), selectedPaymentMethodCode);
    }

    private final ResolvableString getMandate(String temporarySelectionCode, PaymentSelection selection) {
        if (temporarySelectionCode == null) {
            PaymentSelection.New r2 = selection instanceof PaymentSelection.New ? (PaymentSelection.New) selection : null;
            temporarySelectionCode = r2 != null ? PaymentSheetEventKt.code(r2) : null;
        }
        if (temporarySelectionCode != null) {
            if (this.displaysMandatesInFormScreen) {
                return null;
            }
            FormHelper.FormType formTypeInvoke = this.formTypeForCode.invoke(temporarySelectionCode);
            FormHelper.FormType.MandateOnly mandateOnly = formTypeInvoke instanceof FormHelper.FormType.MandateOnly ? (FormHelper.FormType.MandateOnly) formTypeInvoke : null;
            if (mandateOnly != null) {
                return mandateOnly.getMandate();
            }
            return null;
        }
        PaymentSelection.Saved saved = selection instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) selection : null;
        if (saved != null) {
            return PaymentSelectionKt.mandateTextFromPaymentMethodMetadata(saved, this.paymentMethodMetadata);
        }
        return null;
    }

    private final PaymentMethodVerticalLayoutInteractor.Selection asVerticalSelection(PaymentSelection paymentSelection) {
        if (paymentSelection instanceof PaymentSelection.Saved) {
            return PaymentMethodVerticalLayoutInteractor.Selection.Saved.INSTANCE;
        }
        if (paymentSelection instanceof PaymentSelection.GooglePay) {
            return new PaymentMethodVerticalLayoutInteractor.Selection.New("google_pay", null, false, 6, null);
        }
        if (paymentSelection instanceof PaymentSelection.Link) {
            return new PaymentMethodVerticalLayoutInteractor.Selection.New("link", null, false, 6, null);
        }
        if (paymentSelection instanceof PaymentSelection.ShopPay) {
            return new PaymentMethodVerticalLayoutInteractor.Selection.New("shop_pay", null, false, 6, null);
        }
        if (paymentSelection instanceof PaymentSelection.New) {
            PaymentSelection.New r8 = (PaymentSelection.New) paymentSelection;
            return new PaymentMethodVerticalLayoutInteractor.Selection.New(r8.getPaymentMethodCreateParams().getTypeCode(), changeDetails(r8), Intrinsics.areEqual(this.formTypeForCode.invoke(r8.getPaymentMethodCreateParams().getTypeCode()), FormHelper.FormType.UserInteractionRequired.INSTANCE));
        }
        if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            return new PaymentMethodVerticalLayoutInteractor.Selection.New(((PaymentSelection.ExternalPaymentMethod) paymentSelection).getType(), null, false, 6, null);
        }
        if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            return new PaymentMethodVerticalLayoutInteractor.Selection.New(((PaymentSelection.CustomPaymentMethod) paymentSelection).getId(), null, false, 6, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String changeDetails(PaymentSelection.New r5) {
        if (r5 instanceof PaymentSelection.New.Card) {
            PaymentSelection.New.Card card = (PaymentSelection.New.Card) r5;
            String displayName = card.getBrand().getDisplayName();
            if (card.getBrand() == CardBrand.Unknown) {
                displayName = null;
            }
            String str = displayName != null ? displayName + " " : null;
            if (str == null) {
                str = "";
            }
            return str + "···· " + card.getLast4();
        }
        if (r5 instanceof PaymentSelection.New.USBankAccount) {
            return ((PaymentSelection.New.USBankAccount) r5).getLabel();
        }
        return null;
    }
}
