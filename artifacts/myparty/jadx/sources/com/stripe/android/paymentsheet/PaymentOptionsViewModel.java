package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.activity.result.ActivityResultCaller;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.analytics.SessionSavedStateHandler;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountUtilKt;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.WalletType;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.paymentsheet.NewPaymentOptionSelection;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsActivityResult;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.DaggerPaymentOptionsViewModelFactoryComponent;
import com.stripe.android.paymentsheet.model.GooglePayButtonType;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.state.WalletsProcessingState;
import com.stripe.android.paymentsheet.state.WalletsState;
import com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor;
import com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.verticalmode.VerticalModeInitialScreenFactory;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PaymentOptionsViewModel.kt */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001YB[\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0014J\u000e\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020AJ\b\u0010B\u001a\u00020:H\u0016J\n\u0010C\u001a\u0004\u0018\u00010DH\u0002J\u000e\u0010E\u001a\u0004\u0018\u00010F*\u00020FH\u0002J\u0012\u0010G\u001a\u00020:2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\u0006\u0010H\u001a\u00020:J\f\u0010I\u001a\u00020D*\u00020DH\u0002J\u0018\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020NH\u0002J\u0012\u0010O\u001a\u00020:2\b\u0010P\u001a\u0004\u0018\u00010DH\u0016J\b\u0010Q\u001a\u00020:H\u0016J\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u001c\u00100\u001a\u0004\u0018\u000101X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)¨\u0006Z"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "linkGateFactory", "Lcom/stripe/android/link/gate/LinkGate$Factory;", "linkPaymentLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/link/gate/LinkGate$Factory;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;)V", "getLinkPaymentLauncher", "()Lcom/stripe/android/link/LinkPaymentLauncher;", "primaryButtonUiStateMapper", "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;", "_paymentOptionsActivityResult", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;", "paymentOptionsActivityResult", "Lkotlinx/coroutines/flow/SharedFlow;", "getPaymentOptionsActivityResult$paymentsheet_release", "()Lkotlinx/coroutines/flow/SharedFlow;", "_error", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/core/strings/ResolvableString;", "error", "Lkotlinx/coroutines/flow/StateFlow;", "getError", "()Lkotlinx/coroutines/flow/StateFlow;", "walletsProcessingState", "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;", "getWalletsProcessingState", "walletsState", "Lcom/stripe/android/paymentsheet/state/WalletsState;", "getWalletsState", "newPaymentSelection", "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "getNewPaymentSelection", "()Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "setNewPaymentSelection", "(Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;)V", "primaryButtonUiState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "getPrimaryButtonUiState", "registerFromActivity", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onLinkAuthenticationResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/link/LinkActivityResult;", "onUserCancel", "determinePaymentSelectionUponCancel", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "takeIfStillValid", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "onError", "onUserSelection", "withLinkDetails", "shouldShowLinkVerification", "", "paymentSelection", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "handlePaymentMethodSelected", BaseSheetViewModel.SAVE_SELECTION, "clearErrorMessages", "determineInitialBackStack", "", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentOptionsViewModel extends BaseSheetViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ResolvableString> _error;
    private final MutableSharedFlow<PaymentOptionsActivityResult> _paymentOptionsActivityResult;
    private final PaymentOptionContract.Args args;
    private final StateFlow<ResolvableString> error;
    private final LinkAccountHolder linkAccountHolder;
    private final LinkGate.Factory linkGateFactory;
    private final LinkPaymentLauncher linkPaymentLauncher;
    private NewPaymentOptionSelection newPaymentSelection;
    private final SharedFlow<PaymentOptionsActivityResult> paymentOptionsActivityResult;
    private final StateFlow<PrimaryButton.UIState> primaryButtonUiState;
    private final PrimaryButtonUiStateMapper primaryButtonUiStateMapper;
    private final StateFlow<WalletsProcessingState> walletsProcessingState;
    private final StateFlow<WalletsState> walletsState;

    public final LinkPaymentLauncher getLinkPaymentLauncher() {
        return this.linkPaymentLauncher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PaymentOptionsViewModel(PaymentOptionContract.Args args, LinkAccountHolder linkAccountHolder, LinkGate.Factory linkGateFactory, LinkPaymentLauncher linkPaymentLauncher, final EventReporter eventReporter, CustomerRepository customerRepository, @IOContext CoroutineContext workContext, SavedStateHandle savedStateHandle, LinkHandler linkHandler, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory) {
        super(args.getConfiguration(), eventReporter, customerRepository, workContext, savedStateHandle, linkHandler, cardAccountRangeRepositoryFactory, false);
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        Intrinsics.checkNotNullParameter(linkGateFactory, "linkGateFactory");
        Intrinsics.checkNotNullParameter(linkPaymentLauncher, "linkPaymentLauncher");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        this.args = args;
        this.linkAccountHolder = linkAccountHolder;
        this.linkGateFactory = linkGateFactory;
        this.linkPaymentLauncher = linkPaymentLauncher;
        PrimaryButtonUiStateMapper primaryButtonUiStateMapper = new PrimaryButtonUiStateMapper(getConfig(), args.getState().getStripeIntent() instanceof PaymentIntent, getNavigationHandler().getCurrentScreen(), getButtonsEnabled(), StateFlowsKt.stateFlowOf(args.getState().getPaymentMethodMetadata().amount()), getSelection$paymentsheet_release(), getCustomPrimaryButtonUiState(), getCvcRecollectionCompleteFlow$paymentsheet_release(), new Function0() { // from class: com.stripe.android.paymentsheet.PaymentOptionsViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentOptionsViewModel.primaryButtonUiStateMapper$lambda$1(this.f$0, eventReporter);
            }
        });
        this.primaryButtonUiStateMapper = primaryButtonUiStateMapper;
        NewPaymentOptionSelection.External external = null;
        MutableSharedFlow<PaymentOptionsActivityResult> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._paymentOptionsActivityResult = mutableSharedFlowMutableSharedFlow$default;
        this.paymentOptionsActivityResult = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<ResolvableString> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow;
        this.error = MutableStateFlow;
        this.walletsProcessingState = FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(null));
        this.walletsState = StateFlowsKt.combineAsStateFlow(linkHandler.isLinkEnabled(), linkHandler.getLinkConfigurationCoordinator().getEmailFlow(), getButtonsEnabled(), new Function3() { // from class: com.stripe.android.paymentsheet.PaymentOptionsViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return PaymentOptionsViewModel.walletsState$lambda$4(this.f$0, (Boolean) obj, (String) obj2, ((Boolean) obj3).booleanValue());
            }
        });
        PaymentSelection paymentSelection = args.getState().getPaymentSelection();
        if (paymentSelection instanceof PaymentSelection.New) {
            external = new NewPaymentOptionSelection.New((PaymentSelection.New) paymentSelection);
        } else if (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) {
            external = new NewPaymentOptionSelection.Custom((PaymentSelection.CustomPaymentMethod) paymentSelection);
        } else if (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) {
            external = new NewPaymentOptionSelection.External((PaymentSelection.ExternalPaymentMethod) paymentSelection);
        }
        this.newPaymentSelection = external;
        this.primaryButtonUiState = primaryButtonUiStateMapper.forCustomFlow();
        SessionSavedStateHandler.INSTANCE.attachTo(this, savedStateHandle);
        linkAccountHolder.set(args.getLinkAccountInfo());
        linkHandler.setupLink(args.getState().getPaymentMethodMetadata().getLinkState());
        if (getPaymentMethodMetadata$paymentsheet_release().getValue() == null) {
            setPaymentMethodMetadata(args.getState().getPaymentMethodMetadata());
        }
        getCustomerStateHolder().setCustomerState(args.getState().getCustomer());
        updateSelection(args.getState().getPaymentSelection());
        getNavigationHandler().resetTo(determineInitialBackStack(args.getState().getPaymentMethodMetadata(), getCustomerStateHolder()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit primaryButtonUiStateMapper$lambda$1(PaymentOptionsViewModel paymentOptionsViewModel, EventReporter eventReporter) {
        PaymentSelection value = paymentOptionsViewModel.getSelection$paymentsheet_release().getValue();
        if (value != null) {
            eventReporter.onPressConfirmButton(value);
        }
        paymentOptionsViewModel.onUserSelection();
        return Unit.INSTANCE;
    }

    public final SharedFlow<PaymentOptionsActivityResult> getPaymentOptionsActivityResult$paymentsheet_release() {
        return this.paymentOptionsActivityResult;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public StateFlow<ResolvableString> getError() {
        return this.error;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public StateFlow<WalletsProcessingState> getWalletsProcessingState() {
        return this.walletsProcessingState;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public StateFlow<WalletsState> getWalletsState() {
        return this.walletsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletsState walletsState$lambda$4(final PaymentOptionsViewModel paymentOptionsViewModel, Boolean bool, String str, boolean z) {
        PaymentMethodMetadata paymentMethodMetadata = paymentOptionsViewModel.args.getState().getPaymentMethodMetadata();
        WalletsState.Companion companion = WalletsState.INSTANCE;
        boolean z2 = Intrinsics.areEqual((Object) bool, (Object) true) && paymentOptionsViewModel.args.getWalletsToShow().contains(WalletType.Link);
        return companion.create(Boolean.valueOf(z2), str, paymentMethodMetadata.isGooglePayReady() && paymentOptionsViewModel.args.getWalletsToShow().contains(WalletType.GooglePay), GooglePayButtonType.Pay, z, paymentMethodMetadata.supportedPaymentMethodTypes(), null, new Function0() { // from class: com.stripe.android.paymentsheet.PaymentOptionsViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentOptionsViewModel.walletsState$lambda$4$lambda$2(this.f$0);
            }
        }, new Function0() { // from class: com.stripe.android.paymentsheet.PaymentOptionsViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentOptionsViewModel.walletsState$lambda$4$lambda$3(this.f$0);
            }
        }, paymentMethodMetadata.getStripeIntent() instanceof SetupIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit walletsState$lambda$4$lambda$2(PaymentOptionsViewModel paymentOptionsViewModel) {
        paymentOptionsViewModel.updateSelection(PaymentSelection.GooglePay.INSTANCE);
        paymentOptionsViewModel.onUserSelection();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit walletsState$lambda$4$lambda$3(PaymentOptionsViewModel paymentOptionsViewModel) {
        paymentOptionsViewModel.updateSelection(new PaymentSelection.Link(null, null, null, 7, null));
        paymentOptionsViewModel.onUserSelection();
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public NewPaymentOptionSelection getNewPaymentSelection() {
        return this.newPaymentSelection;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void setNewPaymentSelection(NewPaymentOptionSelection newPaymentOptionSelection) {
        this.newPaymentSelection = newPaymentOptionSelection;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public StateFlow<PrimaryButton.UIState> getPrimaryButtonUiState() {
        return this.primaryButtonUiState;
    }

    /* compiled from: PaymentOptionsViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsViewModel$registerFromActivity$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<LinkActivityResult, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, PaymentOptionsViewModel.class, "onLinkAuthenticationResult", "onLinkAuthenticationResult(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LinkActivityResult linkActivityResult) {
            invoke2(linkActivityResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkActivityResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PaymentOptionsViewModel) this.receiver).onLinkAuthenticationResult(p0);
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    protected void registerFromActivity(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.linkPaymentLauncher.register(activityResultCaller, new AnonymousClass1(this));
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.paymentsheet.PaymentOptionsViewModel.registerFromActivity.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                PaymentOptionsViewModel.this.getLinkPaymentLauncher().unregister();
                super.onDestroy(owner);
            }
        });
    }

    public final void onLinkAuthenticationResult(LinkActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        LinkAccountUpdate linkAccountUpdate = result.getLinkAccountUpdate();
        if (linkAccountUpdate != null) {
            LinkAccountUtilKt.updateLinkAccount(linkAccountUpdate, this.linkAccountHolder);
        }
        if (result instanceof LinkActivityResult.Canceled) {
            return;
        }
        if (result instanceof LinkActivityResult.Failed) {
            onError(ExceptionKtKt.stripeErrorMessage(((LinkActivityResult.Failed) result).getError()));
            return;
        }
        if (result instanceof LinkActivityResult.Completed) {
            MutableSharedFlow<PaymentOptionsActivityResult> mutableSharedFlow = this._paymentOptionsActivityResult;
            LinkAccountUpdate.Value value = this.linkAccountHolder.getLinkAccountInfo().getValue();
            LinkActivityResult.Completed completed = (LinkActivityResult.Completed) result;
            mutableSharedFlow.tryEmit(new PaymentOptionsActivityResult.Succeeded(new PaymentSelection.Link(null, completed.getSelectedPayment(), completed.getShippingAddress(), 1, null), value, getCustomerStateHolder().getPaymentMethods().getValue()));
            return;
        }
        if (!(result instanceof LinkActivityResult.PaymentMethodObtained)) {
            throw new NoWhenBranchMatchedException();
        }
        onError(ExceptionKtKt.stripeErrorMessage(new IllegalStateException("PaymentMethodObtained is not expected from authentication only Link flows")));
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onUserCancel() {
        getEventReporter().onDismiss();
        this._paymentOptionsActivityResult.tryEmit(new PaymentOptionsActivityResult.Canceled(null, determinePaymentSelectionUponCancel(), getCustomerStateHolder().getPaymentMethods().getValue(), this.linkAccountHolder.getLinkAccountInfo().getValue()));
    }

    private final PaymentSelection determinePaymentSelectionUponCancel() {
        PaymentSelection paymentSelection = this.args.getState().getPaymentSelection();
        PaymentSelection paymentSelectionWithLinkDetails = paymentSelection != null ? withLinkDetails(paymentSelection) : null;
        return paymentSelectionWithLinkDetails instanceof PaymentSelection.Saved ? takeIfStillValid((PaymentSelection.Saved) paymentSelectionWithLinkDetails) : paymentSelectionWithLinkDetails;
    }

    private final PaymentSelection.Saved takeIfStillValid(PaymentSelection.Saved saved) {
        Object next;
        Iterator<T> it = getCustomerStateHolder().getPaymentMethods().getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PaymentMethod) next).id, saved.getPaymentMethod().id)) {
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) next;
        if (paymentMethod != null) {
            return PaymentSelection.Saved.copy$default(saved, paymentMethod, null, null, 6, null);
        }
        return null;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(ResolvableString error) {
        this._error.setValue(error);
    }

    public final void onUserSelection() {
        clearErrorMessages();
        PaymentSelection value = getSelection$paymentsheet_release().getValue();
        if (value != null) {
            getEventReporter().onSelectPaymentOption(value);
            LinkState linkState = this.args.getState().getPaymentMethodMetadata().getLinkState();
            if (linkState != null && shouldShowLinkVerification(value, linkState.getConfiguration())) {
                LinkPaymentLauncher linkPaymentLauncher = this.linkPaymentLauncher;
                Intrinsics.checkNotNull(linkState);
                linkPaymentLauncher.present(linkState.getConfiguration(), this.linkAccountHolder.getLinkAccountInfo().getValue(), new LinkLaunchMode.PaymentMethodSelection(null, false, null, 6, null), LinkExpressMode.ENABLED);
                return;
            }
            this._paymentOptionsActivityResult.tryEmit(new PaymentOptionsActivityResult.Succeeded(withLinkDetails(value), this.linkAccountHolder.getLinkAccountInfo().getValue(), getCustomerStateHolder().getPaymentMethods().getValue()));
        }
    }

    private final PaymentSelection withLinkDetails(PaymentSelection paymentSelection) {
        LinkPaymentMethod linkPaymentMethod;
        PaymentSelection.Link linkCopy$default;
        if (!(paymentSelection instanceof PaymentSelection.Link)) {
            return paymentSelection;
        }
        if (this.linkAccountHolder.getLinkAccountInfo().getValue().getAccount() == null) {
            linkCopy$default = PaymentSelection.Link.copy$default((PaymentSelection.Link) paymentSelection, null, null, null, 5, null);
        } else {
            PaymentSelection.Link link = (PaymentSelection.Link) paymentSelection;
            LinkPaymentMethod selectedPayment = link.getSelectedPayment();
            if (selectedPayment == null) {
                PaymentSelection paymentSelection2 = this.args.getState().getPaymentSelection();
                linkPaymentMethod = null;
                PaymentSelection.Link link2 = paymentSelection2 instanceof PaymentSelection.Link ? (PaymentSelection.Link) paymentSelection2 : null;
                if (link2 != null) {
                    selectedPayment = link2.getSelectedPayment();
                    linkPaymentMethod = selectedPayment;
                }
                linkCopy$default = PaymentSelection.Link.copy$default(link, null, linkPaymentMethod, null, 5, null);
            } else {
                linkPaymentMethod = selectedPayment;
                linkCopy$default = PaymentSelection.Link.copy$default(link, null, linkPaymentMethod, null, 5, null);
            }
        }
        return linkCopy$default;
    }

    private final boolean shouldShowLinkVerification(PaymentSelection paymentSelection, LinkConfiguration linkConfiguration) {
        return (paymentSelection instanceof PaymentSelection.Link) && this.linkGateFactory.create(linkConfiguration).getShowRuxInFlowController();
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void handlePaymentMethodSelected(PaymentSelection selection) {
        updateSelection(selection);
        if (selection == null || !selection.getRequiresConfirmation()) {
            onUserSelection();
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void clearErrorMessages() {
        this._error.setValue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.stripe.android.paymentsheet.navigation.PaymentSheetScreen$SelectSavedPaymentMethods] */
    private final List<PaymentSheetScreen> determineInitialBackStack(PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder) {
        PaymentSheetScreen.AddFirstPaymentMethod addFirstPaymentMethod;
        if (getConfig().getPaymentMethodLayout$paymentsheet_release() != PaymentSheet.PaymentMethodLayout.Horizontal) {
            return VerticalModeInitialScreenFactory.INSTANCE.create(this, paymentMethodMetadata, customerStateHolder);
        }
        if (this.args.getState().getShowSavedPaymentMethods()) {
            addFirstPaymentMethod = new PaymentSheetScreen.SelectSavedPaymentMethods(DefaultSelectSavedPaymentMethodsInteractor.INSTANCE.create(this, paymentMethodMetadata, customerStateHolder, getSavedPaymentMethodMutator()), null, 2, false ? 1 : 0);
        } else {
            addFirstPaymentMethod = new PaymentSheetScreen.AddFirstPaymentMethod(DefaultAddPaymentMethodInteractor.INSTANCE.create(this, paymentMethodMetadata));
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(addFirstPaymentMethod);
        if ((addFirstPaymentMethod instanceof PaymentSheetScreen.SelectSavedPaymentMethods) && getNewPaymentSelection() != null) {
            listCreateListBuilder.add(new PaymentSheetScreen.AddAnotherPaymentMethod(DefaultAddPaymentMethodInteractor.INSTANCE.create(this, paymentMethodMetadata)));
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    /* compiled from: PaymentOptionsViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "starterArgsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final Function0<PaymentOptionContract.Args> starterArgsSupplier;

        public Factory(Function0<PaymentOptionContract.Args> starterArgsSupplier) {
            Intrinsics.checkNotNullParameter(starterArgsSupplier, "starterArgsSupplier");
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Application applicationRequireApplication = CreationExtrasKtxKt.requireApplication(extras);
            SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            PaymentOptionContract.Args argsInvoke = this.starterArgsSupplier.invoke();
            PaymentOptionsViewModel viewModel = DaggerPaymentOptionsViewModelFactoryComponent.builder().application(applicationRequireApplication).context(applicationRequireApplication).productUsage(argsInvoke.getProductUsage()).savedStateHandle(savedStateHandleCreateSavedStateHandle).paymentElementCallbackIdentifier(argsInvoke.getPaymentElementCallbackIdentifier()).build().getPaymentOptionsViewModelSubcomponentBuilder().application(applicationRequireApplication).args(argsInvoke).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory.create");
            return viewModel;
        }
    }
}
