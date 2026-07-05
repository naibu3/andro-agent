package com.stripe.android.paymentsheet.viewmodels;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.MandateHandler;
import com.stripe.android.paymentsheet.NewPaymentOptionSelection;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.addresselement.AddressElementDefaultsKt;
import com.stripe.android.paymentsheet.addresselement.AutocompleteAppearanceContext;
import com.stripe.android.paymentsheet.addresselement.DefaultAutocompleteLauncher;
import com.stripe.android.paymentsheet.addresselement.PaymentElementAutocompleteAddressInteractor;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetAnalyticsListener;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.NavigationHandler;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.state.WalletsProcessingState;
import com.stripe.android.paymentsheet.state.WalletsState;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.ui.core.elements.CvcConfig;
import com.stripe.android.ui.core.elements.CvcController;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: BaseSheetViewModel.kt */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b!\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020vJ\u0018\u0010w\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020vH$J\u0012\u0010x\u001a\u00020r2\b\u0010(\u001a\u0004\u0018\u00010'H\u0004J\b\u0010y\u001a\u00020rH&J\u000e\u0010z\u001a\u00020r2\u0006\u0010{\u001a\u00020AJ\u0012\u0010|\u001a\u00020r2\b\u0010;\u001a\u0004\u0018\u00010<H&J\u0010\u0010}\u001a\u00020r2\b\u0010;\u001a\u0004\u0018\u00010<J\u0012\u0010~\u001a\u00020r2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0006\u0010\u007f\u001a\u00020rJ\t\u0010\u0080\u0001\u001a\u00020rH&J\u0015\u0010\u0081\u0001\u001a\u00020r2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010KH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060)X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010+R\u001a\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090)X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010+R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010+R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110)¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0016\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0)¢\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0019\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0&¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u001a\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0)X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010+R\u001a\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0)X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010+R\u0011\u0010M\u001a\u00020N¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010+R\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00110&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010+R\u0011\u0010X\u001a\u00020Y¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u0004\u0018\u00010]X¦\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0011\u0010b\u001a\u00020c¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0011\u0010f\u001a\u00020g¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00110)X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010+R\u0015\u0010l\u001a\u00060mj\u0002`n8F¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006\u0083\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "isCompleteFlow", "", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Z)V", "getConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getEventReporter", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "getCustomerRepository", "()Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "getWorkContext", "()Lkotlin/coroutines/CoroutineContext;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "getLinkHandler", "()Lcom/stripe/android/paymentsheet/LinkHandler;", "getCardAccountRangeRepositoryFactory", "()Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "()Z", "autocompleteLauncher", "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;", "_paymentMethodMetadata", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentMethodMetadata", "Lkotlinx/coroutines/flow/StateFlow;", "getPaymentMethodMetadata$paymentsheet_release", "()Lkotlinx/coroutines/flow/StateFlow;", "navigationHandler", "Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "getNavigationHandler", "()Lcom/stripe/android/paymentsheet/navigation/NavigationHandler;", "autocompleteAddressInteractorFactory", "Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;", "getAutocompleteAddressInteractorFactory", "()Lcom/stripe/android/paymentsheet/addresselement/PaymentElementAutocompleteAddressInteractor$Factory;", "walletsState", "Lcom/stripe/android/paymentsheet/state/WalletsState;", "getWalletsState", "walletsProcessingState", "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;", "getWalletsProcessingState", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getSelection$paymentsheet_release", BaseSheetViewModel.SAVE_PROCESSING, "getProcessing", "_primaryButtonState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "primaryButtonState", "getPrimaryButtonState", "customPrimaryButtonUiState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "getCustomPrimaryButtonUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "primaryButtonUiState", "getPrimaryButtonUiState", "error", "Lcom/stripe/android/core/strings/ResolvableString;", "getError", "mandateHandler", "Lcom/stripe/android/paymentsheet/MandateHandler;", "getMandateHandler", "()Lcom/stripe/android/paymentsheet/MandateHandler;", "_cvcControllerFlow", "Lcom/stripe/android/ui/core/elements/CvcController;", "cvcControllerFlow", "getCvcControllerFlow$paymentsheet_release", "_cvcRecollectionCompleteFlow", "cvcRecollectionCompleteFlow", "getCvcRecollectionCompleteFlow$paymentsheet_release", "analyticsListener", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;", "getAnalyticsListener", "()Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;", "newPaymentSelection", "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "getNewPaymentSelection", "()Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "setNewPaymentSelection", "(Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;)V", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "getCustomerStateHolder", "()Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "savedPaymentMethodMutator", "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "getSavedPaymentMethodMutator", "()Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "buttonsEnabled", "getButtonsEnabled", "initiallySelectedPaymentMethodType", "", "Lcom/stripe/android/model/PaymentMethodCode;", "getInitiallySelectedPaymentMethodType", "()Ljava/lang/String;", "registerForActivityResult", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "registerFromActivity", "setPaymentMethodMetadata", "clearErrorMessages", "updatePrimaryButtonState", ServerProtocol.DIALOG_PARAM_STATE, "handlePaymentMethodSelected", "updateSelection", "updateCvcFlows", "handleBackPressed", "onUserCancel", "onError", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseSheetViewModel extends ViewModel {
    public static final String SAVE_PROCESSING = "processing";
    public static final String SAVE_SELECTION = "selection";
    private final MutableStateFlow<CvcController> _cvcControllerFlow;
    private final MutableStateFlow<Boolean> _cvcRecollectionCompleteFlow;
    private final MutableStateFlow<PaymentMethodMetadata> _paymentMethodMetadata;
    private final MutableStateFlow<PrimaryButton.State> _primaryButtonState;
    private final PaymentSheetAnalyticsListener analyticsListener;
    private final PaymentElementAutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory;
    private final DefaultAutocompleteLauncher autocompleteLauncher;
    private final StateFlow<Boolean> buttonsEnabled;
    private final CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory;
    private final PaymentSheet.Configuration config;
    private final MutableStateFlow<PrimaryButton.UIState> customPrimaryButtonUiState;
    private final CustomerRepository customerRepository;
    private final CustomerStateHolder customerStateHolder;
    private final StateFlow<CvcController> cvcControllerFlow;
    private final StateFlow<Boolean> cvcRecollectionCompleteFlow;
    private final EventReporter eventReporter;
    private final boolean isCompleteFlow;
    private final LinkHandler linkHandler;
    private final MandateHandler mandateHandler;
    private final NavigationHandler<PaymentSheetScreen> navigationHandler;
    private final StateFlow<PaymentMethodMetadata> paymentMethodMetadata;
    private final StateFlow<PrimaryButton.State> primaryButtonState;
    private final StateFlow<Boolean> processing;
    private final SavedPaymentMethodMutator savedPaymentMethodMutator;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow<PaymentSelection> selection;
    private final CoroutineContext workContext;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buttonsEnabled$lambda$4(boolean z, boolean z2) {
        return (z || z2) ? false : true;
    }

    public abstract void clearErrorMessages();

    public abstract StateFlow<ResolvableString> getError();

    public abstract NewPaymentOptionSelection getNewPaymentSelection();

    public abstract StateFlow<PrimaryButton.UIState> getPrimaryButtonUiState();

    public abstract StateFlow<WalletsProcessingState> getWalletsProcessingState();

    public abstract StateFlow<WalletsState> getWalletsState();

    public abstract void handlePaymentMethodSelected(PaymentSelection selection);

    public abstract void onError(ResolvableString error);

    public abstract void onUserCancel();

    protected abstract void registerFromActivity(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner);

    public abstract void setNewPaymentSelection(NewPaymentOptionSelection newPaymentOptionSelection);

    public final PaymentSheet.Configuration getConfig() {
        return this.config;
    }

    public final EventReporter getEventReporter() {
        return this.eventReporter;
    }

    public final CustomerRepository getCustomerRepository() {
        return this.customerRepository;
    }

    public /* synthetic */ BaseSheetViewModel(PaymentSheet.Configuration configuration, EventReporter eventReporter, CustomerRepository customerRepository, CoroutineDispatcher coroutineDispatcher, SavedStateHandle savedStateHandle, LinkHandler linkHandler, CardAccountRangeRepository.Factory factory, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configuration, eventReporter, customerRepository, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher, savedStateHandle, linkHandler, factory, z);
    }

    public final CoroutineContext getWorkContext() {
        return this.workContext;
    }

    public final SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final LinkHandler getLinkHandler() {
        return this.linkHandler;
    }

    public final CardAccountRangeRepository.Factory getCardAccountRangeRepositoryFactory() {
        return this.cardAccountRangeRepositoryFactory;
    }

    /* renamed from: isCompleteFlow, reason: from getter */
    public final boolean getIsCompleteFlow() {
        return this.isCompleteFlow;
    }

    public BaseSheetViewModel(PaymentSheet.Configuration config, EventReporter eventReporter, CustomerRepository customerRepository, CoroutineContext workContext, SavedStateHandle savedStateHandle, LinkHandler linkHandler, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, boolean z) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        this.config = config;
        this.eventReporter = eventReporter;
        this.customerRepository = customerRepository;
        this.workContext = workContext;
        this.savedStateHandle = savedStateHandle;
        this.linkHandler = linkHandler;
        this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
        this.isCompleteFlow = z;
        DefaultAutocompleteLauncher defaultAutocompleteLauncher = new DefaultAutocompleteLauncher(new AutocompleteAppearanceContext.PaymentElement(config.getAppearance()));
        this.autocompleteLauncher = defaultAutocompleteLauncher;
        MutableStateFlow<PaymentMethodMetadata> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._paymentMethodMetadata = MutableStateFlow;
        this.paymentMethodMetadata = MutableStateFlow;
        BaseSheetViewModel baseSheetViewModel = this;
        NavigationHandler<PaymentSheetScreen> navigationHandler = new NavigationHandler<>(ViewModelKt.getViewModelScope(baseSheetViewModel), PaymentSheetScreen.Loading.INSTANCE, false, new Function1() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSheetViewModel.navigationHandler$lambda$0(this.f$0, (PaymentSheetScreen) obj);
            }
        }, 4, null);
        this.navigationHandler = navigationHandler;
        this.autocompleteAddressInteractorFactory = new PaymentElementAutocompleteAddressInteractor.Factory(defaultAutocompleteLauncher, new AutocompleteAddressInteractor.Config(config.getGooglePlacesApiKey$paymentsheet_release(), AddressElementDefaultsKt.getAUTOCOMPLETE_DEFAULT_COUNTRIES(), false, 4, null));
        this.selection = savedStateHandle.getStateFlow(SAVE_SELECTION, null);
        StateFlow<Boolean> stateFlow = savedStateHandle.getStateFlow(SAVE_PROCESSING, false);
        this.processing = stateFlow;
        MutableStateFlow<PrimaryButton.State> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._primaryButtonState = MutableStateFlow2;
        this.primaryButtonState = MutableStateFlow2;
        this.customPrimaryButtonUiState = StateFlowKt.MutableStateFlow(null);
        this.mandateHandler = MandateHandler.INSTANCE.create(this);
        MutableStateFlow<CvcController> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new CvcController(new CvcConfig(), StateFlowsKt.stateFlowOf(CardBrand.Unknown), null, false, 12, null));
        this._cvcControllerFlow = MutableStateFlow3;
        this.cvcControllerFlow = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(true);
        this._cvcRecollectionCompleteFlow = MutableStateFlow4;
        this.cvcRecollectionCompleteFlow = MutableStateFlow4;
        this.analyticsListener = new PaymentSheetAnalyticsListener(savedStateHandle, eventReporter, navigationHandler.getCurrentScreen(), ViewModelKt.getViewModelScope(baseSheetViewModel), new Function0() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getInitiallySelectedPaymentMethodType();
            }
        });
        this.customerStateHolder = CustomerStateHolder.INSTANCE.create(this);
        this.savedPaymentMethodMutator = SavedPaymentMethodMutator.INSTANCE.create(this);
        this.buttonsEnabled = StateFlowsKt.combineAsStateFlow(stateFlow, StateFlowsKt.flatMapLatestAsStateFlow(navigationHandler.getCurrentScreen(), new Function1() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSheetViewModel.buttonsEnabled$lambda$3((PaymentSheetScreen) obj);
            }
        }), new Function2() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(BaseSheetViewModel.buttonsEnabled$lambda$4(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(baseSheetViewModel), null, null, new AnonymousClass1(null), 3, null);
    }

    public final StateFlow<PaymentMethodMetadata> getPaymentMethodMetadata$paymentsheet_release() {
        return this.paymentMethodMetadata;
    }

    public final NavigationHandler<PaymentSheetScreen> getNavigationHandler() {
        return this.navigationHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigationHandler$lambda$0(BaseSheetViewModel baseSheetViewModel, PaymentSheetScreen poppedScreen) {
        Intrinsics.checkNotNullParameter(poppedScreen, "poppedScreen");
        baseSheetViewModel.analyticsListener.reportPaymentSheetHidden(poppedScreen);
        return Unit.INSTANCE;
    }

    public final PaymentElementAutocompleteAddressInteractor.Factory getAutocompleteAddressInteractorFactory() {
        return this.autocompleteAddressInteractorFactory;
    }

    public final StateFlow<PaymentSelection> getSelection$paymentsheet_release() {
        return this.selection;
    }

    public final StateFlow<Boolean> getProcessing() {
        return this.processing;
    }

    public final StateFlow<PrimaryButton.State> getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    public final MutableStateFlow<PrimaryButton.UIState> getCustomPrimaryButtonUiState() {
        return this.customPrimaryButtonUiState;
    }

    public final MandateHandler getMandateHandler() {
        return this.mandateHandler;
    }

    public final StateFlow<CvcController> getCvcControllerFlow$paymentsheet_release() {
        return this.cvcControllerFlow;
    }

    public final StateFlow<Boolean> getCvcRecollectionCompleteFlow$paymentsheet_release() {
        return this.cvcRecollectionCompleteFlow;
    }

    public final PaymentSheetAnalyticsListener getAnalyticsListener() {
        return this.analyticsListener;
    }

    public final CustomerStateHolder getCustomerStateHolder() {
        return this.customerStateHolder;
    }

    public final SavedPaymentMethodMutator getSavedPaymentMethodMutator() {
        return this.savedPaymentMethodMutator;
    }

    protected final StateFlow<Boolean> getButtonsEnabled() {
        return this.buttonsEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow buttonsEnabled$lambda$3(PaymentSheetScreen currentScreen) {
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        return StateFlowsKt.mapAsStateFlow(currentScreen.topBarState(), new Function1() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseSheetViewModel.buttonsEnabled$lambda$3$lambda$2((PaymentSheetTopBarState) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buttonsEnabled$lambda$3$lambda$2(PaymentSheetTopBarState paymentSheetTopBarState) {
        return paymentSheetTopBarState != null && paymentSheetTopBarState.isEditing();
    }

    public final String getInitiallySelectedPaymentMethodType() {
        String paymentMethodCode;
        NewPaymentOptionSelection newPaymentSelection = getNewPaymentSelection();
        if (newPaymentSelection != null && (paymentMethodCode = newPaymentSelection.getPaymentMethodCode()) != null) {
            return paymentMethodCode;
        }
        PaymentMethodMetadata value = this.paymentMethodMetadata.getValue();
        Intrinsics.checkNotNull(value);
        return (String) CollectionsKt.first((List) value.supportedPaymentMethodTypes());
    }

    /* compiled from: BaseSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1", f = "BaseSheetViewModel.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSheetViewModel.this.new AnonymousClass1(continuation);
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
                Flow flowDrop = FlowKt.drop(BaseSheetViewModel.this.getNavigationHandler().getCurrentScreen(), 1);
                final BaseSheetViewModel baseSheetViewModel = BaseSheetViewModel.this;
                this.label = 1;
                if (flowDrop.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentSheetScreen) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentSheetScreen paymentSheetScreen, Continuation<? super Unit> continuation) {
                        baseSheetViewModel.clearErrorMessages();
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

    public final void registerForActivityResult(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.autocompleteLauncher.register(activityResultCaller, lifecycleOwner);
        registerFromActivity(activityResultCaller, lifecycleOwner);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setPaymentMethodMetadata(PaymentMethodMetadata paymentMethodMetadata) {
        this._paymentMethodMetadata.setValue(paymentMethodMetadata);
    }

    public final void updatePrimaryButtonState(PrimaryButton.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this._primaryButtonState.setValue(state);
    }

    public final void updateSelection(PaymentSelection selection) {
        if (selection instanceof PaymentSelection.New) {
            setNewPaymentSelection(new NewPaymentOptionSelection.New((PaymentSelection.New) selection));
        } else if (selection instanceof PaymentSelection.CustomPaymentMethod) {
            setNewPaymentSelection(new NewPaymentOptionSelection.Custom((PaymentSelection.CustomPaymentMethod) selection));
        } else if (selection instanceof PaymentSelection.ExternalPaymentMethod) {
            setNewPaymentSelection(new NewPaymentOptionSelection.External((PaymentSelection.ExternalPaymentMethod) selection));
        }
        this.savedStateHandle.set(SAVE_SELECTION, selection);
        updateCvcFlows(selection);
        clearErrorMessages();
    }

    private final void updateCvcFlows(PaymentSelection selection) {
        CardBrand cardBrand;
        if (selection instanceof PaymentSelection.Saved) {
            PaymentSelection.Saved saved = (PaymentSelection.Saved) selection;
            if (saved.getPaymentMethod().type == PaymentMethod.Type.Card) {
                MutableStateFlow<CvcController> mutableStateFlow = this._cvcControllerFlow;
                CvcConfig cvcConfig = new CvcConfig();
                PaymentMethod.Card card = saved.getPaymentMethod().card;
                if (card == null || (cardBrand = card.brand) == null) {
                    cardBrand = CardBrand.Unknown;
                }
                mutableStateFlow.setValue(new CvcController(cvcConfig, StateFlowsKt.stateFlowOf(cardBrand), null, false, 12, null));
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C11551(null), 3, null);
            }
        }
    }

    /* compiled from: BaseSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$updateCvcFlows$1", f = "BaseSheetViewModel.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$updateCvcFlows$1, reason: invalid class name and case insensitive filesystem */
    static final class C11551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11551(Continuation<? super C11551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSheetViewModel.this.new C11551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsComplete = BaseSheetViewModel.this.getCvcControllerFlow$paymentsheet_release().getValue().isComplete();
                final BaseSheetViewModel baseSheetViewModel = BaseSheetViewModel.this;
                this.label = 1;
                if (stateFlowIsComplete.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.updateCvcFlows.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        baseSheetViewModel._cvcRecollectionCompleteFlow.setValue(Boxing.boxBoolean(z));
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

    public final void handleBackPressed() {
        if (this.processing.getValue().booleanValue()) {
            return;
        }
        if (this.navigationHandler.getCanGoBack()) {
            this.navigationHandler.pop();
        } else {
            onUserCancel();
        }
    }

    public static /* synthetic */ void onError$default(BaseSheetViewModel baseSheetViewModel, ResolvableString resolvableString, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i & 1) != 0) {
            resolvableString = null;
        }
        baseSheetViewModel.onError(resolvableString);
    }
}
